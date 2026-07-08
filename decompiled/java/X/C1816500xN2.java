package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.BoardItemLayout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0xN2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1816500xN2 extends FrameLayout implements InterfaceC1816580xNA {
    public final View LL;
    public ConstraintLayout LLILLJJLI;
    public ConstraintLayout LLILLL;
    public final C1818740xQe LLILZ;
    public LifecycleOwner LLILZIL;

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
    }

    public final List<View> getDslBoardViews() {
        ArrayList arrayList = new ArrayList();
        ConstraintLayout constraintLayout = this.LLILLJJLI;
        if (constraintLayout != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                arrayList.add(constraintLayout.getChildAt(i));
            }
        }
        return arrayList;
    }

    public final List<View> getSceneryBoardViews() {
        ArrayList arrayList = new ArrayList();
        ConstraintLayout constraintLayout = this.LLILLL;
        if (constraintLayout != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                arrayList.add(constraintLayout.getChildAt(i));
            }
        }
        return arrayList;
    }

    public final LifecycleOwner getLifecycleOwner() {
        return this.LLILZIL;
    }

    public final void LIZIZ(ConstraintLayout constraintLayout) {
        if (constraintLayout == null) {
            return;
        }
        for (View view : new C09RD(constraintLayout)) {
            if ((view instanceof FrameLayout) && ((ViewGroup) view).getChildCount() == 0) {
                C786410Ut5.LJJLI(view, constraintLayout);
            }
        }
    }

    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        this.LLILZIL = lifecycleOwner;
    }

    public C1816500xN2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = FrameLayout.inflate(context, R.layout.g0v, this);
        this.LLILZ = new C1818740xQe();
    }

    @Override // X.InterfaceC1816580xNA
    public final Pair<Float, Float> LIZ(InterfaceC395901gL interfaceC395901gL, BoardItem boardItem) {
        Long lValueOf;
        View view = interfaceC395901gL.getView();
        if (view == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[VirtualCanvas-Audience] boardId=");
            if (boardItem != null) {
                lValueOf = Long.valueOf(boardItem.id);
            } else {
                lValueOf = null;
            }
            sbLIZ.append(lValueOf);
            sbLIZ.append(" | EARLY RETURN: boardView is null");
            C1092200eWo.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        if (boardItem == null) {
            C1092200eWo.LIZ("[VirtualCanvas-Audience] EARLY RETURN: boardItem is null");
            return null;
        }
        BoardItemLayout boardItemLayoutLIZ = C488201vE.LIZ(boardItem, C488601vI.LIZ());
        if (boardItemLayoutLIZ == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[VirtualCanvas-Audience] boardId=");
            sbLIZ2.append(boardItem.id);
            sbLIZ2.append(" | EARLY RETURN: getUnifiedItemLayout() is null | canvasItemLayout=");
            sbLIZ2.append(boardItem.canvasItemLayout);
            sbLIZ2.append(" | boardItemLayout=");
            sbLIZ2.append(boardItem.boardItemLayout);
            C1092200eWo.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            return null;
        }
        float f = C488601vI.LIZ().LIZ / C488301vF.LJ;
        float measuredWidth = view.getMeasuredWidth();
        C394501g7 config = interfaceC395901gL.getConfig();
        float f2 = measuredWidth * config.LJJ * config.LJJIIZ;
        float measuredHeight = view.getMeasuredHeight();
        C394501g7 config2 = interfaceC395901gL.getConfig();
        float f3 = measuredHeight * config2.LJJ * config2.LJJIIZ;
        float f4 = f2 / f;
        float f5 = f3 / f;
        Pair<Float, Float> pairLIZ = this.LLILZ.LIZ(boardItem.id, f4, f5, boardItemLayoutLIZ);
        float fFloatValue = pairLIZ.getFirst().floatValue();
        float fFloatValue2 = pairLIZ.getSecond().floatValue();
        float f6 = (f4 / 2.0f) + fFloatValue;
        float f7 = (f5 / 2.0f) + fFloatValue2;
        StringBuilder sb = new StringBuilder("[VirtualCanvas-Audience] boardId=");
        sb.append(boardItem.id);
        sb.append(" | viewMeasured=(");
        sb.append(view.getMeasuredWidth());
        sb.append(", ");
        sb.append(view.getMeasuredHeight());
        sb.append(") | effectiveScale=");
        C394501g7 config3 = interfaceC395901gL.getConfig();
        sb.append(config3.LJJ * config3.LJJIIZ);
        sb.append(" | scaleFactor=");
        sb.append(f);
        sb.append(" | visual=(");
        sb.append(f2);
        sb.append(", ");
        sb.append(f3);
        sb.append(") | logical390=(");
        sb.append(f4);
        sb.append(", ");
        sb.append(f5);
        sb.append(") | topLeft390=(");
        sb.append(fFloatValue);
        sb.append(", ");
        sb.append(fFloatValue2);
        sb.append(") | center390=(");
        sb.append(f6);
        sb.append(", ");
        sb.append(f7);
        sb.append(") | anchor=(h=");
        sb.append(boardItemLayoutLIZ.horizontalAnchor);
        sb.append(", v=");
        sb.append(boardItemLayoutLIZ.verticalAnchor);
        sb.append(") | offset=(x=");
        sb.append(boardItemLayoutLIZ.offsetX);
        sb.append(", y=");
        sb.append(boardItemLayoutLIZ.offsetY);
        sb.append(')');
        C1092200eWo.LIZ(sb.toString());
        return new Pair<>(Float.valueOf(f6), Float.valueOf(f7));
    }
}
