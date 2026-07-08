package com.bytedance.android.live.effect.navi;

import X.C0U90;
import X.C0U92;
import X.C0U94;
import X.C766720U5u;
import X.C768350UCb;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.effect.navi.NaviAvatarListViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveNaviPanelNameSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveNaviPrefabEffectNameSetting;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class NaviAvatarListViewModel extends ViewModel {
    public final C0U94 LL;
    public final MutableLiveData<List<C768350UCb>> LLILLJJLI = new MutableLiveData<>();
    public final MutableLiveData<Effect> LLILLL = new MutableLiveData<>();
    public final MutableLiveData<Effect> LLILZ = new MutableLiveData<>();
    public final MutableLiveData<Map<String, String>> LLILZIL = new MutableLiveData<>();
    public final MutableLiveData<List<Effect>> LLILZLL = new MutableLiveData<>();
    public final MutableLiveData<C0U92> LLIZ = new MutableLiveData<>();
    public final List<Effect> LLIZLLLIL = new ArrayList();
    public final C0U90 LLJ = new C0U90(this);

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vQ2() {
        /*
            r6 = this;
            androidx.lifecycle.MutableLiveData<java.util.List<X.0UCb>> r0 = r6.LLILLJJLI
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto Ld
            r0.clear()
        Ld:
            X.0U94 r0 = r6.LL
            X.01GW r0 = r0.LIZ
            java.lang.Object r5 = r0.getValue()
            com.bytedance.android.live.effect.navi.service.NaviAvatarApi r5 = (com.bytedance.android.live.effect.navi.service.NaviAvatarApi) r5
            if (r5 == 0) goto L57
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = X.C767790U9x.LIZ
            r4 = 0
            if (r0 == 0) goto L7a
            com.bytedance.android.livesdkapi.depend.model.LiveEffect$StickerSDKExtra r0 = r0.LJLJLLL()
            if (r0 == 0) goto L7a
            boolean r0 = r0.isFullBodyAvatar
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L2a:
            boolean r2 = X.C500260Jjc.LJJJI(r0)
            r1 = 0
            r0 = 20
            X.11NZ r3 = r5.getNaviList(r1, r0, r2)
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = X.C767790U9x.LIZ
            if (r0 == 0) goto L45
            com.bytedance.android.livesdkapi.depend.model.LiveEffect$StickerSDKExtra r0 = r0.LJLJLLL()
            if (r0 == 0) goto L45
            boolean r0 = r0.isFullBodyAvatar
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        L45:
            boolean r2 = X.C500260Jjc.LJJJI(r4)
            r1 = 3
            r0 = 1
            X.11NZ r1 = r5.getCandidateList(r0, r1, r2)
            X.0UCa<T1, T2, R> r0 = new X.InterfaceC500500Jk0() { // from class: X.0UCa
                static {
                    /*
                        X.0UCa r0 = new X.0UCa
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0UCa<T1, T2, R>) X.0UCa.LIZ X.0UCa
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C768340UCa.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C768340UCa.<init>():void");
                }

                @Override // X.InterfaceC500500Jk0
                public final java.lang.Object apply(java.lang.Object r6, java.lang.Object r7) {
                    /*
                        r5 = this;
                        com.bytedance.android.live.effect.navi.model.ProfileNaviListResponse r6 = (com.bytedance.android.live.effect.navi.model.ProfileNaviListResponse) r6
                        com.bytedance.android.live.effect.navi.model.ProfileNaviCandidatesResponse r7 = (com.bytedance.android.live.effect.navi.model.ProfileNaviCandidatesResponse) r7
                        java.util.ArrayList r4 = new java.util.ArrayList
                        r4.<init>()
                        java.util.List<com.bytedance.android.live.effect.navi.model.ProfileNaviCustom> r1 = r6.naviList
                        if (r1 != 0) goto Lf
                        X.13BV r1 = X.C13BV.INSTANCE
                    Lf:
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r3 = 10
                        int r0 = X.C15438062q.LJIJJ(r1, r3)
                        r2.<init>(r0)
                        java.util.Iterator r1 = r1.iterator()
                    L1e:
                        boolean r0 = r1.hasNext()
                        if (r0 == 0) goto L32
                        java.lang.Object r0 = r1.next()
                        com.bytedance.android.live.effect.navi.model.ProfileNaviCustom r0 = (com.bytedance.android.live.effect.navi.model.ProfileNaviCustom) r0
                        X.0UCb r0 = r0.transformToProfileNavi()
                        r2.add(r0)
                        goto L1e
                    L32:
                        r4.addAll(r2)
                        java.util.List<com.bytedance.android.live.effect.navi.model.ProfileNaviCandidate> r1 = r7.initialNavis
                        if (r1 != 0) goto L3b
                        X.13BV r1 = X.C13BV.INSTANCE
                    L3b:
                        java.util.ArrayList r2 = new java.util.ArrayList
                        int r0 = X.C15438062q.LJIJJ(r1, r3)
                        r2.<init>(r0)
                        java.util.Iterator r1 = r1.iterator()
                    L48:
                        boolean r0 = r1.hasNext()
                        if (r0 == 0) goto L5c
                        java.lang.Object r0 = r1.next()
                        com.bytedance.android.live.effect.navi.model.ProfileNaviCandidate r0 = (com.bytedance.android.live.effect.navi.model.ProfileNaviCandidate) r0
                        X.0UCb r0 = r0.transformCandidateNavi()
                        r2.add(r0)
                        goto L48
                    L5c:
                        r4.addAll(r2)
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C768340UCa.apply(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }
            X.11NZ r1 = X.C11NZ.LJLLILLLL(r3, r1, r0)
            if (r1 != 0) goto L5d
        L57:
            X.087G<T> r0 = new X.InterfaceC1478005qU() { // from class: X.087G
                static {
                    /*
                        X.087G r0 = new X.087G
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.087G<T>) X.087G.LIZ X.087G
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C087G.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C087G.<init>():void");
                }

                @Override // X.InterfaceC1478005qU
                public final void subscribe(X.C09AJ<java.util.List<X.C768350UCb>> r3) {
                    /*
                        r2 = this;
                        java.lang.String r1 = "NaviAvatarRepository@f4fd.fetchAvatars$2$1"
                        X.C1C7U.LIZ(r1)
                        java.util.ArrayList r0 = new java.util.ArrayList
                        r0.<init>()
                        X.C1C7U.LIZIZ(r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C087G.subscribe(X.09AJ):void");
                }
            }
            X.11Kf r1 = X.C11NZ.LJIJJLI(r0)
        L5d:
            X.11RO r0 = X.C11S5.LIZ()
            X.11Hw r1 = r1.LJL(r0)
            X.11RO r0 = X.C1701940uOG.LIZIZ()
            X.11O8 r2 = r1.LJJJLZIJ(r0)
            Y.AfS181S0100000_12 r1 = new Y.AfS181S0100000_12
            r0 = 205(0xcd, float:2.87E-43)
            r1.<init>(r6, r0)
            X.07xT<T> r0 = new X.C09JN() { // from class: X.07xT
                static {
                    /*
                        X.07xT r0 = new X.07xT
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.07xT<T>) X.07xT.LL X.07xT
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C2030907xT.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C2030907xT.<init>():void");
                }

                @Override // X.C09JN
                public final void accept(java.lang.Object r4) {
                    /*
                        r3 = this;
                        java.lang.String r2 = "NaviAvatarListViewModel@600.fetchAvatars$2"
                        X.C1C7U.LIZ(r2)
                        java.lang.Throwable r4 = (java.lang.Throwable) r4
                        java.lang.String r1 = "LiveNaviAvatar"
                        java.lang.String r0 = "error fetching live avatars"
                        X.C20441214yg.LJFF(r1, r0, r4)
                        X.C1C7U.LIZIZ(r2)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C2030907xT.accept(java.lang.Object):void");
                }
            }
            r2.LJJLL(r1, r0)
            return
        L7a:
            r0 = r4
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.navi.NaviAvatarListViewModel.vQ2():void");
    }

    public NaviAvatarListViewModel(C0U94 c0u94) {
        this.LL = c0u94;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0U91] */
    public final void wQ2(final String str) {
        C766720U5u c766720U5u = C766720U5u.LIZ;
        final String value = LiveNaviPanelNameSetting.INSTANCE.getValue();
        final ?? r2 = new IFetchEffectChannelListener() { // from class: X.0U91
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult) {
                C20441214yg.LJFF("LiveNaviAvatar", "fetch effects error", new Exception("Cannot fetch panel info"));
                this.LIZ.xQ2(new C0U92(null, str));
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                EffectCategoryResponse next;
                List<Effect> totalEffects;
                EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                if (effectChannelResponse2 != null) {
                    List<Effect> value2 = this.LIZ.LLILZLL.getValue();
                    if (value2 == null || value2.isEmpty()) {
                        Iterator<EffectCategoryResponse> it2 = effectChannelResponse2.getCategoryResponseList().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (Intrinsics.LJFF(next.getKey(), "skin_tone")) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        EffectCategoryResponse effectCategoryResponse = next;
                        if (effectCategoryResponse != null && (totalEffects = effectCategoryResponse.getTotalEffects()) != null) {
                            NaviAvatarListViewModel naviAvatarListViewModel = this.LIZ;
                            ArrayList arrayList = new ArrayList();
                            arrayList.addAll(totalEffects);
                            naviAvatarListViewModel.LLILZLL.setValue(arrayList);
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    List<Effect> allCategoryEffects = effectChannelResponse2.getAllCategoryEffects();
                    String str2 = str;
                    NaviAvatarListViewModel naviAvatarListViewModel2 = this.LIZ;
                    for (Effect effect : allCategoryEffects) {
                        if (Intrinsics.LJFF(effect.getName(), str2)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("find target effect: ");
                            sbLIZ.append(str2);
                            C20441214yg.LJIIIZ("LiveNaviAvatar", C2188811AlT.LIZIZ(sbLIZ));
                            C766720U5u c766720U5u2 = C766720U5u.LIZ;
                            c766720U5u2.getClass();
                            if (!C766720U5u.LJIIZILJ(effect)) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("start download navi effect: ");
                                sbLIZ2.append(str2);
                                C20441214yg.LJIIIZ("LiveNaviAvatar", C2188811AlT.LIZIZ(sbLIZ2));
                                C0U90 c0u90 = naviAvatarListViewModel2.LLJ;
                                c766720U5u2.getClass();
                                C766720U5u.LJFF(effect, c0u90);
                            } else {
                                naviAvatarListViewModel2.xQ2(new C0U92(effect, str2));
                            }
                        }
                        linkedHashMap.put(effect.getName(), effect.getEffectId());
                    }
                    ((ArrayList) this.LIZ.LLIZLLLIL).clear();
                    ((ArrayList) this.LIZ.LLIZLLLIL).addAll(effectChannelResponse2.getAllCategoryEffects());
                    this.LIZ.LLILZIL.setValue(linkedHashMap);
                }
            }
        };
        c766720U5u.getClass();
        C766720U5u.LJIILL().checkPanelIsUpdate(value, new ICheckChannelListener() { // from class: X.0U93
            @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
            public final void checkChannelFailed(ExceptionResult exceptionResult) {
                C766720U5u.LIZ.getClass();
                C766720U5u.LJIILL().fetchEffectList(value, false, r2);
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
            public final void checkChannelSuccess(boolean z) {
                if (z) {
                    C766720U5u.LIZ.getClass();
                    C766720U5u.LJIILL().fetchEffectList(value, false, r2);
                } else {
                    C766720U5u.LIZ.getClass();
                    C766720U5u.LJIILL().fetchEffectListFromCache(value, r2);
                }
            }
        });
    }

    public final void xQ2(C0U92 c0u92) {
        String str = c0u92.LIZ;
        if (Intrinsics.LJFF(str, LiveNaviPrefabEffectNameSetting.INSTANCE.getValue())) {
            this.LLILLL.setValue(c0u92.LIZIZ);
        } else if (Intrinsics.LJFF(str, "creation_plugin")) {
            this.LLILZ.setValue(c0u92.LIZIZ);
        } else {
            this.LLIZ.setValue(c0u92);
        }
    }
}
