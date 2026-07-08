package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.match.ui.fragment.MatchManagementFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bbe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C979880bbe extends C2217421BqW implements Function0<Context> {
    public C979880bbe(Object obj) {
        super(0, obj, MatchManagementFragment.class, "getContext", "getContext()Landroid/content/Context;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Context invoke() {
        return ((Fragment) this.receiver).getContext();
    }
}
