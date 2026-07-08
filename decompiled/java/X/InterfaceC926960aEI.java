package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;

/* JADX INFO: renamed from: X.0aEI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public interface InterfaceC926960aEI extends InterfaceC941720ac6 {
    void LIZIZ(InterfaceC941870acL interfaceC941870acL);

    void LJ(LifecycleOwner lifecycleOwner);

    void LJFF(RecyclableWidgetManager recyclableWidgetManager);

    void LJII();

    void LJIIIIZZ(InterfaceC941870acL interfaceC941870acL);

    void LJIIIZ(RecyclableWidgetManager recyclableWidgetManager);

    void LJIILL(String str, InterfaceC941870acL interfaceC941870acL);

    boolean LJIJI(String str);

    void LJIJJLI(SeiAppData seiAppData);

    void onCreate();

    void onDestroy();
}
