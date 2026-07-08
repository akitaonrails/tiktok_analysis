package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.groupcreation.fragment.UnifiedGroupCreationFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0i4d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1228490i4d {
    public static final C1228490i4d LIZ = new C1228490i4d();
    public static final Map<String, C1228470i4b> LIZIZ = new LinkedHashMap();
    public static final Map<String, Function1<EnumC1223630hwn, Unit>> LIZJ = new LinkedHashMap();

    public static void LIZ(Context context, String str, String str2, String str3, C1228470i4b c1228470i4b) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//im/group/creation/unified");
        smartRouteBuildRoute.withParam("param_uuid", str);
        smartRouteBuildRoute.withParam("protocol_uuid", str);
        smartRouteBuildRoute.withParam("is_full_screen", c1228470i4b.LIZ.LJIIJ);
        smartRouteBuildRoute.withParam("open_platform_biz_line", str2);
        smartRouteBuildRoute.withParam("open_platform_biz_scene", str3);
        smartRouteBuildRoute.withParam("default_category", c1228470i4b.LIZ.LJJIJ);
        smartRouteBuildRoute.open();
    }

    public static void LIZIZ(Context context, String str, String str2, String str3, C1228470i4b c1228470i4b) {
        FragmentManager supportFragmentManager;
        float fFloatValue;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            UnifiedGroupCreationFragment unifiedGroupCreationFragment = new UnifiedGroupCreationFragment();
            LIZ.getClass();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("param_uuid", str, bundle);
            C786410Ut5.LJJJI("open_platform_biz_line", str2, bundle);
            C786410Ut5.LJJJI("open_platform_biz_scene", str3, bundle);
            C786410Ut5.LJJJI("default_category", c1228470i4b.LIZ.LJJIJ.getValue(), bundle);
            C786410Ut5.LJJJI("protocol_uuid", str, bundle);
            bundle.putBoolean("is_full_screen", c1228470i4b.LIZ.LJIIJ);
            unifiedGroupCreationFragment.setArguments(bundle);
            Float f = c1228470i4b.LIZ.LJIIJJI;
            if (f != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = 0.73f;
            }
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJI = unifiedGroupCreationFragment;
            tuxSheet.LLJLILLLLZIIL = false;
            c1390920mIc.LJIIIIZZ(1);
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLJJL = (int) (fFloatValue * C1232370iAt.LIZLLL(context));
            tuxSheet2.LLJJIJIIJIL = !c1228470i4b.LIZ.LJIIL;
            c1390920mIc.LJI(48);
            c1390920mIc.LIZ.LLJLL = true;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zm, context);
            TuxSheet tuxSheet3 = c1390920mIc.LIZ;
            tuxSheet3.LLJI = numLIZJ;
            tuxSheet3.show(supportFragmentManager, "UnifiedGroupCreationFragment");
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
