package X;

import Y.ACListenerS150S0100000_15;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3RemindStyle;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0aJt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C930430aJt extends AbstractC960470b6L<C929130aHn> {
    public final Function0<Unit> LL;
    public final Function0<Unit> LLILLJJLI;
    public final ViewGroup LLILLL;
    public final TextView LLILZ;
    public final TextView LLILZIL;
    public final ImageView LLILZLL;
    public final TextView LLIZ;

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        C929130aHn c929130aHn = (C929130aHn) obj;
        C923090a83 c923090a83Invoke = c929130aHn.LIZIZ.invoke();
        if (c923090a83Invoke == null || c923090a83Invoke.LIZ.length() == 0 || (MultiGuestV3RemindStyle.INSTANCE.getValue() == 1 && u.LJIJI(c923090a83Invoke.LIZ, CardStruct.IStatusCode.DEFAULT, true))) {
            ViewGroup viewGroup = this.LLILLL;
            if (viewGroup != null) {
                C08QT c08qt = new C08QT(C09RB.LJIIIZ(new C09RD(viewGroup), AFwS236S0000000_6.get$arr$(29)));
                while (c08qt.hasNext()) {
                    C786410Ut5.LJLLLLLL(8, (View) c08qt.next());
                }
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = this.LLILLL;
        if (viewGroup2 != null) {
            C08QT c08qt2 = new C08QT(C09RB.LJIIIZ(new C09RD(viewGroup2), AFwS236S0000000_6.get$arr$(30)));
            while (c08qt2.hasNext()) {
                C786410Ut5.LJLLLLLL(0, (View) c08qt2.next());
            }
        }
        TextView textView = this.LLILZ;
        if (textView != null) {
            textView.setText(c923090a83Invoke.LIZ);
        }
        TextView textView2 = this.LLILZIL;
        if (textView2 != null) {
            textView2.setText(":");
        }
        if (c929130aHn.LIZ && MultiGuestV3RemindStyle.INSTANCE.getValue() != 3) {
            TextView textView3 = this.LLIZ;
            if (textView3 != null) {
                C786410Ut5.LLIL(textView3, 8);
            }
        } else {
            TextView textView4 = this.LLIZ;
            if (textView4 != null) {
                C786410Ut5.LLIL(textView4, 0);
            }
            TextView textView5 = this.LLIZ;
            if (textView5 != null) {
                textView5.setText(c923090a83Invoke.LIZJ);
            }
            Function0<Unit> function0 = this.LL;
            if (function0 != null) {
                function0.invoke();
            }
        }
        ImageView imageView = this.LLILZLL;
        if (imageView != null) {
            C786410Ut5.Q7(imageView, new ACListenerS150S0100000_15(this, 20));
        }
    }

    public C930430aJt(View view, Function0<Unit> function0, Function0<Unit> function02) {
        super(view);
        this.LL = function0;
        this.LLILLJJLI = function02;
        this.LLILLL = (ViewGroup) view.findViewById(R.id.j_v);
        this.LLILZ = (TextView) view.findViewById(R.id.ja1);
        this.LLILZIL = (TextView) view.findViewById(R.id.j_x);
        this.LLILZLL = (ImageView) view.findViewById(R.id.ja2);
        this.LLIZ = (TextView) view.findViewById(R.id.j_y);
    }
}
