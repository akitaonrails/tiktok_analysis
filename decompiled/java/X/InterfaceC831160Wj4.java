package X;

import android.content.Intent;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Set;

/* JADX INFO: renamed from: X.0Wj4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public interface InterfaceC831160Wj4 {
    void connect(InterfaceC832240Wko interfaceC832240Wko);

    void disconnect();

    void disconnect(String str);

    void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    Feature[] getAvailableFeatures();

    String getEndpointPackageName();

    String getLastDisconnectMessage();

    int getMinApkVersion();

    void getRemoteService(InterfaceC828880WfO interfaceC828880WfO, Set<Scope> set);

    Set<Scope> getScopesForConnectionlessNonSignIn();

    Intent getSignInIntent();

    boolean isConnected();

    boolean isConnecting();

    void onUserSignOut(InterfaceC829570WgV interfaceC829570WgV);

    boolean providesSignIn();

    boolean requiresGooglePlayServices();

    boolean requiresSignIn();
}
