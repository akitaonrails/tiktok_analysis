package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS240S0000000_9;

/* JADX INFO: renamed from: X.0O22, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O22 {
    public static AnonymousClass0956 LJ;
    public static final C0O22 LIZ = new C0O22();
    public static final CopyOnWriteArrayList<IMContact> LIZIZ = new CopyOnWriteArrayList<>();
    public static final ConcurrentLinkedQueue<IMContact> LIZJ = new ConcurrentLinkedQueue<>();
    public static final C1231704rr LIZLLL = new C1231704rr("EditShare", null, 6);
    public static final List<WeakReference<C0O23>> LJFF = new ArrayList();

    public static Object LIZJ(C612850O1z c612850O1z) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(c612850O1z));
        c2252611DEt.LJIJJ();
        C1368260li4 c1368260li4 = new C1368260li4(4, false);
        c1368260li4.LJIIL = !C0ZNY.LIZJ();
        c1368260li4.LJJ = true;
        c1368260li4.LJI = true;
        C1381860m40 c1381860m40 = new C1381860m40(c1368260li4);
        AbstractC1381820m3w.LJII(c1381860m40, new C5185020h(c2252611DEt, 54), new C5183020f(c2252611DEt, 360));
        c1381860m40.LIZLLL();
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(c612850O1z);
        }
        return objLJIJ;
    }

    public static void LJ(List list) {
        List<WeakReference<C0O23>> list2 = LJFF;
        C19719612Di.LJJIIJ(list2, AFwS240S0000000_9.get$arr$(973), true);
        Iterator it2 = ((ArrayList) list2).iterator();
        while (it2.hasNext()) {
            C0O23 c0o23 = (C0O23) ((Reference) it2.next()).get();
            if (c0o23 != null) {
                c0o23.xS1(list);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super java.util.List<? extends com.ss.android.ugc.aweme.im.contacts.api.model.IMContact>> r10) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0O22.LIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.im.contacts.api.model.IMContact>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C612850O1z
            if (r0 == 0) goto L68
            r6 = r8
            X.0O1z r6 = (X.C612850O1z) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L68
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r5 = r6.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r3 = 3
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 == r1) goto L76
            if (r0 == r2) goto L4f
            if (r0 != r3) goto L6e
            X.C155000ia.LIZIZ(r5)
        L28:
            return r5
        L29:
            X.C155000ia.LIZIZ(r5)
            boolean r0 = X.C270280AiY.LIZIZ
            if (r0 != 0) goto L39
            r6.LLILLL = r1
            java.lang.Object r5 = LIZJ(r6)
            if (r5 != r4) goto L79
            return r4
        L39:
            X.0lmR r0 = com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi r0 = X.C1370970lmR.LIZ()
            X.0lcL r0 = r0.LIZIZ()
            r6.LLILLL = r2
            java.lang.Object r5 = r0.LJJIIJ(r6)
            if (r5 != r4) goto L52
            return r4
        L4f:
            X.C155000ia.LIZIZ(r5)
        L52:
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r5)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L7a
            r6.LLILLL = r3
            java.lang.Object r5 = LIZJ(r6)
            if (r5 != r4) goto L28
            return r4
        L68:
            X.0O1z r6 = new X.0O1z
            r6.<init>(r7, r8)
            goto L12
        L6e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L76:
            X.C155000ia.LIZIZ(r5)
        L79:
            return r5
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0O22.LIZIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C0O20
            if (r0 == 0) goto L3e
            r4 = r6
            X.0O20 r4 = (X.C0O20) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3e
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L32
            if (r1 != r0) goto L44
            X.C155000ia.LIZIZ(r3)
        L22:
            java.util.List r3 = (java.util.List) r3
            LJ(r3)
            java.util.concurrent.CopyOnWriteArrayList<com.ss.android.ugc.aweme.im.contacts.api.model.IMContact> r0 = X.C0O22.LIZIZ
            r0.clear()
            r0.addAll(r3)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L32:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0
            java.lang.Object r3 = r5.LIZ(r4)
            if (r3 != r2) goto L22
            return r2
        L3e:
            X.0O20 r4 = new X.0O20
            r4.<init>(r5, r6)
            goto L12
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0O22.LIZLLL(X.05Vn):java.lang.Object");
    }
}
