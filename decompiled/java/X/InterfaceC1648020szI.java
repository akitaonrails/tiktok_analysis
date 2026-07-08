package X;

import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: X.0szI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public interface InterfaceC1648020szI extends InterfaceC1647930sz9 {
    void addLiveBottomTab(int i, InterfaceC1653190t7d interfaceC1653190t7d, int i2);

    int bottomTabSize();

    void clearAIBrandTextByTag(String str);

    void configSwitchDuration(C1648150szV c1648150szV);

    String defaultBottomTab();

    C1653090t7T findBottomTabByTag(String str);

    C1653330t7r getCurrentBottomTabItem();

    C1653330t7r getCurrentBottomTabItemBeforeOnTabChanged();

    List<C1653090t7T> getExistingTabs();

    View getHostViewByIndex(int i);

    int getIndexByTag(String str);

    List<String> getPrevTabTags();

    C1653370t7v getTooltipCoordinator();

    void hidePopupForLiveTab();

    boolean isBottomTabThemeDarkMode();

    boolean isValid();

    void notifyBottomTabIndexChange(C1647390syH c1647390syH);

    void resetToCurTab(String str);

    void selectDefaultSubTab();

    void setBottomTabEndMargin(int i);

    void setBottomTabStartMargin(int i);

    void setBottomTabWidgetGestureListener(InterfaceC1653650t8N interfaceC1653650t8N);

    void setCurrentTab(String str, boolean z, int i, boolean z2);

    void setTabSwitchEnabled(boolean z);

    void showAIBrandTextByTag(String str, C1655280tB0 c1655280tB0);

    void showAllTabsAndExitDuetMode();

    void showBottomTab(boolean z);

    void showComplexTab(int i, C1647390syH c1647390syH);

    void showComplexTab(boolean z);

    void switchDarkLightThemeMode(boolean z);

    void switchToPreviousTab();

    void tryShowPopupForLiveTab();

    void updateBottomDotRes(int i);

    void updateDotVisibility(boolean z);
}
