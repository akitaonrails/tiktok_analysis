package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS257S0000000_19;
import njp.a;

/* JADX INFO: renamed from: X.0hzS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.selector.inviteguest.LiveInviteGuestConvSearchDataSourceProtocol$onSearch$4", f = "LiveInviteGuestConvSearchDataSourceProtocol.kt", l = {54}, m = "invokeSuspend")
public final class C1225280hzS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1223660hwq>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ List<C1224840hyk> LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C1225300hzU LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1225280hzS(List<C1224840hyk> list, String str, C1225300hzU c1225300hzU, InterfaceC1364105Vn<? super C1225280hzS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = list;
        this.LLILZLL = str;
        this.LLIZ = c1225300hzU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1225280hzS(this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map mapLJIILLIIL;
        Map<String, Object> mapLJ;
        Object objLIZ = obj;
        C1C7U.LIZ("LiveInviteGuestConvSearchDataSourceProtocol@e633.onSearch$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        if (i != 0) {
            if (i == 1) {
                mapLJIILLIIL = (Map) this.LL;
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            List<C1224840hyk> list = this.LLILZIL;
            ArrayList arrayList = new ArrayList();
            for (C1224840hyk c1224840hyk : list) {
                Object obj2 = c1224840hyk.LLJI.get("contact");
                if ((obj2 instanceof IMContact) && obj2 != null) {
                    arrayList.add(new Pair(obj2, c1224840hyk));
                }
            }
            mapLJIILLIIL = C2097608Jq.LJIILLIIL(arrayList);
            String str = this.LLILZLL;
            List<C1224840hyk> list2 = this.LLILZIL;
            C1225300hzU c1225300hzU = this.LLIZ;
            this.LL = mapLJIILLIIL;
            this.LLILLJJLI = str;
            this.LLILLL = list2;
            this.LLILZ = 1;
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            C1231530i9X.LIZ(str, c23260099m, list2, (C11NJ) c1225300hzU.LLILZ.getValue(), AFwS257S0000000_19.get$arr$(1));
            objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("LiveInviteGuestConvSearchDataSourceProtocol@e633.onSearch$4");
                return objLJFF;
            }
        }
        String str2 = this.LLILZLL;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : (List) objLIZ) {
            C1224840hyk c1224840hyk2 = (C1224840hyk) mapLJIILLIIL.get(obj3);
            if (c1224840hyk2 != null) {
                C1224850hyl c1224850hyl = new C1224850hyl(EnumC992630bwD.TYPE_SEARCH_PAGE, "");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C1224840hyk c1224840hyk3 = (C1224840hyk) mapLJIILLIIL.get(obj3);
                if (c1224840hyk3 == null || (mapLJ = c1224840hyk3.LLJI) == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                linkedHashMap.putAll(mapLJ);
                linkedHashMap.put("is_search", true);
                C1224840hyk c1224840hykLIZ = C1224840hyk.LIZ(c1224840hyk2, c1224850hyl, null, false, linkedHashMap, str2, false, false, false, false, false, 63998);
                if (c1224840hykLIZ != null) {
                    arrayList2.add(c1224840hykLIZ);
                }
            }
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        List listSingletonList = arrayList2;
        if (zIsEmpty) {
            listSingletonList = Collections.singletonList(new C1223810hx5(C1383370m6R.LIZ.getString(R.string.kgn)));
        }
        C1223660hwq c1223660hwq = new C1223660hwq(listSingletonList);
        C1C7U.LIZIZ("LiveInviteGuestConvSearchDataSourceProtocol@e633.onSearch$4");
        return c1223660hwq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1223660hwq> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
