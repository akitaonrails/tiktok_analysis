package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;
import com.ss.android.ugc.aweme.commercialize.quickconversion.api.service.player.IQuickActionPlayerService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.05xx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1524305xx {
    public static final C1524305xx LIZ = new C1524305xx();
    public static final LinkedHashMap<String, C1281004zo> LIZIZ = new LinkedHashMap<>();

    public static void LJFF() {
        Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.app.Activity r13) {
        /*
            LJFF()
            java.util.LinkedHashMap<java.lang.String, X.04zo> r0 = X.C1524305xx.LIZIZ
            java.util.Collection r0 = r0.values()
            java.util.List r3 = X.C13LP.LLIIII(r0)
            boolean r4 = r3 instanceof java.util.Collection
            r2 = 1
            r8 = 0
            if (r4 == 0) goto L72
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L72
        L19:
            r6 = 0
            if (r4 == 0) goto L5c
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L5c
        L22:
            r5 = 0
        L23:
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.quickconversion.api.service.player.IQuickActionPlayerService> r7 = com.ss.android.ugc.aweme.commercialize.quickconversion.api.service.player.IQuickActionPlayerService.class
            r11 = 14
            r12 = 0
            r9 = r8
            r10 = r8
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r7, r8, r9, r10, r11, r12)
            com.ss.android.ugc.aweme.commercialize.quickconversion.api.service.player.IQuickActionPlayerService r1 = (com.ss.android.ugc.aweme.commercialize.quickconversion.api.service.player.IQuickActionPlayerService) r1
            java.lang.String r4 = ""
            if (r6 == 0) goto L94
            if (r1 == 0) goto L3c
            r1.playingVideoPause()
            r1.playingVideoMute()
        L3c:
            X.0cuQ r0 = new X.0cuQ
            r0.<init>(r13, r8)
            X.C1440005kM.LIZ(r0)
            java.util.Iterator r1 = r3.iterator()
        L48:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L8e
            java.lang.Object r0 = r1.next()
            X.04zo r0 = (X.C1281004zo) r0
            java.util.Set<X.04zp> r0 = r0.LIZJ
            int r0 = r0.size()
            int r8 = r8 + r0
            goto L48
        L5c:
            java.util.Iterator r1 = r3.iterator()
        L60:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r1.next()
            X.04zo r0 = (X.C1281004zo) r0
            boolean r0 = r0.LIZIZ
            if (r0 == 0) goto L60
            r5 = 1
            goto L23
        L72:
            java.util.Iterator r1 = r3.iterator()
        L76:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L19
            java.lang.Object r0 = r1.next()
            X.04zo r0 = (X.C1281004zo) r0
            java.util.Set<X.04zp> r0 = r0.LIZJ
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L76
            r6 = 1
            goto L22
        L8e:
            java.lang.String r0 = "gate_pause"
            LIZLLL(r0, r4, r4, r12, r8)
            return
        L94:
            X.0cuQ r0 = new X.0cuQ
            r0.<init>(r13, r2)
            X.C1440005kM.LIZ(r0)
            if (r5 == 0) goto Lac
            if (r1 == 0) goto Lac
            boolean r0 = r1.LIZ(r13)
            if (r0 == r2) goto La9
            r1.playingVideoResume()
        La9:
            r1.playingVideoUnMute()
        Lac:
            java.util.LinkedHashMap<java.lang.String, X.04zo> r0 = X.C1524305xx.LIZIZ
            java.util.Set r1 = r0.entrySet()
            r0 = 871(0x367, float:1.22E-42)
            kotlin.jvm.internal.AFwS229S0000000_2 r0 = kotlin.jvm.internal.AFwS229S0000000_2.get$arr$(r0)
            X.C19719612Di.LJJIII(r1, r0, r2)
            java.lang.String r0 = "gate_clear"
            LIZLLL(r0, r4, r4, r12, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1524305xx.LIZIZ(android.app.Activity):void");
    }

    public static String LIZJ(Bundle bundle) {
        String string;
        String string2;
        LJFF();
        boolean z = true;
        if (bundle != null && (string = bundle.getString("extra_ucp_playback_session_id")) != null && (!a0.LJJJIL(string))) {
            string2 = string;
        } else {
            string = null;
            string2 = UUID.randomUUID().toString();
        }
        if (bundle != null && string == null) {
            C786410Ut5.LJJJI("extra_ucp_playback_session_id", string2, bundle);
        }
        LinkedHashMap<String, C1281004zo> linkedHashMap = LIZIZ;
        if (!linkedHashMap.containsKey(string2)) {
            IQuickActionPlayerService iQuickActionPlayerService = (IQuickActionPlayerService) PluggableExtentionKt.pluggableSpi$default(IQuickActionPlayerService.class, false, false, false, 14, null);
            if (iQuickActionPlayerService == null || !iQuickActionPlayerService.isVideoPlaying()) {
                z = false;
            }
            linkedHashMap.put(string2, new C1281004zo(string2, z));
            LIZLLL("session_start", string2, "", null, 0);
        }
        return string2;
    }

    public static void LJ(C1281204zq c1281204zq, Activity activity) {
        C1281004zo c1281004zo;
        LJFF();
        if (c1281204zq == null || (c1281004zo = LIZIZ.get(c1281204zq.LIZ)) == null) {
            return;
        }
        c1281004zo.LIZJ.remove(new C1281104zp(c1281204zq.LIZIZ, c1281204zq.LIZJ, c1281204zq.LIZLLL));
        LIZLLL("release", c1281204zq.LIZ, c1281204zq.LIZIZ, c1281204zq.LIZJ, c1281004zo.LIZJ.size());
        LIZIZ(activity);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1281204zq LIZ(java.lang.String r12, java.lang.String r13, X.EnumC12947054v r14, android.app.Activity r15) {
        /*
            LJFF()
            X.04zq r2 = new X.04zq
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r4 = r0.toString()
            r2.<init>(r12, r13, r14, r4)
            java.util.LinkedHashMap<java.lang.String, X.04zo> r5 = X.C1524305xx.LIZIZ
            java.lang.Object r3 = r5.get(r12)
            if (r3 != 0) goto L3c
            X.04zo r3 = new X.04zo
            X.05xx r0 = X.C1524305xx.LIZ
            r0.getClass()
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.quickconversion.api.service.player.IQuickActionPlayerService> r6 = com.ss.android.ugc.aweme.commercialize.quickconversion.api.service.player.IQuickActionPlayerService.class
            r7 = 0
            r10 = 14
            r11 = 0
            r8 = r7
            r9 = r7
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r6, r7, r8, r9, r10, r11)
            com.ss.android.ugc.aweme.commercialize.quickconversion.api.service.player.IQuickActionPlayerService r0 = (com.ss.android.ugc.aweme.commercialize.quickconversion.api.service.player.IQuickActionPlayerService) r0
            if (r0 == 0) goto L57
            boolean r1 = r0.isVideoPlaying()
            r0 = 1
            if (r1 != r0) goto L57
        L36:
            r3.<init>(r12, r0)
            r5.put(r12, r3)
        L3c:
            X.04zo r3 = (X.C1281004zo) r3
            java.util.Set<X.04zp> r1 = r3.LIZJ
            X.04zp r0 = new X.04zp
            r0.<init>(r13, r14, r4)
            r1.add(r0)
            java.util.Set<X.04zp> r0 = r3.LIZJ
            int r1 = r0.size()
            java.lang.String r0 = "acquire"
            LIZLLL(r0, r12, r13, r14, r1)
            LIZIZ(r15)
            return r2
        L57:
            r0 = 0
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1524305xx.LIZ(java.lang.String, java.lang.String, X.054v, android.app.Activity):X.04zq");
    }

    public static void LIZLLL(String str, String str2, String str3, EnumC12947054v enumC12947054v, int i) {
        String strName;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("action=");
        sbLIZ.append(str);
        sbLIZ.append(" sessionId=");
        sbLIZ.append(str2);
        sbLIZ.append(" ownerId=");
        sbLIZ.append(str3);
        sbLIZ.append(" reason=");
        if (enumC12947054v == null || (strName = enumC12947054v.name()) == null) {
            strName = "";
        }
        sbLIZ.append(strName);
        sbLIZ.append(" blockerCount=");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
