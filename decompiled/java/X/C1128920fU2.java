package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0fU2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128920fU2 extends C0DXR {
    public final RecyclerView LL;
    public boolean LLILLL;
    public EnumC1129610fV9 LLILLJJLI = EnumC1129610fV9.LL;
    public List<Long> LLILZ = C13BV.INSTANCE;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 456));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 461));

    public C1128920fU2(RunnableC781530UlD runnableC781530UlD) {
        this.LL = runnableC781530UlD;
    }

    @Override // X.C0DXR
    public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        View viewFindViewByPosition;
        int iOrdinal = this.LLILLJJLI.ordinal();
        if (iOrdinal != 0) {
            int bottom = 0;
            View viewFindViewByPosition2 = null;
            if (iOrdinal != 1) {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    throw new C1954807lC();
                }
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null && (viewFindViewByPosition2 = layoutManager.findViewByPosition(1)) != null) {
                    bottom = viewFindViewByPosition2.getBottom();
                }
                float fLIZIZ = bottom + C418440Gaw.LIZIZ(6);
                if (viewFindViewByPosition2 != null && fLIZIZ > 0.0f) {
                    canvas.drawRect(new RectF(0.0f, 0.0f, recyclerView.getWidth(), fLIZIZ), (Paint) this.LLILZIL.getValue());
                    if (!this.LLILLL && this.LLILLJJLI == EnumC1129610fV9.LLILLL) {
                        this.LLILLL = true;
                        List<Long> list = this.LLILZ;
                        if (list != null && (!list.isEmpty())) {
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_frequently_used_area_show");
                            c474500IjALIZ.LJIL();
                            c474500IjALIZ.LJJII(list.toString(), "frequently_used_gift_id_set");
                            c474500IjALIZ.LJJII(Integer.valueOf(list.size()), "frequently_used_gift_cnt");
                            c474500IjALIZ.LJJII(Integer.valueOf(!list.isEmpty() ? 1 : 0), "frequently_used_area_is_editable");
                            c474500IjALIZ.LIZ();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
            if (layoutManager2 != null && (viewFindViewByPosition = layoutManager2.findViewByPosition(0)) != null && viewFindViewByPosition.getBottom() > 0) {
                canvas.drawRect(new RectF(0.0f, 0.0f, recyclerView.getWidth(), viewFindViewByPosition.getBottom()), (Paint) this.LLILZIL.getValue());
            }
        }
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        EnumC1129610fV9 enumC1129610fV9;
        C1126990fQv c1126990fQv;
        LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI;
        if (C1125810fP1.LIZIZ() && ((enumC1129610fV9 = this.LLILLJJLI) == EnumC1129610fV9.LLILLL || enumC1129610fV9 == EnumC1129610fV9.LLILZ)) {
            AbstractC21673619ry adapter = recyclerView.getAdapter();
            Integer numValueOf = null;
            if (adapter instanceof C1127050fR1) {
                c1126990fQv = (C1126990fQv) adapter;
            } else {
                c1126990fQv = null;
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (5 <= childAdapterPosition && childAdapterPosition < 9) {
                if (c1126990fQv != null && (linkedList = c1126990fQv.LL) != null && (abstractC1126600fQI = linkedList.get(5)) != null) {
                    numValueOf = Integer.valueOf(abstractC1126600fQI.LIZ);
                }
                if (!C01AW.LIZ(numValueOf)) {
                    rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                    return;
                }
            }
            super.LIZIZ(rect, view, recyclerView, c21673919s1);
            return;
        }
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
    }
}
