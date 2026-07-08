package X;

import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.DuoRemixConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS372S0200000_6;

/* JADX INFO: renamed from: X.0HsG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C454660HsG {
    public static final boolean LIZIZ(C869590Y9l c869590Y9l) {
        if (!C441280HSc.LIZ() || !C1644806cI.LIZJ()) {
            return false;
        }
        if (!C0ZDX.LJIJ(c869590Y9l) && ((c869590Y9l.getMsgType() != 1805 && c869590Y9l.getMsgType() != EnumC868450Y5b.LEGACY_MESSAGE_TYPE_EMOJI.getValue()) || !C0H6Q.LIZ())) {
            return false;
        }
        if (C0ZDX.LJJIIJZLJL(c869590Y9l) && !DuoRemixConfig.INSTANCE.getEnable()) {
            return false;
        }
        return true;
    }

    public static final C1562980qm8<C0ZL0> LIZ(C869590Y9l c869590Y9l, C0ZQI c0zqi) {
        return C1558650qf9.LIZIZ("Mix", C0ZL0.ENTER_MIX_STUDIO, Integer.valueOf(R.raw.icon_ai_generate), 2131835845, false, new AwS372S0200000_6(c869590Y9l, c0zqi, 91), 48);
    }
}
