package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectRequirementExclusive;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectRequirementExclusiveForLiveBoards;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0UFH, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UFH {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZIZ(LiveEffect liveEffect) {
        if (liveEffect != null) {
            Integer numLIZIZ = InterfaceC772190UQv.X3.LIZIZ();
            if (numLIZIZ == null || numLIZIZ.intValue() != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LIZJ(LiveEffect liveEffect) {
        if (C767250U7v.LIZLLL(liveEffect)) {
            List<LiveEffect> listLL = liveEffect.LL();
            if (listLL == null || listLL.isEmpty()) {
                return true;
            }
            Iterator<LiveEffect> it2 = listLL.iterator();
            while (it2.hasNext()) {
                if (!LIZJ(it2.next())) {
                }
            }
            return true;
        }
        int iLJJZZI = liveEffect.LJJZZI();
        if (iLJJZZI != 0) {
            if (iLJJZZI == 1 || iLJJZZI != 2) {
                return true;
            }
        } else {
            return LiveEffectRequirementExclusive.INSTANCE.isCoexist(liveEffect.LLJJ());
        }
        return false;
    }

    public static boolean LIZLLL(LiveEffect liveEffect) {
        if (liveEffect.LJIILLIIL() != 1 && !LiveEffectRequirementExclusiveForLiveBoards.INSTANCE.isExclusive(liveEffect.LLJJ())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0128, code lost:
    
        if (LIZIZ(r1) == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x012a, code lost:
    
        r13.invoke("live_goal");
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x012e, code lost:
    
        r13.invoke("background");
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0050, code lost:
    
        if (r11.equals("live_goal") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        if (r11.equals("background") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bd, code lost:
    
        if (r1 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00bf, code lost:
    
        if (r6 != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c1, code lost:
    
        if (r10 != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c3, code lost:
    
        r14.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c7, code lost:
    
        if (r10 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00cd, code lost:
    
        if (LIZLLL(r12) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00cf, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d0, code lost:
    
        if (r6 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d8, code lost:
    
        if (com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectBackgroundCoexistSetting.INSTANCE.enable() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e6, code lost:
    
        if (X.C500260Jjc.LJJJI(java.lang.Boolean.valueOf(LIZJ(r6))) == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e8, code lost:
    
        if (r1 != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ea, code lost:
    
        r13.invoke("live_boards");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00ee, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f0, code lost:
    
        r14.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00f4, code lost:
    
        if (r1 != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f6, code lost:
    
        r13.invoke("sticker_and_liveboards");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fc, code lost:
    
        r13.invoke("sticker");
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0100, code lost:
    
        if (r10 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0106, code lost:
    
        if (LIZLLL(r12) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x010c, code lost:
    
        if (LIZIZ(r1) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x010e, code lost:
    
        r13.invoke("live_goal_and_liveboards");
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0112, code lost:
    
        r13.invoke("background_and_liveboards");
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x011a, code lost:
    
        if (LIZIZ(r1) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x011c, code lost:
    
        r13.invoke("live_goal");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0120, code lost:
    
        r13.invoke("background");
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d A[PHI: r1
      0x009d: PHI (r1v5 boolean) = (r1v3 boolean), (r1v6 boolean) binds: [B:41:0x009a, B:35:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a3 A[PHI: r7
      0x00a3: PHI (r7v2 boolean) = (r7v1 boolean), (r7v4 boolean) binds: [B:45:0x00a0, B:24:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.lang.String r11, com.bytedance.android.livesdkapi.depend.model.LiveEffect r12, kotlin.jvm.functions.Function1 r13, kotlin.jvm.functions.Function0 r14) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UFH.LIZ(java.lang.String, com.bytedance.android.livesdkapi.depend.model.LiveEffect, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0):void");
    }
}
