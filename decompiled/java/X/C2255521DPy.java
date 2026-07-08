package X;

import android.graphics.Rect;
import android.view.View;
import com.ss.android.ugc.aweme.commercialize.service.IComponentShowStatusExamine;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS436S0200000_35;

/* JADX INFO: renamed from: X.1DPy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2255521DPy implements IComponentShowStatusExamine {
    public final Map<AbstractC1000340c8e, WeakReference<View>> LIZ = new LinkedHashMap();
    public WeakReference<View> LIZIZ;

    @Override // com.ss.android.ugc.aweme.commercialize.service.IComponentShowStatusExamine
    public final void clear() {
        C1022620cia.LIZ("ComponentShowStatusExamineImpl", "clear");
        ((LinkedHashMap) this.LIZ).clear();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IComponentShowStatusExamine
    public final void Ys(View view) {
        this.LIZIZ = new WeakReference<>(view);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IComponentShowStatusExamine
    public final void Zs(C1000350c8f c1000350c8f) {
        String string = c1000350c8f.toString();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeComponent: componentId -> ");
        sbLIZ.append(string);
        C1022620cia.LIZ("ComponentShowStatusExamineImpl", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ.remove(c1000350c8f);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("removeComponent: num of componentRectMap -> ");
        sbLIZ2.append(this.LIZ.size());
        C1022620cia.LIZ("ComponentShowStatusExamineImpl", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IComponentShowStatusExamine
    public final void at(AbstractC1000340c8e abstractC1000340c8e, View view, Function1<? super AbstractC2255531DPz, Unit> function1) {
        Rect rectLIZ = C990860btM.LIZ(view);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addComponent: componentID -> ");
        sbLIZ.append(abstractC1000340c8e);
        sbLIZ.append(", currentPosition -> ");
        sbLIZ.append(rectLIZ);
        C1022620cia.LIZ("ComponentShowStatusExamineImpl", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ.remove(abstractC1000340c8e);
        AbstractC1868910yjZ abstractC1868910yjZLIZ = C1868890yjX.LIZ.LIZ(new AwS436S0200000_35(this, view, 90)).LIZ(new AwS436S0200000_35(this, view, 91)).LIZ(new C2255511DPx(this, view));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("addComponent examinationResult: ");
        sbLIZ2.append(abstractC1868910yjZLIZ);
        C1022620cia.LIZ("ComponentShowStatusExamineImpl", C2188811AlT.LIZIZ(sbLIZ2));
        if (abstractC1868910yjZLIZ instanceof C1868880yjW) {
            function1.invoke(((C1868880yjW) abstractC1868910yjZLIZ).LIZ);
        }
        this.LIZ.put(abstractC1000340c8e, new WeakReference<>(view));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("addComponent before clear: num of componentRectMap -> ");
        sbLIZ3.append(this.LIZ.size());
        C1022620cia.LIZ("ComponentShowStatusExamineImpl", C2188811AlT.LIZIZ(sbLIZ3));
        Iterator it2 = ((LinkedHashMap) this.LIZ).entrySet().iterator();
        while (it2.hasNext()) {
            View view2 = (View) ((Reference) ((Map.Entry) it2.next()).getValue()).get();
            if (view2 == null || !view2.isAttachedToWindow() || view2.getWindowToken() == null) {
                it2.remove();
            }
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("addComponent after clear: num of componentRectMap -> ");
        sbLIZ4.append(this.LIZ.size());
        C1022620cia.LIZ("ComponentShowStatusExamineImpl", C2188811AlT.LIZIZ(sbLIZ4));
    }
}
