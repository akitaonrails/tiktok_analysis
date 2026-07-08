package X;

import com.bytedance.android.livesdk.livesetting.MultiGuestLayoutMonitorSwitchSetting;
import java.util.Map;

/* JADX INFO: renamed from: X.1CkD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2238991CkD extends AbstractC2238971CkB {
    public int LJIILJJIL;

    @Override // X.AbstractC2238971CkB
    public final void LIZ(Map<String, String> map) {
        String str;
        super.LIZ(map);
        long j = this.LJII - this.LJFF;
        if (j < 0) {
            j = 0;
        }
        map.put("layout_success_duration", String.valueOf(j));
        if (this.LJIILJJIL == 4) {
            if (C930540aK4.LJJIJ()) {
                str = "voice_chat";
            } else {
                str = "multi_guest";
            }
        } else {
            str = "others";
        }
        map.put("live_status", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    @Override // X.AbstractC2238971CkB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZLLL(boolean r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L5
            java.lang.String r0 = ""
            return r0
        L5:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r1 = r6.LJIIIIZZ
            java.lang.String r0 = "sei"
            java.lang.Object r0 = r1.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            r1 = 0
            if (r0 == 0) goto L64
            long r4 = r0.longValue()
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L66
            long r1 = r6.LJI
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L66
            java.lang.String r3 = "first_frame_late"
        L23:
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "LayoutFlow seiTime:"
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = " referenceTime:"
            r2.append(r0)
            long r0 = r6.LJI
            r2.append(r0)
            java.lang.String r0 = " reason:"
            r2.append(r0)
            r2.append(r3)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r2)
            java.lang.String r0 = "flick_wws"
            X.C20441214yg.LIZIZ(r0, r1)
            boolean r0 = X.C939210aY3.LIZJ()
            if (r0 == 0) goto L63
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "layout flick: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C766270U4b.LJIIJJI(r0)
        L63:
            return r3
        L64:
            r4 = 0
        L66:
            java.lang.String r3 = "sei_receive_late"
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2238991CkD.LIZLLL(boolean):java.lang.String");
    }

    public C2238991CkD(String str, String str2) {
        super(MultiGuestLayoutMonitorSwitchSetting.INSTANCE.getLayoutFlickThresholdMs(), str, str2, "layout");
        this.LJIILJJIL = -1;
    }
}
