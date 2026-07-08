package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.nimblecard.tako.context.NimbleTemplateContext;
import com.ss.android.ugc.aweme.nimblecard.tako.element.list.NimbleListICell;
import com.ss.android.ugc.aweme.nimblecard.tako.model.ConditionNode;
import com.ss.android.ugc.aweme.nimblecard.tako.model.Layout;
import com.ss.android.ugc.aweme.nimblecard.tako.model.TemplateData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14NU, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C14NU extends C14NT<C20254714Nd> {
    public int LJIIL;

    public abstract void LJJIIZ();

    public abstract void LJJIIZI();

    public final void LJJIJ() {
        List<TemplateData> list;
        TemplateData templateData;
        int i;
        TemplateData templateData2 = this.LJIIIZ;
        if (templateData2 == null || (list = templateData2.children) == null || (templateData = (TemplateData) C13LP.LJJJLZIJ(0, list)) == null) {
            return;
        }
        C1701410uNP c1701410uNP = C1701410uNP.LIZ;
        if (C1701410uNP.LIZIZ == 2000) {
            c1701410uNP.getClass();
            C1701410uNP.LIZIZ = 0;
            C1701410uNP.LIZJ = LSPassThroughRecordSizeConfig.DEFAULT;
        }
        synchronized (c1701410uNP) {
            try {
                i = C1701410uNP.LIZIZ;
                C1701410uNP.LIZIZ = i + 1;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LJIIL = i;
        if (!Intrinsics.LJFF(templateData.type, "If")) {
            int i2 = this.LJIIL;
            NimbleTemplateContext nimbleTemplateContext = this.LIZ;
            getView().LJIJ(new C1723500ux2(c1701410uNP.LIZ(new C14NL(i2, 0, templateData, nimbleTemplateContext.LLILZLL, nimbleTemplateContext.LLILZIL)), NimbleListICell.class));
            return;
        }
        List<ConditionNode> list2 = templateData.conditions;
        if (list2 != null) {
            int i3 = 0;
            for (ConditionNode conditionNode : list2) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                C1701410uNP c1701410uNP2 = C1701410uNP.LIZ;
                int i5 = this.LJIIL;
                TemplateData templateData3 = conditionNode.node;
                if (templateData3 == null) {
                    templateData3 = new TemplateData(null, null, new Layout(null, null, null, null, null, null, null, null, null, "auto", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), null, null, null, null, null, null, null);
                }
                NimbleTemplateContext nimbleTemplateContext2 = this.LIZ;
                getView().LJIJ(new C1723500ux2(c1701410uNP2.LIZ(new C14NL(i5, i3, templateData3, nimbleTemplateContext2.LLILZLL, nimbleTemplateContext2.LLILZIL)), NimbleListICell.class));
                i3 = i4;
            }
        }
    }

    public C14NU(NimbleTemplateContext nimbleTemplateContext) {
        super(nimbleTemplateContext);
        this.LJIIL = -1;
    }

    @Override // X.C14NT, X.C14NX
    public final void LJII(TemplateData templateData) {
        List<TemplateData> list;
        super.LJII(templateData);
        if (templateData != null && (list = templateData.children) != null && C13LP.LJJJLZIJ(0, list) != null) {
            LJJIIZI();
            LJJIIZ();
            LJJIJ();
        }
    }

    @Override // X.C14NT
    public final View LJJIII(final Context context) {
        return new ViewOnAttachStateChangeListenerC20604515jv(context) { // from class: X.14Nd
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:194:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:236:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005b  */
    @Override // X.C14NT, X.C14NX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(java.util.Map<java.lang.String, ? extends java.lang.Object> r70, X.C14NF r71) {
        /*
            Method dump skipped, instruction units count: 1002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14NU.LJIILJJIL(java.util.Map, X.14NF):void");
    }

    public static void LJJIJIIJI(int i, C20600815jK c20600815jK, List list) {
        if (i < 0 || i > c20600815jK.LJIIIIZZ()) {
            return;
        }
        while (c20600815jK.LJIIIIZZ() > i) {
            C20600815jK.LJIILIIL(c20600815jK, c20600815jK.LJIIIIZZ() - 1);
        }
        c20600815jK.LIZLLL(list, null);
    }
}
