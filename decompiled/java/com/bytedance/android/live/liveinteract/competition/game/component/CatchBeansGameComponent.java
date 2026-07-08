package com.bytedance.android.live.liveinteract.competition.game.component;

import X.AbstractC962030b8r;
import X.AbstractC963310bAv;
import X.AbstractC983420bhM;
import X.C08CJ;
import X.C0PEM;
import X.C20441214yg;
import X.C2188811AlT;
import X.C23250099c;
import X.C466310IQj;
import X.C500260Jjc;
import X.C817503Hh;
import X.C915980Zwa;
import X.C981480beE;
import X.C981550beL;
import X.C982790bgL;
import X.C983690bhn;
import X.C985690bl1;
import X.C986030blZ;
import X.C986040bla;
import X.EnumC962960bAM;
import X.EnumC982500bfs;
import X.EnumC986110blh;
import X.InterfaceC774130UYh;
import android.content.Context;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.LiveStreamGlobalChannel;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class CatchBeansGameComponent extends AbstractC983420bhM implements GenericLifecycleObserver {
    public MatchBaseWidget LLILZIL;
    public C466310IQj LLILZLL;
    public boolean LLIZ;
    public Long LLIZLLLIL;
    public final LifecycleEventObserver LLJ;
    public volatile boolean LLJI;

    @Override // X.AbstractC983420bhM
    public final String LJIIJ() {
        return "match_game_component";
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0208  */
    @Override // X.AbstractC983420bhM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL() {
        /*
            Method dump skipped, instruction units count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.competition.game.component.CatchBeansGameComponent.LJIILIIL():void");
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.AbstractC983420bhM, X.InterfaceC977430bXh
    public final void dismiss() {
        super.dismiss();
        this.LLJI = true;
        C466310IQj c466310IQj = this.LLILZLL;
        if (c466310IQj != null) {
            c466310IQj.LIZ();
        }
        this.LLILZLL = null;
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        if (this.LL) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C986030blZ(this, null), 2);
        }
    }

    @Override // X.AbstractC983420bhM, X.InterfaceC977430bXh
    public final void onUnload() {
        Lifecycle lifecycle;
        super.onUnload();
        this.LLJI = true;
        C20441214yg.LJ("match_game_component", "stop game on main thread on unload");
        C983690bhn c983690bhn = C983690bhn.LIZ;
        c983690bhn.getClass();
        TTVideoEngine tTVideoEngine = C983690bhn.LIZJ;
        if (tTVideoEngine != null) {
            tTVideoEngine.release();
        }
        InterfaceC774130UYh interfaceC774130UYh = C983690bhn.LIZIZ;
        if (interfaceC774130UYh != null) {
            interfaceC774130UYh.setEventListener(null);
        }
        InterfaceC774130UYh interfaceC774130UYh2 = C983690bhn.LIZIZ;
        if (interfaceC774130UYh2 != null) {
            interfaceC774130UYh2.setErrorListener(null);
        }
        InterfaceC774130UYh interfaceC774130UYh3 = C983690bhn.LIZIZ;
        if (interfaceC774130UYh3 != null) {
            interfaceC774130UYh3.stop();
        }
        InterfaceC774130UYh interfaceC774130UYh4 = C983690bhn.LIZIZ;
        if (interfaceC774130UYh4 != null) {
            interfaceC774130UYh4.release();
        }
        C983690bhn.LIZIZ = null;
        C983690bhn.LIZJ = null;
        C983690bhn.LIZLLL = null;
        DataChannelGlobal.LLILZ.zQ2(c983690bhn);
        C20441214yg.LIZIZ("GameAudioPlayer", "release");
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        if (this.LL) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C986040bla(this, null), 2);
        }
        MatchBaseWidget matchBaseWidget = this.LLILZIL;
        if (matchBaseWidget == null || (lifecycle = matchBaseWidget.getLifecycle()) == null) {
            return;
        }
        lifecycle.removeObserver(this.LLJ);
    }

    @Override // X.AbstractC983420bhM, X.InterfaceC977430bXh
    public final void LIZLLL(MatchBaseWidget matchBaseWidget) {
        this.LLILZIL = matchBaseWidget;
        C983690bhn c983690bhn = C983690bhn.LIZ;
        Context context = matchBaseWidget.context;
        c983690bhn.getClass();
        DataChannelGlobal.LLILZ.DQ2(LiveStreamGlobalChannel.class, c983690bhn, new AwS594S0100000_15(context, 9));
        if (C983690bhn.LIZIZ == null) {
            C983690bhn.LIZJ = new TTVideoEngine(context, 0);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Engine Player");
            sbLIZ.append(C983690bhn.LIZJ);
            C20441214yg.LIZIZ("GameAudioPlayer", C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("init avplayer");
        sbLIZ2.append(C983690bhn.LIZIZ);
        sbLIZ2.append("，engineplayer");
        sbLIZ2.append(C983690bhn.LIZJ);
        C20441214yg.LIZIZ("GameAudioPlayer", C2188811AlT.LIZIZ(sbLIZ2));
        super.LIZLLL(matchBaseWidget);
        matchBaseWidget.getLifecycle().addObserver(this.LLJ);
    }

    @Override // X.AbstractC983420bhM
    public final void LJIILJJIL(EnumC982500bfs enumC982500bfs) {
        super.LJIILJJIL(enumC982500bfs);
        dismiss();
    }

    public final void LJIIZILJ(EnumC986110blh enumC986110blh) {
        Long lValueOf;
        C981550beL c981550beL;
        Long l = this.LLIZLLLIL;
        Boolean boolValueOf = null;
        long jCurrentTimeMillis = 0;
        if (l != null && l.longValue() > 0) {
            jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
        }
        C982790bgL c982790bgL = new C982790bgL();
        C985690bl1.LIZ.getClass();
        String str = C985690bl1.LIZIZ;
        EnumC962960bAM enumC962960bAM = EnumC962960bAM.CATCH_BEANS;
        AbstractC962030b8r.LJIIJ(c982790bgL.LIZLLL, "resource_id", str, true);
        c982790bgL.LJIIL(Integer.valueOf(enumC986110blh.getCode()), "apply_status", true);
        AbstractC962030b8r.LJIIJ(c982790bgL.LIZLLL, "apply_to_result_duration", Long.valueOf(jCurrentTimeMillis), true);
        AbstractC963310bAv.LJJ(c982790bgL, enumC962960bAM);
        C981480beE c981480beEM91 = C915980Zwa.LIZIZ().M91(false);
        if (c981480beEM91 != null && (c981550beL = c981480beEM91.LJJIJ) != null) {
            lValueOf = Long.valueOf(c981550beL.LIZ());
            boolValueOf = Boolean.valueOf(c981550beL.LIZJ);
        } else {
            lValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            AbstractC962030b8r.LJIIJ(c982790bgL.LIZLLL, "invite_to_game_ready_duration", lValueOf, true);
        } else {
            AbstractC962030b8r.LJIIJ(c982790bgL.LIZLLL, "accept_to_game_ready_duration", lValueOf, true);
        }
        c982790bgL.LJIJJLI("game_apply_resource_status");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJI(X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C986080ble
            if (r0 == 0) goto L72
            r7 = r9
            X.0ble r7 = (X.C986080ble) r7
            int r2 = r7.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L72
            int r2 = r2 - r1
            r7.LLILZIL = r2
        L12:
            java.lang.Object r3 = r7.LLILLL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILZIL
            r5 = 1
            if (r0 == 0) goto L4b
            if (r0 != r5) goto L78
            com.bytedance.android.live.effect.api.IEffectService r2 = r7.LLILLJJLI
            java.lang.Object r4 = r7.LL
            java.lang.String r4 = (java.lang.String) r4
            X.C155000ia.LIZIZ(r3)
        L28:
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r3 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r3
            if (r3 == 0) goto L48
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "try to remove current game = "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "match_game_component"
            X.C20441214yg.LIZIZ(r0, r1)
            X.0U78 r0 = r2.composerManagerB()
            r0.LJIIJ(r3, r4)
        L48:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4b:
            X.C155000ia.LIZIZ(r3)
            X.0bl1 r0 = X.C985690bl1.LIZ
            r0.getClass()
            java.lang.String r3 = X.C985690bl1.LIZIZ
            java.lang.Class<com.bytedance.android.live.effect.api.IEffectService> r0 = com.bytedance.android.live.effect.api.IEffectService.class
            X.006A r2 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.effect.api.IEffectService r2 = (com.bytedance.android.live.effect.api.IEffectService) r2
            X.0UEA r1 = r2.getLiveEffectController()
            java.lang.String r4 = "interaction_games"
            r7.LL = r4
            r7.LLILLJJLI = r2
            r7.LLILZIL = r5
            java.lang.String r0 = "all"
            java.lang.Object r3 = r1.LIZJ(r3, r4, r0, r7)
            if (r3 != r6) goto L28
            return r6
        L72:
            X.0ble r7 = new X.0ble
            r7.<init>(r8, r9)
            goto L12
        L78:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.competition.game.component.CatchBeansGameComponent.LJIJI(X.05Vn):java.lang.Object");
    }

    public CatchBeansGameComponent(DataChannel dataChannel, AwS559S0100000_15 awS559S0100000_15) {
        super(true, dataChannel, awS559S0100000_15, new ArrayList());
        this.LLJ = new LifecycleEventObserver() { // from class: com.bytedance.android.live.liveinteract.competition.game.component.CatchBeansGameComponent$lifecycleObserver$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                int i = C08CJ.LIZ[event.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        C983690bhn.LIZ.getClass();
                        InterfaceC774130UYh interfaceC774130UYh = C983690bhn.LIZIZ;
                        if (interfaceC774130UYh != null) {
                            interfaceC774130UYh.start();
                            C20441214yg.LIZIZ("GameAudioPlayer", "avplayer play start");
                            return;
                        } else {
                            TTVideoEngine tTVideoEngine = C983690bhn.LIZJ;
                            if (tTVideoEngine != null) {
                                tTVideoEngine.start();
                            }
                            C20441214yg.LIZIZ("GameAudioPlayer", "mEngine play start");
                            return;
                        }
                    }
                    return;
                }
                C983690bhn.LIZ.getClass();
                InterfaceC774130UYh interfaceC774130UYh2 = C983690bhn.LIZIZ;
                if (interfaceC774130UYh2 != null) {
                    interfaceC774130UYh2.pause();
                    C20441214yg.LIZIZ("GameAudioPlayer", "avplayer play pause");
                } else {
                    TTVideoEngine tTVideoEngine2 = C983690bhn.LIZJ;
                    if (tTVideoEngine2 != null) {
                        tTVideoEngine2.pause();
                    }
                    C20441214yg.LIZIZ("GameAudioPlayer", "mEngine play pause");
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILLIIL(X.C0UEA r17, java.lang.String r18, java.lang.String r19, X.InterfaceC1364105Vn<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.competition.game.component.CatchBeansGameComponent.LJIILLIIL(X.0UEA, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJ(java.lang.String r19, java.lang.String r20, java.lang.String r21, boolean r22, X.InterfaceC1364105Vn<? super kotlin.Unit> r23) {
        /*
            r18 = this;
            r3 = r23
            boolean r0 = r3 instanceof X.C986100blg
            r5 = r18
            if (r0 == 0) goto L7e
            r12 = r3
            X.0blg r12 = (X.C986100blg) r12
            int r2 = r12.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7e
            int r2 = r2 - r1
            r12.LLILLL = r2
        L16:
            java.lang.Object r1 = r12.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r12.LLILLL
            r4 = 1
            if (r0 == 0) goto L2e
            if (r0 != r4) goto L84
            X.C155000ia.LIZIZ(r1)
        L26:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.booleanValue()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2e:
            X.C155000ia.LIZIZ(r1)
            long r7 = java.lang.System.currentTimeMillis()
            X.0bgL r6 = new X.0bgL
            r6.<init>()
            X.0bAM r3 = X.EnumC962960bAM.CATCH_BEANS
            org.json.JSONObject r1 = r6.LIZLLL
            java.lang.String r0 = "resource_id"
            r9 = r19
            X.AbstractC962030b8r.LJIIJ(r1, r0, r9, r4)
            X.AbstractC963310bAv.LJJ(r6, r3)
            java.lang.String r0 = "game_apply_resource_start"
            r6.LJIJJLI(r0)
            java.lang.Long r0 = X.C2286608xc.LJFF(r7)
            r5.LLIZLLLIL = r0
            java.lang.Class<com.bytedance.android.live.effect.api.IEffectService> r0 = com.bytedance.android.live.effect.api.IEffectService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.effect.api.IEffectService r0 = (com.bytedance.android.live.effect.api.IEffectService) r0
            X.0UEA r8 = r0.getLiveEffectController()
            r14 = 0
            kotlin.jvm.internal.AwS594S0100000_15 r15 = new kotlin.jvm.internal.AwS594S0100000_15
            r0 = 96
            r15.<init>(r5, r0)
            r12.LLILLL = r4
            r0 = 476(0x1dc, float:6.67E-43)
            kotlin.jvm.internal.AFwS199S0000000_12 r13 = kotlin.jvm.internal.AFwS199S0000000_12.get$arr$(r0)
            r17 = 0
            r16 = r22
            r11 = r21
            r10 = r20
            java.lang.Object r1 = r8.LJFF(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r1 != r2) goto L26
            return r2
        L7e:
            X.0blg r12 = new X.0blg
            r12.<init>(r5, r3)
            goto L16
        L84:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.competition.game.component.CatchBeansGameComponent.LJIJ(java.lang.String, java.lang.String, java.lang.String, boolean, X.05Vn):java.lang.Object");
    }
}
