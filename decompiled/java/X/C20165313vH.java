package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pns.psi.PsiEncrypt;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.relation.auth.model.PsiContactStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS2S0300200_30;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13vH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20165313vH {
    public final C1074950e4z LIZ;
    public final C20166313vR LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(329));

    public final byte[] LJII() {
        return (byte[]) this.LIZJ.getValue();
    }

    public final Map<String, String> LIZ(C20165213vG c20165213vG) {
        Gson gson = C7740030o.LIZ().getGson();
        Pair[] pairArr = new Pair[3];
        List<C13MP> list = c20165213vG.LIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C13MP> it2 = list.iterator();
        while (true) {
            byte[] bArr = null;
            if (!it2.hasNext()) {
                break;
            }
            C13MP next = it2.next();
            String str = next.LIZIZ;
            if (str == null) {
                str = null;
            }
            byte[] bArr2 = next.LIZJ;
            if (bArr2 != null) {
                bArr = bArr2;
            }
            arrayList.add(new PsiContactStruct(bArr, str));
        }
        pairArr[0] = new Pair("email_contact", GsonProtectorUtils.toJson(gson, arrayList));
        List<C13MP> list2 = c20165213vG.LIZIZ;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        for (C13MP c13mp : list2) {
            String str2 = c13mp.LIZIZ;
            if (str2 == null) {
                str2 = null;
            }
            byte[] bArr3 = c13mp.LIZJ;
            if (bArr3 == null) {
                bArr3 = null;
            }
            arrayList2.add(new PsiContactStruct(bArr3, str2));
        }
        pairArr[1] = new Pair("phone_contact", GsonProtectorUtils.toJson(gson, arrayList2));
        pairArr[2] = new Pair("log_id", this.LIZIZ.LJJJJ);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public C20165313vH(C1074950e4z c1074950e4z, C20166313vR c20166313vR) {
        this.LIZ = c1074950e4z;
        this.LIZIZ = c20166313vR;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.C20165213vG r9, X.InterfaceC1364105Vn<? super java.lang.Boolean> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C20165813vM
            if (r0 == 0) goto L97
            r5 = r10
            X.13vM r5 = (X.C20165813vM) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L97
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r6 = 0
            r2 = 2
            r7 = 1
            if (r0 == 0) goto L33
            if (r0 == r7) goto L4a
            if (r0 != r2) goto L9e
            java.lang.Object r0 = r5.LL
            com.ss.android.ugc.aweme.relation.auth.model.PsiUploadEncryptContactResponseV2 r0 = (com.ss.android.ugc.aweme.relation.auth.model.PsiUploadEncryptContactResponseV2) r0
            X.C155000ia.LIZIZ(r4)
        L2a:
            boolean r0 = r0.getVerifyAcc()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L33:
            X.C155000ia.LIZIZ(r4)
            X.13vR r4 = r8.LIZIZ
            X.13vZ r1 = r4.LJIILJJIL
            X.13vJ r0 = new X.13vJ
            r0.<init>(r8, r9, r6)
            r5.LL = r9
            r5.LLILZ = r7
            java.lang.Object r4 = r4.LJ(r1, r0, r5)
            if (r4 != r3) goto L51
            return r3
        L4a:
            java.lang.Object r9 = r5.LL
            X.13vG r9 = (X.C20165213vG) r9
            X.C155000ia.LIZIZ(r4)
        L51:
            com.ss.android.ugc.aweme.relation.auth.model.PsiUploadEncryptContactResponseV2 r4 = (com.ss.android.ugc.aweme.relation.auth.model.PsiUploadEncryptContactResponseV2) r4
            X.13vR r7 = r8.LIZIZ
            java.util.List r0 = r4.getHashABListEmail()
            int r0 = r0.size()
            long r0 = (long) r0
            r7.LJIJJLI = r0
            X.13vR r7 = r8.LIZIZ
            byte[] r0 = r4.getBloomFilterBitsEmail()
            int r0 = r0.length
            long r0 = (long) r0
            r7.LJIL = r0
            X.13vR r7 = r8.LIZIZ
            java.util.List r0 = r4.getHashABList()
            int r0 = r0.size()
            long r0 = (long) r0
            r7.LJIIZILJ = r0
            X.13vR r7 = r8.LIZIZ
            byte[] r0 = r4.getBloomFilterBits()
            int r0 = r0.length
            long r0 = (long) r0
            r7.LJIJ = r0
            X.13vR r7 = r8.LIZIZ
            X.13vZ r1 = r7.LJIILL
            X.13vF r0 = new X.13vF
            r0.<init>(r8, r4, r9, r6)
            r5.LL = r4
            r5.LLILZ = r2
            java.lang.Object r0 = r7.LJ(r1, r0, r5)
            if (r0 != r3) goto L95
            return r3
        L95:
            r0 = r4
            goto L2a
        L97:
            X.13vM r5 = new X.13vM
            r5.<init>(r8, r10)
            goto L12
        L9e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20165313vH.LJIIIIZZ(X.13vG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(X.C20165213vG r12, X.InterfaceC1364105Vn<? super java.lang.Boolean> r13) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20165313vH.LJIIIZ(X.13vG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.C20165213vG r8, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.relation.auth.model.PsiUploadEncryptContactResponseV2> r9) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20165313vH.LJIIJ(X.13vG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(X.C20165213vG r8, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.relation.auth.model.PsiUploadEncryptContactResponseV3> r9) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20165313vH.LJIIJJI(X.13vG, X.05Vn):java.lang.Object");
    }

    public static void LIZIZ(C20165313vH c20165313vH, List list, byte[] bArr) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new AwS431S0200000_30((C13MP) it2.next(), bArr, 110));
        }
        C2232708ov.LIZ(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0113 A[LOOP:1: B:44:0x010d->B:46:0x0113, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0167 A[LOOP:3: B:54:0x0161->B:56:0x0167, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(java.util.Set<java.lang.String> r12, java.util.Set<java.lang.String> r13, X.InterfaceC1364105Vn<? super X.C11H7<java.util.HashSet<java.lang.String>, java.util.HashSet<java.lang.String>, java.lang.Boolean>> r14) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20165313vH.LJI(java.util.Set, java.util.Set, X.05Vn):java.lang.Object");
    }

    public static final void LIZJ(long j, long j2, C13MP c13mp, byte[] bArr, byte[] bArr2) {
        Boolean boolValueOf;
        PsiEncrypt.Companion companion = PsiEncrypt.LIZ;
        byte[] bArr3 = c13mp.LIZLLL;
        if (bArr3 == null) {
            bArr3 = null;
        }
        byte[] bArrUnBlindPsi = companion.unBlindPsi(bArr3, bArr);
        if (bArr2.length == 0) {
            boolValueOf = Boolean.FALSE;
        } else {
            boolValueOf = Boolean.valueOf(C13ML.LIZ(j, j2, bArr2, bArrUnBlindPsi));
        }
        c13mp.LJ = boolValueOf;
    }

    public static final void LJ(long j, long j2, C13MP c13mp, byte[] bArr, byte[] bArr2) {
        Boolean boolValueOf;
        if (Intrinsics.LJFF(c13mp.LJ, Boolean.TRUE)) {
            return;
        }
        PsiEncrypt.Companion companion = PsiEncrypt.LIZ;
        byte[] bArr3 = c13mp.LIZLLL;
        if (bArr3 == null) {
            bArr3 = null;
        }
        byte[] bArrUnBlindPsi = companion.unBlindPsi(bArr3, bArr);
        if (bArr2.length == 0) {
            boolValueOf = Boolean.FALSE;
        } else {
            boolValueOf = Boolean.valueOf(C13ML.LIZ(j, j2, bArr2, bArrUnBlindPsi));
        }
        c13mp.LJ = boolValueOf;
    }

    public static void LIZLLL(C20165313vH c20165313vH, List list, byte[] bArr, long j, long j2, byte[] bArr2) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new AwS2S0300200_30(j, j2, (C13MP) it2.next(), bArr2, bArr, 0));
        }
        C2232708ov.LIZ(arrayList);
    }

    public static void LJFF(C20165313vH c20165313vH, List list, byte[] bArr, long j, long j2, byte[] bArr2) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new AwS2S0300200_30(j, j2, (C13MP) it2.next(), bArr2, bArr, 1));
        }
        C2232708ov.LIZ(arrayList);
    }
}
