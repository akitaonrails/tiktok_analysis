package X;

import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.198d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public interface InterfaceC214897198d extends InterfaceC20622815ms {
    void beforeNavigating(Scene scene, Scene scene2);

    void finishLastPage();

    InterfaceC214902198i getDynamicParentRootFragment();

    C214932199m getDynamicParentScene();

    boolean getEnableSAF();

    boolean getUseRootFragmentForPageCallbacks();

    boolean isDelegateFragmentManager();

    boolean migrateDarkModeImplToFragment();

    boolean migrateImmersiveBarImplToFragment();

    AnonymousClass1950 provideSAFActivityCallBack();

    void setDynamicParentScene(C214932199m c214932199m);
}
