package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerImage;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: renamed from: X.0HQV, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HQV {
    public static final C0HQV LIZ = new C0HQV();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(576));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(575));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(577));

    public static C1910890zpH LIZIZ() {
        return (C1910890zpH) LIZJ.getValue();
    }

    public static int LIZJ() {
        if (!C0HSM.LIZ()) {
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(220));
        }
        int iLIZ = C814420VxA.LIZ(((double) Resources.getSystem().getDisplayMetrics().widthPixels) * 0.62d);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(256));
        return iLIZ > iLIZIZ ? iLIZIZ : iLIZ;
    }

    public static void LIZ(StickerItem stickerItem) {
        StickerBase stickerBase = stickerItem.stickerBase;
        if (stickerBase != null) {
            Integer num = stickerBase.stickerType;
            int type = EnumC451180Hme.AISELF_STICKER.getType();
            if (num != null && num.intValue() == type) {
                IMStickerApi.LIZ.LIZIZ().getImAiSelfStickerService().LJJ(stickerItem);
                return;
            }
        }
        IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().LJJII(stickerItem, true);
    }

    public static void LJ(int i, long j, Function1 function1) {
        Activity activityLIZIZ;
        C19EG c19egLIZIZ;
        LifecycleCoroutineScope lifecycleScope;
        AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
        if (abstractC1387200mCcLJFF != null && (activityLIZIZ = abstractC1387200mCcLJFF.LIZIZ()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ)) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19egLIZIZ)) != null) {
            C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C438580HHs(i, j, function1, null), 2);
        }
    }

    public static void LIZLLL(Context context, FragmentManager fragmentManager, StickerItem stickerItem, EnumC441640HTm enumC441640HTm) {
        StickerImage stickerImage;
        List<String> list;
        String str;
        LIZ(stickerItem);
        StickerBase stickerBase = stickerItem.stickerBase;
        if (stickerBase != null && (stickerImage = stickerBase.image) != null && (list = stickerImage.urlList) != null && (str = (String) ListProtector.get(list, 0)) != null) {
            StickerBase stickerBase2 = stickerItem.stickerBase;
            if (stickerBase2 != null) {
                Long l = stickerBase2.id;
                Integer num = stickerBase2.stickerType;
                if (l != null && num != null) {
                    int iIntValue = num.intValue();
                    long jLongValue = l.longValue();
                    C0HQV c0hqv = LIZ;
                    AwS585S0100000_6 awS585S0100000_6 = new AwS585S0100000_6(enumC441640HTm, 412);
                    c0hqv.getClass();
                    LJ(iIntValue, jLongValue, awS585S0100000_6);
                    C1910890zpH c1910890zpHLIZIZ = LIZIZ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[sticker] save sticker ");
                    sbLIZ.append(jLongValue);
                    c1910890zpHLIZIZ.LIZ("MixStudioShareViewModel", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0HI5(str, context, stickerItem, enumC441640HTm, fragmentManager, null), 3);
        }
    }
}
