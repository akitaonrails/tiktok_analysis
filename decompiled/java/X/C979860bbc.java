package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.competition.launcher.CompetitionModeChooseFragmentV2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bbc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C979860bbc extends C2217421BqW implements Function0<Context> {
    public C979860bbc(Object obj) {
        super(0, obj, CompetitionModeChooseFragmentV2.class, "getContext", "getContext()Landroid/content/Context;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Context invoke() {
        return ((Fragment) this.receiver).getContext();
    }
}
