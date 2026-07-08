package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.matchv2.connection.twomatch.coordinator.inviter.view.TwoMatchInviterFragmentV2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bbd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C979870bbd extends C2217421BqW implements Function0<Context> {
    public C979870bbd(Object obj) {
        super(0, obj, TwoMatchInviterFragmentV2.class, "getContext", "getContext()Landroid/content/Context;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Context invoke() {
        return ((Fragment) this.receiver).getContext();
    }
}
