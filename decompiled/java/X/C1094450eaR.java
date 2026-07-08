package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.user_level.GradeConfig;
import tikcast.api.user_level.GradeScoreRule;
import tikcast.api.user_level.GradeShowConfig;
import tikcast.api.user_level.UpgradeBarrageEffectConfig;
import tikcast.api.user_level.UpgradeEffectConfig;
import tikcast.api.user_level.UserGrade;

/* JADX INFO: renamed from: X.0eaR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1094450eaR {
    public static C1094360eaI LIZ;
    public static UserGrade LIZIZ;
    public static boolean LIZJ;
    public static final Map<Integer, GradeScoreRule> LIZLLL = new LinkedHashMap();
    public static final Map<Integer, Integer> LJ = new LinkedHashMap();
    public static final Map<Integer, ImageModel> LJFF = new LinkedHashMap();
    public static final Map<Integer, String> LJI = new LinkedHashMap();
    public static final List<Integer> LJII = new ArrayList();
    public static int LJIIIIZZ = 1;
    public static String LJIIIZ = "";
    public static String LJIIJ = C2273311DyT.LIZ(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentLocale());

    public static boolean LIZ() {
        boolean z = !Intrinsics.LJFF(LJIIJ, C2273311DyT.LIZ(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentLocale()));
        if (z) {
            LJIIJ = C2273311DyT.LIZ(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentLocale());
        }
        return z;
    }

    public static void LIZIZ(List list) {
        int i;
        UpgradeEffectConfig upgradeEffectConfig;
        GradeScoreRule gradeScoreRule;
        if (!LIZJ) {
            if ((!(!LIZLLL.isEmpty()) || !(!LJ.isEmpty())) && list != null && !list.isEmpty()) {
                ((ArrayList) LJII).clear();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    GradeConfig gradeConfig = (GradeConfig) it2.next();
                    Integer numValueOf = null;
                    if (gradeConfig != null && (gradeScoreRule = gradeConfig.gradeScore) != null) {
                        numValueOf = Integer.valueOf(gradeScoreRule.grade);
                    }
                    if (numValueOf != null) {
                        GradeScoreRule gradeScoreRule2 = gradeConfig.gradeScore;
                        if (gradeScoreRule2 != null) {
                            LIZLLL.put(Integer.valueOf(gradeScoreRule2.grade), gradeScoreRule2);
                            LJIIIIZZ = Math.max(LJIIIIZZ, gradeScoreRule2.grade);
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } else if (gradeConfig == null) {
                        continue;
                    }
                    UpgradeBarrageEffectConfig upgradeBarrageEffectConfig = gradeConfig.barrageEffect;
                    if (upgradeBarrageEffectConfig != null) {
                        if (Integer.valueOf(upgradeBarrageEffectConfig.grade) != null) {
                            UpgradeBarrageEffectConfig upgradeBarrageEffectConfig2 = gradeConfig.barrageEffect;
                            if (upgradeBarrageEffectConfig2 != null) {
                                LJ.put(Integer.valueOf(upgradeBarrageEffectConfig2.grade), Integer.valueOf(upgradeBarrageEffectConfig2.displayConfig));
                            } else {
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        } else if (gradeConfig == null) {
                            continue;
                        }
                    }
                    GradeShowConfig gradeShowConfig = gradeConfig.showConfig;
                    if (gradeShowConfig != null) {
                        if (Integer.valueOf(gradeShowConfig.grade) != null) {
                            GradeShowConfig gradeShowConfig2 = gradeConfig.showConfig;
                            if (gradeShowConfig2 != null) {
                                LJFF.put(Integer.valueOf(gradeShowConfig2.grade), gradeShowConfig2.badgeIconLite);
                                LJI.put(Integer.valueOf(gradeShowConfig2.grade), gradeShowConfig2.avatarBorderColor);
                            } else {
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        } else if (gradeConfig != null) {
                        }
                    }
                    UpgradeEffectConfig upgradeEffectConfig2 = gradeConfig.upgradeEffect;
                    if (upgradeEffectConfig2 != null && Integer.valueOf(upgradeEffectConfig2.grade) != null) {
                        List<Integer> list2 = LJII;
                        if (gradeConfig != null && (upgradeEffectConfig = gradeConfig.upgradeEffect) != null) {
                            i = upgradeEffectConfig.grade;
                        } else {
                            i = 0;
                        }
                        ((ArrayList) list2).add(Integer.valueOf(i));
                    }
                }
                if (!(!LIZLLL.isEmpty()) || !(!LJ.isEmpty())) {
                    return;
                }
                LIZJ = true;
            }
        }
    }
}
