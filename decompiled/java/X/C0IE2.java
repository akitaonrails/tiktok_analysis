package X;

import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.im.assem.BasePanelContainerAssem;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import u4.q0;

/* JADX INFO: renamed from: X.0IE2, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0IE2 implements C0TVI {
    public final int $t;
    public Object l0;

    @Override // X.C0TVI
    public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
        switch (this.$t) {
            case 0:
                return onApplyWindowInsets$0(this, view, c20246014Ju);
            case 1:
                return onApplyWindowInsets$1(this, view, c20246014Ju);
            default:
                return null;
        }
    }

    public C0IE2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final C20246014Ju onApplyWindowInsets$0(C0IE2 c0ie2, View view, C20246014Ju c20246014Ju) {
        C20246014Ju c20246014JuLJIIL = q0.LJIIL(view, c20246014Ju);
        BasePanelContainerAssem basePanelContainerAssem = (BasePanelContainerAssem) c0ie2.l0;
        basePanelContainerAssem.getClass();
        boolean zLJIIIIZZ = c20246014JuLJIIL.LJIIIIZZ(8);
        int i = c20246014JuLJIIL.LIZ(8).LIZLLL;
        int i2 = c20246014JuLJIIL.LIZ(2).LIZLLL;
        if (basePanelContainerAssem.No()) {
            basePanelContainerAssem.Jo().LLJI.setValue(Integer.valueOf(i2));
        } else {
            i -= i2;
        }
        if (zLJIIIIZZ) {
            basePanelContainerAssem.Jo().jt(C447810HhD.LL, i);
            basePanelContainerAssem.Vo();
        } else if (basePanelContainerAssem.Jo().LLIZ.getValue() instanceof C447810HhD) {
            PanelStateViewModel panelStateViewModelJo = basePanelContainerAssem.Jo();
            panelStateViewModelJo.jt(C1629106Zl.LL, panelStateViewModelJo.Ke().getValue().intValue());
            return c20246014JuLJIIL;
        }
        return c20246014JuLJIIL;
    }

    public static final C20246014Ju onApplyWindowInsets$1(C0IE2 c0ie2, View view, C20246014Ju c20246014Ju) {
        if (((C446810Hfb) c0ie2.l0).getVisibility() == 8) {
            ((C446810Hfb) c0ie2.l0).LL = null;
            return c20246014Ju;
        }
        if (!new C20246014Ju(c20246014Ju).equals(((C446810Hfb) c0ie2.l0).LL)) {
            ((C446810Hfb) c0ie2.l0).LL = new C20246014Ju(c20246014Ju);
            C446810Hfb c446810Hfb = (C446810Hfb) c0ie2.l0;
            HandlerHook.viewPost(c446810Hfb, c446810Hfb.LLILZ);
        }
        return new C20246014Ju(c20246014Ju).LJIIIZ(c20246014Ju.LIZLLL(), c20246014Ju.LJFF(), c20246014Ju.LJ(), 0);
    }
}
