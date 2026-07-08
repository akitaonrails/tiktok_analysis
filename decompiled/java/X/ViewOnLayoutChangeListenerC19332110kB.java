package X;

import android.view.View;
import com.ss.android.ugc.aweme.account.login.auth.ui.login.SOTLFragment;
import com.ss.android.ugc.aweme.relation.label.RelationLabelTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10kB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class ViewOnLayoutChangeListenerC19332110kB implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public ViewOnLayoutChangeListenerC19332110kB(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC19332110kB viewOnLayoutChangeListenerC19332110kB, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int height;
        EnumC19307010g8 enumC19307010g8;
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC19332110kB);
        View viewFindViewById = ((View) viewOnLayoutChangeListenerC19332110kB.l0).findViewById(R.id.vq8);
        View viewFindViewById2 = ((View) viewOnLayoutChangeListenerC19332110kB.l0).findViewById(R.id.vpo);
        int i9 = 0;
        if (viewFindViewById.getVisibility() == 0) {
            height = viewFindViewById.getHeight();
        } else {
            height = 0;
        }
        int height2 = (((View) viewOnLayoutChangeListenerC19332110kB.l0).getHeight() - height) - viewFindViewById2.getHeight();
        if (height2 >= 0) {
            i9 = height2;
        }
        int iCS = ((SOTLFragment) viewOnLayoutChangeListenerC19332110kB.l1).cS(i9);
        if (((SOTLFragment) viewOnLayoutChangeListenerC19332110kB.l1).VR().LJIIL == null) {
            enumC19307010g8 = EnumC19307010g8.TOP;
        } else {
            enumC19307010g8 = ((SOTLFragment) viewOnLayoutChangeListenerC19332110kB.l1).VR().LJIIJ;
        }
        int i10 = C19306810g6.LIZIZ[enumC19307010g8.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                SOTLFragment sOTLFragment = (SOTLFragment) viewOnLayoutChangeListenerC19332110kB.l1;
                View view2 = (View) viewOnLayoutChangeListenerC19332110kB.l2;
                sOTLFragment.getClass();
                SOTLFragment.kS(view2);
                SOTLFragment sOTLFragment2 = (SOTLFragment) viewOnLayoutChangeListenerC19332110kB.l1;
                View view3 = (View) viewOnLayoutChangeListenerC19332110kB.l3;
                sOTLFragment2.getClass();
                SOTLFragment.iS(iCS, view3);
                return;
            }
            throw new C1954807lC();
        }
        SOTLFragment sOTLFragment3 = (SOTLFragment) viewOnLayoutChangeListenerC19332110kB.l1;
        View view4 = (View) viewOnLayoutChangeListenerC19332110kB.l2;
        sOTLFragment3.getClass();
        SOTLFragment.iS(iCS, view4);
        SOTLFragment sOTLFragment4 = (SOTLFragment) viewOnLayoutChangeListenerC19332110kB.l1;
        View view5 = (View) viewOnLayoutChangeListenerC19332110kB.l3;
        sOTLFragment4.getClass();
        SOTLFragment.kS(view5);
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC19332110kB viewOnLayoutChangeListenerC19332110kB, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC19332110kB);
        ((RelationLabelTextView) viewOnLayoutChangeListenerC19332110kB.l0).LLJJL = ((r2.getWidth() - ((RelationLabelTextView) viewOnLayoutChangeListenerC19332110kB.l0).getPaddingStart()) - ((RelationLabelTextView) viewOnLayoutChangeListenerC19332110kB.l0).getPaddingEnd()) - C418440Gaw.LIZIZ(5);
        int i9 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((RelationLabelTextView) viewOnLayoutChangeListenerC19332110kB.l0).getViewId());
        sbLIZ.append(" do on next layout meas:");
        sbLIZ.append(((RelationLabelTextView) viewOnLayoutChangeListenerC19332110kB.l0).getMeasuredWidth());
        sbLIZ.append(" tv:");
        sbLIZ.append(((RelationLabelTextView) viewOnLayoutChangeListenerC19332110kB.l0).LLJJL);
        sbLIZ.append(" len:");
        sbLIZ.append(((RelationLabelTextView) viewOnLayoutChangeListenerC19332110kB.l0).getText().length());
        C2188811AlT.LIZIZ(sbLIZ);
        RelationLabelTextView relationLabelTextView = (RelationLabelTextView) viewOnLayoutChangeListenerC19332110kB.l0;
        relationLabelTextView.LJJJJLI((C1264020izw) viewOnLayoutChangeListenerC19332110kB.l1, (C10KJ) viewOnLayoutChangeListenerC19332110kB.l2, relationLabelTextView.LLJJL, (Function0) viewOnLayoutChangeListenerC19332110kB.l3);
    }
}
