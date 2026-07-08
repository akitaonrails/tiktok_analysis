package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DgQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.audiodownload.progress.TTSProgressHelper$dismiss$1", f = "TTSProgressHelper.kt", l = {}, m = "invokeSuspend")
public final class C345400DgQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C345410DgR LL;
    public final /* synthetic */ InterfaceC345430DgT LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C345400DgQ(C345410DgR c345410DgR, InterfaceC345430DgT interfaceC345430DgT, InterfaceC1364105Vn<? super C345400DgQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c345410DgR;
        this.LLILLJJLI = interfaceC345430DgT;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C345400DgQ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSProgressHelper@83e9.dismiss$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            CreativeDialogWrapper creativeDialogWrapper = this.LL.LIZ;
            if (creativeDialogWrapper != null && creativeDialogWrapper.isShowing()) {
                CreativeDialogWrapper creativeDialogWrapper2 = this.LL.LIZ;
                if (creativeDialogWrapper2 != null) {
                    creativeDialogWrapper2.dismiss();
                }
                C2296808zG.LIZJ((InterfaceC497601wk) this.LL.LIZIZ.getValue(), null);
                InterfaceC345430DgT interfaceC345430DgT = this.LLILLJJLI;
                if (interfaceC345430DgT != null) {
                    interfaceC345430DgT.onDismiss();
                }
            }
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTSProgressHelper@83e9.dismiss$1");
        return unit;
    }
}
