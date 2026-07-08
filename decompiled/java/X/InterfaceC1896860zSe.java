package X;

import android.view.ViewGroup;
import com.bytedance.touchpoint.api.model.Bubble;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0zSe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC1896860zSe {
    void activateWidget(Function1<? super Boolean, Unit> function1);

    void bind(ViewGroup viewGroup);

    void clear();

    Bubble getCurrentBubble();

    String getLandPage();

    int getNormalPendantSubType();

    boolean isBound();

    boolean isClosedByManually();

    boolean isNormalBubbleShouldShow();

    boolean isOverDismissCount(int i, int i2);

    boolean isPendantShowing();

    void monitorShowingDialogCount(boolean z);

    boolean normalPendantIsFold();

    void setCurTab(String str);

    void setPendant(C1894690zP9 c1894690zP9);

    void showAntiFraudBubble(Bubble bubble);

    void showClickTipBubble(String str);

    void showNormalLongBubble(String str, String str2, Bubble bubble);

    void showNormalShapeBubble(Bubble bubble, boolean z, Function0<Unit> function0);

    void showOrHidePendant(boolean z, boolean z2);

    void showReminderBubble(Bubble bubble);

    void showV1Bubble(String str, String str2, Bubble bubble);

    void tryFoldNormalPendant(int i, String str, int i2, boolean z);

    void tryRegisterViewToFeedCleanAbility();
}
