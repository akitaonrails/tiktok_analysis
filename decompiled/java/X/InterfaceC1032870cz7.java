package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* JADX INFO: renamed from: X.0cz7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public interface InterfaceC1032870cz7 {
    void LLZLLLL(boolean z);

    InterfaceC1032610cyh O1();

    InterfaceC1032630cyj Xf();

    void addOverlayViewIfNeed(String str, boolean z);

    ViewGroup getBottomInteractView();

    Map<String, Object> getCarouselAdExtraParams();

    View getInteractContainerView(String str);

    long getVideoDuration();

    long getVideoPosition();

    boolean j8(AbstractC1016110cY5 abstractC1016110cY5);

    void onHandleTapFinished(String str);

    void pause(String str);

    void resume();
}
