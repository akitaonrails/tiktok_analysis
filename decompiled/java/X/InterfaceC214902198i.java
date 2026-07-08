package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;

/* JADX INFO: renamed from: X.198i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public interface InterfaceC214902198i {
    void LJLLLL();

    void LLLLIILLL(Bundle bundle);

    void Ne(SAFFragmentRootScene sAFFragmentRootScene);

    boolean SL();

    void U1(Bundle bundle);

    InterfaceC214918198y U5();

    boolean W1();

    void YP();

    Boolean dispatchKeyEvent(KeyEvent keyEvent);

    Boolean dispatchTouchEvent(MotionEvent motionEvent);

    C214794194e ej();

    void finish();

    void gv(int i, String[] strArr, int[] iArr);

    SAFFragmentRootScene ib();

    boolean onBackPressed();

    Boolean onKeyDown(int i, KeyEvent keyEvent);

    Boolean onKeyLongPress(int i, KeyEvent keyEvent);

    Boolean onKeyUp(int i, KeyEvent keyEvent);

    void onRelease();

    void onRestoreInstanceState(Bundle bundle);

    boolean onResult(int i, int i2, Intent intent);

    void onWindowFocusChanged(boolean z);

    void pg(Activity activity, Bundle bundle);

    void rm(C19CP c19cp);

    void tM();

    void uB();

    void uG(C19CP c19cp);

    void uk();

    void zB();

    void zd();
}
