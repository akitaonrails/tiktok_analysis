package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nimblecard.tako.model.CardData;
import com.ss.android.ugc.aweme.nimblecard.tako.model.ConditionNode;
import com.ss.android.ugc.aweme.nimblecard.tako.model.TemplateData;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14NV, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14NV {
    public static final boolean LIZ(TemplateData templateData) {
        String str;
        String str2 = null;
        if (templateData != null) {
            str = templateData.variable;
        } else {
            str = null;
        }
        if (C123100dR.LIZ(str) && templateData != null && templateData.loopVariables != null) {
            if (templateData != null) {
                str2 = templateData.loopType;
            }
            if (Intrinsics.LJFF(str2, "_for")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final CardData LIZIZ(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            C1227904rF.LIZ.getClass();
            return (CardData) C1227904rF.LIZLLL().LJII(str, CardData.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final void LIZJ(TemplateData templateData, AFwS274S0000000_30 aFwS274S0000000_30) {
        if (templateData == null) {
            return;
        }
        aFwS274S0000000_30.invoke(templateData);
        List<TemplateData> list = templateData.children;
        if (list != null) {
            Iterator<TemplateData> it2 = list.iterator();
            while (it2.hasNext()) {
                LIZJ(it2.next(), aFwS274S0000000_30);
            }
        }
        List<ConditionNode> list2 = templateData.conditions;
        if (list2 != null) {
            Iterator<ConditionNode> it3 = list2.iterator();
            while (it3.hasNext()) {
                LIZJ(it3.next().node, aFwS274S0000000_30);
            }
        }
    }
}
