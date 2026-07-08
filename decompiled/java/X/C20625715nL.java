package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15nL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20625715nL extends C09AY implements Function0<Activity> {
    public C20625715nL() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Activity invoke() {
        return ActivityStack.getTopActivity();
    }
}
