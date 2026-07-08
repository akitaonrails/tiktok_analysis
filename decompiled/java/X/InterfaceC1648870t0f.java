package X;

import android.view.View;
import com.bytedance.als.LiveEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0t0f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public interface InterfaceC1648870t0f extends C05YF {
    void dismissLivePopupEvent();

    void dismissSuperEntranceEvent();

    void dismissUploadPopEntranceEvent();

    C385670FAf<Boolean> getAlbumPageVisibilityState();

    C385670FAf<Integer> getEffectContainerVisibility();

    LiveEvent<Unit> getNoBlockTouchEvent();

    void manualClickUploadButton(boolean z);

    void setEffectContainerVisibility(int i);

    void setNeedNoTouchListener(boolean z);

    void setUploadStartAction(Function1<? super View, Unit> function1);

    void setUploadVisibility(int i);

    void showDockBar(boolean z);
}
