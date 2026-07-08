package X;

import com.bytedance.keva.Keva;
import com.bytedance.touchpoint.api.model.Bubble;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zT2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1897100zT2 implements InterfaceC1896760zSU {
    public final Keva LIZ = Keva.getRepo("specact.pendant.bubble.BubbleManager");
    public Bubble LIZIZ;
    public boolean LIZJ;

    @Override // X.InterfaceC1896760zSU
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.InterfaceC1896760zSU
    public final void LIZJ() {
        Bubble bubble;
        if (!Intrinsics.LJFF("CLICK_STATIC_PENDANT", "CLICK_DYNAMIC_PENDANT") || (bubble = this.LIZIZ) == null) {
            return;
        }
        Keva keva = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(bubble.bubbleId);
        sbLIZ.append("_pendant_click_time");
        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    @Override // X.InterfaceC1896760zSU
    public final void LIZIZ(HashMap<Integer, Bubble> map) {
        Bubble bubble;
        String str;
        Bubble bubble2;
        String str2;
        Bubble bubble3 = map.get(1);
        this.LIZIZ = bubble3;
        String str3 = null;
        if (bubble3 != null) {
            str3 = bubble3.bubbleId;
        }
        if (str3 != null && str3.length() != 0 && (bubble = this.LIZIZ) != null && (str = bubble.longContent) != null && str.length() != 0 && (bubble2 = this.LIZIZ) != null && (str2 = bubble2.shortContent) != null && str2.length() != 0) {
            Bubble bubble4 = this.LIZIZ;
            if (bubble4 != null) {
                if (this.LIZ.getAll().size() > 1000) {
                    Keva keva = this.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(bubble4.bubbleId);
                    sbLIZ.append("_bubble_last_show_time");
                    long j = keva.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
                    int iLJ = LJ(bubble4);
                    boolean zLJFF = LJFF(bubble4);
                    this.LIZ.clear();
                    Keva keva2 = this.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(bubble4.bubbleId);
                    sbLIZ2.append("_bubble_last_show_time");
                    keva2.storeInt(C2188811AlT.LIZIZ(sbLIZ2), iLJ);
                    Keva keva3 = this.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(bubble4.bubbleId);
                    sbLIZ3.append("_pendant_click_time");
                    keva3.storeLong(C2188811AlT.LIZIZ(sbLIZ3), j);
                    Keva keva4 = this.LIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(bubble4.bubbleId);
                    sbLIZ4.append("_pendant_click_time");
                    keva4.storeBoolean(C2188811AlT.LIZIZ(sbLIZ4), zLJFF);
                }
                int iLJ2 = LJ(bubble4);
                if (iLJ2 != 0) {
                    if (iLJ2 == 1 && !LJFF(bubble4)) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        Keva keva5 = this.LIZ;
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append(bubble4.bubbleId);
                        sbLIZ5.append("_bubble_last_show_time");
                        if (jCurrentTimeMillis - keva5.getLong(C2188811AlT.LIZIZ(sbLIZ5), 0L) > TimeUnit.DAYS.toMillis(bubble4.showAgainTime)) {
                            this.LIZJ = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.LIZJ = true;
                return;
            }
            return;
        }
        this.LIZJ = false;
    }

    public final int LJ(Bubble bubble) {
        Keva keva = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(bubble.bubbleId);
        sbLIZ.append("_bubble_show_num");
        return keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
    }

    public final boolean LJFF(Bubble bubble) {
        Keva keva = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(bubble.bubbleId);
        sbLIZ.append("_pendant_click_time");
        return keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x002c A[PHI: r1
      0x002c: PHI (r1v7 java.lang.String) = (r1v4 java.lang.String), (r1v8 java.lang.String) binds: [B:22:0x002a, B:20:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0030 A[PHI: r1
      0x0030: PHI (r1v6 java.lang.String) = (r1v4 java.lang.String), (r1v7 java.lang.String) binds: [B:22:0x002a, B:24:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1896760zSU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(X.InterfaceC1896860zSe r12, int r13) {
        /*
            r11 = this;
            com.bytedance.touchpoint.api.model.Bubble r3 = r11.LIZIZ
            r6 = 0
            if (r3 == 0) goto Laf
            boolean r0 = r11.LIZJ
            if (r0 == 0) goto Laf
            int r0 = r11.LJ(r3)
            if (r0 == 0) goto L18
            boolean r0 = r11.LJFF(r3)
            if (r0 == 0) goto L18
            r11.LIZJ = r6
            return r6
        L18:
            int r0 = r3.showTimeVV
            if (r13 >= r0) goto L1d
            return r6
        L1d:
            java.lang.String r4 = ""
            if (r12 == 0) goto L34
            com.bytedance.touchpoint.api.model.Bubble r0 = r11.LIZIZ
            if (r0 == 0) goto L29
            java.lang.String r1 = r0.longContent
            if (r1 != 0) goto L2c
        L29:
            r1 = r4
            if (r0 == 0) goto L30
        L2c:
            java.lang.String r0 = r0.shortContent
            if (r0 != 0) goto L31
        L30:
            r0 = r4
        L31:
            r12.showV1Bubble(r1, r0, r3)
        L34:
            int r5 = r11.LJ(r3)
            com.bytedance.keva.Keva r2 = r11.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = r3.bubbleId
            r1.append(r0)
            java.lang.String r0 = "_bubble_show_num"
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            int r0 = r5 + 1
            r2.storeInt(r1, r0)
            com.bytedance.keva.Keva r5 = r11.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = r3.bubbleId
            r1.append(r0)
            java.lang.String r0 = "_bubble_last_show_time"
            r1.append(r0)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
            long r0 = java.lang.System.currentTimeMillis()
            r5.storeLong(r2, r0)
            r11.LIZJ = r6
            java.lang.String r0 = r3.LIZIZ
            if (r0 == 0) goto Lae
            int r0 = r0.length()
            if (r0 == 0) goto Lae
            X.0zOY r2 = X.C1894320zOY.LIZ
            int r5 = r3.LIZ
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            int r0 = r3.bubbleType
            java.lang.String r0 = java.lang.String.valueOf(r0)
            if (r0 == 0) goto L8a
            r4 = r0
        L8a:
            java.lang.String r0 = "sub_type"
            r6.put(r0, r4)
            X.01GW<com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager> r0 = com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager.LLJJIJIIJIL
            com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager r0 = X.C1894330zOZ.LIZ()
            int r0 = r0.LJIILJJIL()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "vv_cnt"
            r6.put(r0, r1)
            java.lang.Integer r7 = r3.LIZJ
            r8 = 0
            java.lang.String r10 = ""
            r2.getClass()
            r9 = r8
            X.C1894320zOY.LJIJJ(r5, r6, r7, r8, r9, r10)
        Lae:
            r6 = 1
        Laf:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1897100zT2.LIZ(X.0zSe, int):boolean");
    }
}
