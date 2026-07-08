package X;

import Y.ACListenerS110S0200000_6;
import Y.ACListenerS142S0100000_7;
import Y.ARunnableS75S0200000_6;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0GlY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425020GlY {
    public static final View LIZ(Context context, EnumC429120GsA enumC429120GsA, Function2<? super View, ? super View, Unit> function2, Function2<? super View, ? super View, Unit> function22) {
        final View viewSd = C786410Ut5.Sd(R.layout.dv7, C786410Ut5.ne(context), null);
        if (viewSd != null) {
            final ImageView imageView = (ImageView) viewSd.findViewById(R.id.lln);
            final ImageView imageView2 = (ImageView) viewSd.findViewById(R.id.llo);
            TuxTextView tuxTextView = (TuxTextView) viewSd.findViewById(R.id.zrf);
            TuxTextView tuxTextView2 = (TuxTextView) viewSd.findViewById(R.id.zrd);
            C197039127h c197039127h = (C197039127h) viewSd.findViewById(R.id.cr8);
            C197039127h c197039127h2 = (C197039127h) viewSd.findViewById(R.id.cr9);
            TuxIconView tuxIconView = (TuxIconView) viewSd.findViewById(R.id.jv3);
            int i = C425030GlZ.LIZ[enumC429120GsA.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    tuxTextView.setText(viewSd.getResources().getString(2131840062));
                    tuxTextView.setTuxFont(33);
                    C786410Ut5.LLLLZLL(tuxTextView2, 8);
                    C786410Ut5.LLLLLLJ(c197039127h2, 8);
                    C426750GoL.LJIIIZ(c197039127h, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))), null, null, null, false, 30);
                    c197039127h.setText(viewSd.getResources().getString(2131840066));
                } else {
                    throw new C1954807lC();
                }
            } else {
                tuxTextView.setText(viewSd.getResources().getString(2131840063));
                tuxTextView2.setText(viewSd.getResources().getString(2131840062));
                c197039127h2.setText(viewSd.getResources().getString(2131840061));
                c197039127h.setText(viewSd.getResources().getString(2131840060));
            }
            C786410Ut5.U8(c197039127h, new ACListenerS110S0200000_6(function22, viewSd, 46));
            C786410Ut5.U8(c197039127h2, new ACListenerS110S0200000_6(function2, viewSd, 47));
            C786410Ut5.a9(tuxIconView, new ACListenerS142S0100000_7(viewSd, 293));
            viewSd.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.0GlX
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view) {
                    HandlerHook.viewPostDelay(viewSd, new ARunnableS75S0200000_6(imageView2, imageView, 118), 500L);
                }
            });
        }
        return viewSd;
    }
}
