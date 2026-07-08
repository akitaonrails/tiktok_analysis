package X;

import android.view.SurfaceView;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.0UCw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C768560UCw implements InterfaceC20340914iV {
    public final ViewGroup LIZ;
    public final SurfaceView LIZIZ;
    public C0UD1 LIZJ;
    public AnonymousClass0956 LIZLLL;

    @Override // X.InterfaceC20340914iV
    public final void LIZ() {
        AnonymousClass0956 anonymousClass0956;
        C0UD1 c0ud1 = this.LIZJ;
        if (c0ud1 != null) {
            c0ud1.stop();
            C0UA1.LIZ().LIZ(c0ud1);
        }
        this.LIZJ = null;
        AnonymousClass0956 anonymousClass09562 = this.LIZLLL;
        if (anonymousClass09562 != null && anonymousClass09562.isActive() && (anonymousClass0956 = this.LIZLLL) != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C20441214yg.LJ("LiveEffectPreviewHelper", "stopPreview");
    }

    @Override // X.InterfaceC20340914iV
    public final void LIZLLL() {
        C20441214yg.LIZIZ("LiveEffectPreviewHelper", "selectNoneTryingEffect");
        C0UD1 c0ud1 = this.LIZJ;
        if (c0ud1 != null) {
            c0ud1.LIZ(new String[0], new int[0], "");
        }
    }

    @Override // X.InterfaceC20340914iV
    public final boolean LIZIZ(LiveEffect liveEffect) {
        List<LiveEffect> listLL;
        LiveEffect liveEffect2;
        if (this.LIZJ == null || liveEffect == null) {
            return false;
        }
        if (C767250U7v.LIZLLL(liveEffect) && (listLL = liveEffect.LL()) != null && (liveEffect2 = (LiveEffect) C13LP.LJJJLL(listLL)) != null) {
            liveEffect = liveEffect2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateTryingEffect: ");
        sbLIZ.append(liveEffect.getFilePath());
        C20441214yg.LIZIZ("LiveEffectPreviewHelper", C2188811AlT.LIZIZ(sbLIZ));
        C0UD1 c0ud1 = this.LIZJ;
        if (c0ud1 != null) {
            c0ud1.LIZ(new String[]{liveEffect.getFilePath()}, new int[]{(int) liveEffect.getEffectId()}, liveEffect.getExtra());
        }
        if (this.LIZJ == null) {
            return false;
        }
        return true;
    }

    public C768560UCw(ViewGroup viewGroup, SurfaceView surfaceView) {
        this.LIZ = viewGroup;
        this.LIZIZ = surfaceView;
    }

    public static Pair LJ(int i, int i2) {
        int i3 = 0;
        if (i <= 0) {
            i = 0;
        }
        if (i2 <= 0) {
            i2 = 0;
        }
        if (i != 0 && i2 != 0) {
            i3 = i;
        } else {
            i2 = 0;
        }
        return new Pair(Integer.valueOf(i3), Integer.valueOf(i2));
    }

    @Override // X.InterfaceC20340914iV
    public final void LIZJ(LifecycleOwner lifecycleOwner, LiveEffect liveEffect, AwS575S0100000_31 awS575S0100000_31) {
        AnonymousClass0956 anonymousClass0956LJJJJJ;
        if (this.LIZJ == null) {
            AnonymousClass0956 anonymousClass0956 = this.LIZLLL;
            if (anonymousClass0956 != null && anonymousClass0956.isActive()) {
                return;
            }
            if (lifecycleOwner != null) {
                anonymousClass0956LJJJJJ = C500260Jjc.LJJJJJ(lifecycleOwner, C0PEM.LIZ, new C768550UCv(this, awS575S0100000_31, liveEffect, null, null), 2);
            } else {
                anonymousClass0956LJJJJJ = null;
            }
            this.LIZLLL = anonymousClass0956LJJJJJ;
            return;
        }
        if (!liveEffect.LJJIJIIJI()) {
            LIZIZ(liveEffect);
            C0UD1 c0ud1 = this.LIZJ;
            if (c0ud1 != null) {
                c0ud1.start();
            }
        }
    }
}
