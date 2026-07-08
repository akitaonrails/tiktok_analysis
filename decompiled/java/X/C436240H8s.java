package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0H8s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C436240H8s {
    public static final Object LIZ(View view, C436250H8t c436250H8t) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c436250H8t));
        if (view.getWidth() != 0) {
            Integer numLJ = C2286608xc.LJ(view.getWidth());
            C189200o6.m2constructorimpl(numLJ);
            c23260099m.resumeWith(numLJ);
        } else {
            C786410Ut5.x3(view.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC512901zD(view, c23260099m, 2));
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(c436250H8t);
        }
        return objLIZ;
    }

    public static final TuxTextView LIZIZ(Context context, CharSequence charSequence) {
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setText(charSequence);
        tuxTextView.setTextColorRes(R.attr.eh);
        tuxTextView.setTuxFont(71);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_heart;
        c419910GdJ.LJ = Integer.valueOf(R.attr.eh);
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        tuxIconDrawableLIZ.setBounds(0, 0, tuxIconDrawableLIZ.LIZJ(), tuxIconDrawableLIZ.LIZIZ());
        tuxTextView.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        if (!C426750GoL.LIZLLL(context)) {
            tuxTextView.setCompoundDrawables(tuxIconDrawableLIZ, null, null, null);
            return tuxTextView;
        }
        tuxTextView.setCompoundDrawables(null, null, tuxIconDrawableLIZ, null);
        return tuxTextView;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZJ(android.view.View r14, com.bytedance.tux.input.TuxTextView r15, com.ss.android.ugc.aweme.comment.model.Comment r16, boolean r17, X.InterfaceC1364105Vn<? super X.C436260H8u> r18) {
        /*
            Method dump skipped, instruction units count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C436240H8s.LIZJ(android.view.View, com.bytedance.tux.input.TuxTextView, com.ss.android.ugc.aweme.comment.model.Comment, boolean, X.05Vn):java.lang.Object");
    }
}
