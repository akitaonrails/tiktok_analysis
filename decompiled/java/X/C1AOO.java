package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.1AOO, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public interface C1AOO {
    Set<Integer> getActivateEvents();

    View getFirstAddedViewForGroup(ViewGroup viewGroup);

    View getLastAddedViewForGroup(ViewGroup viewGroup);

    boolean handleVideoEvent(C1AOU c1aou);

    boolean hasUI();

    boolean isActivated();

    boolean isShowing();

    void onActivate(List<Integer> list, InterfaceC1471800oP4 interfaceC1471800oP4);

    void setActivated(boolean z);
}
