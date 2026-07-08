package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.filter.StrArray;
import com.ss.android.ugc.aweme.shortvideo.model.BeautyMobParam;
import java.util.List;

/* JADX INFO: renamed from: X.0mnK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1409960mnK {
    public static final BeautyMobParam LIZIZ(List<ComposerBeauty> list) {
        boolean z;
        StrArray strArray = new StrArray();
        StrArray strArray2 = new StrArray();
        StrArray strArray3 = new StrArray();
        StrArray strArray4 = new StrArray();
        StrArray strArray5 = new StrArray();
        StrArray strArray6 = new StrArray();
        for (ComposerBeauty composerBeauty : list) {
            String parentId = composerBeauty.getParentId();
            if (parentId != null && parentId.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                strArray4.add(composerBeauty.getEffect().getEffectId());
                strArray5.add(composerBeauty.getEffect().getName());
                strArray6.add(String.valueOf(composerBeauty.getProgressValue() / 100.0f));
            } else {
                strArray.add(composerBeauty.getEffect().getEffectId());
                strArray2.add(composerBeauty.getEffect().getName());
                strArray3.add(String.valueOf(composerBeauty.getProgressValue() / 100.0f));
            }
        }
        return new BeautyMobParam(strArray.toString(), strArray2.toString(), strArray3.toString(), strArray4.toString(), strArray5.toString(), strArray6.toString());
    }

    public static final void LIZ(C1403560md0 c1403560md0, BeautyMobParam beautyMobParam) {
        BeautyMobParam beautyMobParam2 = beautyMobParam;
        if (beautyMobParam2 == null) {
            beautyMobParam2 = new BeautyMobParam("", "", "", "", "", "");
        }
        c1403560md0.LJ("beautify_child_id_list", beautyMobParam2.getBeautifyChildIdListStr());
        c1403560md0.LJ("beautify_child_name_list", beautyMobParam2.getBeautifyChildNameListStr());
        c1403560md0.LJ("beautify_child_value_list", beautyMobParam2.getBeautifyChildValueListStr());
        c1403560md0.LJ("beautify_parent_id_list", beautyMobParam2.getBeautifyParentIdListStr());
        c1403560md0.LJ("beautify_parent_name_list", beautyMobParam2.getBeautifyParentNameListStr());
        c1403560md0.LJ("beautify_parent_value_list", beautyMobParam2.getBeautifyParentValueListStr());
    }
}
