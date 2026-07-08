package X;

import android.app.Activity;
import android.net.Uri;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.compliance.common.hydrogen.handlers.BottomSheetOption;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS236S0300000_27;

/* JADX INFO: renamed from: X.0xcd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1826170xcd extends C0XMO {
    @Override // X.C0XMO
    public final void LIZ(Uri uri) {
        FragmentManager supportFragmentManager;
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF == null) {
            return;
        }
        C1390850mIV c1390850mIV = new C1390850mIV();
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "title");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
            c1390850mIV.LIZ.LLJJIJI = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "options");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
            try {
                BottomSheetOption[] bottomSheetOptionArr = (BottomSheetOption[]) new Gson().LJII(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, BottomSheetOption[].class);
                if (bottomSheetOptionArr != null) {
                    ArrayList arrayList = new ArrayList();
                    for (BottomSheetOption bottomSheetOption : bottomSheetOptionArr) {
                        C1247510iZJ c1247510iZJ = new C1247510iZJ();
                        c1247510iZJ.LIZ = bottomSheetOption.optionContent;
                        c1247510iZJ.LIZJ = bottomSheetOption.optionStyle.getValue();
                        c1247510iZJ.LIZ(new AwS236S0300000_27(this, bottomSheetOption, activityLJFF, 39));
                        arrayList.add(c1247510iZJ);
                    }
                    c1390850mIV.LJI(arrayList);
                } else {
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(activityLJFF);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            TuxActionSheet tuxActionSheetLIZJ = c1390850mIV.LIZJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(activityLJFF.getComponentName().flattenToShortString());
            sbLIZ.append("_hydrogen_bottom_sheet");
            tuxActionSheetLIZJ.show(supportFragmentManager, C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
