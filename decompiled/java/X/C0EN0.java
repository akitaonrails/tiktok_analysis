package X;

import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;

/* JADX INFO: renamed from: X.0EN0, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EN0 {
    public static final EffectModel LIZ(EffectPointModel effectPointModel) {
        EffectModel effectModel = new EffectModel();
        effectModel.key = effectPointModel.getKey();
        String name = effectPointModel.getName();
        if (name == null) {
            name = "";
        }
        effectModel.name = name;
        effectModel.extra = effectPointModel.getExtra();
        effectModel.type = effectPointModel.getType();
        effectModel.color = effectPointModel.getSelectedColor();
        effectModel.resDir = effectPointModel.getResDir();
        effectModel.category = effectPointModel.getCategory();
        effectModel.index = effectPointModel.getIndex();
        effectModel.selectFrom = effectPointModel.getSelectFrom();
        effectModel.resourceId = effectPointModel.getResourceId();
        effectModel.iconUrl = effectPointModel.getIconUrl();
        effectModel.designerId = effectPointModel.designerId;
        effectModel.designerEncryptedId = effectPointModel.designerEncryptedId;
        effectModel.fileUrl = effectPointModel.fileUrl;
        effectModel.duration = effectPointModel.getDuration();
        effectModel.searchModel = effectPointModel.searchModel;
        effectModel.source = effectPointModel.source;
        effectModel.isNewEngineEffect = effectPointModel.getIsNewEngineEffect();
        effectModel.adjustParams = effectPointModel.getAdjustParams();
        return effectModel;
    }
}
