package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.widget.Widget;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.ies.sdk.widgets.scatter.WidgetLoadScatter;

/* JADX INFO: renamed from: X.0eep, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public interface InterfaceC1097170eep {
    void attachContentView(Widget widget, ViewGroup viewGroup, View view);

    Fragment getFragment();

    LifecycleOwner getRootLifeCycleOwner();

    WidgetLoadScatter getWidgetLoadScatter();

    WidgetManager getWidgetManager();

    boolean isScatterLoadEnable();

    boolean isSubWidget();

    void loadWidget(int i, Widget widget, boolean z);

    void loadWidget(Widget widget);

    void onHide(Widget widget);

    void onPostCreate(Widget widget);

    void onPostDestroy(Widget widget);

    void onPreCreate(Widget widget);

    void onPreDestroy(Widget widget);

    void onShow(Widget widget);

    void removeAllMessages(Object obj);

    void unloadWidget(Widget widget);
}
