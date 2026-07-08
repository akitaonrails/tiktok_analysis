package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0oQZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1472730oQZ extends C1469760oLm {
    public final C1473490oRn LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;

    public final boolean LJ() {
        if (((Boolean) C1474810oTv.B1.getValue()).booleanValue()) {
            return true;
        }
        return (((Boolean) C1474810oTv.C1.getValue()).booleanValue() && this.LLILZIL) || this.LLILZLL || this.LLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(java.util.Map<java.lang.String, java.lang.Object> r7) {
        /*
            r6 = this;
            r5 = 0
            if (r7 == 0) goto L4e
            java.lang.String r1 = "hdr"
            java.lang.Object r0 = r7.get(r1)
            boolean r0 = r0 instanceof java.lang.Boolean
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r7.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r3 = r0.booleanValue()
        L17:
            r2 = 1
            if (r7 == 0) goto L4c
            java.lang.String r1 = "header_url"
            java.lang.Object r0 = r7.get(r1)
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L4c
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L4c
            java.lang.String r0 = "http"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L4c
            java.lang.String r0 = "mdl:"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L4c
            r0 = 1
        L41:
            if (r3 != 0) goto L4b
            if (r0 == 0) goto L50
            boolean r0 = X.C1474810oTv.LJJJJZI()
            if (r0 == 0) goto L50
        L4b:
            return r5
        L4c:
            r0 = 0
            goto L41
        L4e:
            r3 = 0
            goto L17
        L50:
            X.0oPK r0 = r6.LLILLJJLI
            android.util.SparseIntArray r1 = r0.LJIIIZ()
            r0 = 42
            int r0 = r1.get(r0)
            if (r0 != r2) goto L62
            r4 = 1
        L5f:
            if (r7 != 0) goto L64
            return r4
        L62:
            r4 = 0
            goto L5f
        L64:
            X.01GW r0 = X.C1474810oTv.LJIJJ
            java.lang.Object r3 = r0.getValue()
            com.ss.android.ugc.playerkit.exp.model.SrReverseConfig r3 = (com.ss.android.ugc.playerkit.exp.model.SrReverseConfig) r3
            java.lang.String r1 = "header_resolution"
            java.lang.Object r0 = r7.get(r1)
            if (r0 != 0) goto L82
            if (r3 == 0) goto L81
            java.util.List<java.lang.Integer> r0 = r3.closeSuperResolutionConfig
            if (r0 == 0) goto L81
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L81
            return r5
        L81:
            return r4
        L82:
            java.lang.Object r0 = r7.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r2 = r0.intValue()
            if (r3 == 0) goto La8
            java.util.List<java.lang.Integer> r0 = r3.closeSuperResolutionConfig
            if (r0 == 0) goto La8
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto La8
            java.util.List<java.lang.Integer> r1 = r3.closeSuperResolutionConfig
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto La7
            if (r4 == 0) goto La7
            r5 = 1
        La7:
            return r5
        La8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1472730oQZ.LIZLLL(java.util.Map):boolean");
    }

    public final void LJFF(Map<String, Object> map) {
        if (map.get("bytevc2") != null) {
            this.LLILZIL = ((Boolean) map.get("bytevc2")).booleanValue();
        }
        if (map.get("header_play_3d_video") != null && (map.get("header_play_3d_video") instanceof Boolean)) {
            this.LLILZLL = ((Boolean) map.get("header_play_3d_video")).booleanValue();
        } else {
            this.LLILZLL = false;
        }
        if (map.get("header_enable_ttr_gaussian_blur") != null && (map.get("header_enable_ttr_gaussian_blur") instanceof Boolean)) {
            this.LLIZ = ((Boolean) map.get("header_enable_ttr_gaussian_blur")).booleanValue();
        } else {
            this.LLIZ = false;
        }
    }

    public final void LJI(Map<String, Object> map) {
        boolean zBooleanValue;
        C1472150oPd player;
        C1472150oPd player2 = this.LLILLJJLI.getPlayer();
        if (map.get("key2") != null) {
            map.get("key2").toString();
        }
        if (player2 == null) {
            return;
        }
        boolean zLIZLLL = LIZLLL(map);
        if (map.get("header_close_sr_reason") != null) {
            player2.LIZJ(4313, ((Integer) map.get("header_close_sr_reason")).intValue());
        }
        C1473490oRn c1473490oRn = this.LLILLL;
        if (c1473490oRn != null) {
            if (C1481110oe5.LIZ) {
                StringBuilder sb = new StringBuilder("[ttr_sharpen] setEnableSuperResolution ");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("enabled=");
                sbLIZ.append(zLIZLLL);
                sb.append(C2188811AlT.LIZIZ(sbLIZ));
                C1481110oe5.LIZIZ("EngineSharpenHelper", sb.toString());
            }
            c1473490oRn.LLILZ = zLIZLLL;
            c1473490oRn.LLILLL = true;
        }
        if (zLIZLLL && map.get("is_open_super_resolution") != null && (map.get("is_open_super_resolution") instanceof Boolean)) {
            zBooleanValue = ((Boolean) map.get("is_open_super_resolution")).booleanValue();
            C1473490oRn c1473490oRn2 = this.LLILLL;
            if (c1473490oRn2 != null) {
                if (C1481110oe5.LIZ) {
                    StringBuilder sb2 = new StringBuilder("[ttr_sharpen] setOpenSuperResolution ");
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("open=");
                    sbLIZ2.append(zBooleanValue);
                    sb2.append(C2188811AlT.LIZIZ(sbLIZ2));
                    C1481110oe5.LIZIZ("EngineSharpenHelper", sb2.toString());
                }
                c1473490oRn2.LLILZIL = zBooleanValue;
            }
            if (zBooleanValue && LJ()) {
                C1472150oPd player3 = this.LLILLJJLI.getPlayer();
                if (player3 != null) {
                    player3.LIZJ(4318, 1);
                }
                C1472150oPd player4 = this.LLILLJJLI.getPlayer();
                if (player4 != null) {
                    player4.LIZJ(5, 8);
                    player4.LIZJ(4319, ((Number) C1474810oTv.LJJII.getValue()).intValue());
                }
                this.LLILZ = true;
            }
        } else {
            zBooleanValue = false;
        }
        if (this.LLILZ && !zBooleanValue && LJ() && (player = this.LLILLJJLI.getPlayer()) != null) {
            player.LIZJ(4318, 0);
        }
    }

    public C1472730oQZ(InterfaceC1471960oPK interfaceC1471960oPK, C1473490oRn c1473490oRn) {
        super(interfaceC1471960oPK);
        this.LLILLL = c1473490oRn;
    }
}
