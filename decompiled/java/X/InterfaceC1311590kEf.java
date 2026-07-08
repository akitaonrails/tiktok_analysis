package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0kEf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public interface InterfaceC1311590kEf {
    boolean canConsumeGesture(float f, float f2);

    int getGestureArenaMemberId();

    Map<Integer, C1311420kEO> getGestureDetectorMap();

    Map<Integer, AbstractC1311530kEZ> getGestureHandlers();

    int getMemberScrollX();

    int getMemberScrollY();

    int getScrollContainerDirection();

    int getSign();

    boolean isAtBorder(boolean z);

    void onGestureScrollBy(float f, float f2);

    void onInvalidate();

    void onPlatformGestureStatusChanged(int i);
}
