package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06pe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.utils.InboxPageHelper$adjustCreateChatOrSearchEntranceViewIfNeed$2$2", f = "InboxPageHelper.kt", l = {254, 257}, m = "invokeSuspend")
public final class C1727606pe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C891780Yye LLILLJJLI;
    public final /* synthetic */ TuxIconView LLILLL;
    public final /* synthetic */ TuxIconView LLILZ;
    public final /* synthetic */ TuxIconView LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1727606pe(C891780Yye c891780Yye, TuxIconView tuxIconView, TuxIconView tuxIconView2, TuxIconView tuxIconView3, InterfaceC1364105Vn<? super C1727606pe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c891780Yye;
        this.LLILLL = tuxIconView;
        this.LLILZ = tuxIconView2;
        this.LLILZIL = tuxIconView3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1727606pe(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxPageHelper@ff22.adjustCreateChatOrSearchEntranceViewIfNeed$2$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("InboxPageHelper@ff22.adjustCreateChatOrSearchEntranceViewIfNeed$2$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            IMContactApi.LIZ.getClass();
            InterfaceC15516065q interfaceC15516065qLIZJ = C069P.LIZ().LIZJ();
            EnumC1725606pK enumC1725606pK = EnumC1725606pK.BUSINESS_TOOLS_ITEMS;
            this.LL = 1;
            obj = interfaceC15516065qLIZJ.LIZIZ(enumC1725606pK, null, null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("InboxPageHelper@ff22.adjustCreateChatOrSearchEntranceViewIfNeed$2$2");
                return objLJFF;
            }
        }
        if (((List) obj) != null) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1727706pf c1727706pf = new C1727706pf(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c1727706pf) == objLJFF) {
                C1C7U.LIZIZ("InboxPageHelper@ff22.adjustCreateChatOrSearchEntranceViewIfNeed$2$2");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("InboxPageHelper@ff22.adjustCreateChatOrSearchEntranceViewIfNeed$2$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
