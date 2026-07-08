package X;

import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0kEN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public interface InterfaceC1311410kEN extends InterfaceC1326530kcl {
    boolean blockNativeEvent(MotionEvent motionEvent);

    boolean consumeSlideEvent(float f);

    boolean dispatchEvent(C1299240juk c1299240juk);

    boolean dispatchTouch(MotionEvent motionEvent);

    boolean enableTouchPseudoPropagation();

    boolean eventThrough(float f, float f2);

    HashMap<String, InterfaceC1311410kEN> getChildrenLynxPageUI();

    Map<String, C1299120juY> getEvents();

    int getGestureArenaMemberId();

    InterfaceC1311410kEN getParentLynxPageUI();

    int getPseudoStatus();

    InterfaceC1311410kEN getRootLynxPageUI();

    int getSign();

    boolean hasConsumeSlideEventAngles();

    boolean ignoreFocus();

    boolean isFocusable();

    void offResponseChain();

    void onEventBubble(boolean z, long j);

    void onEventCapture(boolean z, long j);

    void onEventFire(boolean z, long j);

    void onFocusChanged(boolean z, boolean z2);

    void onPseudoStatusChanged(int i, int i2);

    void onResponseChain();

    EnumC1311610kEh panInterceptDirection();

    EnumC1314040kIc panInterceptScope();

    InterfaceC1311410kEN parent();

    EnumC1311640kEk pointerEvents();

    void setEventID(long j);

    void setPanInterceptAncestors(boolean z);

    void setPanInterceptDescendants(boolean z);

    void setPanInterceptSelf(boolean z);

    void startEventBubble(long j);

    void startEventCapture(long j);

    void startEventFire(boolean z, long j);
}
