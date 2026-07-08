package com.bytedance.android.live.effect.playentity;

import X.AbstractC20356314kz;
import X.C1161920gLG;
import X.C13BV;
import X.C1697810uHb;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20365714mV;
import X.C20424814w2;
import X.C497740JfY;
import X.C500260Jjc;
import X.C5180020c;
import X.C766270U4b;
import X.C771680UOw;
import X.InterfaceC20354714kj;
import X.InterfaceC771700UOy;
import X.InterfaceC771710UOz;
import X.InterfaceC979390bar;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.PreviewCoverEditVisibilityChannel;
import com.bytedance.android.live.effect.playentity.CoverConfig;
import com.bytedance.android.live.effect.playentity.CoverEntity;
import com.bytedance.android.livesdk.livesetting.linkmic.PlaybookEntitiesIterationEnabledSetting;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes32.dex */
public final class CoverEntity extends AbstractC20356314kz {
    public final C20357914lF LLJJJJJIL = new C20357914lF("cover", 0, 44500000, 0, C1697810uHb.LJIIJJI("cover_ongoing", "never"), null, 20464);

    @Override // X.AbstractC20356314kz
    public final C20357914lF LJJJIL() {
        return this.LLJJJJJIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJJLIIIJ(java.lang.String r3) {
        /*
            java.lang.String r2 = ""
            if (r3 == 0) goto L16
            com.google.gson.Gson r1 = X.C293501Bt.LIZ()     // Catch: java.lang.Throwable -> L1b
            java.lang.Class<com.bytedance.android.live.effect.playentity.CoverConfig> r0 = com.bytedance.android.live.effect.playentity.CoverConfig.class
            java.lang.Object r0 = r1.LJII(r3, r0)     // Catch: java.lang.Throwable -> L1b
            com.bytedance.android.live.effect.playentity.CoverConfig r0 = (com.bytedance.android.live.effect.playentity.CoverConfig) r0     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L16
            java.lang.String r1 = r0.coverUrl     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L17
        L16:
            r1 = r2
        L17:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L1b
            goto L27
        L1b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L27:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r1)
            if (r0 != 0) goto L2e
            r2 = r1
        L2e:
            java.lang.String r2 = (java.lang.String) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.playentity.CoverEntity.LJJLIIIJ(java.lang.String):java.lang.String");
    }

    @Override // X.AbstractC20356314kz
    public final boolean LJJJJJL(String str) {
        return PlaybookEntitiesIterationEnabledSetting.INSTANCE.getValue();
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        C20365714mV c20365714mV;
        String strLJJLIIIJ = LJJLIIIJ(c20424814w2.LJII);
        if (!a0.LJJJIL(strLJJLIIIJ)) {
            c20365714mV = new C20365714mV(null, 0, 0.0f, new C5180020c(strLJJLIIIJ, 9), null, null, 0.0f, 239);
        } else {
            c20365714mV = null;
        }
        return new C20361314ln(C497740JfY.LJIJI(2131842029), C497740JfY.LJIJI(2131842029), R.attr.dvp, R.attr.dvp, C13BV.INSTANCE, c20365714mV, i, null, C500260Jjc.LJJIL(), null, 3712);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIZ(C20361214lm c20361214lm, final InterfaceC979390bar interfaceC979390bar, LifecycleOwner lifecycleOwner) {
        super.LJJIIZ(c20361214lm, interfaceC979390bar, lifecycleOwner);
        if (C500260Jjc.LJJ()) {
            C766270U4b.LIZLLL(2131854672);
            interfaceC979390bar.LJFF();
            return;
        }
        String strLJJLIIIJ = LJJLIIIJ(c20361214lm.LJI);
        InterfaceC771710UOz broadcastKit = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastKit();
        InterfaceC771700UOy interfaceC771700UOy = new InterfaceC771700UOy() { // from class: X.14kb
            @Override // X.InterfaceC771700UOy
            public final void LIZ() {
                InterfaceC979390bar interfaceC979390bar2 = interfaceC979390bar;
                if (interfaceC979390bar2 != null) {
                    interfaceC979390bar2.LIZ(true);
                }
            }

            @Override // X.InterfaceC771700UOy
            public final void LIZIZ(String str, String str2) {
                InterfaceC979390bar interfaceC979390bar2 = interfaceC979390bar;
                if (interfaceC979390bar2 != null) {
                    CoverConfig coverConfig = new CoverConfig();
                    if (str == null) {
                        str = "";
                    }
                    coverConfig.coverUrl = str;
                    if (str2 == null) {
                        str2 = "";
                    }
                    coverConfig.coverUri = str2;
                    interfaceC979390bar2.LJI(this.LLJJJJJIL.LIZLLL, C1516000pYM.LIZJ(coverConfig), true);
                }
                InterfaceC979390bar interfaceC979390bar3 = interfaceC979390bar;
                if (interfaceC979390bar3 != null) {
                    interfaceC979390bar3.LJ();
                }
            }
        };
        broadcastKit.getClass();
        C771680UOw.LIZJ = true;
        C771680UOw.LIZLLL = true;
        C771680UOw.LJFF = strLJJLIIIJ;
        C771680UOw.LJIILIIL = interfaceC771700UOy;
        DataChannel dataChannel = C771680UOw.LIZIZ;
        if (dataChannel != null) {
            dataChannel.zW(PreviewCoverEditVisibilityChannel.class, Boolean.TRUE);
        }
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJZ(final C20361214lm c20361214lm, final InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str) {
        String strLJJLIIIJ = LJJLIIIJ(c20361214lm.LJI);
        InterfaceC771710UOz broadcastKit = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastKit();
        InterfaceC771700UOy interfaceC771700UOy = new InterfaceC771700UOy() { // from class: X.14ka
            @Override // X.InterfaceC771700UOy
            public final void LIZ() {
                PlayEntityUtilKt.LJII(this.LIZ, 2, c20361214lm, interfaceC20354714kj, true);
            }

            @Override // X.InterfaceC771700UOy
            public final void LIZIZ(String str2, String str3) {
                if (str2 != null && str2.length() != 0) {
                    CoverEntity coverEntity = this.LIZ;
                    CoverConfig coverConfig = new CoverConfig();
                    coverConfig.coverUrl = str2;
                    if (str3 == null) {
                        str3 = "";
                    }
                    coverConfig.coverUri = str3;
                    PlayEntityUtilKt.LIZJ(coverEntity, coverConfig, c20361214lm, interfaceC20354714kj, true);
                }
                PlayEntityUtilKt.LJ(this.LIZ, 2, c20361214lm, interfaceC20354714kj);
            }
        };
        broadcastKit.getClass();
        C771680UOw.LIZJ = true;
        C771680UOw.LIZLLL = true;
        C771680UOw.LJFF = strLJJLIIIJ;
        C771680UOw.LJIILIIL = interfaceC771700UOy;
        DataChannel dataChannel = C771680UOw.LIZIZ;
        if (dataChannel != null) {
            dataChannel.zW(PreviewCoverEditVisibilityChannel.class, Boolean.TRUE);
        }
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJLL(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
        if (C500260Jjc.LJJ()) {
            C766270U4b.LIZLLL(2131854672);
            if (interfaceC20354714kj != null) {
                interfaceC20354714kj.LJIIJ();
            }
        }
    }
}
