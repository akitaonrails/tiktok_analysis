package Y;

import X.C1077050e8N;
import X.C13LE;
import X.C1427300nFI;
import X.C1749260vca;
import X.C354270Duj;
import X.C384050F3z;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1070180dxI;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.relation.ffp.ui.FFPMainFragment;
import com.ss.android.ugc.aweme.relation.ffp.ui.SearchResultFragment;
import com.ss.android.ugc.aweme.relation.ffp.ui.search.SearchFriendsV2Fragment;
import com.ss.android.ugc.aweme.relation.ffp.vm.FFPMainFragmentVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public class ATListenerS340S0200000_16 implements View.OnTouchListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            default:
                return false;
        }
    }

    public ATListenerS340S0200000_16(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final boolean onTouch$0(ATListenerS340S0200000_16 aTListenerS340S0200000_16, View view, MotionEvent motionEvent) {
        Class cls;
        if (motionEvent != null && motionEvent.getAction() == 1) {
            C1749260vca c1749260vca = (C1749260vca) aTListenerS340S0200000_16.l0;
            C1427300nFI c1427300nFI = new C1427300nFI();
            String string = ((FFPMainFragment) aTListenerS340S0200000_16.l1).getString(R.string.f1_);
            c1427300nFI.LJI = string;
            TuxTextView tuxTextView = c1427300nFI.LJII;
            if (tuxTextView != null) {
                tuxTextView.setText(string);
            }
            c1427300nFI.LIZIZ(EnumC1070180dxI.SECONDARY);
            c1427300nFI.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0, 0);
            ACListenerS139S0100000_4 aCListenerS139S0100000_4 = new ACListenerS139S0100000_4(new AwS382S0200000_16(view, (FFPMainFragment) aTListenerS340S0200000_16.l1, 42), 94);
            c1427300nFI.LJFF = aCListenerS139S0100000_4;
            TuxTextView tuxTextView2 = c1427300nFI.LJII;
            if (tuxTextView2 != null) {
                C786410Ut5.h9(tuxTextView2, aCListenerS139S0100000_4);
            }
            c1749260vca.setEndAction(c1427300nFI);
            FFPMainFragment fFPMainFragment = (FFPMainFragment) aTListenerS340S0200000_16.l1;
            Fragment fragment = fFPMainFragment.LLJ;
            if (fragment == null || (!(fragment instanceof SearchResultFragment) && !(fragment instanceof SearchFriendsV2Fragment))) {
                fFPMainFragment.LLJI = fragment;
                FFPMainFragmentVM fFPMainFragmentVMDS = fFPMainFragment.dS();
                if (!((FFPMainFragment) aTListenerS340S0200000_16.l1).hS()) {
                    cls = SearchFriendsV2Fragment.class;
                } else {
                    cls = SearchResultFragment.class;
                }
                fFPMainFragmentVMDS.vQ2(C13LE.LIZ(cls));
                return false;
            }
        }
        return false;
    }

    public static final boolean onTouch$1(ATListenerS340S0200000_16 aTListenerS340S0200000_16, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return false;
            }
            C354270Duj.LIZ(50L, new AwS560S0100000_16((C1077050e8N) aTListenerS340S0200000_16.l0, 914));
            ((Function1) aTListenerS340S0200000_16.l1).invoke(Boolean.FALSE);
            return false;
        }
        C1077050e8N c1077050e8N = (C1077050e8N) aTListenerS340S0200000_16.l0;
        c1077050e8N.LJIIJ = true;
        View view2 = c1077050e8N.LJIIIIZZ;
        TuxTextView tuxTextView = null;
        if (view2 == null) {
            view2 = null;
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1r);
        View view3 = ((C1077050e8N) aTListenerS340S0200000_16.l0).LJI;
        if (view3 == null) {
            view3 = null;
        }
        view2.setBackground(c384050F3z.LIZ(view3.getContext()));
        TuxTextView tuxTextView2 = ((C1077050e8N) aTListenerS340S0200000_16.l0).LJII;
        if (tuxTextView2 != null) {
            tuxTextView = tuxTextView2;
        }
        tuxTextView.setTextColorRes(R.attr.zi);
        ((Function1) aTListenerS340S0200000_16.l1).invoke(Boolean.TRUE);
        return false;
    }
}
