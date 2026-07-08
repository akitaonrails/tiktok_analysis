package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment;

/* JADX INFO: renamed from: X.0gTx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1167310gTx {
    public static AddMultiVideoFragment LIZ(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("key_is_from_live_replay", z);
        AddMultiVideoFragment addMultiVideoFragment = new AddMultiVideoFragment();
        addMultiVideoFragment.setArguments(bundle);
        return addMultiVideoFragment;
    }
}
