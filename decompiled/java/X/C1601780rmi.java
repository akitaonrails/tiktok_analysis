package X;

import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.feed.assem.mainactivityobserver.CommonFeedActivityAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rmi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1601780rmi extends C09AY implements Function0<Unit> {
    public final /* synthetic */ CommonFeedActivityAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1601780rmi(CommonFeedActivityAssem commonFeedActivityAssem) {
        super(0);
        this.LL = commonFeedActivityAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Boolean boolValueOf;
        Activity activity = (Activity) this.LL.LL.getValue();
        if (activity == null) {
            boolValueOf = null;
        } else {
            Intent intent = activity.getIntent();
            boolValueOf = Boolean.valueOf(activity.isTaskRoot() && intent != null && intent.hasCategory("android.intent.category.LAUNCHER") && Intrinsics.LJFF("android.intent.action.MAIN", intent.getAction()));
        }
        if (!Intrinsics.LJFF(boolValueOf, Boolean.FALSE)) {
            C20237514Gn.LIZIZ.LIZIZ();
        }
        C582720MtK.LIZ = true;
        return Unit.LIZ;
    }
}
