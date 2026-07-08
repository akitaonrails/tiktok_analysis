package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0i4E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.selector.visiblescope.SelectLiveVisibleFriendsDataSourceProtocol$realRefresh$1", f = "SelectLiveVisibleFriendsDataSourceProtocol.kt", l = {106}, m = "invokeSuspend")
public final class C1228240i4E extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends AbstractC1223800hx4>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1228280i4I LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1228240i4E(C1228280i4I c1228280i4I, InterfaceC1364105Vn<? super C1228240i4E> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1228280i4I;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1228240i4E c1228240i4E = new C1228240i4E(this.LLILLL, interfaceC1364105Vn);
        c1228240i4E.LLILLJJLI = obj;
        return c1228240i4E;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zLJJJJ;
        Object objLIZIZ = obj;
        C1C7U.LIZ("SelectLiveVisibleFriendsDataSourceProtocol@8730.realRefresh$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            AnonymousClass0957[] anonymousClass0957Arr = {C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1228270i4H(this.LLILLL, null), 3), C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1228260i4G(this.LLILLL, null), 3)};
            this.LL = 1;
            objLIZIZ = C1D9F.LIZIZ(anonymousClass0957Arr, this);
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("SelectLiveVisibleFriendsDataSourceProtocol@8730.realRefresh$1");
                return objLJFF;
            }
        }
        List list = (List) objLIZIZ;
        List list2 = (List) ListProtector.get(list, 0);
        Collection collection = (Collection) ListProtector.get(list, 1);
        C1228280i4I c1228280i4I = this.LLILLL;
        c1228280i4I.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list2) {
            C2201941BFw c2201941BFw = IMUser.Companion;
            int followStatus = ((IMUser) obj2).getFollowStatus();
            c2201941BFw.getClass();
            if (C2201941BFw.LIZLLL(followStatus)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        arrayList2.addAll(collection);
        HashSet hashSet = new HashSet();
        ArrayList<IMUser> arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (hashSet.add(((BaseContact) obj3).getUid())) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (!arrayList3.isEmpty()) {
            ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
            for (IMUser iMUser : arrayList3) {
                C1224850hyl c1224850hyl = new C1224850hyl(EnumC992630bwD.TYPE_CONTENT_PAGE, EnumC1226540i1U.TAB_KEY_FRIENDS_FOR_LIVE.getValue());
                EnumC1224830hyj enumC1224830hyj = EnumC1224830hyj.NORMAL;
                UrlModel displayAvatar = iMUser.getDisplayAvatar();
                String strLIZ = C1226910i25.LIZ(iMUser);
                String uid = iMUser.getUid();
                if (uid == null) {
                    uid = "";
                }
                String uniqueId = iMUser.getUniqueId();
                Set<String> set = c1228280i4I.LLILLL.LJI;
                if (set != null) {
                    zLJJJJ = C13LP.LJJJJ(iMUser.getUid(), set);
                } else {
                    zLJJJJ = false;
                }
                arrayList5.add(new C1224840hyk(c1224850hyl, enumC1224830hyj, "private", uid, displayAvatar, strLIZ, uniqueId, true, true, C2097908Jt.LIZJ(new Pair("contact", iMUser)), zLJJJJ, false, false, false, false, 1024));
            }
            arrayList4.addAll(arrayList5);
        }
        c1228280i4I.LLILZIL = arrayList4;
        C1C7U.LIZIZ("SelectLiveVisibleFriendsDataSourceProtocol@8730.realRefresh$1");
        return arrayList4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends AbstractC1223800hx4>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
