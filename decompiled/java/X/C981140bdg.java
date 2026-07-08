package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bdg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C981140bdg extends C2217421BqW implements Function0<Context> {
    public C981140bdg(Object obj) {
        super(0, obj, Fragment.class, "getContext", "getContext()Landroid/content/Context;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Context invoke() {
        return ((Fragment) this.receiver).getContext();
    }
}
