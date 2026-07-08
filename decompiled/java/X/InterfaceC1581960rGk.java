package X;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: X.0rGk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public interface InterfaceC1581960rGk {
    void onAttach(Activity activity, Fragment fragment);

    void onConfigurationChanged(Configuration configuration);

    void onCreate(Bundle bundle);

    void onDestroy();

    void onDestroyView();

    void onDetach();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);

    void onStart();

    void onStop();

    void onViewCreated(View view, Bundle bundle);

    void onViewStateRestored(Bundle bundle);
}
