package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.AwemeUpdateExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mCU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1387120mCU {
    public static C1387120mCU LIZIZ;
    public final InterfaceC1387130mCV<String> LIZ;

    public C1387120mCU() {
        IMainService iMainService = (IMainService) PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null);
        this.LIZ = (iMainService == null || iMainService.isReplaceAwemeCache()) ? new C20013213Sg() : new InterfaceC1387130mCV<String>() { // from class: X.07za
            public final Map<String, Aweme> LIZ = new HashMap();

            @Override // X.InterfaceC1387130mCV
            public final void clear() {
                ((HashMap) this.LIZ).clear();
            }

            @Override // X.InterfaceC1387130mCV
            public final Collection<Aweme> values() {
                return ((HashMap) this.LIZ).values();
            }

            @Override // X.InterfaceC1387130mCV
            public final boolean containsKey(String str) {
                return ((HashMap) this.LIZ).containsKey(str);
            }

            @Override // X.InterfaceC1387130mCV
            public final Aweme get(String str) {
                return (Aweme) ((HashMap) this.LIZ).get(str);
            }

            @Override // X.InterfaceC1387130mCV
            public final void LIZ(Aweme aweme, Object obj) {
                ((HashMap) this.LIZ).put(obj, aweme);
            }
        };
    }

    public static AwemeStatistics LIZLLL(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics == null) {
            AwemeStatistics awemeStatistics = new AwemeStatistics();
            aweme.setStatistics(awemeStatistics);
            return awemeStatistics;
        }
        return statistics;
    }

    public static boolean LJ(Aweme aweme) {
        if ((aweme != null && (AwemeExtKt.isAdTraffic(aweme) || aweme.getActivityPendant() != null || aweme.getLiveAwesomeSplashInfo() != null)) || C1017070cZd.LLILII(aweme)) {
            return true;
        }
        return false;
    }

    public final Aweme LIZ(String str) {
        if (!TextUtils.isEmpty(str) && !Intrinsics.LJFF(CardStruct.IStatusCode.DEFAULT, str)) {
            if (str != null && this.LIZ.containsKey(str)) {
                return this.LIZ.get(str);
            }
            C1387110mCT c1387110mCTLIZ = C1345240l6w.LIZ();
            if (c1387110mCTLIZ != null) {
                return c1387110mCTLIZ.LIZ(str);
            }
            return null;
        }
        return null;
    }

    public final Aweme LIZIZ(String str) {
        if (str != null) {
            this.LIZ.containsKey(str);
            if (str != null && this.LIZ.containsKey(str)) {
                return this.LIZ.get(str);
            }
            return null;
        }
        return null;
    }

    public final Aweme LJFF(Aweme aweme) {
        Aweme aweme2;
        if (aweme != null && !TextUtils.isEmpty(aweme.getAid())) {
            if (aweme.getUserStory() != null) {
                LJI(aweme, 0, false);
            } else {
                if (LJ(aweme)) {
                    C1387110mCT c1387110mCTLIZ = C1345240l6w.LIZ();
                    if (c1387110mCTLIZ != null) {
                        return c1387110mCTLIZ.LIZLLL(aweme);
                    }
                    return null;
                }
                InterfaceC1387130mCV<String> interfaceC1387130mCV = this.LIZ;
                if (!TextUtils.isEmpty(aweme.getAid()) && !AwemeExtKt.isProhibited(aweme) && !AwemeExtKt.isSelfSee(aweme) && !AwemeExtKt.isOfflineVideo(aweme)) {
                    if (aweme.isPaidContent) {
                        interfaceC1387130mCV.LIZ(aweme, aweme.getAid());
                        return aweme;
                    }
                    if (interfaceC1387130mCV.containsKey(aweme.getAid()) && (aweme2 = interfaceC1387130mCV.get(aweme.getAid())) != null) {
                        AwemeUpdateExtKt.update(aweme2, aweme);
                        aweme = aweme2;
                    }
                    interfaceC1387130mCV.LIZ(aweme, aweme.getAid());
                    return aweme;
                }
            }
        }
        return aweme;
    }

    public final Aweme LIZJ(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("type");
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (this.LIZ.containsKey(strLIZIZ)) {
            return this.LIZ.get(strLIZIZ);
        }
        return null;
    }

    public final Aweme LJII(int i, Aweme aweme) {
        if (!TextUtils.isEmpty(aweme.getAid())) {
            if (aweme.getUserStory() != null) {
                LJI(aweme, i, true);
            } else {
                if (LJ(aweme)) {
                    C1387110mCT c1387110mCTLIZ = C1345240l6w.LIZ();
                    if (c1387110mCTLIZ != null) {
                        return c1387110mCTLIZ.LIZLLL(aweme);
                    }
                    return null;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(aweme.getAid());
                sbLIZ.append("type");
                sbLIZ.append(i);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (this.LIZ.containsKey(strLIZIZ)) {
                    Aweme aweme2 = this.LIZ.get(strLIZIZ);
                    if (aweme2 != null) {
                        AwemeUpdateExtKt.update(aweme2, aweme);
                        return aweme2;
                    }
                    this.LIZ.LIZ(aweme, strLIZIZ);
                    return aweme;
                }
                this.LIZ.LIZ(aweme, strLIZIZ);
                return aweme;
            }
        }
        return aweme;
    }

    public final void LJIIIIZZ(int i, Aweme aweme) {
        aweme.setUserDigg(i);
        AwemeStatistics statistics = aweme.getStatistics();
        if (i == 0) {
            if (statistics != null) {
                statistics.setDiggCount(statistics.getDiggCount() - 1);
            }
        } else {
            if (statistics != null) {
                statistics.setDiggCount(statistics.getDiggCount() + 1);
            }
            IMainService iMainService = (IMainService) PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null);
            if (iMainService != null) {
                iMainService.trackAppsFlyerEvent("mus_af_like_video_5", null);
            }
        }
        this.LIZ.LIZ(aweme, aweme.getAid());
    }

    public final void LJI(Aweme aweme, int i, boolean z) {
        Aweme awemeLJI;
        if (aweme != null && aweme.getUserStory() != null && (awemeLJI = C729510SjV.LJI(aweme)) != null) {
            if (z) {
                ListProtector.set(aweme.getUserStory().getStories(), 0, LJII(i, awemeLJI));
            } else {
                ListProtector.set(aweme.getUserStory().getStories(), 0, LJFF(awemeLJI));
            }
        }
    }
}
