package X;

import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.jvm.internal.AFwS203S0000000_15;
import qo2.w;
import webcast.im.SoundWareEffectExtra;

/* JADX INFO: renamed from: X.0aQg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C934640aQg {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(492));

    public static C934650aQh LIZ(String str) {
        return new C934650aQh(str, 60000L);
    }

    public static void LIZIZ(C934650aQh c934650aQh) {
        long jLongValue;
        String string;
        C080500Rv c080500RvLIZ;
        C11PQ<SoundWareEffectExtra> c11pq;
        SoundWareEffectExtra soundWareEffectExtraLJLZ;
        long j = c934650aQh.LIZLLL;
        String str = c934650aQh.LJ;
        long j2 = c934650aQh.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(j);
        sbLIZ.append('-');
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C01GW c01gw = LIZ;
        Long l = (Long) ((Map) c01gw.getValue()).get(strLIZIZ);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - jLongValue < j2) {
            return;
        }
        ((Map) c01gw.getValue()).put(strLIZIZ, Long.valueOf(jCurrentTimeMillis));
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("anchor_audio_guest_voice_wave_show", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_100()));
        c474500IjALIZIZ.LJJII(Long.valueOf(c934650aQh.LIZLLL), "user_id");
        c474500IjALIZIZ.LJJII(c934650aQh.LJ, "user_type");
        c474500IjALIZIZ.LJJII(Long.valueOf(c934650aQh.LIZIZ), "to_user_id");
        c474500IjALIZIZ.LJJII(c934650aQh.LIZ, "to_user_type");
        c474500IjALIZIZ.LJJII(c934650aQh.LJFF, "show_position");
        InterfaceC927740aFY interfaceC927740aFYLIZIZ = C00S0.LIZIZ();
        if (interfaceC927740aFYLIZIZ == null || (c080500RvLIZ = interfaceC927740aFYLIZIZ.LIZ(C01HE.LIZLLL(C933980aPc.LIZIZ()))) == null || (c11pq = c080500RvLIZ.LIZ) == null || (soundWareEffectExtraLJLZ = c11pq.LJLZ()) == null || (string = Long.valueOf(soundWareEffectExtraLJLZ.rightId).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZIZ.LJJII(string, "audio_ring_id");
        c474500IjALIZIZ.LJJII(C917520Zz4.LIZJ(), "layout_id");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZIZ.LJIJ())) {
            Long l2 = c934650aQh.LJI;
            if (l2 != null) {
                c474500IjALIZIZ.LJJII(l2, "room_id");
            }
            c474500IjALIZIZ.LJIL();
            c474500IjALIZIZ.LIZ();
            return;
        }
        c474500IjALIZIZ.LJJIJLIJ();
        w.LIZ.getClass();
        c474500IjALIZIZ.LJJII(Long.valueOf(w.LJIJJ()), "room_id");
        c474500IjALIZIZ.LJJIJL();
    }
}
