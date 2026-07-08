package X;

import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0L6h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.creation.component.AITheaterCameoControlComponent$onCreate$4$1", f = "AITheaterCameoControlComponent.kt", l = {176}, m = "invokeSuspend")
public final class C537530L6h extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C537550L6j LLILLL;
    public final /* synthetic */ C549180LgK LLILZ;
    public final /* synthetic */ Activity LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C537530L6h(C537550L6j c537550L6j, C549180LgK c549180LgK, Activity activity, InterfaceC1364105Vn<? super C537530L6h> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c537550L6j;
        this.LLILZ = c549180LgK;
        this.LLILZIL = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C537530L6h(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Long lLJIILIIL;
        Activity activity;
        C1C7U.LIZ("AITheaterCameoControlComponent@4a33.onCreate$4$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C547140Ld2 c547140Ld2 = C537540L6i.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getPeerLibraResponse error: ");
            sbLIZ.append(e.getMessage());
            c547140Ld2.LIZIZ("AITheaterCameoControlComponent", C2188811AlT.LIZIZ(sbLIZ), null);
        }
        if (i != 0) {
            if (i == 1) {
                activity = (Activity) this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            String str = this.LLILLL.LIZ.uid;
            if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
                activity = this.LLILZIL;
                long jLongValue = lLJIILIIL.longValue();
                C1DFB c1dfb = C0PEM.LIZJ;
                C537480L6c c537480L6c = new C537480L6c(jLongValue, null);
                this.LL = activity;
                this.LLILLJJLI = 1;
                obj = C23250099c.LJI(this, c1dfb, c537480L6c);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AITheaterCameoControlComponent@4a33.onCreate$4$1");
                    return objLJFF;
                }
            }
            C549180LgK c549180LgK = this.LLILZ;
            C537550L6j c537550L6j = this.LLILLL;
            c549180LgK.i3(c537550L6j.LIZ, c537550L6j.LIZJ, c537550L6j.LIZLLL);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AITheaterCameoControlComponent@4a33.onCreate$4$1");
            return unit;
        }
        if (Intrinsics.LJFF((Boolean) ((Pair) obj).getSecond(), false)) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIJ(C547930LeJ.LIZ(2131826043, new Object[0]));
            c1389890mGx.LJIIJJI();
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("AITheaterCameoControlComponent@4a33.onCreate$4$1");
            return unit2;
        }
        C549180LgK c549180LgK2 = this.LLILZ;
        C537550L6j c537550L6j2 = this.LLILLL;
        c549180LgK2.i3(c537550L6j2.LIZ, c537550L6j2.LIZJ, c537550L6j2.LIZLLL);
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("AITheaterCameoControlComponent@4a33.onCreate$4$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
