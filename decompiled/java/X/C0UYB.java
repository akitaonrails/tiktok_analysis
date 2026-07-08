package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0UYB, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UYB {
    public final DataChannel LIZ;
    public final Context LIZIZ;
    public final Room LIZJ;
    public final InterfaceC773130UUl LIZLLL;
    public InterfaceC769940UIe LJ;
    public final C0UZ9 LJFF;
    public final InterfaceC1631630sYr<Boolean, Cert, Bundle, Boolean, Unit> LJI;
    public final InterfaceC1685420txc<Integer, Long, Long, Boolean, Integer, Unit> LJII;
    public final Function1<Integer, Unit> LJIIIIZZ;
    public final Function2<Cert, Bundle, Unit> LJIIIZ;
    public boolean LJIIJ = true;
    public int LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public int LJIILJJIL;

    public static long LIZ() {
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null) {
            return interfaceC500940JkiUser.getCurrentUserId();
        }
        return 0L;
    }

    public final void LIZJ(int i, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_push_stream_failed_show");
        c474500IjALIZ.LJIJJLI(this.LIZ);
        c474500IjALIZ.LJJII(str, "error_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "error_code");
        c474500IjALIZ.LIZ();
    }

    public final void LIZIZ(int i, String str, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_push_stream_failed_click");
        c474500IjALIZ.LJIJJLI(this.LIZ);
        c474500IjALIZ.LJJII("end_live", "click_icon");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LJIIJJI), "retry_count");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_first_fail");
        c474500IjALIZ.LJJII(str, "error_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "error_code");
        c474500IjALIZ.LIZ();
    }

    public C0UYB(DataChannel dataChannel, Context context, Room room, InterfaceC773130UUl interfaceC773130UUl, InterfaceC769940UIe interfaceC769940UIe, C0UZ9 c0uz9, C0UYW c0uyw, C0UYY c0uyy, C774150UYj c774150UYj, C774090UYd c774090UYd) {
        this.LIZ = dataChannel;
        this.LIZIZ = context;
        this.LIZJ = room;
        this.LIZLLL = interfaceC773130UUl;
        this.LJ = interfaceC769940UIe;
        this.LJFF = c0uz9;
        this.LJI = c0uyw;
        this.LJII = c0uyy;
        this.LJIIIIZZ = c774150UYj;
        this.LJIIIZ = c774090UYd;
    }
}
