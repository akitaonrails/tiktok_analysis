package X;

import Y.ARunnableS131S0100000_31;
import android.graphics.drawable.Animatable;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.16HX, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16HX implements InterfaceC1142670fqD {
    public final int $t;
    public Object l0;

    public static final void LIZ$0(C16HX c16hx) {
    }

    public static final void LIZ$1(C16HX c16hx) {
    }

    public static final void LIZ$2(C16HX c16hx) {
    }

    public static final void LIZ$3(C16HX c16hx) {
    }

    public static final void LIZ$4(C16HX c16hx) {
    }

    public static final void LIZIZ$0(C16HX c16hx, Animatable animatable) {
    }

    public static final void LIZIZ$1(C16HX c16hx, Animatable animatable) {
    }

    public static final void LIZIZ$2(C16HX c16hx, Animatable animatable) {
    }

    public static final void LIZIZ$3(C16HX c16hx, Animatable animatable) {
    }

    public static final void LIZIZ$4(C16HX c16hx, Animatable animatable) {
    }

    public static final void LIZLLL$1(C16HX c16hx, String str, Exception exc) {
    }

    @Override // X.InterfaceC1142670fqD
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                break;
            case 1:
                LIZ$1(this);
                break;
            case 2:
                LIZ$2(this);
                break;
            case 3:
                LIZ$3(this);
                break;
            case 4:
                LIZ$4(this);
                break;
        }
    }

    @Override // X.InterfaceC1142670fqD
    public final void LIZIZ(Animatable animatable) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, animatable);
                break;
            case 1:
                LIZIZ$1(this, animatable);
                break;
            case 2:
                LIZIZ$2(this, animatable);
                break;
            case 3:
                LIZIZ$3(this, animatable);
                break;
            case 4:
                LIZIZ$4(this, animatable);
                break;
        }
    }

    @Override // X.InterfaceC1142670fqD
    public final void LIZJ(int i, int i2, String str) {
        switch (this.$t) {
            case 0:
                LIZJ$0(this, i, i2, str);
                break;
            case 1:
                LIZJ$1(this, i, i2, str);
                break;
            case 2:
                LIZJ$2(this, i, i2, str);
                break;
            case 3:
                LIZJ$3(this, i, i2, str);
                break;
            case 4:
                LIZJ$4(this, i, i2, str);
                break;
        }
    }

    @Override // X.InterfaceC1142670fqD
    public final void LIZLLL(String str, Exception exc) {
        switch (this.$t) {
            case 0:
                LIZLLL$0(this, str, exc);
                break;
            case 1:
                LIZLLL$1(this, str, exc);
                break;
            case 2:
                LIZLLL$2(this, str, exc);
                break;
            case 3:
                LIZLLL$3(this, str, exc);
                break;
            case 4:
                LIZLLL$4(this, str, exc);
                break;
        }
    }

    public C16HX(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZLLL$0(C16HX c16hx, String str, Exception exc) {
        C204748159u c204748159u = (C204748159u) c16hx.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadFailed imageUrl:");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c204748159u.getClass();
        C15AI.LJFF(c204748159u, strLIZIZ);
        C204748159u c204748159u2 = (C204748159u) c16hx.l0;
        c204748159u2.LLIZ = "";
        c204748159u2.LLIZLLLIL = "";
    }

    public static final void LIZLLL$2(C16HX c16hx, String str, Exception exc) {
        String tag = ((C204747159t) c16hx.l0).getTag();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("new avatar onLoadFailed imageUrl:");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ(tag, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LIZLLL$3(C16HX c16hx, String str, Exception exc) {
        String tag = ((C204747159t) c16hx.l0).getTag();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("old avatar onLoadFailed imageUrl:");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ(tag, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LIZLLL$4(C16HX c16hx, String str, Exception exc) {
        C20420514vL c20420514vL = (C20420514vL) c16hx.l0;
        PlaybookUtilKt.LJJIIJ(c20420514vL.LLILZ, new C20420114vH(c20420514vL), false);
        c20420514vL.LLILZLL.cancelAnimation();
        c20420514vL.LLILZIL.onPause();
    }

    public static final void LIZJ$0(C16HX c16hx, int i, int i2, String str) {
        String str2;
        C204748159u c204748159u = (C204748159u) c16hx.l0;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        c204748159u.LLIZ = str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadSuccess imageUrl:");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c204748159u.getClass();
        C15AI.LJFF(c204748159u, strLIZIZ);
        ((C204748159u) c16hx.l0).LLIZLLLIL = "";
    }

    public static final void LIZJ$1(C16HX c16hx, int i, int i2, String str) {
        C20412314u1 c20412314u1 = (C20412314u1) c16hx.l0;
        C1324720kZq c1324720kZq = c20412314u1.LLILZIL;
        if (c1324720kZq != null) {
            HandlerHook.viewPost(c1324720kZq, new ARunnableS131S0100000_31(c20412314u1, 116));
        }
    }

    public static final void LIZJ$2(C16HX c16hx, int i, int i2, String str) {
        String tag = ((C204747159t) c16hx.l0).getTag();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("new avatar onLoadSuccess imageUrl:");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ(tag, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LIZJ$3(C16HX c16hx, int i, int i2, String str) {
        String tag = ((C204747159t) c16hx.l0).getTag();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("old avatar onLoadSuccess imageUrl:");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ(tag, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LIZJ$4(C16HX c16hx, int i, int i2, String str) {
        C20420514vL c20420514vL = (C20420514vL) c16hx.l0;
        PlaybookUtilKt.LJJIIJ(c20420514vL.LLILZ, new C20420114vH(c20420514vL), false);
        c20420514vL.LLILZLL.cancelAnimation();
        c20420514vL.LLILZIL.onPause();
    }
}
