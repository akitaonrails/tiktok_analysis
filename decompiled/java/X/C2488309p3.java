package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: X.09p3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2488309p3 {
    public static final /* synthetic */ int LJFF = 0;
    public final CreativeInfo LIZ;
    public final C054G LIZIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(new C09AL()));
    public final ConcurrentLinkedQueue<C2488009p0> LIZJ = new ConcurrentLinkedQueue<>();
    public final ConcurrentHashMap<C2488609p6, C2488009p0> LIZLLL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Integer> LJ = new ConcurrentHashMap<>();

    public C2488309p3(CreativeInfo creativeInfo) {
        this.LIZ = creativeInfo;
    }

    public final void LIZ(CreativeInfo creativeInfo) {
        File fileLIZJ = C2489809pI.LIZJ(creativeInfo);
        if (fileLIZJ.isDirectory() && fileLIZJ.exists()) {
            C23250099c.LIZIZ(this.LIZIZ, null, null, new C2488209p2(this, null), 3);
        }
    }

    public static final Object LIZJ(String str, C2488409p4 c2488409p4) {
        if (!C23118094a.LJIIIIZZ(c2488409p4.getContext())) {
            C0VSJ c0vsj = new C0VSJ(str);
            if (c0vsj.exists()) {
                c0vsj.delete();
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C2488009p0 r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2488309p3.LIZIZ(X.09p0, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.util.ArrayList<com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r12, java.util.concurrent.ConcurrentHashMap<com.ss.android.ugc.aweme.mediachoose.helper.MediaModel, java.lang.String> r13, java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r14, X.InterfaceC1364105Vn<? super java.lang.Boolean> r15) {
        /*
            r11 = this;
            r3 = r15
            boolean r0 = r3 instanceof X.C2488509p5
            if (r0 == 0) goto L9d
            r6 = r3
            X.09p5 r6 = (X.C2488509p5) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9d
            int r2 = r2 - r1
            r6.LLILLL = r2
        L13:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 1
            if (r0 == 0) goto L2d
            if (r0 != r4) goto La4
            X.C155000ia.LIZIZ(r1)
        L23:
            com.ss.android.ugc.aweme.creative.model.CreativeInfo r0 = r11.LIZ
            r11.LIZ(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L2d:
            X.C155000ia.LIZIZ(r1)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r8 = r12.iterator()
        L3e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r0 = r8.next()
            com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r0 = (com.ss.android.ugc.aweme.mediachoose.helper.MediaModel) r0
            X.09p6 r7 = new X.09p6
            java.lang.String r2 = r0.LJFF()
            long r0 = r0.modify
            r7.<init>(r2, r0)
            java.util.concurrent.ConcurrentHashMap<X.09p6, X.09p0> r0 = r11.LIZLLL
            java.lang.Object r0 = r0.get(r7)
            X.09p0 r0 = (X.C2488009p0) r0
            if (r0 == 0) goto Lac
            r9.add(r0)
            X.0957<?> r0 = r0.LIZLLL
            if (r0 != 0) goto L3e
            com.ss.android.ugc.aweme.creative.model.CreativeInfo r0 = r11.LIZ
            r11.LIZ(r0)
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L71:
            java.util.Iterator r2 = r9.iterator()
        L75:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L94
            java.lang.Object r8 = r2.next()
            X.09p0 r8 = (X.C2488009p0) r8
            X.054G r1 = r11.LIZIZ
            X.09oz r7 = new X.09oz
            r12 = 0
            r10 = r14
            r9 = r13
            r7.<init>(r8, r9, r10, r11, r12)
            r0 = 3
            X.099G r0 = X.C23250099c.LIZIZ(r1, r12, r12, r7, r0)
            r3.add(r0)
            goto L75
        L94:
            r6.LLILLL = r4
            java.lang.Object r0 = X.C1D9F.LIZ(r3, r6)
            if (r0 != r5) goto L23
            return r5
        L9d:
            X.09p5 r6 = new X.09p5
            r6.<init>(r11, r3)
            goto L13
        La4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lac:
            com.ss.android.ugc.aweme.creative.model.CreativeInfo r0 = r11.LIZ
            r11.LIZ(r0)
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2488309p3.LIZLLL(java.util.ArrayList, java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentHashMap, X.05Vn):java.lang.Object");
    }
}
