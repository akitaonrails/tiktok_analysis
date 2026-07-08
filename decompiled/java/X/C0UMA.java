package X;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectNewEffectReverseSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectNewEffectReverseTimeSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList;
import com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList;
import com.ss.android.ugc.effectmanager.effect.listener.INothingListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0UMA, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UMA extends C0UMD {
    public static final /* synthetic */ int LJIILJJIL = 0;
    public final String LIZIZ;
    public final EffectManager LIZJ = ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).LLJILJILJ();
    public final C0UDQ LIZLLL = new C0UDQ();
    public final CopyOnWriteArrayList<C0U74<LiveEffect>> LJ = new CopyOnWriteArrayList<>();
    public transient List<C0UBH> LJFF = new ArrayList();
    public final ConcurrentHashMap<String, List<LiveEffect>> LJI = new ConcurrentHashMap<>();
    public C0U74<LiveEffect> LJII = new C0U74<>("favorite", "favorite", null, null, null, new ArrayList(), null, 248);
    public C0U74<LiveEffect> LJIIIIZZ = new C0U74<>(C0UD4.LJIIL, "Recents", null, null, null, new ArrayList(), null, 248);
    public final C098J<String, LiveEffect> LJIIIZ = new C098J<>(16);
    public final ConcurrentHashMap<String, List<LiveEffect>> LJIIJ = new ConcurrentHashMap<>();
    public final C098J<String, LiveEffect> LJIIJJI = new C098J<>(16);
    public final C01GW LJIIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(30));
    public volatile boolean LJIILIIL;

    @Override // X.InterfaceC401501hF
    public final InterfaceC396201gO<C0U74<LiveEffect>> LJJIJL() {
        return this;
    }

    @Override // X.InterfaceC401501hF
    public final void clearCache() {
        Iterator<C0U74<LiveEffect>> it2 = this.LJ.iterator();
        while (it2.hasNext()) {
            this.LIZJ.clearCache(it2.next().LIZJ);
        }
        this.LJ.clear();
        this.LJI.clear();
    }

    @Override // X.InterfaceC401501hF
    public final boolean LJIIL() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC401501hF
    public final String LJIJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC401501hF
    public final Object LJJIJIL() {
        return this.LJFF;
    }

    @Override // X.InterfaceC401501hF
    public final C0U74<LiveEffect> LJJJ() {
        return this.LJII;
    }

    @Override // X.InterfaceC401501hF
    public final C0U74<LiveEffect> LJJJI() {
        return this.LJIIIIZZ;
    }

    public C0UMA(String str) {
        this.LIZIZ = str;
    }

    public static final Iterable<LiveEffect> LJJJJJ(Iterable<? extends LiveEffect> iterable) {
        ArrayList arrayList = new ArrayList();
        for (LiveEffect liveEffect : iterable) {
            LiveEffect liveEffect2 = liveEffect;
            LiveEffectNewEffectReverseSetting liveEffectNewEffectReverseSetting = LiveEffectNewEffectReverseSetting.INSTANCE;
            if (!liveEffectNewEffectReverseSetting.enable() || (liveEffectNewEffectReverseSetting.enable() && liveEffect2.LJLLLLLL() < LiveEffectNewEffectReverseTimeSetting.INSTANCE.getValue())) {
                arrayList.add(liveEffect);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super java.util.List<X.C0UBH>> r13) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMA.LIZJ(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC401501hF
    public final Object LIZLLL(InterfaceC1364105Vn<? super List<C0U74<LiveEffect>>> interfaceC1364105Vn) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        if (!this.LJ.isEmpty()) {
            CopyOnWriteArrayList<C0U74<LiveEffect>> copyOnWriteArrayList = this.LJ;
            C189200o6.m2constructorimpl(copyOnWriteArrayList);
            c23260099m.resumeWith(copyOnWriteArrayList);
        } else {
            C13BV c13bv = C13BV.INSTANCE;
            C189200o6.m2constructorimpl(c13bv);
            c23260099m.resumeWith(c13bv);
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    @Override // X.InterfaceC401501hF
    public final C767500U8u LJIIZILJ(String str) {
        C0U74<LiveEffect> next;
        List list;
        Iterator<C0U74<LiveEffect>> it2 = this.LJ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                C0U74<LiveEffect> c0u74 = next;
                if (Intrinsics.LJFF(c0u74.LIZJ, "trending") && Intrinsics.LJFF(c0u74.LJII, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C0U74<LiveEffect> c0u742 = next;
        if (c0u742 == null || (list = c0u742.LIZIZ) == null) {
            list = C13BV.INSTANCE;
        }
        return new C767500U8u("trending", list, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    @Override // X.InterfaceC401501hF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJJ(X.InterfaceC1364105Vn<? super java.util.List<X.C0UBH>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C771090UMp
            if (r0 == 0) goto L3f
            r4 = r6
            X.0UMp r4 = (X.C771090UMp) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r2 = 1
            if (r0 == 0) goto L2b
            if (r0 != r2) goto L45
            X.0UMA r0 = r4.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel r1 = (com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel) r1
            java.util.List r0 = r0.LJJJJL(r1)
            return r0
        L2b:
            X.C155000ia.LIZIZ(r1)
            X.0UDQ r1 = r5.LIZLLL
            java.lang.String r0 = X.C0UD4.LIZIZ
            r4.LL = r5
            r4.LLILZ = r2
            java.lang.Object r1 = r1.LJIIL(r0, r4)
            if (r1 != r3) goto L3d
            return r3
        L3d:
            r0 = r5
            goto L24
        L3f:
            X.0UMp r4 = new X.0UMp
            r4.<init>(r5, r6)
            goto L12
        L45:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMA.LJIJJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    @Override // X.InterfaceC401501hF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJJLI(X.InterfaceC1364105Vn<? super java.util.List<X.C0UBH>> r8) throws org.json.JSONException {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C771100UMq
            if (r0 == 0) goto L4c
            r6 = r8
            X.0UMq r6 = (X.C771100UMq) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4c
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r2 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r4 = 1
            if (r0 == 0) goto L31
            if (r0 != r4) goto L52
            X.0UMA r1 = r6.LL
            X.C155000ia.LIZIZ(r2)
        L24:
            kotlin.Pair r2 = (kotlin.Pair) r2
            java.lang.Object r0 = r2.getFirst()
            com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel r0 = (com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel) r0
            java.util.List r0 = r1.LJJJJL(r0)
            return r0
        L31:
            X.C155000ia.LIZIZ(r2)
            X.0UDQ r3 = r7.LIZLLL
            java.lang.String r2 = X.C0UD4.LIZIZ
            r1 = 0
            java.lang.String r0 = ""
            java.util.Map r0 = LIZIZ(r0, r1)
            r6.LL = r7
            r6.LLILZ = r4
            java.lang.Object r2 = r3.LJIIJJI(r2, r0, r6)
            if (r2 != r5) goto L4a
            return r5
        L4a:
            r1 = r7
            goto L24
        L4c:
            X.0UMq r6 = new X.0UMq
            r6.<init>(r7, r8)
            goto L12
        L52:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMA.LJIJJLI(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC401501hF
    public final void LJIL(LiveEffect liveEffect) {
        String resourceId = liveEffect.getResourceId();
        if (resourceId != null) {
            this.LJIIIZ.put(resourceId, liveEffect);
        }
    }

    @Override // X.InterfaceC401501hF
    public final C767500U8u LJJI(String str) {
        C0U74<LiveEffect> next;
        List list;
        Iterator<C0U74<LiveEffect>> it2 = this.LJ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.LIZJ, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C0U74<LiveEffect> c0u74 = next;
        if (c0u74 == null || (list = c0u74.LIZIZ) == null) {
            list = C13BV.INSTANCE;
        }
        return new C767500U8u(str, list, 8);
    }

    @Override // X.InterfaceC401501hF
    public final LiveEffect LJJIIZI(String str) {
        Object next;
        ConcurrentHashMap<String, List<LiveEffect>> concurrentHashMap = this.LJI;
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        Iterator<Map.Entry<String, List<LiveEffect>>> it2 = concurrentHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getValue());
        }
        Iterator it3 = C15438062q.LJIJJLI(arrayList).iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                if (Intrinsics.LJFF(((LiveEffect) next).getResourceId(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        LiveEffect liveEffect = (LiveEffect) next;
        if (liveEffect == null) {
            return this.LJIIJJI.get(str);
        }
        return liveEffect;
    }

    @Override // X.InterfaceC401501hF
    public final Object LJJIJIIJI(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return this.LIZLLL.LIZIZ(this.LIZIZ, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC401501hF
    public final LiveEffect LJJIJLIJ(String str) {
        return this.LJIIIZ.get(str);
    }

    @Override // X.InterfaceC401501hF
    public final Object LJJIL(InterfaceC1364105Vn<? super List<C0UBH>> interfaceC1364105Vn) {
        return LIZJ(interfaceC1364105Vn);
    }

    public final List<C0UBH> LJJJJL(PanelInfoModel panelInfoModel) {
        List<EffectCategoryModel> categoryList;
        ArrayList arrayList = new ArrayList();
        C0UBH c0ubh = null;
        if (panelInfoModel != null && (categoryList = panelInfoModel.getCategoryList()) != null) {
            for (EffectCategoryModel effectCategoryModel : categoryList) {
                if (Intrinsics.LJFF(effectCategoryModel.getKey().toLowerCase(Locale.ROOT), "trending")) {
                    c0ubh = new C0UBH(effectCategoryModel.getName(), effectCategoryModel.getKey(), false);
                } else {
                    arrayList.add(new C0UBH(effectCategoryModel.getName(), effectCategoryModel.getKey(), false));
                }
            }
            if (c0ubh != null) {
                ListProtector.add(arrayList, 0, c0ubh);
            }
        }
        this.LJFF = arrayList;
        return arrayList;
    }

    public static final Map<String, String> LIZIZ(String str, Map<String, String> map) throws JSONException {
        int i;
        Long lValueOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("from", Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C500260Jjc.LJJIJLIJ())) ? 1 : 0));
        jSONObject.putOpt(Scene.SCENE_SERVICE, ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene());
        if (!C500260Jjc.LJJIJLIJ() && !C500260Jjc.LJIL()) {
            i = 1;
        } else {
            i = 0;
        }
        jSONObject.putOpt("role", Integer.valueOf(i));
        C1276840jKc.LIZ.getClass();
        jSONObject.putOpt("number_of_audience", Integer.valueOf(C1276840jKc.LJIIZILJ));
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        Object objValueOf = null;
        if (room != null) {
            objValueOf = Long.valueOf(room.getId());
        }
        jSONObject.putOpt("room_id", objValueOf);
        jSONObject.putOpt("recommend_scene", str);
        Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room2 != null && (lValueOf = Long.valueOf(room2.getCreateTime())) != null) {
            jSONObject.putOpt("live_duration_seconds", Long.valueOf((C158B.LIZ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - lValueOf.longValue()));
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt("effect_recommend", C786410Ut5.J3(jSONObject));
        linkedHashMap.put("extra", C786410Ut5.J3(jSONObject2));
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        return linkedHashMap;
    }

    public static void LJJJJLI(LiveEffect liveEffect, List list) {
        String str;
        File file = null;
        if (list != null && (str = (String) C13LP.LJJJLL(list)) != null && liveEffect.LJJIJIL().length() != 0) {
            C207209166l c207209166lLIZ = C0UGA.LIZ(liveEffect, str);
            C0VSJ c0vsj = new C0VSJ(C771370UNr.LIZJ(c207209166lLIZ));
            File[] fileArrListFiles = c0vsj.listFiles();
            if (fileArrListFiles == null || (file = (File) C13LQ.LJJIFFI(fileArrListFiles)) == null || !Intrinsics.LJFF(file.getName(), liveEffect.LJJIJIL())) {
                C0UNC.LIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("quizFileConfig=");
                sbLIZ.append(c207209166lLIZ);
                sbLIZ.append(" quizFile=");
                sbLIZ.append(file);
                sbLIZ.append(" quizFileDir=");
                sbLIZ.append(c0vsj);
                C0UND.LIZ("#DownloadQuizResource", C2188811AlT.LIZIZ(sbLIZ));
                if (file != null) {
                    file.delete();
                }
                C207232167i.LIZIZ(c207209166lLIZ, AFwS245S0000000_12.get$arr$(265));
            }
        }
    }

    @Override // X.InterfaceC401501hF
    public final Object LJ(Map<String, String> map, InterfaceC1364105Vn<? super C0U74<LiveEffect>> interfaceC1364105Vn) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        final long jCurrentTimeMillis = System.currentTimeMillis();
        this.LIZJ.fetchRecentUsedEffect(this.LIZIZ, map, new IFetchFavoriteList() { // from class: X.0U8c
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList
            public final void onFailed(ExceptionResult exceptionResult) {
                String msg;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                C0UC4 c0uc4 = C0UC4.LIZ;
                Integer numValueOf = null;
                if (exceptionResult != null) {
                    numValueOf = Integer.valueOf(exceptionResult.getErrorCode());
                    msg = exceptionResult.getMsg();
                } else {
                    msg = null;
                }
                C0UC4 c0uc42 = C0UC4.LIZ;
                C0UC4.LJJIIJZLJL(2, 0, jCurrentTimeMillis2, numValueOf, "Recents", msg);
                InterfaceC1364105Vn<C0U74<LiveEffect>> interfaceC1364105Vn2 = c23260099m;
                C0U74<LiveEffect> c0u74 = this.LJIIIIZZ;
                C0U74 c0u742 = new C0U74(c0u74.LIZ, c0u74.LIZJ, null, null, null, C13BV.INSTANCE, null, 248);
                C189200o6.m2constructorimpl(c0u742);
                interfaceC1364105Vn2.resumeWith(c0u742);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(FetchFavoriteListResponse fetchFavoriteListResponse) {
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                C0U7G c0u7g = new C0U7G(this.LIZIZ);
                C0U74<LiveEffect> c0u74LIZ = new C767340U8e("Recents", "Recents").LIZ(fetchFavoriteListResponse);
                c0u7g.LIZ(c0u74LIZ);
                C0UC4 c0uc4 = C0UC4.LIZ;
                C0UC4.LJJIIJZLJL(1, c0u74LIZ.LIZIZ.size(), jCurrentTimeMillis2, -1, "Recents", "");
                C0UMA c0uma = this;
                C0U74<LiveEffect> c0u74 = c0uma.LJIIIIZZ;
                c0uma.LJIIIIZZ = new C0U74<>(c0u74.LIZ, c0u74.LIZJ, null, null, null, c0u74LIZ.LIZIZ, null, 248);
                InterfaceC1364105Vn<C0U74<LiveEffect>> interfaceC1364105Vn2 = c23260099m;
                C0U74<LiveEffect> c0u742 = this.LJIIIIZZ;
                C189200o6.m2constructorimpl(c0u742);
                interfaceC1364105Vn2.resumeWith(c0u742);
            }
        });
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r0 != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    @Override // X.InterfaceC401501hF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.lang.String r7, X.InterfaceC1364105Vn r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C771030UMj
            if (r0 == 0) goto L5f
            r5 = r8
            X.0UMj r5 = (X.C771030UMj) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5f
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L3b
            if (r0 != r3) goto L65
            java.lang.Object r7 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L25:
            X.0UMl r1 = (X.C771050UMl) r1
            T r0 = r1.LIZIZ
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L31
            java.lang.Object r2 = r0.get(r7)
        L31:
            E r0 = r1.LIZ
            r1 = r2
            r2 = r0
        L35:
            X.0UMl r0 = new X.0UMl
            r0.<init>(r2, r1)
            return r0
        L3b:
            X.C155000ia.LIZIZ(r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<com.bytedance.android.livesdkapi.depend.model.LiveEffect>> r0 = r6.LJIIJ
            java.lang.Object r1 = r0.get(r7)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L4e
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L35
        L4e:
            X.0UDQ r1 = r6.LIZLLL
            java.util.List r0 = java.util.Collections.singletonList(r7)
            r5.LL = r7
            r5.LLILZ = r3
            java.lang.Object r1 = r1.LJIIJ(r0, r5)
            if (r1 != r4) goto L25
            return r4
        L5f:
            X.0UMj r5 = new X.0UMj
            r5.<init>(r6, r8)
            goto L12
        L65:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMA.LJFF(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    @Override // X.InterfaceC401501hF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(java.util.List<java.lang.String> r9, X.InterfaceC1364105Vn<? super java.util.List<? extends com.bytedance.android.livesdkapi.depend.model.LiveEffect>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C0UMN
            if (r0 == 0) goto L72
            r7 = r10
            X.0UMN r7 = (X.C0UMN) r7
            int r2 = r7.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L72
            int r2 = r2 - r1
            r7.LLILZIL = r2
        L12:
            java.lang.Object r1 = r7.LLILLL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILZIL
            r4 = 1
            if (r0 == 0) goto L4e
            if (r0 != r4) goto Laa
            java.lang.Object r5 = r7.LLILLJJLI
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r9 = r7.LL
            java.util.List r9 = (java.util.List) r9
            X.C155000ia.LIZIZ(r1)
        L2a:
            kotlin.Pair r1 = (kotlin.Pair) r1
            if (r1 == 0) goto L78
            java.lang.Object r0 = r1.getFirst()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L78
            java.util.Iterator r1 = r0.iterator()
        L3a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L78
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r0
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = X.C0UEO.LIZLLL(r0)
            r5.add(r0)
            goto L3a
        L4e:
            X.C155000ia.LIZIZ(r1)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            X.0UDQ r3 = r8.LIZLLL
            java.lang.String r2 = r8.LIZIZ
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "panel"
            r1.<init>(r0, r2)
            java.util.Map r0 = X.C2097908Jt.LIZJ(r1)
            r7.LL = r9
            r7.LLILLJJLI = r5
            r7.LLILZIL = r4
            java.lang.Object r1 = r3.LJII(r0, r9, r7)
            if (r1 != r6) goto L2a
            return r6
        L72:
            X.0UMN r7 = new X.0UMN
            r7.<init>(r8, r10)
            goto L12
        L78:
            java.util.Iterator r4 = r9.iterator()
        L7c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto La9
            java.lang.Object r3 = r4.next()
            java.util.Iterator r2 = r5.iterator()
        L8a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r0
            java.lang.String r0 = r0.getResourceId()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            if (r0 == 0) goto L8a
            if (r1 == 0) goto L7c
            X.098J<java.lang.String, com.bytedance.android.livesdkapi.depend.model.LiveEffect> r0 = r8.LJIIJJI
            r0.put(r3, r1)
            goto L7c
        La9:
            return r5
        Laa:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMA.LJIIIIZZ(java.util.List, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC401501hF
    public final C767500U8u LJIIJJI(String str, String str2) {
        return new C767500U8u("", C13BV.INSTANCE, 12);
    }

    @Override // X.InterfaceC401501hF
    public final Object LJIILIIL(String str, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return LJIIJ(str, this.LIZIZ, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC401501hF
    public final Object LJIILJJIL(Map<String, String> map, InterfaceC1364105Vn<? super C767500U8u> interfaceC1364105Vn) {
        return LJJJJI(map, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    @Override // X.InterfaceC401501hF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILL(java.util.Map<java.lang.String, java.lang.String> r6, X.InterfaceC1364105Vn<? super java.util.List<X.C0U74<com.bytedance.android.livesdkapi.depend.model.LiveEffect>>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C0UML
            if (r0 == 0) goto L4f
            r4 = r7
            X.0UML r4 = (X.C0UML) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4f
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r3 = 1
            if (r0 == 0) goto L32
            if (r0 != r3) goto L81
            X.0UMA r4 = r4.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            X.0UMl r1 = (X.C771050UMl) r1
            T r1 = r1.LIZIZ
            com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r1 = (com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse) r1
            r4.getClass()
            if (r1 != 0) goto L55
            X.13BV r1 = X.C13BV.INSTANCE
            return r1
        L32:
            X.C155000ia.LIZIZ(r1)
            java.lang.String r0 = "Sticker"
            X.C770170UJb.LIZJ(r0)
            java.lang.String r0 = ""
            X.C770170UJb.LIZLLL = r0
            X.0UDQ r1 = r5.LIZLLL
            java.lang.String r0 = r5.LIZIZ
            r4.LL = r5
            r4.LLILZ = r3
            java.lang.Object r1 = r1.LJFF(r0, r6, r4)
            if (r1 != r2) goto L4d
            return r2
        L4d:
            r4 = r5
            goto L24
        L4f:
            X.0UML r4 = new X.0UML
            r4.<init>(r5, r7)
            goto L12
        L55:
            X.0U64 r2 = new X.0U64
            r2.<init>()
            X.0U6E r0 = new X.0U6E
            r0.<init>()
            java.util.List r1 = r0.LJI(r1)
            r2.LJIIIZ(r1)
            r0 = r1
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L7e
            java.util.concurrent.CopyOnWriteArrayList<X.0U74<com.bytedance.android.livesdkapi.depend.model.LiveEffect>> r0 = r4.LJ
            r0.clear()
            java.util.concurrent.CopyOnWriteArrayList<X.0U74<com.bytedance.android.livesdkapi.depend.model.LiveEffect>> r0 = r4.LJ
            r0.addAll(r1)
            r4.LJIILIIL = r3
            return r1
        L7e:
            X.13BV r1 = X.C13BV.INSTANCE
            return r1
        L81:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMA.LJIILL(java.util.Map, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC401501hF
    public final Object LJJIFFI(String str, InterfaceC1364105Vn<? super C767500U8u> interfaceC1364105Vn) {
        return LJIIIZ("trending", str, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC401501hF
    public final Object LJJIII(final LiveEffect liveEffect, InterfaceC1364105Vn<? super C0U74<LiveEffect>> interfaceC1364105Vn) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        LJJJJZ(liveEffect, true);
        this.LIZJ.updateUsedEffect(this.LIZIZ, C1697810uHb.LJIILJJIL(String.valueOf(liveEffect.getEffectId())), true, 0L, null, new INothingListener() { // from class: X.0UN1
            @Override // com.ss.android.ugc.effectmanager.effect.listener.INothingListener
            public final void onFail(ExceptionResult exceptionResult) {
                this.LIZ.LJJJJZ(liveEffect, false);
                InterfaceC1364105Vn<C0U74<LiveEffect>> interfaceC1364105Vn2 = c23260099m;
                C0U74<LiveEffect> c0u74 = this.LIZ.LJIIIIZZ;
                C189200o6.m2constructorimpl(c0u74);
                interfaceC1364105Vn2.resumeWith(c0u74);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(Object obj) {
                InterfaceC1364105Vn<C0U74<LiveEffect>> interfaceC1364105Vn2 = c23260099m;
                C0U74<LiveEffect> c0u74 = this.LIZ.LJIIIIZZ;
                C189200o6.m2constructorimpl(c0u74);
                interfaceC1364105Vn2.resumeWith(c0u74);
            }
        });
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    @Override // X.InterfaceC401501hF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIIJZLJL(java.util.Map<java.lang.String, java.lang.String> r6, X.InterfaceC1364105Vn<? super X.C771050UMl<java.lang.Throwable, X.C0U74<com.bytedance.android.livesdkapi.depend.model.LiveEffect>>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C770940UMa
            if (r0 == 0) goto L35
            r4 = r7
            X.0UMa r4 = (X.C770940UMa) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L35
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L29
            if (r1 != r0) goto L3b
            X.C155000ia.LIZIZ(r3)
        L22:
            X.0UMl r1 = new X.0UMl
            r0 = 0
            r1.<init>(r0, r3)
            return r1
        L29:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0
            java.lang.Object r3 = r5.LJJJJ(r6, r4)
            if (r3 != r2) goto L22
            return r2
        L35:
            X.0UMa r4 = new X.0UMa
            r4.<init>(r5, r7)
            goto L12
        L3b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMA.LJJIIJZLJL(java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJ(java.util.Map<java.lang.String, java.lang.String> r14, X.InterfaceC1364105Vn<? super X.C0U74<com.bytedance.android.livesdkapi.depend.model.LiveEffect>> r15) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMA.LJJJJ(java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJI(java.util.Map<java.lang.String, java.lang.String> r13, X.InterfaceC1364105Vn<? super X.C767500U8u> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof X.C771060UMm
            if (r0 == 0) goto L66
            r3 = r14
            X.0UMm r3 = (X.C771060UMm) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L66
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r2 = r3.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r5 = 1
            if (r0 == 0) goto L28
            if (r0 != r5) goto Lb4
            X.C155000ia.LIZIZ(r2)
        L22:
            com.ss.android.ugc.effectmanager.effect.model.QueryRewardEffectsResponse r2 = (com.ss.android.ugc.effectmanager.effect.model.QueryRewardEffectsResponse) r2
            r1 = 0
            if (r2 != 0) goto L6c
            return r1
        L28:
            X.C155000ia.LIZIZ(r2)
            java.lang.String r0 = "Sticker"
            X.C770170UJb.LIZJ(r0)
            java.lang.String r0 = ""
            X.C770170UJb.LIZLLL = r0
            X.0UDQ r2 = r12.LIZLLL
            java.lang.String r7 = r12.LIZIZ
            r8 = 100
            r9 = 0
            r3.LLILLL = r5
            r2.getClass()
            X.099m r1 = new X.099m
            X.05Vn r0 = X.C099M.LIZLLL(r3)
            r1.<init>(r0)
            com.ss.android.ugc.effectmanager.EffectManager r6 = r2.LIZ
            if (r6 == 0) goto L56
            X.0UN2 r11 = new X.0UN2
            r11.<init>()
            r10 = r13
            r6.fetchRewardEffects(r7, r8, r9, r10, r11)
        L56:
            java.lang.Object r2 = r1.LIZ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r2 != r0) goto L63
            X.C099Q.LIZJ(r3)
        L63:
            if (r2 != r4) goto L22
            return r4
        L66:
            X.0UMm r3 = new X.0UMm
            r3.<init>(r12, r14)
            goto L12
        L6c:
            java.util.List r2 = r2.getRewardEffects()
            java.lang.String r6 = "livereward"
            if (r2 == 0) goto Lb3
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r2, r0)
            r4.<init>(r0)
            java.util.Iterator r3 = r2.iterator()
        L83:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto La2
            java.lang.Object r0 = r3.next()
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r0
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r2 = X.C0UEO.LIZLLL(r0)
            java.lang.String r0 = X.C0UD4.LJIIJJI
            r2.LLJLIL(r0)
            r2.LJIIJJI(r6)
            X.C767250U7v.LIZIZ(r5, r2)
            r4.add(r2)
            goto L83
        La2:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto Lb3
            java.util.List r2 = X.C0U7C.LIZLLL(r4)
            X.0U8u r1 = new X.0U8u
            r0 = 12
            r1.<init>(r6, r2, r0)
        Lb3:
            return r1
        Lb4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMA.LJJJJI(java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C767500U8u LJJJJJL(com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMA.LJJJJJL(com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel, boolean):X.0U8u");
    }

    public final void LJJJJZ(LiveEffect liveEffect, boolean z) {
        if (liveEffect != null) {
            liveEffect.getEffectId();
            ArrayList arrayList = new ArrayList(this.LJIIIIZZ.LIZIZ);
            if (z) {
                C500260Jjc.LJJJLIIL(arrayList, new AwS591S0100000_12(liveEffect, 100));
                LiveEffect liveEffectLLJZIJLIL = liveEffect.LLJZIJLIL();
                liveEffectLLJZIJLIL.LLJLIL(C0UD4.LJIIL);
                liveEffectLLJZIJLIL.LJIIJJI("Recents");
                int i = 0;
                ListProtector.add(arrayList, 0, liveEffectLLJZIJLIL);
                for (Object obj : arrayList) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        ((LiveEffect) obj).LJJLI(Integer.valueOf(i));
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            } else {
                arrayList.remove(liveEffect);
            }
            C0U74<LiveEffect> c0u74 = this.LJIIIIZZ;
            this.LJIIIIZZ = new C0U74<>(c0u74.LIZ, c0u74.LIZJ, null, null, null, arrayList, null, 248);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    @Override // X.InterfaceC401501hF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(java.lang.String r7, java.lang.String r8, X.InterfaceC1364105Vn<? super X.C767500U8u> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C771130UMt
            if (r0 == 0) goto L51
            r5 = r9
            X.0UMt r5 = (X.C771130UMt) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            java.lang.String r3 = "shared_bg"
            r2 = 1
            if (r0 == 0) goto L31
            if (r0 != r2) goto L57
            X.C155000ia.LIZIZ(r1)
        L24:
            com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r1 = (com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel) r1
            java.lang.String r0 = "BgEffectViewModel fetchEffectInCategoryFromCache finish"
            X.C20441214yg.LIZIZ(r3, r0)
            r0 = 0
            X.0U8u r0 = r6.LJJJJJL(r1, r0)
            return r0
        L31:
            X.C155000ia.LIZIZ(r1)
            java.lang.String r0 = "Sticker"
            X.C770170UJb.LIZJ(r0)
            java.lang.String r0 = ""
            X.C770170UJb.LIZLLL = r0
            java.lang.String r0 = "BgEffectViewModel fetchEffectInCategoryFromCache start"
            X.C20441214yg.LIZIZ(r3, r0)
            X.0UDQ r1 = r6.LIZLLL
            java.lang.String r0 = r6.LIZIZ
            r5.LL = r8
            r5.LLILZ = r2
            java.lang.Object r1 = r1.LJ(r0, r7, r5)
            if (r1 != r4) goto L24
            return r4
        L51:
            X.0UMt r5 = new X.0UMt
            r5.<init>(r6, r9)
            goto L12
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMA.LJIIIZ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC401501hF
    public final Object LJIIJ(String str, String str2, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        boolean zLIZIZ;
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        C497740JfY.LJII();
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        if (zLIZIZ) {
            C770170UJb.LIZIZ("try to check need update effect");
            this.LIZJ.checkCategoryIsUpdate(str2, str, new ICheckChannelListener() { // from class: X.0U4c
                @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                public final void checkChannelFailed(ExceptionResult exceptionResult) {
                    InterfaceC1364105Vn<Boolean> interfaceC1364105Vn2 = c23260099m;
                    Boolean bool = Boolean.FALSE;
                    C189200o6.m2constructorimpl(bool);
                    interfaceC1364105Vn2.resumeWith(bool);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                public final void checkChannelSuccess(boolean z) {
                    Boolean boolValueOf = Boolean.valueOf(z);
                    InterfaceC1364105Vn<Boolean> interfaceC1364105Vn2 = c23260099m;
                    C189200o6.m2constructorimpl(boolValueOf);
                    interfaceC1364105Vn2.resumeWith(boolValueOf);
                }
            });
        } else {
            C189200o6.m2constructorimpl(false);
            c23260099m.resumeWith(false);
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    @Override // X.InterfaceC401501hF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJI(boolean r9, com.google.gson.n r10, X.InterfaceC1364105Vn<? super java.lang.Boolean> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C0UMQ
            if (r0 == 0) goto L2b
            r4 = r11
            X.0UMQ r4 = (X.C0UMQ) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2b
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r7 = 0
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L35
            if (r0 == r5) goto L31
            if (r0 == r6) goto L31
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2b:
            X.0UMQ r4 = new X.0UMQ
            r4.<init>(r8, r11)
            goto L12
        L31:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L89
            goto L9b
        L35:
            X.C155000ia.LIZIZ(r1)
            if (r10 != 0) goto L3f
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        L3f:
            if (r9 == 0) goto L65
            X.0Ism r1 = X.C480460Ism.LIZ()     // Catch: java.lang.Exception -> L89
            java.lang.Class<com.bytedance.android.live.effect.api.EffectRelatedApi> r0 = com.bytedance.android.live.effect.api.EffectRelatedApi.class
            r1.getClass()     // Catch: java.lang.Exception -> L89
            java.lang.Object r2 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Exception -> L89
            com.bytedance.android.live.effect.api.EffectRelatedApi r2 = (com.bytedance.android.live.effect.api.EffectRelatedApi) r2     // Catch: java.lang.Exception -> L89
            com.google.gson.Gson r1 = X.C293501Bt.LIZ()     // Catch: java.lang.Exception -> L89
            java.lang.Class<tikcast.api.anchor_tool.StartInteractiveEffectReq> r0 = tikcast.api.anchor_tool.StartInteractiveEffectReq.class
            java.lang.Object r0 = r1.LIZJ(r10, r0)     // Catch: java.lang.Exception -> L89
            tikcast.api.anchor_tool.StartInteractiveEffectReq r0 = (tikcast.api.anchor_tool.StartInteractiveEffectReq) r0     // Catch: java.lang.Exception -> L89
            r4.LLILLL = r5     // Catch: java.lang.Exception -> L89
            java.lang.Object r0 = r2.startInteractiveEffect(r0, r4)     // Catch: java.lang.Exception -> L89
            if (r0 != r3) goto L9b
            return r3
        L65:
            X.0Ism r1 = X.C480460Ism.LIZ()     // Catch: java.lang.Exception -> L89
            java.lang.Class<com.bytedance.android.live.effect.api.EffectRelatedApi> r0 = com.bytedance.android.live.effect.api.EffectRelatedApi.class
            r1.getClass()     // Catch: java.lang.Exception -> L89
            java.lang.Object r2 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Exception -> L89
            com.bytedance.android.live.effect.api.EffectRelatedApi r2 = (com.bytedance.android.live.effect.api.EffectRelatedApi) r2     // Catch: java.lang.Exception -> L89
            com.google.gson.Gson r1 = X.C293501Bt.LIZ()     // Catch: java.lang.Exception -> L89
            java.lang.Class<tikcast.api.anchor_tool.FinishInteractiveEffectReq> r0 = tikcast.api.anchor_tool.FinishInteractiveEffectReq.class
            java.lang.Object r0 = r1.LIZJ(r10, r0)     // Catch: java.lang.Exception -> L89
            tikcast.api.anchor_tool.FinishInteractiveEffectReq r0 = (tikcast.api.anchor_tool.FinishInteractiveEffectReq) r0     // Catch: java.lang.Exception -> L89
            r4.LLILLL = r6     // Catch: java.lang.Exception -> L89
            java.lang.Object r0 = r2.finishInteractiveEffect(r0, r4)     // Catch: java.lang.Exception -> L89
            if (r0 != r3) goto L9b
            return r3
        L89:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "InteractiveE#repoError"
            X.C20441214yg.LIZIZ(r0, r1)
            goto L9c
        L9b:
            r7 = 1
        L9c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMA.LJIJI(boolean, com.google.gson.n, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC401501hF
    public final Object LJJIIJ(LiveEffect liveEffect, boolean z, InterfaceC1364105Vn<? super C0U74<LiveEffect>> interfaceC1364105Vn) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        LJJJJLL(liveEffect, z, c23260099m);
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    @Override // X.InterfaceC401501hF
    public final Object LJJIJIIJIL(final LiveEffect liveEffect, final boolean z, InterfaceC1364105Vn<? super C0U74<LiveEffect>> interfaceC1364105Vn) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        this.LIZJ.modifyFavoriteList(this.LIZIZ, String.valueOf(liveEffect.getEffectId()), Boolean.valueOf(z), new IModFavoriteList() { // from class: X.0UN0
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList
            public final void onFail(ExceptionResult exceptionResult) {
                this.LJJJJLL(liveEffect, !z, c23260099m);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(List<String> list) {
                InterfaceC1364105Vn<C0U74<LiveEffect>> interfaceC1364105Vn2 = c23260099m;
                C0U74 c0u74 = new C0U74("", "", null, null, null, C13BV.INSTANCE, null, 248);
                C189200o6.m2constructorimpl(c0u74);
                interfaceC1364105Vn2.resumeWith(c0u74);
            }
        });
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    @Override // X.InterfaceC401501hF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIZ(java.lang.String r6, java.lang.String r7, X.InterfaceC1364105Vn<? super com.bytedance.android.livesdkapi.depend.model.LiveEffect> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C771010UMh
            if (r0 == 0) goto L4a
            r4 = r8
            X.0UMh r4 = (X.C771010UMh) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4a
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r3 = r4.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZIL
            r1 = 1
            if (r0 == 0) goto L38
            if (r0 != r1) goto L52
            java.lang.Object r7 = r4.LLILLJJLI
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r4.LL
            java.lang.String r6 = (java.lang.String) r6
            X.C155000ia.LIZIZ(r3)
        L2a:
            com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r3 = (com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse) r3
            if (r3 == 0) goto L50
            X.0U8T r0 = X.C0U8T.LIZ
            r0.getClass()
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = X.C0U8T.LJIJ(r3, r7, r6)
            return r0
        L38:
            X.C155000ia.LIZIZ(r3)
            X.0UDQ r0 = r5.LIZLLL
            r4.LL = r6
            r4.LLILLJJLI = r7
            r4.LLILZIL = r1
            java.lang.Object r3 = r0.LJI(r7, r4)
            if (r3 != r2) goto L2a
            return r2
        L4a:
            X.0UMh r4 = new X.0UMh
            r4.<init>(r5, r8)
            goto L12
        L50:
            r0 = 0
            return r0
        L52:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMA.LJJIZ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJIZL(java.lang.String r10, java.lang.String r11, X.InterfaceC1364105Vn r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof X.C771000UMg
            if (r0 == 0) goto L81
            r7 = r12
            X.0UMg r7 = (X.C771000UMg) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L81
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r8 = r7.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILZ
            r4 = 0
            java.lang.String r5 = "shared_bg"
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L49
            if (r0 == r1) goto L5e
            if (r0 != r3) goto L87
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r2 = r7.LL
            X.C155000ia.LIZIZ(r8)
        L2a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r0 = r8.booleanValue()
            java.lang.Boolean.valueOf(r0)
        L33:
            java.lang.String r0 = "downloadEffect end"
            X.C20441214yg.LIZIZ(r5, r0)
            if (r2 != 0) goto L44
            X.13BV r2 = X.C13BV.INSTANCE
        L3c:
            X.0U8u r1 = new X.0U8u
            r0 = 14
            r1.<init>(r4, r2, r0)
            return r1
        L44:
            java.util.List r2 = java.util.Collections.singletonList(r2)
            goto L3c
        L49:
            X.C155000ia.LIZIZ(r8)
            java.lang.System.currentTimeMillis()
            X.0UDQ r0 = r9.LIZLLL
            if (r10 != 0) goto L55
            java.lang.String r10 = r9.LIZIZ
        L55:
            r7.LLILZ = r1
            java.lang.Object r8 = r0.LJIILIIL(r10, r11, r7)
            if (r8 != r6) goto L61
            return r6
        L5e:
            X.C155000ia.LIZIZ(r8)
        L61:
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r8 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r8
            if (r8 == 0) goto L7f
            r9.LJIL(r8)
            r2 = r8
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r8.LIZJ
            if (r1 == 0) goto L33
            java.lang.String r0 = "downloadEffect start"
            X.C20441214yg.LIZIZ(r5, r0)
            X.0UDQ r0 = r9.LIZLLL
            r7.LL = r2
            r7.LLILZ = r3
            java.lang.Object r8 = r0.LIZJ(r1, r7)
            if (r8 != r6) goto L2a
            return r6
        L7f:
            r2 = r4
            goto L33
        L81:
            X.0UMg r7 = new X.0UMg
            r7.<init>(r9, r12)
            goto L12
        L87:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMA.LJJJJIZL(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    public final void LJJJJLL(LiveEffect liveEffect, boolean z, InterfaceC1364105Vn<? super C0U74<LiveEffect>> interfaceC1364105Vn) {
        if (liveEffect != null) {
            liveEffect.getEffectId();
            ArrayList arrayList = new ArrayList(this.LJII.LIZIZ);
            if (z) {
                LiveEffect liveEffectLLJZIJLIL = liveEffect.LLJZIJLIL();
                C0U7C.LIZ(liveEffectLLJZIJLIL, this.LIZIZ);
                liveEffectLLJZIJLIL.LLJLIL("favorite");
                liveEffectLLJZIJLIL.LJIIJJI("favorite");
                int i = 0;
                ListProtector.add(arrayList, 0, liveEffectLLJZIJLIL);
                for (Object obj : arrayList) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        ((LiveEffect) obj).LJJLI(Integer.valueOf(i));
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            } else {
                arrayList.remove(liveEffect);
            }
            C0U74<LiveEffect> c0u74 = this.LJII;
            C0U74<LiveEffect> c0u742 = new C0U74<>(c0u74.LIZ, c0u74.LIZJ, null, null, null, arrayList, null, 248);
            this.LJII = c0u742;
            C189200o6.m2constructorimpl(c0u742);
            interfaceC1364105Vn.resumeWith(c0u742);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    @Override // X.InterfaceC401501hF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(java.lang.String r6, java.lang.String r7, java.lang.String r8, X.InterfaceC1364105Vn<? super com.bytedance.android.livesdkapi.depend.model.LiveEffect> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C0UMO
            if (r0 == 0) goto L4a
            r4 = r9
            X.0UMO r4 = (X.C0UMO) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4a
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r3 = r4.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZIL
            r1 = 1
            if (r0 == 0) goto L38
            if (r0 != r1) goto L52
            java.lang.Object r8 = r4.LLILLJJLI
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r6 = r4.LL
            java.lang.String r6 = (java.lang.String) r6
            X.C155000ia.LIZIZ(r3)
        L2a:
            com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r3 = (com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel) r3
            if (r3 == 0) goto L50
            X.0U8T r0 = X.C0U8T.LIZ
            r0.getClass()
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = X.C0U8T.LJIIZILJ(r3, r6, r8)
            return r0
        L38:
            X.C155000ia.LIZIZ(r3)
            X.0UDQ r0 = r5.LIZLLL
            r4.LL = r6
            r4.LLILLJJLI = r8
            r4.LLILZIL = r1
            java.lang.Object r3 = r0.LJ(r7, r8, r4)
            if (r3 != r2) goto L2a
            return r2
        L4a:
            X.0UMO r4 = new X.0UMO
            r4.<init>(r5, r9)
            goto L12
        L50:
            r0 = 0
            return r0
        L52:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMA.LJI(java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    @Override // X.InterfaceC401501hF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJ(java.lang.String r6, java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, X.InterfaceC1364105Vn<? super com.bytedance.android.livesdkapi.depend.model.LiveEffect> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C0UMJ
            if (r0 == 0) goto L57
            r4 = r9
            X.0UMJ r4 = (X.C0UMJ) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L57
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r3 = r4.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZIL
            r1 = 1
            if (r0 == 0) goto L3c
            if (r0 != r1) goto L5f
            java.lang.Object r7 = r4.LLILLJJLI
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r4.LL
            java.lang.String r6 = (java.lang.String) r6
            X.C155000ia.LIZIZ(r3)
        L2a:
            X.0UMl r3 = (X.C771050UMl) r3
            T r1 = r3.LIZIZ
            com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r1 = (com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse) r1
            if (r1 == 0) goto L5d
            X.0U8T r0 = X.C0U8T.LIZ
            r0.getClass()
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = X.C0U8T.LJIJ(r1, r7, r6)
            return r0
        L3c:
            X.C155000ia.LIZIZ(r3)
            java.lang.String r0 = "Sticker"
            X.C770170UJb.LIZJ(r0)
            java.lang.String r0 = ""
            X.C770170UJb.LIZLLL = r0
            X.0UDQ r0 = r5.LIZLLL
            r4.LL = r6
            r4.LLILLJJLI = r7
            r4.LLILZIL = r1
            java.lang.Object r3 = r0.LJFF(r7, r8, r4)
            if (r3 != r2) goto L2a
            return r2
        L57:
            X.0UMJ r4 = new X.0UMJ
            r4.<init>(r5, r9)
            goto L12
        L5d:
            r0 = 0
            return r0
        L5f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMA.LJJ(java.lang.String, java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC401501hF
    public final Object LJJII(String str, Map map, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        return LJII("trending", str, null, map, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e2  */
    @Override // X.InterfaceC401501hF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(java.lang.String r23, java.lang.String r24, java.lang.String r25, java.util.Map r26, X.InterfaceC1364105Vn r27) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMA.LJII(java.lang.String, java.lang.String, java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x026f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x026d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJIL(java.lang.String r30, java.lang.String r31, java.lang.String r32, java.util.Map<java.lang.String, java.lang.String> r33, X.InterfaceC1364105Vn<? super X.C767500U8u> r34) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMA.LJJJIL(java.lang.String, java.lang.String, java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    @Override // X.InterfaceC401501hF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIJ(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.util.Map r17, X.InterfaceC1364105Vn r18) {
        /*
            r12 = this;
            r5 = r15
            r6 = 0
            r3 = r18
            boolean r0 = r3 instanceof X.C0UMM
            if (r0 == 0) goto L64
            r11 = r3
            X.0UMM r11 = (X.C0UMM) r11
            int r2 = r11.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L64
            int r2 = r2 - r1
            r11.LLILZIL = r2
        L16:
            java.lang.Object r3 = r11.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r11.LLILZIL
            r1 = 1
            if (r0 == 0) goto L42
            if (r0 != r1) goto L6c
            java.lang.Object r5 = r11.LLILLJJLI
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r13 = r11.LL
            java.lang.String r13 = (java.lang.String) r13
            X.C155000ia.LIZIZ(r3)
        L2e:
            kotlin.Pair r3 = (kotlin.Pair) r3
            java.lang.Object r1 = r3.getFirst()
            com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r1 = (com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel) r1
            if (r1 == 0) goto L6a
            X.0U8T r0 = X.C0U8T.LIZ
            r0.getClass()
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = X.C0U8T.LJIIZILJ(r1, r13, r5)
            return r0
        L42:
            X.C155000ia.LIZIZ(r3)
            java.lang.String r0 = "Sticker"
            X.C770170UJb.LIZJ(r0)
            java.lang.String r0 = ""
            X.C770170UJb.LIZLLL = r0
            X.0UDQ r3 = r12.LIZLLL
            r11.LL = r13
            r11.LLILLJJLI = r5
            r11.LLILZIL = r1
            r9 = r16
            r4 = r14
            r10 = r17
            r7 = r6
            r8 = r6
            java.lang.Object r3 = r3.LIZLLL(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r3 != r2) goto L2e
            return r2
        L64:
            X.0UMM r11 = new X.0UMM
            r11.<init>(r12, r3)
            goto L16
        L6a:
            r0 = 0
            return r0
        L6c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMA.LJJIJ(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x015c  */
    @Override // X.InterfaceC401501hF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIIZ(java.lang.String r23, java.lang.String r24, java.lang.String r25, java.util.Map<java.lang.String, java.lang.String> r26, boolean r27, boolean r28, X.InterfaceC1364105Vn<? super X.C767500U8u> r29) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMA.LJJIIZ(java.lang.String, java.lang.String, java.lang.String, java.util.Map, boolean, boolean, X.05Vn):java.lang.Object");
    }
}
