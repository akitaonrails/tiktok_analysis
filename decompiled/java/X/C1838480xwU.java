package X;

import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xwU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1838480xwU extends C09AY implements Function0<LinearLayout> {
    public final /* synthetic */ C1838450xwR LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1838480xwU(C1838450xwR c1838450xwR) {
        super(0);
        this.LL = c1838450xwR;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, android.widget.LinearLayout] */
    @Override // kotlin.jvm.functions.Function0
    public final LinearLayout invoke() {
        View view = this.LL.LLILLJJLI;
        if (view != null) {
            return view.findViewById(R.id.wdh);
        }
        return null;
    }
}
