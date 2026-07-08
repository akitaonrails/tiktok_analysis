package X;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0d99, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1039090d99 extends WebChromeClient {
    public View LIZ;
    public final /* synthetic */ C1039050d95 LIZIZ;

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        C1028030crJ c1028030crJ;
        C1028020crI c1028020crI;
        Integer numLIZJ;
        C1028030crJ c1028030crJ2;
        ViewGroup viewGroup;
        View view = this.LIZIZ.LLILLJJLI;
        if (view != null && (viewGroup = (ViewGroup) view.findViewById(R.id.vs5)) != null) {
            C786410Ut5.LJJJLZIJ(this.LIZ, viewGroup);
        }
        this.LIZ = null;
        C1039050d95 c1039050d95 = this.LIZIZ;
        C1038730d8Z c1038730d8Z = c1039050d95.LLJ;
        if (!((c1038730d8Z == null || (c1028030crJ2 = c1038730d8Z.LJJIJLIJ) == null) ? false : Intrinsics.LJFF(c1028030crJ2.LIZJ(), Boolean.TRUE))) {
            C12ES.LJIILL(8, c1039050d95.LLILZIL);
            C12ES.LJIILL(8, c1039050d95.LLILZ);
            return;
        }
        C1038730d8Z c1038730d8Z2 = c1039050d95.LLJ;
        if (c1038730d8Z2 != null && (c1028020crI = c1038730d8Z2.LJJ) != null && (numLIZJ = c1028020crI.LIZJ()) != null && numLIZJ.intValue() == 1) {
            C12ES.LJIILL(8, c1039050d95.LLILZIL);
            C12ES.LJIILL(0, c1039050d95.LLILZ);
            C12ES.LJIILL(0, c1039050d95.LLILLL);
            return;
        }
        C1038730d8Z c1038730d8Z3 = c1039050d95.LLJ;
        if (c1038730d8Z3 == null || (c1028030crJ = c1038730d8Z3.LIZLLL) == null || !Intrinsics.LJFF(c1028030crJ.LIZJ(), Boolean.TRUE)) {
            C12ES.LJIILL(0, c1039050d95.LLILLL);
            C12ES.LJIILL(0, c1039050d95.LLILZIL);
        }
    }

    public C1039090d99(C1039050d95 c1039050d95) {
        this.LIZIZ = c1039050d95;
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        ViewGroup viewGroup;
        this.LIZ = view;
        View view2 = this.LIZIZ.LLILLJJLI;
        if (view2 != null && (viewGroup = (ViewGroup) view2.findViewById(R.id.vs5)) != null) {
            viewGroup.addView(this.LIZ);
        }
        C1039050d95 c1039050d95 = this.LIZIZ;
        C12ES.LJIILL(8, c1039050d95.LLILLL);
        C12ES.LJIILL(8, c1039050d95.LLILZIL);
    }
}
