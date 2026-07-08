package X;

import com.bytedance.android.live.browser.IHybridStorageService;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTakeTheStageCountdownSecSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTakeTheStageDurationListSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTakeTheStageDurationSelectionEnableSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0bPh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C972470bPh {
    public static final /* synthetic */ int LIZ = 0;

    public static long LIZ() {
        Long lLIZIZ = InterfaceC1106030et7.o9.LIZIZ();
        if (lLIZIZ.longValue() <= 0) {
            lLIZIZ = null;
        }
        Long l = lLIZIZ;
        return l != null ? l.longValue() : LiveCoHostTakeTheStageDurationListSetting.INSTANCE.getFirstDuration();
    }

    public static void LIZLLL() {
        List<Long> value = LiveCoHostTakeTheStageDurationListSetting.INSTANCE.getValue();
        C20337914i1<Long> c20337914i1 = InterfaceC1106030et7.o9;
        if (value.contains(c20337914i1.LIZIZ()) || !(!value.isEmpty())) {
            return;
        }
        c20337914i1.LJFF((Long) ListProtector.get(value, 0));
    }

    public static long LIZIZ(boolean z) {
        AbstractC963510bBF abstractC963510bBF;
        C981500beG c981500beG;
        long value;
        Long l;
        C981480beE c981480beEM91 = C915980Zwa.LIZIZ().M91(false);
        C963520bBG c963520bBG = null;
        if (c981480beEM91 != null) {
            abstractC963510bBF = c981480beEM91.LJIL;
        } else {
            abstractC963510bBF = null;
        }
        if (abstractC963510bBF instanceof C963520bBG) {
            c963520bBG = (C963520bBG) abstractC963510bBF;
        }
        long j = 0;
        if (c963520bBG != null && (l = c963520bBG.LJII) != null) {
            long jLongValue = l.longValue();
            if (jLongValue > 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getTTSPerfDuration. Use CompetitionAction.Init. duration=");
                sbLIZ.append(jLongValue);
                C20441214yg.LIZIZ("TTSPerfDurationUtil", C2188811AlT.LIZIZ(sbLIZ));
                return jLongValue;
            }
        }
        if (z) {
            if (LiveCoHostTakeTheStageDurationSelectionEnableSetting.INSTANCE.isEnabled()) {
                if (C968660bJY.LIZ()) {
                    C0TWA c0twaLIZ = C748020TVw.LIZ(C915980Zwa.LJII(), C497740JfY.LJII(), (IHybridStorageService) C1161920gLG.LIZJ(IHybridStorageService.class));
                    C20441214yg.LIZIZ("TTSPerfDurationUtil", "getTTSPerfDurationFromLocalStore. Use V3");
                    value = c0twaLIZ.LIZIZ(LIZ());
                } else {
                    C20441214yg.LIZIZ("TTSPerfDurationUtil", "getTTSPerfDurationFromLocalStore. Use LivePluginProperties");
                    value = InterfaceC1106030et7.o9.LIZIZ().longValue();
                }
            } else {
                C20441214yg.LIZIZ("TTSPerfDurationUtil", "getTTSPerfDurationFromLocalStore. Use CountdownSecSetting");
                value = LiveCoHostTakeTheStageCountdownSecSetting.INSTANCE.getValue();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getTTSPerfDuration. Use LocalStore. duration=");
            sbLIZ2.append(value);
            C20441214yg.LIZIZ("TTSPerfDurationUtil", C2188811AlT.LIZIZ(sbLIZ2));
            return value;
        }
        C981480beE c981480beEM912 = C915980Zwa.LIZIZ().M91(false);
        if (c981480beEM912 != null && (c981500beG = c981480beEM912.LJJIJIIJI) != null) {
            j = c981500beG.LJFF;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("getTTSPerfDuration. Use TTSModel. duration=");
        sbLIZ3.append(j);
        C20441214yg.LIZIZ("TTSPerfDurationUtil", C2188811AlT.LIZIZ(sbLIZ3));
        return j;
    }

    public static String LIZJ(long j) {
        float f = (j * 1.0f) / 60;
        if (f % 1.0f == 0.0f) {
            return String.valueOf((int) f);
        }
        return C786410Ut5.j4("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
    }
}
