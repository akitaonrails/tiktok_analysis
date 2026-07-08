package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Gmr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425830Gmr extends ViewGroup {
    public final float LL;
    public final float LLILLJJLI;
    public final float LLILLL;
    public final List<C425820Gmq> LLILZ;
    public final List<C425820Gmq> LLILZIL;
    public boolean LLILZLL;

    public final void LIZ() {
        int i = 0;
        for (C425820Gmq c425820Gmq : this.LLILZ) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            c425820Gmq.LIZIZ(i == C1697810uHb.LJIIJ(this.LLILZ));
            i = i2;
        }
    }

    public final int getAvatarCount() {
        return ((ArrayList) this.LLILZ).size();
    }

    public C425830Gmr(Context context) {
        super(context, null, 0);
        float f = getResources().getDisplayMetrics().density;
        this.LL = f;
        this.LLILLJJLI = 28.0f * f;
        this.LLILLL = f * 24.0f;
        this.LLILZ = new ArrayList();
        this.LLILZIL = new ArrayList();
        setClipChildren(false);
        setClipToPadding(false);
    }

    public final void setAvatars(List<? extends UrlModel> list) {
        C425820Gmq c425820Gmq;
        ((ArrayList) this.LLILZIL).clear();
        List listLL = C13LP.LL(list, 3);
        while (((ArrayList) this.LLILZ).size() > listLL.size()) {
            List<C425820Gmq> list2 = this.LLILZ;
            View view = (View) ListProtector.remove(list2, C1697810uHb.LJIIJ(list2));
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, view);
            removeView(view);
        }
        int size = listLL.size();
        for (int i = 0; i < size; i++) {
            if (i < ((ArrayList) this.LLILZ).size()) {
                c425820Gmq = (C425820Gmq) ListProtector.get(this.LLILZ, i);
            } else {
                c425820Gmq = new C425820Gmq(this, getContext());
                addView(c425820Gmq);
                ((ArrayList) this.LLILZ).add(c425820Gmq);
                ((ArrayList) this.LLILZIL).add(c425820Gmq);
            }
            c425820Gmq.LIZ((UrlModel) ListProtector.get(listLL, i));
        }
        LIZ();
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMax = Math.max(((ArrayList) this.LLILZ).size(), 1);
        float f = this.LLILLJJLI;
        float f2 = ((iMax - 1) * this.LLILLL) + f;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) f, 1073741824);
        Iterator<C425820Gmq> it2 = this.LLILZ.iterator();
        while (it2.hasNext()) {
            it2.next().measure(iMakeMeasureSpec, iMakeMeasureSpec);
        }
        setMeasuredDimension(ViewGroup.resolveSize((int) f2, i), ViewGroup.resolveSize((int) this.LLILLJJLI, i2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        if (this.LLILZLL) {
            return;
        }
        if (getLayoutDirection() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int size = ((ArrayList) this.LLILZ).size();
        int i5 = 0;
        for (C425820Gmq c425820Gmq : this.LLILZ) {
            int i6 = i5 + 1;
            if (i5 >= 0) {
                C425820Gmq c425820Gmq2 = c425820Gmq;
                if (z2) {
                    i5 = (size - 1) - i5;
                }
                int i7 = (int) (i5 * this.LLILLL);
                float f = this.LLILLJJLI;
                c425820Gmq2.layout(i7, 0, (int) (i7 + f), (int) f);
                i5 = i6;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }
}
