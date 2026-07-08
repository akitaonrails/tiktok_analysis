package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyleItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.CreativeTemplate;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS236S0300000_27;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0yLw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1854260yLw {
    public static C1852650yJL LIZIZ;
    public static WeakReference<InterfaceC665370Q7z> LIZLLL;
    public static String LJFF;
    public static String LJI;
    public static String LJII;
    public static WeakReference<TuxSheet> LJIIIIZZ;
    public static WeakReference<C1854290yLz> LJIIIZ;
    public static C06X5 LJIIJ;
    public static C06X5 LJIIJJI;
    public static final C1854260yLw LIZ = new C1854260yLw();
    public static final List<BaseImage> LIZJ = new ArrayList();
    public static Map<String, String> LJ = C2097608Jq.LJ();

    public static CreativeTemplate LIZJ() {
        C1852650yJL c1852650yJL;
        List<CreativeTemplate> list;
        String str = LJFF;
        CreativeTemplate creativeTemplate = null;
        if (str == null || str.length() <= 0 || (c1852650yJL = LIZIZ) == null || (list = c1852650yJL.LJFF) == null) {
            return null;
        }
        Iterator<CreativeTemplate> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            CreativeTemplate next = it2.next();
            if (Intrinsics.LJFF(next.templateId, str)) {
                creativeTemplate = next;
                break;
            }
        }
        return creativeTemplate;
    }

    public static IMessageAbility LJ() {
        InterfaceC665370Q7z interfaceC665370Q7z;
        WeakReference<InterfaceC665370Q7z> weakReference = LIZLLL;
        if (weakReference == null || (interfaceC665370Q7z = weakReference.get()) == null) {
            return null;
        }
        return (IMessageAbility) C1558520qew.LIZ(interfaceC665370Q7z, IMessageAbility.class, null);
    }

    public static boolean LJFF() {
        C1852650yJL c1852650yJL = LIZIZ;
        if (c1852650yJL != null) {
            return c1852650yJL.LIZ == 4 || c1852650yJL.LIZ == 5;
        }
        return false;
    }

    public static boolean LJI() {
        C1852650yJL c1852650yJL = LIZIZ;
        if (c1852650yJL != null) {
            return c1852650yJL.LIZ == 6 || c1852650yJL.LIZ == 6001;
        }
        return false;
    }

    public static void LJIIL() {
        C1852650yJL c1852650yJL = LIZIZ;
        if (c1852650yJL != null) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str = LJ.get("enter_from");
            String str2 = LJ.get("enter_method");
            String str3 = LJ.get("process_id");
            String strLIZJ = C1855920yOc.LIZJ(Integer.valueOf(c1852650yJL.LIZ));
            long jCurrentTimeMillis = System.currentTimeMillis() - c1852650yJL.LJII;
            String str4 = c1852650yJL.LJI;
            String str5 = LJ.get("tako_session_id");
            if (str5 == null) {
                str5 = "";
            }
            String str6 = LJ.get("tako_chat_id");
            C1862330yYx.LJL(544, jCurrentTimeMillis, c1862330yYx, str, str2, str3, strLIZJ, null, str4, str5, str6 != null ? str6 : "");
        }
    }

    public static final AIBotInfo LIZIZ(ITakoContextAbility iTakoContextAbility) {
        long j;
        int i;
        String str;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        C13LC<C1863850ybP> c13lcT712;
        C1863850ybP c1863850ybP2;
        C13LC<C1863850ybP> c13lcT713;
        C1863850ybP c1863850ybP3;
        if (iTakoContextAbility != null && (c13lcT713 = iTakoContextAbility.T71()) != null && (c1863850ybP3 = (C1863850ybP) c13lcT713.LIZIZ()) != null) {
            j = c1863850ybP3.LLJJ;
        } else {
            j = 1;
        }
        if (iTakoContextAbility != null && (c13lcT712 = iTakoContextAbility.T71()) != null && (c1863850ybP2 = (C1863850ybP) c13lcT712.LIZIZ()) != null) {
            i = c1863850ybP2.LLJJI;
        } else {
            i = 1;
        }
        if (iTakoContextAbility == null || (c13lcT71 = iTakoContextAbility.T71()) == null || (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) == null || (str = c1863850ybP.LLJJIII) == null) {
            str = "";
        }
        return new AIBotInfo(j, str, null, i, 0, 0, null, null, false, false, false, null, null, null, null, null, null, null, false, null, null, null, null, 8388596, null);
    }

    public static Pair LIZ(boolean z, boolean z2) {
        if (z) {
            return new Pair(Integer.valueOf(R.anim.fq), Integer.valueOf(R.anim.fy));
        }
        if (z2) {
            return new Pair(Integer.valueOf(R.anim.ft), Integer.valueOf(R.anim.g0));
        }
        return new Pair(Integer.valueOf(R.anim.fv), Integer.valueOf(R.anim.g2));
    }

    public static int LIZLLL(Float f, Float f2) {
        float fFloatValue;
        float fFloatValue2;
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 3.0f;
        }
        if (f2 != null) {
            fFloatValue2 = f2.floatValue();
        } else {
            fFloatValue2 = 4.0f;
        }
        float f3 = fFloatValue / fFloatValue2;
        if (0.0f <= f3 && f3 <= 0.65625f) {
            return 4;
        }
        if (0.65625f <= f3 && f3 <= 0.875f) {
            return 2;
        }
        if (0.875f <= f3 && f3 <= 1.1666667f) {
            return 1;
        }
        if (1.1666667f <= f3 && f3 <= 1.5555556f) {
            return 3;
        }
        if (1.5555556f > f3 || f3 > Float.MAX_VALUE) {
            return 2;
        }
        return 5;
    }

    public static void LJIIJJI(SmartImageView smartImageView, BaseImage baseImage) {
        String str;
        String str2;
        C2137908Zd c2137908Zd = C2137908Zd.LIZJ;
        String str3 = null;
        if (baseImage != null) {
            str3 = baseImage.localCachePath;
        }
        if (c2137908Zd.LJFF(str3)) {
            if (baseImage == null || (str2 = baseImage.localCachePath) == null) {
                str2 = "";
            }
            C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(new C0VSJ(str2));
            c1331670kl3LJII.LJJIJL(smartImageView.getContext());
            c1331670kl3LJII.LJJ(smartImageView);
            c1331670kl3LJII.LJIIJJI();
            return;
        }
        if (baseImage == null || (str = baseImage.uri) == null) {
            return;
        }
        if (C1854460yMG.LIZIZ(str)) {
            C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse(str));
            c1331670kl3LJI.LJJIJL(smartImageView.getContext());
            c1331670kl3LJI.LJJ(smartImageView);
            c1331670kl3LJI.LJIIJJI();
            return;
        }
        if (C1854460yMG.LIZ(str)) {
            C1331670kl3 c1331670kl3LJII2 = C1331660kl2.LJII(new C0VSJ(str));
            c1331670kl3LJII2.LJJIJL(smartImageView.getContext());
            c1331670kl3LJII2.LJJ(smartImageView);
            c1331670kl3LJII2.LJIIJJI();
            return;
        }
        C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(baseImage.urlList));
        c1331670kl3LJIIJ.LJJIJL(smartImageView.getContext());
        c1331670kl3LJIIJ.LJJ(smartImageView);
        c1331670kl3LJIIJ.LJIIJJI();
    }

    public static void LJII(Activity activity, View view, Function1 function1, Function1 function12) {
        if (activity == null) {
            return;
        }
        C20189513zB.LJIIIIZZ(1, activity, new AwS236S0300000_27(view, function1, function12, 16));
    }

    public static boolean LJIIIIZZ(Context context, C1852650yJL c1852650yJL, InterfaceC665370Q7z interfaceC665370Q7z, boolean z, String str, List list, String str2, String str3, String str4, Integer num, String str5) {
        Map<String, String> mapLJ;
        InterfaceC665370Q7z interfaceC665370Q7z2;
        ITakoContextAbility iTakoContextAbility;
        if (context == null || interfaceC665370Q7z == null || c1852650yJL == null) {
            return false;
        }
        LIZIZ = c1852650yJL;
        LIZLLL = new WeakReference<>(interfaceC665370Q7z);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        WeakReference<InterfaceC665370Q7z> weakReference = LIZLLL;
        if (weakReference == null || (interfaceC665370Q7z2 = weakReference.get()) == null || (iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7z2, ITakoContextAbility.class, null)) == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        linkedHashMap.putAll(mapLJ);
        if (str5 != null) {
            linkedHashMap.put("push_id", str5);
        }
        LJ = linkedHashMap;
        ArrayList arrayList = (ArrayList) LIZJ;
        arrayList.clear();
        if (list != null) {
            list.isEmpty();
            arrayList.addAll(C13LP.LJJJJLI(list));
        }
        LJFF = str2;
        LJI = str3;
        LJII = str4;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//tako/image/edit");
        smartRouteBuildRoute.withParam("tako_bottom_up", z);
        smartRouteBuildRoute.withParam("tako_image_edit_default_input", str);
        if (num != null) {
            smartRouteBuildRoute.open(num.intValue());
            return true;
        }
        smartRouteBuildRoute.open();
        return true;
    }

    public static void LJIIJ(Context context, Function1 function1, final Function0 function0, Function0 function02, List list, C06X5 c06x5, String str, final Map map, String str2, final String str3, final String str4) {
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        String str5;
        List<C06X5> list2;
        String strLIZJ;
        String str6;
        ConvertStyleItem convertStyleItem;
        final String str7 = str;
        String str8 = str2;
        if ((context instanceof C19EG) && (c19eg = (C19EG) context) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null) {
            if (!Intrinsics.LJFF(c06x5, LJIIJJI)) {
                LJIIJJI = c06x5;
                LJIIJ = c06x5;
            } else {
                LJIIJ = LJIIJJI;
            }
            if (str8 == null) {
                C1852650yJL c1852650yJL = LIZIZ;
                if (c1852650yJL != null) {
                    str8 = c1852650yJL.LJI;
                } else {
                    str8 = null;
                }
            }
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            C1854290yLz c1854290yLz = new C1854290yLz(context);
            LIZ.getClass();
            if (list != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        ConvertStyleItem convertStyleItem2 = (ConvertStyleItem) obj;
                        String str9 = convertStyleItem2.imageStyle;
                        C06X5 c06x52 = LJIIJ;
                        if (c06x52 != null && (convertStyleItem = c06x52.LLILLL) != null) {
                            str6 = convertStyleItem.imageStyle;
                        } else {
                            str6 = null;
                        }
                        arrayList.add(new C06X5(i, Intrinsics.LJFF(str9, str6), convertStyleItem2, new C1854270yLx(i, map, str7, convertStyleItem2, str8, str3, str4)));
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                str5 = null;
                list2 = arrayList;
            } else {
                str5 = null;
                list2 = C13BV.INSTANCE;
            }
            c1854290yLz.setStyleData(list2);
            c1854290yLz.setOnCancelClick(new C1854300yM0(function0, map, str7, str8, str3, str4));
            c1854290yLz.setOnDoneClick(new C1854280yLy(function0, function1, map, str7, str8, str3, str4));
            LJIIIZ = new WeakReference<>(c1854290yLz);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIII = c1854290yLz;
            final String str10 = str8;
            tuxSheet.LL = new DialogInterface.OnCancelListener() { // from class: X.0yM1
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) throws JSONException {
                    String str11;
                    ConvertStyleItem convertStyleItem3;
                    function0.invoke();
                    C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                    String str12 = map.get("enter_from");
                    String str13 = "";
                    if (str12 == null) {
                        str12 = "";
                    }
                    String str14 = map.get("enter_method");
                    if (str14 == null) {
                        str14 = "";
                    }
                    String str15 = map.get("process_id");
                    if (str15 == null) {
                        str15 = "";
                    }
                    String str16 = str7;
                    if (str16 == null) {
                        str16 = "edit_image_selection";
                    }
                    C06X5 c06x53 = C1854260yLw.LJIIJ;
                    String strLIZJ2 = null;
                    if (c06x53 != null && (convertStyleItem3 = c06x53.LLILLL) != null) {
                        str11 = convertStyleItem3.nameStarling;
                    } else {
                        str11 = null;
                    }
                    C1854260yLw.LIZ.getClass();
                    C1852650yJL c1852650yJL2 = C1854260yLw.LIZIZ;
                    if (c1852650yJL2 != null) {
                        strLIZJ2 = C1855920yOc.LIZJ(Integer.valueOf(c1852650yJL2.LIZ));
                    }
                    String str17 = str10;
                    String str18 = str3;
                    String str19 = str4;
                    String str20 = map.get("tako_session_id");
                    if (str20 == null) {
                        str20 = "";
                    }
                    String str21 = map.get("tako_chat_id");
                    if (str21 != null) {
                        str13 = str21;
                    }
                    C1862330yYx.LJIIZILJ(c1862330yYx, str12, str14, str15, str16, "click_cancel", str11, strLIZJ2, str17, str18, str19, null, str20, str13, 9216);
                }
            };
            c1390920mIc.LJIIIIZZ(0);
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLJJIJIIJIL = true;
            tuxSheet2.LLJLILLLLZIIL = false;
            TuxSheet tuxSheet3 = c1390920mIc.LIZ;
            LJIIIIZZ = new WeakReference<>(tuxSheet3);
            tuxSheet3.show(supportFragmentManager, "TakoImageStylePanelView");
            function02.invoke();
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str11 = (String) map.get("enter_from");
            String str12 = (String) map.get("enter_method");
            String str13 = (String) map.get("process_id");
            if (str7 == null) {
                str7 = "style_selection";
            }
            C1852650yJL c1852650yJL2 = LIZIZ;
            if (c1852650yJL2 != null) {
                strLIZJ = C1855920yOc.LIZJ(Integer.valueOf(c1852650yJL2.LIZ));
            } else {
                strLIZJ = str5;
            }
            String str14 = (String) map.get("tako_session_id");
            String str15 = "";
            if (str14 == null) {
                str14 = "";
            }
            String str16 = (String) map.get("tako_chat_id");
            if (str16 != null) {
                str15 = str16;
            }
            C1862330yYx.LJLJI(c1862330yYx, str11, str12, str13, str7, str5, str5, str5, str5, strLIZJ, str8, str3, str4, str5, str14, str15, 37104);
        }
    }

    public static boolean LJIIIZ(C1854260yLw c1854260yLw, Context context, C1852650yJL c1852650yJL, InterfaceC665370Q7z interfaceC665370Q7z, String str, List list, String str2, String str3, String str4, Integer num, String str5, int i) {
        boolean z;
        List list2 = list;
        String str6 = str4;
        String str7 = str3;
        String str8 = str2;
        String str9 = str;
        if ((i & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        String str10 = null;
        if ((i & 16) != 0) {
            str9 = null;
        }
        if ((i & 32) != 0) {
            list2 = C13BV.INSTANCE;
        }
        if ((i & 64) != 0) {
            str8 = null;
        }
        if ((i & 128) != 0) {
            str7 = null;
        }
        if ((i & 256) != 0) {
            str6 = null;
        }
        if ((i & 1024) == 0) {
            str10 = str5;
        }
        c1854260yLw.getClass();
        return LJIIIIZZ(context, c1852650yJL, interfaceC665370Q7z, z, str9, list2, str8, str7, str6, num, str10);
    }
}
