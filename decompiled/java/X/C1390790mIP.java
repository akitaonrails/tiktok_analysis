package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mIP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1390790mIP extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL = 2131858434;

    public C1390790mIP() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Activity validTopActivity = ActivityStack.getValidTopActivity();
        if (validTopActivity != null) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(this.LL);
            C1390380mHk.LIZ(validTopActivity, 2028, creativeToastBuilder);
        }
        return Unit.LIZ;
    }
}
