package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0EUd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365370EUd {
    public static final List<ResourceItem> LIZIZ(List<? extends Effect> list) {
        int i = 0;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Effect effect : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    arrayList.add(LIZ(i, effect));
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

    public static final ResourceItem LIZ(int i, Effect effect) {
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

    public static final void LIZJ(InterfaceC1635390sev interfaceC1635390sev, final InterfaceC365520EUs interfaceC365520EUs) {
        InterfaceC1635410sex interfaceC1635410sex;
        interfaceC365520EUs.onStart();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lyrics_style");
        sbLIZ.append("all");
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (C365460EUm.LJI(strLIZIZ)) {
            interfaceC365520EUs.LIZIZ(LIZIZ(C365460EUm.LJFF(strLIZIZ)), true);
            return;
        }
        IFetchCategoryEffectListener iFetchCategoryEffectListener = new IFetchCategoryEffectListener() { // from class: X.0EUr
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
            public final void onFail(ExceptionResult exceptionResult) {
                Exception exception;
                int errorCode;
                InterfaceC365520EUs<ResourceItem> interfaceC365520EUs2 = interfaceC365520EUs;
                if (interfaceC365520EUs2 != null) {
                    if (exceptionResult != null) {
                        exception = exceptionResult.getException();
                        errorCode = exceptionResult.getErrorCode();
                    } else {
                        exception = null;
                        errorCode = -1;
                    }
                    interfaceC365520EUs2.LIZ(new C0EDV(exception, errorCode));
                }
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(CategoryPageModel categoryPageModel) {
                List<Effect> arrayList;
                CategoryEffectModel category_effects;
                CategoryPageModel categoryPageModel2 = categoryPageModel;
                if (categoryPageModel2 == null || (category_effects = categoryPageModel2.getCategory_effects()) == null || (arrayList = category_effects.getCategory_effects()) == null) {
                    arrayList = new ArrayList<>();
                }
                C365460EUm.LIZIZ(strLIZIZ, arrayList);
                InterfaceC365520EUs<ResourceItem> interfaceC365520EUs2 = interfaceC365520EUs;
                if (interfaceC365520EUs2 != null) {
                    interfaceC365520EUs2.LIZIZ(C365370EUd.LIZIZ(arrayList), false);
                }
            }
        };
        if ((interfaceC1635390sev instanceof InterfaceC1635410sex) && (interfaceC1635410sex = (InterfaceC1635410sex) interfaceC1635390sev) != null && interfaceC1635410sex.zg("lyrics_style", "all")) {
            C1635120seU.LIZ(0, 0, 0, 0, iFetchCategoryEffectListener, interfaceC1635390sev, "lyrics_style", "all", CardStruct.IStatusCode.DEFAULT, null, false);
        } else {
            C1635120seU.LIZLLL(0, 0, 0, 0, iFetchCategoryEffectListener, interfaceC1635390sev, "lyrics_style", "all", CardStruct.IStatusCode.DEFAULT, null);
        }
    }
}
