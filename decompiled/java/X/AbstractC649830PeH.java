package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0PeH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC649830PeH<T extends Fragment> extends AbstractC650160Peo {
    public final int LLIZ;
    public final HashMap<Integer, T> LLIZLLLIL;

    @Override // X.AbstractC650160Peo
    public final void LJJJ() {
    }

    public final List<T> LJJJJI() {
        return new ArrayList(this.LLIZLLLIL.values());
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void notifyDataSetChanged() {
        HashMap<Integer, T> map = this.LLIZLLLIL;
        if (map != null) {
            map.clear();
        }
        super.notifyDataSetChanged();
    }

    public final void LJJJJIZL() {
        super.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0070 A[Catch: Exception -> 0x0096, TRY_LEAVE, TryCatch #0 {Exception -> 0x0096, blocks: (B:13:0x0034, B:15:0x0041, B:16:0x0047, B:18:0x004d, B:21:0x0061, B:23:0x0065, B:24:0x0070), top: B:36:0x0034 }] */
    @Override // X.AbstractC650180Peq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIJIL(int r11) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC649830PeH.LJJIJIL(int):java.lang.Object");
    }

    public final Fragment LJJJJ(int i) {
        HashMap<Integer, T> map = this.LLIZLLLIL;
        if (map != null && map.size() != 0) {
            return this.LLIZLLLIL.get(Integer.valueOf(i));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x001e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJJ(X.InterfaceC649880PeM<T, java.lang.Integer> r6) {
        /*
            r5 = this;
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
            java.util.HashMap<java.lang.Integer, T extends androidx.fragment.app.Fragment> r0 = r5.LLIZLLLIL
            if (r0 == 0) goto L5c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L5c
            java.util.List r1 = r5.LJJJJI()
            java.util.HashMap<java.lang.Integer, T extends androidx.fragment.app.Fragment> r0 = r5.LLIZLLLIL
            r0.clear()
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r3 = r1.iterator()
        L1e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L5c
            java.lang.Object r2 = r3.next()
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            if (r2 == 0) goto L1e
            java.lang.Object r1 = r6.apply(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.String r0 = r2.getTag()
            if (r0 != 0) goto L59
            boolean r0 = r2.isAdded()
            if (r0 != 0) goto L59
            if (r1 == 0) goto L1e
            int r0 = r1.intValue()
            if (r0 < 0) goto L4d
            int r0 = r1.intValue()
            r4.put(r0, r2)
        L4d:
            int r0 = r1.intValue()
            if (r0 < 0) goto L1e
            java.util.HashMap<java.lang.Integer, T extends androidx.fragment.app.Fragment> r0 = r5.LLIZLLLIL
            r0.put(r1, r2)
            goto L1e
        L59:
            if (r1 == 0) goto L1e
            goto L4d
        L5c:
            android.util.SparseArray<T> r0 = r5.LLILLJJLI
            r0.clear()
            r5.LLILLJJLI = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC649830PeH.LJJJJJ(X.0PeM):void");
    }

    public AbstractC649830PeH(FragmentManager fragmentManager, int i) {
        super(fragmentManager);
        this.LLIZ = i;
        this.LLIZLLLIL = new LinkedHashMap();
    }

    @Override // X.AbstractC650160Peo, androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) throws Throwable {
        Object objLJJI = super.LJJI(i, viewGroup);
        this.LLIZLLLIL.put(Integer.valueOf(i), (T) objLJJI);
        return objLJJI;
    }
}
