package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.activity.assem.SubSpaceActivityContentAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import webcast.api.sub.SpaceActivityListResponse;

/* JADX INFO: renamed from: X.0Jvw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C507900Jvw extends C09AY implements Function2<UIAssem, C291001Au<? extends SpaceActivityListResponse.ResponseData>, Unit> {
    public final /* synthetic */ SubSpaceActivityContentAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C507900Jvw(SubSpaceActivityContentAssem subSpaceActivityContentAssem) {
        super(2);
        this.LL = subSpaceActivityContentAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0094  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(com.bytedance.assem.arch.core.UIAssem r10, X.C291001Au<? extends webcast.api.sub.SpaceActivityListResponse.ResponseData> r11) {
        /*
            r9 = this;
            X.01Au r11 = (X.C291001Au) r11
            if (r11 == 0) goto Laa
            T r3 = r11.LIZ
            webcast.api.sub.SpaceActivityListResponse$ResponseData r3 = (webcast.api.sub.SpaceActivityListResponse.ResponseData) r3
            if (r3 == 0) goto Laa
            com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.activity.assem.SubSpaceActivityContentAssem r7 = r9.LL
            X.16FZ r0 = r7.LLJJIJI
            if (r0 == 0) goto L13
            X.C500260Jjc.LJIILIIL(r0)
        L13:
            java.util.List<com.bytedance.android.livesdk.chatroom.api.SpaceActivityInfo> r0 = r3.activityList
            if (r0 == 0) goto L94
            boolean r0 = r0.isEmpty()
            r8 = 1
            r2 = 0
            if (r0 == r8) goto L94
            boolean r0 = r7.LLJJJ
            r6 = 0
            if (r0 != 0) goto L49
            java.lang.Class<com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService> r0 = com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService.class
            X.006A r1 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService r1 = (com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService) r1
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r0 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = X.C500260Jjc.LJJLI()
            if (r0 == 0) goto L92
            com.bytedance.android.live.base.model.user.User r0 = r0.getOwner()
            if (r0 == 0) goto L92
            com.bytedance.android.live.base.model.user.SubscribeInfo r0 = r0.getSubscribeInfo()
            if (r0 == 0) goto L92
            webcast.data.SubSplitStatus r0 = r0.subSplitStatus
        L42:
            boolean r0 = r1.pY1(r0)
            if (r0 != 0) goto L49
            r8 = 0
        L49:
            java.util.List<com.bytedance.android.livesdk.chatroom.api.SpaceActivityInfo> r0 = r3.activityList
            if (r0 == 0) goto L51
            int r2 = r0.size()
        L51:
            r7.LLJJIJIL = r2
            java.util.List<com.bytedance.android.livesdk.chatroom.api.SpaceActivityInfo> r1 = r3.activityList
            if (r1 == 0) goto Laa
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r5.<init>(r0)
            java.util.Iterator r4 = r1.iterator()
        L66:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L98
            java.lang.Object r3 = r4.next()
            com.bytedance.android.livesdk.chatroom.api.SpaceActivityInfo r3 = (com.bytedance.android.livesdk.chatroom.api.SpaceActivityInfo) r3
            X.0Jvv r2 = new X.0Jvv
            r2.<init>(r3)
            X.0Jvy r0 = new X.0Jvy
            r0.<init>(r7)
            r2.LLILLJJLI = r0
            if (r8 == 0) goto L8e
            java.lang.String r0 = r3.schema
            java.lang.String r1 = X.C505720JsQ.LIZ(r0)
            boolean r0 = X.C504670Jqj.LIZIZ(r1)
            if (r0 != 0) goto L8e
            r3.schema = r1
        L8e:
            r5.add(r2)
            goto L66
        L92:
            r0 = r6
            goto L42
        L94:
            r7.lp()
            goto Laa
        L98:
            java.lang.String r0 = "show"
            r7.kp(r0)
            X.15jv r0 = r7.LLJJIJIIJIL
            if (r0 == 0) goto Laa
            X.15jK r0 = r0.getState()
            if (r0 == 0) goto Laa
            r0.LIZLLL(r5, r6)
        Laa:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C507900Jvw.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
