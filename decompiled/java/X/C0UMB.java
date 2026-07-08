package X;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectNewEffectReverseSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectNewEffectReverseTimeSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import tikcast.api.anchor_tool.CategoryEffectsResponse;
import tikcast.api.anchor_tool.PanelInfoResponse;
import webcast.data.Category;
import webcast.data.CategoryEffects;

/* JADX INFO: renamed from: X.0UMB, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UMB extends C0UMD {
    public final String LIZIZ;
    public final C0UMC LIZJ = new C0UMC();
    public final C0UDQ LIZLLL = new C0UDQ();
    public final CopyOnWriteArrayList<C0U74<LiveEffect>> LJ = new CopyOnWriteArrayList<>();
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(31));
    public transient List<C0UBH> LJI = new ArrayList();
    public final ConcurrentHashMap<String, List<LiveEffect>> LJII = new ConcurrentHashMap<>();
    public C0U74<LiveEffect> LJIIIIZZ = new C0U74<>("favorite", "favorite", null, null, null, new ArrayList(), null, 248);
    public C0U74<LiveEffect> LJIIIZ = new C0U74<>(C0UD4.LJIIL, "Recents", null, null, null, new ArrayList(), null, 248);
    public final C098J<String, LiveEffect> LJIIJ = new C098J<>(16);
    public final ConcurrentHashMap<String, List<LiveEffect>> LJIIJJI = new ConcurrentHashMap<>();
    public final C098J<String, LiveEffect> LJIIL = new C098J<>(16);
    public volatile boolean LJIILIIL;

    @Override // X.InterfaceC401501hF
    public final InterfaceC396201gO<C0U74<LiveEffect>> LJJIJL() {
        return this;
    }

    @Override // X.InterfaceC401501hF
    public final void clearCache() {
        this.LJII.clear();
        this.LJ.clear();
        ((ConcurrentHashMap) this.LJFF.getValue()).clear();
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
        return this.LJI;
    }

    @Override // X.InterfaceC401501hF
    public final C0U74<LiveEffect> LJJJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC401501hF
    public final C0U74<LiveEffect> LJJJI() {
        return this.LJIIIZ;
    }

    public C0UMB(String str) {
        this.LIZIZ = str;
    }

    public static final Iterable<LiveEffect> LJJJIL(Iterable<? extends LiveEffect> iterable) {
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

    @Override // X.InterfaceC401501hF
    public final Object LJIJJ(InterfaceC1364105Vn<? super List<C0UBH>> interfaceC1364105Vn) {
        return LJJJJI(this.LIZJ.LJIILIIL(C0UD4.LIZIZ).LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    @Override // X.InterfaceC401501hF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJJLI(X.InterfaceC1364105Vn<? super java.util.List<X.C0UBH>> r16) throws org.json.JSONException {
        /*
            r15 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C771110UMr
            if (r0 == 0) goto L75
            r7 = r3
            X.0UMr r7 = (X.C771110UMr) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L75
            int r2 = r2 - r1
            r7.LLILZ = r2
        L14:
            java.lang.Object r3 = r7.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILZ
            r8 = 1
            if (r0 == 0) goto L51
            if (r0 != r8) goto L7b
            long r1 = r7.LL
            X.C155000ia.LIZIZ(r3)
        L26:
            X.0UMl r3 = (X.C771050UMl) r3
            long r10 = java.lang.System.currentTimeMillis()
            long r10 = r10 - r1
            T r0 = r3.LIZIZ
            if (r0 != 0) goto L32
            r8 = 2
        L32:
            X.0UC4 r0 = X.C0UC4.LIZ
            java.lang.String r13 = X.C0UD4.LIZIZ
            int r0 = r3.LIZ()
            java.lang.Integer r12 = X.C2286608xc.LJ(r0)
            java.lang.String r14 = r3.LIZIZ()
            X.0UC4 r0 = X.C0UC4.LIZ
            r9 = 0
            X.C0UC4.LJJIIJZLJL(r8, r9, r10, r12, r13, r14)
            T r0 = r3.LIZIZ
            tikcast.api.anchor_tool.PanelInfoResponse$Data r0 = (tikcast.api.anchor_tool.PanelInfoResponse.Data) r0
            java.util.List r0 = r15.LJJJJI(r0)
            return r0
        L51:
            X.C155000ia.LIZIZ(r3)
            java.lang.String r0 = "Sticker"
            X.C770170UJb.LIZJ(r0)
            java.lang.String r5 = ""
            X.C770170UJb.LIZLLL = r5
            long r1 = java.lang.System.currentTimeMillis()
            X.0UMC r4 = r15.LIZJ
            java.lang.String r3 = X.C0UD4.LIZIZ
            r0 = 0
            java.util.Map r0 = LIZJ(r5, r0)
            r7.LL = r1
            r7.LLILZ = r8
            java.lang.Object r3 = r4.LJIIL(r3, r0, r7)
            if (r3 != r6) goto L26
            return r6
        L75:
            X.0UMr r7 = new X.0UMr
            r7.<init>(r15, r3)
            goto L14
        L7b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMB.LJIJJLI(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC401501hF
    public final void LJIL(LiveEffect liveEffect) {
        String resourceId = liveEffect.getResourceId();
        if (resourceId != null) {
            this.LJIIJ.put(resourceId, liveEffect);
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
        ConcurrentHashMap<String, List<LiveEffect>> concurrentHashMap = this.LJII;
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
            return this.LJIIL.get(str);
        }
        return liveEffect;
    }

    @Override // X.InterfaceC401501hF
    public final Object LJJIJIIJI(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return this.LIZJ.LJI(this.LIZIZ, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC401501hF
    public final LiveEffect LJJIJLIJ(String str) {
        return this.LJIIJ.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    @Override // X.InterfaceC401501hF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIL(X.InterfaceC1364105Vn<? super java.util.List<X.C0UBH>> r11) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMB.LJJIL(X.05Vn):java.lang.Object");
    }

    public final List<C0UBH> LJJJJI(PanelInfoResponse.Data data) {
        List<Category> list;
        ArrayList arrayList = new ArrayList();
        C0UBH c0ubh = null;
        if (data != null && (list = data.categoryList) != null) {
            for (Category category : list) {
                if (Intrinsics.LJFF(category.key.toLowerCase(Locale.ROOT), "trending")) {
                    c0ubh = new C0UBH(category.name, category.key, false);
                } else {
                    arrayList.add(new C0UBH(category.name, category.key, false));
                }
            }
            if (c0ubh != null) {
                ListProtector.add(arrayList, 0, c0ubh);
            }
        }
        this.LJI = arrayList;
        return arrayList;
    }

    public static final Map<String, String> LIZJ(String str, Map<String, String> map) throws JSONException {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    @Override // X.InterfaceC401501hF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.util.Map<java.lang.String, java.lang.String> r18, X.InterfaceC1364105Vn<? super X.C0U74<com.bytedance.android.livesdkapi.depend.model.LiveEffect>> r19) {
        /*
            r17 = this;
            r4 = r19
            boolean r1 = r4 instanceof X.C770950UMb
            r0 = r17
            if (r1 == 0) goto L84
            r8 = r4
            X.0UMb r8 = (X.C770950UMb) r8
            int r3 = r8.LLILZ
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L84
            int r3 = r3 - r2
            r8.LLILZ = r3
        L16:
            java.lang.Object r7 = r8.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r1 = r8.LLILZ
            r5 = 1
            if (r1 == 0) goto L6c
            if (r1 != r5) goto Lb5
            long r3 = r8.LL
            X.C155000ia.LIZIZ(r7)
        L28:
            X.0UMl r7 = (X.C771050UMl) r7
            long r12 = java.lang.System.currentTimeMillis()
            long r12 = r12 - r3
            T r2 = r7.LIZIZ
            if (r2 == 0) goto L8a
            X.0U74 r3 = new X.0U74
            X.0U74<com.bytedance.android.livesdkapi.depend.model.LiveEffect> r1 = r0.LJIIIZ
            java.lang.String r4 = r1.LIZ
            java.lang.String r1 = r1.LIZJ
            webcast.data.DefaultEffectListItemStruct r2 = (webcast.data.DefaultEffectListItemStruct) r2
            X.0U74 r1 = r0.LIZIZ(r4, r1, r2)
            java.util.List<T> r9 = r1.LIZIZ
            X.0U74<com.bytedance.android.livesdkapi.depend.model.LiveEffect> r1 = r0.LJIIIZ
            java.lang.String r5 = r1.LIZJ
            r6 = 0
            r11 = 248(0xf8, float:3.48E-43)
            r7 = r6
            r8 = r6
            r10 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r0.LJIIIZ = r3
            X.0UC4 r1 = X.C0UC4.LIZ
            java.lang.String r15 = r3.LIZJ
            r10 = 1
            r1 = -1
            java.lang.Integer r14 = X.C2286608xc.LJ(r1)
            java.lang.String r16 = ""
            X.0U74<com.bytedance.android.livesdkapi.depend.model.LiveEffect> r1 = r0.LJIIIZ
            java.util.List<T> r1 = r1.LIZIZ
            int r11 = r1.size()
            X.C0UC4.LJJIIJZLJL(r10, r11, r12, r14, r15, r16)
            X.0U74<com.bytedance.android.livesdkapi.depend.model.LiveEffect> r0 = r0.LJIIIZ
            return r0
        L6c:
            X.C155000ia.LIZIZ(r7)
            long r3 = java.lang.System.currentTimeMillis()
            X.0UMC r2 = r0.LIZJ
            java.lang.String r1 = r0.LIZIZ
            r8.LL = r3
            r8.LLILZ = r5
            r5 = r18
            java.lang.Object r7 = r2.LJIILJJIL(r1, r5, r8)
            if (r7 != r6) goto L28
            return r6
        L84:
            X.0UMb r8 = new X.0UMb
            r8.<init>(r0, r4)
            goto L16
        L8a:
            X.0UC4 r1 = X.C0UC4.LIZ
            java.lang.String r15 = "Recents"
            int r1 = r7.LIZ()
            java.lang.Integer r14 = X.C2286608xc.LJ(r1)
            java.lang.String r16 = r7.LIZIZ()
            X.0UC4 r1 = X.C0UC4.LIZ
            r11 = 0
            r10 = 2
            X.C0UC4.LJJIIJZLJL(r10, r11, r12, r14, r15, r16)
            X.0U74 r1 = new X.0U74
            X.0U74<com.bytedance.android.livesdkapi.depend.model.LiveEffect> r0 = r0.LJIIIZ
            java.lang.String r2 = r0.LIZ
            X.13BV r7 = X.C13BV.INSTANCE
            java.lang.String r3 = r0.LIZJ
            r4 = 0
            r9 = 248(0xf8, float:3.48E-43)
            r5 = r4
            r6 = r4
            r8 = r4
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        Lb5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMB.LJ(java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    @Override // X.InterfaceC401501hF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.lang.String r7, X.InterfaceC1364105Vn r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C771040UMk
            if (r0 == 0) goto L57
            r5 = r8
            X.0UMk r5 = (X.C771040UMk) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L57
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L3b
            if (r0 != r3) goto L5d
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
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<com.bytedance.android.livesdkapi.depend.model.LiveEffect>> r0 = r6.LJIIJJI
            java.lang.Object r1 = r0.get(r7)
            if (r1 != 0) goto L35
            X.0UDQ r1 = r6.LIZLLL
            java.util.List r0 = java.util.Collections.singletonList(r7)
            r5.LL = r7
            r5.LLILZ = r3
            java.lang.Object r1 = r1.LJIIJ(r0, r5)
            if (r1 != r4) goto L25
            return r4
        L57:
            X.0UMk r5 = new X.0UMk
            r5.<init>(r6, r8)
            goto L12
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMB.LJFF(java.lang.String, X.05Vn):java.lang.Object");
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
            boolean r0 = r10 instanceof X.C0UMX
            if (r0 == 0) goto L72
            r7 = r10
            X.0UMX r7 = (X.C0UMX) r7
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
            X.0UMX r7 = new X.0UMX
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
            X.098J<java.lang.String, com.bytedance.android.livesdkapi.depend.model.LiveEffect> r0 = r8.LJIIL
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
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMB.LJIIIIZZ(java.util.List, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC401501hF
    public final C767500U8u LJIIJJI(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('-');
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C0U74 c0u74 = (C0U74) ((ConcurrentHashMap) this.LJFF.getValue()).get(strLIZIZ);
        if (c0u74 != null) {
            return new C767500U8u(strLIZIZ, c0u74.LIZIZ, 12);
        }
        return new C767500U8u("", C13BV.INSTANCE, 12);
    }

    @Override // X.InterfaceC401501hF
    public final Object LJIILIIL(String str, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return LJIIJ(str, this.LIZIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    @Override // X.InterfaceC401501hF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(java.util.Map<java.lang.String, java.lang.String> r8, X.InterfaceC1364105Vn<? super X.C767500U8u> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C771070UMn
            if (r0 == 0) goto L43
            r4 = r9
            X.0UMn r4 = (X.C771070UMn) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L43
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r2 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r6 = 1
            if (r0 == 0) goto L28
            if (r0 != r6) goto L94
            X.C155000ia.LIZIZ(r2)
        L22:
            tikcast.api.anchor_tool.EffectRewardResponse$Data r2 = (tikcast.api.anchor_tool.EffectRewardResponse.Data) r2
            r1 = 0
            if (r2 != 0) goto L49
            return r1
        L28:
            X.C155000ia.LIZIZ(r2)
            java.lang.String r0 = "Sticker"
            X.C770170UJb.LIZJ(r0)
            java.lang.String r0 = ""
            X.C770170UJb.LIZLLL = r0
            X.0UMC r2 = r7.LIZJ
            java.lang.String r1 = r7.LIZIZ
            r4.LLILLL = r6
            r0 = 100
            java.lang.Object r2 = r2.LJIILL(r1, r0, r8, r4)
            if (r2 != r3) goto L22
            return r3
        L43:
            X.0UMn r4 = new X.0UMn
            r4.<init>(r7, r9)
            goto L12
        L49:
            java.util.List<webcast.data.EffectStruct> r2 = r2.rewardEffects
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r2, r0)
            r5.<init>(r0)
            java.util.Iterator r4 = r2.iterator()
        L5a:
            boolean r0 = r4.hasNext()
            java.lang.String r3 = "livereward"
            if (r0 == 0) goto L80
            java.lang.Object r0 = r4.next()
            webcast.data.EffectStruct r0 = (webcast.data.EffectStruct) r0
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r2 = X.C0UEO.LJ(r0)
            java.lang.String r0 = r7.LIZIZ
            X.C0U7C.LIZ(r2, r0)
            java.lang.String r0 = X.C0UD4.LJIIJJI
            r2.LLJLIL(r0)
            r2.LJIIJJI(r3)
            X.C767250U7v.LIZIZ(r6, r2)
            r5.add(r2)
            goto L5a
        L80:
            boolean r0 = r5.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L93
            java.util.List r2 = X.C0U7C.LIZLLL(r5)
            X.0U8u r1 = new X.0U8u
            r0 = 12
            r1.<init>(r3, r2, r0)
        L93:
            return r1
        L94:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMB.LJIILJJIL(java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    @Override // X.InterfaceC401501hF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILL(java.util.Map<java.lang.String, java.lang.String> r24, X.InterfaceC1364105Vn<? super java.util.List<X.C0U74<com.bytedance.android.livesdkapi.depend.model.LiveEffect>>> r25) {
        /*
            Method dump skipped, instruction units count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMB.LJIILL(java.util.Map, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC401501hF
    public final Object LJJIFFI(String str, InterfaceC1364105Vn<? super C767500U8u> interfaceC1364105Vn) {
        return LJIIIZ("trending", str, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    @Override // X.InterfaceC401501hF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIII(com.bytedance.android.livesdkapi.depend.model.LiveEffect r8, X.InterfaceC1364105Vn<? super X.C0U74<com.bytedance.android.livesdkapi.depend.model.LiveEffect>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C770970UMd
            if (r0 == 0) goto L50
            r6 = r9
            X.0UMd r6 = (X.C770970UMd) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r1 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r4 = 1
            if (r0 == 0) goto L33
            if (r0 != r4) goto L56
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r8 = r6.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 != 0) goto L30
            r0 = 0
            r7.LJJJJJ(r8, r0)
        L30:
            X.0U74<com.bytedance.android.livesdkapi.depend.model.LiveEffect> r0 = r7.LJIIIZ
            return r0
        L33:
            X.C155000ia.LIZIZ(r1)
            r7.LJJJJJ(r8, r4)
            X.0UMC r3 = r7.LIZJ
            java.lang.String r2 = r7.LIZIZ
            long r0 = r8.getEffectId()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r6.LL = r8
            r6.LLILZ = r4
            java.lang.Object r1 = r3.LJIIZILJ(r2, r0, r6, r4)
            if (r1 != r5) goto L24
            return r5
        L50:
            X.0UMd r6 = new X.0UMd
            r6.<init>(r7, r9)
            goto L12
        L56:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMB.LJJIII(com.bytedance.android.livesdkapi.depend.model.LiveEffect, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    @Override // X.InterfaceC401501hF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIIJZLJL(java.util.Map<java.lang.String, java.lang.String> r19, X.InterfaceC1364105Vn<? super X.C771050UMl<java.lang.Throwable, X.C0U74<com.bytedance.android.livesdkapi.depend.model.LiveEffect>>> r20) {
        /*
            r18 = this;
            r4 = r20
            boolean r0 = r4 instanceof X.C0UMZ
            r2 = r18
            if (r0 == 0) goto L96
            r7 = r4
            X.0UMZ r7 = (X.C0UMZ) r7
            int r3 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L96
            int r3 = r3 - r1
            r7.LLILZ = r3
        L16:
            java.lang.Object r0 = r7.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r1 = r7.LLILZ
            r5 = 1
            if (r1 == 0) goto L75
            if (r1 != r5) goto Lbd
            long r3 = r7.LL
            X.C155000ia.LIZIZ(r0)
        L28:
            X.0UMl r0 = (X.C771050UMl) r0
            long r13 = java.lang.System.currentTimeMillis()
            long r13 = r13 - r3
            T r3 = r0.LIZIZ
            if (r3 == 0) goto L9d
            X.0U74 r4 = new X.0U74
            X.0U74<com.bytedance.android.livesdkapi.depend.model.LiveEffect> r1 = r2.LJIIIIZZ
            java.lang.String r5 = r1.LIZ
            java.lang.String r1 = r1.LIZJ
            webcast.data.DefaultEffectListItemStruct r3 = (webcast.data.DefaultEffectListItemStruct) r3
            X.0U74 r1 = r2.LIZIZ(r5, r1, r3)
            java.util.List<T> r10 = r1.LIZIZ
            X.0U74<com.bytedance.android.livesdkapi.depend.model.LiveEffect> r1 = r2.LJIIIIZZ
            java.lang.String r6 = r1.LIZJ
            r7 = 0
            r12 = 248(0xf8, float:3.48E-43)
            r8 = r7
            r9 = r7
            r11 = r7
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r2.LJIIIIZZ = r4
            X.0UC4 r1 = X.C0UC4.LIZ
            java.lang.String r3 = r4.LIZJ
            r11 = 1
            r1 = -1
            java.lang.Integer r15 = X.C2286608xc.LJ(r1)
            java.lang.String r17 = ""
            X.0U74<com.bytedance.android.livesdkapi.depend.model.LiveEffect> r1 = r2.LJIIIIZZ
            java.util.List<T> r1 = r1.LIZIZ
            int r12 = r1.size()
            r16 = r3
            X.C0UC4.LJJIIJZLJL(r11, r12, r13, r15, r16, r17)
            X.0UMl r3 = new X.0UMl
            E r1 = r0.LIZ
            X.0U74<com.bytedance.android.livesdkapi.depend.model.LiveEffect> r0 = r2.LJIIIIZZ
            r3.<init>(r1, r0)
            return r3
        L75:
            X.C155000ia.LIZIZ(r0)
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "Sticker"
            X.C770170UJb.LIZJ(r0)
            java.lang.String r0 = ""
            X.C770170UJb.LIZLLL = r0
            X.0UMC r1 = r2.LIZJ
            java.lang.String r0 = r2.LIZIZ
            r7.LL = r3
            r7.LLILZ = r5
            r5 = r19
            java.lang.Object r0 = r1.LJIIJJI(r0, r5, r7)
            if (r0 != r6) goto L28
            return r6
        L96:
            X.0UMZ r7 = new X.0UMZ
            r7.<init>(r2, r4)
            goto L16
        L9d:
            X.0UC4 r1 = X.C0UC4.LIZ
            java.lang.String r16 = "favorite"
            int r1 = r0.LIZ()
            java.lang.Integer r15 = X.C2286608xc.LJ(r1)
            java.lang.String r17 = r0.LIZIZ()
            X.0UC4 r1 = X.C0UC4.LIZ
            r12 = 0
            r11 = 2
            X.C0UC4.LJJIIJZLJL(r11, r12, r13, r15, r16, r17)
            X.0UMl r2 = new X.0UMl
            E r1 = r0.LIZ
            r0 = 0
            r2.<init>(r1, r0)
            return r2
        Lbd:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMB.LJJIIJZLJL(java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012e A[PHI: r3
      0x012e: PHI (r3v9 ??) = (r3v13 ??), (r3v14 ??), (r3v15 ??) binds: [B:51:0x0116, B:53:0x011e, B:55:0x012c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d0  */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.File, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C767500U8u LJJJJ(tikcast.api.anchor_tool.CategoryEffectsResponse.Data r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMB.LJJJJ(tikcast.api.anchor_tool.CategoryEffectsResponse$Data, boolean):X.0U8u");
    }

    public final C0U74<LiveEffect> LJJJJIZL(LiveEffect liveEffect, boolean z) {
        if (liveEffect != null) {
            liveEffect.getEffectId();
            ArrayList arrayList = new ArrayList(this.LJIIIIZZ.LIZIZ);
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
            C0U74<LiveEffect> c0u74 = this.LJIIIIZZ;
            C0U74<LiveEffect> c0u742 = new C0U74<>(c0u74.LIZ, c0u74.LIZJ, null, null, null, arrayList, null, 248);
            this.LJIIIIZZ = c0u742;
            return c0u742;
        }
        return new C0U74<>("", "", null, null, null, C13BV.INSTANCE, null, 248);
    }

    public final void LJJJJJ(LiveEffect liveEffect, boolean z) {
        if (liveEffect != null) {
            liveEffect.getEffectId();
            ArrayList arrayList = new ArrayList(this.LJIIIZ.LIZIZ);
            if (z) {
                C500260Jjc.LJJJLIIL(arrayList, new AwS591S0100000_12(liveEffect, 101));
                LiveEffect liveEffectLLJZIJLIL = liveEffect.LLJZIJLIL();
                liveEffectLLJZIJLIL.LLJLIL(C0UD4.LJIIL);
                liveEffectLLJZIJLIL.LLJLIL("Recents");
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
            C0U74<LiveEffect> c0u74 = this.LJIIIZ;
            this.LJIIIZ = new C0U74<>(c0u74.LIZ, c0u74.LIZJ, null, null, null, arrayList, null, 248);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0U74<com.bytedance.android.livesdkapi.depend.model.LiveEffect> LIZIZ(java.lang.String r19, java.lang.String r20, webcast.data.DefaultEffectListItemStruct r21) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMB.LIZIZ(java.lang.String, java.lang.String, webcast.data.DefaultEffectListItemStruct):X.0U74");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC401501hF
    public final Object LJIIIZ(String str, String str2, InterfaceC1364105Vn<? super C767500U8u> interfaceC1364105Vn) {
        Object c098200Yq;
        CategoryEffectsResponse.Data data;
        String str3;
        String str4 = this.LIZIZ;
        C770170UJb.LIZJ("Sticker");
        String str5 = "";
        C770170UJb.LIZLLL = "";
        C0UMC c0umc = this.LIZJ;
        c0umc.getClass();
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchCategoryEffectList-");
            sbLIZ.append(str4);
            sbLIZ.append('-');
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            CategoryEffectsResponse categoryEffectsResponse = (CategoryEffectsResponse) C2355009Kq.LJIILIIL(-1, CategoryEffectsResponse.class, strLIZIZ);
            if (categoryEffectsResponse != null && (data = categoryEffectsResponse.data) != null) {
                C0UMC.LIZ(data);
                ConcurrentHashMap<String, String> concurrentHashMap = c0umc.LIZIZ;
                CategoryEffects categoryEffects = data.categoryEffects;
                if (categoryEffects != null && (str3 = categoryEffects.version) != null) {
                    str5 = str3;
                }
                concurrentHashMap.put(strLIZIZ, str5);
            } else {
                data = null;
            }
            c098200Yq = new C771050UMl(null, data, 1);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            c098200Yq = new C771050UMl(thM5exceptionOrNullimpl, null, 2);
        }
        return LJJJJ((CategoryEffectsResponse.Data) ((C771050UMl) c098200Yq).LIZIZ, false);
    }

    @Override // X.InterfaceC401501hF
    public final Object LJIIJ(String str, String str2, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        boolean zLIZIZ;
        C497740JfY.LJII();
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        if (zLIZIZ) {
            C770170UJb.LIZIZ("try to check need update effect");
            return this.LIZJ.LJ(str2, str, interfaceC1364105Vn);
        }
        return false;
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
            boolean r0 = r11 instanceof X.C770960UMc
            if (r0 == 0) goto L2b
            r4 = r11
            X.0UMc r4 = (X.C770960UMc) r4
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
            X.0UMc r4 = new X.0UMc
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
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMB.LJIJI(boolean, com.google.gson.n, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC401501hF
    public final Object LJJIIJ(LiveEffect liveEffect, boolean z, InterfaceC1364105Vn<? super C0U74<LiveEffect>> interfaceC1364105Vn) {
        return LJJJJIZL(liveEffect, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    @Override // X.InterfaceC401501hF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIJIIJIL(com.bytedance.android.livesdkapi.depend.model.LiveEffect r10, boolean r11, X.InterfaceC1364105Vn<? super X.C0U74<com.bytedance.android.livesdkapi.depend.model.LiveEffect>> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof X.C0UMW
            if (r0 == 0) goto L5c
            r6 = r12
            X.0UMW r6 = (X.C0UMW) r6
            int r2 = r6.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5c
            int r2 = r2 - r1
            r6.LLILZIL = r2
        L12:
            java.lang.Object r1 = r6.LLILLL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZIL
            r4 = 1
            if (r0 == 0) goto L40
            if (r0 != r4) goto L69
            boolean r11 = r6.LLILLJJLI
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r10 = r6.LL
            X.C155000ia.LIZIZ(r1)
        L26:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L62
            X.0U74 r0 = new X.0U74
            java.lang.String r1 = ""
            X.13BV r6 = X.C13BV.INSTANCE
            java.lang.String r2 = ""
            r3 = 0
            r8 = 248(0xf8, float:3.48E-43)
            r4 = r3
            r5 = r3
            r7 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        L40:
            X.C155000ia.LIZIZ(r1)
            X.0UMC r3 = r9.LIZJ
            java.lang.String r2 = r9.LIZIZ
            long r0 = r10.getEffectId()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r6.LL = r10
            r6.LLILLJJLI = r11
            r6.LLILZIL = r4
            java.lang.Object r1 = r3.LJIILLIIL(r2, r0, r11, r6)
            if (r1 != r5) goto L26
            return r5
        L5c:
            X.0UMW r6 = new X.0UMW
            r6.<init>(r9, r12)
            goto L12
        L62:
            r0 = r11 ^ 1
            X.0U74 r0 = r9.LJJJJIZL(r10, r0)
            return r0
        L69:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMB.LJJIJIIJIL(com.bytedance.android.livesdkapi.depend.model.LiveEffect, boolean, X.05Vn):java.lang.Object");
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
            boolean r0 = r8 instanceof X.C771020UMi
            if (r0 == 0) goto L4a
            r4 = r8
            X.0UMi r4 = (X.C771020UMi) r4
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
            X.0UMi r4 = new X.0UMi
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
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMB.LJJIZ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
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
            boolean r0 = r9 instanceof X.C0UMY
            if (r0 == 0) goto L4a
            r4 = r9
            X.0UMY r4 = (X.C0UMY) r4
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
            X.0UMY r4 = new X.0UMY
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
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMB.LJI(java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
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
            boolean r0 = r9 instanceof X.C0UMT
            if (r0 == 0) goto L57
            r4 = r9
            X.0UMT r4 = (X.C0UMT) r4
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
            X.0UMT r4 = new X.0UMT
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
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMB.LJJ(java.lang.String, java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC401501hF
    public final Object LJJII(String str, Map map, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        return LJII("trending", str, null, map, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0102  */
    @Override // X.InterfaceC401501hF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(java.lang.String r27, java.lang.String r28, java.lang.String r29, java.util.Map r30, X.InterfaceC1364105Vn r31) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMB.LJII(java.lang.String, java.lang.String, java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
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
            boolean r0 = r3 instanceof X.C0UMU
            if (r0 == 0) goto L64
            r11 = r3
            X.0UMU r11 = (X.C0UMU) r11
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
            X.0UMU r11 = new X.0UMU
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
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMB.LJJIJ(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0106  */
    @Override // X.InterfaceC401501hF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIIZ(java.lang.String r23, java.lang.String r24, java.lang.String r25, java.util.Map<java.lang.String, java.lang.String> r26, boolean r27, boolean r28, X.InterfaceC1364105Vn<? super X.C767500U8u> r29) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMB.LJJIIZ(java.lang.String, java.lang.String, java.lang.String, java.util.Map, boolean, boolean, X.05Vn):java.lang.Object");
    }
}
