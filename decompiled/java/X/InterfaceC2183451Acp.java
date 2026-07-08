package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Acp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public interface InterfaceC2183451Acp {
    boolean J8();

    int Je();

    Long LIZ();

    long LIZIZ();

    int LIZJ();

    boolean LIZLLL();

    boolean LJ();

    boolean LJFF();

    int LJII();

    void LJIIIIZZ(String str, String str2);

    boolean LJIIIZ();

    long LJIIJ();

    long LJIIJJI();

    boolean LJIIL();

    void LJIILJJIL(Context context);

    void LJIILL(long j, long j2, Integer num);

    long LJIILLIIL();

    SlimRoom.LinkMic LJIIZILJ(String str);

    void LJIJ(Context context, long j, LifecycleOwner lifecycleOwner, C5183020f c5183020f, Function0 function0);

    long LJIJI(long j);

    boolean LJIJJ();

    void LJIJJLI();

    boolean LJIL();

    Map<String, String> LJJ(Long l);

    boolean LJJI(int i, Long l, Long l2, boolean z);

    void LJJIFFI(String str, boolean z);

    List<String> LLZZJLIL();

    void LLZZLLIL(int i, List<Long> list);

    boolean Vs(String str);

    void g1(List list);

    boolean getLiveEventShieldConfirmValue();

    void i3(long j, Function0 function0, Function1 function1);

    void inviteLiveEventUser(Context context, long j, List<Long> list, LifecycleOwner lifecycleOwner, Function0<Unit> function0, Function0<Unit> function02);

    void kn(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7);

    void mj(int i, String str, String str2, String str3, String str4, String str5, String str6);

    boolean o1();

    void reportLinkMicRelatedEvent(String str, Map<String, String> map);

    void rh(int i, String str, String str2, String str3);

    void setLiveEventShieldConfirmValue(boolean z);
}
