package X;

import android.content.Context;
import android.content.res.AssetManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.configuration.models.NUAbilityNode;
import com.ss.android.ugc.aweme.configuration.models.NUJConfig;
import com.ss.android.ugc.aweme.configuration.models.NUJDeepModel;
import com.ss.android.ugc.aweme.configuration.models.NUJFlow;
import com.ss.android.ugc.aweme.configuration.models.NUJTasks;
import defpackage.f9;
import defpackage.g9;
import defpackage.h9;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/* JADX INFO: renamed from: X.10QG, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10QG {
    public static final C10QG LIZ = new C10QG();

    public static AbstractC1153390g7V LIZ(g9 g9Var, boolean z) {
        Class cls;
        AbstractC1153390g7V abstractC1153390g7VLIZIZ;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        int i = C10QT.LIZ[g9Var.getType().ordinal()];
        boolean z2 = true;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        cls = NUJDeepModel.class;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    cls = NUJTasks.class;
                }
            } else {
                cls = NUJConfig.class;
            }
        } else {
            cls = NUJFlow.class;
        }
        if (z) {
            AbstractC1153390g7V abstractC1153390g7VLIZIZ2 = LIZIZ(contextLIZ, g9Var.getDefaultJson(), cls, g9Var.getType());
            abstractC1153390g7VLIZIZ2.LIZ = true;
            return abstractC1153390g7VLIZIZ2;
        }
        f9 f9Var = f9.LIZ;
        int id = g9Var.getId();
        f9Var.getClass();
        String strLIZIZ = f9.LIZIZ(id);
        if (C123100dR.LIZ(strLIZIZ)) {
            try {
                abstractC1153390g7VLIZIZ = (AbstractC1153390g7V) C7740030o.LIZ().getGson().LJII(strLIZIZ, cls);
                if (!LIZJ(g9Var, abstractC1153390g7VLIZIZ)) {
                    C19240010Ow.LIZ.getClass();
                    C19240010Ow.LIZIZ("config_incorrect");
                    abstractC1153390g7VLIZIZ = LIZIZ(contextLIZ, g9Var.getDefaultJson(), cls, g9Var.getType());
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C19240010Ow.LIZ.getClass();
                C19240010Ow.LIZIZ("syntax");
                abstractC1153390g7VLIZIZ = LIZIZ(contextLIZ, g9Var.getDefaultJson(), cls, g9Var.getType());
            }
        } else {
            C19240010Ow.LIZ.getClass();
            C19240010Ow.LIZIZ("empty");
            abstractC1153390g7VLIZIZ = LIZIZ(contextLIZ, g9Var.getDefaultJson(), cls, g9Var.getType());
        }
        abstractC1153390g7VLIZIZ.LIZ = z2;
        return abstractC1153390g7VLIZIZ;
    }

    public static boolean LIZJ(g9 g9Var, AbstractC1153390g7V abstractC1153390g7V) {
        NUJFlow nUJFlow;
        List<NUAbilityNode> list;
        boolean zIsEmpty;
        NUJConfig nUJConfig;
        List<NUAbilityNode> list2;
        NUJTasks nUJTasks;
        List<NUAbilityNode> list3;
        NUJDeepModel nUJDeepModel;
        List<NUAbilityNode> list4;
        int i = C10QT.LIZ[g9Var.getType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if ((abstractC1153390g7V instanceof NUJDeepModel) && (nUJDeepModel = (NUJDeepModel) abstractC1153390g7V) != null && (list4 = nUJDeepModel.deep) != null) {
                            zIsEmpty = list4.isEmpty();
                        } else {
                            return false;
                        }
                    } else {
                        throw new C1954807lC();
                    }
                } else if ((abstractC1153390g7V instanceof NUJTasks) && (nUJTasks = (NUJTasks) abstractC1153390g7V) != null && (list3 = nUJTasks.tasks) != null) {
                    zIsEmpty = list3.isEmpty();
                } else {
                    return false;
                }
            } else if ((abstractC1153390g7V instanceof NUJConfig) && (nUJConfig = (NUJConfig) abstractC1153390g7V) != null && (list2 = nUJConfig.config) != null) {
                zIsEmpty = list2.isEmpty();
            } else {
                return false;
            }
        } else if ((abstractC1153390g7V instanceof NUJFlow) && (nUJFlow = (NUJFlow) abstractC1153390g7V) != null && (list = nUJFlow.flow) != null) {
            zIsEmpty = list.isEmpty();
        } else {
            return false;
        }
        return !zIsEmpty;
    }

    public static AbstractC1153390g7V LIZIZ(Context context, String str, Class cls, h9 h9Var) {
        try {
            AssetManager assets = context.getResources().getAssets();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("strategy/");
            sbLIZ.append(str);
            InputStream inputStreamOpen = assets.open(C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("UGConfigStrategy 「");
            sbLIZ2.append(str);
            sbLIZ2.append("」 using default config");
            C1911410zq7.LIZ("config_track", C2188811AlT.LIZIZ(sbLIZ2));
            return (AbstractC1153390g7V) C7740030o.LIZ().getGson().LJFF(new InputStreamReader(inputStreamOpen), cls);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C10QT.LIZ[h9Var.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return new NUJDeepModel(null, 1, null);
                        }
                        throw new C1954807lC();
                    }
                    return new NUJTasks(null, 1, null);
                }
                return new NUJConfig(null, 1, null);
            }
            return new NUJFlow(false, null, 3, null);
        }
    }
}
