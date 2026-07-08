package X;

import kotlin.jvm.functions.Function0;
import webcast.api.game_station.GameDetailVideosResponse;

/* JADX INFO: renamed from: X.0z4i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1882020z4i extends C09AY implements Function0<C11NZ<C470590Icr<GameDetailVideosResponse.ResponseData>>> {
    public final /* synthetic */ InterfaceC1883030z6L LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1882020z4i(InterfaceC1883030z6L interfaceC1883030z6L) {
        super(0);
        this.LL = interfaceC1883030z6L;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b4  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C11NZ<X.C470590Icr<webcast.api.game_station.GameDetailVideosResponse.ResponseData>> invoke() {
        /*
            r4 = this;
            webcast.api.game_station.GameDetailVideosRequest r2 = new webcast.api.game_station.GameDetailVideosRequest
            r2.<init>()
            X.0z6L r0 = r4.LL
            X.0z3c r0 = r0.LIZJ()
            X.0z5M r1 = X.C1882380z5I.LIZJ(r0)
            java.lang.String r0 = "item_id"
            java.lang.String r0 = X.C1882380z5I.LJFF(r1, r0)
            r2.itemId = r0
            X.0z6L r0 = r4.LL
            X.0z3c r0 = r0.LIZJ()
            X.0z5M r1 = X.C1882380z5I.LIZJ(r0)
            java.lang.String r0 = "author_id"
            java.lang.String r0 = X.C1882380z5I.LJFF(r1, r0)
            r2.authorId = r0
            X.0z6L r0 = r4.LL
            X.0z3c r0 = r0.LIZJ()
            X.0z5M r1 = X.C1882380z5I.LIZJ(r0)
            java.lang.String r0 = "game_tag_id"
            java.lang.String r0 = X.C1882380z5I.LJFF(r1, r0)
            r2.gameTagId = r0
            X.0z6L r0 = r4.LL
            X.0z3c r0 = r0.LIZJ()
            X.0z5M r1 = X.C1882380z5I.LIZJ(r0)
            r3 = 0
            if (r1 == 0) goto Lb4
            X.0z3c r0 = r1.LIZ
            java.lang.String r1 = r1.LIZIZ
            if (r0 == 0) goto Lb2
            X.0z5U r0 = r0.LJJIIZI()
            java.lang.Object r1 = r0.LIZ(r1)
            boolean r0 = r1 instanceof java.util.concurrent.ConcurrentHashMap
            if (r0 != 0) goto L5b
            r1 = r3
        L5b:
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            if (r1 == 0) goto Lb2
            java.lang.String r0 = "scene"
            java.lang.Object r1 = r1.get(r0)
        L65:
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L6a
            r3 = r1
        L6a:
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto Lb4
            int r0 = r3.intValue()
        L72:
            r2.scene = r0
            r3 = 0
            r2.pullType = r3
            r0 = 0
            r2.pullScore = r0
            r2.videoTabType = r3
            java.lang.String r0 = ""
            r2.videoTabId = r0
            r2.recallRuleId = r0
            r2.recallHashtagId = r0
            X.0z6L r0 = r4.LL
            X.0z3c r0 = r0.LIZJ()
            X.0z5M r1 = X.C1882380z5I.LIZJ(r0)
            java.lang.String r0 = "game_id"
            java.lang.String r0 = X.C1882380z5I.LJFF(r1, r0)
            r2.gameId = r0
            X.0z6L r1 = r4.LL
            java.lang.Class<com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.api.GameDetailPageApi> r0 = com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.api.GameDetailPageApi.class
            java.lang.Object r1 = X.C1881810z4N.LIZ(r1, r0)
            com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.api.GameDetailPageApi r1 = (com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.api.GameDetailPageApi) r1
            java.lang.String r0 = X.C1516000pYM.LIZJ(r2)
            java.util.Map r0 = X.C500260Jjc.LL(r0)
            X.11Kz r0 = r1.requestAnchorGameDetailVideos(r0)
            X.11NZ r0 = r0.LJJIJLIJ()
            return r0
        Lb2:
            r1 = r3
            goto L65
        Lb4:
            r0 = 99
            goto L72
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1882020z4i.invoke():java.lang.Object");
    }
}
