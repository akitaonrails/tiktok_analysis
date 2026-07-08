package X;

import com.bytedance.android.live.liveinteract.matchv2.connection.teammatch.coordinator.invitee.view.TeamMatchInviteeFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0baF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.matchv2.connection.teammatch.coordinator.invitee.view.TeamMatchInviteeFragment$renderInvitePanelText$1", f = "TeamMatchInviteeFragment.kt", l = {253, 254}, m = "invokeSuspend")
public final class C979010baF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C978980baC LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public C978980baC LLILZ;
    public C978980baC LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ TeamMatchInviteeFragment LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C979010baF(TeamMatchInviteeFragment teamMatchInviteeFragment, String str, String str2, InterfaceC1364105Vn<? super C979010baF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = teamMatchInviteeFragment;
        this.LLIZLLLIL = str;
        this.LLJ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C979010baF(this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "TeamMatchInviteeFragment@fa9f.renderInvitePanelText$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r9.LLILZLL
            r6 = 2
            r2 = 1
            if (r0 == 0) goto L31
            if (r0 == r2) goto L5b
            if (r0 != r6) goto L89
            java.lang.Object r5 = r9.LLILLJJLI
            X.0baC r5 = (X.C978980baC) r5
            X.0baC r2 = r9.LL
            X.C155000ia.LIZIZ(r10)
        L1c:
            android.text.Spannable r10 = (android.text.Spannable) r10
            r5.LJJI = r10
            com.bytedance.android.live.liveinteract.matchv2.connection.teammatch.coordinator.invitee.view.TeamMatchInviteeFragment r0 = r9.LLIZ
            r0.LLILZLL = r2
            X.0bB9 r0 = r0.LL
            if (r0 == 0) goto L2b
            r0.Vh(r2)
        L2b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L31:
            X.C155000ia.LIZIZ(r10)
            com.bytedance.android.live.liveinteract.matchv2.connection.teammatch.coordinator.invitee.view.TeamMatchInviteeFragment r0 = r9.LLIZ
            X.0baC r5 = r0.OR()
            com.bytedance.android.live.liveinteract.matchv2.connection.teammatch.coordinator.invitee.view.TeamMatchInviteeFragment r3 = r9.LLIZ
            java.lang.String r1 = r9.LLIZLLLIL
            java.lang.String r4 = r9.LLJ
            com.bytedance.android.livesdkapi.depend.model.live.match.MatchInvitePanelConfig r0 = r3.LLJIJIL
            r9.LL = r5
            r9.LLILLJJLI = r3
            r9.LLILLL = r4
            r9.LLILZ = r5
            r9.LLILZIL = r5
            r9.LLILZLL = r2
            java.lang.Object r10 = X.C978520bZS.LJIILLIIL(r0, r1, r9)
            if (r10 != r7) goto L58
            X.C1C7U.LIZIZ(r8)
            return r7
        L58:
            r0 = r5
            r2 = r5
            goto L6c
        L5b:
            X.0baC r0 = r9.LLILZIL
            X.0baC r5 = r9.LLILZ
            java.lang.Object r4 = r9.LLILLL
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r9.LLILLJJLI
            com.bytedance.android.live.liveinteract.matchv2.connection.teammatch.coordinator.invitee.view.TeamMatchInviteeFragment r3 = (com.bytedance.android.live.liveinteract.matchv2.connection.teammatch.coordinator.invitee.view.TeamMatchInviteeFragment) r3
            X.0baC r2 = r9.LL
            X.C155000ia.LIZIZ(r10)
        L6c:
            android.text.Spannable r10 = (android.text.Spannable) r10
            r0.LIZ = r10
            com.bytedance.android.livesdkapi.depend.model.live.match.MatchInvitePanelConfig r1 = r3.LLJIJIL
            r9.LL = r2
            r9.LLILLJJLI = r5
            r0 = 0
            r9.LLILLL = r0
            r9.LLILZ = r0
            r9.LLILZIL = r0
            r9.LLILZLL = r6
            java.lang.Object r10 = X.C978520bZS.LJIILL(r1, r4, r9)
            if (r10 != r7) goto L1c
            X.C1C7U.LIZIZ(r8)
            return r7
        L89:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C979010baF.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
