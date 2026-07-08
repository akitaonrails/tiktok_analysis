package X;

import android.graphics.Rect;
import android.text.SpannableString;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0FMr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.anchor.banner.PoiReTagBottomBarScene$setExpTitleTv$1$globalLayoutListener$1$onGlobalLayout$1$1", f = "PoiRetagBottomBarAssem.kt", l = {}, m = "invokeSuspend")
public final class C388910FMr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C443120HZe<? extends String, ? extends Integer, ? extends Integer>>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ TuxTextView LLILLL;
    public final /* synthetic */ C1201010hMJ LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C388910FMr(TuxTextView tuxTextView, C1201010hMJ c1201010hMJ, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = tuxTextView;
        this.LLILZ = c1201010hMJ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C388910FMr(this.LLILLL, this.LLILZ, this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C443120HZe c443120HZe;
        int iWidth;
        int iLJJJ;
        int iWidth2;
        C1C7U.LIZ("PoiReTagBottomBarScene@a3f1.setExpTitleTv$1$globalLayoutListener$1$onGlobalLayout$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String string = this.LL;
        String str = this.LLILLJJLI;
        int width = this.LLILLL.getWidth();
        TuxTextView tuxTextView = this.LLILZ.LJIIJ;
        int i = -1;
        try {
            int iLJJJ2 = a0.LJJJ(string, str, 0, false, 6);
            int length = str.length() + iLJJJ2;
            Rect rect = new Rect();
            if (tuxTextView != null) {
                tuxTextView.getPaint().getTextBounds(string, 0, string.length(), rect);
                iWidth = rect.width() + 12;
            } else {
                iWidth = 0;
            }
            if (iWidth < width) {
                c443120HZe = new C443120HZe(string, Integer.valueOf(iLJJJ2), Integer.valueOf(length));
            } else {
                CharSequence charSequenceSubSequence = string.subSequence(length, string.length());
                while (true) {
                    if (i < length) {
                        SpannableString spannableString = new SpannableString(string.subSequence(0, length) + "..." + charSequenceSubSequence);
                        String string2 = spannableString.toString();
                        Rect rect2 = new Rect();
                        if (tuxTextView != null) {
                            tuxTextView.getPaint().getTextBounds(string2, 0, string2.length(), rect2);
                            iWidth2 = rect2.width() + 12;
                        } else {
                            iWidth2 = 0;
                        }
                        if (iWidth2 >= width) {
                            length--;
                            i = -1;
                        } else {
                            string = spannableString.toString();
                            iLJJJ = a0.LJJJ(string, "...", 0, false, 6) + 3;
                            break;
                        }
                    } else {
                        iLJJJ = -1;
                        break;
                    }
                }
                c443120HZe = new C443120HZe(string, Integer.valueOf(iLJJJ2), Integer.valueOf(iLJJJ));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c443120HZe = new C443120HZe(null, -1, -1);
        }
        C1C7U.LIZIZ("PoiReTagBottomBarScene@a3f1.setExpTitleTv$1$globalLayoutListener$1$onGlobalLayout$1$1");
        return c443120HZe;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C443120HZe<? extends String, ? extends Integer, ? extends Integer>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
