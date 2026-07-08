package X;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0TTo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C747420TTo implements InterfaceC1892990zMP {
    public C038V LL;

    @Override // X.InterfaceC1892990zMP
    public final void LJJLIIIJ(boolean z) {
    }

    @Override // X.InterfaceC1163130gND
    public final void release() {
        this.LL = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.038V, android.view.View] */
    @Override // X.InterfaceC1892990zMP
    public final View LJFF(final Context context) {
        ?? r0 = new FrameLayout(context) { // from class: X.038V
            {
                super(context, null, 0);
                C786410Ut5.Td(C786410Ut5.ne(context), R.layout.f_z, this, true);
            }
        };
        this.LL = r0;
        return r0;
    }

    @Override // X.InterfaceC1892990zMP
    public final void LJIILL(int i) {
        TextView textView;
        C038V c038v = this.LL;
        if (c038v != null && (textView = (TextView) c038v.findViewById(R.id.tv_title)) != null) {
            textView.setTextColor(i);
        }
    }

    @Override // X.InterfaceC1892990zMP
    public final void LJJIFFI(EnumC1067700dtI enumC1067700dtI) {
        TextView textView;
        C038V c038v = this.LL;
        if (c038v != null) {
            textView = (TextView) c038v.findViewById(R.id.cs9);
        } else {
            textView = null;
        }
        int i = C1067710dtJ.LIZ[enumC1067700dtI.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4 && textView != null) {
                        C786410Ut5.LLIL(textView, 0);
                        textView.setText("Share");
                        return;
                    }
                    return;
                }
                if (textView == null) {
                    return;
                }
                C786410Ut5.LLIL(textView, 0);
                textView.setText("Collect");
                return;
            }
            if (textView == null) {
                return;
            }
            C786410Ut5.LLIL(textView, 0);
            textView.setText("Report");
            return;
        }
        if (textView == null) {
            return;
        }
        C786410Ut5.LLIL(textView, 8);
    }

    @Override // X.InterfaceC1892990zMP
    public final void LJJII(boolean z) {
        ImageView imageView;
        int i;
        C038V c038v = this.LL;
        if (c038v != null && (imageView = (ImageView) c038v.findViewById(R.id.l_a)) != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJZI(i, imageView);
        }
    }

    @Override // X.InterfaceC1892990zMP
    public final void LJJIJLIJ(SpannableString spannableString) {
        setSubTitle(spannableString.toString());
    }

    @Override // X.InterfaceC1892990zMP
    public final void LJJJI(int i) {
        View viewFindViewById;
        C038V c038v = this.LL;
        if (c038v != null && (viewFindViewById = c038v.findViewById(R.id.y3v)) != null) {
            viewFindViewById.setBackgroundColor(i);
        }
    }

    @Override // X.InterfaceC1892990zMP
    public final void LJJJJ(boolean z) {
        ImageView imageView;
        int i;
        C038V c038v = this.LL;
        if (c038v != null && (imageView = (ImageView) c038v.findViewById(R.id.lc1)) != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJZI(i, imageView);
        }
    }

    @Override // X.InterfaceC1892990zMP
    public void setBackClickListener(View.OnClickListener onClickListener) {
        ImageView imageView;
        C038V c038v = this.LL;
        if (c038v != null && (imageView = (ImageView) c038v.findViewById(R.id.l_a)) != null) {
            C786410Ut5.Q7(imageView, onClickListener);
        }
    }

    @Override // X.InterfaceC1892990zMP
    public final void setCloseAllClickListener(View.OnClickListener onClickListener) {
        ImageView imageView;
        C038V c038v = this.LL;
        if (c038v != null && (imageView = (ImageView) c038v.findViewById(R.id.lc1)) != null) {
            C786410Ut5.Q7(imageView, onClickListener);
        }
    }

    @Override // X.InterfaceC1892990zMP
    public final void setSubTitle(String str) {
        TextView textView;
        C038V c038v = this.LL;
        if (c038v != null && (textView = (TextView) c038v.findViewById(R.id.tv_sub_title)) != null) {
            textView.setText(str);
            C786410Ut5.LLIL(textView, 0);
        }
    }

    @Override // X.InterfaceC1892990zMP
    public final void setTitle(String str) {
        TextView textView;
        C038V c038v = this.LL;
        if (c038v != null && (textView = (TextView) c038v.findViewById(R.id.tv_title)) != null) {
            textView.setText(str);
            C786410Ut5.LLIL(textView, 0);
        }
    }
}
