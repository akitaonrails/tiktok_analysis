package X;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.03Ha, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C816803Ha extends C09AY implements Function0<TuxTextView> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C816803Ha(Context context) {
        super(0);
        this.LL = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ TuxTextView invoke() {
        TuxTextView tuxTextView = new TuxTextView(this.LL, null, 6, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        tuxTextView.setId(R.id.p28);
        layoutParams.gravity = 1;
        C786410Ut5.R6(tuxTextView, layoutParams);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setFocusable(true);
        tuxTextView.setMaxLines(1);
        C786410Ut5.LLLLZLL(tuxTextView, 8);
        C426750GoL.LJIIL(tuxTextView, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null, null, 29);
        return tuxTextView;
    }
}
