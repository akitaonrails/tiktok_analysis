package X;

import android.util.Size;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AFwS291S0000000_8;
import kotlin.jvm.internal.AFwS332S0000000_8;

/* JADX INFO: renamed from: X.0LIy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C540820LIy {
    public static final /* synthetic */ int LJI = 0;
    public final C530750Krh LIZIZ;
    public final AtomicReference<C0LJ2> LIZLLL;
    public final AtomicBoolean LJ;
    public volatile C099F LJFF;
    public final int LIZ = ((Number) C280650AzH.LIZ.getValue()).intValue();
    public final C530020KqW LIZJ = new C530020KqW(C0CHQ.LIZ, true);

    static {
        new Size(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
    }

    public C540820LIy() {
        if (C530750Krh.LJFF == null) {
            C530750Krh.LIZIZ(C0CHQ.LIZ);
        }
        this.LIZIZ = C530750Krh.LJFF;
        if (C0LJ5.LIZJ() && C0LJ5.LIZIZ() && C0LJ5.LIZ().enableFirstScreenStableTruncation) {
            int iLIZLLL = C0LJ5.LIZLLL();
            C0LJ0.LJIIIIZZ = iLIZLLL;
            if (iLIZLLL != 30) {
                C0LJ0 c0lj0LIZ = C530760Kri.LIZ();
                if (c0lj0LIZ.LIZJ.compareAndSet(false, true)) {
                    c0lj0LIZ.LJJIJIIJIL(C11T2.LIZIZ(c0lj0LIZ.LJ), C11T2.LIZ(c0lj0LIZ.LJI), new C11TF(AFwS291S0000000_8.get$arr$(3), AFwS332S0000000_8.get$arr$(2)));
                }
            }
        }
        this.LIZLLL = new AtomicReference<>(null);
        this.LJ = new AtomicBoolean(false);
    }

    public static long LIZIZ(SocMediaResource socMediaResource) {
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "story_album_media_sort_by_date", true) == 1) {
            return socMediaResource.tiktokMediaModel.modify;
        }
        return socMediaResource.tiktokMediaModel.date;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0045, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0089 -> B:29:0x008b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource> LJ(java.util.List<com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource> r12, java.util.List<com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource> r13) {
        /*
            r11 = this;
            X.0C64 r4 = X.C0C64.LJIILLIIL()
            r3 = 31744(0x7c00, float:4.4483E-41)
            r2 = 0
            java.lang.String r0 = "story_album_media_sort_by_date"
            r1 = 1
            int r0 = r4.LJIJ(r3, r2, r0, r1)
            if (r0 != r1) goto L1f
            java.util.List r2 = X.C13LP.LJLIL(r13, r12)
            Y.AComparatorS507S0100000_8 r1 = new Y.AComparatorS507S0100000_8
            r0 = 2
            r1.<init>(r11, r0)
            java.util.List r0 = X.C13LP.LJLLLL(r1, r2)
            return r0
        L1f:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r10 = r12.iterator()
            java.util.Iterator r9 = r13.iterator()
            boolean r0 = r10.hasNext()
            r8 = 0
            if (r0 == 0) goto L77
            java.lang.Object r6 = r10.next()
            com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource r6 = (com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource) r6
        L39:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r5 = r9.next()
            com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource r5 = (com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource) r5
        L45:
            if (r6 == 0) goto L89
        L47:
            if (r5 == 0) goto L7b
            long r3 = LIZIZ(r6)
            long r1 = LIZIZ(r5)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L65
            r7.add(r6)
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L8b
            java.lang.Object r6 = r10.next()
            com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource r6 = (com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource) r6
            goto L45
        L65:
            r7.add(r5)
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r5 = r9.next()
            com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource r5 = (com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource) r5
            goto L47
        L75:
            r5 = r8
            goto L45
        L77:
            r6 = r8
            goto L39
        L79:
            if (r6 == 0) goto L89
        L7b:
            r7.add(r6)
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L89
            java.lang.Object r6 = r10.next()
            goto L79
        L89:
            if (r5 == 0) goto L99
        L8b:
            r7.add(r5)
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L99
            java.lang.Object r5 = r9.next()
            goto L89
        L99:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C540820LIy.LJ(java.util.List, java.util.List):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C0LJE r11, boolean r12, boolean r13, X.C0M8Q r14, X.InterfaceC1364105Vn<? super X.C0LJ4> r15) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C540820LIy.LIZ(X.0LJE, boolean, boolean, X.0M8Q, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0098 A[PHI: r9
      0x0098: PHI (r9v1 boolean) = (r9v0 boolean), (r9v5 boolean), (r9v5 boolean) binds: [B:49:0x0096, B:44:0x008c, B:46:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(final java.util.List<com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource> r17, int r18, final X.C0L20 r19, boolean r20, final X.C0M8Q r21, X.InterfaceC1364105Vn<? super java.lang.Boolean> r22) {
        /*
            r16 = this;
            X.099m r5 = new X.099m
            X.05Vn r0 = X.C099M.LIZLLL(r22)
            r5.<init>(r0)
            r4 = r19
            boolean r3 = r4.LIZJ
            r6 = r16
            if (r3 != 0) goto L95
            boolean r0 = r4.LIZIZ
            if (r0 != 0) goto L95
            int r0 = r4.LIZLLL
            if (r0 != 0) goto L95
            int r2 = r6.LIZ
            int r1 = r4.LJ
            r0 = 1
            if (r0 > r1) goto L95
            if (r1 >= r2) goto L95
            r9 = 1
        L23:
            boolean r0 = r4.LIZIZ
            if (r0 == 0) goto L8c
            X.0Kr5 r7 = X.C530370Kr5.LIZ
        L29:
            boolean r0 = r4.LIZIZ
            int r12 = r4.LIZLLL
            if (r0 == 0) goto L7d
            boolean r0 = X.C0LJ5.LIZJ()
            if (r0 == 0) goto L7a
            int r11 = X.C0LJ5.LIZLLL()
        L39:
            if (r9 == 0) goto L78
            int r0 = r4.LJ
        L3d:
            X.0L1z r3 = new X.0L1z
            r10 = r21
            r8 = r17
            r3.<init>()
            r13 = r20
            r10 = r18
            if (r7 == 0) goto L63
            X.0Krh r0 = r6.LIZIZ
            if (r0 == 0) goto L55
            r14 = r3
            r15 = r7
            X.C530750Krh.LJFF(r10, r11, r12, r13, r14, r15)
        L55:
            java.lang.Object r1 = r5.LIZ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L62
            X.C099Q.LIZJ(r22)
        L62:
            return r1
        L63:
            if (r0 < 0) goto L6f
            X.0Krh r9 = r6.LIZIZ
            if (r9 == 0) goto L55
            r14 = r3
            r15 = r0
            r9.LJ(r10, r11, r12, r13, r14, r15)
            goto L55
        L6f:
            X.0Krh r9 = r6.LIZIZ
            if (r9 == 0) goto L55
            r14 = r3
            r9.LIZLLL(r10, r11, r12, r13, r14)
            goto L55
        L78:
            r0 = -1
            goto L3d
        L7a:
            r11 = 30
            goto L39
        L7d:
            int r0 = r12 + 1
            r4.LIZLLL = r0
            if (r9 == 0) goto L89
            int r11 = r6.LIZ
            int r0 = r4.LJ
            int r11 = r11 - r0
            goto L39
        L89:
            int r11 = r6.LIZ
            goto L39
        L8c:
            if (r9 != 0) goto L98
            int r0 = r4.LIZLLL
            if (r0 != 0) goto L98
            X.0Kr3 r7 = X.C530350Kr3.LIZ
            goto L29
        L95:
            r9 = 0
            if (r3 == 0) goto L23
        L98:
            r7 = 0
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C540820LIy.LIZJ(java.util.List, int, X.0L20, boolean, X.0M8Q, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0183 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0188 A[PHI: r15
      0x0188: PHI (r15v1 int) = (r15v0 int), (r15v3 int) binds: [B:37:0x0185, B:31:0x011f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x031b A[PHI: r12
      0x031b: PHI (r12v3 java.lang.Long) = (r12v2 java.lang.Long), (r12v13 java.lang.Long), (r12v13 java.lang.Long) binds: [B:72:0x0295, B:74:0x0299, B:76:0x02a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0320  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(android.content.Context r42, boolean r43, boolean r44, android.util.Size r45, int r46, X.C05XL<kotlin.Unit> r47, X.InterfaceC1364105Vn<? super kotlin.Unit> r48) {
        /*
            Method dump skipped, instruction units count: 1386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C540820LIy.LJFF(android.content.Context, boolean, boolean, android.util.Size, int, X.05XL, X.05Vn):java.lang.Object");
    }
}
