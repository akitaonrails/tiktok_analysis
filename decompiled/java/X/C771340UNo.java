package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostCleanerRecordForbid;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostCleanerRecordMaxSize;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0UNo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C771340UNo {
    public static final int LIZ = LiveHostCleanerRecordMaxSize.getValue();
    public static final List<String> LIZIZ;
    public static volatile List<C0J3M> LIZJ;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC771350UNp.STICKER.getFullPath());
        sbLIZ.append("image");
        LIZIZ = C1697810uHb.LJIIJJI(EnumC771350UNp.CROP_VIEW.getFullPath(), EnumC771350UNp.DRAW_GUESS.getFullPath(), EnumC771350UNp.SHARE_EFFECT.getFullPath(), EnumC771350UNp.LIVE_REPLAY_SPRITE_IMAGE.getFullPath(), EnumC771350UNp.LIVE_REPLAY_CLIP_VIDEO.getFullPath(), EnumC771350UNp.MUSIC_ACC.getFullPath(), EnumC771350UNp.LIVE_RECORD.getFullPath(), C2188811AlT.LIZIZ(sbLIZ));
        LIZJ = new ArrayList();
    }

    public static boolean LIZJ() {
        return !((ArrayList) LIZJ).isEmpty();
    }

    public static void LIZ(HashMap map) {
        int size = map.size();
        int i = LIZ;
        if (size < i) {
            return;
        }
        for (int size2 = map.size() - i; size2 > 0; size2--) {
            String strValueOf = String.valueOf(System.currentTimeMillis());
            Object obj = null;
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                String str = (String) entry.getValue();
                if (strValueOf.compareTo(str) > 0) {
                    strValueOf = str;
                    obj = key;
                }
            }
            C19719512Dh.LIZJ(map).remove(obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (r1.equals("effect") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (r1.equals("response") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r1.equals("sound_effect") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        return X.InterfaceC1106030et7.T7.LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        return X.InterfaceC1106030et7.V7.LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r1.equals("sticker_quiz") == false) goto L4;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LJ(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -2031087593: goto Lc;
                case -1306084975: goto L15;
                case -936045084: goto L1e;
                case -340323263: goto L2f;
                case 1182494401: goto L38;
                default: goto L7;
            }
        L7:
            java.util.Map r0 = X.C2097608Jq.LJ()
            return r0
        Lc:
            java.lang.String r0 = "sticker_quiz"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L49
            goto L7
        L15:
            java.lang.String r0 = "effect"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L49
            goto L7
        L1e:
            java.lang.String r0 = "karaoke"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7
            X.14i1<java.util.Map<java.lang.String, java.lang.String>> r0 = X.InterfaceC1106030et7.U7
            java.lang.Object r0 = r0.LIZIZ()
            java.util.Map r0 = (java.util.Map) r0
            return r0
        L2f:
            java.lang.String r0 = "response"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L40
            goto L7
        L38:
            java.lang.String r0 = "sound_effect"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7
        L40:
            X.14i1<java.util.Map<java.lang.String, java.lang.String>> r0 = X.InterfaceC1106030et7.T7
            java.lang.Object r0 = r0.LIZIZ()
            java.util.Map r0 = (java.util.Map) r0
            return r0
        L49:
            X.14i1<java.util.Map<java.lang.String, java.lang.String>> r0 = X.InterfaceC1106030et7.V7
            java.lang.Object r0 = r0.LIZIZ()
            java.util.Map r0 = (java.util.Map) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C771340UNo.LJ(java.lang.String):java.util.Map");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LIZIZ(String str, String str2) {
        if (LiveHostCleanerRecordForbid.getValue()) {
            return;
        }
        switch (str.hashCode()) {
            case -1306084975:
                if (!str.equals("effect")) {
                    return;
                }
                C20337914i1<Map<String, String>> c20337914i1 = InterfaceC1106030et7.V7;
                c20337914i1.LIZIZ().remove(str2);
                c20337914i1.LIZJ();
                return;
            case -936045084:
                if (!str.equals("karaoke")) {
                    return;
                }
                C20337914i1<Map<String, String>> c20337914i12 = InterfaceC1106030et7.U7;
                c20337914i12.LIZIZ().remove(str2);
                c20337914i12.LIZJ();
                return;
            case -340323263:
                if (!str.equals("response")) {
                    return;
                }
                break;
            case 1182494401:
                if (!str.equals("sound_effect")) {
                    return;
                }
                break;
            default:
                return;
        }
        C20337914i1<Map<String, String>> c20337914i13 = InterfaceC1106030et7.T7;
        c20337914i13.LIZIZ().remove(str2);
        c20337914i13.LIZJ();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LJFF(String str, String str2) {
        if (LiveHostCleanerRecordForbid.getValue()) {
        }
        switch (str.hashCode()) {
            case -2031087593:
                if (!str.equals("sticker_quiz")) {
                }
                C20337914i1<Map<String, String>> c20337914i1 = InterfaceC1106030et7.V7;
                c20337914i1.LIZIZ().put(str2, String.valueOf(System.currentTimeMillis()));
                c20337914i1.LIZJ();
                break;
            case -1306084975:
                if (!str.equals("effect")) {
                }
                C20337914i1<Map<String, String>> c20337914i12 = InterfaceC1106030et7.V7;
                c20337914i12.LIZIZ().put(str2, String.valueOf(System.currentTimeMillis()));
                c20337914i12.LIZJ();
                break;
            case -936045084:
                if (str.equals("karaoke")) {
                    C20337914i1<Map<String, String>> c20337914i13 = InterfaceC1106030et7.U7;
                    c20337914i13.LIZIZ().put(str2, String.valueOf(System.currentTimeMillis()));
                    c20337914i13.LIZJ();
                }
                break;
            case -340323263:
                if (!str.equals("response")) {
                }
                C20337914i1<Map<String, String>> c20337914i14 = InterfaceC1106030et7.T7;
                c20337914i14.LIZIZ().put(str2, String.valueOf(System.currentTimeMillis()));
                c20337914i14.LIZJ();
                break;
            case 1182494401:
                if (!str.equals("sound_effect")) {
                }
                C20337914i1<Map<String, String>> c20337914i142 = InterfaceC1106030et7.T7;
                c20337914i142.LIZIZ().put(str2, String.valueOf(System.currentTimeMillis()));
                c20337914i142.LIZJ();
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZLLL(long r11, java.lang.String r13, java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C771340UNo.LIZLLL(long, java.lang.String, java.lang.String, boolean):java.util.List");
    }
}
