package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.viewmodel.CommonChatNoticeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06bZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.viewmodel.CommonChatNoticeViewModel$onReturnDMPushOutAppSettings$1", f = "CommonChatNoticeViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1640306bZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CommonChatNoticeViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1640306bZ(CommonChatNoticeViewModel commonChatNoticeViewModel, InterfaceC1364105Vn<? super C1640306bZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = commonChatNoticeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1640306bZ(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            java.lang.String r6 = "CommonChatNoticeViewModel@3b85.onReturnDMPushOutAppSettings$1"
            X.C1C7U.LIZ(r6)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r20)
            X.10jZ r1 = X.C19328310jZ.LIZIZ
            boolean r0 = r1.LIZJ()
            r5 = 0
            r15 = 1
            if (r0 == 0) goto Lac
            com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings r0 = r1.LJ()
            r1 = 0
            if (r0 == 0) goto L49
            java.util.List<com.ss.android.ugc.aweme.setting.serverpush.model.PushSettingSwitchModel> r2 = r0.extraPushSettings
            if (r2 == 0) goto L49
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Laa
            java.util.Iterator r3 = r2.iterator()
        L2a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Laa
            java.lang.Object r2 = r3.next()
            com.ss.android.ugc.aweme.setting.serverpush.model.PushSettingSwitchModel r2 = (com.ss.android.ugc.aweme.setting.serverpush.model.PushSettingSwitchModel) r2
            java.lang.String r1 = r2.itemId
            java.lang.String r0 = "im_push_select"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L2a
            int r0 = r2.status
            if (r0 != r15) goto L2a
            r0 = 1
        L45:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L49:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto Lac
            java.lang.String r4 = "im_push,im_push_select"
        L55:
            X.10eQ r13 = X.C19296410eQ.LIZIZ
            X.06hB r0 = X.C1675106hB.LIZ
            r0.getClass()
            boolean r0 = X.C1675106hB.LIZIZ()
            java.lang.String r3 = "im_push_preview_v2"
            r2 = 2
            r1 = r19
            if (r0 == 0) goto L91
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.viewmodel.CommonChatNoticeViewModel r1 = r1.LL
            r0 = 3
            java.lang.String[] r7 = new java.lang.String[r0]
            r7[r5] = r4
            r7[r15] = r3
            java.lang.String r0 = "dm_streaks_push"
            r7[r2] = r0
            r1.getClass()
            java.lang.String r8 = ","
            r9 = 0
            r12 = 62
            r10 = r9
            r11 = r9
            java.lang.String r14 = X.C13LQ.LJJJ(r7, r8, r9, r10, r11, r12)
        L82:
            r16 = r15
            r17 = r9
            r18 = r9
            r13.batchSetPushSettingItems(r14, r15, r16, r17, r18)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L91:
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.viewmodel.CommonChatNoticeViewModel r1 = r1.LL
            java.lang.String[] r0 = new java.lang.String[r2]
            r0[r5] = r4
            r0[r15] = r3
            r1.getClass()
            java.lang.String r1 = ","
            r2 = 0
            r9 = 0
            r5 = 62
            r3 = r2
            r4 = r2
            r0 = r0
            java.lang.String r14 = X.C13LQ.LJJJ(r0, r1, r2, r3, r4, r5)
            goto L82
        Laa:
            r0 = 0
            goto L45
        Lac:
            java.lang.String r4 = "im_push"
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1640306bZ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
