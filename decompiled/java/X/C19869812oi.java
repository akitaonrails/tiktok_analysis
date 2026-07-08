package X;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.12oi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19869812oi<K, V> extends AbstractC19870912ot<K, V> {
    public static final C19869812oi LLIZLLLIL = new C19869812oi(0, null, new Object[0]);
    public static final long serialVersionUID = 0;
    public final transient Object LLILZIL;
    public final transient Object[] LLILZLL;
    public final transient int LLIZ;

    @Override // X.AbstractC19870912ot
    public final boolean LJ() {
        return false;
    }

    @Override // X.AbstractC19870912ot
    public final AbstractC19875112pZ<Map.Entry<K, V>> LIZ() {
        return new C19869912oj(this, this.LLILZLL, this.LLIZ);
    }

    @Override // X.AbstractC19870912ot
    public final AbstractC19875112pZ<K> LIZIZ() {
        final C19865112nx c19865112nx = new C19865112nx(0, this.LLIZ, this.LLILZLL);
        return new AbstractC19875112pZ<K>(this, c19865112nx) { // from class: X.12of
            public final transient AbstractC19870912ot<K, ?> LLILLL;
            public final transient AbstractC19875512pd<K> LLILZ;

            @Override // X.AbstractC19875812pg
            public final boolean LJIIIZ() {
                return true;
            }

            @Override // X.AbstractC19875112pZ, X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final AbstractC19853312m3<K> iterator() {
                return this.LLILZ.iterator();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return this.LLILLL.size();
            }

            @Override // X.AbstractC19875112pZ, X.AbstractC19875812pg
            public final AbstractC19875512pd<K> asList() {
                return this.LLILZ;
            }

            @Override // X.AbstractC19875112pZ, X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final /* bridge */ /* synthetic */ Iterator iterator() {
                return iterator();
            }

            @Override // X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                if (this.LLILLL.get(obj) != null) {
                    return true;
                }
                return false;
            }

            {
                this.LLILLL = this;
                this.LLILZ = c19865112nx;
            }

            @Override // X.AbstractC19875812pg
            public final int LIZJ(int i, Object[] objArr) {
                return this.LLILZ.LIZJ(i, objArr);
            }
        };
    }

    @Override // X.AbstractC19870912ot
    public final AbstractC19875812pg<V> LIZJ() {
        return new C19865112nx(1, this.LLIZ, this.LLILZLL);
    }

    @Override // java.util.Map
    public final int size() {
        return this.LLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f A[RETURN] */
    @Override // X.AbstractC19870912ot, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V get(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r5 = r7.LLILZIL
            java.lang.Object[] r4 = r7.LLILZLL
            int r0 = r7.LLIZ
            r6 = 0
            if (r8 == 0) goto L97
            r1 = 1
            if (r0 != r1) goto L20
            r0 = 0
            r0 = r4[r0]
            java.util.Objects.requireNonNull(r0)
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L97
            r0 = r4[r1]
            java.util.Objects.requireNonNull(r0)
        L1d:
            if (r0 == 0) goto L97
            return r0
        L20:
            if (r5 == 0) goto L97
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L4b
            byte[] r5 = (byte[]) r5
            int r0 = r5.length
            int r3 = r0 + (-1)
            int r0 = r8.hashCode()
            int r2 = X.C19876812pq.LIZ(r0)
        L33:
            r2 = r2 & r3
            r1 = r5[r2]
            r0 = 255(0xff, float:3.57E-43)
            r1 = r1 & r0
            if (r1 == r0) goto L97
            r0 = r4[r1]
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L48
            r0 = r1 ^ 1
            r0 = r4[r0]
            goto L1d
        L48:
            int r2 = r2 + 1
            goto L33
        L4b:
            boolean r0 = r5 instanceof short[]
            if (r0 == 0) goto L75
            short[] r5 = (short[]) r5
            int r0 = r5.length
            int r3 = r0 + (-1)
            int r0 = r8.hashCode()
            int r2 = X.C19876812pq.LIZ(r0)
        L5c:
            r2 = r2 & r3
            short r1 = r5[r2]
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            if (r1 == r0) goto L97
            r0 = r4[r1]
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L72
            r0 = r1 ^ 1
            r0 = r4[r0]
            goto L1d
        L72:
            int r2 = r2 + 1
            goto L5c
        L75:
            int[] r5 = (int[]) r5
            int r3 = r5.length
            int r3 = r3 - r1
            int r0 = r8.hashCode()
            int r2 = X.C19876812pq.LIZ(r0)
        L81:
            r2 = r2 & r3
            r1 = r5[r2]
            r0 = -1
            if (r1 == r0) goto L97
            r0 = r4[r1]
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L94
            r0 = r1 ^ 1
            r0 = r4[r0]
            goto L1d
        L94:
            int r2 = r2 + 1
            goto L81
        L97:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19869812oi.get(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        r7[r2] = (byte) r5;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        r7[r2] = (short) r5;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d3, code lost:
    
        r7[r2] = r5;
        r6 = r6 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <K, V> X.C19869812oi<K, V> LJFF(int r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19869812oi.LJFF(int, java.lang.Object[]):X.12oi");
    }

    public C19869812oi(int i, Object obj, Object[] objArr) {
        this.LLILZIL = obj;
        this.LLILZLL = objArr;
        this.LLIZ = i;
    }

    public static IllegalArgumentException LJI(int i, Object obj, Object obj2, Object[] objArr) {
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(obj2);
        String strValueOf3 = String.valueOf(objArr[i]);
        String strValueOf4 = String.valueOf(objArr[i ^ 1]);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 39 + strValueOf2.length() + strValueOf3.length() + strValueOf4.length());
        sb.append("Multiple entries with same key: ");
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        sb.append(" and ");
        sb.append(strValueOf3);
        sb.append("=");
        sb.append(strValueOf4);
        return new IllegalArgumentException(sb.toString());
    }
}
