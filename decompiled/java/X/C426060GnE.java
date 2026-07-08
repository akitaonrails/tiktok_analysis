package X;

import Y.ARunnableS106S0100000_6;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.LayerDrawable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0GnE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426060GnE extends C427660Gpo {
    public final C01GW LLJL;
    public boolean LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public boolean LLJLLL;
    public UrlModel LLJZ;

    private final LayerDrawable getCreateIcon() {
        return this.LLJLIL ? getCreateIconDrawableForLive() : getCreateIconDrawable();
    }

    private final LayerDrawable getCreateIconDrawable() {
        return (LayerDrawable) this.LLJLILLLLZIIL.getValue();
    }

    private final LayerDrawable getCreateIconDrawableForLive() {
        return (LayerDrawable) this.LLJLL.getValue();
    }

    private final Paint getPaint() {
        return (Paint) this.LLJL.getValue();
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final boolean getUseLiveStyle() {
        return this.LLJLIL;
    }

    public C426060GnE(C1361400lX0 c1361400lX0) {
        super(c1361400lX0, null, 6, 0);
        this.LLJL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(630));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS550S0100000_6(c1361400lX0, 1633));
        this.LLJLL = C452501pT.LIZIZ(new AwS546S0100000_2(c1361400lX0, 1230));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS550S0100000_6(c1361400lX0, 1634));
        setLayerType(1, null);
    }

    public final void LJIILJJIL(User user) {
        UrlModel avatarThumb;
        if (user == null) {
            user = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        }
        UrlModel urlModel = this.LLJZ;
        UrlModel avatarThumb2 = null;
        if (user != null) {
            avatarThumb = user.getAvatarThumb();
        } else {
            avatarThumb = null;
        }
        if (Intrinsics.LJFF(urlModel, avatarThumb)) {
            return;
        }
        if (user != null) {
            avatarThumb2 = user.getAvatarThumb();
        }
        this.LLJZ = avatarThumb2;
        C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS106S0100000_6((Object) this, 326));
    }

    public final void LJIILL(Canvas canvas) {
        float width;
        int width2;
        int width3;
        super.onDraw(canvas);
        if (!this.LLJLLL) {
            return;
        }
        if (((Boolean) this.LLJLLIL.getValue()).booleanValue()) {
            width = C418440Gaw.LIZIZ(12) / 2;
        } else {
            width = getWidth() - (C418440Gaw.LIZIZ(12) / 2);
        }
        float f = 2;
        canvas.drawCircle(width, getHeight() - (C418440Gaw.LIZIZ(12) / f), C418440Gaw.LIZIZ(Double.valueOf(1.5d)) + (C418440Gaw.LIZIZ(12) / f), getPaint());
        if (((Boolean) this.LLJLLIL.getValue()).booleanValue()) {
            width2 = 0;
        } else {
            width2 = getWidth() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        }
        if (((Boolean) this.LLJLLIL.getValue()).booleanValue()) {
            width3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        } else {
            width3 = getWidth();
        }
        getCreateIcon().setBounds(width2, getHeight() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), width3, getHeight());
        getCreateIcon().draw(canvas);
    }

    @Override // X.C427660Gpo, X.C427870Gq9, com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            LJIILL(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setLiveStyle(boolean z) {
        boolean z2;
        if (this.LLJLIL != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LLJLIL = z;
        if (z2) {
            invalidate();
        }
    }

    public final void setUseLiveStyle(boolean z) {
        this.LLJLIL = z;
    }
}
