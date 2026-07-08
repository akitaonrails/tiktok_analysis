package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import com.ss.android.ugc.aweme.music.ui.widget.ThirdMusicViewHolder;

/* JADX INFO: renamed from: X.12Z2, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12Z2 extends C1320700kTM {
    public final int $t;
    public Object l0;

    public static final void LIZ$0(C12Z2 c12z2, String str, Throwable th) {
    }

    public static final void LIZLLL$0(C12Z2 c12z2, String str, Throwable th) {
    }

    public static final void LJFF$0(C12Z2 c12z2, Object obj, String str) {
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LIZ(String str, Throwable th) {
        if (3 - this.$t != 0) {
            super.LIZ(str, th);
        } else {
            LIZ$0(this, str, th);
        }
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LIZJ(Object obj, String str) {
        switch (this.$t) {
            case 0:
                LIZJ$0(this, obj, str);
                break;
            case 1:
            case 4:
            default:
                super.LIZJ(obj, str);
                break;
            case 2:
                LIZJ$1(this, obj, str);
                break;
            case 3:
                LIZJ$2(this, obj, str);
                break;
            case 5:
                LIZJ$3(this, obj, str);
                break;
        }
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LIZLLL(String str, Throwable th) {
        switch (this.$t) {
            case 3:
                LIZLLL$0(this, str, th);
                break;
            case 4:
                LIZLLL$1(this, str, th);
                break;
            default:
                super.LIZLLL(str, th);
                break;
        }
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LJ(String str, Object obj, Animatable animatable) {
        switch (this.$t) {
            case 0:
                LJ$0(this, str, obj, animatable);
                break;
            case 1:
                LJ$1(this, str, obj, animatable);
                break;
            case 2:
                LJ$2(this, str, obj, animatable);
                break;
            case 3:
                LJ$3(this, str, obj, animatable);
                break;
            case 4:
                LJ$4(this, str, obj, animatable);
                break;
            case 5:
                LJ$5(this, str, obj, animatable);
                break;
            default:
                super.LJ(str, obj, animatable);
                break;
        }
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LJFF(Object obj, String str) {
        if (4 - this.$t != 0) {
            super.LJFF(obj, str);
        } else {
            LJFF$0(this, obj, str);
        }
    }

    @Override // X.C1320700kTM
    public final void LJII(String str, C1325710kbR c1325710kbR, Throwable th) {
        if (4 - this.$t != 0) {
            super.LJII(str, c1325710kbR, th);
        } else {
            LJII$0(this, str, c1325710kbR, th);
        }
    }

    public C12Z2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZJ$0(C12Z2 c12z2, Object obj, String str) {
        InterfaceC1330440kj4 interfaceC1330440kj4 = (InterfaceC1330440kj4) obj;
        C11FN c11fn = (C11FN) c12z2.l0;
        c11fn.getClass();
        if (interfaceC1330440kj4 != null) {
            c11fn.setAspectRatio(interfaceC1330440kj4.getWidth() / interfaceC1330440kj4.getHeight());
            c11fn.invalidateOutline();
        }
    }

    public static final void LIZJ$1(C12Z2 c12z2, Object obj, String str) {
        ((C11FO) c12z2.l0).LIZLLL((InterfaceC1330440kj4) obj);
    }

    public static final void LIZJ$2(C12Z2 c12z2, Object obj, String str) {
        InterfaceC1330440kj4 interfaceC1330440kj4 = (InterfaceC1330440kj4) obj;
        C11FN c11fn = ((C19421310yZ) c12z2.l0).LJI;
        if (c11fn != null && interfaceC1330440kj4 != null) {
            c11fn.setAspectRatio(interfaceC1330440kj4.getWidth() / interfaceC1330440kj4.getHeight());
            c11fn.invalidateOutline();
        }
    }

    public static final void LIZJ$3(C12Z2 c12z2, Object obj, String str) {
        InterfaceC1330440kj4 interfaceC1330440kj4 = (InterfaceC1330440kj4) obj;
        C11FO c11fo = ((ThirdMusicViewHolder) c12z2.l0).LL;
        View view = null;
        if (c11fo == null) {
            c11fo = null;
        }
        c11fo.LIZLLL(interfaceC1330440kj4);
        ThirdMusicViewHolder thirdMusicViewHolder = (ThirdMusicViewHolder) c12z2.l0;
        View view2 = thirdMusicViewHolder.LLILLJJLI;
        if (view2 == null) {
            view2 = null;
        }
        view2.clearAnimation();
        View view3 = thirdMusicViewHolder.LLILLJJLI;
        if (view3 != null) {
            view = view3;
        }
        C786410Ut5.LJLLLLLL(8, view);
    }

    public static final void LIZLLL$1(C12Z2 c12z2, String str, Throwable th) {
        String path;
        Uri uri;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showImage onFailure, url=");
        C1325710kbR c1325710kbR = (C1325710kbR) c12z2.l0;
        if (c1325710kbR != null && (uri = c1325710kbR.LIZIZ) != null) {
            path = uri.getPath();
        } else {
            path = null;
        }
        sbLIZ.append(path);
        C21290818Tq.LIZIZ("AiChatGuideDialogScene", C2188811AlT.LIZIZ(sbLIZ), th);
    }

    public static final void LJ$0(C12Z2 c12z2, String str, Object obj, Animatable animatable) {
        InterfaceC1330440kj4 interfaceC1330440kj4 = (InterfaceC1330440kj4) obj;
        C11FN c11fn = (C11FN) c12z2.l0;
        c11fn.getClass();
        if (interfaceC1330440kj4 != null) {
            c11fn.setAspectRatio(interfaceC1330440kj4.getWidth() / interfaceC1330440kj4.getHeight());
            c11fn.invalidateOutline();
        }
    }

    public static final void LJ$1(C12Z2 c12z2, String str, Object obj, Animatable animatable) {
        ((C11FQ) c12z2.l0).LLILLL = true;
    }

    public static final void LJ$2(C12Z2 c12z2, String str, Object obj, Animatable animatable) {
        ((C11FO) c12z2.l0).LIZLLL((InterfaceC1330440kj4) obj);
    }

    public static final void LJ$3(C12Z2 c12z2, String str, Object obj, Animatable animatable) {
        InterfaceC1330440kj4 interfaceC1330440kj4 = (InterfaceC1330440kj4) obj;
        C11FN c11fn = ((C19421310yZ) c12z2.l0).LJI;
        if (c11fn != null && interfaceC1330440kj4 != null) {
            c11fn.setAspectRatio(interfaceC1330440kj4.getWidth() / interfaceC1330440kj4.getHeight());
            c11fn.invalidateOutline();
        }
    }

    public static final void LJ$5(C12Z2 c12z2, String str, Object obj, Animatable animatable) {
        InterfaceC1330440kj4 interfaceC1330440kj4 = (InterfaceC1330440kj4) obj;
        C11FO c11fo = ((ThirdMusicViewHolder) c12z2.l0).LL;
        View view = null;
        if (c11fo == null) {
            c11fo = null;
        }
        c11fo.LIZLLL(interfaceC1330440kj4);
        ThirdMusicViewHolder thirdMusicViewHolder = (ThirdMusicViewHolder) c12z2.l0;
        View view2 = thirdMusicViewHolder.LLILLJJLI;
        if (view2 == null) {
            view2 = null;
        }
        view2.clearAnimation();
        View view3 = thirdMusicViewHolder.LLILLJJLI;
        if (view3 != null) {
            view = view3;
        }
        C786410Ut5.LJLLLLLL(8, view);
    }

    public static final void LJII$0(C12Z2 c12z2, String str, C1325710kbR c1325710kbR, Throwable th) {
        String path;
        Uri uri;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showImage onFailure, url=");
        if (c1325710kbR != null && (uri = c1325710kbR.LIZIZ) != null) {
            path = uri.getPath();
        } else {
            path = null;
        }
        sbLIZ.append(path);
        C21290818Tq.LIZIZ("AiChatGuideDialogScene", C2188811AlT.LIZIZ(sbLIZ), th);
    }

    public static final /* bridge */ /* synthetic */ void LJ$4(C12Z2 c12z2, String str, Object obj, Animatable animatable) {
    }
}
