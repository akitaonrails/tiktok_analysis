package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.slash.data.EventModel;
import com.ss.android.ugc.aweme.slash.data.PageInfo;
import com.ss.android.ugc.aweme.slash.data.SlashEvent;
import com.ss.android.ugc.aweme.slash.data.SlashParam;
import com.ss.android.ugc.aweme.slash.data.SlashRequestParam;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gq3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public interface InterfaceC1181010gq3 extends LifecycleOwner {
    Map<String, Object> BO1();

    C1174000gek Br();

    C1181550gqv Er2();

    C1180920gpu Gd0(String str);

    Map<String, EventModel> Hm(String str);

    void K40(String str, int i);

    InterfaceC1181050gq7 KR1();

    int LLLZL();

    int Lg();

    ViewOnAttachStateChangeListenerC20604515jv Lt();

    void OB1(Function0<SlashRequestParam> function0);

    C1181930grX Pu2();

    InterfaceC1187750h0v Qz();

    Fragment S8();

    <T> void Ts(String str, LifecycleOwner lifecycleOwner, Observer<T> observer);

    void Wd2(InterfaceC1174100geu interfaceC1174100geu);

    void Xr2(String str, Map<String, String> map, InterfaceC1173990gej<?> interfaceC1173990gej);

    PageInfo YW();

    C11NZ<C1180620gpQ> aQ(SlashRequestParam slashRequestParam);

    void as(String str);

    boolean b30(String str);

    boolean b60();

    void ex2(SlashRequestParam slashRequestParam, String str, List<SlashParam> list, InterfaceC1181150gqH interfaceC1181150gqH, C1181120gqE c1181120gqE);

    int hi(String str);

    void iY0(RecyclerView recyclerView);

    boolean isLoading();

    List<SlashEvent> l00(String str);

    C1186840gzS lw1();

    InterfaceC1179090gmx pZ();

    List<InterfaceC1174130gex> qN();

    <CONTEXT> C1173300gdc<CONTEXT> qr0();

    void qv(String str, LifecycleOwner lifecycleOwner, Observer<C1180920gpu> observer);

    <T> T qw(String str);

    void refresh();

    void remove(String str);

    void retry();

    void ro1(int i);

    <T> void sB1(C1180090goZ c1180090goZ, LifecycleOwner lifecycleOwner, Observer<T> observer);

    <T> T ta2(C1180090goZ c1180090goZ);

    boolean uK(String str);

    Map<String, String> vt();

    void wD1(Function0<? extends InterfaceC1181300gqW> function0, SlashRequestParam slashRequestParam, String str, List<SlashParam> list, InterfaceC1181150gqH interfaceC1181150gqH, C1181120gqE c1181120gqE);

    InterfaceC1187100gzs z92();
}
