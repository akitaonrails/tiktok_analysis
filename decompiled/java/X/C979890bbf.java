package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.match.ui.fragment.MatchPlaybookFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bbf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C979890bbf extends C2217421BqW implements Function0<Context> {
    public C979890bbf(Object obj) {
        super(0, obj, MatchPlaybookFragment.class, "getContext", "getContext()Landroid/content/Context;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Context invoke() {
        return ((Fragment) this.receiver).getContext();
    }
}
