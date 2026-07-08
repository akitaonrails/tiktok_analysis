package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.06MD, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06MD extends LinearLayout implements C06OA {
    public final /* synthetic */ C06ME LL;
    public TuxTextView LLILLJJLI;

    @Override // X.C06OA
    public final void LLLZIL(C06MF c06mf) {
        this.LL.LLLZIL(c06mf);
    }

    @Override // X.C06OA
    public final void LLZLI() {
        this.LL.LLZLI();
    }

    @Override // X.C06OA
    public final void l(C06MF c06mf) {
        this.LL.l(c06mf);
    }

    public final void setUsername(String str) {
        String string;
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = (TuxTextView) findViewById(R.id.title);
        }
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            if (str != null && str.length() != 0) {
                string = C786410Ut5.j4(getContext().getString(2131831688), new Object[]{str});
            } else {
                string = getContext().getString(2131831686);
            }
            tuxTextView.setText(string);
        }
    }

    public C06MD(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet, 0);
        this.LL = new C06ME();
        if (C1665706ff.LIZJ.LJIIIIZZ()) {
            i = R.layout.cgd;
        } else {
            i = R.layout.cgc;
        }
        C786410Ut5.LJLLJ(context, i, this);
        ImageView imageView = (ImageView) findViewById(R.id.loh);
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.za;
        imageView.setImageDrawable(c0hti.LIZ(context));
    }
}
