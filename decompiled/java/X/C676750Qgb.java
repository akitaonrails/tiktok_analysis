package X;

import android.graphics.Bitmap;
import android.view.View;
import com.ss.android.ugc.aweme.ability.IPhotoModeAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import kotlin.jvm.internal.AwS219S0300000_10;

/* JADX INFO: renamed from: X.0Qgb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C676750Qgb implements InterfaceC676480QgA {
    public final Aweme LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final C0SZ8 LIZLLL;

    @Override // X.InterfaceC676480QgA
    public final Aweme getAweme() {
        return this.LIZ;
    }

    @Override // X.InterfaceC676480QgA
    public final String getEnterFrom() {
        return this.LIZIZ;
    }

    public final void LIZ(AwS219S0300000_10 awS219S0300000_10) {
        IPhotoModeAbility iPhotoModeAbility;
        View videoView = null;
        bitmapE61 = null;
        Bitmap bitmapE61 = null;
        if (this.LIZLLL == null) {
            awS219S0300000_10.invoke(null);
            return;
        }
        Aweme aweme = this.LIZ;
        if (aweme != null && AwemeExtKt.isPhotoMode(aweme)) {
            InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C0T0K.LIZIZ(this.LIZLLL);
            if (interfaceC665370Q7zLIZIZ != null && (iPhotoModeAbility = (IPhotoModeAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, IPhotoModeAbility.class, null)) != null) {
                bitmapE61 = iPhotoModeAbility.e61();
            }
            awS219S0300000_10.invoke(bitmapE61);
            return;
        }
        InterfaceC583650Mup interfaceC583650MupX3 = this.LIZLLL.x3();
        if (interfaceC583650MupX3 != null) {
            videoView = interfaceC583650MupX3.getVideoView();
        }
        C1474200oSw.LIZ(videoView, true, awS219S0300000_10);
    }

    public C676750Qgb(Aweme aweme, String str, String str2, C0SZ8 c0sz8) {
        this.LIZ = aweme;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = c0sz8;
    }
}
