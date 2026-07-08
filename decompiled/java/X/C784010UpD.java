package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorLaunchRequestSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0UpD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C784010UpD {
    public static long LIZ;

    public static final void LIZ() {
        if (LiveAnchorLaunchRequestSetting.INSTANCE.enable()) {
            try {
                AbstractC19484711Kz.LJJIJL(5L, TimeUnit.SECONDS).LJJIJIIJI(C11S5.LIZ()).LJJIIZ(new C09JN() { // from class: X.0UpE
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("LiveJourneyUtilKt@391a.notifyServerAppBoot$1");
                        long currentUserId = UserService.getInstance().user().getCurrentUserId();
                        C784010UpD.LIZ = currentUserId;
                        if (currentUserId > 0) {
                            C784010UpD.LIZIZ();
                        }
                        C11NN<C784060UpI> c11nnLJII = UserService.getInstance().user().LJII();
                        c11nnLJII.getClass();
                        new C11OY(new C19491311Nn(c11nnLJII), new InterfaceC19483011Ki() { // from class: X.0TGz
                            @Override // X.InterfaceC19483011Ki
                            public final boolean test(Object obj2) {
                                if (((C784060UpI) obj2).LIZ != EnumC1098720ehK.Logout) {
                                    return true;
                                }
                                return false;
                            }
                        }).LJIIL(new C09JN() { // from class: X.0UpF
                            @Override // X.C09JN
                            public final void accept(Object obj2) {
                                C1C7U.LIZ("LiveJourneyUtilKt@391a.notifyServerAppBoot$1$2");
                                C784060UpI c784060UpI = (C784060UpI) obj2;
                                if (C784010UpD.LIZ != c784060UpI.LIZIZ.getId() && c784060UpI.LIZIZ.getId() != 0) {
                                    C784010UpD.LIZ = c784060UpI.LIZIZ.getId();
                                    C784010UpD.LIZIZ();
                                }
                                C1C7U.LIZIZ("LiveJourneyUtilKt@391a.notifyServerAppBoot$1$2");
                            }
                        });
                        C1C7U.LIZIZ("LiveJourneyUtilKt@391a.notifyServerAppBoot$1");
                    }
                }, new C09JN() { // from class: X.0UUe
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("LiveJourneyUtilKt@391a.notifyServerAppBoot$2");
                        C1C7U.LIZIZ("LiveJourneyUtilKt@391a.notifyServerAppBoot$2");
                    }
                });
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("anchor cold boot exception: ");
                sbLIZ.append(th.getMessage());
                C20441214yg.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009e A[PHI: r1 r2
      0x009e: PHI (r1v1 boolean) = (r1v0 boolean), (r1v5 boolean), (r1v5 boolean) binds: [B:42:0x009b, B:35:0x007d, B:37:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x009e: PHI (r2v2 boolean) = (r2v1 boolean), (r2v5 boolean), (r2v5 boolean) binds: [B:42:0x009b, B:35:0x007d, B:37:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ() {
        /*
            com.bytedance.android.livesdk.livesetting.broadcast.LiveJourneyColdBootOptSetting r0 = com.bytedance.android.livesdk.livesetting.broadcast.LiveJourneyColdBootOptSetting.INSTANCE
            boolean r0 = r0.getValue()
            if (r0 == 0) goto L67
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostAction> r0 = com.bytedance.android.livesdkapi.host.IHostAction.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdkapi.host.IHostAction r0 = (com.bytedance.android.livesdkapi.host.IHostAction) r0
            webcast.api.room.LivePodcastResponse$ResponseData r5 = r0.getPodcastCache()
        L14:
            com.bytedance.android.livesdk.livesetting.broadcast.LiveHostWsMigrationSwitch r0 = com.bytedance.android.livesdk.livesetting.broadcast.LiveHostWsMigrationSwitch.INSTANCE
            boolean r0 = r0.enableColdBoot()
            r4 = 1
            if (r0 == 0) goto L69
            java.lang.String r1 = "LiveHostWsManager"
            java.lang.String r0 = "send ws cold boot"
            X.C20441214yg.LIZIZ(r1, r0)
            tikcast.api.anchor.AnchorColdBootReqMessage r1 = new tikcast.api.anchor.AnchorColdBootReqMessage
            r1.<init>()
            if (r5 == 0) goto L65
            r0 = 1
        L2c:
            r1.useLivePodcastResponse = r0
            if (r5 == 0) goto L63
            boolean r0 = r5.canBeLivePodcast
            if (r0 != r4) goto L63
            r0 = 1
        L35:
            r1.canBeLivePodcast = r0
            if (r5 == 0) goto L61
            webcast.api.room.LiveScenario r0 = r5.liveScenario
            if (r0 == 0) goto L61
            boolean r0 = r0.enableLiveVideo
            if (r0 != r4) goto L61
        L41:
            r1.enableLiveVideo = r4
            byte[] r2 = X.C1516000pYM.LJ(r1)
            if (r2 == 0) goto L60
            X.0psC r1 = new X.0psC
            r0 = 5
            r1.<init>(r2, r0)
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostNetwork> r0 = com.bytedance.android.livesdkapi.host.IHostNetwork.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdkapi.host.IHostNetwork r0 = (com.bytedance.android.livesdkapi.host.IHostNetwork) r0
            X.0UC2 r0 = r0.getLiveHostWsManager()
            X.0ps9 r0 = (X.C1528270ps9) r0
            r0.LIZLLL(r1)
        L60:
            return
        L61:
            r4 = 0
            goto L41
        L63:
            r0 = 0
            goto L35
        L65:
            r0 = 0
            goto L2c
        L67:
            r5 = 0
            goto L14
        L69:
            X.01GW<X.0UVW> r0 = X.C0UVW.LIZIZ
            X.0UVW r0 = X.C01QD.LIZ()
            com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterApi r3 = r0.LIZLLL()
            if (r5 == 0) goto L99
            r2 = 1
            boolean r0 = r5.canBeLivePodcast
            if (r0 != r4) goto L9a
            r1 = 1
        L7b:
            webcast.api.room.LiveScenario r0 = r5.liveScenario
            if (r0 == 0) goto L9e
            boolean r0 = r0.enableLiveVideo
            if (r0 != r4) goto L9e
        L83:
            X.11NZ r1 = r3.notifyAnchorColdBoot(r2, r1, r4)
            java.lang.Class<com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterApi> r0 = com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterApi.class
            X.0ThB r0 = X.C0J1R.LIZJ(r0)
            X.11NZ r2 = r1.LJIILIIL(r0)
            X.0UpG<T> r1 = new X.C09JN() { // from class: X.0UpG
                static {
                    /*
                        X.0UpG r0 = new X.0UpG
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0UpG<T>) X.0UpG.LL X.0UpG
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C784040UpG.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C784040UpG.<init>():void");
                }

                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(java.lang.Object r2) {
                    /*
                        r1 = this;
                        java.lang.String r0 = "LiveJourneyUtilKt@391a.sendRequest$2"
                        X.C1C7U.LIZ(r0)
                        X.C1C7U.LIZIZ(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C784040UpG.accept(java.lang.Object):void");
                }
            }
            X.0UpH<T> r0 = new X.C09JN() { // from class: X.0UpH
                static {
                    /*
                        X.0UpH r0 = new X.0UpH
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0UpH<T>) X.0UpH.LL X.0UpH
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C784050UpH.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C784050UpH.<init>():void");
                }

                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(java.lang.Object r2) {
                    /*
                        r1 = this;
                        java.lang.String r0 = "LiveJourneyUtilKt@391a.sendRequest$3"
                        X.C1C7U.LIZ(r0)
                        X.C1C7U.LIZIZ(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C784050UpH.accept(java.lang.Object):void");
                }
            }
            r2.LJJLL(r1, r0)
            return
        L99:
            r2 = 0
        L9a:
            r1 = 0
            if (r5 == 0) goto L9e
            goto L7b
        L9e:
            r4 = 0
            goto L83
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C784010UpD.LIZIZ():void");
    }
}
