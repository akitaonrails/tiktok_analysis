package X;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.lynx.base.log.LynxLog;
import com.ss.ttm.player.s;

/* JADX INFO: renamed from: X.0oRy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1473600oRy extends FrameLayout {
    public C1471230oO9 LL;
    public C1471190oO5 LLILLJJLI;
    public InterfaceC1469360oL8 LLILLL;
    public InterfaceC1467780oIa LLILZ;
    public InterfaceC1473620oS0 LLILZIL;
    public InterfaceC1467770oIZ LLILZLL;
    public Boolean LLIZ;

    public final boolean LIZ() {
        if (this.LL != null && this.LLILLJJLI != null) {
            return true;
        }
        LynxLog.e("BaseMediaView", "setUpController first before any action");
        return false;
    }

    public final boolean LIZIZ() {
        if (this.LLIZ.booleanValue()) {
            return true;
        }
        C1471190oO5 c1471190oO5 = this.LLILLJJLI;
        return c1471190oO5 != null && c1471190oO5.LLJILJILJ;
    }

    public final void LIZJ() {
        if (LIZ()) {
            C1471190oO5 c1471190oO5 = this.LLILLJJLI;
            if (c1471190oO5.LL != null) {
                c1471190oO5.LL.pause();
            }
        }
    }

    public int getDuration() {
        if (!LIZ()) {
            return -1;
        }
        C1471190oO5 c1471190oO5 = this.LLILLJJLI;
        if (c1471190oO5.LL != null) {
            return c1471190oO5.LL.LJJJJL();
        }
        return 0;
    }

    public C1473600oRy(Context context) {
        super(context, null, 0);
        this.LLIZ = Boolean.FALSE;
    }

    public void setDataSource(InterfaceC1467770oIZ interfaceC1467770oIZ) {
        this.LLILZLL = interfaceC1467770oIZ;
    }

    public void setLoop(boolean z) {
        if (!LIZ()) {
            return;
        }
        C1471190oO5 c1471190oO5 = this.LLILLJJLI;
        if (c1471190oO5.LL != null) {
            c1471190oO5.LL.setLooping(z);
        }
    }

    public void setMediaVideoEngineCallback(InterfaceC1473620oS0 interfaceC1473620oS0) {
        this.LLILZIL = interfaceC1473620oS0;
    }

    public void setMute(boolean z) {
        if (!LIZ()) {
            return;
        }
        C1471190oO5 c1471190oO5 = this.LLILLJJLI;
        if (c1471190oO5.LL != null) {
            c1471190oO5.LL.LJ(z);
        }
    }

    public void setResolution(String str) {
        EnumC2281151EQn enumC2281151EQn;
        if (!LIZ()) {
            return;
        }
        C1471190oO5 c1471190oO5 = this.LLILLJJLI;
        EnumC2281151EQn[] enumC2281151EQnArrValues = EnumC2281151EQn.values();
        int length = enumC2281151EQnArrValues.length;
        int i = 0;
        while (true) {
            if (i < length) {
                enumC2281151EQn = enumC2281151EQnArrValues[i];
                if (TextUtils.equals(str, enumC2281151EQn.toString(0))) {
                    break;
                } else {
                    i++;
                }
            } else {
                enumC2281151EQn = EnumC2281151EQn.Standard;
                break;
            }
        }
        if (c1471190oO5.LL != null) {
            c1471190oO5.LL.LJIILIIL(enumC2281151EQn);
        }
    }

    public void setSpeed(float f) {
        if (!LIZ()) {
            return;
        }
        C1471190oO5 c1471190oO5 = this.LLILLJJLI;
        if (c1471190oO5.LL != null) {
            s sVar = c1471190oO5.LLJ;
            if (sVar.LIZLLL == -1.0f) {
                sVar.LIZLLL = 1.0f;
            }
            sVar.LIZLLL = f;
            c1471190oO5.LL.LIZLLL(sVar);
        }
    }

    public void setVideoEngineCallback(InterfaceC1469360oL8 interfaceC1469360oL8) {
        this.LLILLL = interfaceC1469360oL8;
        C1471190oO5 c1471190oO5 = this.LLILLJJLI;
        if (c1471190oO5 != null) {
            c1471190oO5.LLILZIL = interfaceC1469360oL8;
        }
    }

    public void setVideoEngineInfoListener(InterfaceC1467780oIa interfaceC1467780oIa) {
        this.LLILZ = interfaceC1467780oIa;
        C1471190oO5 c1471190oO5 = this.LLILLJJLI;
        if (c1471190oO5 != null) {
            c1471190oO5.LLILZLL = interfaceC1467780oIa;
        }
    }

    public void setVolume(float f) {
        if (LIZ() && f >= 0.0f && f <= 1.0f) {
            C1471190oO5 c1471190oO5 = this.LLILLJJLI;
            if (c1471190oO5.LL != null) {
                c1471190oO5.LL.LIZJ(415, 1);
                c1471190oO5.LL.LJIILLIIL(f, f);
            }
        }
    }

    public void LIZLLL(C1471230oO9 c1471230oO9, InterfaceC1471260oOC interfaceC1471260oOC) {
        if (this.LL == c1471230oO9) {
            return;
        }
        C1471190oO5 c1471190oO5 = new C1471190oO5(getContext(), c1471230oO9);
        this.LLILLJJLI = c1471190oO5;
        c1471190oO5.LLIZLLLIL = interfaceC1471260oOC;
        InterfaceC1469360oL8 interfaceC1469360oL8 = this.LLILLL;
        if (interfaceC1469360oL8 != null) {
            c1471190oO5.LLILZIL = interfaceC1469360oL8;
        }
        InterfaceC1467780oIa interfaceC1467780oIa = this.LLILZ;
        if (interfaceC1467780oIa != null) {
            c1471190oO5.LLILZLL = interfaceC1467780oIa;
        }
        InterfaceC1467770oIZ interfaceC1467770oIZ = this.LLILZLL;
        if (interfaceC1467770oIZ != null) {
            c1471190oO5.LLIZ = interfaceC1467770oIZ;
        }
        this.LL = c1471230oO9;
    }
}
