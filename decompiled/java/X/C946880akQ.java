package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0akQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C946880akQ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C941180abE LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C946880akQ(C941180abE c941180abE) {
        super(0);
        this.LL = c941180abE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke() {
        /*
            r5 = this;
            java.lang.Class<com.tiktok.kmp.live.socialgamebusinessapi.service.ILiveDanceService> r0 = com.tiktok.kmp.live.socialgamebusinessapi.service.ILiveDanceService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.tiktok.kmp.live.socialgamebusinessapi.service.ILiveDanceService r0 = (com.tiktok.kmp.live.socialgamebusinessapi.service.ILiveDanceService) r0
            X.0anw r0 = r0.Yo1()
            if (r0 == 0) goto L18
            X.0alI r0 = r0.LJII()
            if (r0 == 0) goto L18
            X.0alK r4 = r0.LIZJ
            if (r4 != 0) goto L1a
        L18:
            X.0alK r4 = X.EnumC947440alK.NONE
        L1a:
            X.0alK r1 = X.EnumC947440alK.NONE
            java.lang.String r3 = "playbook"
            if (r4 != r1) goto L49
            X.01GW<X.0aoT> r0 = X.C949390aoT.LIZJ
            X.0aoT r0 = X.C923970a9T.LIZ()
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = r0.LIZLLL()
            if (r0 != 0) goto L49
            java.lang.String r2 = "single_view_resource_not_ready"
            r1 = 8
            java.lang.String r0 = "fail"
            X.C946950akX.LIZIZ(r3, r0, r2, r1)
            r0 = 2131852819(0x7f117e13, float:1.9339267E38)
            java.lang.String r0 = X.C497740JfY.LJIJI(r0)
            X.C766270U4b.LJIIJJI(r0)
            X.0aoT r0 = X.C923970a9T.LIZ()
            r0.LJFF()
        L46:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L49:
            if (r4 == r1) goto L6b
            X.0alK r0 = X.EnumC947440alK.PREPARING
            if (r4 == r0) goto L6b
            X.0alK r0 = X.EnumC947440alK.PLAYING
            if (r4 == r0) goto L57
            X.0alK r0 = X.EnumC947440alK.FINISH
            if (r4 != r0) goto L46
        L57:
            r2 = 0
            r1 = 12
            java.lang.String r0 = "success"
            X.C946950akX.LIZIZ(r3, r0, r2, r1)
            X.0abE r0 = r5.LL
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r0.LJI
            if (r1 == 0) goto L46
            java.lang.Class<com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceOpenRankPageEvent> r0 = com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceOpenRankPageEvent.class
            r1.FQ2(r0)
            goto L46
        L6b:
            X.0akR r2 = new X.0akR
            if (r4 != r1) goto L82
            java.lang.String r1 = "idle"
        L71:
            java.lang.String r0 = "dance_icon"
            r2.<init>(r1, r0, r3)
            X.0abE r0 = r5.LL
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r0.LJI
            if (r1 == 0) goto L46
            java.lang.Class<com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceOpenPickSongPageEvent> r0 = com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceOpenPickSongPageEvent.class
            r1.LC0(r0, r2)
            goto L46
        L82:
            java.lang.String r1 = "prepare"
            goto L71
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C946880akQ.invoke():java.lang.Object");
    }
}
