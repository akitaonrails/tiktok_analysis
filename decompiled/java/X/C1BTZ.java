package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.1BTZ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public interface C1BTZ {
    void LIZ(Activity activity, Bundle bundle, Bundle bundle2);

    void onCreate(Bundle bundle);

    View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    void onDestroy();

    void onDestroyView();

    void onLowMemory();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);

    void onStart();

    void onStop();
}
