package X;

import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.fragment.SubSpaceDetailFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JU1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JU1 extends C09AY implements Function0<DataChannel> {
    public final /* synthetic */ SubSpaceDetailFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JU1(SubSpaceDetailFragment subSpaceDetailFragment) {
        super(0);
        this.LL = subSpaceDetailFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final DataChannel invoke() {
        return C0IJR.LIZ(ViewModelProviders.of(this.LL), this.LL);
    }
}
