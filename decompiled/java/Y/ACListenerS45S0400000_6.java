package Y;

import X.C0H3W;
import X.C0HDV;
import X.C0I0B;
import X.C1364620lcC;
import X.C1742410vRX;
import X.C19WF;
import X.C20684815ws;
import X.C23250099c;
import X.C418440Gaw;
import X.C429820GtI;
import X.C461840I9e;
import X.C461860I9g;
import X.C786410Ut5;
import X.C814420VxA;
import X.C830490Whz;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.WesternProduct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: loaded from: classes7.dex */
public class ACListenerS45S0400000_6 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS45S0400000_6 aCListenerS45S0400000_6, View view) {
        ((View.OnClickListener) aCListenerS45S0400000_6.l0).onClick(view);
        C1742410vRX c1742410vRX = C1742410vRX.LIZ;
        String str = ((WesternProduct) aCListenerS45S0400000_6.l1).pdpSchema;
        Aweme aweme = (Aweme) aCListenerS45S0400000_6.l2;
        String sourceModule = ((C429820GtI) aCListenerS45S0400000_6.l3).getSourceModule();
        String pageName = ((C429820GtI) aCListenerS45S0400000_6.l3).getPageName();
        c1742410vRX.getClass();
        C1742410vRX.LJ(aweme, str, sourceModule, pageName, false);
    }

    public static final void onClick$1(ACListenerS45S0400000_6 aCListenerS45S0400000_6, View view) {
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        View view2 = (View) aCListenerS45S0400000_6.l0;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        TuxTextView tuxTextView = (TuxTextView) aCListenerS45S0400000_6.l1;
        if (tuxTextView != null) {
            tuxTextView.setText(((C461840I9e) aCListenerS45S0400000_6.l2).getContext().getString(2131827879));
        }
        View view3 = ((Fragment) aCListenerS45S0400000_6.l3).getView();
        if (view3 != null && (viewFindViewById3 = view3.findViewById(R.id.opr)) != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById3.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                C786410Ut5.W5(viewFindViewById3, marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        View view4 = ((Fragment) aCListenerS45S0400000_6.l3).getView();
        if (view4 != null && (viewFindViewById2 = view4.findViewById(R.id.opq)) != null) {
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById2.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
                layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
                C786410Ut5.W5(viewFindViewById2, layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        View view5 = ((Fragment) aCListenerS45S0400000_6.l3).getView();
        if (view5 != null && (viewFindViewById = view5.findViewById(R.id.gq8)) != null) {
            ViewGroup.LayoutParams layoutParams3 = viewFindViewById.getLayoutParams();
            if (layoutParams3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                marginLayoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                marginLayoutParams2.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                C786410Ut5.W5(viewFindViewById, marginLayoutParams2);
                viewFindViewById.setBackgroundResource(R.drawable.cab);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        C786410Ut5.LJLLLLLL(8, ((C461840I9e) aCListenerS45S0400000_6.l2).getHeaderGroup());
        ((C461840I9e) aCListenerS45S0400000_6.l2).getViewModel().LLJJI.setValue(Boolean.TRUE);
        C786410Ut5.LJLLLLLL(0, ((C461840I9e) aCListenerS45S0400000_6.l2).getRecyclerView());
        C786410Ut5.d5(((C461840I9e) aCListenerS45S0400000_6.l2).getRecyclerView(), 0.0f);
        C19WF c19wfLIZIZ = q0.LIZIZ(((C461840I9e) aCListenerS45S0400000_6.l2).getRecyclerView());
        c19wfLIZIZ.LIZ(1.0f);
        c19wfLIZIZ.LIZJ(180L);
        c19wfLIZIZ.LJFF();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(((C461840I9e) aCListenerS45S0400000_6.l2).getViewModel()), null, null, new C461860I9g((C461840I9e) aCListenerS45S0400000_6.l2, null), 3);
        C1364620lcC c1364620lcC = C1364620lcC.LIZ;
        C0I0B.LJFF.LIZIZ();
        c1364620lcC.getClass();
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("action_type", "click_invite");
        C20684815ws.LJIILLIIL("social_avatar_invite_dm_banner", c830490Whz);
    }

    public static final void onClick$2(ACListenerS45S0400000_6 aCListenerS45S0400000_6, View view) {
        int iHashCode = ((View) aCListenerS45S0400000_6.l0).hashCode();
        ConcurrentHashMap<Integer, Boolean> concurrentHashMap = C0HDV.LIZJ;
        if (concurrentHashMap.get(Integer.valueOf(iHashCode)) == null || Intrinsics.LJFF(concurrentHashMap.get(Integer.valueOf(iHashCode)), Boolean.FALSE)) {
            concurrentHashMap.put(Integer.valueOf(iHashCode), Boolean.TRUE);
            C786410Ut5.LJLIIL(800L, ((View) aCListenerS45S0400000_6.l0).getHandler(), new ARunnableS1S0001000_6(iHashCode, 2));
            ((C0H3W) aCListenerS45S0400000_6.l1).LIZJ((RecyclerView.ViewHolder) aCListenerS45S0400000_6.l3, aCListenerS45S0400000_6.l2);
        }
    }

    public ACListenerS45S0400000_6(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
