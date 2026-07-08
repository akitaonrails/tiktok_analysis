package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.commercialize.model.IABBottomBarElement;
import com.ss.android.ugc.aweme.feed.model.CommerceAgentHint;
import java.util.List;

/* JADX INFO: renamed from: X.0d4V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public interface InterfaceC1036210d4V {
    void LIZ();

    void LIZIZ(int i, int i2, int i3, int i4);

    void LIZJ(View view, IABBottomBarElement iABBottomBarElement);

    void LIZLLL(MotionEvent motionEvent);

    void LJ();

    void LJFF(boolean z);

    void LJI(List<CommerceAgentHint> list);

    void LJII(boolean z);

    void LJIIIIZZ(SparkContext sparkContext, C1016930cZP c1016930cZP, String str, Runnable runnable);

    void LJIIIZ(boolean z);

    void LJIIJ();

    void LJIIJJI(boolean z);

    void LJIIL();

    void LJIILIIL();

    boolean getAnimatorIsRunning();

    View getCheckoutComponent();

    ViewGroup getView();

    void setListener(InterfaceC1036080d4I interfaceC1036080d4I);
}
