package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.List;
import java.util.Map;
import webcast.api.feed.LiveTab;

/* JADX INFO: renamed from: X.0Irf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC479770Irf {
    <T> void E2(EnterRoomConfig enterRoomConfig, InterfaceC479830Irl<T> interfaceC479830Irl, C19EH c19eh);

    void F2(boolean z);

    int G2(int i);

    String H2(int i);

    void I2(C21546719Ub c21546719Ub);

    void J2(int i);

    void K2(EnterRoomConfig enterRoomConfig, C19EH c19eh);

    List<LiveTab> L2();

    int LIZ(EnterRoomConfig enterRoomConfig);

    boolean M2();

    Map<String, String> Z();

    Fragment getCurrentFragment();

    int getLayoutId();

    void onDestroy();

    Float rs();
}
