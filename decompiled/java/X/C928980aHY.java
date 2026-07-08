package X;

import Y.ACListenerS150S0100000_15;
import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aHY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C928980aHY extends AbstractC960470b6L<C1174704if> {
    public final Function0<Unit> LL;
    public final LiveIconView LLILLJJLI;
    public final C16F5 LLILLL;

    public C928980aHY(View view, Function0<Unit> function0) {
        super(view);
        this.LL = function0;
        this.LLILLJJLI = (LiveIconView) view.findViewById(R.id.o34);
        this.LLILLL = (C16F5) view.findViewById(R.id.o33);
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        this.LLILLL.setText(((C1174704if) obj).LIZ);
        C786410Ut5.g8(this.LLILLJJLI, new ACListenerS150S0100000_15(this, 22));
    }
}
