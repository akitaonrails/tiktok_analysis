package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.liveinteract.multimatch.ui.MatchCountDownAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15Ea, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multimatch.ui.MatchCountDownAssem$onVSAnimationEnd$1", f = "MatchCountDownAssem.kt", l = {1076, 1091}, m = "invokeSuspend")
public final class C20485815Ea extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MatchCountDownAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20485815Ea(MatchCountDownAssem matchCountDownAssem, InterfaceC1364105Vn<? super C20485815Ea> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = matchCountDownAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20485815Ea(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    public static final void LIZ(MatchCountDownAssem matchCountDownAssem) {
        ViewGroup.LayoutParams layoutParams;
        ConstraintLayout constraintLayout = matchCountDownAssem.LLJJIJIL;
        if (constraintLayout != null && (layoutParams = constraintLayout.getLayoutParams()) != null) {
            layoutParams.width = -2;
        }
        ConstraintLayout constraintLayout2 = matchCountDownAssem.LLJJIJIL;
        if (constraintLayout2 != null) {
            C786410Ut5.LL(0, constraintLayout2);
        }
        ImageView imageView = matchCountDownAssem.LLJIJIL;
        if (imageView != null) {
            C786410Ut5.LJZI(0, imageView);
        }
        C1126540fQC c1126540fQC = matchCountDownAssem.LLJILJIL;
        if (c1126540fQC != null) {
            C786410Ut5.LLJJI(c1126540fQC, 8);
        }
        C432120Gx0 c432120Gx0 = matchCountDownAssem.LLJJIII;
        if (c432120Gx0 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c432120Gx0);
            c432120Gx0.setAlpha(1.0f);
        }
        C432120Gx0 c432120Gx02 = matchCountDownAssem.LLJJIII;
        if (c432120Gx02 != null) {
            C786410Ut5.LLLFF(c432120Gx02, 0);
        }
        C427330GpH c427330GpH = matchCountDownAssem.LLJJIJI;
        if (c427330GpH != null) {
            C786410Ut5.LLJLLIL(c427330GpH, 8);
        }
        C427330GpH c427330GpH2 = matchCountDownAssem.LLJJIJI;
        if (c427330GpH2 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c427330GpH2);
            c427330GpH2.setAlpha(0.0f);
        }
        C1145830fvJ c1145830fvJ = matchCountDownAssem.LLJJIJIIJIL;
        if (c1145830fvJ != null) {
            C786410Ut5.LLJLILLLLZIIL(c1145830fvJ, 8);
        }
        C1145830fvJ c1145830fvJ2 = matchCountDownAssem.LLJJIJIIJIL;
        if (c1145830fvJ2 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1145830fvJ2);
            c1145830fvJ2.setAlpha(0.0f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0097 A[PHI: r6
      0x0097: PHI (r6v1 com.bytedance.android.livesdk.model.message.common.Text) = 
      (r6v0 com.bytedance.android.livesdk.model.message.common.Text)
      (r6v3 com.bytedance.android.livesdk.model.message.common.Text)
     binds: [B:39:0x008f, B:41:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20485815Ea.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
