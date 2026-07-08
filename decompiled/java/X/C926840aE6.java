package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestV3VideoSizeChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0aE6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C926840aE6 implements InterfaceC924270a9x {
    public final DataChannel LL;
    public final boolean LLILLJJLI;
    public C941500abk LLILLL;

    @Override // X.InterfaceC924420aAC
    public final Class<Object> LIZJ() {
        return null;
    }

    @Override // X.InterfaceC924270a9x
    public final void If() {
        C941500abk c941500abk;
        if (this.LLILLJJLI || (c941500abk = this.LLILLL) == null) {
            return;
        }
        c941500abk.LIZ().LJIILLIIL(EnumC934000aPe.AUDIENCE);
    }

    @Override // X.InterfaceC924270a9x
    public final void onPause() {
        C20441214yg.LIZIZ("BaseVoiceChatLayoutRender", "[onPause]");
        C941500abk c941500abk = this.LLILLL;
        if (c941500abk != null) {
            c941500abk.LIZ().LJIIJJI();
        }
    }

    @Override // X.InterfaceC924270a9x
    public final void onResume() {
        C20441214yg.LIZIZ("BaseVoiceChatLayoutRender", "[onResume]");
        C941500abk c941500abk = this.LLILLL;
        if (c941500abk != null) {
            c941500abk.LIZ().LJIILIIL();
        }
    }

    @Override // X.InterfaceC924270a9x
    public final void rc() {
        if (this.LLILLJJLI) {
            C941500abk c941500abk = this.LLILLL;
            if (c941500abk != null) {
                c941500abk.LIZ().LJIILLIIL(EnumC934000aPe.ANCHOR);
                return;
            }
            return;
        }
        C941500abk c941500abk2 = this.LLILLL;
        if (c941500abk2 != null) {
            c941500abk2.LIZ().LJIILLIIL(EnumC934000aPe.GUEST);
        }
    }

    @Override // X.InterfaceC924420aAC
    public final Class<Object> LJIIIIZZ() {
        return InterfaceC924270a9x.class;
    }

    @Override // X.InterfaceC924270a9x
    public final void LJJIJLIJ(ViewGroup viewGroup) {
        C20441214yg.LIZIZ("BaseVoiceChatLayoutRender", "[onWidgetDestroyed]");
        C941500abk c941500abk = this.LLILLL;
        if (c941500abk != null) {
            c941500abk.LIZ().LIZJ();
        }
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    public C926840aE6(DataChannel dataChannel, boolean z) {
        this.LL = dataChannel;
        this.LLILLJJLI = z;
    }

    @Override // X.InterfaceC921470a5R
    public final void LIZ(Room room, Context context, DataChannel dataChannel, Function0<Unit> function0) {
        ((AwS416S0200000_15) function0).invoke();
    }

    @Override // X.InterfaceC924270a9x
    public final void LJJIL(DataChannel dataChannel, ViewGroup viewGroup, InterfaceC921620a5g interfaceC921620a5g, LifecycleOwner lifecycleOwner) {
        C923110a85 c923110a85;
        C20441214yg.LIZIZ("BaseVoiceChatLayoutRender", "[onWidgetCreated]");
        Map<String, InterfaceC942030acb> mapLIZLLL = new C939490aYV(viewGroup, viewGroup, dataChannel).LIZLLL("voice_chat_room");
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setId(R.id.b4_);
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        C786410Ut5.LJZ(0, frameLayout);
        this.LLILLL = new C941500abk(this.LLILLJJLI, interfaceC921620a5g, viewGroup, frameLayout, dataChannel, mapLIZLLL, null);
        Object obj = ((LinkedHashMap) mapLIZLLL).get("voice_chat_business_plugin");
        if ((obj instanceof C923110a85) && (c923110a85 = (C923110a85) obj) != null) {
            c923110a85.LLJ = new AwS559S0100000_15(this, 1033);
        }
        C941500abk c941500abk = this.LLILLL;
        if (c941500abk != null) {
            c941500abk.LIZ().LIZ();
        }
        DataChannel dataChannel2 = this.LL;
        if (dataChannel2 != null) {
            dataChannel2.EQ2(lifecycleOwner, MultiGuestV3VideoSizeChannel.class, AFwS250S0000000_15.get$arr$(221));
        }
    }
}
