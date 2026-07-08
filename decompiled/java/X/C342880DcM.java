package X;

import android.content.Context;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.pages.result.bot.core.config.TakoSugStyle;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DcM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C342880DcM {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, LinearLayoutCompat linearLayoutCompat, boolean z) {
        C427690Gpr.LJ(linearLayoutCompat, C418440Gaw.LIZIZ(Integer.valueOf(i)));
        linearLayoutCompat.setOnTouchListener(null);
        C384050F3z c384050F3z = new C384050F3z();
        if (z) {
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        } else {
            c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(0.5f))));
            c384050F3z.LJ = Integer.valueOf(C1383370m6R.LJFF(R.attr.a02));
        }
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        linearLayoutCompat.setBackground(c384050F3z.LIZ(linearLayoutCompat.getContext()));
    }

    public static void LIZIZ(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, Context context, TuxTextView tuxTextView) {
        int i;
        int i2;
        if (context == null) {
            return;
        }
        C01GW c01gw = C342890DcN.LIZIZ;
        if (((TakoSugStyle) c01gw.getValue()).showTitle) {
            C661350Pwr.LJIIL(tuxTextView);
            Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            if (((TakoSugStyle) c01gw.getValue()).showInteractionWidget) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            C426750GoL.LJIIIZ(viewOnAttachStateChangeListenerC20604515jv, 0, numValueOf, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i2))), false, 16);
        } else {
            C661350Pwr.LIZJ(tuxTextView);
            Integer numValueOf2 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            if (((TakoSugStyle) c01gw.getValue()).showInteractionWidget) {
                i = 4;
            } else {
                i = 0;
            }
            C426750GoL.LJIIIZ(viewOnAttachStateChangeListenerC20604515jv, 0, numValueOf2, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i))), false, 16);
        }
        if (((TakoSugStyle) c01gw.getValue()).isShortSug) {
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new GridLayoutManager(context, 2));
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C346270Dhp(14));
        } else {
            new LinearLayoutManager(context, 1, false);
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C346270Dhp(15));
        }
    }
}
