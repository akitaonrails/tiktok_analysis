package X;

import com.ss.android.ugc.aweme.aigc.asynctask.QuotaResult;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aigc.asynctask.TaskLogExtra;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.0LXK, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LXK {
    public static final C0LSZ LIZJ(C0LXL c0lxl) {
        TaskLogExtra taskLogExtra = (TaskLogExtra) C2292508yZ.LIZ(c0lxl.LJIL, TaskLogExtra.class);
        if (taskLogExtra == null) {
            taskLogExtra = new TaskLogExtra(0L, "", null, null, false, false, "", 0, "", "", "", "", 0, "", "", "", 0L, null, false, C2097608Jq.LJ());
        }
        String str = c0lxl.LIZ;
        String str2 = c0lxl.LIZIZ;
        String str3 = c0lxl.LIZJ;
        String str4 = c0lxl.LIZLLL;
        String str5 = c0lxl.LJ;
        String str6 = c0lxl.LJFF;
        String str7 = c0lxl.LJI;
        int i = c0lxl.LJII;
        String str8 = c0lxl.LJIIIIZZ;
        String str9 = c0lxl.LJIIIZ;
        String str10 = c0lxl.LJIIJ;
        int i2 = c0lxl.LJIIJJI;
        Source sourceLIZ = C542730LQh.LIZ(c0lxl.LJIIL.toUpperCase(Locale.ROOT));
        String str11 = c0lxl.LJIILIIL;
        String str12 = c0lxl.LJIILJJIL;
        int i3 = c0lxl.LJIILL;
        String str13 = c0lxl.LJIILLIIL;
        String str14 = taskLogExtra.errorSource;
        String str15 = c0lxl.LJIIZILJ;
        String str16 = c0lxl.LJIJ;
        long j = c0lxl.LJIJI;
        String str17 = c0lxl.LJIJJ;
        long j2 = c0lxl.LJIJJLI;
        int i4 = c0lxl.LJJI;
        String str18 = c0lxl.LJJIFFI;
        QuotaResult quotaResult = (QuotaResult) C2292508yZ.LIZ(c0lxl.LJJII, QuotaResult.class);
        if (quotaResult == null) {
            quotaResult = new QuotaResult(null, null, null, "", null);
        }
        return new C0LSZ(str, str2, str3, str4, str5, str6, str7, i, str8, str9, str10, i2, sourceLIZ, str11, str12, i3, str13, str14, str15, str16, j, str17, j2, taskLogExtra, quotaResult, i4, str18, 16777216);
    }

    public static final List<C0LSZ> LIZLLL(List<C0LXL> list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C0LXL> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(LIZJ(it2.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(X.C0LXL r7, X.InterfaceC1364105Vn<? super X.InterfaceC542770LQl<? super X.C09JG, ? extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput>> r8) {
        /*
            boolean r0 = r8 instanceof X.C0LXJ
            if (r0 == 0) goto L51
            r6 = r8
            X.0LXJ r6 = (X.C0LXJ) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r5 = r6.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L57
            X.0LTN r1 = r6.LL
            X.C155000ia.LIZIZ(r5)
        L25:
            boolean r0 = r1 instanceof X.AbstractC543030LRl
            if (r0 == 0) goto L31
            r0 = r1
            X.0LRl r0 = (X.AbstractC543030LRl) r0
            if (r0 == 0) goto L31
            r0.LJJLI()
        L31:
            return r1
        L32:
            X.C155000ia.LIZIZ(r5)
            X.0LQK r1 = X.C0LQK.LIZ
            java.lang.String r0 = r7.LIZLLL
            r1.getClass()
            X.0LTN r1 = X.C0LQK.LIZ(r0)
            if (r1 == 0) goto L4f
            java.lang.String r0 = r7.LIZ
            r6.LL = r1
            r6.LLILLL = r2
            java.lang.Object r0 = X.C0LTN.LJJIJLIJ(r1, r0, r6)
            if (r0 != r4) goto L25
            return r4
        L4f:
            r1 = r3
            goto L25
        L51:
            X.0LXJ r6 = new X.0LXJ
            r6.<init>(r8)
            goto L12
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LXK.LIZ(X.0LXL, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0045 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZIZ(java.util.List<X.C0LXL> r7, X.InterfaceC1364105Vn<? super java.util.List<? extends X.InterfaceC542770LQl<? super X.C09JG, ? extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput>>> r8) {
        /*
            boolean r0 = r8 instanceof X.C0LXM
            if (r0 == 0) goto L55
            r6 = r8
            X.0LXM r6 = (X.C0LXM) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L55
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r5 = r6.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r3 = 1
            if (r0 == 0) goto L48
            if (r0 != r3) goto L5c
            java.lang.Object r2 = r6.LLILLJJLI
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r1 = r6.LL
            java.util.Collection r1 = (java.util.Collection) r1
            X.C155000ia.LIZIZ(r5)
        L2a:
            if (r5 == 0) goto L2f
            r1.add(r5)
        L2f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5b
            java.lang.Object r0 = r2.next()
            X.0LXL r0 = (X.C0LXL) r0
            r6.LL = r1
            r6.LLILLJJLI = r2
            r6.LLILZ = r3
            java.lang.Object r5 = LIZ(r0, r6)
            if (r5 != r4) goto L2a
            return r4
        L48:
            X.C155000ia.LIZIZ(r5)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r7.iterator()
            goto L2f
        L55:
            X.0LXM r6 = new X.0LXM
            r6.<init>(r8)
            goto L12
        L5b:
            return r1
        L5c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LXK.LIZIZ(java.util.List, X.05Vn):java.lang.Object");
    }
}
