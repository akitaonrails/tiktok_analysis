package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0lST, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.upvote.detail.panel.PanelCellBtnManager$showRelationBtn$1$2", f = "PanelCellBtnManager.kt", l = {}, m = "invokeSuspend")
public final class C1358590lST extends C09AX implements Function1<InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ C1358600lSU LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1358590lST(C1358600lSU c1358600lSU, InterfaceC1364105Vn<? super C1358590lST> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = c1358600lSU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1358590lST(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r6 = "PanelCellBtnManager@6d4e.showRelationBtn$1$2"
            X.C1C7U.LIZ(r6)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r14)
            X.0lSU r0 = r13.LL
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r0.LJI
            if (r11 != 0) goto L1a
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C1C7U.LIZIZ(r6)
            return r0
        L1a:
            java.lang.String r7 = r0.LIZIZ()
            X.0lSU r0 = r13.LL
            java.lang.String r8 = r0.LJIILIIL
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.LIZ()
            r12 = 0
            if (r0 == 0) goto L97
            int r0 = r0.getFollowStatus()
            java.lang.Integer r5 = X.C2286608xc.LJ(r0)
        L31:
            X.0lSU r0 = r13.LL
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.LIZ()
            if (r0 == 0) goto L95
            int r0 = r0.getFollowerStatus()
            java.lang.Integer r4 = X.C2286608xc.LJ(r0)
        L41:
            X.0lSU r0 = r13.LL
            com.ss.android.ugc.aweme.profile.model.User r1 = r0.LIZ()
            r3 = 1
            if (r1 == 0) goto L93
            X.0lSl r0 = X.C1358770lSl.LIZ
            r0.getClass()
            boolean r0 = X.C1358770lSl.LIZLLL(r1)
            if (r0 != r3) goto L93
            r0 = 1
        L56:
            java.lang.String r2 = ""
            if (r0 == 0) goto L7a
            java.lang.String r10 = "plane"
        L5c:
            X.0lSP r1 = X.C1358550lSP.LIZ
            if (r8 != 0) goto L61
            r8 = r2
        L61:
            java.lang.String r9 = "click"
            X.0lSU r0 = r13.LL
            X.0lRj r0 = r0.LJFF
            if (r0 == 0) goto L6b
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct r12 = r0.LL
        L6b:
            r1.getClass()
            X.C1358550lSP.LJIILLIIL(r7, r8, r9, r10, r11, r12)
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C1C7U.LIZIZ(r6)
            return r0
        L7a:
            if (r5 == 0) goto L86
            int r1 = r5.intValue()
            r0 = 4
            if (r1 != r0) goto L86
            java.lang.String r10 = "follow_requested"
            goto L5c
        L86:
            if (r4 == 0) goto L91
            int r0 = r4.intValue()
            if (r0 != r3) goto L91
            java.lang.String r10 = "follow_back"
            goto L5c
        L91:
            r10 = r2
            goto L5c
        L93:
            r0 = 0
            goto L56
        L95:
            r4 = r12
            goto L41
        L97:
            r5 = r12
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1358590lST.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
