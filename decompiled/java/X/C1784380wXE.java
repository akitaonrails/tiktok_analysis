package X;

import com.bytedance.android.livesdk.game.partnership.widget.GamePartnershipGamePinCardWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wXE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.game.partnership.widget.GamePartnershipGamePinCardWidget$tryDelayShowAgain$delayJob$1", f = "GamePartnershipGamePinCardWidget.kt", l = {384}, m = "invokeSuspend")
public final class C1784380wXE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ GamePartnershipGamePinCardWidget LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1784380wXE(long j, GamePartnershipGamePinCardWidget gamePartnershipGamePinCardWidget, String str, String str2, InterfaceC1364105Vn<? super C1784380wXE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = gamePartnershipGamePinCardWidget;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1784380wXE(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long j;
        C1870150ylZ c1870150ylZ;
        C1C7U.LIZ("GamePartnershipGamePinCardWidget@3fec.tryDelayShowAgain$delayJob$1");
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
            long j2 = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j2, this) == objLJFF) {
                C1C7U.LIZIZ("GamePartnershipGamePinCardWidget@3fec.tryDelayShowAgain$delayJob$1");
                return objLJFF;
            }
        }
        C20441214yg.LIZIZ("PartnershipAudience", "delay task resume");
        if (this.LLILLL.C1() == null) {
            this.LLILLL.M1(0, this.LLILZ, this.LLILZIL, "timeout_replay");
        } else {
            C1870140ylY c1870140ylYC1 = this.LLILLL.C1();
            Integer numLJ = null;
            if (c1870140ylYC1 != null && (c1870150ylZ = c1870140ylYC1.LIZ) != null) {
                numLJ = C2286608xc.LJ(c1870150ylZ.LIZ);
                j = c1870150ylZ.LIZLLL + ((long) 5000);
            } else {
                j = this.LLILLJJLI;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("skip delay show again, cur pinCard =");
            sbLIZ.append(numLJ);
            sbLIZ.append(" nextDelayTime= ");
            sbLIZ.append(j);
            C20441214yg.LIZIZ("PartnershipAudience", C2188811AlT.LIZIZ(sbLIZ));
            if (numLJ != null && numLJ.intValue() == 1) {
                this.LLILLL.O1(0, this.LLILZ, j, this.LLILZIL);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GamePartnershipGamePinCardWidget@3fec.tryDelayShowAgain$delayJob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
