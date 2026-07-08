package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.widget.Widget;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.ies.sdk.widgets.scatter.WidgetLoadScatter;

/* JADX INFO: renamed from: X.0eeo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1097160eeo implements InterfaceC1097170eep {
    public final InterfaceC1097170eep callback;

    @Override // X.InterfaceC1097170eep
    public /* synthetic */ boolean isSubWidget() {
        return false;
    }

    @Override // X.InterfaceC1097170eep
    public Fragment getFragment() {
        return this.callback.getFragment();
    }

    @Override // X.InterfaceC1097170eep
    public LifecycleOwner getRootLifeCycleOwner() {
        return this.callback.getRootLifeCycleOwner() == null ? this.callback.getFragment() : this.callback.getRootLifeCycleOwner();
    }

    @Override // X.InterfaceC1097170eep
    public WidgetLoadScatter getWidgetLoadScatter() {
        return this.callback.getWidgetLoadScatter();
    }

    @Override // X.InterfaceC1097170eep
    public WidgetManager getWidgetManager() {
        return this.callback.getWidgetManager();
    }

    @Override // X.InterfaceC1097170eep
    public boolean isScatterLoadEnable() {
        return this.callback.isScatterLoadEnable();
    }

    public C1097160eeo(InterfaceC1097170eep interfaceC1097170eep) {
        this.callback = interfaceC1097170eep;
    }

    @Override // X.InterfaceC1097170eep
    public void loadWidget(Widget widget) {
        this.callback.loadWidget(widget);
    }

    @Override // X.InterfaceC1097170eep
    public void onHide(Widget widget) {
        this.callback.onHide(widget);
    }

    @Override // X.InterfaceC1097170eep
    public void onPostCreate(Widget widget) {
        this.callback.onPostCreate(widget);
    }

    @Override // X.InterfaceC1097170eep
    public void onPostDestroy(Widget widget) {
        this.callback.onPostDestroy(widget);
    }

    @Override // X.InterfaceC1097170eep
    public void onPreCreate(Widget widget) {
        this.callback.onPreCreate(widget);
    }

    @Override // X.InterfaceC1097170eep
    public void onPreDestroy(Widget widget) {
        this.callback.onPreDestroy(widget);
    }

    @Override // X.InterfaceC1097170eep
    public void onShow(Widget widget) {
        this.callback.onShow(widget);
    }

    @Override // X.InterfaceC1097170eep
    public void removeAllMessages(Object obj) {
        this.callback.removeAllMessages(obj);
    }

    @Override // X.InterfaceC1097170eep
    public void unloadWidget(Widget widget) {
        this.callback.unloadWidget(widget);
    }

    @Override // X.InterfaceC1097170eep
    public void attachContentView(Widget widget, ViewGroup viewGroup, View view) {
        this.callback.attachContentView(widget, viewGroup, view);
    }

    @Override // X.InterfaceC1097170eep
    public void loadWidget(int i, Widget widget, boolean z) {
        this.callback.loadWidget(i, widget, z);
    }
}
