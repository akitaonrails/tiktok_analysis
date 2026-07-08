package X;

import android.util.LruCache;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0O4O, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O4O extends C0O72<String, C0O42> {
    public final int LIZIZ;
    public final long LIZJ;
    public final C01GW LIZLLL;

    public C0O4O() {
        this(Integer.MAX_VALUE, -1L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    @Override // X.C0O72
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0O42 LIZLLL(java.lang.String r8) {
        /*
            r7 = this;
            X.01GW r0 = r7.LIZLLL
            java.lang.Object r0 = r0.getValue()
            android.util.LruCache r0 = (android.util.LruCache) r0
            java.lang.Object r6 = r0.get(r8)
            X.0O4U r6 = (X.C0O4U) r6
            r5 = 0
            if (r6 == 0) goto L29
            long r1 = r7.LIZJ
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L2a
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r6.LIZIZ
            long r3 = r3 - r0
            long r1 = r7.LIZJ
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2a
            r7.remove(r8)
        L29:
            return r5
        L2a:
            PO r0 = r6.LIZ
            X.0O42 r0 = (X.C0O42) r0
            com.ss.android.ugc.aweme.topic.movie.detail.api.MovieDetailResp r1 = r0.LIZ
            if (r1 == 0) goto L29
            com.ss.android.ugc.aweme.topic.movie.model.MovieDetail r0 = r1.detail
            if (r0 == 0) goto L6b
            java.lang.String r4 = r0.id
        L38:
            boolean r0 = r1.isCollected
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L3e:
            if (r4 == 0) goto L29
            if (r1 == 0) goto L29
            r1.booleanValue()
            X.0O42 r3 = new X.0O42
            PO r0 = r6.LIZ
            X.0O42 r0 = (X.C0O42) r0
            com.ss.android.ugc.aweme.topic.movie.detail.api.MovieDetailResp r2 = r0.LIZ
            if (r2 == 0) goto L62
            X.0O4K r0 = X.C0O4K.MOVIE
            java.lang.Boolean r0 = X.C0O4L.LIZIZ(r0, r4)
            if (r0 == 0) goto L66
            boolean r1 = r0.booleanValue()
        L5b:
            com.ss.android.ugc.aweme.topic.movie.model.MovieDetail r0 = r2.detail
            com.ss.android.ugc.aweme.topic.movie.detail.api.MovieDetailResp r5 = new com.ss.android.ugc.aweme.topic.movie.detail.api.MovieDetailResp
            r5.<init>(r1, r0)
        L62:
            r3.<init>(r5)
            return r3
        L66:
            boolean r1 = r1.booleanValue()
            goto L5b
        L6b:
            r4 = r5
            if (r1 != 0) goto L38
            r1 = r5
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0O4O.LIZLLL(java.lang.Object):java.lang.Object");
    }

    @Override // X.C0O72
    public final C0O4U<C0O42> LJ(String str) {
        return (C0O4U) ((LruCache) this.LIZLLL.getValue()).remove(str);
    }

    public C0O4O(int i, long j) {
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LIZLLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1552));
    }

    @Override // X.C0O72
    public final C0O4V LJFF(Object obj, Object obj2) {
        String str = (String) obj;
        C0O4V c0o4v = new C0O4V(str, obj2, System.currentTimeMillis());
        ((LruCache) this.LIZLLL.getValue()).put(str, c0o4v);
        return c0o4v;
    }
}
