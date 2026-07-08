package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.publicgroup.fragment.PublicGroupCreationFragment;
import java.util.UUID;

/* JADX INFO: renamed from: X.0i4g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1228520i4g {
    public static void LIZ(Context context, C1228470i4b c1228470i4b, String str, String str2) {
        FragmentManager supportFragmentManager;
        float fFloatValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append('-');
        sbLIZ.append(UUID.randomUUID());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        PublicGroupCreationFragment.LLJJ.put(strLIZIZ, c1228470i4b);
        if (!c1228470i4b.LIZ.LJIIJ) {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                Bundle bundle = new Bundle();
                C786410Ut5.LJJJI("param_uuid", strLIZIZ, bundle);
                C786410Ut5.LJJJI("open_platform_biz_line", str, bundle);
                C786410Ut5.LJJJI("open_platform_biz_scene", str2, bundle);
                PublicGroupCreationFragment publicGroupCreationFragment = new PublicGroupCreationFragment();
                publicGroupCreationFragment.setArguments(bundle);
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJJIJI = publicGroupCreationFragment;
                tuxSheet.LLJLILLLLZIIL = false;
                c1390920mIc.LJIIIIZZ(1);
                Float f = c1228470i4b.LIZ.LJIIJJI;
                if (f != null) {
                    fFloatValue = f.floatValue();
                } else {
                    fFloatValue = 0.73f;
                }
                int iLIZLLL = (int) (fFloatValue * C1232370iAt.LIZLLL(context));
                TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                tuxSheet2.LLJJL = iLIZLLL;
                tuxSheet2.LLJJIJIIJIL = !c1228470i4b.LIZ.LJIIL;
                c1390920mIc.LJI(48);
                TuxSheet tuxSheet3 = c1390920mIc.LIZ;
                tuxSheet3.LLJLL = true;
                tuxSheet3.show(supportFragmentManager, "PublicGroupCreationFragment");
                return;
            }
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//im/public_group_create_inner");
        smartRouteBuildRoute.withParam("param_uuid", strLIZIZ);
        smartRouteBuildRoute.withParam("open_platform_biz_line", str);
        smartRouteBuildRoute.withParam("open_platform_biz_scene", str2);
        smartRouteBuildRoute.open();
    }
}
