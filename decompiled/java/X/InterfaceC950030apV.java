package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.VirtualWaitingUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0apV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public interface InterfaceC950030apV extends InterfaceC948650anH {
    boolean L6();

    void LIZIZ(C945320ahu c945320ahu);

    boolean LIZLLL();

    void LJI();

    List<String> LJIILJJIL();

    void LJIILLIIL(String str, C1AYC c1ayc);

    void LJIJ();

    EnumC919170a1j LJIJI();

    List<C954460awe> LJIJJ();

    boolean LJIL();

    boolean LJJIII();

    List<C936770aU7> LJJIIJZLJL();

    void LJJIIZ(String str, boolean z);

    void LJJIJIIJI(String str, boolean z);

    List<VirtualWaitingUser> LJJIJIL();

    List<C936770aU7> LJJJJI(long j);

    void LJJJJLL(Map<Long, GiftGalleryBadgeInfo> map);

    List<C954460awe> LJJLI();

    boolean LJJLIIIJJI();

    <T> void LJJLIIIJL(Class<T> cls, Function2<? super InterfaceC954180awC, ? super C917110ZyP<T>, Unit> function2);

    int LJJLJ();

    void LJJZ(String str);

    String LJLJJL();

    @InterfaceC1294060jmO
    ConcurrentHashMap<Long, C914570ZuJ> LJLLI();

    void LJLLJ();

    void LJLZ(InterfaceC950010apT<C920590a41> interfaceC950010apT);

    C954460awe LJZ(String str);

    void LJZL(EnumC950120ape enumC950120ape, boolean z);

    void LLFF();

    boolean LLFFF();

    void LLFII();

    EnumC950120ape LLI();

    void LLIFFJFJJ(Context context, Room room, DataChannel dataChannel);

    void LLILIL();

    C954460awe LLILL(long j);

    long LLILLL(String str);

    boolean LLILZ(long j);

    List<C954460awe> LLILZLL(boolean z);

    boolean LLJ();

    boolean LLJILLL();

    void LLJJI(ViewGroup viewGroup, FrameLayout frameLayout, LifecycleOwner lifecycleOwner, boolean z, C952540atY c952540atY);

    long LLJJIII(long j);

    boolean LLJJIJI();

    boolean LLJJIJIL();

    void LLJL(Runnable runnable);

    void LLJLIL(String str, boolean z);

    InterfaceC945140ahc LLJZIJLIL();

    boolean LLLFZ(long j);

    C954460awe LLLI(long j, boolean z);

    C954460awe LLLILZLLLI(String str);

    boolean LLLIZZ();

    <T> void LLLJIL(Class<T> cls, Function2<? super InterfaceC954180awC, ? super C917110ZyP<T>, Unit> function2);

    EnumC950510aqH LLLLII(long j);

    long LLLLIL(long j);

    C936770aU7 LLLLILI(String str);

    void R5();

    void S0(String str);

    boolean T9();

    int Uh();

    long ff();

    long getChannelId();

    long getInnerChannelId();

    long js();

    C0JG7 yq(User user);
}
