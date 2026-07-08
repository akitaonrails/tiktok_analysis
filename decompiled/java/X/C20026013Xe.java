package X;

import android.app.slice.Slice;
import android.app.slice.SliceSpec;
import android.credentials.GetCredentialException;
import android.net.Uri;
import android.os.Build;
import android.os.OutcomeReceiver;
import android.service.credentials.Action;
import android.service.credentials.BeginGetCredentialResponse;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: X.13Xe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20026013Xe implements OutcomeReceiver<C20026113Xf, AbstractC20027713Xv> {
    @Override // android.os.OutcomeReceiver
    public final void onError(Throwable th) {
        AbstractC20027713Xv abstractC20027713Xv = (AbstractC20027713Xv) th;
        new GetCredentialException(abstractC20027713Xv.getType(), abstractC20027713Xv.getMessage());
        throw null;
    }

    @Override // android.os.OutcomeReceiver
    public final void onResult(C20026113Xf c20026113Xf) {
        C20026113Xf c20026113Xf2 = c20026113Xf;
        BeginGetCredentialResponse.Builder builder = new BeginGetCredentialResponse.Builder();
        for (AbstractC20026913Xn abstractC20026913Xn : c20026113Xf2.LIZ) {
            if (abstractC20026913Xn instanceof C20026713Xl) {
                if (Build.VERSION.SDK_INT >= 28) {
                    abstractC20026913Xn.getClass();
                    new Slice.Builder(Uri.EMPTY, new SliceSpec(null, 1)).addText(null, null, Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME")).addText(null, null, Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_USER_NAME")).addText(null, null, Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_CREDENTIAL_TYPE_DISPLAY_NAME")).addText("false", null, Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_ALLOWED"));
                    throw null;
                }
            } else if (abstractC20026913Xn instanceof C20027113Xp) {
                if (Build.VERSION.SDK_INT >= 28) {
                    abstractC20026913Xn.getClass();
                    new Slice.Builder(Uri.EMPTY, new SliceSpec(null, 1)).addText(null, null, Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME")).addText(null, null, Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_USER_NAME")).addText(null, null, Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_CREDENTIAL_TYPE_DISPLAY_NAME")).addText("false", null, Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_ALLOWED"));
                    throw null;
                }
            } else if ((abstractC20026913Xn instanceof C20026413Xi) && Build.VERSION.SDK_INT >= 28) {
                abstractC20026913Xn.getClass();
                new Slice.Builder(Uri.EMPTY, new SliceSpec(null, 1)).addText(null, null, Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME")).addText(null, null, Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_USER_NAME")).addText(null, null, Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_CREDENTIAL_TYPE_DISPLAY_NAME")).addText("false", null, Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_ALLOWED"));
                throw null;
            }
        }
        Iterator<C2278121EEw> it2 = c20026113Xf2.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().getClass();
            Slice.Builder builderAddText = new Slice.Builder(Uri.EMPTY, new SliceSpec("Action", 0)).addText(null, null, Collections.singletonList("androidx.credentials.provider.action.HINT_ACTION_TITLE")).addText(null, null, Collections.singletonList("androidx.credentials.provider.action.HINT_ACTION_SUBTEXT"));
            builderAddText.addAction(null, new Slice.Builder(builderAddText).addHints(Collections.singletonList("androidx.credentials.provider.action.SLICE_HINT_PENDING_INTENT")).build(), null);
            builder.addAction(new Action(builderAddText.build()));
        }
        Iterator<C2278141EEy> it3 = c20026113Xf2.LIZJ.iterator();
        while (it3.hasNext()) {
            it3.next().getClass();
            Slice.Builder builder2 = new Slice.Builder(Uri.EMPTY, new SliceSpec("AuthenticationAction", 0));
            builder2.addAction(null, new Slice.Builder(builder2).addHints(Collections.singletonList("androidx.credentials.provider.authenticationAction.SLICE_HINT_PENDING_INTENT")).build(), null).addText(null, null, Collections.singletonList("androidx.credentials.provider.authenticationAction.SLICE_HINT_TITLE"));
            builder.addAuthenticationAction(new Action(builder2.build()));
        }
        builder.build();
        throw null;
    }
}
