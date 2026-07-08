package X;

import android.os.Handler;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.effect.EffectService;
import com.bytedance.android.live.effect.api.EffectRelatedApi;
import com.bytedance.android.live.effect.api.EffectRelatedApiTryModeProxy;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.filter.data.ComposerFilterViewModel;
import com.bytedance.android.livesdk.dataChannel.BroadcastSceneGlobalChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastBackgroundPhase2;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectStrategyPreloadSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectStructureOptSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0U87, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U87 implements InterfaceC774620Ua4 {
    public final C406501i3 LL = new C406501i3();
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(382));
    public C609450NvL LLILLL;

    @Override // X.InterfaceC774620Ua4
    public final void LLLLZLLLI() {
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZLL(Fragment fragment, DataChannel dataChannel) {
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZLZ() {
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLZIL() {
        boolean zBooleanValue = ((Boolean) C764820TzM.LIZ(1).LIZIZ()).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("finishbroadcast: ");
        C0U22 c0u22 = C0U1G.LIZ;
        sbLIZ.append(c0u22 != null ? c0u22.LIZJ : null);
        C20441214yg.LIZIZ("karaokeLog", C2188811AlT.LIZIZ(sbLIZ));
        C0U1G.LIZLLL(3L, System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT), true, zBooleanValue);
        ((LinkedHashMap) C0U1G.LJI).clear();
        C0U1G.LIZ = null;
        C0U1G.LIZJ = null;
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZIL() {
        InterfaceC1268640j7O interfaceC1268640j7OLJIIL;
        InterfaceC769940UIe interfaceC769940UIe = (InterfaceC769940UIe) DataChannelGlobal.LLILZ.gg0(C930890aKd.class);
        if (interfaceC769940UIe != null && (interfaceC1268640j7OLJIIL = interfaceC769940UIe.LJIIL()) != null) {
            interfaceC1268640j7OLJIIL.sendEffectMsg(112, 1, 0, "");
        }
        C768430UCj c768430UCj = C768430UCj.LIZ;
        C768430UCj.LIZJ("live_take_detail");
    }

    @Override // X.InterfaceC774620Ua4
    public final EnumC773520UVy LLZ() {
        return EnumC773520UVy.PREVIEW_AND_VIDEO_BROADCAST_PAGE;
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZI(DataChannel dataChannel) {
        if (LiveEffectStructureOptSetting.INSTANCE.shouldClearCache()) {
            C0U60.LIZ().LLILZ.clearCache();
        }
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZZIL(boolean z) {
        if (!z) {
            C0U9D.LIZJ();
            C767630U9h.LL.release();
            C760480TsM.LIZ.LIZIZ();
            C760630Tsb.LIZ().LJII();
            C0UFI c0ufi = C0UFI.LIZ;
            C0UFI.LJIIJ(true);
        }
        C0U8T.LIZ.getClass();
        C0U8T.LIZLLL = null;
        C0U8T.LIZJ.clear();
        C767750U9t c767750U9t = C767750U9t.LIZ;
        if (!z) {
            C0UA1.LIZ().tr(c767750U9t);
            C767750U9t.LIZLLL = null;
            C767750U9t.LJ = null;
        } else if (C767750U9t.LIZIZ) {
            C767750U9t.LIZLLL(C767750U9t.LIZJ);
        }
        C767750U9t.LIZIZ = false;
        C767750U9t.LIZJ = null;
        C497700JfU c497700JfU = C497700JfU.LIZ;
        C497700JfU.LIZIZ();
        C768430UCj c768430UCj = C768430UCj.LIZ;
        C768430UCj.LIZLLL.clear();
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZIIL(Fragment fragment, DataChannel dataChannel) {
        InterfaceC497601wk viewModelScope;
        InterfaceC1268640j7O interfaceC1268640j7OLJIIL;
        C0UA1.LIZ().Dr(C760480TsM.LIZ);
        C760480TsM.LIZIZ = C0U60.LIZ();
        InterfaceC769940UIe interfaceC769940UIe = (InterfaceC769940UIe) DataChannelGlobal.LLILZ.gg0(C930890aKd.class);
        if (interfaceC769940UIe != null && (interfaceC1268640j7OLJIIL = interfaceC769940UIe.LJIIL()) != null) {
            interfaceC1268640j7OLJIIL.sendEffectMsg(112, 3, 0, "");
        }
        C767630U9h.LL.kY0(dataChannel);
        C406501i3 c406501i3 = this.LL;
        EnumC768840UDy enumC768840UDy = EnumC768840UDy.PREVIEW;
        c406501i3.getClass();
        C406501i3.LIZ(dataChannel, fragment, enumC768840UDy);
        C0U8T.LIZ.getClass();
        C0U8T.LIZLLL = dataChannel;
        C0U5Z c0u5zLIZ = C760630Tsb.LIZ();
        c0u5zLIZ.getClass();
        c0u5zLIZ.LIZIZ = InterfaceC766480U4w.LJIL.LIZIZ();
        c0u5zLIZ.LIZJ = ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).LLJILJILJ();
        C20337914i1<Integer> c20337914i1 = InterfaceC766480U4w.LIZ;
        if (c20337914i1.LIZIZ().intValue() < 0) {
            c20337914i1.LJFF(0);
        }
        ComposerFilterViewModel composerFilterViewModel = (ComposerFilterViewModel) C0U61.LIZ(new C761460Ttw()).get(ComposerFilterViewModel.class);
        c0u5zLIZ.LJ = composerFilterViewModel;
        AnonymousClass0956 anonymousClass0956LIZLLL = null;
        if (composerFilterViewModel != null && (viewModelScope = ViewModelKt.getViewModelScope(composerFilterViewModel)) != null) {
            anonymousClass0956LIZLLL = C23250099c.LIZLLL(viewModelScope, null, null, new C760690Tsh(c0u5zLIZ, null), 3);
        }
        c0u5zLIZ.LJFF = anonymousClass0956LIZLLL;
        C768430UCj c768430UCj = C768430UCj.LIZ;
        C768430UCj.LJFF = 0L;
        C768430UCj.LIZJ("live_take_page");
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZL(final Fragment fragment, final DataChannel dataChannel) {
        EffectService effectService;
        int i;
        RoomAuthStatus roomAuthStatus;
        AnchorLevelPermission anchorLevelPermission;
        C0UA1.LIZ().Dr(C760480TsM.LIZ);
        C760480TsM.LIZIZ = C0U60.LIZ();
        C0U8T.LIZ.getClass();
        C0U8T.LIZLLL = dataChannel;
        C767630U9h c767630U9h = C767630U9h.LL;
        c767630U9h.kY0(dataChannel);
        C767640U9i c767640U9i = C767630U9h.LLILZLL;
        if (c767640U9i != null) {
            c767640U9i.LJI = false;
        }
        C767630U9h.LLILZLL = null;
        c767630U9h.VH(false);
        C482260Ivg.LIZLLL(EffectRelatedApi.class, new EffectRelatedApiTryModeProxy());
        C768430UCj c768430UCj = C768430UCj.LIZ;
        C768430UCj.LJFF = C500260Jjc.LJJLIIIJ(dataChannel);
        C497700JfU c497700JfU = C497700JfU.LIZ;
        C497700JfU.LIZJ.put(this, new InterfaceC497710JfV() { // from class: X.0U88
            @Override // X.InterfaceC497710JfV
            public final void LIZ(EnumC768840UDy enumC768840UDy, EnumC768840UDy enumC768840UDy2) {
                int i2 = C497900Jfo.LIZ[enumC768840UDy.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            C760740Tsm c760740Tsm = C760740Tsm.LIZ;
                            c760740Tsm.getClass();
                            ((LinkedHashMap) C760740Tsm.LIZIZ).clear();
                            C0UA1.LIZ().tr(c760740Tsm);
                            ((ArrayList) C760740Tsm.LIZJ).clear();
                            C786410Ut5.LJLIIL(2000L, (Handler) this.LIZ.LLILLJJLI.getValue(), new Runnable() { // from class: X.0U89
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("EffectBroadcastLifecycle@7509.onEnterBroadcast$1$invoke$1");
                                    try {
                                        if (DataChannelGlobal.LLILZ.gg0(BroadcastSceneGlobalChannel.class) == EnumC768840UDy.BROADCAST) {
                                            C767630U9h c767630U9h2 = C767630U9h.LL;
                                            EnumC767650U9j enumC767650U9j = EnumC767650U9j.CO_HOST_INSERT;
                                            c767630U9h2.getClass();
                                            C767630U9h.LJIIL(enumC767650U9j);
                                            C767630U9h.LJIIL(EnumC767650U9j.MULTI_GUEST_INSERT);
                                        }
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("EffectBroadcastLifecycle@7509.onEnterBroadcast$1$invoke$1");
                                }
                            });
                            if (enumC768840UDy2 == EnumC768840UDy.MULTI_GUEST) {
                                this.LIZ.getClass();
                                C768430UCj c768430UCj2 = C768430UCj.LIZ;
                                C768430UCj.LIZJ("live_take_detail");
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    C0U87 c0u87 = this.LIZ;
                    DataChannel dataChannel2 = dataChannel;
                    Fragment fragment2 = fragment;
                    c0u87.getClass();
                    C760740Tsm c760740Tsm2 = C760740Tsm.LIZ;
                    c760740Tsm2.getClass();
                    C0UA1.LIZ().Dr(c760740Tsm2);
                    ArrayList arrayList = (ArrayList) C760740Tsm.LIZJ;
                    arrayList.clear();
                    Object objLJJJLL = C13LP.LJJJLL(C0UA1.LIZ().qr(C0UD4.LIZIZ));
                    if (objLJJJLL != null) {
                        arrayList.add(objLJJJLL);
                    }
                    C406501i3 c406501i3 = c0u87.LL;
                    EnumC768840UDy enumC768840UDy3 = EnumC768840UDy.MULTI_GUEST;
                    c406501i3.getClass();
                    C406501i3.LIZ(dataChannel2, fragment2, enumC768840UDy3);
                    C768430UCj c768430UCj3 = C768430UCj.LIZ;
                    C768430UCj.LIZJ("connection_status");
                    return;
                }
                C0U87 c0u872 = this.LIZ;
                DataChannel dataChannel3 = dataChannel;
                Fragment fragment3 = fragment;
                C406501i3 c406501i32 = c0u872.LL;
                EnumC768840UDy enumC768840UDy4 = EnumC768840UDy.CO_HOST;
                c406501i32.getClass();
                C406501i3.LIZ(dataChannel3, fragment3, enumC768840UDy4);
            }
        });
        if (LiveEffectStrategyPreloadSetting.INSTANCE.withStrategy()) {
            C406501i3 c406501i3 = this.LL;
            EnumC768840UDy enumC768840UDy = EnumC768840UDy.BROADCAST;
            c406501i3.getClass();
            C406501i3.LIZ(dataChannel, fragment, enumC768840UDy);
        }
        if (LiveBroadcastBackgroundPhase2.enable()) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            if (!C500260Jjc.LJJJI((Boolean) dataChannelGlobal.gg0(C930850aKZ.class))) {
                this.LL.getClass();
                Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
                if (room != null && (roomAuthStatus = room.mRoomAuthStatus) != null && (anchorLevelPermission = roomAuthStatus.anchorLevelPermission) != null) {
                    i = anchorLevelPermission.liveBackground;
                } else {
                    i = 1;
                }
                if (i != C0UFE.OFF.ordinal()) {
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new C760920Tt4(C0U60.LIZIZ(), null), 3);
                }
            }
        }
        if (DownloadableModelSupport.isInitialized()) {
            C609450NvL c609450NvL = new C609450NvL(DownloadableModelSupport.getInstance(), C0U60.LIZ());
            this.LLILLL = c609450NvL;
            C006A c006aLIZJ = C1161920gLG.LIZJ(IEffectService.class);
            if ((c006aLIZJ instanceof EffectService) && (effectService = (EffectService) c006aLIZJ) != null) {
                effectService.LLILLJJLI = c609450NvL;
            }
        }
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZZ(boolean z, boolean z2) {
        EffectService effectService;
        InterfaceC1268640j7O interfaceC1268640j7OLJIIL;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        InterfaceC769940UIe interfaceC769940UIe = (InterfaceC769940UIe) dataChannelGlobal.gg0(C930890aKd.class);
        if (interfaceC769940UIe != null && (interfaceC1268640j7OLJIIL = interfaceC769940UIe.LJIIL()) != null) {
            interfaceC1268640j7OLJIIL.sendEffectMsg(112, 2, 0, "");
        }
        C0U9D.LIZJ();
        C0U8T.LIZ.getClass();
        C0U8T.LIZLLL = null;
        C0U8T.LIZJ.clear();
        dataChannelGlobal.zQ2(this);
        C767630U9h.LL.release();
        C0UA1.LIZ().tr(C767750U9t.LIZ);
        C767750U9t.LIZLLL = null;
        C767750U9t.LJ = null;
        C760480TsM.LIZ.LIZIZ();
        ((Handler) this.LLILLJJLI.getValue()).removeCallbacksAndMessages(null);
        C767200U7q.LIZ.release();
        C497700JfU c497700JfU = C497700JfU.LIZ;
        C497700JfU.LIZIZ();
        C760740Tsm c760740Tsm = C760740Tsm.LIZ;
        c760740Tsm.getClass();
        ((LinkedHashMap) C760740Tsm.LIZIZ).clear();
        C0UA1.LIZ().tr(c760740Tsm);
        ((ArrayList) C760740Tsm.LIZJ).clear();
        C768430UCj c768430UCj = C768430UCj.LIZ;
        C768430UCj.LJFF = 0L;
        if (!z) {
            C760630Tsb.LIZ().LJII();
            C768300UBw.LJIIL(null, C784830UqX.LIZ);
            C784830UqX.LIZ = null;
            C520080KaU.LIZ.getClass();
            C520080KaU.LIZJ = false;
            C520080KaU.LJI = null;
            C520080KaU.LIZLLL = false;
            ((ArrayList) C520080KaU.LJFF).clear();
            C054G c054g = C520080KaU.LJ;
            if (c054g != null) {
                C2296808zG.LIZJ(c054g, null);
            }
            C520080KaU.LJ = null;
        }
        C768430UCj.LIZLLL.clear();
        C0U8F.LIZIZ.clear();
        C0U8F.LIZJ.clear();
        C0U8F.LIZLLL.clear();
        C0U8F.LJ = 0;
        C609450NvL c609450NvL = this.LLILLL;
        if (c609450NvL != null) {
            AnonymousClass0956 anonymousClass0956 = c609450NvL.LIZLLL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            c609450NvL.LIZLLL = null;
            C2296808zG.LIZJ(c609450NvL.LIZJ, null);
        }
        this.LLILLL = null;
        C006A c006aLIZJ = C1161920gLG.LIZJ(IEffectService.class);
        if ((c006aLIZJ instanceof EffectService) && (effectService = (EffectService) c006aLIZJ) != null) {
            effectService.LLILLJJLI = null;
        }
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZ(String str, String str2, Map<String, ? extends Object> map, C0U8C c0u8c) {
        if (Intrinsics.LJFF(str, "effect_resource_strategy")) {
            try {
                C0U60.LIZ().BQ2(CastIntegerProtector.parseInt(String.valueOf(map.get("level"))), CastIntegerProtector.parseInt(String.valueOf(map.get("force_downgrade_to_bottom"))), c0u8c);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }
}
