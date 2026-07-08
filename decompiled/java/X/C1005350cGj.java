package X;

import Y.ACListenerS151S0100000_16;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.component.textmore.AnoleTextMoreAIData;
import com.ss.android.ugc.aweme.component.textmore.AnoleTextMoreAIItemData;
import java.util.Map;

/* JADX INFO: renamed from: X.0cGj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1005350cGj extends AbstractC1014240cV4 {
    public final AnoleTextMoreAIData LLJLIL;

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return new C1014500cVU(true, "");
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LJ() {
        super.LJ();
    }

    @Override // X.AbstractC1014240cV4
    public final void LJII(AnoleComponentAppearModel anoleComponentAppearModel) {
        super.LJII(anoleComponentAppearModel);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Fk(ViewGroup viewGroup, InterfaceC1014340cVE interfaceC1014340cVE) {
        String question;
        String title;
        super.Fk(viewGroup, interfaceC1014340cVE);
        Context context = viewGroup.getContext();
        if (context != null) {
            C0T9B c0t9b = new C0T9B(context);
            AnoleTextMoreAIData anoleTextMoreAIData = this.LLJLIL;
            if (anoleTextMoreAIData != null) {
                AnoleTextMoreAIItemData aiAgent = anoleTextMoreAIData.getAiAgent();
                if (aiAgent != null && (title = aiAgent.getTitle()) != null) {
                    c0t9b.LL.setText(title);
                }
                AnoleTextMoreAIItemData aiAgent2 = anoleTextMoreAIData.getAiAgent();
                if (aiAgent2 != null && (question = aiAgent2.getQuestion()) != null) {
                    c0t9b.LLILLJJLI.setText(question);
                }
            }
            this.LLJJIJIL = c0t9b;
            C786410Ut5.I7(new ACListenerS151S0100000_16(this, 57), c0t9b);
        }
    }

    public C1005350cGj(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context) {
        Object c098200Yq;
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            Map<String, ? extends Object> map = anoleComponentModel.data;
            c1227904rF.getClass();
            c098200Yq = (AnoleTextMoreAIData) C1227904rF.LIZIZ(C1227904rF.LJI(map), AnoleTextMoreAIData.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(anoleComponentModel.type);
            sbLIZ.append(": parse success");
            C2188811AlT.LIZIZ(sbLIZ);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(anoleComponentModel.type);
            sbLIZ2.append(": parse failed, reason = ");
            sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        this.LLJLIL = (AnoleTextMoreAIData) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }
}
