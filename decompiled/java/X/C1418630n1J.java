package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;

/* JADX INFO: renamed from: X.0n1J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1418630n1J {
    public static final EnumC1419660n2y LIZ(AVMusic aVMusic) {
        boolean z;
        boolean z2 = true;
        if (!aVMusic.isPgc() && !aVMusic.isLocalMusic()) {
            z = true;
        } else {
            z = false;
        }
        if (aVMusic.isPgc() || aVMusic.isLocalMusic() || aVMusic.getMatchedPGCSoundInfo() == null) {
            z2 = false;
        }
        return LIZJ(z, z2, aVMusic.getIsRenamedUGC());
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.EnumC1419660n2y LIZIZ(com.ss.android.ugc.aweme.shortvideo.model.MusicModel r6) {
        /*
            boolean r0 = r6.isPgc()
            r5 = 1
            if (r0 != 0) goto L48
            boolean r0 = r6.isLocalMusic()
            if (r0 != 0) goto L48
            r4 = 1
        Le:
            boolean r0 = r6.isPgc()
            if (r0 != 0) goto L46
            boolean r0 = r6.isLocalMusic()
            if (r0 != 0) goto L46
            com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo r0 = r6.getMatchedPGCSoundInfo()
            if (r0 == 0) goto L46
            r3 = 1
        L21:
            java.lang.String r2 = "has_edited"
            com.ss.android.ugc.aweme.music.model.Music r1 = r6.getMusic()
            r0 = 0
            if (r1 == 0) goto L2e
            java.lang.String r0 = r1.getExtra()
        L2e:
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L41
            com.ss.android.ugc.aweme.music.model.Music r0 = r6.getMusic()
            if (r0 == 0) goto L60
            java.lang.String r0 = r0.getExtra()
        L3e:
            if (r0 == 0) goto L60
            goto L4a
        L41:
            java.lang.String r0 = r6.getExtra()
            goto L3e
        L46:
            r3 = 0
            goto L21
        L48:
            r4 = 0
            goto Le
        L4a:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5c
            r1.<init>(r0)     // Catch: org.json.JSONException -> L5c
            boolean r0 = r1.has(r2)     // Catch: org.json.JSONException -> L5c
            if (r0 == 0) goto L60
            int r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getInt(r1, r2)     // Catch: org.json.JSONException -> L5c
            if (r0 != r5) goto L60
            goto L61
        L5c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L60:
            r5 = 0
        L61:
            X.0n2y r0 = LIZJ(r4, r3, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1418630n1J.LIZIZ(com.ss.android.ugc.aweme.shortvideo.model.MusicModel):X.0n2y");
    }

    public static final EnumC1419660n2y LIZJ(boolean z, boolean z2, boolean z3) {
        if (z) {
            C01GW c01gw = C279510AxR.LIZ;
            if (((Number) c01gw.getValue()).intValue() > 0) {
                if (z2) {
                    if (z3 && ((Number) c01gw.getValue()).intValue() == 2) {
                        return EnumC1419660n2y.USE_ONLINE;
                    }
                    return EnumC1419660n2y.USE_PGC;
                }
                if (!z3 && ((Boolean) C279520AxS.LIZ.getValue()).booleanValue()) {
                    return EnumC1419660n2y.USE_NEW_TITLE;
                }
                return EnumC1419660n2y.USE_ONLINE;
            }
        }
        return EnumC1419660n2y.USE_ONLINE;
    }
}
