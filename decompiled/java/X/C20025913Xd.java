package X;

import android.app.slice.Slice;
import android.app.slice.SliceSpec;
import android.credentials.CreateCredentialException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.service.credentials.BeginCreateCredentialResponse;
import java.util.Collections;

/* JADX INFO: renamed from: X.13Xd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20025913Xd implements OutcomeReceiver<C1867410yh9, AbstractC20027413Xs> {
    @Override // android.os.OutcomeReceiver
    public final void onError(Throwable th) {
        AbstractC20027413Xs abstractC20027413Xs = (AbstractC20027413Xs) th;
        new CreateCredentialException(abstractC20027413Xs.getType(), abstractC20027413Xs.getMessage());
        throw null;
    }

    @Override // android.os.OutcomeReceiver
    public final void onResult(C1867410yh9 c1867410yh9) {
        BeginCreateCredentialResponse.Builder builder = new BeginCreateCredentialResponse.Builder();
        for (C2280681EOs c2280681EOs : c1867410yh9.LIZ) {
            if (Build.VERSION.SDK_INT >= 28) {
                c2280681EOs.getClass();
                new Slice.Builder(Uri.EMPTY, new SliceSpec("CreateEntry", 1)).addText(null, null, Collections.singletonList("androidx.credentials.provider.createEntry.SLICE_HINT_USER_PROVIDER_ACCOUNT_NAME"));
                new Bundle();
                throw null;
            }
        }
        builder.build();
        throw null;
    }
}
