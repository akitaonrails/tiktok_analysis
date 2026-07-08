package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.0ivO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1261200ivO extends ViewGroup {
    public boolean LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public final ArrayList<C1236570iHf> LLILZIL;

    public C1261200ivO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZIL = new ArrayList<>(4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Sequence c09rd;
        super.onMeasure(i, i2);
        int iLIZJ = (int) C12ES.LIZJ(1.0f, getContext());
        if (this.LLILZ == 0) {
            int i3 = C2187451AjH.LIZ;
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int i4 = this.LLILZ;
        int i5 = (size - (iLIZJ * (i4 - 1))) / i4;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        if (C278730AwB.LIZ()) {
            c09rd = C09RB.LJIIIZ(new C09RD(this), AFwS257S0000000_19.get$arr$(303));
        } else {
            c09rd = new C09RD(this);
        }
        Iterator it2 = c09rd.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i5));
    }

    public final void LIZ(EnumC1260930iux enumC1260930iux, C1261270ivV c1261270ivV, User user) {
        String str;
        C1260910iuv c1260910iuv = new C1260910iuv(0);
        c1260910iuv.LL = Boolean.valueOf(this.LL);
        c1260910iuv.LLD = Boolean.valueOf(this.LLILLJJLI);
        c1260910iuv.LLF = Boolean.valueOf(this.LLILLL);
        c1260910iuv.LJJLIIIJJI = enumC1260930iux;
        String str2 = null;
        if (c1261270ivV != null) {
            str = c1261270ivV.LIZ;
        } else {
            str = null;
        }
        c1260910iuv.LJJIJLIJ(str);
        if (c1261270ivV != null) {
            str2 = c1261270ivV.LJII;
        }
        c1260910iuv.LJJJJIZL(str2);
        if (C1264800j1C.LIZIZ()) {
            c1260910iuv.LJJJJZ(EnumC1260920iuw.CARD);
        }
        if (C296550Bjp.LIZ() && user != null) {
            String uid = user.getUid();
            if (uid == null) {
                uid = "";
            }
            c1260910iuv.LJJLIIIJL = uid;
            c1260910iuv.LJJJJLI(user.getRequestId());
        }
        c1260910iuv.LJIILJJIL();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (C278730AwB.LIZ()) {
            int iLIZJ = (int) C12ES.LIZJ(1.0f, getContext());
            int childCount = getChildCount();
            boolean z2 = true;
            int measuredWidth = 0;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt.getVisibility() != 8) {
                    if (z2) {
                        if (childAt.getMeasuredWidth() < i3) {
                            childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, childAt.getMeasuredHeight());
                            z2 = false;
                        } else {
                            return;
                        }
                    } else if (childAt.getMeasuredWidth() + measuredWidth + iLIZJ <= i3) {
                        int i6 = measuredWidth + iLIZJ;
                        childAt.layout(i6, 0, childAt.getMeasuredWidth() + measuredWidth + iLIZJ, childAt.getMeasuredHeight());
                        measuredWidth = i6;
                    } else {
                        return;
                    }
                    measuredWidth += childAt.getMeasuredWidth();
                }
            }
            return;
        }
        int iLIZJ2 = (int) C12ES.LIZJ(1.0f, getContext());
        int childCount2 = getChildCount();
        int childCount3 = 0;
        int measuredWidth2 = 0;
        while (true) {
            if (childCount3 >= childCount2) {
                childCount3 = getChildCount() - 1;
                break;
            }
            View childAt2 = getChildAt(childCount3);
            if (childCount3 == 0) {
                if (childAt2.getMeasuredWidth() >= i3) {
                    break;
                }
                childAt2.layout(measuredWidth2, 0, childAt2.getMeasuredWidth() + measuredWidth2, childAt2.getMeasuredHeight());
                measuredWidth2 += childAt2.getMeasuredWidth();
                childCount3++;
            } else {
                if (childAt2.getMeasuredWidth() + measuredWidth2 + iLIZJ2 >= i3) {
                    break;
                }
                int i7 = measuredWidth2 + iLIZJ2;
                childAt2.layout(i7, 0, childAt2.getMeasuredWidth() + measuredWidth2 + iLIZJ2, childAt2.getMeasuredHeight());
                measuredWidth2 = i7;
                measuredWidth2 += childAt2.getMeasuredWidth();
                childCount3++;
            }
        }
        int childCount4 = (getChildCount() - childCount3) - 1;
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeViewsInLayout(childCount3 + 1, childCount4);
    }
}
