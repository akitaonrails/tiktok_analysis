package X;

import java.util.List;

/* JADX INFO: renamed from: X.0weW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1788900weW implements InterfaceC560980LzM<Object, List<Object>> {
    public final /* synthetic */ InterfaceC560980LzM<Object, List<Object>> LIZ;
    public final /* synthetic */ InterfaceC560980LzM<Object, Object> LIZIZ;

    @Override // X.InterfaceC560980LzM
    public final String getName() {
        return "each";
    }

    public C1788900weW(InterfaceC560980LzM<Object, List<Object>> interfaceC560980LzM, InterfaceC560980LzM<Object, Object> interfaceC560980LzM2) {
        this.LIZ = interfaceC560980LzM;
        this.LIZIZ = interfaceC560980LzM2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0052 -> B:12:0x0033). Please report as a decompilation issue!!! */
    @Override // X.InterfaceC560980LzM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.Object r9, X.InterfaceC1364105Vn<? super java.util.List<java.lang.Object>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C1788910weX
            if (r0 == 0) goto L79
            r5 = r10
            X.0weX r5 = (X.C1788910weX) r5
            int r2 = r5.LLIZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L79
            int r2 = r2 - r1
            r5.LLIZ = r2
        L12:
            java.lang.Object r7 = r5.LLILZIL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLIZ
            r4 = 2
            r1 = 1
            if (r0 == 0) goto L54
            if (r0 == r1) goto L62
            if (r0 != r4) goto L80
            java.lang.Object r3 = r5.LLILZ
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r2 = r5.LLILLL
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r0 = r5.LLILLJJLI
            java.util.Collection r0 = (java.util.Collection) r0
            X.0LzM r1 = r5.LL
            X.C155000ia.LIZIZ(r7)
        L33:
            r3.add(r7)
            r3 = r0
        L37:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r2.next()
            r5.LL = r1
            r5.LLILLJJLI = r3
            r5.LLILLL = r2
            r5.LLILZ = r3
            r5.LLIZ = r4
            java.lang.Object r7 = r1.LIZ(r0, r5)
            if (r7 != r6) goto L52
            return r6
        L52:
            r0 = r3
            goto L33
        L54:
            X.C155000ia.LIZIZ(r7)
            X.0LzM<java.lang.Object, java.util.List<java.lang.Object>> r0 = r8.LIZ
            r5.LLIZ = r1
            java.lang.Object r7 = r0.LIZ(r9, r5)
            if (r7 != r6) goto L65
            return r6
        L62:
            X.C155000ia.LIZIZ(r7)
        L65:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            X.0LzM<java.lang.Object, java.lang.Object> r1 = r8.LIZIZ
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r7, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r7.iterator()
            goto L37
        L79:
            X.0weX r5 = new X.0weX
            r5.<init>(r8, r10)
            goto L12
        L7f:
            return r3
        L80:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1788900weW.LIZ(java.lang.Object, X.05Vn):java.lang.Object");
    }
}
