package X;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;

/* JADX INFO: renamed from: X.19Ec, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21505219Ec extends AnonymousClass1433<IntentSenderRequest, ActivityResult> {
    @Override // X.AnonymousClass1433
    public final Intent LIZ(ComponentActivity componentActivity, Object obj) {
        return new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", (IntentSenderRequest) obj);
    }

    @Override // X.AnonymousClass1433
    public final ActivityResult LIZJ(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}
