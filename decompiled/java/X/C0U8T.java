package X;

import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.StickerSelectChannel;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdk.dataChannel.StickerCancelChannel;
import com.bytedance.android.livesdk.dataChannel.StickerSelectedEvent;
import com.bytedance.android.livesdk.livesetting.watchlive.HideEffectEntrySetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0U8T, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U8T implements C0UEA {
    public static DataChannel LIZLLL;
    public static final C0U8T LIZ = new C0U8T();
    public static final C0UDQ LIZIZ = new C0UDQ();
    public static final ConcurrentHashMap<String, LiveEffect> LIZJ = new ConcurrentHashMap<>();
    public static final C01GW LJ = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(381));

    @Override // X.C0UEA
    public final void LJII() {
        C767760U9u.LJ = true;
    }

    @Override // X.C0UEA
    public final void LJIIJ() {
        C767760U9u.LIZJ = -1;
    }

    @Override // X.C0UEA
    public final void Kc(Map map) {
        List listLJJLIIIJILLIZJL;
        List listLJJLIIIJILLIZJL2;
        String strLJJJLZIJ;
        String strLJJJLZIJ2;
        C760600TsY c760600TsY = (C760600TsY) LJ.getValue();
        c760600TsY.getClass();
        String str = (String) map.get("category");
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1393028996) {
                if (iHashCode != -1306084975) {
                    if (iHashCode == -1274492040 && str.equals("filter")) {
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C760620Tsa(map, c760600TsY, null), 3);
                        return;
                    }
                } else if (str.equals("effect")) {
                    String str2 = (String) map.get("fail_tips");
                    String str3 = (String) map.get("resource_id");
                    String str4 = (String) map.get("tab_key");
                    String str5 = (String) map.get("from");
                    if (str3 == null || str3.length() == 0 || ((str4 == null || str4.length() == 0) && !Intrinsics.LJFF(str5, "play_book"))) {
                        C760600TsY.LIZ(str2);
                        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
                        if (iBroadcastService == null) {
                            return;
                        }
                        iBroadcastService.notifyApplyStatusAndSaveStatus(EnumC773040UUc.EFFECTS, EnumC771230UNd.APPLY_FAILED, null);
                        return;
                    }
                    String str6 = (String) map.get("panel_name");
                    if (str6 == null) {
                        str6 = C0UD4.LIZIZ;
                    }
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C760590TsX(str3, str6, str4, str5, c760600TsY, map, str2, null), 3);
                    return;
                }
            } else if (str.equals("beauty")) {
                if (map.containsKey("resource_id_list") && map.containsKey("tag_value_list")) {
                    String str7 = (String) map.get("resource_id_list");
                    if (str7 != null && (strLJJJLZIJ2 = a0.LJJJLZIJ(e3.e, e3.f, str7)) != null) {
                        listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLJJJLZIJ2, new String[]{","}, 0, 6);
                    } else {
                        listLJJLIIIJILLIZJL = null;
                    }
                    String str8 = (String) map.get("tag_value_list");
                    if (str8 != null && (strLJJJLZIJ = a0.LJJJLZIJ(e3.e, e3.f, str8)) != null) {
                        listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(strLJJJLZIJ, new String[]{","}, 0, 6);
                    } else {
                        listLJJLIIIJILLIZJL2 = null;
                    }
                    if (listLJJLIIIJILLIZJL != null && listLJJLIIIJILLIZJL2 != null && listLJJLIIIJILLIZJL.size() == listLJJLIIIJILLIZJL2.size()) {
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C760550TsT(listLJJLIIIJILLIZJL, listLJJLIIIJILLIZJL2, new C013C(), c760600TsY, map, null), 3);
                        return;
                    } else {
                        C760600TsY.LIZ((String) map.get("fail_tips"));
                        return;
                    }
                }
                C760600TsY.LIZ((String) map.get("fail_tips"));
                return;
            }
        }
        C760600TsY.LIZ((String) map.get("fail_tips"));
    }

    @Override // X.C0UEA
    public final boolean LIZIZ(Effect effect) {
        EffectManager effectManager = LIZIZ.LIZ;
        if (effectManager != null) {
            return effectManager.isEffectDownloaded(effect);
        }
        return true;
    }

    @Override // X.C0UEA
    public final Object LIZ(String str, InterfaceC1364105Vn<? super LiveEffect> interfaceC1364105Vn) {
        return C0U60.LIZ().UQ2(LIZLLL, str, interfaceC1364105Vn);
    }

    @Override // X.C0UEA
    public final void LIZLLL(List<String> list, Function1<? super List<? extends LiveEffect>, Unit> function1) {
        StickerEffectViewModel stickerEffectViewModelLIZ = C0U60.LIZ();
        stickerEffectViewModelLIZ.getClass();
        if (HideEffectEntrySetting.INSTANCE.shouldHide()) {
            if (function1 != null) {
                function1.invoke(C13BV.INSTANCE);
            }
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchEffectList: ");
            sbLIZ.append(list);
            C20441214yg.LIZIZ("StickerEffectViewModel", C2188811AlT.LIZIZ(sbLIZ));
            C23250099c.LIZIZ(ViewModelKt.getViewModelScope(stickerEffectViewModelLIZ), C0PEM.LIZJ, null, new C398601gm(list, stickerEffectViewModelLIZ, function1, null), 2);
        }
    }

    @Override // X.C0UEA
    public final Object LJ(List<String> list, InterfaceC1364105Vn<? super List<? extends LiveEffect>> interfaceC1364105Vn) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        LIZ.LIZLLL(list, new AwS591S0100000_12(c23260099m, 959));
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    @Override // X.C0UEA
    public final boolean LJIIIIZZ(String str, String str2) {
        String resourceId;
        LiveEffect liveEffect = (LiveEffect) C13LP.LJJJLL(C0UA1.LIZ().qr(str2));
        if (liveEffect != null) {
            resourceId = liveEffect.getResourceId();
        } else {
            resourceId = null;
        }
        return Intrinsics.LJFF(resourceId, str);
    }

    public static LiveEffect LJIILLIIL(FetchFavoriteListResponse fetchFavoriteListResponse, String str, String str2) {
        Object next;
        C0U74<LiveEffect> c0u74LIZ = new C767340U8e(str2, str2).LIZ(fetchFavoriteListResponse);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c0u74LIZ.LIZIZ);
        arrayList.addAll(c0u74LIZ.LJI);
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((LiveEffect) next).getResourceId(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (LiveEffect) next;
    }

    public static LiveEffect LJIIZILJ(CategoryPageModel categoryPageModel, String str, String str2) {
        List<Effect> effects;
        List<Effect> collectEffects;
        C767340U8e c767340U8e = new C767340U8e(str2, str2);
        CategoryEffectModel categoryEffects = categoryPageModel.getCategoryEffects();
        Object obj = null;
        if (categoryEffects != null) {
            effects = categoryEffects.getEffects();
        } else {
            effects = null;
        }
        CategoryEffectModel categoryEffects2 = categoryPageModel.getCategoryEffects();
        if (categoryEffects2 != null) {
            collectEffects = categoryEffects2.getCollectEffects();
        } else {
            collectEffects = null;
        }
        C0U74<LiveEffect> c0u74LIZJ = c767340U8e.LIZJ(effects, collectEffects);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c0u74LIZJ.LIZIZ);
        arrayList.addAll(c0u74LIZJ.LJI);
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.LJFF(((LiveEffect) next).getResourceId(), str)) {
                obj = next;
                break;
            }
        }
        return (LiveEffect) obj;
    }

    public static LiveEffect LJIJ(EffectChannelResponse effectChannelResponse, String str, String str2) {
        C0U74 c0u74;
        String str3 = C0UD4.LIZ;
        if (Intrinsics.LJFF(str, "livefiltercomposerexperiment")) {
            c0u74 = (C0U74) C13LP.LJJJLL(new C0U49().LJI(effectChannelResponse));
        } else if (Intrinsics.LJFF(str, C0UD4.LJFF)) {
            c0u74 = (C0U74) C13LP.LJJJLL(new C0U8J(true).LJI(effectChannelResponse));
        } else {
            c0u74 = (C0U74) C13LP.LJJJLL(new C0U6E().LJI(effectChannelResponse));
        }
        Object obj = null;
        if (c0u74 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c0u74.LIZIZ);
        arrayList.addAll(c0u74.LJI);
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.LJFF(((LiveEffect) next).getResourceId(), str2)) {
                obj = next;
                break;
            }
        }
        return (LiveEffect) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    @Override // X.C0UEA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(java.lang.String r6, java.lang.String r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C0U8Y
            if (r0 == 0) goto L55
            r4 = r8
            X.0U8Y r4 = (X.C0U8Y) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L55
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r1 = 1
            if (r0 == 0) goto L43
            if (r0 != r1) goto L5b
            java.lang.Object r6 = r4.LL
            java.lang.String r6 = (java.lang.String) r6
            X.C155000ia.LIZIZ(r3)
        L26:
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = X.C13LP.LJJJLL(r3)
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r2 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r2
            if (r2 == 0) goto L40
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = X.C0U8T.LIZLLL
            if (r1 == 0) goto L39
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.StickerCancelChannel> r0 = com.bytedance.android.livesdk.dataChannel.StickerCancelChannel.class
            r1.LC0(r0, r2)
        L39:
            X.0U78 r0 = X.C0UA1.LIZ()
            r0.LJIIJ(r2, r6)
        L40:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L43:
            X.C155000ia.LIZIZ(r3)
            java.util.List r0 = java.util.Collections.singletonList(r7)
            r4.LL = r6
            r4.LLILZ = r1
            java.lang.Object r3 = r5.LJ(r0, r4)
            if (r3 != r2) goto L26
            return r2
        L55:
            X.0U8Y r4 = new X.0U8Y
            r4.<init>(r5, r8)
            goto L12
        L5b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U8T.LJIIIZ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a3, code lost:
    
        if (r8 == null) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043 A[PHI: r8 r10
      0x0043: PHI (r8v11 java.lang.Object) = (r8v1 java.lang.Object), (r8v6 java.lang.Object), (r8v12 java.lang.Object) binds: [B:24:0x0064, B:37:0x00a3, B:18:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0043: PHI (r10v4 ??) = (r10v0 ??), (r10v2 ??), (r10v5 ??) binds: [B:24:0x0064, B:37:0x00a3, B:18:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cf  */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.01hF] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.String] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(java.lang.String r10, java.lang.String r11, X.InterfaceC1364105Vn<? super com.bytedance.android.livesdkapi.depend.model.LiveEffect> r12) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U8T.LJIILIIL(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    public static void LJIIJJI(LiveEffect liveEffect, String str, String str2, boolean z) {
        DataChannel dataChannel;
        if (Intrinsics.LJFF(C13LP.LJJJLL(C0UA1.LIZ().qr(str)), liveEffect)) {
            if (z) {
                C0UA1.LIZ().LJIIJ(liveEffect, str);
                DataChannel dataChannel2 = LIZLLL;
                if (dataChannel2 != null) {
                    dataChannel2.LC0(StickerCancelChannel.class, liveEffect);
                    return;
                }
                return;
            }
            return;
        }
        C0UA1.LIZ().LJIIIIZZ(liveEffect, str);
        DataChannel dataChannel3 = LIZLLL;
        if (dataChannel3 != null) {
            dataChannel3.zW(StickerSelectChannel.class, liveEffect);
        }
        if (C767250U7v.LJI(liveEffect) || (dataChannel = LIZLLL) == null) {
            return;
        }
        dataChannel.LC0(StickerSelectedEvent.class, new C0UCF(liveEffect, C0UD4.LIZIZ, str2, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    @Override // X.C0UEA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r6, java.lang.String r7, java.lang.String r8, X.InterfaceC1364105Vn<? super com.bytedance.android.livesdkapi.depend.model.LiveEffect> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C767300U8a
            if (r0 == 0) goto L37
            r4 = r9
            X.0U8a r4 = (X.C767300U8a) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L37
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L23
            if (r0 != r1) goto L3d
            X.C155000ia.LIZIZ(r3)
        L22:
            return r3
        L23:
            X.C155000ia.LIZIZ(r3)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.android.livesdkapi.depend.model.LiveEffect> r0 = X.C0U8T.LIZJ
            java.lang.Object r3 = r0.get(r6)
            if (r3 != 0) goto L22
            r4.LLILLL = r1
            java.lang.Object r3 = r5.LJIILL(r6, r7, r8, r4)
            if (r3 != r2) goto L22
            return r2
        L37:
            X.0U8a r4 = new X.0U8a
            r4.<init>(r5, r9)
            goto L12
        L3d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U8T.LIZJ(java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    @Override // X.C0UEA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(java.lang.String r8, java.lang.String r9, java.lang.String r10, X.InterfaceC1364105Vn<? super java.lang.Boolean> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof X.C0U8Z
            if (r0 == 0) goto L6a
            r5 = r11
            X.0U8Z r5 = (X.C0U8Z) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6a
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r2 = r5.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r4 = 1
            r3 = 3
            r1 = 2
            if (r0 == 0) goto L29
            if (r0 == r4) goto L78
            if (r0 == r1) goto L4a
            if (r0 != r3) goto L70
            X.C155000ia.LIZIZ(r2)
        L28:
            return r2
        L29:
            X.C155000ia.LIZIZ(r2)
            com.bytedance.android.livesdk.livesetting.effect.LiveEffectAdaptiveSetting r0 = com.bytedance.android.livesdk.livesetting.effect.LiveEffectAdaptiveSetting.INSTANCE
            boolean r0 = r0.enable()
            if (r0 == 0) goto L41
            com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel r0 = X.C0U60.LIZ()
            r5.LLILLL = r4
            java.lang.Object r2 = r0.DQ2(r8, r9, r10, r5)
            if (r2 != r6) goto L7b
            return r6
        L41:
            r5.LLILLL = r1
            java.lang.Object r2 = r7.LJIIL(r8, r9, r10, r5)
            if (r2 != r6) goto L4d
            return r6
        L4a:
            X.C155000ia.LIZIZ(r2)
        L4d:
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r2 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r2
            if (r2 == 0) goto L8b
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r2.LIZJ
            if (r2 == 0) goto L8b
            X.0UDQ r1 = X.C0U8T.LIZIZ
            com.ss.android.ugc.effectmanager.EffectManager r0 = r1.LIZ
            if (r0 == 0) goto L86
            boolean r0 = r0.isEffectDownloaded(r2)
            if (r0 != 0) goto L86
            r5.LLILLL = r3
            java.lang.Object r2 = r1.LIZJ(r2, r5)
            if (r2 != r6) goto L28
            return r6
        L6a:
            X.0U8Z r5 = new X.0U8Z
            r5.<init>(r7, r11)
            goto L12
        L70:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L78:
            X.C155000ia.LIZIZ(r2)
        L7b:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L86:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L8b:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U8T.LJI(java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        if (r3 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cc, code lost:
    
        if (((java.lang.Boolean) r0).booleanValue() == false) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022d A[PHI: r3 r7 r15
      0x022d: PHI (r3v14 com.bytedance.android.livesdkapi.depend.model.LiveEffect) = 
      (r3v15 com.bytedance.android.livesdkapi.depend.model.LiveEffect)
      (r3v28 com.bytedance.android.livesdkapi.depend.model.LiveEffect)
     binds: [B:88:0x022b, B:77:0x01f7] A[DONT_GENERATE, DONT_INLINE]
      0x022d: PHI (r7v21 java.lang.String) = (r7v22 java.lang.String), (r7v0 java.lang.String) binds: [B:88:0x022b, B:77:0x01f7] A[DONT_GENERATE, DONT_INLINE]
      0x022d: PHI (r15v20 java.lang.Object) = (r15v21 java.lang.String), (r15v0 java.lang.String) binds: [B:88:0x022b, B:77:0x01f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v52 */
    /* JADX WARN: Type inference failed for: r15v53 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(java.lang.String r15, java.lang.String r16, java.lang.String r17, X.InterfaceC1364105Vn<? super com.bytedance.android.livesdkapi.depend.model.LiveEffect> r18) {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U8T.LJIIL(java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILL(java.lang.String r7, java.lang.String r8, java.lang.String r9, X.InterfaceC1364105Vn<? super com.bytedance.android.livesdkapi.depend.model.LiveEffect> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof X.C0U8X
            if (r0 == 0) goto L5f
            r5 = r10
            X.0U8X r5 = (X.C0U8X) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5f
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L12:
            java.lang.Object r4 = r5.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L36
            if (r0 == r1) goto L6f
            if (r0 != r2) goto L67
            java.lang.Object r9 = r5.LLILLJJLI
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r7 = r5.LL
            java.lang.String r7 = (java.lang.String) r7
            X.C155000ia.LIZIZ(r4)
        L2d:
            com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r4 = (com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel) r4
            if (r4 == 0) goto L65
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = LJIIZILJ(r4, r7, r9)
            return r0
        L36:
            X.C155000ia.LIZIZ(r4)
            com.bytedance.android.livesdk.livesetting.effect.LiveEffectAdaptiveSetting r0 = com.bytedance.android.livesdk.livesetting.effect.LiveEffectAdaptiveSetting.INSTANCE
            boolean r0 = r0.enable()
            if (r0 == 0) goto L50
            com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel r0 = X.C0U60.LIZ()
            r5.LLILZIL = r1
            X.01hF r0 = r0.LLILZ
            java.lang.Object r4 = r0.LJI(r7, r8, r9, r5)
            if (r4 != r3) goto L72
            return r3
        L50:
            X.0UDQ r0 = X.C0U8T.LIZIZ
            r5.LL = r7
            r5.LLILLJJLI = r9
            r5.LLILZIL = r2
            java.lang.Object r4 = r0.LJ(r8, r9, r5)
            if (r4 != r3) goto L2d
            return r3
        L5f:
            X.0U8X r5 = new X.0U8X
            r5.<init>(r6, r10)
            goto L12
        L65:
            r0 = 0
            return r0
        L67:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L6f:
            X.C155000ia.LIZIZ(r4)
        L72:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U8T.LJIILL(java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    public static Object LJIJI(int i, String str, String str2, String str3, InterfaceC1364105Vn interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C760440TsI(i, str3, str, str2, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(java.lang.String r9, java.util.List<java.lang.String> r10, java.lang.String r11, java.util.Map<java.lang.String, java.lang.String> r12, X.InterfaceC1364105Vn<? super java.util.List<? extends com.bytedance.android.livesdkapi.depend.model.LiveEffect>> r13) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U8T.LJIILJJIL(java.lang.String, java.util.List, java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }

    @Override // X.C0UEA
    public final Object LJFF(String str, String str2, String str3, InterfaceC1364105Vn interfaceC1364105Vn, Function0 function0, Function1 function1, Function1 function12, boolean z, boolean z2) {
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C760430TsH(str2, str, str3, null, function0, function1, function12, z2, z));
    }
}
