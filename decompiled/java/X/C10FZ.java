package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.subscription.preview.PreviewRangeSelectorFragment;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10FZ, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C10FZ implements Observer, InterfaceC1635506an {
    public final /* synthetic */ PreviewRangeSelectorFragment LL;

    public C10FZ(PreviewRangeSelectorFragment previewRangeSelectorFragment) {
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
        return new C2217421BqW(1, this.LL, PreviewRangeSelectorFragment.class, "launchPreviewStartTime", "launchPreviewStartTime(F)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Integer numLIZLLL;
        float fFloatValue = ((Number) obj).floatValue();
        PreviewRangeSelectorFragment previewRangeSelectorFragment = this.LL;
        previewRangeSelectorFragment.getClass();
        long jIntValue = 0;
        C10FX c10fx = previewRangeSelectorFragment.LLJILLL;
        if (c10fx != null && (numLIZLLL = c10fx.LIZLLL()) != null) {
            jIntValue = numLIZLLL.intValue();
        }
        previewRangeSelectorFragment.MR(previewRangeSelectorFragment.getString(2131830340), fFloatValue, new Pair<>(0L, Long.valueOf(jIntValue)), EnumC19214810Fe.START_TIME);
    }
}
