package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

/* JADX INFO: renamed from: X.0rZP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public interface InterfaceC1593530rZP {
    void onActivityFinish();

    boolean onActivityResult(int i, int i2, Intent intent);

    void onAssemLoaded();

    void onBackPress();

    void onBeforeCreate();

    void onConfigurationChanged(Configuration configuration);

    void onCreate(Bundle bundle);

    void onNewIntent(Intent intent);

    void onRecreate();

    void onReleaseInstance(boolean z);

    void onRestoreInstanceState(Bundle bundle);

    void onSaveInstanceState(Bundle bundle);

    void onWindowFocusChanged(boolean z, boolean z2);

    void splashOverShowMandatoryLoginPage();
}
