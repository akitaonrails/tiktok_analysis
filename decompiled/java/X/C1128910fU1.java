package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0fU1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128910fU1 {
    public final Context LIZ;
    public final RecyclerView LIZIZ;
    public final C1127050fR1 LIZJ;
    public final DataChannel LIZLLL;
    public final Function0<List<AbstractC1126600fQI<? extends AnonymousClass0054>>> LJFF;
    public final Function0<Boolean> LJI;
    public final int LJ = 4;
    public final Map<C01AG, Long> LJII = new LinkedHashMap();
    public final Map<C01AG, C1129480fUw> LJIIIIZZ = new LinkedHashMap();

    public final void LIZ(C01AG c01ag) {
        LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList;
        RecyclerView recyclerView;
        List<AbstractC1126600fQI<? extends AnonymousClass0054>> listSubList;
        AbstractC21673719rz itemAnimator;
        this.LJII.remove(c01ag);
        C1127050fR1 c1127050fR1 = this.LIZJ;
        if (c1127050fR1 != null && (linkedList = c1127050fR1.LL) != null) {
            Iterator<AbstractC1126600fQI<? extends AnonymousClass0054>> it2 = linkedList.iterator();
            int i = 0;
            while (true) {
                int iNextIndex = -1;
                if (it2.hasNext()) {
                    AbstractC1126600fQI<? extends AnonymousClass0054> next = it2.next();
                    if (next != null && next.LIZ == c01ag.getHeaderType()) {
                        if (i != -1) {
                            ListIterator<AbstractC1126600fQI<? extends AnonymousClass0054>> listIterator = linkedList.listIterator(linkedList.size());
                            while (listIterator.hasPrevious()) {
                                AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQIPrevious = listIterator.previous();
                                if (abstractC1126600fQIPrevious != null && (abstractC1126600fQIPrevious.LIZ == c01ag.getHeaderType() || C01AT.LIZ(abstractC1126600fQIPrevious, c01ag))) {
                                    iNextIndex = listIterator.nextIndex();
                                    break;
                                }
                            }
                            if (iNextIndex < i) {
                                return;
                            }
                            int i2 = (iNextIndex - i) + 1;
                            RecyclerView recyclerView2 = this.LIZIZ;
                            if ((recyclerView2 == null || recyclerView2.getItemAnimator() == null) && (recyclerView = this.LIZIZ) != null) {
                                recyclerView.setItemAnimator(new C1149320g0w());
                            }
                            RecyclerView recyclerView3 = this.LIZIZ;
                            if (recyclerView3 != null && (itemAnimator = recyclerView3.getItemAnimator()) != null) {
                                itemAnimator.LJIIL();
                            }
                            List<AbstractC1126600fQI<? extends AnonymousClass0054>> listInvoke = this.LJFF.invoke();
                            if (listInvoke != null && (listSubList = listInvoke.subList(i, iNextIndex + 1)) != null) {
                                listSubList.clear();
                            }
                            this.LIZJ.LL.subList(i, iNextIndex + 1).clear();
                            this.LIZJ.notifyItemRangeRemoved(i, i2);
                            return;
                        }
                        return;
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final long LIZIZ(C01AG c01ag) {
        Long l = (Long) ((LinkedHashMap) this.LJII).get(c01ag);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.util.List<? extends X.AbstractC1126600fQI<? extends X.AnonymousClass0054>> r10) {
        /*
            r9 = this;
            if (r10 != 0) goto La
            java.util.Map<X.01AG, java.lang.Long> r0 = r9.LJII
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            r0.clear()
            return
        La:
            X.01AG[] r8 = X.C01AG.values()
            int r7 = r8.length
            r6 = 0
        L10:
            if (r6 >= r7) goto L61
            r5 = r8[r6]
            java.util.Iterator r3 = r10.iterator()
        L18:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L5f
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.0fQI r0 = (X.AbstractC1126600fQI) r0
            if (r0 == 0) goto L18
            int r1 = r0.LIZ
            int r0 = r5.getHeaderType()
            if (r1 != r0) goto L18
        L2f:
            X.0fQI r2 = (X.AbstractC1126600fQI) r2
            if (r2 != 0) goto L3b
            java.util.Map<X.01AG, java.lang.Long> r0 = r9.LJII
            r0.remove(r5)
        L38:
            int r6 = r6 + 1
            goto L10
        L3b:
            boolean r0 = r2 instanceof X.C01AL
            if (r0 == 0) goto L38
            X.01AL r2 = (X.C01AL) r2
            X.0fQI<? extends X.0054> r0 = r2.LJJI
            r3 = 0
            if (r0 == 0) goto L59
            long r1 = r0.LJFF()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L59
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.util.Map<X.01AG, java.lang.Long> r0 = r9.LJII
            r0.put(r5, r1)
            goto L38
        L59:
            java.util.Map<X.01AG, java.lang.Long> r0 = r9.LJII
            r0.remove(r5)
            goto L38
        L5f:
            r2 = 0
            goto L2f
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1128910fU1.LIZJ(java.util.List):void");
    }

    public C1128910fU1(Context context, RunnableC781530UlD runnableC781530UlD, C1127050fR1 c1127050fR1, DataChannel dataChannel, AwS561S0100000_17 awS561S0100000_17, AwS561S0100000_17 awS561S0100000_172) {
        this.LIZ = context;
        this.LIZIZ = runnableC781530UlD;
        this.LIZJ = c1127050fR1;
        this.LIZLLL = dataChannel;
        this.LJFF = awS561S0100000_17;
        this.LJI = awS561S0100000_172;
    }
}
