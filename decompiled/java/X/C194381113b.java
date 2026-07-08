package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import java.util.List;

/* JADX INFO: renamed from: X.113b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194381113b {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZJ(C194387113h c194387113h) {
        List<EffectCategoryModel> categoryList;
        List<EffectCategoryResponse> categoryResponseList;
        if (c194387113h != null) {
            EffectChannelResponse effectChannelResponse = c194387113h.LIZIZ;
            if (effectChannelResponse != null && (categoryResponseList = effectChannelResponse.getCategoryResponseList()) != null) {
                return categoryResponseList.isEmpty();
            }
            PanelInfoModel panelInfoModel = c194387113h.LIZ;
            if (panelInfoModel != null && (categoryList = panelInfoModel.getCategoryList()) != null) {
                return categoryList.isEmpty();
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZ(X.C194387113h r5, java.lang.String r6) {
        /*
            int r0 = r6.length()
            r4 = 0
            if (r0 != 0) goto L8
            return r4
        L8:
            X.0EYc r0 = X.C366400EYc.LIZ
            r0.getClass()
            boolean r0 = X.C366400EYc.LIZJ(r6)
            if (r0 == 0) goto L15
            java.lang.String r6 = "video_anim"
        L15:
            r3 = -1
            if (r5 == 0) goto L6b
            com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r0 = r5.LIZIZ
            if (r0 == 0) goto L40
            java.util.List r0 = r0.getCategoryResponseList()
            if (r0 == 0) goto L40
            java.util.Iterator r1 = r0.iterator()
            r2 = 0
        L27:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse r0 = (com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse) r0
            java.lang.String r0 = r0.getKey()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r6)
            if (r0 != 0) goto L68
            int r2 = r2 + 1
            goto L27
        L40:
            com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel r0 = r5.LIZ
            if (r0 == 0) goto L6b
            java.util.List r0 = r0.getCategoryList()
            if (r0 == 0) goto L6b
            java.util.Iterator r1 = r0.iterator()
            r2 = 0
        L4f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel r0 = (com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel) r0
            java.lang.String r0 = r0.getKey()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r6)
            if (r0 != 0) goto L68
            int r2 = r2 + 1
            goto L4f
        L68:
            if (r2 != r3) goto L6c
        L6a:
            return r4
        L6b:
            r2 = 0
        L6c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194381113b.LIZ(X.113h, java.lang.String):int");
    }

    public static String LIZIZ(C194387113h c194387113h, int i) {
        List<EffectCategoryModel> categoryList;
        List<EffectCategoryResponse> categoryResponseList;
        if (c194387113h != null) {
            EffectChannelResponse effectChannelResponse = c194387113h.LIZIZ;
            if (effectChannelResponse != null && (categoryResponseList = effectChannelResponse.getCategoryResponseList()) != null) {
                if (!categoryResponseList.isEmpty()) {
                    return ((EffectCategoryResponse) ListProtector.get(categoryResponseList, i)).getKey();
                }
                return "";
            }
            PanelInfoModel panelInfoModel = c194387113h.LIZ;
            if (panelInfoModel != null && (categoryList = panelInfoModel.getCategoryList()) != null && (!categoryList.isEmpty())) {
                return ((EffectCategoryModel) ListProtector.get(categoryList, i)).getKey();
            }
            return "";
        }
        return "";
    }
}
