package X;

import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinMemberSubscriberCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Ock, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinMemberSubscriberCell$onItemViewCreated$2", f = "BulletinMemberSubscriberCell.kt", l = {}, m = "invokeSuspend")
public final class C623400Ock extends C09AX implements Function1<InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ BulletinMemberSubscriberCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C623400Ock(BulletinMemberSubscriberCell bulletinMemberSubscriberCell, InterfaceC1364105Vn<? super C623400Ock> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = bulletinMemberSubscriberCell;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C623400Ock(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (r1 != 5) goto L18;
     */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "BulletinMemberSubscriberCell@179d.onItemViewCreated$2"
            X.C1C7U.LIZ(r6)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r8)
            com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinMemberSubscriberCell r0 = r7.LL
            X.0zJl r0 = r0.getItem()
            X.00s7 r0 = (X.C214100s7) r0
            r5 = 0
            if (r0 == 0) goto L3b
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.LL
            if (r0 == 0) goto L3b
            int r0 = r0.getFollowStatus()
            X.0SY7 r0 = X.C0SY5.LIZ(r0)
            if (r0 == 0) goto L3b
            int[] r1 = X.C0SY8.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L4a
            r0 = 2
            if (r1 == r0) goto L47
            r0 = 3
            if (r1 == r0) goto L4d
            r0 = 4
            if (r1 == r0) goto L44
            r0 = 5
            if (r1 == r0) goto L4d
        L3b:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C1C7U.LIZIZ(r6)
            return r0
        L44:
            java.lang.String r4 = "message"
            goto L4f
        L47:
            java.lang.String r4 = "follow_back"
            goto L4f
        L4a:
            java.lang.String r4 = "follow"
            goto L4f
        L4d:
            java.lang.String r4 = "unfollow"
        L4f:
            com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinMemberSubscriberCell r3 = r7.LL
            X.0OPQ r2 = X.C0OPQ.LIZ
            com.bytedance.assem.arch.viewModel.AssemVMLazy r1 = r3.LL
            X.1Bqa<java.lang.Object>[] r0 = com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinMemberSubscriberCell.LLILZ
            com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r1.getValue()
            com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinMemberListViewModel r0 = (com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinMemberListViewModel) r0
            X.0qg8 r0 = r0.LLILLJJLI
            java.lang.Object r0 = r0.getValue()
            X.0OLV r0 = (X.C0OLV) r0
            if (r0 == 0) goto L6b
            java.lang.String r1 = r0.LL
            if (r1 != 0) goto L6d
        L6b:
            java.lang.String r1 = ""
        L6d:
            X.0zJl r0 = r3.getItem()
            X.00s7 r0 = (X.C214100s7) r0
            if (r0 == 0) goto L7d
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.LL
            if (r0 == 0) goto L7d
            java.lang.String r5 = r0.getUid()
        L7d:
            java.lang.String r0 = java.lang.String.valueOf(r5)
            r2.getClass()
            X.C0OPQ.LJI(r1, r0, r4)
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C623400Ock.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
