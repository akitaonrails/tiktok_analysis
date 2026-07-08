package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0U8g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C767360U8g implements InterfaceC396201gO<C0U74<LiveEffect>> {
    public final CopyOnWriteArrayList<C0U74<LiveEffect>> LIZ = new CopyOnWriteArrayList<>();
    public final C0UDQ LIZIZ = new C0UDQ();

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r6, X.InterfaceC1364105Vn<? super java.util.List<? extends com.bytedance.android.livesdkapi.depend.model.LiveEffect>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C767370U8h
            if (r0 == 0) goto L3f
            r4 = r7
            X.0U8h r4 = (X.C767370U8h) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZ
            r0 = 1
            if (r1 == 0) goto L2d
            if (r1 != r0) goto L45
            java.lang.Object r6 = r4.LL
            java.lang.String r6 = (java.lang.String) r6
            X.C155000ia.LIZIZ(r3)
        L26:
            com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r3 = (com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel) r3
            java.util.List r0 = r5.LIZJ(r3, r6)
            return r0
        L2d:
            X.C155000ia.LIZIZ(r3)
            X.0UDQ r1 = r5.LIZIZ
            r4.LL = r6
            r4.LLILZ = r0
            java.lang.String r0 = "tiktok_live_boards"
            java.lang.Object r3 = r1.LJ(r0, r6, r4)
            if (r3 != r2) goto L26
            return r2
        L3f:
            X.0U8h r4 = new X.0U8h
            r4.<init>(r5, r7)
            goto L12
        L45:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C767360U8g.LIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r22, X.InterfaceC1364105Vn<? super java.util.List<? extends com.bytedance.android.livesdkapi.depend.model.LiveEffect>> r23) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C767360U8g.LIZIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List, java.util.List<com.bytedance.android.livesdkapi.depend.model.LiveEffect>] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    public final List<LiveEffect> LIZJ(CategoryPageModel categoryPageModel, String str) {
        ?? arrayList;
        CategoryEffectModel categoryEffects;
        List<Effect> effects;
        CategoryEffectModel categoryEffects2;
        String category_key;
        String str2 = str;
        if (categoryPageModel != null && (categoryEffects2 = categoryPageModel.getCategoryEffects()) != null && (category_key = categoryEffects2.getCategory_key()) != null) {
            str2 = category_key;
        }
        C0U74<LiveEffect> c0u74 = null;
        if (categoryPageModel != null && (categoryEffects = categoryPageModel.getCategoryEffects()) != null && (effects = categoryEffects.getEffects()) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(effects, 10));
            Iterator<Effect> it2 = effects.iterator();
            while (it2.hasNext()) {
                LiveEffect liveEffectLIZLLL = C0UEO.LIZLLL(it2.next());
                liveEffectLIZLLL.LLJLIL("tiktok_live_boards");
                liveEffectLIZLLL.LJIIJJI(str2);
                C767250U7v.LIZIZ(1, liveEffectLIZLLL);
                arrayList.add(liveEffectLIZLLL);
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        Iterator<C0U74<LiveEffect>> it3 = this.LIZ.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            C0U74<LiveEffect> next = it3.next();
            if (Intrinsics.LJFF(next.LIZJ, str2)) {
                c0u74 = next;
                break;
            }
        }
        this.LIZ.remove(c0u74);
        this.LIZ.add(new C0U74<>("tiktok_live_boards", str2, null, null, null, arrayList, null, 248));
        return arrayList;
    }
}
