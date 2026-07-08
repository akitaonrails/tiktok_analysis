package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0SVW, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SVW extends FrameLayout implements InterfaceC722460SVo<C0SVX> {
    public final View LL;
    public final TuxIconView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;

    public final void LIZ(C0SVX c0svx) {
        boolean z;
        Integer num;
        C0SVT c0svt = c0svx.LIZ;
        if (c0svt != null) {
            int i = c0svt.LIZ;
            if (i == C0SXM.IMAGE.ordinal()) {
                int i2 = c0svt.LIZIZ;
                if (i2 != -1) {
                    this.LL.setBackgroundResource(i2);
                }
            } else if (i == C0SXM.COLOR.ordinal() && (num = c0svt.LIZJ) != null) {
                this.LL.setBackgroundColor(num.intValue());
            }
        } else {
            this.LL.setBackground(null);
        }
        String str = c0svx.LIZIZ;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            this.LLILLL.setText(c0svx.LIZIZ);
            Integer num2 = c0svx.LIZJ;
            if (num2 != null) {
                this.LLILLL.setTuxFont(num2.intValue());
            }
            C786410Ut5.LLLLZLL(this.LLILLL, 0);
        } else {
            C786410Ut5.LLLLZLL(this.LLILLL, 8);
        }
        C722300SUy c722300SUy = c0svx.LIZLLL;
        if (c722300SUy != null) {
            if (c722300SUy.LIZ == C0SV1.LOCAL.ordinal()) {
                int i3 = c722300SUy.LIZIZ;
                if (i3 != -1) {
                    this.LLILLJJLI.setIconRes(i3);
                }
                Integer num3 = c722300SUy.LIZJ;
                if (num3 != null) {
                    this.LLILLJJLI.setTintColor(num3.intValue());
                }
            } else {
                C0SV1.REMOTE.ordinal();
            }
            C786410Ut5.LLLLLLZZ(this.LLILLJJLI, 0);
        } else {
            C786410Ut5.LLLLLLZZ(this.LLILLJJLI, 8);
        }
        C786410Ut5.LLLLZLL(this.LLILZ, 8);
    }

    public C0SVW(Context context, C0SVX c0svx) {
        super(context);
        View viewSd = C786410Ut5.Sd(R.layout.i3b, C786410Ut5.ne(context), this);
        this.LL = viewSd;
        this.LLILLJJLI = (TuxIconView) viewSd.findViewById(R.id.dfb);
        this.LLILLL = (TuxTextView) viewSd.findViewById(R.id.dfc);
        this.LLILZ = (TuxTextView) viewSd.findViewById(R.id.yzc);
        LIZ(c0svx);
    }

    @Override // X.InterfaceC722460SVo
    public final /* bridge */ /* synthetic */ void LLLLZLLLI(InterfaceC722440SVm interfaceC722440SVm, C07XH c07xh) {
        LIZ((C0SVX) c07xh);
    }
}
