package X;

import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0EUc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365360EUc {
    public static final C365360EUc LIZ = new C365360EUc();

    public static List LIZIZ(List list) {
        int i = 0;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    LIZ.getClass();
                    arrayList.add(LIZ(i, (Effect) obj));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static List LIZJ(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            C357590E0f category = ((ResourceItem) it2.next()).getCategory();
            if (category != null) {
                arrayList.add(category);
            }
        }
        return C13LP.LJJJJI(arrayList);
    }

    public static List LIZLLL(List list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) it2.next();
            LIZ.getClass();
            C357590E0f c357590E0f = new C357590E0f(effectCategoryResponse.getName(), effectCategoryResponse.getKey(), effectCategoryResponse.getIcon_normal_url(), null, null, effectCategoryResponse.getExtra(), LIZIZ(effectCategoryResponse.getTotalEffects()), 24);
            List<ResourceItem> list2 = c357590E0f.LJI;
            if (list2 != null) {
                Iterator<ResourceItem> it3 = list2.iterator();
                while (it3.hasNext()) {
                    it3.next().setCategory(c357590E0f);
                }
            }
            arrayList.add(c357590E0f);
        }
        return arrayList;
    }

    public static List LJ(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            Iterable iterable = ((C357590E0f) it2.next()).LJI;
            if (iterable == null) {
                iterable = C13BV.INSTANCE;
            }
            C19719612Di.LJJI(iterable, arrayList);
        }
        return arrayList;
    }

    public static ResourceItem LIZ(int i, Effect effect) {
        String strLIZIZ;
        boolean zOptBoolean;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectLJII;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectLJIIIZ;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectLJIIIZ2;
        JSONObject jSONObjectOptJSONObject3;
        ResourceItem resourceItem = new ResourceItem();
        resourceItem.setOrder(i);
        resourceItem.setName(effect.getName());
        resourceItem.setNameEn(C1639660slo.LIZJ(effect));
        resourceItem.setIcon((String) C13LP.LJJJLL(effect.getIcon_url().getUrlList()));
        resourceItem.setPath(effect.getUnzipPath());
        resourceItem.setStickerType("info");
        resourceItem.setResourceId(effect.getResource_id());
        resourceItem.setEffectId(effect.getEffect_id());
        int i2 = 0;
        for (Effect effect2 : effect.getChildEffects()) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                LIZ.getClass();
                ResourceItem resourceItemLIZ = LIZ(i2, effect2);
                resourceItemLIZ.setParentResource(resourceItem);
                resourceItem.getChildResources().add(resourceItemLIZ);
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C1446130njf.LIZ.getClass();
        String strLJFF = C1446130njf.LJFF(effect, "resourceType");
        String strLJFF2 = C1446130njf.LJFF(effect, "resoureType");
        if (TextUtils.isEmpty(strLJFF)) {
            strLJFF = strLJFF2;
        }
        resourceItem.mask = strLJFF;
        String strLJFF3 = C1446130njf.LJFF(effect, "prefix");
        String str = "";
        if (strLJFF3 == null) {
            strLJFF3 = "";
        }
        String strLJFF4 = C1446130njf.LJFF(effect, "selected_icon");
        if (strLJFF4 == null) {
            strLJFF4 = "";
        }
        if (a0.LJJJIL(strLJFF4) || a0.LJJJIL(strLJFF3)) {
            strLIZIZ = "";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJFF3);
            sbLIZ.append(strLJFF4);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        resourceItem.selectedIcon = strLIZIZ;
        String extra = effect.getExtra();
        if (extra == null) {
            extra = "";
        }
        resourceItem.extra = extra;
        String sdkExtra = effect.getSdkExtra();
        if (sdkExtra == null) {
            sdkExtra = "";
        }
        resourceItem.sdkExtra = sdkExtra;
        resourceItem.designerId = effect.getDesigner_id();
        resourceItem.source = effect.getSource();
        if ((!a0.LJJJIL(effect.getSdkExtra())) && (jSONObjectLJIIIZ2 = C1446130njf.LJIIIZ(effect)) != null && (jSONObjectOptJSONObject3 = jSONObjectLJIIIZ2.optJSONObject("transition")) != null) {
            zOptBoolean = jSONObjectOptJSONObject3.optBoolean("isOverlap", false);
        } else {
            zOptBoolean = false;
        }
        resourceItem.overlap = zOptBoolean;
        double dOptDouble = 1.0d;
        if ((!a0.LJJJIL(effect.getSdkExtra())) && (jSONObjectLJIIIZ = C1446130njf.LJIIIZ(effect)) != null && (jSONObjectOptJSONObject2 = jSONObjectLJIIIZ.optJSONObject("transition")) != null) {
            dOptDouble = jSONObjectOptJSONObject2.optDouble("defaultDura", 1.0d);
        }
        resourceItem.transitionDefaultDuration = Double.valueOf(dOptDouble);
        String strLJFF5 = C1446130njf.LJFF(effect, "game_play_type");
        if (strLJFF5 != null) {
            str = strLJFF5;
        }
        resourceItem.gameplayType = str;
        if (effect.getExtra() != null && (jSONObjectLJII = C1446130njf.LJII(effect)) != null && (jSONArrayOptJSONArray = jSONObjectLJII.optJSONArray("resource_type")) != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i4 = 0; i4 < length; i4++) {
                String strOptString = jSONArrayOptJSONArray.optString(i4);
                if (strOptString != null && (!a0.LJJJIL(strOptString))) {
                    resourceItem.magicResourceTypeList.add(strOptString);
                }
            }
        }
        double dOptDouble2 = 0.5d;
        if (!a0.LJJJIL(effect.getSdkExtra())) {
            C1446130njf.LIZ.getClass();
            JSONObject jSONObjectLJIIIZ3 = C1446130njf.LJIIIZ(effect);
            if (jSONObjectLJIIIZ3 != null && (jSONObjectOptJSONObject = jSONObjectLJIIIZ3.optJSONObject("setting")) != null) {
                dOptDouble2 = jSONObjectOptJSONObject.optDouble("animation_duration", 0.5d);
            }
        }
        resourceItem.videoAnimDefaultDuration = Double.valueOf(dOptDouble2);
        resourceItem.setHint(effect.getHint());
        return resourceItem;
    }
}
