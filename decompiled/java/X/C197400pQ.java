package X;

import com.bytedance.android.live.slot.IBcToggleService;
import com.bytedance.android.livesdk.game.api.GameLivePartnershipRetrofitApi;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00pQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C197400pQ implements C01SD {
    public final HashMap<String, Map<String, C2284371EbD>> LIZ = new HashMap<>();
    public String LIZIZ = CardStruct.IStatusCode.DEFAULT;
    public final Map<String, Object> LIZJ = new LinkedHashMap();
    public boolean LIZLLL;
    public boolean LJ;
    public C11JF LJFF;
    public GameLivePartnershipRetrofitApi LJI;

    public final void LIZJ() {
        this.LIZ.clear();
        ((LinkedHashMap) this.LIZJ).clear();
        this.LIZLLL = false;
        this.LJFF = null;
        this.LIZIZ = CardStruct.IStatusCode.DEFAULT;
    }

    @Override // X.C01SD
    public final void LIZ(LiveMode... liveModeArr) {
        this.LIZLLL = true;
        if (C13LQ.LJJIJIIJI(LiveMode.VIDEO, liveModeArr) >= 0) {
            this.LJ = true;
        }
    }

    public final void LJFF(LiveMode liveMode) {
        LIZIZ(liveMode, "live_mode_change");
    }

    public static void LJ(LiveMode liveMode, boolean z) {
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("not video live ,setGameBcToggleState ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("GameBcToggleHandler", C2188811AlT.LIZIZ(sbLIZ));
        IBcToggleService iBcToggleServiceLIZ = C197600pS.LIZ();
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        iBcToggleServiceLIZ.LJFF(i, 2, liveMode);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    @Override // X.C01SD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(final com.bytedance.android.livesdkapi.depend.model.live.LiveMode r7, java.lang.String r8) {
        /*
            r6 = this;
            boolean r0 = r6.LIZLLL
            if (r0 != 0) goto L5
            return
        L5:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r4 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.VIDEO
            r5 = 2
            if (r4 != r7) goto L17
            boolean r0 = r6.LJ
            if (r0 != 0) goto L17
            com.bytedance.android.live.slot.IBcToggleService r1 = X.C197600pS.LIZ()
            r0 = 3
            r1.LJFF(r0, r5, r4)
            return
        L17:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "refresh toggle status form server... source = "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "GameBcToggleHandler"
            X.C20441214yg.LIZIZ(r0, r1)
            X.11JF r0 = r6.LJFF
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L41
            boolean r0 = r0.isDisposed()
            r0 = r0 ^ 1
            if (r0 != r2) goto L41
            X.11JF r0 = r6.LJFF
            if (r0 == 0) goto L41
            r0.dispose()
        L41:
            if (r7 == 0) goto L93
            int[] r1 = X.C197500pR.LIZ
            int r0 = r7.ordinal()
            r0 = r1[r0]
            if (r0 == r2) goto L50
            if (r0 != r5) goto L93
            r3 = 4
        L50:
            com.bytedance.android.livesdk.game.api.GameLivePartnershipRetrofitApi r2 = r6.LJI
            if (r2 != 0) goto L65
            X.0Ism r1 = X.C480460Ism.LIZ()
            java.lang.Class<com.bytedance.android.livesdk.game.api.GameLivePartnershipRetrofitApi> r0 = com.bytedance.android.livesdk.game.api.GameLivePartnershipRetrofitApi.class
            r1.getClass()
            java.lang.Object r2 = X.C480460Ism.LIZLLL(r0)
            com.bytedance.android.livesdk.game.api.GameLivePartnershipRetrofitApi r2 = (com.bytedance.android.livesdk.game.api.GameLivePartnershipRetrofitApi) r2
            r6.LJI = r2
        L65:
            if (r7 == r4) goto L90
            java.lang.String r0 = r6.LIZIZ
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r0)
            if (r0 == 0) goto L90
            long r0 = r0.longValue()
        L73:
            X.11NZ r1 = r2.requestAnchorToggleInfo(r0, r3)
            X.0UO0 r0 = new X.0UO0
            r0.<init>()
            X.11NZ r2 = r1.LJIILIIL(r0)
            X.00p8 r1 = new X.00p8
            r1.<init>()
            X.00p7<T> r0 = new X.C09JN() { // from class: X.00p7
                static {
                    /*
                        X.00p7 r0 = new X.00p7
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.00p7<T>) X.00p7.LL X.00p7
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C195500p7.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C195500p7.<init>():void");
                }

                @Override // X.C09JN
                public final void accept(java.lang.Object r4) {
                    /*
                        r3 = this;
                        java.lang.String r2 = "GameBcToggleHandler@843d.refreshToggleStatusFromServer$2"
                        X.C1C7U.LIZ(r2)
                        java.lang.Throwable r4 = (java.lang.Throwable) r4
                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                        java.lang.String r0 = " anchor_toggle_info "
                        r1.append(r0)
                        java.lang.String r0 = r4.getMessage()
                        r1.append(r0)
                        java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
                        java.lang.String r0 = "GameBcToggleHandler"
                        X.C20441214yg.LJ(r0, r1)
                        X.C1C7U.LIZIZ(r2)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C195500p7.accept(java.lang.Object):void");
                }
            }
            X.01kM r0 = r2.LJJLL(r1, r0)
            X.11JF r0 = (X.C11JF) r0
            r6.LJFF = r0
            return
        L90:
            r0 = 0
            goto L73
        L93:
            r3 = 1
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C197400pQ.LIZIZ(com.bytedance.android.livesdkapi.depend.model.live.LiveMode, java.lang.String):void");
    }

    public final void LIZLLL(LiveMode liveMode, boolean z) {
        Collection<C2284371EbD> collectionValues;
        Boolean boolValueOf = Boolean.valueOf(z);
        if (boolValueOf != null) {
            LJ(liveMode, boolValueOf.booleanValue());
            return;
        }
        Collection<Map<String, C2284371EbD>> collectionValues2 = this.LIZ.values();
        if (!collectionValues2.isEmpty()) {
            Iterator<T> it2 = collectionValues2.iterator();
            while (it2.hasNext()) {
                Collection collectionValues3 = ((Map) it2.next()).values();
                if (!(collectionValues3 instanceof Collection) || !collectionValues3.isEmpty()) {
                    Iterator it3 = collectionValues3.iterator();
                    while (it3.hasNext()) {
                        it3.next().getClass();
                    }
                }
            }
        }
        if (this.LIZIZ.length() != 0 && !Intrinsics.LJFF(this.LIZIZ, CardStruct.IStatusCode.DEFAULT)) {
            Map<String, C2284371EbD> map = this.LIZ.get(this.LIZIZ);
            if (map != null && (collectionValues = map.values()) != null && !collectionValues.isEmpty()) {
                Iterator<T> it4 = collectionValues.iterator();
                while (it4.hasNext()) {
                    it4.next().getClass();
                }
            }
            LJ(liveMode, false);
            return;
        }
        LJ(liveMode, false);
    }

    public final void LJI(LiveMode liveMode, String str) {
        if (Intrinsics.LJFF(this.LIZIZ, str)) {
            return;
        }
        this.LIZIZ = str;
        LIZIZ(liveMode, "game_tag");
    }
}
