package X;

import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sM0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1623660sM0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final EffectCategoryModel LIZ(InterfaceC1624480sNK interfaceC1624480sNK) {
        String strLJIIJ = interfaceC1624480sNK.LJIIJ();
        if (TextUtils.isEmpty(strLJIIJ)) {
            return new EffectCategoryModel((String) null, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (UrlModel) (0 == true ? 1 : 0), (UrlModel) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), false, (String) (0 == true ? 1 : 0), 1023, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }
        List<EffectCategoryModel> value = interfaceC1624480sNK.getStickerRepository().LJFF().LJI().getValue();
        if (value != null) {
            for (EffectCategoryModel effectCategoryModel : value) {
                if (Intrinsics.LJFF(strLJIIJ, effectCategoryModel.getKey())) {
                    return effectCategoryModel;
                }
            }
        }
        return new EffectCategoryModel((String) null, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (UrlModel) (0 == true ? 1 : 0), (UrlModel) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), false, (String) (0 == true ? 1 : 0), 1023, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }
}
