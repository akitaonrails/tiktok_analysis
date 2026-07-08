package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.relation.ffp.ui.AnimationAuthFragment;
import com.ss.android.ugc.aweme.relation.ffp.ui.NeedAuthFragment;
import com.ss.android.ugc.aweme.relation.ffp.ui.RecEmptyFragment;
import com.ss.android.ugc.aweme.relation.ffp.ui.RecFriendsFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dal, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1056210dal {
    public final C1056250dap LIZ;
    public final C1056250dap LIZIZ;
    public C1056250dap LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public Boolean LJFF;
    public Boolean LJI;
    public String LJII;
    public String LJIIIIZZ;

    public static String LIZJ(boolean z) {
        return z ? "1" : CardStruct.IStatusCode.DEFAULT;
    }

    public final C1056290dat LIZ() {
        if (Intrinsics.LJFF(this.LIZJ, this.LIZ)) {
            return this.LIZ.LIZIZ;
        }
        C1056290dat c1056290dat = this.LIZ.LIZIZ;
        return c1056290dat.LIZJ == EnumC1056240dao.NONE ? this.LIZIZ.LIZIZ : c1056290dat;
    }

    public final C1056290dat LIZIZ() {
        if (Intrinsics.LJFF(this.LIZJ, this.LIZ)) {
            return this.LIZ.LIZJ;
        }
        C1056290dat c1056290dat = this.LIZ.LIZJ;
        return c1056290dat.LIZJ == EnumC1056240dao.NONE ? this.LIZIZ.LIZJ : c1056290dat;
    }

    public C1056210dal() {
        C1056250dap c1056250dap = new C1056250dap("[ffp]_Monitor_first_enter");
        this.LIZ = c1056250dap;
        this.LIZIZ = new C1056250dap("[ffp]_Monitor_byAuth");
        this.LIZJ = c1056250dap;
        this.LIZLLL = EnumC1070410dxf.CONTACT.isGrant();
        this.LJ = EnumC1070410dxf.FACEBOOK.isGrant();
        this.LJII = "";
        this.LJIIIIZZ = "";
    }

    public final void LJFF(C13IQ<? extends Fragment> c13iq) {
        String str;
        this.LJII = this.LJIIIIZZ;
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(AnimationAuthFragment.class))) {
            str = "animation";
        } else if (Intrinsics.LJFF(c13iq, C13LE.LIZ(NeedAuthFragment.class))) {
            str = "noPermission";
        } else if (Intrinsics.LJFF(c13iq, C13LE.LIZ(RecEmptyFragment.class))) {
            str = "empty";
        } else if (Intrinsics.LJFF(c13iq, C13LE.LIZ(RecFriendsFragment.class))) {
            str = "loading";
        } else {
            str = "";
        }
        this.LJIIIIZZ = str;
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(NeedAuthFragment.class))) {
            if (Intrinsics.LJFF(this.LIZJ, this.LIZ)) {
                C1056250dap c1056250dap = this.LIZJ;
                if (c1056250dap != null) {
                    c1056250dap.LIZ();
                }
                this.LIZJ = this.LIZIZ;
                return;
            }
            if (!Intrinsics.LJFF(this.LIZJ, this.LIZIZ)) {
                return;
            }
            C1056250dap c1056250dap2 = this.LIZJ;
            if (c1056250dap2 != null) {
                c1056250dap2.LIZ();
            }
            this.LIZJ = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0025 A[PHI: r4
      0x0025: PHI (r4v4 java.lang.Object) = (r4v2 java.lang.Object), (r4v0 java.lang.Object) binds: [B:22:0x0049, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0dab, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r8v1, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn r7, X.C1056110dab r8) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C1056220dam
            if (r0 == 0) goto L4c
            r5 = r7
            X.0dam r5 = (X.C1056220dam) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4c
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L26
            if (r0 == r1) goto L38
            if (r0 != r2) goto L52
            X.C155000ia.LIZIZ(r4)
        L25:
            return r4
        L26:
            X.C155000ia.LIZIZ(r4)
            X.0dap r0 = r6.LIZJ
            if (r0 == 0) goto L40
            r5.LL = r8
            r5.LLILZ = r1
            java.lang.Object r4 = r0.LIZIZ(r5, r8)
            if (r4 != r3) goto L3d
            return r3
        L38:
            kotlin.jvm.functions.Function1 r8 = r5.LL
            X.C155000ia.LIZIZ(r4)
        L3d:
            if (r4 == 0) goto L40
            return r4
        L40:
            r0 = 0
            r5.LL = r0
            r5.LLILZ = r2
            java.lang.Object r4 = r8.invoke(r5)
            if (r4 != r3) goto L25
            return r3
        L4c:
            X.0dam r5 = new X.0dam
            r5.<init>(r6, r7)
            goto L12
        L52:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1056210dal.LIZLLL(X.05Vn, X.0dab):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0025 A[PHI: r4
      0x0025: PHI (r4v4 java.lang.Object) = (r4v2 java.lang.Object), (r4v0 java.lang.Object) binds: [B:22:0x0049, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0cBs, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r8v1, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC1364105Vn r7, X.C1002340cBs r8) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C1056230dan
            if (r0 == 0) goto L4c
            r5 = r7
            X.0dan r5 = (X.C1056230dan) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4c
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L26
            if (r0 == r1) goto L38
            if (r0 != r2) goto L52
            X.C155000ia.LIZIZ(r4)
        L25:
            return r4
        L26:
            X.C155000ia.LIZIZ(r4)
            X.0dap r0 = r6.LIZJ
            if (r0 == 0) goto L40
            r5.LL = r8
            r5.LLILZ = r1
            java.lang.Object r4 = r0.LIZJ(r5, r8)
            if (r4 != r3) goto L3d
            return r3
        L38:
            kotlin.jvm.functions.Function1 r8 = r5.LL
            X.C155000ia.LIZIZ(r4)
        L3d:
            if (r4 == 0) goto L40
            return r4
        L40:
            r0 = 0
            r5.LL = r0
            r5.LLILZ = r2
            java.lang.Object r4 = r8.invoke(r5)
            if (r4 != r3) goto L25
            return r3
        L4c:
            X.0dan r5 = new X.0dan
            r5.<init>(r6, r7)
            goto L12
        L52:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1056210dal.LJ(X.05Vn, X.0cBs):java.lang.Object");
    }
}
