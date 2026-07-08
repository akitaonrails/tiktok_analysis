package X;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.11cd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19540111cd extends AbstractC1219760hqY {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIJJI;
    public final String LJIIIZ = "ExtractAudio";
    public final C19523211Zu LJIIJ = new C19523211Zu(this, "SingleExtract");

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19540111cd.class, "ability", "getAbility()Lcom/ss/android/ugc/gamora/editor/audioservice/pipeline/tools/abilities/IPPSingleExtractAbility;", 0);
        C13LE.LIZ.getClass();
        LJIIJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC19524311a5
    public final String LJIILLIIL() {
        return this.LJIIIZ;
    }

    @Override // X.AbstractC1219760hqY
    public final Object LJJIJL(List list) {
        boolean z;
        String str;
        Iterator it2 = list.iterator();
        loop0: while (true) {
            z = true;
            while (it2.hasNext()) {
                InterfaceC19526611aS interfaceC19526611aS = (InterfaceC19526611aS) it2.next();
                if (!z || (str = (String) LJJIII(interfaceC19526611aS, "Extract_File_Path")) == null || str.length() <= 0) {
                    z = false;
                }
            }
        }
        if (z) {
            return "_CONNECT_ID_DEFAULT";
        }
        return "_CONNECT_ID_TERMINATION_ERROR";
    }

    @Override // X.AbstractC19526011aM
    public final boolean LJIJJ(InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu) {
        if (c11zu == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(interfaceC19526611aS.LJJ());
        sbLIZ.append("Extract_File_Path");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        long jUptimeMillis = SystemClock.uptimeMillis();
        C11ZT<?> c11zt = c11zu.LIZ.get(strLIZIZ);
        Object obj = null;
        if (c11zt != null) {
            Integer num = c11zt.LIZIZ;
            if (num == null) {
                Object obj2 = c11zt.LIZ;
                if (obj2 instanceof String) {
                    obj = obj2;
                }
            } else if (jUptimeMillis - c11zt.LIZJ < ((long) num.intValue()) * 1000) {
                Object obj3 = c11zt.LIZ;
                if (obj3 instanceof String) {
                    obj = obj3;
                }
            }
        }
        LJJIJIIJI(interfaceC19526611aS, "Extract_File_Path", obj);
        if (obj == null) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC19526011aM
    public final void LJIJJLI(InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu) {
        Object objLJJIII;
        if (c11zu == null || (objLJJIII = LJJIII(interfaceC19526611aS, "Extract_File_Path")) == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(interfaceC19526611aS.LJJ());
        sbLIZ.append("Extract_File_Path");
        c11zu.LIZ(null, C2188811AlT.LIZIZ(sbLIZ), objLJJIII);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    @Override // X.AbstractC1219760hqY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIJIL(X.InterfaceC19526511aR r16, X.InterfaceC19526611aS r17, X.InterfaceC1364105Vn<? super kotlin.Unit> r18) {
        /*
            r15 = this;
            r3 = r18
            r9 = r17
            boolean r0 = r3 instanceof X.C19541011cm
            r8 = r15
            if (r0 == 0) goto L95
            r7 = r3
            X.11cm r7 = (X.C19541011cm) r7
            int r2 = r7.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L95
            int r2 = r2 - r1
            r7.LLILZLL = r2
        L17:
            java.lang.Object r1 = r7.LLILZ
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILZLL
            r5 = 1
            if (r0 == 0) goto L5a
            if (r0 != r5) goto L9c
            java.lang.Object r3 = r7.LLILLL
            java.lang.Object r4 = r7.LLILLJJLI
            java.lang.String r4 = (java.lang.String) r4
            X.11aS r9 = r7.LL
            X.C155000ia.LIZIZ(r1)
        L2f:
            java.lang.Number r1 = (java.lang.Number) r1
            int r10 = r1.intValue()
        L35:
            long r0 = X.C2286708xd.LJIIL(r4)
            java.lang.Long r1 = X.C2286608xc.LJFF(r0)
            java.lang.String r0 = "pp_data_key_original_file_size"
            r8.LJJIJIIJI(r9, r0, r1)
            java.lang.String r0 = "Extract_File_Path"
            if (r10 != 0) goto L4c
            r8.LJJIJIIJI(r9, r0, r3)
        L49:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4c:
            r13 = 0
            r8.LJJIJIIJI(r9, r0, r13)
            java.lang.String r11 = "extract error"
            java.lang.String r12 = r8.LJIIIZ
            X.11YJ r14 = X.C11YJ.VE_SDK
            r8.LJJIIZI(r9, r10, r11, r12, r13, r14)
            goto L49
        L5a:
            X.C155000ia.LIZIZ(r1)
            java.lang.String r0 = "Original_File_Path"
            java.lang.Object r4 = r8.LJJIII(r9, r0)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r3 = ""
            if (r4 != 0) goto L6a
            r4 = r3
        L6a:
            java.lang.String r0 = "Set_Extract_File_Path"
            java.lang.Object r0 = r8.LJJIII(r9, r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L75
            r3 = r0
        L75:
            X.11Zu r2 = r8.LJIIJ
            X.1Bqa<java.lang.Object>[] r1 = X.C19540111cd.LJIIJJI
            r0 = 0
            r0 = r1[r0]
            java.lang.Object r0 = r2.getValue(r8, r0)
            X.11dC r0 = (X.InterfaceC19543611dC) r0
            if (r0 == 0) goto L93
            r7.LL = r9
            r7.LLILLJJLI = r4
            r7.LLILLL = r3
            r7.LLILZLL = r5
            java.lang.Object r1 = r0.LJI(r3, r4, r7)
            if (r1 != r6) goto L2f
            return r6
        L93:
            r10 = -1
            goto L35
        L95:
            X.11cm r7 = new X.11cm
            r7.<init>(r8, r3)
            goto L17
        L9c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19540111cd.LJJIJIL(X.11aR, X.11aS, X.05Vn):java.lang.Object");
    }
}
