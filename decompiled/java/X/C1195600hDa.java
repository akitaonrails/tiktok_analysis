package X;

import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hDa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1195600hDa {
    public final View LIZ;
    public final EnumC1195620hDc LIZIZ;
    public final Function1<C1174900ggC, Unit> LIZJ;
    public C1174900ggC LIZLLL;
    public boolean LJ;

    public final void LIZ() {
        C1174900ggC c1174900ggC;
        if (!this.LIZ.isAttachedToWindow() || this.LIZ.getWindowToken() == null || (c1174900ggC = this.LIZLLL) == null) {
            return;
        }
        if (!this.LJ) {
            View view = this.LIZ;
            EnumC1195620hDc enumC1195620hDc = this.LIZIZ;
            C2344009Gk c2344009Gk = new C2344009Gk();
            Map<String, String> map = c1174900ggC.LIZJ;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    c2344009Gk.LJFF(entry.getKey(), entry.getValue());
                }
            }
            c2344009Gk.LJIIIIZZ("current_page", c1174900ggC.LIZ);
            c2344009Gk.LJIIIIZZ("current_scene", c1174900ggC.LIZIZ);
            c2344009Gk.LJIIIIZZ("tech_type", "native");
            c2344009Gk.LJFF("component_type", enumC1195620hDc.getValue());
            C1185040gwY c1185040gwY = C1185040gwY.LIZ;
            Map<String, String> map2 = c2344009Gk.LIZ;
            C1185050gwZ c1185050gwZ = new C1185050gwZ(PageFinder.via(view));
            c1185040gwY.getClass();
            C1185040gwY.LIZIZ("ttls_standard_ui_component_show", map2, c1185050gwZ);
            this.LJ = true;
        }
        Function1<C1174900ggC, Unit> function1 = this.LIZJ;
        if (function1 != null) {
            function1.invoke(c1174900ggC);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1195600hDa(View view, EnumC1195620hDc enumC1195620hDc, Function1<? super C1174900ggC, Unit> function1) {
        this.LIZ = view;
        this.LIZIZ = enumC1195620hDc;
        this.LIZJ = function1;
    }
}
