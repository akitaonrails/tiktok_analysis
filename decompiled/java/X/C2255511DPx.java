package X;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1DPx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2255511DPx extends C09AY implements Function0<AbstractC1868910yjZ> {
    public final /* synthetic */ C2255521DPy LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2255511DPx(C2255521DPy c2255521DPy, View view) {
        super(0);
        this.LL = c2255521DPy;
        this.LLILLJJLI = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AbstractC1868910yjZ invoke() {
        C2255521DPy c2255521DPy = this.LL;
        View view = this.LLILLJJLI;
        c2255521DPy.getClass();
        ArrayList arrayList = new ArrayList();
        Rect rectLIZ = C990860btM.LIZ(view);
        for (Map.Entry entry : ((LinkedHashMap) c2255521DPy.LIZ).entrySet()) {
            Object key = entry.getKey();
            View view2 = (View) ((Reference) entry.getValue()).get();
            if (view2 != null && view2.isAttachedToWindow() && view2.getWindowToken() != null && view2.getVisibility() == 0 && view2.getAlpha() > 0.001d) {
                Rect rectLIZ2 = C990860btM.LIZ(view2);
                if (rectLIZ2.left < rectLIZ.right && rectLIZ2.right > rectLIZ.left && rectLIZ2.top < rectLIZ.bottom && rectLIZ2.bottom > rectLIZ.top) {
                    arrayList.add(key);
                }
            }
        }
        return arrayList.isEmpty() ? C1868900yjY.LIZ : new C1868880yjW(new C1013710cUD(arrayList));
    }
}
