package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0U6E, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U6E implements C0U3X<LiveEffect> {
    @Override // X.C0U3X
    public final List<C0U74<LiveEffect>> LJI(EffectChannelResponse effectChannelResponse) {
        String panel;
        List<EffectCategoryResponse> categoryResponseList;
        String tagsUpdateTime;
        List arrayList;
        ArrayList arrayList2;
        List<Effect> collections;
        List<Effect> allCategoryEffects;
        List arrayList3;
        ArrayList arrayList4;
        List<Effect> collections2;
        List<Effect> allCategoryEffects2;
        C770170UJb.LIZJ("Sticker");
        C770170UJb.LIZLLL = "";
        ArrayList arrayList5 = new ArrayList();
        if (effectChannelResponse != null) {
            panel = effectChannelResponse.getPanel();
        } else {
            panel = null;
        }
        if (Intrinsics.LJFF(panel, C0UD4.LJ)) {
            if (effectChannelResponse != null && (allCategoryEffects2 = effectChannelResponse.getAllCategoryEffects()) != null) {
                ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(allCategoryEffects2, 10));
                Iterator<Effect> it2 = allCategoryEffects2.iterator();
                while (it2.hasNext()) {
                    LiveEffect liveEffectLIZLLL = C0UEO.LIZLLL(it2.next());
                    String str = C0UD4.LJ;
                    liveEffectLIZLLL.LLJLIL(str);
                    liveEffectLIZLLL.LJIIJJI(str);
                    arrayList6.add(liveEffectLIZLLL);
                }
                arrayList3 = C0U7C.LJ(arrayList6);
            } else {
                arrayList3 = new ArrayList();
            }
            if (effectChannelResponse != null && (collections2 = effectChannelResponse.getCollections()) != null) {
                arrayList4 = new ArrayList(C15438062q.LJIJJ(collections2, 10));
                Iterator<Effect> it3 = collections2.iterator();
                while (it3.hasNext()) {
                    LiveEffect liveEffectLIZLLL2 = C0UEO.LIZLLL(it3.next());
                    String str2 = C0UD4.LJ;
                    liveEffectLIZLLL2.LLJLIL(str2);
                    liveEffectLIZLLL2.LJIIJJI(str2);
                    arrayList4.add(liveEffectLIZLLL2);
                }
            } else {
                arrayList4 = new ArrayList();
            }
            String str3 = C0UD4.LJ;
            C0U7C.LJIIZILJ(arrayList3, arrayList4, str3);
            arrayList5.add(new C0U74(str3, str3, "", "", "", arrayList3, arrayList4, 128));
        } else {
            if (Intrinsics.LJFF(panel, "livehorizontaleffects")) {
                if (effectChannelResponse != null && (allCategoryEffects = effectChannelResponse.getAllCategoryEffects()) != null) {
                    ArrayList arrayList7 = new ArrayList(C15438062q.LJIJJ(allCategoryEffects, 10));
                    Iterator<Effect> it4 = allCategoryEffects.iterator();
                    while (it4.hasNext()) {
                        LiveEffect liveEffectLIZLLL3 = C0UEO.LIZLLL(it4.next());
                        liveEffectLIZLLL3.LLJLIL("livehorizontaleffects");
                        liveEffectLIZLLL3.LJIIJJI("livehorizontaleffects");
                        arrayList7.add(liveEffectLIZLLL3);
                    }
                    arrayList = C0U7C.LJ(arrayList7);
                } else {
                    arrayList = new ArrayList();
                }
                if (effectChannelResponse != null && (collections = effectChannelResponse.getCollections()) != null) {
                    arrayList2 = new ArrayList(C15438062q.LJIJJ(collections, 10));
                    Iterator<Effect> it5 = collections.iterator();
                    while (it5.hasNext()) {
                        LiveEffect liveEffectLIZLLL4 = C0UEO.LIZLLL(it5.next());
                        liveEffectLIZLLL4.LLJLIL("livehorizontaleffects");
                        liveEffectLIZLLL4.LJIIJJI("livehorizontaleffects");
                        arrayList2.add(liveEffectLIZLLL4);
                    }
                } else {
                    arrayList2 = new ArrayList();
                }
                C0U7C.LJIIZILJ(arrayList, arrayList2, "livehorizontaleffects");
                arrayList5.add(new C0U74("livehorizontaleffects", "livehorizontaleffects", "", "", "", arrayList, arrayList2, 128));
                return arrayList5;
            }
            if (effectChannelResponse != null && (categoryResponseList = effectChannelResponse.getCategoryResponseList()) != null) {
                for (EffectCategoryResponse effectCategoryResponse : categoryResponseList) {
                    List<Effect> totalEffects = effectCategoryResponse.getTotalEffects();
                    ArrayList arrayList8 = new ArrayList(C15438062q.LJIJJ(totalEffects, 10));
                    Iterator<Effect> it6 = totalEffects.iterator();
                    while (it6.hasNext()) {
                        LiveEffect liveEffectLIZLLL5 = C0UEO.LIZLLL(it6.next());
                        liveEffectLIZLLL5.LLJLIL(effectCategoryResponse.getName());
                        liveEffectLIZLLL5.LJIIJJI(effectCategoryResponse.getKey());
                        C767250U7v.LIZIZ(1, liveEffectLIZLLL5);
                        arrayList8.add(liveEffectLIZLLL5);
                    }
                    List<LiveEffect> listLIZLLL = C0U7C.LIZLLL(arrayList8);
                    List<Effect> collectionEffect = effectCategoryResponse.getCollectionEffect();
                    ArrayList arrayList9 = new ArrayList(C15438062q.LJIJJ(collectionEffect, 10));
                    Iterator<Effect> it7 = collectionEffect.iterator();
                    while (it7.hasNext()) {
                        LiveEffect liveEffectLIZLLL6 = C0UEO.LIZLLL(it7.next());
                        liveEffectLIZLLL6.LLJLIL(effectCategoryResponse.getName());
                        liveEffectLIZLLL6.LJIIJJI(effectCategoryResponse.getKey());
                        C767250U7v.LIZIZ(1, liveEffectLIZLLL6);
                        arrayList9.add(liveEffectLIZLLL6);
                    }
                    C0U7C.LJIIZILJ(listLIZLLL, arrayList9, effectCategoryResponse.getKey());
                    if ((!((ArrayList) listLIZLLL).isEmpty()) && (tagsUpdateTime = effectCategoryResponse.getTagsUpdateTime()) != null) {
                        arrayList5.add(new C0U74(effectCategoryResponse.getName(), effectCategoryResponse.getKey(), "", effectCategoryResponse.getId(), tagsUpdateTime, listLIZLLL, arrayList9, 128));
                    }
                }
            }
        }
        return arrayList5;
    }
}
