package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.subscription.preview.PreviewRangeSelectorFragment;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10FY, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C10FY implements Observer, InterfaceC1635506an {
    public final /* synthetic */ PreviewRangeSelectorFragment LL;

    public C10FY(PreviewRangeSelectorFragment previewRangeSelectorFragment) {
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
        return new C2217421BqW(1, this.LL, PreviewRangeSelectorFragment.class, "launchPreviewEndTime", "launchPreviewEndTime(F)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        long jIntValue;
        Integer numLIZLLL;
        float fFloatValue = ((Number) obj).floatValue();
        PreviewRangeSelectorFragment previewRangeSelectorFragment = this.LL;
        previewRangeSelectorFragment.getClass();
        Long lValueOf = Long.valueOf(C10FS.LIZJ(10.0f));
        C10FX c10fx = previewRangeSelectorFragment.LLJILLL;
        if (c10fx != null && (numLIZLLL = c10fx.LIZLLL()) != null) {
            jIntValue = numLIZLLL.intValue();
        } else {
            jIntValue = 0;
        }
        previewRangeSelectorFragment.MR(previewRangeSelectorFragment.getString(2131830333), fFloatValue, new Pair<>(lValueOf, Long.valueOf(jIntValue)), EnumC19214810Fe.END_TIME);
    }
}
