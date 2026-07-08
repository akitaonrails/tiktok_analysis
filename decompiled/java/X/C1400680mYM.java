package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.ab.MdpFoldSquareABSwitchConfig;
import com.ss.android.ugc.aweme.music.ab.MdpMusicTypeABSwitchConfig;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IMusicPublishBridgeService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0mYM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1400680mYM {
    public static final C1400680mYM LIZ = new C1400680mYM();
    public static final MdpFoldSquareABSwitchConfig LIZIZ = new MdpFoldSquareABSwitchConfig(false, new MdpMusicTypeABSwitchConfig(4, 4, 4), new MdpMusicTypeABSwitchConfig(100, 10, 10));
    public static final Map<String, Boolean> LIZJ = new LinkedHashMap();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(506));

    public static MdpFoldSquareABSwitchConfig LJFF() {
        return (MdpFoldSquareABSwitchConfig) LIZLLL.getValue();
    }

    public static final boolean LIZ() {
        if (!C636090OxD.LIZ()) {
            return false;
        }
        LIZ.getClass();
        if (!LJFF().enable) {
            return false;
        }
        User userLIZLLL = C461720I8s.LIZLLL();
        return (userLIZLLL == null || userLIZLLL.getAccountType() != 3 || ((IMusicPublishBridgeService) ServiceManager.get().getService(IMusicPublishBridgeService.class)).enableBAUserMusicExperienceOpt()) && C461720I8s.LJ();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int LJ(String str) {
        if (str == null) {
            if (!C290790BaX.LIZ()) {
                return 0;
            }
            return 4;
        }
        switch (str.hashCode()) {
            case 110924:
                if (str.equals("pgc")) {
                }
                break;
            case 115729:
                if (str.equals("ugc")) {
                }
                break;
            case 3452321:
                if (!str.equals("pugc")) {
                }
                break;
            case 293934803:
                if (!str.equals("fold_ugc")) {
                }
                break;
        }
        return 0;
    }

    public static final boolean LIZLLL(Music music, List<? extends Aweme> list, Integer num) {
        Integer numValueOf;
        if (!LIZ() || music == null || num == null) {
            return false;
        }
        User userLIZLLL = C461720I8s.LIZLLL();
        if ((userLIZLLL != null && userLIZLLL.getAccountType() == 3 && !((IMusicPublishBridgeService) ServiceManager.get().getService(IMusicPublishBridgeService.class)).enableBAUserMusicExperienceOpt()) || !C461720I8s.LJ()) {
            return false;
        }
        Map<String, Boolean> map = LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(music.getIdStr());
        sbLIZ.append('_');
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append('_');
        sbLIZ.append(num);
        Boolean bool = (Boolean) ((LinkedHashMap) map).get(C2188811AlT.LIZIZ(sbLIZ));
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZIZ(java.util.List r8, java.lang.String r9, boolean r10, java.lang.Integer r11) {
        /*
            r7 = 0
            if (r10 == 0) goto La
            boolean r0 = LIZ()
            if (r0 != 0) goto La
            return r7
        La:
            if (r9 == 0) goto L97
            if (r11 == 0) goto L97
            X.0mYM r0 = X.C1400680mYM.LIZ
            r0.getClass()
            int r0 = r9.hashCode()
            switch(r0) {
                case 110924: goto L50;
                case 115729: goto L61;
                case 3452321: goto L72;
                case 293934803: goto L7b;
                default: goto L1a;
            }
        L1a:
            r6 = 0
        L1b:
            int r0 = r11.intValue()
            if (r0 > r6) goto L97
            if (r6 == 0) goto L97
            r5 = 1
            if (r8 == 0) goto L8d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r8.iterator()
        L2f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L8f
            java.lang.Object r2 = r3.next()
            r1 = r2
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1
            java.lang.String r0 = r1.getAid()
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L2f
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isMDPSquareType(r1)
            if (r0 != 0) goto L2f
            r4.add(r2)
            goto L2f
        L50:
            java.lang.String r0 = "pgc"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L1a
            com.ss.android.ugc.aweme.music.ab.MdpFoldSquareABSwitchConfig r0 = LJFF()
            com.ss.android.ugc.aweme.music.ab.MdpMusicTypeABSwitchConfig r0 = r0.foldThreshold
            int r6 = r0.pgcCount
            goto L1b
        L61:
            java.lang.String r0 = "ugc"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L1a
            com.ss.android.ugc.aweme.music.ab.MdpFoldSquareABSwitchConfig r0 = LJFF()
            com.ss.android.ugc.aweme.music.ab.MdpMusicTypeABSwitchConfig r0 = r0.foldThreshold
            int r6 = r0.ugcCount
            goto L1b
        L72:
            java.lang.String r0 = "pugc"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L84
            goto L1a
        L7b:
            java.lang.String r0 = "fold_ugc"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L84
            goto L1a
        L84:
            com.ss.android.ugc.aweme.music.ab.MdpFoldSquareABSwitchConfig r0 = LJFF()
            com.ss.android.ugc.aweme.music.ab.MdpMusicTypeABSwitchConfig r0 = r0.foldThreshold
            int r6 = r0.pugcCount
            goto L1b
        L8d:
            X.13BV r4 = X.C13BV.INSTANCE
        L8f:
            int r0 = r4.size()
            if (r0 <= r6) goto L96
            return r7
        L96:
            return r5
        L97:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1400680mYM.LIZIZ(java.util.List, java.lang.String, boolean, java.lang.Integer):boolean");
    }

    public static final boolean LIZJ(Music music, List<? extends Aweme> list, Integer num, boolean z) {
        Integer numValueOf;
        boolean z2;
        if ((z && !LIZ()) || music == null || num == null) {
            return false;
        }
        User userLIZLLL = C461720I8s.LIZLLL();
        if ((userLIZLLL != null && userLIZLLL.getAccountType() == 3 && !((IMusicPublishBridgeService) ServiceManager.get().getService(IMusicPublishBridgeService.class)).enableBAUserMusicExperienceOpt()) || !C461720I8s.LJ()) {
            return false;
        }
        Map<String, Boolean> map = LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(music.getIdStr());
        sbLIZ.append('_');
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append('_');
        sbLIZ.append(num);
        sbLIZ.append('_');
        sbLIZ.append(z);
        Boolean bool = (Boolean) ((LinkedHashMap) map).get(C2188811AlT.LIZIZ(sbLIZ));
        if (bool != null) {
            return bool.booleanValue();
        }
        if (list != null) {
            C1400680mYM c1400680mYM = LIZ;
            String strLIZLLL = C630980Ooy.LIZLLL(music);
            c1400680mYM.getClass();
            int iLJ = LJ(strLIZLLL);
            ArrayList arrayList = new ArrayList();
            for (Aweme aweme : list) {
                Aweme aweme2 = aweme;
                if (C123100dR.LIZ(aweme2.getAid()) && !AwemeExtKt.isMDPSquareType(aweme2)) {
                    arrayList.add(aweme);
                }
            }
            if (arrayList.size() >= iLJ) {
                z2 = true;
            } else {
                z2 = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z2);
            Map<String, Boolean> map2 = LIZJ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(music.getIdStr());
            sbLIZ2.append('_');
            sbLIZ2.append(Integer.valueOf(list.size()));
            sbLIZ2.append('_');
            sbLIZ2.append(num);
            sbLIZ2.append('_');
            sbLIZ2.append(z);
            map2.put(C2188811AlT.LIZIZ(sbLIZ2), boolValueOf);
            if (!z2 || iLJ == 0) {
                return false;
            }
            return true;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(music.getIdStr());
        sbLIZ3.append('_');
        sbLIZ3.append((Object) null);
        sbLIZ3.append('_');
        sbLIZ3.append(num);
        sbLIZ3.append('_');
        sbLIZ3.append(z);
        map.put(C2188811AlT.LIZIZ(sbLIZ3), Boolean.FALSE);
        return false;
    }
}
