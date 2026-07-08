package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.explore.assem.ExploreTopicGeneralFeedListComponent;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.food.PoiDetailFoodHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.PoiDetailTravelHeaderAssemV2;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0IDX, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0IDX implements View.OnLayoutChangeListener {
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
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public C0IDX(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }

    public static final void onLayoutChange$0(C0IDX c0idx, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int top;
        Number numberValueOf;
        View view2 = (View) c0idx.l0;
        int bottom = 0;
        if (view2 != null) {
            top = view2.getTop();
        } else {
            top = 0;
        }
        View view3 = (View) c0idx.l1;
        if (view3 != null) {
            bottom = view3.getBottom();
        }
        int i9 = bottom - top;
        Context context = ((PoiDetailFoodHeaderAssem) c0idx.l2).getContext();
        if (context != null) {
            numberValueOf = Integer.valueOf(C418440Gaw.LJFF(i9, context));
        } else {
            numberValueOf = Float.valueOf(0.0f);
        }
        int iIntValue = numberValueOf.intValue();
        if (iIntValue <= 0) {
            return;
        }
        if (iIntValue > 102) {
            ((PoiDetailFoodHeaderAssem) c0idx.l2).kq((ConstraintLayout) c0idx.l3, 0.0f, R.id.jk8, R.id.r1z);
        } else if (iIntValue >= 94) {
            ((PoiDetailFoodHeaderAssem) c0idx.l2).kq((ConstraintLayout) c0idx.l3, 0.5f, R.id.r52, R.id.cec);
        } else {
            ((PoiDetailFoodHeaderAssem) c0idx.l2).kq((ConstraintLayout) c0idx.l3, 0.0f, R.id.jk8, R.id.r1z);
        }
    }

    public static final void onLayoutChange$1(C0IDX c0idx, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int top;
        Number numberValueOf;
        View view2 = (View) c0idx.l0;
        int bottom = 0;
        if (view2 != null) {
            top = view2.getTop();
        } else {
            top = 0;
        }
        View view3 = (View) c0idx.l1;
        if (view3 != null) {
            bottom = view3.getBottom();
        }
        int i9 = bottom - top;
        Context context = ((PoiDetailTravelHeaderAssemV2) c0idx.l2).getContext();
        if (context != null) {
            numberValueOf = Integer.valueOf(C418440Gaw.LJFF(i9, context));
        } else {
            numberValueOf = Float.valueOf(0.0f);
        }
        int iIntValue = numberValueOf.intValue();
        if (iIntValue <= 0) {
            return;
        }
        if (iIntValue > 102) {
            ((PoiDetailTravelHeaderAssemV2) c0idx.l2).kq((ConstraintLayout) c0idx.l3, 0.0f, R.id.jk8, R.id.r1z);
        } else if (iIntValue >= 94) {
            ((PoiDetailTravelHeaderAssemV2) c0idx.l2).kq((ConstraintLayout) c0idx.l3, 0.5f, R.id.r52, R.id.cec);
        } else {
            ((PoiDetailTravelHeaderAssemV2) c0idx.l2).kq((ConstraintLayout) c0idx.l3, 0.0f, R.id.jk8, R.id.r1z);
        }
    }

    public static final void onLayoutChange$2(C0IDX c0idx, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        C19ME c19me;
        C19ME c19me2;
        view.removeOnLayoutChangeListener(c0idx);
        if (((TuxTextView) c0idx.l0).getLineCount() <= 1) {
            i9 = R.id.hhv;
        } else {
            i9 = R.id.hhy;
        }
        ExploreTopicGeneralFeedListComponent exploreTopicGeneralFeedListComponent = (ExploreTopicGeneralFeedListComponent) c0idx.l1;
        View view2 = (View) c0idx.l2;
        exploreTopicGeneralFeedListComponent.getClass();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if ((layoutParams instanceof C19ME) && (c19me2 = (C19ME) layoutParams) != null && c19me2.bottomToBottom != i9) {
            c19me2.bottomToBottom = i9;
            C786410Ut5.W5(view2, c19me2);
        }
        ExploreTopicGeneralFeedListComponent exploreTopicGeneralFeedListComponent2 = (ExploreTopicGeneralFeedListComponent) c0idx.l1;
        View view3 = (View) c0idx.l3;
        exploreTopicGeneralFeedListComponent2.getClass();
        ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
        if ((layoutParams2 instanceof C19ME) && (c19me = (C19ME) layoutParams2) != null && c19me.bottomToBottom != i9) {
            c19me.bottomToBottom = i9;
            C786410Ut5.W5(view3, c19me);
        }
    }
}
