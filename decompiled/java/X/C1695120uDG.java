package X;

import Y.AComparatorS22S0000000_3;
import android.text.Layout;
import androidx.emoji2.text.e;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0uDG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695120uDG implements InterfaceC1692630u9F {
    public final String LIZ;
    public final C1693430uAX LIZIZ;
    public final List<C1692270u8f<? extends InterfaceC1692820u9Y>> LIZJ;
    public final List<C1692270u8f<C1680210tpD>> LIZLLL;
    public final InterfaceC594710NUf LJ;
    public final InterfaceC1690500u5o LJFF;
    public final C1695130uDH LJI;
    public final CharSequence LJII;
    public final C1695320uDa LJIIIIZZ;
    public C1695430uDl LJIIIZ;
    public final boolean LJIIJ;
    public final int LJIIJJI;

    @Override // X.InterfaceC1692630u9F
    public final boolean LIZ() {
        C1695430uDl c1695430uDl = this.LJIIIZ;
        if (c1695430uDl == null || !c1695430uDl.LIZ()) {
            if (this.LJIIJ || !C1693810uB9.LIZ(this.LIZIZ)) {
                return false;
            }
            C1695770uEJ c1695770uEJ = C1695750uEH.LIZ;
            C1695770uEJ c1695770uEJ2 = C1695750uEH.LIZ;
            C05P1<Boolean> c05p1LIZ = c1695770uEJ2.LIZ;
            if (c05p1LIZ == null) {
                if (e.LJ()) {
                    c05p1LIZ = c1695770uEJ2.LIZ();
                    c1695770uEJ2.LIZ = c05p1LIZ;
                } else {
                    c05p1LIZ = C1695760uEI.LIZ;
                }
            }
            if (!c05p1LIZ.getValue().booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC1692630u9F
    public final float LIZIZ() {
        float desiredWidth;
        C1695320uDa c1695320uDa = this.LJIIIIZZ;
        if (!Float.isNaN(c1695320uDa.LJ)) {
            return c1695320uDa.LJ;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(c1695320uDa.LIZIZ.getTextLocale());
        CharSequence charSequence = c1695320uDa.LIZ;
        lineInstance.setText(new C1695260uDU(charSequence.length(), charSequence));
        PriorityQueue priorityQueue = new PriorityQueue(10, new AComparatorS22S0000000_3(0));
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i), Integer.valueOf(next)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.getSecond()).intValue() - ((Number) pair.getFirst()).intValue() < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair(Integer.valueOf(i), Integer.valueOf(next)));
                }
            }
            i = next;
        }
        if (priorityQueue.isEmpty()) {
            desiredWidth = 0.0f;
        } else {
            Iterator it2 = priorityQueue.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            Pair pair2 = (Pair) it2.next();
            desiredWidth = Layout.getDesiredWidth(c1695320uDa.LIZIZ(), ((Number) pair2.getFirst()).intValue(), ((Number) pair2.getSecond()).intValue(), c1695320uDa.LIZIZ);
            while (it2.hasNext()) {
                Pair pair3 = (Pair) it2.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(c1695320uDa.LIZIZ(), ((Number) pair3.getFirst()).intValue(), ((Number) pair3.getSecond()).intValue(), c1695320uDa.LIZIZ));
            }
        }
        c1695320uDa.LJ = desiredWidth;
        return desiredWidth;
    }

    @Override // X.InterfaceC1692630u9F
    public final float LIZJ() {
        return this.LJIIIIZZ.LIZJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018d  */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r1v158 */
    /* JADX WARN: Type inference failed for: r1v159 */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v62, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v64, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r1v67, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r20v2, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r2v148, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v74, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v88, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v99, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1695120uDG(X.C1693430uAX r42, X.InterfaceC594710NUf r43, X.InterfaceC1690500u5o r44, java.lang.String r45, java.util.List r46, java.util.List r47) {
        /*
            Method dump skipped, instruction units count: 2313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1695120uDG.<init>(X.0uAX, X.0NUf, X.0u5o, java.lang.String, java.util.List, java.util.List):void");
    }
}
