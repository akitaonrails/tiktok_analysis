package X;

import com.bytedance.android.livesdk.livesetting.game.MultiDeviceInterruptGuideSetting;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0Uco, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C776320Uco {
    public int LIZIZ;
    public boolean LIZJ;
    public int LJ;
    public int LJFF;
    public long LJI;
    public int LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public long LIZ = -1;
    public long LIZLLL = -1;
    public int LJIIJ = -1;
    public final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(238));
    public final C01GW LJIIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(237));

    public final String LIZIZ() {
        return (String) this.LJIIL.getValue();
    }

    public final long LIZJ() {
        return ((Number) this.LJIIJJI.getValue()).longValue();
    }

    public final void LIZ(long j) {
        long j2 = j - this.LIZLLL;
        if (j2 >= 180000) {
            this.LJ = 1;
        }
        if (j2 >= 300000) {
            this.LJFF = 1;
        }
        this.LJI = Math.max(j2, this.LJI);
    }

    public final void LJI(String str) {
        this.LIZ = System.currentTimeMillis();
        if (this.LJIIIZ && this.LJIIJ == -1) {
            this.LJIIJ = 0;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_unexcepted_interruption_resumestream_state");
        c474500IjALIZ.LJJII(LIZIZ(), "anchor_id");
        c474500IjALIZ.LJJII("screen_share", "live_type");
        c474500IjALIZ.LJJII(Long.valueOf(LIZJ()), "room_id");
        c474500IjALIZ.LJJII(str, "state");
        c474500IjALIZ.LJJII(Boolean.valueOf(C778190Ufp.LIZJ()), "is_backGround_restricted");
        c474500IjALIZ.LJJII(Boolean.valueOf(MultiDeviceInterruptGuideSetting.INSTANCE.isEnable()), "guide_switch");
        c474500IjALIZ.LJJII(Boolean.valueOf(this.LJIIIZ), "has_complete_setting");
        c474500IjALIZ.LIZ();
    }

    public final void LIZLLL(long j, EnumC778210Ufr enumC778210Ufr, EnumC778250Ufv enumC778250Ufv) {
        String value;
        this.LJIIIZ = true;
        if (this.LJIIIIZZ) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_android_setting_complete");
            c474500IjALIZ.LJJII(LIZIZ(), "anchor_id");
            c474500IjALIZ.LJJII(Long.valueOf(j), "room_id");
            String value2 = null;
            if (enumC778210Ufr != null) {
                value = enumC778210Ufr.getValue();
            } else {
                value = null;
            }
            c474500IjALIZ.LJJII(value, "enter_from");
            if (enumC778250Ufv != null) {
                value2 = enumC778250Ufv.getValue();
            }
            c474500IjALIZ.LJJII(value2, "scene_type");
            c474500IjALIZ.LIZ();
            this.LJIIIIZZ = false;
        }
    }

    public final void LJFF(long j, EnumC778210Ufr enumC778210Ufr, EnumC778250Ufv enumC778250Ufv) {
        String value;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_android_self_fix_show");
        c474500IjALIZ.LJJII(LIZIZ(), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(j), "room_id");
        c474500IjALIZ.LJJII(enumC778210Ufr.getValue(), "type");
        if (enumC778250Ufv != null) {
            value = enumC778250Ufv.getValue();
        } else {
            value = null;
        }
        c474500IjALIZ.LJJII(value, "scene_type");
        c474500IjALIZ.LIZ();
    }

    public final void LJ(long j, EnumC778210Ufr enumC778210Ufr, EnumC777330UeR enumC777330UeR, EnumC778250Ufv enumC778250Ufv) {
        String value;
        if (enumC777330UeR == EnumC777330UeR.LEARN_MORE) {
            this.LJIIIIZZ = true;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_android_self_fix_click");
        c474500IjALIZ.LJJII(LIZIZ(), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(j), "room_id");
        c474500IjALIZ.LJJII(enumC778210Ufr.getValue(), "type");
        String value2 = null;
        if (enumC777330UeR != null) {
            value = enumC777330UeR.getValue();
        } else {
            value = null;
        }
        c474500IjALIZ.LJJII(value, "button_name");
        if (enumC778250Ufv != null) {
            value2 = enumC778250Ufv.getValue();
        }
        c474500IjALIZ.LJJII(value2, "scene_type");
        c474500IjALIZ.LIZ();
    }
}
