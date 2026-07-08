package X;

import android.view.View;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ivi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1261400ivi extends C09AY implements Function1<View, Boolean> {
    public final /* synthetic */ AbsRecUserCell<C1261650iw7> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1261400ivi(AbsRecUserCell<C1261650iw7> absRecUserCell, boolean z, long j, int i) {
        super(1);
        this.LL = absRecUserCell;
        this.LLILLJJLI = z;
        this.LLILLL = j;
        this.LLILZ = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0079  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke(android.view.View r7) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell<X.0iw7> r0 = r6.LL
            android.view.View r0 = r0.itemView
            boolean r0 = r0.isAttachedToWindow()
            if (r0 != 0) goto Ld
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        Ld:
            com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell<X.0iw7> r2 = r6.LL
            android.view.View r0 = r2.itemView
            android.view.ViewParent r1 = r0.getParent()
            boolean r0 = r1 instanceof androidx.recyclerview.widget.RecyclerView
            r5 = 0
            if (r0 == 0) goto L79
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            if (r1 == 0) goto L79
            boolean r0 = r1.isAnimating()
            if (r0 == 0) goto L79
            androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = r1.getLayoutManager()
            boolean r0 = r4 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L79
            androidx.recyclerview.widget.LinearLayoutManager r4 = (androidx.recyclerview.widget.LinearLayoutManager) r4
            if (r4 == 0) goto L79
            android.view.View r0 = r2.itemView
            int r3 = r1.getChildAdapterPosition(r0)
            r2 = -1
            if (r3 == r2) goto L79
            int r1 = r4.findFirstVisibleItemPosition()
            int r0 = r4.findLastVisibleItemPosition()
            if (r1 == r2) goto L79
            if (r1 > r3) goto L79
            if (r3 > r0) goto L79
            com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell<X.0iw7> r0 = r6.LL
            X.0zJl r0 = r0.getItem()
            X.0iw7 r0 = (X.C1261650iw7) r0
            if (r0 == 0) goto L59
            X.0iwS r0 = r0.LLILZIL
            if (r0 == 0) goto L59
            java.lang.String r5 = r0.getUid()
        L59:
            Y.ARunnableS3S1101000_19 r3 = new Y.ARunnableS3S1101000_19
            com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell<X.0iw7> r2 = r6.LL
            int r1 = r6.LLILZ
            r0 = 2
            r3.<init>(r1, r2, r5, r0)
            boolean r0 = r6.LLILLJJLI
            if (r0 == 0) goto L71
            android.view.View r2 = r2.itemView
            long r0 = r6.LLILLL
            r2.postOnAnimationDelayed(r3, r0)
        L6e:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L71:
            android.view.View r2 = r2.itemView
            long r0 = r6.LLILLL
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPostDelay(r2, r3, r0)
            goto L6e
        L79:
            com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell<X.0iw7> r0 = r6.LL
            android.view.View r1 = r0.itemView
            int r0 = r6.LLILZ
            X.C427690Gpr.LIZLLL(r1, r0)
            com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell<X.0iw7> r0 = r6.LL
            android.view.View r1 = r0.itemView
            int r0 = r6.LLILZ
            r1.setBackgroundColor(r0)
            goto L6e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1261400ivi.invoke(java.lang.Object):java.lang.Object");
    }
}
