package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorEnigmaCommentABSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0TfM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C752420TfM extends C750630TcT {
    public final C752430TfN LLILZIL;

    @Override // X.AbstractC752950TgD
    public final Function0<Unit> LJIIIIZZ() {
        return new AwS556S0100000_12(this, 792);
    }

    public final void LJIIJ() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_enigma_whisper_action_viewer");
        c474500IjALIZ.LJJII("anchor", "view_type");
        User user = this.LLILZ.LIZ;
        c474500IjALIZ.LJJII(user != null ? Long.valueOf(user.getId()) : null, "to_user_id");
        c474500IjALIZ.LJJII(0, "self_type");
        c474500IjALIZ.LJJII("homepage", "action_type");
        c474500IjALIZ.LIZ();
    }

    public C752420TfM(C752430TfN c752430TfN) {
        super(c752430TfN);
        this.LLILZIL = c752430TfN;
    }

    @Override // X.AbstractC752950TgD
    public final Function0 LIZJ(C755180Tjo c755180Tjo) {
        return new AwS556S0100000_12(c755180Tjo, 793);
    }

    @Override // X.AbstractC752950TgD
    public final boolean LJ(EnumC755280Tjy enumC755280Tjy) {
        boolean z;
        C752430TfN c752430TfN = this.LLILZIL;
        if ((c752430TfN.LJIIJ instanceof C1110490f0J) && C500260Jjc.LJJJI(Boolean.valueOf(c752430TfN.LIZIZ))) {
            z = true;
        } else {
            z = false;
        }
        if (!C500260Jjc.LJJJI(InterfaceC1106030et7.v9.LIZ()) && AnchorEnigmaCommentABSetting.INSTANCE.isEnable() && z) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC752950TgD
    public final void LIZIZ(C755180Tjo c755180Tjo, Context context) {
        this.LLILLJJLI = c755180Tjo;
        this.LL = context;
        if (c755180Tjo != null) {
            c755180Tjo.LJFF(C497740JfY.LJIJI(2131852210));
        }
    }
}
