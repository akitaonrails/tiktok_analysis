package X;

import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import java.util.List;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0d4T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public interface InterfaceC1036190d4T {
    boolean LIZ();

    void LIZIZ(WebView webView, C1035880d3y c1035880d3y, boolean z);

    void LIZJ(AwS560S0100000_16 awS560S0100000_16, AwS560S0100000_16 awS560S0100000_162);

    void LIZLLL();

    void LJ();

    void LJFF(MotionEvent motionEvent);

    boolean LJI();

    void LJII(int i, String str, Integer num, String str2, List list);

    void LJIIIIZZ(boolean z);

    void LJIIIZ(int i);

    void LJIIJ();

    void LJIIJJI(int i, boolean z);

    boolean LJIIL(int i);

    void LJIILIIL();

    void LJIILJJIL(WebView webView);

    View getView();

    void onHide();

    void onShow();

    void setOnPullRefreshListener(Runnable runnable);

    void setPullRefreshCssSuppressed(boolean z);

    void setPullRefreshEnabled(boolean z);

    void setPullRefreshPageLoading(boolean z);

    void setRefreshCancelListener(Runnable runnable);
}
