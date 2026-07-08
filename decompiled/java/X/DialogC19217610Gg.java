package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.10Gg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class DialogC19217610Gg extends DialogC19728412Gs {
    public C19217710Gh LL;
    public String LLILLJJLI;

    public DialogC19217610Gg(Context context) {
        super(context, R.style.a02);
    }

    public final void LJJLIIIJLLLLLLLZ(String str) {
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        this.LLILLJJLI = str;
        C19217710Gh c19217710Gh = this.LL;
        if (c19217710Gh != null && (tuxTextView2 = c19217710Gh.LLILLL) != null) {
            tuxTextView2.setText(C336300DGi.LIZ(str));
        }
        C19217710Gh c19217710Gh2 = this.LL;
        if (c19217710Gh2 != null && (tuxTextView = c19217710Gh2.LLILLJJLI) != null) {
            tuxTextView.setText(C0D9L.LIZ(2131857537));
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        TuxTextView tuxTextView;
        C19217710Gh c19217710Gh;
        TuxTextView tuxTextView2;
        super.onCreate(bundle);
        requestWindowFeature(1);
        View viewTd = C786410Ut5.Td(getLayoutInflater(), R.layout.i3r, null, false);
        int i = R.id.erf;
        if (C1616006Uk.LIZ(R.id.erf, viewTd) != null) {
            i = R.id.lkw;
            if (C1616006Uk.LIZ(R.id.lkw, viewTd) != null) {
                i = R.id.zxa;
                TuxTextView tuxTextView3 = (TuxTextView) C1616006Uk.LIZ(R.id.zxa, viewTd);
                if (tuxTextView3 != null) {
                    i = R.id.tv_title;
                    TuxTextView tuxTextView4 = (TuxTextView) C1616006Uk.LIZ(R.id.tv_title, viewTd);
                    if (tuxTextView4 != null) {
                        FrameLayout frameLayout = (FrameLayout) viewTd;
                        C19217710Gh c19217710Gh2 = new C19217710Gh(frameLayout, tuxTextView3, tuxTextView4);
                        setContentView(frameLayout);
                        this.LL = c19217710Gh2;
                        Window window = getWindow();
                        if (window != null) {
                            window.setLayout(-1, -1);
                            window.setBackgroundDrawableResource(android.R.color.transparent);
                            window.setDimAmount(0.5f);
                        }
                        setCancelable(false);
                        setCanceledOnTouchOutside(false);
                        String str = this.LLILLJJLI;
                        if (str != null && (c19217710Gh = this.LL) != null && (tuxTextView2 = c19217710Gh.LLILLL) != null) {
                            tuxTextView2.setText(C336300DGi.LIZ(str));
                        }
                        C19217710Gh c19217710Gh3 = this.LL;
                        if (c19217710Gh3 != null && (tuxTextView = c19217710Gh3.LLILLJJLI) != null) {
                            tuxTextView.setText(C0D9L.LIZ(2131857537));
                            return;
                        }
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i)));
    }
}
