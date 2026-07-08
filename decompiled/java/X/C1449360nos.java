package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nos, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1449360nos {
    public static final C1444900nhg LIZ(InterfaceC1624480sNK interfaceC1624480sNK, C1625440sOs c1625440sOs, int i) {
        InterfaceC1633140sbI interfaceC1633140sbILJFF = interfaceC1624480sNK.getStickerRepository().LJFF();
        String id = "1000001";
        if (!TextUtils.isEmpty(c1625440sOs.LIZ.getSearchType())) {
            return new C1444900nhg("1000001", "sticker_category:search");
        }
        if (i >= 0 && i < C23117093z.LJFF(interfaceC1633140sbILJFF).size()) {
            EffectCategoryModel effectCategoryModel = (EffectCategoryModel) ListProtector.get(C23117093z.LJFF(interfaceC1633140sbILJFF), i);
            String key = effectCategoryModel.getKey();
            if (!Intrinsics.LJFF(key, "sticker_category:search")) {
                if (Intrinsics.LJFF(key, "sticker_category:favorite")) {
                    id = "1000000";
                } else {
                    id = effectCategoryModel.getId();
                }
            }
            effectCategoryModel.getName();
            return new C1444900nhg(id, effectCategoryModel.getKey());
        }
        return null;
    }
}
