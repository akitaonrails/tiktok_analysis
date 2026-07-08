package X;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.model.LiveMessagePlatformBubbleConfig;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: renamed from: X.0emz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1102230emz implements InterfaceC1102120emo {
    public final String LIZ;
    public final long LIZIZ;
    public final boolean LIZJ;
    public final WeakReference<View> LIZLLL;
    public final C1102240en0 LJ;
    public final C1113780f5c LJFF;

    @Override // X.InterfaceC1102120emo
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC1102120emo
    public final boolean LJ() {
        return true;
    }

    @Override // X.InterfaceC1102120emo
    public final boolean LJFF() {
        return true;
    }

    @Override // X.InterfaceC1102120emo
    public final void LJI() {
    }

    @Override // X.InterfaceC1102120emo
    public final boolean LJIIJJI() {
        return true;
    }

    @Override // X.InterfaceC1102120emo
    public final boolean LJIILIIL() {
        return true;
    }

    @Override // X.InterfaceC1102120emo
    public final String LJJJ() {
        return null;
    }

    @Override // X.InterfaceC1102120emo
    public final String LIZIZ() {
        C1102240en0 c1102240en0 = this.LJ;
        if (c1102240en0 != null) {
            return c1102240en0.LIZ;
        }
        return null;
    }

    @Override // X.InterfaceC1102120emo
    public final C1099880ejC LJIIIZ() {
        View view = this.LIZLLL.get();
        return new C1099880ejC(view != null ? view.hasWindowFocus() : false);
    }

    @Override // X.InterfaceC1102120emo
    public final Boolean LJIIL() {
        View view = this.LIZLLL.get();
        boolean z = false;
        if (view != null && view.getVisibility() == 0 && view.getAlpha() != 0.0f) {
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect) && rect.width() > 0 && rect.height() > 0) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC1102120emo
    public final View LJIILJJIL() {
        View view = this.LIZLLL.get();
        if (view != null) {
            return view.getRootView();
        }
        return null;
    }

    @Override // X.InterfaceC1102120emo
    public final Map<String, String> getExtras() {
        C1102240en0 c1102240en0 = this.LJ;
        if (c1102240en0 != null) {
            return c1102240en0.LIZIZ;
        }
        return null;
    }

    @Override // X.InterfaceC1102120emo
    public final EnumC245600xC LIZLLL() {
        return C245700xD.LIZ(this);
    }

    @Override // X.InterfaceC1102120emo
    public final int getComponentType() {
        return ((C1113780f5c) LJII()).getComponentType();
    }

    @Override // X.InterfaceC1102120emo
    public final InterfaceC1102150emr LJII() {
        return this.LJFF;
    }

    @Override // X.InterfaceC1102120emo
    public final boolean LJIIIIZZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1102120emo
    public final long LJIIJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1102120emo
    public final String getBusinessName() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1102120emo
    public final String getId() {
        return this.LIZ;
    }

    public C1102230emz(String str, LiveMessagePlatformBubbleConfig liveMessagePlatformBubbleConfig, C1113840f5i c1113840f5i, long j, boolean z, WeakReference<View> weakReference, C1102240en0 c1102240en0) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = z;
        this.LIZLLL = weakReference;
        this.LJ = c1102240en0;
        this.LJFF = new C1113780f5c(liveMessagePlatformBubbleConfig, c1113840f5i);
    }
}
