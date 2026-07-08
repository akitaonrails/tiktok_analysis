package com.bytedance.android.live.effect.navi;

import X.C01GW;
import X.C0IJT;
import X.C0U61;
import X.C0U7C;
import X.C0UA1;
import X.C0UCV;
import X.C0UCW;
import X.C0UCY;
import X.C0UD4;
import X.C0UHE;
import X.C1161920gLG;
import X.C11JF;
import X.C11NZ;
import X.C11S5;
import X.C13LP;
import X.C14KS;
import X.C1701940uOG;
import X.C20337914i1;
import X.C20441214yg;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C452501pT;
import X.C473410IhP;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C766270U4b;
import X.C767530U8x;
import X.C767750U9t;
import X.C767790U9x;
import X.C768350UCb;
import X.C786330Usx;
import X.EnumC767810U9z;
import X.EnumC768840UDy;
import X.InterfaceC766480U4w;
import Y.AObserverS216S0100000_12;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS17S0101000_6;
import Y.AfS107S0300000_12;
import Y.AfS172S0100000_3;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.navi.model.ProfileNaviFeature;
import com.bytedance.android.live.effect.navi.model.ProfileNaviFeatureInfo;
import com.bytedance.android.live.effect.navi.ui.LiveNaviSkinToneContainerDialog;
import com.bytedance.android.livesdk.dataChannel.BroadcastSceneGlobalChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveNaviPrefabEffectNameSetting;
import com.bytedance.android.livesdk.model.LastUsedStickerCacheModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ttlivestreamer.core.effect.EffectImageInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS626S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class NaviAvatarListPresenter implements C0UHE, GenericLifecycleObserver {
    public final DataChannel LL;
    public final Fragment LLILLJJLI;
    public final C0UCY LLILLL;
    public C0UCW LLILZ;
    public final NaviAvatarListViewModel LLILZIL;
    public C0UCV LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public int LLJI;
    public String LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public final Map<String, String> LLJILLL;
    public final Map<String, String> LLJJ;
    public boolean LLJJI;
    public C768350UCb LLJJIII;
    public LiveNaviSkinToneContainerDialog LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final C01GW LLJJIJIL;

    public final void LJ() {
        String unzipPath;
        this.LLJJI = false;
        this.LLJJIII = null;
        Effect value = this.LLILZIL.LLILZ.getValue();
        if (value == null || (unzipPath = value.getUnzipPath()) == null) {
            return;
        }
        this.LLILLL.LIZIZ(unzipPath);
        C20441214yg.LJIIIZ("auto_creation", "remove auto creation effect");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        this.LLJILJILJ = false;
        if (this.LLIZLLLIL) {
            this.LLILZIL.vQ2();
            this.LLIZLLLIL = false;
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        } else if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        this.LLJILJILJ = true;
        this.LLJ = false;
    }

    public final void LIZIZ() {
        LiveEffect liveEffect;
        String str;
        List<C768350UCb> value;
        List<C768350UCb> value2 = this.LLILZIL.LLILLJJLI.getValue();
        if (value2 == null || value2.isEmpty() || !this.LLJILJIL) {
            return;
        }
        C767790U9x.LJIIIIZZ = true;
        if (C767790U9x.LIZIZ == null && (liveEffect = C767790U9x.LIZ) != null) {
            String resourceId = liveEffect.getResourceId();
            LastUsedStickerCacheModel lastUsedStickerCacheModelLIZIZ = InterfaceC766480U4w.LJJJJIZL.LIZIZ();
            LastUsedStickerCacheModel lastUsedStickerCacheModel = lastUsedStickerCacheModelLIZIZ;
            if (!(Intrinsics.LJFF(lastUsedStickerCacheModel.resourceId, resourceId) && lastUsedStickerCacheModel.stickerType == EnumC767810U9z.AVATAR)) {
                lastUsedStickerCacheModelLIZIZ = null;
            }
            LastUsedStickerCacheModel lastUsedStickerCacheModel2 = lastUsedStickerCacheModelLIZIZ;
            if (lastUsedStickerCacheModel2 != null && (str = lastUsedStickerCacheModel2.subResourceId) != null && (value = this.LLILZIL.LLILLJJLI.getValue()) != null) {
                Iterator<C768350UCb> it2 = value.iterator();
                int i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i = -1;
                        break;
                    } else if (Intrinsics.LJFF(it2.next().LIZ, str)) {
                        break;
                    } else {
                        i++;
                    }
                }
                C767790U9x.LJFF = i >= 0 ? i : 0;
            }
        }
        C0UCW c0ucw = this.LLILZ;
        if (c0ucw != null) {
            c0ucw.setSelectedIndex(C767790U9x.LJFF);
        }
        C0UCW c0ucw2 = this.LLILZ;
        if (c0ucw2 != null) {
            c0ucw2.LIZIZ(C767790U9x.LJFF);
        }
        C0UCW c0ucw3 = this.LLILZ;
        if (c0ucw3 != null) {
            int i2 = C767790U9x.LJFF;
            if (C0UCW.LIZ()) {
                RecyclerView recyclerView = c0ucw3.LLILLJJLI;
                if (recyclerView != null) {
                    recyclerView.scrollToPosition(i2);
                }
            } else {
                C473410IhP.LIZIZ(new ARunnableS17S0101000_6(i2, c0ucw3, 14));
            }
        }
        LIZ(C767790U9x.LJFF);
    }

    public final void LIZLLL() {
        LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL;
        String unzipPath;
        Effect value = this.LLILZIL.LLILLL.getValue();
        if (value != null && (unzipPath = value.getUnzipPath()) != null) {
            this.LLJIJIL = unzipPath;
        }
        if (this.LLIZ && C500260Jjc.LJJIIZ(this.LLJIJIL)) {
            C20441214yg.LJIIIZ("LiveNaviAvatar", "send head_prefab message");
            C0UCY c0ucy = this.LLILLL;
            LiveEffect liveEffect = C767790U9x.LIZ;
            c0ucy.sendEffectMsg(66668, 1L, C500260Jjc.LJJJI((liveEffect == null || (stickerSDKExtraLJLJLLL = liveEffect.LJLJLLL()) == null) ? null : Boolean.valueOf(stickerSDKExtraLJLJLLL.isFullBodyAvatar)) ? 1L : 0L, this.LLJIJIL);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("not send message, head_prefab isEntryPointMsgReceived: ");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", headEffectUnzipPath: ");
        sbLIZ.append(this.LLJIJIL);
        C20441214yg.LJ("LiveNaviAvatar", C2188811AlT.LIZIZ(sbLIZ));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        C0UCV c0ucv = this.LLILZLL;
        if (c0ucv != null) {
            c0ucv.LIZJ();
        }
        this.LLILZLL = null;
        this.LLILLJJLI.getLifecycle().removeObserver(this);
        this.LLILLL.LIZJ(this);
    }

    public final void LIZ(int i) {
        List<C768350UCb> value = this.LLILZIL.LLILLJJLI.getValue();
        if (value != null && (!value.isEmpty())) {
            C768350UCb c768350UCb = (C768350UCb) ListProtector.get(value, i);
            boolean zLJFF = Intrinsics.LJFF(c768350UCb, C767790U9x.LIZIZ);
            LIZJ(c768350UCb);
            C767790U9x.LJFF = i;
            if (!zLJFF) {
                this.LLILLL.LJ(this.LL);
            }
        }
    }

    public final void LIZJ(C768350UCb c768350UCb) {
        String strLJJLIIIJ;
        ProfileNaviFeatureInfo profileNaviFeatureInfo;
        NaviAvatarListViewModel naviAvatarListViewModel = this.LLILZIL;
        C0UCY c0ucy = this.LLILLL;
        Map<String, String> value = naviAvatarListViewModel.LLILZIL.getValue();
        if (value == null) {
            value = C2097608Jq.LJ();
        }
        C0UCV c0ucv = new C0UCV(naviAvatarListViewModel, c0ucy, value);
        LiveEffect liveEffect = C767790U9x.LIZ;
        if (liveEffect != null) {
            String resourceId = liveEffect.getResourceId();
            String str = c768350UCb.LIZ;
            if (str == null) {
                str = "";
            }
            if (C500260Jjc.LJJ()) {
                C20337914i1<LastUsedStickerCacheModel> c20337914i1 = InterfaceC766480U4w.LJJJJIZL;
                if (Intrinsics.LJFF(resourceId, c20337914i1.LIZIZ().resourceId)) {
                    c20337914i1.LIZIZ().subResourceId = str;
                    C767750U9t.LJFF();
                }
            }
        }
        AwS378S0200000_12 awS378S0200000_12 = new AwS378S0200000_12(this, c0ucv, 7);
        if (c0ucv.LJ != null) {
            C20441214yg.LJIIIZ("LiveNaviAvatar", "NaviEffectLoader load() method can only be called once. ");
            return;
        }
        if (c0ucv.LJFF) {
            return;
        }
        C767790U9x.LIZIZ = c768350UCb;
        c0ucv.LJ = c768350UCb;
        Map<C768350UCb, Pair<List<ProfileNaviFeatureInfo>, List<Effect>>> map = C767790U9x.LIZJ;
        if (map.containsKey(c768350UCb)) {
            Pair pair = (Pair) ((LinkedHashMap) map).get(c768350UCb);
            if (pair == null) {
                return;
            }
            awS378S0200000_12.invoke(Boolean.TRUE);
            c0ucv.LIZ((List) pair.getFirst(), (List) pair.getSecond());
            return;
        }
        List<ProfileNaviFeature> list = c768350UCb.LIZIZ;
        if (list == null || list.isEmpty()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("features: ");
        if (list != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(list, null, null, null, 0, null, null, 63);
        } else {
            strLJJLIIIJ = null;
        }
        sbLIZ.append(strLJJLIIIJ);
        C20441214yg.LJIIIZ("LiveNaviAvatar", C2188811AlT.LIZIZ(sbLIZ));
        ArrayList arrayList = new ArrayList();
        for (ProfileNaviFeature profileNaviFeature : list) {
            try {
                profileNaviFeatureInfo = (ProfileNaviFeatureInfo) c0ucv.LIZLLL.LJII(profileNaviFeature.info, ProfileNaviFeatureInfo.class);
                String str2 = profileNaviFeatureInfo.effectId;
                if (str2 == null || str2.length() == 0) {
                    profileNaviFeatureInfo.setEffectId(c0ucv.LIZJ.get(profileNaviFeatureInfo.stickerId));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(e);
                sbLIZ2.append(", ");
                sbLIZ2.append(profileNaviFeature.info);
                C20441214yg.LJ("LiveNaviAvatar", C2188811AlT.LIZIZ(sbLIZ2));
                profileNaviFeatureInfo = new ProfileNaviFeatureInfo(null, null, null, null, null, null);
            }
            arrayList.add(profileNaviFeatureInfo);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str3 = ((ProfileNaviFeatureInfo) it2.next()).stickerId;
            if (str3 != null) {
                arrayList2.add(str3);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((String) obj).length() > 0) {
                arrayList3.add(obj);
            }
        }
        if (arrayList3.isEmpty()) {
            awS378S0200000_12.invoke(Boolean.FALSE);
            C20441214yg.LJ("LiveNaviAvatar", "stickerIds is empty, just return");
        } else {
            c0ucv.LJI = (C11JF) C11NZ.LJIJJLI(new C786330Usx(c0ucv, arrayList3, 2)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS107S0300000_12(arrayList, c0ucv, awS378S0200000_12, 4), new AfS172S0100000_3((Object) awS378S0200000_12, 47));
        }
    }

    public final void LJFF(LiveEffect liveEffect) {
        Boolean boolValueOf = null;
        if (!Intrinsics.LJFF(C767790U9x.LIZ, liveEffect)) {
            C767790U9x.LIZIZ = null;
            ((LinkedHashMap) C767790U9x.LIZJ).clear();
            C767790U9x.LJFF = 0;
            C767790U9x.LJIIIIZZ = false;
            C767790U9x.LIZ = liveEffect.LLJZIJLIL();
        }
        C0UCW c0ucw = this.LLILZ;
        if (c0ucw != null) {
            if (C0UCW.LIZ()) {
                c0ucw.getNaviAdapter().LLLI(new ArrayList());
            } else {
                C473410IhP.LIZIZ(new ARunnableS112S0100000_12(c0ucw, 360));
            }
        }
        this.LLILZIL.vQ2();
        LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL = liveEffect.LJLJLLL();
        if (stickerSDKExtraLJLJLLL != null) {
            boolValueOf = Boolean.valueOf(stickerSDKExtraLJLJLLL.hasAvatarHead);
        }
        if (C500260Jjc.LJJIFFI(boolValueOf) && this.LLILZIL.LLILLL.getValue() == null) {
            this.LLJ = true;
            NaviAvatarListViewModel naviAvatarListViewModel = this.LLILZIL;
            naviAvatarListViewModel.getClass();
            naviAvatarListViewModel.wQ2(LiveNaviPrefabEffectNameSetting.INSTANCE.getValue());
        }
    }

    public NaviAvatarListPresenter(DataChannel dataChannel, Fragment fragment, C0UCY c0ucy) {
        this.LL = dataChannel;
        this.LLILLJJLI = fragment;
        this.LLILLL = c0ucy;
        NaviAvatarListViewModel naviAvatarListViewModel = (NaviAvatarListViewModel) C0U61.LIZ(new C767530U8x(null, null)).get(NaviAvatarListViewModel.class);
        this.LLILZIL = naviAvatarListViewModel;
        this.LLJI = -1;
        this.LLJIJIL = "";
        this.LLJILLL = new LinkedHashMap();
        this.LLJJ = new LinkedHashMap();
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 56));
        fragment.getLifecycle().addObserver(this);
        c0ucy.LIZ(this);
        naviAvatarListViewModel.LLILLJJLI.observe(this.LLILLJJLI, new AObserverS216S0100000_12(this, 7));
        naviAvatarListViewModel.LLILLL.observe(this.LLILLJJLI, new AObserverS216S0100000_12(this, 8));
        naviAvatarListViewModel.LLILZ.observe(this.LLILLJJLI, new AObserverS216S0100000_12(this, 9));
        naviAvatarListViewModel.LLIZ.observe(this.LLILLJJLI, new AObserverS216S0100000_12(this, 10));
    }

    @Override // X.C0UHE
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (this.LLJILJILJ) {
            return;
        }
        if (i != 17) {
            if (i != 69) {
                if (i != 66640) {
                    if (i != 66674) {
                        if (i != 66676) {
                            if (i != 8193) {
                                if (i == 8194) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(i);
                                    sbLIZ.append(' ');
                                    sbLIZ.append(i2);
                                    sbLIZ.append(' ');
                                    sbLIZ.append(i3);
                                    sbLIZ.append(' ');
                                    sbLIZ.append(str);
                                    C20441214yg.LJIIIZ("LiveNaviAvatar", C2188811AlT.LIZIZ(sbLIZ));
                                    if (str == null) {
                                        return;
                                    }
                                    try {
                                        JSONObject jSONObject = new JSONObject(str);
                                        String strOptString = jSONObject.optString("res", "");
                                        String str2 = (String) C13LP.LJJLIIIJL(a0.LJJLIIIJILLIZJL(strOptString, new String[]{"/"}, 0, 6));
                                        if (str2 != null) {
                                            this.LLJILLL.put(str2, jSONObject.optString("resType", ""));
                                            this.LLJJ.put(str2, strOptString);
                                            this.LLILZIL.wQ2(str2);
                                            return;
                                        }
                                        return;
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("json parse error, ");
                                        sbLIZ2.append(e.getMessage());
                                        C20441214yg.LJ("LiveNaviAvatar", C2188811AlT.LIZIZ(sbLIZ2));
                                        return;
                                    }
                                }
                                return;
                            }
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("receive Auto-Creation executed message(");
                            sbLIZ3.append(i);
                            sbLIZ3.append(' ');
                            sbLIZ3.append(i2);
                            sbLIZ3.append(' ');
                            sbLIZ3.append(i3);
                            sbLIZ3.append(' ');
                            sbLIZ3.append(str);
                            sbLIZ3.append(')');
                            C20441214yg.LJIIIZ("auto_creation", C2188811AlT.LIZIZ(sbLIZ3));
                            if (i2 == 20) {
                                C766270U4b.LIZLLL(2131842543);
                                LJ();
                                C0UCW c0ucw = this.LLILZ;
                                if (c0ucw != null) {
                                    c0ucw.setSelectedIndex(C767790U9x.LJFF);
                                }
                                this.LLILLL.sendEffectMsg(66642, 0L, 1L, "");
                                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_avatar_effect_auto_detection_result");
                                c474500IjALIZ.LJIJJLI(this.LL);
                                c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C500260Jjc.LJIIZILJ(this.LL))) ? 1 : 0), "is_anchor");
                                c474500IjALIZ.LJJII(0, "is_success");
                                c474500IjALIZ.LIZ();
                                return;
                            }
                            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).onNaviMessageReceived(i, i2, i3, str, new AwS591S0100000_12(this, 90), AFwS245S0000000_12.get$arr$(22));
                            return;
                        }
                        LiveEffect liveEffect = C767790U9x.LIZ;
                        if (liveEffect != null) {
                            C767790U9x.LJ.put(Long.valueOf(liveEffect.getEffectId()), str);
                            return;
                        }
                        return;
                    }
                    LiveEffect liveEffect2 = C767790U9x.LIZ;
                    if (liveEffect2 != null) {
                        C767790U9x.LIZLLL.put(Long.valueOf(liveEffect2.getEffectId()), Integer.valueOf(i2));
                        return;
                    }
                    return;
                }
                if (Intrinsics.LJFF(str, "avatar_load")) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("receive the confirm message(");
                    sbLIZ4.append(i);
                    sbLIZ4.append(' ');
                    sbLIZ4.append(i2);
                    sbLIZ4.append(' ');
                    sbLIZ4.append(i3);
                    sbLIZ4.append(' ');
                    sbLIZ4.append(str);
                    sbLIZ4.append(')');
                    C20441214yg.LJIIIZ("LiveNaviAvatar", C2188811AlT.LIZIZ(sbLIZ4));
                    this.LLJ = false;
                    if (this.LLJI != -1) {
                        if (this.LLILZIL.LLILLJJLI.getValue() != null) {
                            this.LLJ = true;
                            LIZ(this.LLJI);
                        }
                        this.LLJI = -1;
                    }
                    if (this.LLJJI && this.LLJJIII != null) {
                        this.LLILLL.sendEffectMsg(66641, 0L, 0L, "671,671");
                        C20441214yg.LJIIIZ("auto_creation", "send 66641 message");
                        return;
                    }
                    return;
                }
                return;
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("receive capture finish message(");
            sbLIZ5.append(i);
            sbLIZ5.append(' ');
            sbLIZ5.append(i2);
            sbLIZ5.append(' ');
            sbLIZ5.append(i3);
            sbLIZ5.append(' ');
            sbLIZ5.append(str);
            sbLIZ5.append(')');
            C20441214yg.LJIIIZ("auto_creation", C2188811AlT.LIZIZ(sbLIZ5));
            EffectImageInfo effectImageInfoLIZLLL = this.LLILLL.LIZLLL();
            if (effectImageInfoLIZLLL != null) {
                C20441214yg.LJIIIZ("auto_creation", "getEffectCapturedImageWithKey");
                Context context = this.LLILLJJLI.getContext();
                if (context != null) {
                    C20441214yg.LJIIIZ("auto_creation", "start uploadNaviAsset");
                    IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(effectImageInfoLIZLLL.getWidth(), effectImageInfoLIZLLL.getHeight(), Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap.copyPixelsFromBuffer(effectImageInfoLIZLLL.getImageBuffer());
                    iHostAction.uploadNaviAsset(context, bitmapCreateBitmap, new AwS626S0100000_12(this, 5));
                    return;
                }
                C20441214yg.LJ("auto_creation", "fragment.context == null");
                return;
            }
            C20441214yg.LJ("auto_creation", "getEffectCapturedImageWithKey == null");
            return;
        }
        if (i2 == 3) {
            if (Intrinsics.LJFF(str, "entry_point")) {
                if (!this.LLIZ && !this.LLJJI) {
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("receive message(");
                    sbLIZ6.append(i);
                    sbLIZ6.append(' ');
                    sbLIZ6.append(i2);
                    sbLIZ6.append(' ');
                    sbLIZ6.append(i3);
                    sbLIZ6.append(' ');
                    sbLIZ6.append(str);
                    sbLIZ6.append(')');
                    C20441214yg.LJIIIZ("LiveNaviAvatar", C2188811AlT.LIZIZ(sbLIZ6));
                    if (C500260Jjc.LJJIJLIJ() && !this.LLJ) {
                        Object objLJJJLL = C13LP.LJJJLL(C0UA1.LIZ().qr(C0UD4.LIZIZ));
                        if (!C0U7C.LJIILLIIL((LiveEffect) objLJJJLL)) {
                            objLJJJLL = null;
                        }
                        LiveEffect liveEffect3 = (LiveEffect) objLJJJLL;
                        if (liveEffect3 != null) {
                            LJFF(liveEffect3);
                        }
                    }
                    this.LLIZ = true;
                    Context context2 = this.LLILLJJLI.getContext();
                    if (context2 != null) {
                        int iLJ = C14KS.LJ(context2);
                        if (DataChannelGlobal.LLILZ.gg0(BroadcastSceneGlobalChannel.class) == EnumC768840UDy.PREVIEW) {
                            iLJ += C497740JfY.LJIJ();
                        }
                        C0UCY c0ucy = this.LLILLL;
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append(C14KS.LJI(context2));
                        sbLIZ7.append(',');
                        sbLIZ7.append(iLJ);
                        c0ucy.sendEffectMsg(66675, 0L, 0L, C2188811AlT.LIZIZ(sbLIZ7));
                    }
                    LiveEffect liveEffect4 = C767790U9x.LIZ;
                    if (liveEffect4 != null) {
                        Integer num = (Integer) ((LinkedHashMap) C767790U9x.LIZLLL).get(Long.valueOf(liveEffect4.getEffectId()));
                        if (num != null) {
                            long jIntValue = num.intValue();
                            this.LLILLL.sendEffectMsg(66674, jIntValue, 0L, "");
                            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                            sbLIZ8.append("send 66674 message, backgroundPosition: ");
                            sbLIZ8.append(jIntValue);
                            C20441214yg.LJIIIZ("LiveNaviAvatar", C2188811AlT.LIZIZ(sbLIZ8));
                        }
                        String str3 = (String) ((LinkedHashMap) C767790U9x.LJ).get(Long.valueOf(liveEffect4.getEffectId()));
                        if (str3 != null) {
                            this.LLILLL.sendEffectMsg(66676, 0L, 0L, str3);
                            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                            sbLIZ9.append("send 66676 message, transformValue: ");
                            sbLIZ9.append(str3);
                            C20441214yg.LJIIIZ("LiveNaviAvatar", C2188811AlT.LIZIZ(sbLIZ9));
                        }
                    }
                    LIZLLL();
                    return;
                }
                return;
            }
            if (Intrinsics.LJFF(str, "navi_creation")) {
                this.LLILLL.sendEffectMsg(66672, 1L, 0L, "");
                this.LLILLL.sendEffectMsg(66673, 1L, 0L, "");
                C0UCW c0ucw2 = this.LLILZ;
                if (c0ucw2 != null) {
                    c0ucw2.setSelectedIndex(-1);
                }
                C0UCW c0ucw3 = this.LLILZ;
                if (c0ucw3 != null) {
                    c0ucw3.LIZIZ(-1);
                }
                this.LLILLL.sendEffectMsg(66642, 1L, 0L, "");
                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                sbLIZ10.append("receive Auto-Creation loaded message(");
                sbLIZ10.append(i);
                sbLIZ10.append(' ');
                sbLIZ10.append(i2);
                sbLIZ10.append(' ');
                sbLIZ10.append(i3);
                sbLIZ10.append(' ');
                sbLIZ10.append(str);
                sbLIZ10.append(')');
                C20441214yg.LJIIIZ("auto_creation", C2188811AlT.LIZIZ(sbLIZ10));
                return;
            }
            if (Intrinsics.LJFF(str, this.LLJIJIL)) {
                this.LLJILJIL = true;
                this.LLIZ = false;
                StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                sbLIZ11.append("receive head load succeed message(");
                sbLIZ11.append(i);
                sbLIZ11.append(' ');
                sbLIZ11.append(i2);
                sbLIZ11.append(' ');
                sbLIZ11.append(i3);
                sbLIZ11.append(' ');
                sbLIZ11.append(str);
                sbLIZ11.append(')');
                C20441214yg.LJIIIZ("LiveNaviAvatar", C2188811AlT.LIZIZ(sbLIZ11));
                LIZIZ();
            }
        }
    }
}
