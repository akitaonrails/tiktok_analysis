package X;

import android.content.Context;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0tuq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683700tuq extends ViewGroup {
    public final int LL;
    public final List<C1696990uGH> LLILLJJLI;
    public final List<C1696990uGH> LLILLL;
    public final C1683720tus LLILZ;
    public int LLILZIL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public C1683700tuq(Context context) {
        super(context);
        this.LL = 5;
        ArrayList arrayList = new ArrayList();
        this.LLILLJJLI = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.LLILLL = arrayList2;
        this.LLILZ = new C1683720tus();
        setClipChildren(false);
        C1696990uGH c1696990uGH = new C1696990uGH(context);
        addView(c1696990uGH);
        arrayList.add(c1696990uGH);
        arrayList2.add(c1696990uGH);
        this.LLILZIL = 1;
        setTag(R.id.jm5, Boolean.TRUE);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
