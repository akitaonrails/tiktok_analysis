package X;

import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.live.effect.CheckVePluginInstalledSetting;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.LiveGoalEffectChannel;
import com.bytedance.android.live.effect.api.RoomStickerFetchSuccessChannel;
import com.bytedance.android.live.effect.api.RoomStickerPanelFailEvent;
import com.bytedance.android.live.effect.api.RoomStickerSpecialFetchSuccessChannel;
import com.bytedance.android.live.effect.api.StickerPropsDataQueryStatus;
import com.bytedance.android.live.effect.bgeffect.BgEffectViewModel;
import com.bytedance.android.live.effect.datastore.base.BaseEffectViewModel;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStickerDataSourceOptSetting;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.effect.LiveEffectOld;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.listener.IRewardEffectsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.QueryRewardEffectsResponse;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0U5u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C766720U5u implements C0U40 {
    public static final C766720U5u LIZ = new C766720U5u();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(383));
    public static final ConcurrentHashMap<C0211004z, String> LIZJ = new ConcurrentHashMap<>(256);

    public static void LIZJ() {
        C770170UJb.LIZJ("LiveEffectDataProvider");
        C770170UJb.LIZLLL = "";
        LIZJ.clear();
    }

    public static EffectManager LJIILL() {
        return (EffectManager) LIZIZ.getValue();
    }

    public static void LIZIZ(Effect effect) {
        if (effect == null) {
            return;
        }
        LIZJ.put(new C0211004z(effect.getResource_id()), effect.getUnzipPath());
    }

    public static final void LJIIJ(final DataChannel dataChannel) {
        LJIIIIZZ("livebackground", new C0U6E(), new C0U69<LiveEffect>() { // from class: X.0U63
            @Override // X.C0U69
            public final List<C0U74<LiveEffect>> LJIIIZ(List<C0U74<LiveEffect>> list) {
                boolean zLJ;
                boolean zLJ2;
                boolean zLJ3;
                boolean zLJ4;
                if (C480040Is6.LIZ) {
                    return list;
                }
                Iterator<C0U74<LiveEffect>> it2 = list.iterator();
                while (it2.hasNext()) {
                    int i = 0;
                    for (LiveEffect liveEffect : it2.next().LIZIZ) {
                        int i2 = i + 1;
                        List<String> list2 = null;
                        if (i >= 0) {
                            LiveEffect liveEffect2 = liveEffect;
                            boolean zLJIILLIIL = C766720U5u.LJIILLIIL(liveEffect2);
                            liveEffect2.LJJLIL(zLJIILLIIL);
                            try {
                                new p();
                                n nVarLJIILIIL = p.LIZJ(liveEffect2.getExtra()).LJIILIIL();
                                k kVarLJJIIZ = nVarLJIILIIL.LJJIIZ("is_none");
                                if (kVarLJJIIZ != null) {
                                    zLJ = kVarLJJIIZ.LJ();
                                } else {
                                    zLJ = false;
                                }
                                liveEffect2.LJJLL(zLJ);
                                if (liveEffect2.LJLJLLL() == null) {
                                    liveEffect2.LJIJJ(new LiveEffect.StickerSDKExtra());
                                }
                                LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL = liveEffect2.LJLJLLL();
                                if (stickerSDKExtraLJLJLLL == null || stickerSDKExtraLJLJLLL.liveGoalExtra == null) {
                                    k kVarLJJIIZ2 = nVarLJIILIIL.LJJIIZ("is_full_screen");
                                    if (kVarLJJIIZ2 != null) {
                                        zLJ2 = kVarLJJIIZ2.LJ();
                                    } else {
                                        zLJ2 = false;
                                    }
                                    k kVarLJJIIZ3 = nVarLJIILIIL.LJJIIZ("is_horizontal");
                                    if (kVarLJJIIZ3 != null) {
                                        zLJ3 = kVarLJJIIZ3.LJ();
                                    } else {
                                        zLJ3 = false;
                                    }
                                    k kVarLJJIIZ4 = nVarLJIILIIL.LJJIIZ("is_vertical");
                                    if (kVarLJJIIZ4 != null) {
                                        zLJ4 = kVarLJJIIZ4.LJ();
                                    } else {
                                        zLJ4 = false;
                                    }
                                    LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL2 = liveEffect2.LJLJLLL();
                                    if (stickerSDKExtraLJLJLLL2 != null) {
                                        stickerSDKExtraLJLJLLL2.liveGoalExtra = new LiveEffect.LiveGoalExtra(zLJ2, zLJ3, zLJ4);
                                    }
                                    if (liveEffect2.LJJIJIIJI() || zLJ2 || zLJ3 || zLJ4) {
                                        liveEffect2.LJLLILLLL();
                                    }
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                            if (zLJIILLIIL) {
                                C0JBN c0jbnLIZ = C1819620xS4.LIZ();
                                UrlModel icon = liveEffect2.getIcon();
                                if (icon != null) {
                                    list2 = icon.urlList;
                                }
                                c0jbnLIZ.LIZJ(list2).LJJIIJZLJL();
                            }
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
                return list;
            }
        }, new C0U68<LiveEffect>(dataChannel) { // from class: X.0U6B
            public final WeakReference<DataChannel> LIZ;

            @Override // X.C0U68
            public final void onFail() {
            }

            {
                this.LIZ = new WeakReference<>(dataChannel);
            }

            @Override // X.C0U68
            public final void onSuccess(List<C0U74<LiveEffect>> list) {
                List<T> list2 = ((C0U74) ListProtector.get(list, 0)).LIZIZ;
                ArrayList<LiveEffect> arrayList = new ArrayList();
                for (T t : list2) {
                    String extra = t.getExtra();
                    if (extra != null && extra.length() > 0) {
                        JSONObject jSONObject = new JSONObject(extra);
                        if (jSONObject.length() > 0 && jSONObject.optBoolean("livegoal")) {
                            arrayList.add(t);
                        }
                    }
                }
                DataChannel dataChannel2 = this.LIZ.get();
                if (dataChannel2 != null) {
                    dataChannel2.zW(LiveGoalEffectChannel.class, arrayList);
                }
                ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalEffectHelper();
                C0UFI.LJIJJ(arrayList);
                for (LiveEffect liveEffect : arrayList) {
                    if (!liveEffect.LJJIJIIJI()) {
                        C766720U5u.LJ(liveEffect, C0UFI.LJIIJJI);
                    }
                }
            }
        });
    }

    public static final void LJIIJJI(final DataChannel dataChannel) {
        LJIILL().fetchRewardEffects("livesticker", 20, 0, null, new IRewardEffectsListener(dataChannel) { // from class: X.0U5x
            public final WeakReference<DataChannel> LIZ;

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IRewardEffectsListener
            public final void onFailed(ExceptionResult exceptionResult) {
            }

            {
                this.LIZ = new WeakReference<>(dataChannel);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(QueryRewardEffectsResponse queryRewardEffectsResponse) {
                List<String> arrayList;
                List<Effect> reward_effects;
                QueryRewardEffectsResponse queryRewardEffectsResponse2 = queryRewardEffectsResponse;
                C766720U5u c766720U5u = C766720U5u.LIZ;
                WeakReference<DataChannel> weakReference = this.LIZ;
                c766720U5u.getClass();
                ArrayList arrayList2 = new ArrayList();
                if (queryRewardEffectsResponse2 == null || (arrayList = queryRewardEffectsResponse2.getUrl_prefix()) == null) {
                    arrayList = new ArrayList<>();
                }
                if (queryRewardEffectsResponse2 != null && (reward_effects = queryRewardEffectsResponse2.getReward_effects()) != null && !reward_effects.isEmpty()) {
                    for (Effect effect : reward_effects) {
                        try {
                            C766720U5u c766720U5u2 = C766720U5u.LIZ;
                            new p();
                            n nVarLJIILIIL = p.LIZJ(effect.getExtra()).LJIILIIL();
                            long j = CastLongProtector.parseLong(effect.getEffect_id());
                            String name = effect.getName();
                            String resource_id = effect.getResource_id();
                            c766720U5u2.getClass();
                            RoomSticker roomStickerLIZ = C766720U5u.LIZ(nVarLJIILIIL, arrayList, j, name, resource_id);
                            roomStickerLIZ.content = effect.getHint();
                            arrayList2.add(roomStickerLIZ);
                            ArrayList arrayList3 = new ArrayList();
                            String str = C0UD4.LIZ;
                            arrayList3.add(new C0U74("livestickerspecial", "livestickerspecial", null, null, null, arrayList2, null, 248));
                            DataChannel dataChannel2 = weakReference.get();
                            if (dataChannel2 != null) {
                                dataChannel2.zW(RoomStickerSpecialFetchSuccessChannel.class, arrayList3);
                            } else {
                                dataChannel2 = null;
                            }
                            C189200o6.m2constructorimpl(dataChannel2);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                        }
                    }
                    return;
                }
                DataChannel dataChannel3 = weakReference.get();
                if (dataChannel3 != null) {
                    dataChannel3.zW(RoomStickerSpecialFetchSuccessChannel.class, C13BV.INSTANCE);
                }
            }
        });
    }

    public static final void LJIIL(final DataChannel dataChannel) {
        if (dataChannel != null) {
            dataChannel.zW(StickerPropsDataQueryStatus.class, 1);
        }
        String str = C0UD4.LIZ;
        LJIIIIZZ("livesticker", new C766730U5v(), new C753670ThN(), new C0U68<RoomSticker>(dataChannel) { // from class: X.0Tka
            public final WeakReference<DataChannel> LIZ;

            @Override // X.C0U68
            public final void onFail() {
                DataChannel dataChannel2 = this.LIZ.get();
                if (dataChannel2 != null) {
                    dataChannel2.FQ2(RoomStickerPanelFailEvent.class);
                }
                DataChannel dataChannel3 = this.LIZ.get();
                if (dataChannel3 != null) {
                    dataChannel3.zW(StickerPropsDataQueryStatus.class, 3);
                }
            }

            {
                this.LIZ = new WeakReference<>(dataChannel);
            }

            @Override // X.C0U68
            public final void onSuccess(List<C0U74<RoomSticker>> list) {
                DataChannel dataChannel2 = this.LIZ.get();
                if (dataChannel2 != null) {
                    dataChannel2.zW(RoomStickerFetchSuccessChannel.class, list);
                }
            }
        });
    }

    public static final boolean LJIILLIIL(LiveEffect liveEffect) {
        String panel;
        if (liveEffect == null) {
            return false;
        }
        if (liveEffect.LJIIIZ() && liveEffect.LIZJ == null) {
            liveEffect.LIZJ = C0UEO.LIZIZ(liveEffect);
        }
        Effect effect = liveEffect.LIZJ;
        if (effect != null) {
            panel = effect.getPanel();
        } else {
            panel = null;
        }
        if (Intrinsics.LJFF(panel, "livebackground") && liveEffect.LJJIJIIJI()) {
            return true;
        }
        return LJIIZILJ(liveEffect.LIZJ);
    }

    public static boolean LJIIZILJ(Effect effect) {
        boolean zIsEffectDownloaded;
        if (effect == null) {
            return false;
        }
        if (!CheckVePluginInstalledSetting.INSTANCE.enable() || ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).ni()) {
            C0211004z c0211004z = new C0211004z(effect.getResource_id());
            ConcurrentHashMap<C0211004z, String> concurrentHashMap = LIZJ;
            String str = concurrentHashMap.get(c0211004z);
            if (str != null) {
                if (str.length() != 0) {
                    if (Intrinsics.LJFF(str, effect.getUnzipPath())) {
                        return true;
                    }
                }
            }
            if (DownloadableModelSupport.isInitialized()) {
                zIsEffectDownloaded = DownloadableModelSupport.getInstance().isEffectReady(LJIILL(), effect);
            } else {
                zIsEffectDownloaded = LJIILL().isEffectDownloaded(effect);
            }
            if (zIsEffectDownloaded) {
                concurrentHashMap.put(c0211004z, effect.getUnzipPath());
                return zIsEffectDownloaded;
            }
            concurrentHashMap.put(c0211004z, "");
            return zIsEffectDownloaded;
        }
        return false;
    }

    public static void LJIJ(LiveEffect liveEffect) {
        if (liveEffect != null) {
            int i = C771340UNo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(liveEffect.LLJI());
            sbLIZ.append('-');
            sbLIZ.append(liveEffect.getFilePath());
            C771340UNo.LJFF("effect", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0U62] */
    public static Object LIZLLL(final LiveEffect liveEffect, AbstractC23140094w abstractC23140094w) {
        com.ss.android.ugc.effectmanager.common.model.UrlModel fileUrl;
        String uri;
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(abstractC23140094w));
        c2252611DEt.LJIJJ();
        if (CheckVePluginInstalledSetting.INSTANCE.enable() && !((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).ni()) {
            if (c2252611DEt.isActive()) {
                C189200o6.m2constructorimpl(false);
                c2252611DEt.resumeWith(false);
            }
        } else {
            Effect effect = liveEffect.LIZJ;
            if (effect != null && (fileUrl = effect.getFileUrl()) != null && (uri = fileUrl.getUri()) != null && uri.length() != 0) {
                Effect effect2 = liveEffect.LIZJ;
                if (effect2 != null) {
                    C770170UJb.LIZJ("LiveEffectDataProvider");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("begin to download effect, effect_id: ");
                    sbLIZ.append(liveEffect.getEffectId());
                    C2188811AlT.LIZIZ(sbLIZ);
                    C770170UJb.LIZLLL = "";
                    LIZ.getClass();
                    EffectManager effectManagerLJIILL = LJIILL();
                    final ?? r0 = new C0U45() { // from class: X.0U62
                        @Override // X.C0U45
                        public final void LIZIZ(LiveEffect liveEffect2, int i, long j) {
                        }

                        @Override // X.C0U45
                        public final void LIZJ(LiveEffect liveEffect2) {
                        }

                        @Override // X.C0U45
                        public final void LIZ(LiveEffect liveEffect2) {
                            if (c2252611DEt.isActive()) {
                                InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = c2252611DEt;
                                Boolean bool = Boolean.TRUE;
                                C189200o6.m2constructorimpl(bool);
                                interfaceC20236714Gf.resumeWith(bool);
                            }
                        }

                        @Override // X.C0U45
                        public final void LJ(LiveEffect liveEffect2, ExceptionResult exceptionResult) {
                            if (c2252611DEt.isActive()) {
                                InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = c2252611DEt;
                                Boolean bool = Boolean.FALSE;
                                C189200o6.m2constructorimpl(bool);
                                interfaceC20236714Gf.resumeWith(bool);
                            }
                        }
                    };
                    effectManagerLJIILL.fetchEffect(effect2, new IEffectDownloadProgressListener(liveEffect, r0) { // from class: X.0U48
                        public final LiveEffect LIZ;
                        public final C0U45 LIZIZ;

                        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                        public final void onStart(Effect effect3) {
                            C0U45 c0u45 = this.LIZIZ;
                            if (c0u45 != null) {
                                c0u45.LIZJ(this.LIZ);
                            }
                        }

                        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                        public final void onSuccess(Effect effect3) {
                            String effect_id;
                            Effect effect4 = effect3;
                            C770170UJb.LIZJ("LiveEffectDataProvider");
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("download effect success, effect_id: ");
                            if (effect4 != null) {
                                effect_id = effect4.getEffect_id();
                            } else {
                                effect_id = null;
                            }
                            sbLIZ2.append(effect_id);
                            C2188811AlT.LIZIZ(sbLIZ2);
                            C770170UJb.LIZLLL = "";
                            C766720U5u.LIZ.getClass();
                            C766720U5u.LIZIZ(effect4);
                            C0U45 c0u45 = this.LIZIZ;
                            if (c0u45 != null) {
                                c0u45.LIZ(this.LIZ);
                            }
                        }

                        {
                            this.LIZ = liveEffect;
                            this.LIZIZ = r0;
                        }

                        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                        public final void onFail(Effect effect3, ExceptionResult exceptionResult) {
                            C0U45 c0u45 = this.LIZIZ;
                            if (c0u45 != null) {
                                c0u45.LJ(this.LIZ, exceptionResult);
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("fetch effect ");
                            sbLIZ2.append(effect3);
                            sbLIZ2.append(" error: ");
                            sbLIZ2.append(exceptionResult);
                            C20441214yg.LJ("LiveEffectDataProvider", C2188811AlT.LIZIZ(sbLIZ2));
                        }

                        @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
                        public final void onProgress(Effect effect3, int i, long j) {
                            C0U45 c0u45 = this.LIZIZ;
                            if (c0u45 != null) {
                                c0u45.LIZIZ(this.LIZ, i, j);
                            }
                        }
                    });
                }
            } else if (c2252611DEt.isActive()) {
                C189200o6.m2constructorimpl(false);
                c2252611DEt.resumeWith(false);
            }
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(abstractC23140094w);
        }
        return objLJIJ;
    }

    public static final void LJ(LiveEffect liveEffect, C0U45 c0u45) {
        Effect effect;
        Effect effect2;
        com.ss.android.ugc.effectmanager.common.model.UrlModel fileUrl;
        String uri;
        if (CheckVePluginInstalledSetting.INSTANCE.enable() && !((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).ni()) {
            if (c0u45 != null) {
                c0u45.LJ(liveEffect, null);
                return;
            }
            return;
        }
        if (LiveStickerDataSourceOptSetting.INSTANCE.enable() && (liveEffect == null || (effect2 = liveEffect.LIZJ) == null || (fileUrl = effect2.getFileUrl()) == null || (uri = fileUrl.getUri()) == null || uri.length() == 0)) {
            if (c0u45 != null) {
                c0u45.LJ(liveEffect, new ExceptionResult(-1));
            }
        } else if (liveEffect != null && (effect = liveEffect.LIZJ) != null) {
            C770170UJb.LIZJ("LiveEffectDataProvider");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("begin to download effect, effect_id: ");
            sbLIZ.append(effect.getEffect_id());
            C2188811AlT.LIZIZ(sbLIZ);
            C770170UJb.LIZLLL = "";
            LIZ.getClass();
            LJIILL().fetchEffect(effect, new C0U47(c0u45));
        }
    }

    public static void LJFF(Effect effect, C0U90 c0u90) {
        if (CheckVePluginInstalledSetting.INSTANCE.enable() && !((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).ni()) {
            if (c0u90 != null) {
                c0u90.LJ(null, null);
            }
        } else if (effect != null) {
            C770170UJb.LIZJ("LiveEffectDataProvider");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("begin to download effect, effect_id: ");
            sbLIZ.append(effect.getEffect_id());
            C2188811AlT.LIZIZ(sbLIZ);
            C770170UJb.LIZLLL = "";
            LIZ.getClass();
            LJIILL().fetchEffect(effect, new C0U47(c0u90));
        }
    }

    public static final void LJI(IEffectPlatformBaseListener<List<LiveEffect>> iEffectPlatformBaseListener, boolean z) {
        if (CheckVePluginInstalledSetting.INSTANCE.enable() && !((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).ni()) {
            return;
        }
        BgEffectViewModel bgEffectViewModelLIZIZ = C0U60.LIZIZ();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(bgEffectViewModelLIZIZ), null, null, new C760890Tt1(z, bgEffectViewModelLIZIZ, iEffectPlatformBaseListener, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.bytedance.android.livesdkapi.depend.model.effect.LiveEffectOld] */
    public static LiveEffect LJIILJJIL(EffectChannelResponse effectChannelResponse, String str) {
        Effect next;
        Effect next2;
        long jLongValue;
        String panel = effectChannelResponse.getPanel();
        if (!Intrinsics.LJFF(panel, C0UD4.LJ) && !Intrinsics.LJFF(panel, "livehorizontaleffects")) {
            C259800zU c259800zU = new C259800zU();
            for (EffectCategoryResponse effectCategoryResponse : effectChannelResponse.getCategoryResponseList()) {
                if (c259800zU.element == 0) {
                    Iterator<Effect> it2 = effectCategoryResponse.getTotalEffects().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next2 = it2.next();
                            if (Intrinsics.LJFF(next2.getResourceId(), str)) {
                                break;
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    Effect effect = next2;
                    if (effect != null) {
                        ?? liveEffectOld = new LiveEffectOld();
                        Long lLJJLIL = C500260Jjc.LJJLIL(effect.getEffect_id());
                        if (lLJJLIL != null) {
                            jLongValue = lLJJLIL.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        liveEffectOld.LLIIZ(jLongValue);
                        liveEffectOld.LJI = effect.getResourceId();
                        liveEffectOld.LLLIZZ(C0UEO.LJFF(effect.getIconUrl()));
                        c259800zU.element = liveEffectOld;
                    }
                }
            }
            return (LiveEffect) c259800zU.element;
        }
        Iterator<Effect> it3 = effectChannelResponse.getAllCategoryEffects().iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                if (Intrinsics.LJFF(next.getResourceId(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Effect effect2 = next;
        if (effect2 == null) {
            return null;
        }
        return C0UEO.LIZLLL(effect2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, com.bytedance.android.livesdkapi.depend.model.LiveEffect, java.lang.Object] */
    public static final void LJII(String str, String str2, C0U45 c0u45) {
        if (CheckVePluginInstalledSetting.INSTANCE.enable() && !((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).ni()) {
            c0u45.LJ(null, null);
            return;
        }
        StickerEffectViewModel stickerEffectViewModelLIZ = C0U60.LIZ();
        C259800zU c259800zU = new C259800zU();
        ?? NQ2 = stickerEffectViewModelLIZ.NQ2(str2);
        c259800zU.element = NQ2;
        if (NQ2 == 0) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(stickerEffectViewModelLIZ), C0PEM.LIZJ, null, new C0U43(c259800zU, str, str2, c0u45, stickerEffectViewModelLIZ, null), 2);
        } else if (LJIILLIIL(NQ2)) {
            c0u45.LIZ(NQ2);
        } else {
            BaseEffectViewModel.wQ2(stickerEffectViewModelLIZ, NQ2, c0u45);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIIZ(java.lang.String r9, final java.lang.String r10, final X.InterfaceC760910Tt3 r11) {
        /*
            com.bytedance.android.live.effect.CheckVePluginInstalledSetting r0 = com.bytedance.android.live.effect.CheckVePluginInstalledSetting.INSTANCE
            boolean r0 = r0.enable()
            r8 = r11
            r7 = r10
            if (r0 == 0) goto L1c
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostCreativeTool> r0 = com.bytedance.android.livesdkapi.host.IHostCreativeTool.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdkapi.host.IHostCreativeTool r0 = (com.bytedance.android.livesdkapi.host.IHostCreativeTool) r0
            boolean r0 = r0.ni()
            if (r0 != 0) goto L1c
            r8.LIZ(r7)
            return
        L1c:
            java.lang.String r0 = X.C0UD4.LIZIZ
            r6 = r9
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r0)
            r9 = 0
            if (r0 != 0) goto L69
            java.lang.String r0 = X.C0UD4.LJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r0)
            if (r0 != 0) goto L69
            java.lang.String r0 = "livebackground"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r0)
            if (r0 == 0) goto L4f
            com.bytedance.android.live.effect.bgeffect.BgEffectViewModel r5 = X.C0U60.LIZIZ()
        L3a:
            if (r5 == 0) goto L92
            boolean r1 = r5 instanceof com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel
            if (r1 == 0) goto L81
            r0 = r5
            com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel r0 = (com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel) r0
            if (r0 == 0) goto L6e
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = r0.NQ2(r7)
            if (r0 == 0) goto L6e
            r8.LIZIZ(r0, r7)
            return
        L4f:
            java.lang.String r0 = X.C0UD4.LIZJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r0)
            if (r0 == 0) goto L92
            X.0U4L r0 = new X.0U4L
            r0.<init>()
            androidx.lifecycle.ViewModelProvider r1 = X.C0U61.LIZ(r0)
            java.lang.Class<com.bytedance.android.live.effect.countdown.CountDownEffectViewModel> r0 = com.bytedance.android.live.effect.countdown.CountDownEffectViewModel.class
            androidx.lifecycle.ViewModel r5 = r1.get(r0)
            com.bytedance.android.live.effect.countdown.CountDownEffectViewModel r5 = (com.bytedance.android.live.effect.countdown.CountDownEffectViewModel) r5
            goto L3a
        L69:
            com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel r5 = X.C0U60.LIZ()
            goto L3a
        L6e:
            if (r1 == 0) goto L81
            r0 = r5
            com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel r0 = (com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel) r0
            if (r0 == 0) goto L81
            X.01hF r0 = r0.LLILZ
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = r0.LJJIJLIJ(r7)
            if (r0 == 0) goto L81
            r8.LIZIZ(r0, r7)
            return
        L81:
            X.01wk r2 = androidx.lifecycle.ViewModelKt.getViewModelScope(r5)
            X.1DFB r1 = X.C0PEM.LIZJ
            X.0U41 r3 = new X.0U41
            r4 = 1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0 = 2
            X.C23250099c.LIZLLL(r2, r1, r9, r3, r0)
            return
        L92:
            java.lang.String r0 = "livesticker"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r0)
            if (r0 == 0) goto Lb2
            kotlin.jvm.internal.AwS161S1100000_12 r2 = new kotlin.jvm.internal.AwS161S1100000_12
            r0 = 4
            r2.<init>(r8, r7, r0)
            X.0U5u r0 = X.C766720U5u.LIZ
            r0.getClass()
            com.ss.android.ugc.effectmanager.EffectManager r1 = LJIILL()
            X.0U5w r0 = new X.0U5w
            r0.<init>()
            r1.fetchEffectListFromCache(r6, r0)
            return
        Lb2:
            r8.LIZ(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C766720U5u.LJIIIZ(java.lang.String, java.lang.String, X.0Tt3):void");
    }

    public static final void LJIILIIL(String str, boolean z, InterfaceC760840Tsw interfaceC760840Tsw) {
        if (CheckVePluginInstalledSetting.INSTANCE.enable() && !((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).ni()) {
            interfaceC760840Tsw.onFail();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveEffectDataProvider fetchSingleEffect resourceId:");
        sbLIZ.append(str);
        sbLIZ.append(" realLoadSingle:");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("shared_bg", C2188811AlT.LIZIZ(sbLIZ));
        BgEffectViewModel bgEffectViewModelLIZIZ = C0U60.LIZIZ();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(bgEffectViewModelLIZIZ), null, null, new C760880Tt0(z, bgEffectViewModelLIZIZ, str, interfaceC760840Tsw, null), 3);
    }

    public static void LJIIIIZZ(String str, C0U3X c0u3x, C0U69 c0u69, C0U68 c0u68) {
        LJIILL().fetchEffectListFromCache(str, new C0U65(str, c0u3x, c0u69, c0u68));
    }

    public static RoomSticker LIZ(n nVar, List list, long j, String str, String str2) {
        String strLJIL;
        int iLJIIJJI;
        int iLJIIJJI2;
        int iLJIIJJI3;
        int iLJIIJJI4;
        int iLJIIJJI5;
        String strLJIL2;
        String strLJIL3;
        String strLJIL4;
        RoomSticker roomSticker = new RoomSticker(false, null, null, 0, 0, 0, 0, "", "", 0, false, null, "", false, "", "", false);
        roomSticker.id = j;
        roomSticker.LIZ = str2;
        roomSticker.name = str;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (true) {
            strLJIL = null;
            if (!it2.hasNext()) {
                break;
            }
            String str3 = (String) it2.next();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str3);
            k kVarLJJIIZ = nVar.LJJIIZ("image_uri");
            if (kVarLJJIIZ != null) {
                strLJIL = kVarLJJIIZ.LJIL();
            }
            sbLIZ.append(strLJIL);
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        roomSticker.screenWidth = C497740JfY.LJIIZILJ();
        roomSticker.screenHeight = C497740JfY.LJIILLIIL();
        k kVarLJJIIZ2 = nVar.LJJIIZ("image_uri");
        if (kVarLJJIIZ2 != null) {
            strLJIL = kVarLJJIIZ2.LJIL();
        }
        roomSticker.image = new ImageModel(strLJIL, arrayList);
        k kVarLJJIIZ3 = nVar.LJJIIZ("type");
        if (kVarLJJIIZ3 != null) {
            iLJIIJJI = kVarLJJIIZ3.LJIIJJI();
        } else {
            iLJIIJJI = 6;
        }
        roomSticker.type = iLJIIJJI;
        if (iLJIIJJI == 4) {
            k kVarLJJIIZ4 = nVar.LJJIIZ("top_left_h");
            int iLJIIJJI6 = 0;
            if (kVarLJJIIZ4 != null) {
                iLJIIJJI2 = kVarLJJIIZ4.LJIIJJI();
            } else {
                iLJIIJJI2 = 0;
            }
            roomSticker.topLeftHeight = iLJIIJJI2;
            k kVarLJJIIZ5 = nVar.LJJIIZ("top_left_w");
            if (kVarLJJIIZ5 != null) {
                iLJIIJJI3 = kVarLJJIIZ5.LJIIJJI();
            } else {
                iLJIIJJI3 = 0;
            }
            roomSticker.topLeftWidth = iLJIIJJI3;
            k kVarLJJIIZ6 = nVar.LJJIIZ("bottom_right_h");
            if (kVarLJJIIZ6 != null) {
                iLJIIJJI4 = kVarLJJIIZ6.LJIIJJI();
            } else {
                iLJIIJJI4 = 0;
            }
            roomSticker.bottomRightHeight = iLJIIJJI4;
            k kVarLJJIIZ7 = nVar.LJJIIZ("bottom_right_w");
            if (kVarLJJIIZ7 != null) {
                iLJIIJJI5 = kVarLJJIIZ7.LJIIJJI();
            } else {
                iLJIIJJI5 = 0;
            }
            roomSticker.bottomRightWidth = iLJIIJJI5;
            k kVarLJJIIZ8 = nVar.LJJIIZ("nine_patch_image_uri");
            if (kVarLJJIIZ8 != null && (strLJIL4 = kVarLJJIIZ8.LJIL()) != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    String str4 = (String) it3.next();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str4);
                    sbLIZ2.append(strLJIL4);
                    arrayList2.add(C2188811AlT.LIZIZ(sbLIZ2));
                }
                roomSticker.ninePatchImage = new ImageModel(strLJIL4, arrayList2);
            }
            k kVarLJJIIZ9 = nVar.LJJIIZ("content_key");
            String str5 = "";
            if (kVarLJJIIZ9 == null || (strLJIL2 = kVarLJJIIZ9.LJIL()) == null) {
                strLJIL2 = "";
            }
            roomSticker.contentKey = strLJIL2;
            k kVarLJJIIZ10 = nVar.LJJIIZ("text_size");
            if (kVarLJJIIZ10 != null) {
                iLJIIJJI6 = kVarLJJIIZ10.LJIIJJI();
            }
            roomSticker.textSize = iLJIIJJI6;
            k kVarLJJIIZ11 = nVar.LJJIIZ("text_color");
            if (kVarLJJIIZ11 != null && (strLJIL3 = kVarLJJIIZ11.LJIL()) != null) {
                str5 = strLJIL3;
            }
            roomSticker.textColor = str5;
        }
        roomSticker.LIZ = str2;
        roomSticker.isFromReward = true;
        return roomSticker;
    }
}
