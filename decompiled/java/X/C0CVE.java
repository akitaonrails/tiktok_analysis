package X;

import android.os.SystemClock;
import com.bytedance.android.live.publicscreen.impl.caption.CaptionViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CVE, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.live.publicscreen.impl.caption.CaptionViewModel$2$1$1", f = "CaptionViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0CVE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ CaptionViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CVE(String str, CaptionViewModel captionViewModel, InterfaceC1364105Vn<? super C0CVE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = captionViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CVE(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CaptionViewModel@f117.<init>$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            k kVarLJJIIZ = C2348809Ig.LJI(this.LL).LJJIIZ("ts");
            if (kVarLJJIIZ != null) {
                CaptionViewModel captionViewModel = this.LLILLJJLI;
                long jLJIIZILJ = kVarLJJIIZ.LJIIZILJ();
                C20441214yg.LIZIZ("SeiHelper", String.valueOf(jLJIIZILJ));
                captionViewModel.LLJI = jLJIIZILJ;
                this.LLILLJJLI.LLJIJIL = SystemClock.elapsedRealtime();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LIZIZ("CaptionViewModel", e.toString());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CaptionViewModel@f117.<init>$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
