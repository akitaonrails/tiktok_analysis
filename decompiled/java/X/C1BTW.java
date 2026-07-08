package X;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.maps.GoogleMapOptions;

/* JADX INFO: renamed from: X.1BTW, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public interface C1BTW extends IInterface {
    void LJJIII(InterfaceC2205151BSf interfaceC2205151BSf);

    InterfaceC820590WGz LJJLIIIJILLIZJL(C0WH6 c0wh6, C0WH6 c0wh62, Bundle bundle);

    void LLJILLL(C0WH6 c0wh6, GoogleMapOptions googleMapOptions, Bundle bundle);

    void onCreate(Bundle bundle);

    void onDestroy();

    void onDestroyView();

    void onLowMemory();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);

    void onStart();

    void onStop();
}
