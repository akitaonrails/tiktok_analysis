package X;

import android.app.Activity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lse, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1374820lse extends C09AY implements Function1<String, String> {
    public final /* synthetic */ Activity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1374820lse(Activity activity) {
        super(1);
        this.LL = activity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(String str) {
        Activity activity;
        if (Intrinsics.LJFF(str, "more") && (activity = this.LL) != null) {
            return activity.getString(2131835641);
        }
        return null;
    }
}
