package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;

/* JADX INFO: renamed from: X.1ER0, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public interface C1ER0 {
    Context LIZJ(Context context);

    void LIZLLL();

    void LJ();

    void LJFF();

    void LJI();

    void LJII();

    void LJIIIIZZ();

    void LJIIIZ();

    void LJIIJJI();

    void LJIIL();

    void LJIILIIL();

    void LJIJI();

    void LJJ();

    void LJJI();

    void LJJIFFI(Activity activity);

    void LJJII(Activity activity, int i, String[] strArr, int[] iArr);

    void finish();

    void onActivityPostDestroyed(Activity activity);

    void onActivityPostPaused(Activity activity);

    void onActivityPostResumed(Activity activity);

    void onActivityResult(int i, int i2, Intent intent);

    void onBackPressed();

    void onConfigurationChanged(Activity activity, Configuration configuration);

    void onContentChanged();
}
