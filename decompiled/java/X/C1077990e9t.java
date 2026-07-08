package X;

import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0e9t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1077990e9t {
    public static final /* synthetic */ int LIZIZ = 0;
    public final RecyclableWidgetManager LIZ;

    public C1077990e9t(RecyclableWidgetManager recyclableWidgetManager) {
        this.LIZ = recyclableWidgetManager;
        new HashSet();
    }

    public final LiveRecyclableWidget LIZ(boolean z, InterfaceC1078000e9u interfaceC1078000e9u, int i, Class cls) {
        if (cls != null) {
            if (C1081990eGL.LIZ(cls.getSimpleName()) && !z) {
                interfaceC1078000e9u.LIZ(new C1078440eAc(this, i, cls));
                return null;
            }
            return this.LIZ.load(i, cls);
        }
        return this.LIZ.load(i, cls);
    }

    public final void LIZIZ(boolean z, InterfaceC1078000e9u interfaceC1078000e9u, int i, Widget widget) {
        if (widget != null) {
            if (C1081990eGL.LIZ(widget.getClass().getSimpleName()) && !z) {
                interfaceC1078000e9u.LIZ(new C1078430eAb(widget, this, i));
                return;
            } else {
                this.LIZ.load(i, widget);
                return;
            }
        }
        this.LIZ.load(i, widget);
    }
}
