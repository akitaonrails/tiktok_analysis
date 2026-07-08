package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bOc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C971800bOc extends AbstractC960470b6L<C354101Zb> {
    public final Function0<C971810bOd> LL;
    public final View LLILLJJLI;
    public final C15P4 LLILLL;
    public final LiveIconView LLILZ;
    public final TextView LLILZIL;
    public final View LLILZLL;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L5(X.C354101Zb r8) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C971800bOc.L5(X.01Zb):void");
    }

    public C971800bOc(View view, Function0<C971810bOd> function0) {
        super(view);
        this.LL = function0;
        this.LLILLJJLI = view.findViewById(R.id.tsc);
        C15P4 c15p4 = (C15P4) view.findViewById(R.id.xng);
        if (c15p4 != null) {
            c15p4.LJIILIIL();
        } else {
            c15p4 = null;
        }
        this.LLILLL = c15p4;
        this.LLILZ = (LiveIconView) view.findViewById(R.id.xnh);
        this.LLILZIL = (TextView) view.findViewById(R.id.xni);
        this.LLILZLL = view.findViewById(R.id.xnf);
    }

    @Override // X.AbstractC960470b6L
    public final /* bridge */ /* synthetic */ void I5(int i, Object obj) {
        L5((C354101Zb) obj);
    }
}
