package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.ecommerce.ug.backbutton.service.EcUgBackButtonServiceOfficial;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0J0Z, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J0Z implements Observer<Integer> {
    public final /* synthetic */ EcUgBackButtonServiceOfficial LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ View LLILLL;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Integer num) {
        int iIntValue;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2;
        int marginStart;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        Integer num2 = num;
        C14LC.LJIJ.removeObserver(this);
        if (num2 != null) {
            if (num2.intValue() <= 0) {
                C309690CBz.LIZ.getClass();
                iIntValue = C14LC.LIZIZ();
            } else {
                iIntValue = num2.intValue();
            }
            EcUgBackButtonServiceOfficial ecUgBackButtonServiceOfficial = this.LL;
            String str = this.LLILLJJLI;
            ecUgBackButtonServiceOfficial.getClass();
            if (Intrinsics.LJFF(str, "center_style")) {
                i = 26;
            } else {
                i = 28;
            }
            int iLIZIZ = iIntValue + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
            ViewGroup.LayoutParams layoutParams = this.LLILLL.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            int marginEnd = 0;
            if (marginLayoutParams != null) {
                i2 = marginLayoutParams.bottomMargin;
            } else {
                i2 = 0;
            }
            if (i2 != iLIZIZ) {
                View view = this.LLILLL;
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    marginStart = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart();
                } else {
                    marginStart = 0;
                }
                Integer numValueOf = Integer.valueOf(marginStart);
                ViewGroup.LayoutParams layoutParams3 = this.LLILLL.getLayoutParams();
                if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                    i3 = marginLayoutParams2.topMargin;
                } else {
                    i3 = 0;
                }
                Integer numValueOf2 = Integer.valueOf(i3);
                ViewGroup.LayoutParams layoutParams4 = this.LLILLL.getLayoutParams();
                if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                    marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams4).getMarginEnd();
                }
                C426750GoL.LJIIIZ(view, numValueOf, numValueOf2, Integer.valueOf(marginEnd), Integer.valueOf(iLIZIZ), false, 16);
            }
        }
    }

    public C0J0Z(EcUgBackButtonServiceOfficial ecUgBackButtonServiceOfficial, String str, View view) {
        this.LL = ecUgBackButtonServiceOfficial;
        this.LLILLJJLI = str;
        this.LLILLL = view;
    }
}
