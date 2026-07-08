package X;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.views.RoundingCornerLayout;

/* JADX INFO: renamed from: X.0vas, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1748200vas extends RoundingCornerLayout implements InterfaceC1742850vSF {
    public InterfaceC1742830vSD LLILZ;
    public long LLILZIL;

    @Override // X.InterfaceC1742830vSD
    public final void LJIILLIIL() {
        InterfaceC1742830vSD interfaceC1742830vSD = this.LLILZ;
        if (interfaceC1742830vSD != null) {
            interfaceC1742830vSD.LJIILLIIL();
        }
    }

    @Override // X.InterfaceC1742830vSD
    public final void pause() {
        InterfaceC1742830vSD interfaceC1742830vSD = this.LLILZ;
        if (interfaceC1742830vSD != null) {
            interfaceC1742830vSD.pause();
        }
    }

    public final long getPlayDuration() {
        return SystemClock.elapsedRealtime() - this.LLILZIL;
    }

    @Override // X.InterfaceC1742830vSD
    public final void play() {
        this.LLILZIL = SystemClock.elapsedRealtime();
        InterfaceC1742830vSD interfaceC1742830vSD = this.LLILZ;
        if (interfaceC1742830vSD != null) {
            interfaceC1742830vSD.play();
        }
    }

    public C1748200vas(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setRoundingParams(new C462630ICf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))));
    }
}
