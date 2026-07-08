package X;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyle;
import com.ss.android.ugc.aweme.tako.ccl.model.api.CreativeTemplate;
import com.ss.android.ugc.aweme.tako.ccl.model.api.NewActionBarItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import com.ss.android.ugc.aweme.tako.model.TakoPageContext;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yJK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1852640yJK {
    public static final boolean LIZIZ(Uri uri) {
        if (Intrinsics.LJFF(uri.getPath(), "/image/edit") && Intrinsics.LJFF(uri.getHost(), "tako")) {
            return true;
        }
        return false;
    }

    public static final boolean LIZJ(Uri uri) {
        if (Intrinsics.LJFF(uri.getPath(), "/inspirations") && Intrinsics.LJFF(uri.getHost(), "tako")) {
            return true;
        }
        return false;
    }

    public static final C1852650yJL LIZ(String str, String str2) {
        NewActionBarItem newActionBarItemPrevious;
        NewActionBarItem newActionBarItem;
        NewActionBarItem newActionBarItemPrevious2;
        String str3 = str;
        C1852740yJU.LIZ.getClass();
        if (!C1852740yJU.LIZ()) {
            return null;
        }
        C1852820yJc c1852820yJcLIZIZ = C1860410yVr.LIZIZ();
        C1855770yON.LIZ.getClass();
        if (C1855770yON.LIZIZ()) {
            List<NewActionBarItem> list = C1860520yW2.LIZ.LJIILL().navBarList;
            if (list != null) {
                ListIterator<NewActionBarItem> listIterator = list.listIterator(list.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        newActionBarItemPrevious2 = listIterator.previous();
                        if (newActionBarItemPrevious2.type == 4) {
                            break;
                        }
                    } else {
                        newActionBarItemPrevious2 = null;
                        break;
                    }
                }
                newActionBarItem = newActionBarItemPrevious2;
            }
            return null;
        }
        List<NewActionBarItem> list2 = C1860410yVr.LIZIZ().LIZIZ;
        ListIterator<NewActionBarItem> listIterator2 = list2.listIterator(list2.size());
        while (true) {
            if (listIterator2.hasPrevious()) {
                newActionBarItemPrevious = listIterator2.previous();
                if (newActionBarItemPrevious.type == 4) {
                    break;
                }
            } else {
                newActionBarItemPrevious = null;
                break;
            }
        }
        newActionBarItem = newActionBarItemPrevious;
        if (newActionBarItem != null) {
            String str4 = newActionBarItem.name;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = c1852820yJcLIZIZ.LIZ;
            TakoSug takoSug = newActionBarItem.actionSug;
            ConvertStyle convertStyle = c1852820yJcLIZIZ.LJ;
            List<CreativeTemplate> list3 = c1852820yJcLIZIZ.LIZLLL;
            if (str3.length() <= 0) {
                str3 = "inbox_push";
            }
            return new C1852650yJL(4, str4, convertStyle, takoSug, str5, list3, str3, false, str2, c1852820yJcLIZIZ.LJI, 384);
        }
        return null;
    }

    public static final void LIZLLL(Context context, Integer num) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//tako/image/backstop");
        if (num != null) {
            smartRouteBuildRoute.open(num.intValue());
        } else {
            smartRouteBuildRoute.open();
        }
    }

    public static void LJFF(Context context, Uri uri, TakoPageContext takoPageContext, String str, int i) {
        String str2;
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = "inbox_push";
        } else {
            str2 = null;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        LJI(context, takoPageContext, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "tab_id"), null, str2, str3);
    }

    public static final void LJI(Context context, TakoPageContext takoPageContext, String str, Integer num, String str2, String str3) {
        Context context2 = context;
        if (context2 == null) {
            context2 = C1857750yRZ.LIZ;
        }
        C1852740yJU.LIZ.getClass();
        if (!C1852740yJU.LIZ()) {
            LIZLLL(context2, num);
            return;
        }
        C1852270yIj c1852270yIj = C1852270yIj.LIZ;
        C1852650yJL c1852650yJLLIZ = LIZ(str2, str);
        c1852270yIj.getClass();
        if (!C1852270yIj.LJIILL(c1852270yIj, context2, c1852650yJLLIZ, C1852270yIj.LJIIJJI(), num, null, str3, takoPageContext, 16) && !C1854260yLw.LJIIIZ(C1854260yLw.LIZ, context2, LIZ(str2, null), C1852270yIj.LJIIJJI(), null, null, null, null, null, num, str3, 504)) {
            LIZLLL(context2, num);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0yIk] */
    /* JADX WARN: Type inference failed for: r6v5, types: [X.19EG] */
    public static void LJ(Context context, String str, TakoPageContext takoPageContext, Integer num, String str2, String str3, Fragment fragment, int i) {
        Context context2;
        CreativeTemplate creativeTemplate;
        String str4;
        String str5;
        String str6;
        CreativeTemplate creativeTemplatePrevious;
        Fragment fragment2 = fragment;
        String str7 = str3;
        String str8 = str2;
        Integer num2 = num;
        Object obj = null;
        if ((i & 8) != 0) {
            num2 = null;
        }
        if ((i & 16) != 0) {
            str8 = "inbox_push";
        }
        if ((i & 32) != 0) {
            str7 = null;
        }
        if ((i & 64) != 0) {
            fragment2 = null;
        }
        if (context == null) {
            context2 = C1857750yRZ.LIZ;
        } else {
            context2 = context;
        }
        C1852650yJL c1852650yJLLIZ = LIZ(str8, null);
        C1852270yIj.LIZ.getClass();
        InterfaceC665370Q7z interfaceC665370Q7zLJIIJJI = C1852270yIj.LJIIJJI();
        if (str != null) {
            List<CreativeTemplate> list = C1860410yVr.LIZIZ().LIZLLL;
            ListIterator<CreativeTemplate> listIterator = list.listIterator(list.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    creativeTemplatePrevious = listIterator.previous();
                    if (Intrinsics.LJFF(creativeTemplatePrevious.templateId, str)) {
                        break;
                    }
                } else {
                    creativeTemplatePrevious = null;
                    break;
                }
            }
            creativeTemplate = creativeTemplatePrevious;
            if (creativeTemplate != null && fragment2 != null) {
                int i2 = creativeTemplate.processType;
                if (i2 != 1) {
                    if (i2 == 2) {
                        C1852270yIj c1852270yIj = C1852270yIj.LIZ;
                        C19EG activity = fragment2.getActivity();
                        if (activity instanceof C19EG) {
                            obj = activity;
                        }
                        C1852450yJ1 c1852450yJ1 = new C1852450yJ1(fragment2, str8, str7);
                        c1852270yIj.getClass();
                        C1852270yIj.LJIILIIL(creativeTemplate, 0, obj, null, null, c1852450yJ1);
                        return;
                    }
                } else {
                    C1852270yIj.LIZ.getClass();
                    C1854410yMB.LIZ(fragment2, new C1853710yL3(creativeTemplate.templatePrompt, null, C1852270yIj.LJ(creativeTemplate, 0), C1852270yIj.LJII(str8, str7, null, null), null));
                    return;
                }
            }
        } else {
            creativeTemplate = null;
        }
        ?? c1852280yIk = new C1852280yIk(creativeTemplate, interfaceC665370Q7zLJIIJJI, context, str8, takoPageContext, num2, context2, c1852650yJLLIZ, str7);
        C1852740yJU.LIZ.getClass();
        if (!C1852740yJU.LIZ()) {
            LIZLLL(context2, num2);
            return;
        }
        if (creativeTemplate != null && (str6 = creativeTemplate.templatePrompt) != null && str6.length() > 0 && ((Boolean) c1852280yIk.invoke(creativeTemplate.templatePrompt)).booleanValue()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("openImageEditWithTemplateId: Failed openImageEditPage, trying open image create page. Found template -> prompt: ");
        if (creativeTemplate != null) {
            str4 = creativeTemplate.templatePrompt;
        } else {
            str4 = null;
        }
        sbLIZ.append(str4);
        sbLIZ.append(", id: ");
        if (creativeTemplate != null) {
            str5 = creativeTemplate.templateId;
        } else {
            str5 = null;
        }
        sbLIZ.append(str5);
        C2188811AlT.LIZIZ(sbLIZ);
        C1852270yIj c1852270yIj2 = C1852270yIj.LIZ;
        C1852650yJL c1852650yJLLIZ2 = LIZ(str8, null);
        c1852270yIj2.getClass();
        if (C1852270yIj.LJIILL(c1852270yIj2, context2, c1852650yJLLIZ2, C1852270yIj.LJIIJJI(), num2, null, null, takoPageContext, 48)) {
            return;
        }
        if (creativeTemplate != null) {
            obj = creativeTemplate.templatePrompt;
        }
        if (((Boolean) c1852280yIk.invoke(obj)).booleanValue()) {
            return;
        }
        LIZLLL(context2, num2);
    }
}
