package X;

import Y.ARunnableS98S0200000_29;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ogc.news.sticker.creator.widget.editor.sheet.base.BaseArticleEditorSheet$show$1$3;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.11tV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19644711tV<DATA> {
    public TuxSheet LIZ;
    public C19644611tU LIZIZ;
    public C12YW LIZJ;
    public BaseArticleEditorSheet$show$1$3 LIZLLL;

    public abstract String LJFF();

    public abstract void LJI();

    public abstract void LJIIIIZZ();

    public abstract View LJIIIZ(ViewGroup viewGroup);

    public abstract void LJIIJ(Function0<Unit> function0);

    public final void LIZJ() {
        View view;
        ViewTreeObserver viewTreeObserver;
        TuxSheet tuxSheet = this.LIZ;
        Unit unit = null;
        if (tuxSheet != null) {
            BaseArticleEditorSheet$show$1$3 baseArticleEditorSheet$show$1$3 = this.LIZLLL;
            if (baseArticleEditorSheet$show$1$3 != null) {
                tuxSheet.getLifecycle().removeObserver(baseArticleEditorSheet$show$1$3);
                this.LIZLLL = null;
            }
            tuxSheet.dismiss();
        }
        C12YW c12yw = this.LIZJ;
        if (c12yw != null) {
            try {
                TuxSheet tuxSheet2 = this.LIZ;
                if (tuxSheet2 != null && (view = tuxSheet2.getView()) != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(c12yw);
                    C2187701Ajg.LIZIZ(viewTreeObserver, c12yw, ViewTreeObserver.OnGlobalLayoutListener.class);
                    unit = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public final int LIZLLL() {
        View view;
        TuxSheet tuxSheet = this.LIZ;
        if (tuxSheet == null || (view = tuxSheet.getView()) == null) {
            return 0;
        }
        int screenHeight = ScreenUtils.getScreenHeight(view.getContext());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Integer numLJJIIJ = C13LQ.LJJIIJ(1, iArr);
        return (screenHeight - (numLJJIIJ != null ? numLJJIIJ.intValue() : screenHeight)) - LJ();
    }

    public final int LJ() {
        View view;
        TuxSheet tuxSheet = this.LIZ;
        if (tuxSheet == null || (view = tuxSheet.getView()) == null) {
            return 0;
        }
        return view.getMeasuredHeight();
    }

    public static TuxTextView LIZIZ(Context context) {
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTuxFont(102);
        tuxTextView.setText(C20467080b.LIZIZ(2131826634));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1r, context);
        if (numLIZJ != null) {
            tuxTextView.setTextColor(numLIZJ.intValue());
        }
        tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        LIZ(tuxTextView, false);
        return tuxTextView;
    }

    public final void LJII(ViewGroup viewGroup) {
        View viewLJIIIZ = LJIIIZ(viewGroup);
        LJIIIIZZ();
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIII = viewLJIIIZ;
        c1390920mIc.LJI(16);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLILLL = false;
        tuxSheet.LLJLILLLLZIIL = false;
        c1390920mIc.LJIIIIZZ(0);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJLLIL = false;
        tuxSheet2.LLJLLL = false;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, viewLJIIIZ.getContext());
        TuxSheet tuxSheet3 = c1390920mIc.LIZ;
        tuxSheet3.LLJI = numLIZJ;
        tuxSheet3.LLJJIJIIJIL = false;
        this.LIZ = tuxSheet3;
    }

    public static void LIZ(TuxTextView tuxTextView, boolean z) {
        float f;
        tuxTextView.setEnabled(z);
        if (z) {
            f = 1.0f;
        } else {
            f = 0.4f;
        }
        C786410Ut5.B5(tuxTextView, f);
    }

    public final void LJIIJJI(C19646111tj c19646111tj, Function0<Unit> function0) {
        if (c19646111tj.isLaidOut() && !c19646111tj.isLayoutRequested()) {
            C19655911vJ editor = c19646111tj.getEditor();
            View rootView = editor.getRootView();
            if (function0 != null) {
                C786410Ut5.x3(rootView.getViewTreeObserver(), new C12YV(this, function0, rootView, 2));
            }
            HandlerHook.viewPostDelay(editor, new ARunnableS98S0200000_29(editor, c19646111tj, 60), 100L);
            return;
        }
        c19646111tj.addOnLayoutChangeListener(new C12YE(c19646111tj, this, function0, 1));
    }
}
