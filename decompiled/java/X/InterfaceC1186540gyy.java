package X;

import android.content.Context;
import com.bytedance.router.RouteIntent;
import java.util.List;

/* JADX INFO: renamed from: X.0gyy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public interface InterfaceC1186540gyy {
    void doPreload(Context context, RouteIntent routeIntent);

    List<C1202730hP5> getImagePreloadConfig(Context context, RouteIntent routeIntent);

    List<Class<? extends InterfaceC20153313tL>> getNetPreloadConfig(Context context, RouteIntent routeIntent);

    List<C1181330gqZ> getXmlPreloadConfig(Context context, RouteIntent routeIntent);

    boolean isEnabled();

    List<String> supportedUri();
}
