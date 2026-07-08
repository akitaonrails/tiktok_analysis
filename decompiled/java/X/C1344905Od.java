package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05Od, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ui.LongPressPanelTopTipsView$getImUserInfo$1", f = "LongPressPanelMoveTipsManager.kt", l = {288, 298}, m = "invokeSuspend")
public final class C1344905Od extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public int LLILLJJLI;
    public final /* synthetic */ Function1<UrlModel, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1344905Od(Function1<? super UrlModel, Unit> function1, InterfaceC1364105Vn<? super C1344905Od> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1344905Od(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C259800zU c259800zU;
        T t;
        UrlModel displayAvatar;
        C1C7U.LIZ("LongPressPanelTopTipsView@1c90.getImUserInfo$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLL.invoke(null);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("LongPressPanelTopTipsView@1c90.getImUserInfo$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c259800zU = this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            c259800zU = new C259800zU();
            IInternalShareApi.LIZ.getClass();
            InterfaceC1364710lcL interfaceC1364710lcLLIZIZ = C1370970lmR.LIZ().LIZIZ();
            this.LL = c259800zU;
            this.LLILLJJLI = 1;
            obj = interfaceC1364710lcLLIZIZ.LJJIIJ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LongPressPanelTopTipsView@1c90.getImUserInfo$1");
                return objLJFF;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            if (!Intrinsics.LJFF(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), ((IMContact) obj2).getUid())) {
                arrayList.add(obj2);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                IMContact iMContact = (IMContact) it2.next();
                if ((iMContact instanceof IMUser) || (iMContact instanceof IMConversation)) {
                    displayAvatar = iMContact.getDisplayAvatar();
                } else {
                    displayAvatar = null;
                }
                if (displayAvatar != null) {
                    t = displayAvatar;
                    break;
                }
            } else {
                t = 0;
                break;
            }
        }
        c259800zU.element = t;
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C340401Tu c340401Tu = new C340401Tu(null, this.LLILLL, c259800zU);
        this.LL = null;
        this.LLILLJJLI = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c340401Tu) == objLJFF) {
            C1C7U.LIZIZ("LongPressPanelTopTipsView@1c90.getImUserInfo$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LongPressPanelTopTipsView@1c90.getImUserInfo$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
