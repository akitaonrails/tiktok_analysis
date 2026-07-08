package X;

import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0TNT, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TNT extends FrameLayout implements C0TNU {
    public static final int LLILZLL = 8;
    public C197039127h LL;
    public TextView LLILLJJLI;
    public C197039127h LLILLL;
    public LinearLayout LLILZ;
    public boolean LLILZIL;

    @Override // X.C0TNU, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    private final void LIZIZ() {
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.dog, this, true);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ohg);
        this.LLILZ = linearLayout;
        if (linearLayout != null) {
            C786410Ut5.LJZL(0, linearLayout);
        }
        C197039127h c197039127h = (C197039127h) findViewById(R.id.cu5);
        this.LL = c197039127h;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS147S0100000_12((Object) this, 254));
        }
        this.LLILLL = (C197039127h) findViewById(R.id.cmo);
        C197039127h c197039127h2 = this.LL;
        if (c197039127h2 != null) {
            c197039127h2.setButtonVariant(1);
        }
        TextView textView = (TextView) findViewById(R.id.cu7);
        this.LLILLJJLI = textView;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 8);
        }
    }

    public final C197039127h getAddVideoView() {
        return this.LLILLL;
    }

    public final LinearLayout getEditMixLayout() {
        return this.LLILZ;
    }

    public final TextView getRemoveConfirmView() {
        return this.LLILLJJLI;
    }

    public final C197039127h getRemoveView() {
        return this.LL;
    }

    public C0TNT(Context context) {
        this(context, null);
    }

    @Override // X.C0TNU
    public void cO(boolean z) {
        if (z) {
            this.LLILZIL = true;
            LinearLayout linearLayout = this.LLILZ;
            if (linearLayout != null) {
                C786410Ut5.LJZL(8, linearLayout);
            }
            TextView textView = this.LLILLJJLI;
            if (textView != null) {
                C786410Ut5.LLIL(textView, 0);
                return;
            }
            return;
        }
        this.LLILZIL = false;
        LinearLayout linearLayout2 = this.LLILZ;
        if (linearLayout2 != null) {
            C786410Ut5.LJZL(0, linearLayout2);
        }
        TextView textView2 = this.LLILLJJLI;
        if (textView2 == null) {
            return;
        }
        C786410Ut5.LLIL(textView2, 8);
    }

    public final void setAddVideoView(C197039127h c197039127h) {
        this.LLILLL = c197039127h;
    }

    public final void setEditMixLayout(LinearLayout linearLayout) {
        this.LLILZ = linearLayout;
    }

    public final void setRemoveConfirmView(TextView textView) {
        this.LLILLJJLI = textView;
    }

    public final void setRemoveView(C197039127h c197039127h) {
        this.LL = c197039127h;
    }

    @Override // X.C0TNU
    public void z6(int i) {
        boolean z;
        TextView textView = this.LLILLJJLI;
        if (textView != null) {
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            textView.setEnabled(z);
        }
        TextView textView2 = this.LLILLJJLI;
        if (textView2 != null) {
            textView2.setText(getResources().getQuantityString(2131755487, i, Integer.valueOf(i)));
        }
    }

    public C0TNT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LIZIZ();
    }
}
