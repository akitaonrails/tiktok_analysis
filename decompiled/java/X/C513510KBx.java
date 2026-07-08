package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.subscription.pgc.api.bridge.SubscriptionSceneContext;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.ui.SubPackagePageDialog;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KBx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C513510KBx {
    public static SubPackagePageDialog LIZ(C0KCC c0kcc, Map map, EnumC513420KBo enumC513420KBo, int i) {
        long jLongValue;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Integer numLJIIJJI;
        Boolean boolValueOf;
        String state;
        EnumC513420KBo enumC513420KBoLIZ = enumC513420KBo;
        Map linkedHashMap = map;
        C0KCC c0kcc2 = c0kcc;
        if ((i & 1) != 0) {
            c0kcc2 = new C0KCC(null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, 0, null, null, null, null, null, null, false, 0, null, 0L, 0L, false, -1, 15);
        }
        if ((i & 2) != 0) {
            linkedHashMap = new LinkedHashMap();
        }
        if ((i & 4) != 0) {
            enumC513420KBoLIZ = null;
        }
        SubPackagePageDialog subPackagePageDialog = new SubPackagePageDialog();
        subPackagePageDialog.LLIZLLLIL = c0kcc2;
        subPackagePageDialog.LLJJIII = System.currentTimeMillis();
        subPackagePageDialog.LLJJI = linkedHashMap;
        if (linkedHashMap != null) {
            linkedHashMap.put("show_entrance", c0kcc2.LJII);
            String str = c0kcc2.LJIIJ;
            if (str != null) {
                linkedHashMap.put("group_id", str);
            }
            if (!linkedHashMap.containsKey("room_id")) {
                linkedHashMap.put("room_id", c0kcc2.LJIILLIIL);
            }
            if (c0kcc2.LJIILIIL.length() == 0) {
                state = C0KBJ.NOT_SUBSCRIBE.getState();
            } else {
                state = c0kcc2.LJIILIIL;
            }
            linkedHashMap.put("subscribe_state", state);
        }
        Intrinsics.LJFF(c0kcc2.LJIIL, "h5");
        subPackagePageDialog.LLJ = Intrinsics.LJFF(c0kcc2.LJIIL, "homepage-entry");
        Intrinsics.LJFF(c0kcc2.LJIIL, "homepage");
        if (c0kcc2.LJIIJJI == null) {
            if (Intrinsics.LJFF(c0kcc2.LJIILLIIL, "")) {
                SubscriptionSceneContext subscriptionSceneContextLIZ = C0K4B.LIZ();
                if (subscriptionSceneContextLIZ != null) {
                    boolValueOf = Boolean.valueOf(subscriptionSceneContextLIZ.isInLiveRoom);
                } else {
                    boolValueOf = null;
                }
                c0kcc2.LJIIJJI = boolValueOf;
            } else {
                c0kcc2.LJIIJJI = Boolean.valueOf(!Intrinsics.LJFF(c0kcc2.LJIILLIIL, CardStruct.IStatusCode.DEFAULT));
            }
        }
        C2252321DDq c2252321DDq = C0K4B.LIZ;
        Long lLJIILIIL = C2095008Iq.LJIILIIL(c0kcc2.LJIILLIIL);
        if (lLJIILIIL != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        C0K4B.LIZIZ(new SubscriptionSceneContext(jLongValue, 0L, c0kcc2.LIZ, null, null, c0kcc2.LJII, null, null, Intrinsics.LJFF(c0kcc2.LJIIJJI, Boolean.TRUE), false, null, false, c0kcc2.LJI, 0L, 0L, null, null, false, null, null, 1044186));
        subPackagePageDialog.LLILZIL = C513450KBr.LIZ(c0kcc2.LJJIFFI);
        C0KC5 c0kc5 = subPackagePageDialog.LLILZLL;
        if (enumC513420KBoLIZ == null) {
            enumC513420KBoLIZ = C513470KBt.LIZ(c0kcc2.LIZ, c0kcc2.LJI, true);
        }
        c0kc5.LIZJ = enumC513420KBoLIZ;
        subPackagePageDialog.LLJI = null;
        Uri uri = c0kcc2.LJJIIZ;
        if (uri != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "link_id")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) != null) {
            numLJIIJJI.intValue();
        }
        return subPackagePageDialog;
    }
}
