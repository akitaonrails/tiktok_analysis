package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Tsm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C760740Tsm implements C0U86 {
    public static final C760740Tsm LIZ = new C760740Tsm();
    public static final Map<String, LiveEffect> LIZIZ = new LinkedHashMap();
    public static final List<LiveEffect> LIZJ = new ArrayList();

    @Override // X.C0U86
    public final void LIZ(LiveEffect liveEffect, String str, boolean z) {
        if (z && Intrinsics.LJFF(str, C0UD4.LIZIZ) && liveEffect != null) {
            List<LiveEffect> list = LIZJ;
            C500260Jjc.LJJJLZIJ(list, new AwS585S0100000_6(liveEffect, 261));
            ((ArrayList) list).add(liveEffect);
        }
    }

    public static Object LIZIZ(final LifecycleOwner lifecycleOwner, final String str, final String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        final C259800zU c259800zU = new C259800zU();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("panel", str2);
        final EffectManager effectManagerLLJILJILJ = ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).LLJILJILJ();
        effectManagerLLJILJILJ.fetchEffectList(Collections.singletonList(str), linkedHashMap, new IFetchEffectListByIdsListener() { // from class: X.0Tsn
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
            public final void onFail(ExceptionResult exceptionResult) {
                InterfaceC1364105Vn<LiveEffect> interfaceC1364105Vn2 = c23260099m;
                C189200o6.m2constructorimpl(null);
                interfaceC1364105Vn2.resumeWith(null);
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
            /* JADX WARN: Type inference failed for: r1v2, types: [T, com.ss.android.ugc.effectmanager.effect.model.Effect] */
            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onSuccess(com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse r14) {
                /*
                    r13 = this;
                    com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse r14 = (com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse) r14
                    java.util.List r0 = r14.getData()
                    java.lang.String r4 = r1
                    java.util.Iterator r2 = r0.iterator()
                Lc:
                    boolean r0 = r2.hasNext()
                    r3 = 0
                    if (r0 == 0) goto Lae
                    java.lang.Object r1 = r2.next()
                    r0 = r1
                    com.ss.android.ugc.effectmanager.effect.model.Effect r0 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r0
                    java.lang.String r0 = r0.getResource_id()
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
                    if (r0 == 0) goto Lc
                L24:
                    com.ss.android.ugc.effectmanager.effect.model.Effect r1 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r1
                    if (r1 == 0) goto L91
                    X.00zU<com.ss.android.ugc.effectmanager.effect.model.Effect> r0 = r2
                    r0.element = r1
                    com.bytedance.android.livesdkapi.depend.model.LiveEffect r9 = X.C0UEO.LIZLLL(r1)
                    boolean r0 = X.C0U7C.LJIJI(r9)
                    r6 = 1
                    r7 = 0
                    if (r0 == 0) goto L91
                    com.bytedance.android.livesdk.livesetting.linkmic.LiveMultiGuestShowStickerOnLowScoreDeviceSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.LiveMultiGuestShowStickerOnLowScoreDeviceSetting.INSTANCE
                    boolean r0 = r0.canShowBroadCastStickers()
                    if (r0 != 0) goto L50
                    com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r9.LIZJ
                    if (r0 == 0) goto Lac
                    java.lang.String r1 = r0.getPanel()
                L48:
                    java.lang.String r0 = X.C0UD4.LJ
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                    if (r0 == 0) goto L91
                L50:
                    if (r9 == 0) goto L91
                    java.lang.String r5 = r1
                    X.00zU<com.ss.android.ugc.effectmanager.effect.model.Effect> r1 = r2
                    X.05Vn<com.bytedance.android.livesdkapi.depend.model.LiveEffect> r8 = r3
                    com.ss.android.ugc.effectmanager.EffectManager r4 = r4
                    androidx.lifecycle.LifecycleOwner r2 = r5
                    java.lang.String r11 = r6
                    java.util.Map<java.lang.String, com.bytedance.android.livesdkapi.depend.model.LiveEffect> r0 = X.C760740Tsm.LIZIZ
                    r0.put(r5, r9)
                    T r1 = r1.element
                    if (r1 == 0) goto L72
                    com.ss.android.ugc.effectmanager.effect.model.Effect[] r0 = new com.ss.android.ugc.effectmanager.effect.model.Effect[r6]
                    r0[r7] = r1
                    java.util.List r0 = X.C1697810uHb.LJIILJJIL(r0)
                    r4.downloadEffectList(r0, r3)
                L72:
                    boolean r0 = X.C767250U7v.LIZLLL(r9)
                    if (r0 == 0) goto La3
                    java.util.List r10 = r9.LIZ()
                    if (r10 == 0) goto L9a
                    androidx.lifecycle.LifecycleCoroutineScope r2 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r2)
                    X.1DFB r1 = X.C0PEM.LIZJ
                    X.0Tsk r7 = new X.0Tsk
                    r12 = 0
                    r7.<init>(r8, r9, r10, r11, r12)
                    r0 = 2
                    X.0956 r0 = X.C23250099c.LIZLLL(r2, r1, r3, r7, r0)
                L8f:
                    if (r0 != 0) goto L99
                L91:
                    X.05Vn<com.bytedance.android.livesdkapi.depend.model.LiveEffect> r0 = r3
                    X.C189200o6.m2constructorimpl(r3)
                    r0.resumeWith(r3)
                L99:
                    return
                L9a:
                    X.C189200o6.m2constructorimpl(r3)
                    r8.resumeWith(r3)
                    kotlin.Unit r0 = kotlin.Unit.LIZ
                    goto L8f
                La3:
                    X.C189200o6.m2constructorimpl(r9)
                    r8.resumeWith(r9)
                    kotlin.Unit r0 = kotlin.Unit.LIZ
                    goto L8f
                Lac:
                    r1 = r3
                    goto L48
                Lae:
                    r1 = r3
                    goto L24
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C760750Tsn.onSuccess(java.lang.Object):void");
            }
        });
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }
}
