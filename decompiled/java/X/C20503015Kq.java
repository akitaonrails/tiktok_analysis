package X;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.15Kq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20503015Kq extends FrameLayout {
    public C20503315Kt LL;
    public C20503415Ku LLILLJJLI;
    public final C01GW LLILLL;
    public final C20503415Ku LLILZ;
    public final C20503315Kt LLILZIL;
    public final TuxTextView LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public C15JF LLJ;
    public InterfaceC20503215Ks LLJI;

    public final int getMaxCntOnScreen() {
        C20503415Ku c20503415Ku = this.LLILZ;
        int i = this.LLIZLLLIL;
        C20503515Kv c20503515Kv = c20503415Ku.LLIZLLLIL;
        int i2 = c20503515Kv.LIZ + c20503515Kv.LIZIZ;
        if (i2 != 0) {
            return i / i2;
        }
        return 60;
    }

    public final C20503315Kt getMusicSelectFrameViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.owd);
            this.LL = (C20503315Kt) callbackFindViewById;
        }
        return (C20503315Kt) callbackFindViewById;
    }

    public final C20503415Ku getMusicWaveViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.oxh);
            this.LLILLJJLI = (C20503415Ku) callbackFindViewById;
        }
        return (C20503415Ku) callbackFindViewById;
    }

    public final float getSelectFrameEndTime() {
        return this.LLILZIL.getSelectFrameRect().width() / this.LLILZIL.getScale();
    }

    public final C15JF getAudioData() {
        return this.LLJ;
    }

    public final InterfaceC20503215Ks getAudioSelectFrameClipListener() {
        return this.LLJI;
    }

    public final int getMaxWidth() {
        return this.LLIZLLLIL;
    }

    public final int getMinWidth() {
        return this.LLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095 A[PHI: r11
      0x0095: PHI (r11v2 android.view.View) = (r11v0 android.view.View), (r11v3 android.view.View) binds: [B:23:0x0093, B:21:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C20503015Kq(X.C1361400lX0 r23) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20503015Kq.<init>(X.0lX0):void");
    }

    public final void setAudioData(C15JF c15jf) {
        this.LLJ = c15jf;
    }

    public final void setAudioSelectFrameClipListener(InterfaceC20503215Ks interfaceC20503215Ks) {
        this.LLJI = interfaceC20503215Ks;
    }

    public final void setMinWidth(int i) {
        this.LLIZ = i;
    }

    public final void setMusicSelectFrameViewFromXml(C20503315Kt c20503315Kt) {
        this.LL = c20503315Kt;
    }

    public final void setMusicWaveViewFromXml(C20503415Ku c20503415Ku) {
        this.LLILLJJLI = c20503415Ku;
    }

    public final void LIZ(float f, C15JF c15jf) {
        this.LLJ = c15jf;
        this.LLIZLLLIL = (int) (c15jf.LJI * f);
        this.LLIZ = (int) (C1454930nxr.LIZ().clipMinLength * f);
        this.LLILZLL.setText(c15jf.LIZ);
        C20503315Kt c20503315Kt = this.LLILZIL;
        c20503315Kt.getSelectFrameRect().left = 0.0f;
        c20503315Kt.getSelectFrameRect().right = (c15jf.LIZLLL - c15jf.LIZJ) * f;
        c20503315Kt.setScale(f);
        c20503315Kt.invalidate();
        c20503315Kt.requestLayout();
        C20503415Ku c20503415Ku = this.LLILZ;
        int startForWave = this.LLILZIL.getStartForWave();
        int endForWave = this.LLILZIL.getEndForWave();
        c20503415Ku.LLILZ = startForWave;
        c20503415Ku.LLILZIL = endForWave;
        c20503415Ku.invalidate();
        c20503415Ku.requestLayout();
    }

    public final void LIZIZ(boolean z, boolean z2, boolean z3) {
        this.LLILZIL.setFrameSelected(z);
        this.LLILZIL.setDisableLeftHandle(z2);
        this.LLILZIL.setDisableRightHandle(z3);
        if (z) {
            this.LLILZ.setAlpha(255);
        } else {
            this.LLILZ.setAlpha(128);
        }
        this.LLILZIL.invalidate();
    }
}
