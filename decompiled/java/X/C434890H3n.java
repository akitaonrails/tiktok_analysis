package X;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0H3n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C434890H3n extends C09AY implements Function0<Unit> {
    public final /* synthetic */ TextView LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ C118300cf LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ C958330b2t LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C434890H3n(TextView textView, List<String> list, C118300cf c118300cf, View view, C958330b2t c958330b2t) {
        super(0);
        this.LL = textView;
        this.LLILLJJLI = list;
        this.LLILLL = c118300cf;
        this.LLILZ = view;
        this.LLILZIL = c958330b2t;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.setAutoSizeTextTypeWithDefaults(0);
        this.LL.setText((CharSequence) C13LP.LJJJLZIJ(this.LLILLL.element, this.LLILLJJLI));
        float fLIZ = C431560Gw6.LIZ(this.LL, 12, 10, this.LLILZ.getMeasuredWidth(), 0);
        if (fLIZ <= 0.0f) {
            fLIZ = this.LL.getTextSize();
        }
        List<TextView> list = this.LLILZIL.LLJIJIL;
        List<String> list2 = this.LLILLJJLI;
        int i = 0;
        for (Object obj : (ArrayList) list) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            TextView textView = (TextView) obj;
            textView.setAutoSizeTextTypeWithDefaults(0);
            textView.setText((CharSequence) C13LP.LJJJLZIJ(i, list2));
            textView.setTextSize(0, fLIZ);
            textView.invalidate();
            i = i2;
        }
        return Unit.LIZ;
    }
}
