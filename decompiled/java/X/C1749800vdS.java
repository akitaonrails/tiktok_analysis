package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vdS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1749800vdS extends LinearLayout implements InterfaceC1749810vdT {
    public final TuxIconView LL;
    public final TuxTextView LLILLJJLI;
    public final TuxIconView LLILLL;

    public C1749800vdS(Context context) {
        super(context, null, 0);
        C786410Ut5.Sd(R.layout.ayo, C786410Ut5.ne(context), this);
        this.LL = (TuxIconView) findViewById(R.id.v8e);
        this.LLILLJJLI = (TuxTextView) findViewById(R.id.v8f);
        this.LLILLL = (TuxIconView) findViewById(R.id.v8d);
    }

    @Override // X.InterfaceC1749810vdT
    public void setContent(C1769140w8e c1769140w8e) {
        TuxTextView tuxTextView;
        TuxIconView tuxIconView;
        TuxTextView tuxTextView2;
        Bitmap bitmap = c1769140w8e.LIZJ;
        if (bitmap != null) {
            TuxIconView tuxIconView2 = this.LL;
            if (tuxIconView2 != null) {
                tuxIconView2.setImageDrawable(new BitmapDrawable(getContext().getResources(), bitmap));
            }
            TuxIconView tuxIconView3 = this.LL;
            if (tuxIconView3 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
            }
        }
        String str = c1769140w8e.LIZLLL;
        if (str != null) {
            TuxTextView tuxTextView3 = this.LLILLJJLI;
            if (tuxTextView3 != null) {
                tuxTextView3.setText(str);
            }
            TuxTextView tuxTextView4 = this.LLILLJJLI;
            if (tuxTextView4 != null) {
                C786410Ut5.LLLLZLL(tuxTextView4, 0);
            }
            if (c1769140w8e.LJIIJJI == EnumC2003907t7.WHITE_BG_DARK_CONTENT && (tuxTextView2 = this.LLILLJJLI) != null) {
                tuxTextView2.setTextColorRes(R.attr.d9);
            }
        }
        if (Intrinsics.LJFF(c1769140w8e.LJFF, Boolean.TRUE)) {
            TuxIconView tuxIconView4 = this.LLILLL;
            if (tuxIconView4 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView4, 0);
            }
            if (c1769140w8e.LJIIJJI == EnumC2003907t7.WHITE_BG_DARK_CONTENT && (tuxIconView = this.LLILLL) != null) {
                tuxIconView.setTintColorRes(R.attr.d9);
            }
        }
        if (c1769140w8e.LIZJ == null && c1769140w8e.LIZLLL != null && (tuxTextView = this.LLILLJJLI) != null) {
            C426750GoL.LJIIIZ(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15))), false, 16);
        }
    }
}
