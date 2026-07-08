package com.bytedance.android.live.effect.playentity;

import X.AbstractC20356314kz;
import X.C013C;
import X.C01GW;
import X.C0UA2;
import X.C1161920gLG;
import X.C13BV;
import X.C1697810uHb;
import X.C20352114kJ;
import X.C20352314kL;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20424814w2;
import X.C259800zU;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C748880TZe;
import X.C766270U4b;
import X.C768240UBq;
import X.C768290UBv;
import X.C937280aUw;
import X.C946060aj6;
import X.EnumC20429014wi;
import X.EnumC771230UNd;
import X.EnumC773040UUc;
import X.InterfaceC20354714kj;
import X.InterfaceC761540Tu4;
import X.InterfaceC979390bar;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.playentity.MusicEntityConfig;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.model.MusicChannel;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS180S0400000_31;
import kotlin.jvm.internal.AwS240S0300000_31;
import kotlin.jvm.internal.AwS275S0300000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class MusicEntity extends AbstractC20356314kz {
    public final C20357914lF LLJJJJJIL = new C20357914lF("music", 0, 39000003, 0, C1697810uHb.LJIIJJI("music_ongoing", "music_finish_setting", "music_finished", "never"), null, 20464);
    public final HashMap<Long, String> LLJJJJLIIL = new HashMap<>();
    public final C20352114kJ LLJJL = new Function2<Long, String, Unit>() { // from class: X.14kJ
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Long l, String str) {
            Long l2 = l;
            String str2 = str;
            if (C500260Jjc.LJJIIZ(str2) && l2 != null) {
                this.LL.LLJJJJLIIL.put(l2, str2);
                this.LL.LJJJJJ(new C20361314ln(C497740JfY.LJIJI(2131844628), C497740JfY.LJIJI(2131844628), R.attr.e53, R.attr.e53, this.LL.LJJLIIIJ(l2), null, 0, null, false, null, 3968), this.LL.LLJJJJJIL.LIZLLL);
            }
            return Unit.LIZ;
        }
    };
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 113));

    @Override // X.AbstractC20356314kz
    public final void LJJIL() {
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).removeHostToolsCallback(EnumC773040UUc.MUSIC, (C20352314kL) this.LLJJLIIIJLLLLLLLZ.getValue());
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJJZI() {
        LJJIL();
        super.LJJJJZI();
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void destroy() {
        LJJIL();
        super.destroy();
    }

    @Override // X.AbstractC20356314kz
    public final C20357914lF LJJJIL() {
        return this.LLJJJJJIL;
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJIILLIIL(String str) {
        if (isRunning() && LJJJ()) {
            LJJLIIIJILLIZJL((MusicEntityConfig) C937280aUw.LIZJ(MusicEntityConfig.class, str, new MusicEntityConfig(null)));
        }
    }

    @Override // X.AbstractC20356314kz
    public final boolean LJJJJLI(String str) {
        DataChannel dataChannel = this.LLJ;
        if (dataChannel == null) {
            return false;
        }
        if (C500260Jjc.LJJJI((Boolean) dataChannel.gg0(UserIsAnchorChannel.class))) {
            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getHostToolsUtil();
            return C768290UBv.LIZLLL(dataChannel);
        }
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isCoin()) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC20356314kz
    public final void LJJLI(C20361214lm c20361214lm) {
        if (!LJJLIIIJILLIZJL((MusicEntityConfig) C937280aUw.LIZJ(MusicEntityConfig.class, c20361214lm.LJI, new MusicEntityConfig(null)))) {
            ((C20352314kL) this.LLJJLIIIJLLLLLLLZ.getValue()).LIZ = c20361214lm;
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).addHostToolsCallback(EnumC773040UUc.MUSIC, (C20352314kL) this.LLJJLIIIJLLLLLLLZ.getValue());
        }
    }

    public final List<String> LJJLIIIJ(Long l) {
        String str = this.LLJJJJLIIL.get(l);
        if (str != null && str.length() != 0) {
            return C1697810uHb.LJ(str);
        }
        return C13BV.INSTANCE;
    }

    public final boolean LJJLIIIJILLIZJL(MusicEntityConfig musicEntityConfig) {
        Long l;
        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        EnumC773040UUc enumC773040UUc = EnumC773040UUc.MUSIC;
        EnumC771230UNd enumC771230UNd = iBroadcastService.getHostToolsCurrentStatus(enumC773040UUc).LIZ;
        String str = iBroadcastService.getHostToolsCurrentStatus(enumC773040UUc).LIZIZ;
        if (musicEntityConfig != null && (l = musicEntityConfig.musicId) != null) {
            if (enumC771230UNd == EnumC771230UNd.APPLYING && Intrinsics.LJFF(str, String.valueOf(l))) {
                LJJIJ();
                return true;
            }
            return false;
        }
        if (enumC771230UNd == EnumC771230UNd.APPLYING) {
            LJJIJ();
            return true;
        }
        return false;
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        MusicEntityConfig musicEntityConfig = (MusicEntityConfig) C937280aUw.LIZJ(MusicEntityConfig.class, c20424814w2.LJII, new MusicEntityConfig(null));
        Long l = musicEntityConfig.musicId;
        if (l != null && this.LLJJJJLIIL.get(l) == null) {
            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).fetchTargetMusic(musicEntityConfig.musicId, new WeakReference<>(this.LLJJL));
        }
        return new C20361314ln(C497740JfY.LJIJI(2131844628), C497740JfY.LJIJI(2131844628), R.attr.e54, R.attr.e54, LJJLIIIJ(musicEntityConfig.musicId), null, i, null, false, null, 3968);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIZ(final C20361214lm c20361214lm, final InterfaceC979390bar interfaceC979390bar, LifecycleOwner lifecycleOwner) {
        FragmentManager fragmentManager;
        super.LJJIIZ(c20361214lm, interfaceC979390bar, lifecycleOwner);
        MusicEntityConfig musicEntityConfig = (MusicEntityConfig) C937280aUw.LIZJ(MusicEntityConfig.class, c20361214lm.LJI, new MusicEntityConfig(null));
        try {
            DataChannel dataChannel = this.LLJ;
            if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).openSingleToolSelectorDialog(fragmentManager, new C0UA2(String.valueOf(musicEntityConfig.musicId), EnumC20429014wi.MUSIC, new InterfaceC761540Tu4() { // from class: X.14kK
                    public boolean LIZ;

                    @Override // X.InterfaceC761540Tu4
                    public final void LIZ() {
                        InterfaceC979390bar interfaceC979390bar2 = interfaceC979390bar;
                        if (interfaceC979390bar2 != null) {
                            interfaceC979390bar2.LIZ(false);
                        }
                    }

                    @Override // X.InterfaceC761540Tu4
                    public final void LIZIZ() {
                        InterfaceC979390bar interfaceC979390bar2;
                        if (this.LIZ || (interfaceC979390bar2 = interfaceC979390bar) == null) {
                            return;
                        }
                        interfaceC979390bar2.LIZJ();
                    }

                    @Override // X.InterfaceC761540Tu4
                    public final void LIZJ(C20355014km c20355014km) {
                        long j;
                        if (c20355014km == null) {
                            InterfaceC979390bar interfaceC979390bar2 = interfaceC979390bar;
                            if (interfaceC979390bar2 != null) {
                                interfaceC979390bar2.LJI(c20361214lm.LIZIZ, null, !this.LIZ);
                            }
                        } else {
                            Gson gson = C19748512Ol.LIZJ;
                            this.getClass();
                            String str = c20355014km.LIZ;
                            if (str != null) {
                                j = CastLongProtector.parseLong(str);
                            } else {
                                j = -1;
                            }
                            String json = GsonProtectorUtils.toJson(gson, new MusicEntityConfig(Long.valueOf(j)));
                            InterfaceC979390bar interfaceC979390bar3 = interfaceC979390bar;
                            if (interfaceC979390bar3 != null) {
                                interfaceC979390bar3.LJI(c20361214lm.LIZIZ, json, !this.LIZ);
                            }
                        }
                        this.LIZ = true;
                    }
                }));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            interfaceC979390bar.LIZLLL(c20361214lm.LIZIZ, "");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC20356314kz
    public final void LJJJLL(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
        Long l2;
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getHostToolsUtil();
        if (C500260Jjc.LJJIJIIJIL(Boolean.valueOf(C768290UBv.LIZIZ(this.LLJ)))) {
            PlayEntityUtilKt.LJI(this, c20361214lm, interfaceC20354714kj, null, "can not open music dialog", -2L, 8);
            return;
        }
        boolean zIsAccompanimentPlaying = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).isAccompanimentPlaying();
        if (zIsAccompanimentPlaying) {
            C766270U4b.LIZLLL(2131854098);
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = interfaceC20354714kj;
        if (lifecycleOwner != null) {
            PlayEntityUtilKt.LJIILL(lifecycleOwner, new AwS575S0100000_31(c259800zU, (C259800zU<InterfaceC20354714kj>) 114));
        }
        MusicEntityConfig musicEntityConfig = (MusicEntityConfig) C937280aUw.LIZJ(MusicEntityConfig.class, c20361214lm.LJI, new MusicEntityConfig(null));
        PlayEntityUtilKt.LJFF(this, c20361214lm, (InterfaceC20354714kj) c259800zU.element, lifecycleOwner);
        C013C c013c = new C013C();
        c013c.element = true;
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            dataChannel.zW(MusicChannel.class, new C946060aj6(new C768240UBq(musicEntityConfig.musicId, null), str3, new AwS180S0400000_31(this, (MusicEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) c013c, (C013C) 1), null, new AwS575S0100000_31(this, 115), new AwS240S0300000_31(this, (MusicEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 10), null, new AwS240S0300000_31(this, (MusicEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 11), false, this.LLIZ, new AwS275S0300000_31(this, (MusicEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 5), null, 9880));
        }
        IEffectService iEffectService = (IEffectService) C1161920gLG.LIZJ(IEffectService.class);
        DataChannel dataChannel2 = this.LLJ;
        if (zIsAccompanimentPlaying) {
            l2 = null;
        } else {
            l2 = musicEntityConfig.musicId;
        }
        iEffectService.openMusicDialog(dataChannel2, l2);
    }
}
