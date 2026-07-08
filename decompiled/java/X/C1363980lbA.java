package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0lbA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.ui.viewholder.SharePanelHeadViewHolder$iconStateFlow$1", f = "SharePanelHeadViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C1363980lbA extends C09AX implements InterfaceC1685420txc<IMContact, Boolean, Boolean, Boolean, InterfaceC1364105Vn<? super EnumC1364010lbD>, Object> {
    public /* synthetic */ IMContact LL;
    public /* synthetic */ boolean LLILLJJLI;
    public /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C1363950lb7 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1363980lbA(C1363950lb7 c1363950lb7, InterfaceC1364105Vn<? super C1363980lbA> interfaceC1364105Vn) {
        super(5, interfaceC1364105Vn);
        this.LLILZ = c1363950lb7;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "SharePanelHeadViewHolder@4d07.iconStateFlow$1"
            X.C1C7U.LIZ(r4)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r6)
            com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r3 = r5.LL
            boolean r1 = r5.LLILLJJLI
            boolean r2 = r5.LLILLL
            X.0lb7 r0 = r5.LLILZ
            com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel r0 = r0.LL
            X.01GW r0 = r0.LLJJIJIL
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L29
            X.0lbD r0 = X.EnumC1364010lbD.AFTER_SEND
        L25:
            X.C1C7U.LIZIZ(r4)
            return r0
        L29:
            if (r1 == 0) goto L2e
            X.0lbD r0 = X.EnumC1364010lbD.SELECTED
            goto L25
        L2e:
            boolean r0 = r3 instanceof com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation
            if (r0 != 0) goto L36
            boolean r0 = r3 instanceof com.ss.android.ugc.aweme.im.contacts.api.model.IMUser
            if (r0 == 0) goto L6f
        L36:
            X.0lb7 r1 = r5.LLILZ
            boolean r0 = r1.LLILLL
            if (r0 == 0) goto L6f
            if (r2 == 0) goto L6f
            X.0lbf r0 = r1.LLJJJ
            if (r0 == 0) goto L53
            X.0lbg r0 = r0.LIZLLL()
            com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r0 = r0.LIZLLL
            if (r0 == 0) goto L53
            boolean r0 = r0.isShareSuccess()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 != r1) goto L6f
        L53:
            X.0ZIh r0 = X.InterfaceC897380ZIi.LIZIZ
            r0.getClass()
            X.0ZIi r0 = X.C897370ZIh.LIZ()
            X.0ZJT r0 = r0.LJ()
            boolean r0 = r0.LIZ()
            if (r0 != 0) goto L6c
            boolean r0 = X.C1689706jX.LIZ()
            if (r0 == 0) goto L6f
        L6c:
            X.0lbD r0 = X.EnumC1364010lbD.SHOW_ACTIVE
            goto L25
        L6f:
            X.0lbD r0 = X.EnumC1364010lbD.NONE
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1363980lbA.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC1685420txc
    public final Object invoke(IMContact iMContact, Boolean bool, Boolean bool2, Boolean bool3, InterfaceC1364105Vn<? super EnumC1364010lbD> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        bool3.booleanValue();
        C1363980lbA c1363980lbA = new C1363980lbA(this.LLILZ, interfaceC1364105Vn);
        c1363980lbA.LL = iMContact;
        c1363980lbA.LLILLJJLI = zBooleanValue;
        c1363980lbA.LLILLL = zBooleanValue2;
        return c1363980lbA.invokeSuspend(Unit.LIZ);
    }
}
