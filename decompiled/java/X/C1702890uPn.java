package X;

import com.bytedance.keva.Keva;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uPn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.mufquickdm.MufQuickDMBoxRepository$updateKeva$1", f = "MufQuickDMBoxRepository.kt", l = {135}, m = "invokeSuspend")
public final class C1702890uPn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1702910uPp LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1702890uPn(C1702910uPp c1702910uPp, InterfaceC1364105Vn<? super C1702890uPn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1702910uPp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1702890uPn(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MufQuickDMBoxRepository@e0d4.updateKeva$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(500L, this) == objLJFF) {
                C1C7U.LIZIZ("MufQuickDMBoxRepository@e0d4.updateKeva$1");
                return objLJFF;
            }
        }
        Keva keva = this.LLILLJJLI.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("daily_display_count_");
        sbLIZ.append(this.LLILLJJLI.LLILLJJLI);
        keva.storeInt(C2188811AlT.LIZIZ(sbLIZ), this.LLILLJJLI.LLILZ.LIZJ);
        Keva keva2 = this.LLILLJJLI.LL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("global_display_count_");
        sbLIZ2.append(this.LLILLJJLI.LLILLJJLI);
        keva2.storeInt(C2188811AlT.LIZIZ(sbLIZ2), this.LLILLJJLI.LLILZ.LIZIZ);
        Keva keva3 = this.LLILLJJLI.LL;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("last_update_time_");
        sbLIZ3.append(this.LLILLJJLI.LLILLJJLI);
        keva3.storeLong(C2188811AlT.LIZIZ(sbLIZ3), this.LLILLJJLI.LLILZ.LIZLLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MufQuickDMBoxRepository@e0d4.updateKeva$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
