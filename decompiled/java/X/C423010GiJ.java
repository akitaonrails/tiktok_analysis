package X;

import Y.ARunnableS15S0400000_6;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GiJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423010GiJ {
    public static final void LIZ(RecyclerView.ViewHolder viewHolder, AppCompatTextView appCompatTextView, C16F5 c16f5) {
        View viewFindViewById = viewHolder.itemView.findViewById(R.id.mga);
        if (viewFindViewById == null) {
            return;
        }
        HandlerHook.viewPost(appCompatTextView, new ARunnableS15S0400000_6(c16f5, viewFindViewById, appCompatTextView, viewHolder, 0));
    }

    public static final void LIZIZ(RecyclerView.ViewHolder viewHolder, View view, AppCompatTextView appCompatTextView, View view2) {
        int marginStart;
        int marginEnd;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (viewHolder.getBindingAdapterPosition() == -1) {
            C20441214yg.LIZIZ("TakeStagePlayingUserNameMaxWidth", "return, NO_POSITION");
            return;
        }
        if (view.isAttachedToWindow() && appCompatTextView.isAttachedToWindow()) {
            int width = view.getWidth();
            if (width <= 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("return, rowW=");
                sbLIZ.append(width);
                C20441214yg.LIZIZ("TakeStagePlayingUserNameMaxWidth", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            int iMax = Math.max(0, (width - view.getPaddingStart()) - view.getPaddingEnd());
            if (iMax <= 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("return, contentW=");
                sbLIZ2.append(iMax);
                sbLIZ2.append(" rowW=");
                sbLIZ2.append(width);
                sbLIZ2.append(" paddingStart=");
                sbLIZ2.append(view.getPaddingStart());
                sbLIZ2.append(" paddingEnd=");
                sbLIZ2.append(view.getPaddingEnd());
                C20441214yg.LIZIZ("TakeStagePlayingUserNameMaxWidth", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            if (view2.getVisibility() != 0) {
                appCompatTextView.setMaxWidth(iMax);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("return, nextTurnLabel not visible, maxWidth=");
                sbLIZ3.append(iMax);
                sbLIZ3.append(" pos=");
                sbLIZ3.append(viewHolder.getBindingAdapterPosition());
                C20441214yg.LIZIZ("TakeStagePlayingUserNameMaxWidth", C2188811AlT.LIZIZ(sbLIZ3));
                return;
            }
            view2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredWidth = view2.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginStart = marginLayoutParams.getMarginStart();
                marginEnd = marginLayoutParams.getMarginEnd();
            } else {
                marginStart = 0;
                marginEnd = 0;
            }
            int iMax2 = Math.max(0, marginStart) + Math.max(0, marginEnd);
            int iMax3 = Math.max(0, iMax - (measuredWidth + iMax2));
            appCompatTextView.setMaxWidth(iMax3);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("nextTurn visible maxWidth=");
            sbLIZ4.append(iMax3);
            sbLIZ4.append(" contentW=");
            sbLIZ4.append(iMax);
            sbLIZ4.append(" labelW=");
            sbLIZ4.append(measuredWidth);
            sbLIZ4.append(" marginH=");
            sbLIZ4.append(iMax2);
            sbLIZ4.append(" pos=");
            sbLIZ4.append(viewHolder.getBindingAdapterPosition());
            C20441214yg.LIZIZ("TakeStagePlayingUserNameMaxWidth", C2188811AlT.LIZIZ(sbLIZ4));
            return;
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("return, not attached nameRow=");
        sbLIZ5.append(view.isAttachedToWindow());
        sbLIZ5.append(" tvUserName=");
        sbLIZ5.append(appCompatTextView.isAttachedToWindow());
        C20441214yg.LIZIZ("TakeStagePlayingUserNameMaxWidth", C2188811AlT.LIZIZ(sbLIZ5));
    }
}
