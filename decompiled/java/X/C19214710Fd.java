package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.subscription.preview.PreviewRangeSelectorFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10Fd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C19214710Fd implements Observer, InterfaceC1635506an {
    public final /* synthetic */ PreviewRangeSelectorFragment LL;

    public C19214710Fd(PreviewRangeSelectorFragment previewRangeSelectorFragment) {
        this.LL = previewRangeSelectorFragment;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof InterfaceC1635506an)) {
            return Intrinsics.LJFF(getFunctionDelegate(), ((InterfaceC1635506an) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC1635506an
    public final InterfaceC1451105m9<?> getFunctionDelegate() {
        return new C2217421BqW(1, this.LL, PreviewRangeSelectorFragment.class, "seekTo", "seekTo(F)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        C10FX c10fx = this.LL.LLJILLL;
        if (c10fx != null) {
            c10fx.LJFF(fFloatValue);
        }
    }
}
