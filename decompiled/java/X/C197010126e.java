package X;

import android.content.Context;
import android.graphics.Color;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.gamora.editor.text.TextModeBackgroundColorSettings;
import com.ss.android.ugc.gamora.editor.text.TextModeBackgroundSettings;
import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.126e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C197010126e {
    public static final C197010126e LIZ = new C197010126e();
    public static final String LIZIZ;
    public static final List<TextModeBackgroundSettings.BackgroundItem> LIZJ;
    public static final List<TextModeBackgroundColorSettings.BackgroundColorItem> LIZLLL;
    public static final C01GW LJ;
    public static String LJFF;
    public static Integer LJI;

    static {
        C01GW c01gw = TextModeBackgroundSettings.LIZIZ;
        String str = ((TextModeBackgroundSettings.TextModeBackgroundConfig) c01gw.getValue()).channelName;
        if (str == null) {
            str = "";
        }
        LIZIZ = str;
        LIZJ = ((TextModeBackgroundSettings.TextModeBackgroundConfig) c01gw.getValue()).items;
        LIZLLL = ((TextModeBackgroundColorSettings.TextModeBackgroundColorConfig) TextModeBackgroundColorSettings.LIZIZ.getValue()).items;
        LJ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(279));
    }

    public static Keva LJIIL() {
        return (Keva) LJ.getValue();
    }

    public static boolean LJIILIIL() {
        String strLJ;
        List<TextModeBackgroundSettings.BackgroundItem> list;
        String str = LIZIZ;
        if (str.length() == 0 || (strLJ = C1552050qUV.LJ(C1553670qX7.LIZ(), str)) == null || strLJ.length() == 0 || (list = LIZJ) == null || list.isEmpty()) {
            return false;
        }
        for (TextModeBackgroundSettings.BackgroundItem backgroundItem : list) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJ);
            sbLIZ.append(File.separator);
            sbLIZ.append(backgroundItem.backgroundFileName);
            if (new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)).exists()) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZ() {
        String strLJ = C1552050qUV.LJ(C1553670qX7.LIZ(), LIZIZ);
        return strLJ != null && new C0VSJ(strLJ).exists();
    }

    public static void LIZIZ() {
        C1551950qUL c1551950qULLJIIIZ;
        if (LJIILIIL()) {
            if (System.currentTimeMillis() - LJIIL().getLong("text_last_load_time", 0L) >= 259200000) {
                LJIIL().storeLong("text_last_load_time", System.currentTimeMillis());
                Forest forestLIZ = C0T1N.LIZ();
                RequestParams requestParams = new RequestParams(null, 1, null);
                requestParams.channel = ((TextModeBackgroundSettings.TextModeBackgroundConfig) TextModeBackgroundSettings.LIZIZ.getValue()).channelName;
                requestParams.bundle = "main.png";
                forestLIZ.fetchResourceAsync("", requestParams, AFwS273S0000000_29.get$arr$(440));
                return;
            }
            return;
        }
        if (C301810BsJ.LIZ()) {
            return;
        }
        String strLIZ = C1553670qX7.LIZ();
        String str = LIZIZ;
        if (C123100dR.LIZ(C1552050qUV.LJ(strLIZ, str)) || (c1551950qULLJIIIZ = C1552050qUV.LJIIIZ(strLIZ)) == null) {
            return;
        }
        Map<String, List<CheckRequestBodyModel.TargetChannel>> mapLIZJ = C2097908Jt.LIZJ(new Pair(strLIZ, Collections.singletonList(new CheckRequestBodyModel.TargetChannel(str))));
        OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
        optionCheckUpdateParams.setLazyUpdate(true);
        c1551950qULLJIIIZ.LIZ(null, mapLIZJ, optionCheckUpdateParams);
    }

    public static ImageUrlModel LIZJ(C1456210nzv c1456210nzv) {
        String str = c1456210nzv.LIZLLL;
        if (str != null && str.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("file://");
            sbLIZ.append(c1456210nzv.LIZLLL);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("file://");
            sbLIZ2.append(c1456210nzv.LIZLLL);
            return new ImageUrlModel(strLIZIZ, Collections.singletonList(C2188811AlT.LIZIZ(sbLIZ2)));
        }
        return null;
    }

    public static C577650Ml9 LJIIIIZZ(int i) {
        long color;
        TextModeBackgroundColorSettings.BackgroundColorItem backgroundColorItem;
        List<String> list;
        String str;
        String str2;
        TextModeBackgroundColorSettings.BackgroundColorItem backgroundColorItem2;
        List<String> list2;
        String str3 = "#000000";
        long color2 = -1;
        try {
            List<TextModeBackgroundColorSettings.BackgroundColorItem> list3 = LIZLLL;
            if (list3 == null || (backgroundColorItem2 = (TextModeBackgroundColorSettings.BackgroundColorItem) C13LP.LJJJLZIJ(i, list3)) == null || (list2 = backgroundColorItem2.gradientColor) == null || (str2 = (String) C13LP.LJJJLZIJ(0, list2)) == null) {
                str2 = "#000000";
            }
            color = Color.parseColor(str2);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            color = -1;
        }
        try {
            List<TextModeBackgroundColorSettings.BackgroundColorItem> list4 = LIZLLL;
            if (list4 != null && (backgroundColorItem = (TextModeBackgroundColorSettings.BackgroundColorItem) C13LP.LJJJLZIJ(i, list4)) != null && (list = backgroundColorItem.gradientColor) != null && (str = (String) C13LP.LJJJLZIJ(1, list)) != null) {
                str3 = str;
            }
            color2 = Color.parseColor(str3);
        } catch (IllegalArgumentException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        return new C577650Ml9(color, color2);
    }

    public static C1456210nzv LJIIJJI(String str) {
        int iIntValue;
        String str2;
        TextModeBackgroundColorSettings.BackgroundColorItem backgroundColorItem;
        int size = 1;
        int iLJIIIZ = LJIIIZ(str, LIZJ) + 1;
        List<TextModeBackgroundColorSettings.BackgroundColorItem> list = LIZLLL;
        if (list != null) {
            size = list.size();
        }
        int i = iLJIIIZ % size;
        Integer num = LJI;
        int color = -1;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = LJIIL().getInt("text_color", -1);
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        if (numValueOf != null && numValueOf.intValue() != -1) {
            color = numValueOf.intValue();
        } else if (list != null) {
            try {
                TextModeBackgroundColorSettings.BackgroundColorItem backgroundColorItem2 = (TextModeBackgroundColorSettings.BackgroundColorItem) C13LP.LJJJLZIJ(i, list);
                if (backgroundColorItem2 != null) {
                    color = Color.parseColor(backgroundColorItem2.textColor);
                }
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        List<TextModeBackgroundColorSettings.BackgroundColorItem> list2 = LIZLLL;
        if (list2 == null || (backgroundColorItem = (TextModeBackgroundColorSettings.BackgroundColorItem) C13LP.LJJJLZIJ(i, list2)) == null || (str2 = backgroundColorItem.background) == null) {
            str2 = "";
        }
        C1456210nzv c1456210nzv = new C1456210nzv(str2, str2, color, "", LJIIIIZZ(i));
        LIZ.getClass();
        LJIIL().storeString("background_name", str2);
        return c1456210nzv;
    }

    public static String LJ(Context context, CreativeInfo creativeInfo) {
        C0VSJ c0vsjLIZJ = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZJ(creativeInfo, EnumC20228214Cy.PHOTO, "textmode_bg.png", true);
        InputStream inputStreamOpen = context.getResources().getAssets().open("textmode_bg.png");
        C570490MZb.LJI(c0vsjLIZJ);
        C09BH.LJIIIIZZ(c0vsjLIZJ, C2106208My.LIZIZ(inputStreamOpen));
        inputStreamOpen.close();
        return c0vsjLIZJ.getAbsolutePath();
    }

    public static String LJFF(Context context, CreativeInfo creativeInfo) {
        C0VSJ c0vsjLIZJ = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZJ(creativeInfo, EnumC20228214Cy.PHOTO, "textmode_main.png", true);
        InputStream inputStreamOpen = context.getResources().getAssets().open("textmode_main.png");
        C570490MZb.LJI(c0vsjLIZJ);
        C09BH.LJIIIIZZ(c0vsjLIZJ, C2106208My.LIZIZ(inputStreamOpen));
        inputStreamOpen.close();
        return c0vsjLIZJ.getAbsolutePath();
    }

    public static C1456210nzv LJI(CreativeInfo creativeInfo, String str) {
        String str2;
        int size;
        String str3;
        int size2;
        TextModeBackgroundSettings.BackgroundItem backgroundItem;
        TextModeBackgroundSettings.BackgroundItem backgroundItem2;
        List<TextModeBackgroundSettings.BackgroundItem> list = LIZJ;
        int iLJIIIZ = LJIIIZ(str, list);
        String strLJ = C1552050qUV.LJ(C1553670qX7.LIZ(), LIZIZ);
        if (strLJ == null) {
            strLJ = "";
        }
        if (list == null || (backgroundItem2 = (TextModeBackgroundSettings.BackgroundItem) C13LP.LJJJLZIJ(iLJIIIZ, list)) == null || (str2 = backgroundItem2.backgroundFileName) == null) {
            str2 = "";
        }
        C1456210nzv c1456210nzvLIZLLL = LIZLLL(iLJIIIZ, str2, strLJ);
        int i = iLJIIIZ + 1;
        if (list != null) {
            size = list.size();
        } else {
            size = 1;
        }
        int i2 = i % size;
        while (c1456210nzvLIZLLL == null) {
            if (i2 != iLJIIIZ) {
                List<TextModeBackgroundSettings.BackgroundItem> list2 = LIZJ;
                if (list2 == null || (backgroundItem = (TextModeBackgroundSettings.BackgroundItem) C13LP.LJJJLZIJ(i2, list2)) == null || (str3 = backgroundItem.backgroundFileName) == null) {
                    str3 = "";
                }
                c1456210nzvLIZLLL = LIZLLL(i2, str3, strLJ);
                int i3 = i2 + 1;
                if (list2 != null) {
                    size2 = list2.size();
                } else {
                    size2 = 1;
                }
                i2 = i3 % size2;
            } else {
                return new C1456210nzv("textmode_main.png", LJFF(C0CHQ.LIZ, creativeInfo), -1, null, LJIIIIZZ(0));
            }
        }
        return c1456210nzvLIZLLL;
    }

    public static C1456210nzv LJII(CreativeInfo creativeInfo, String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            str = LJIIL().getString("background_name", null);
        }
        C1456210nzv c1456210nzvLJI = LJI(creativeInfo, str);
        LIZ.getClass();
        LJIIL().storeString("background_name", c1456210nzvLJI.LIZ);
        return c1456210nzvLJI;
    }

    public static int LJIIIZ(String str, List list) {
        if (str != null && str.length() != 0 && list != null) {
            Iterator it2 = list.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(((TextModeBackgroundSettings.BackgroundItem) it2.next()).backgroundFileName, str)) {
                    if (i > -1) {
                        return i;
                    }
                } else {
                    i++;
                }
            }
        }
        return 0;
    }

    public static C1456210nzv LJIIJ(CreativeInfo creativeInfo, String str) {
        int size;
        String str2;
        int size2;
        String str3;
        TextModeBackgroundSettings.BackgroundItem backgroundItem;
        TextModeBackgroundSettings.BackgroundItem backgroundItem2;
        List<TextModeBackgroundSettings.BackgroundItem> list = LIZJ;
        int iLJIIIZ = LJIIIZ(str, list);
        int i = iLJIIIZ + 1;
        if (list != null) {
            size = list.size();
        } else {
            size = 1;
        }
        int i2 = i % size;
        String strLJ = C1552050qUV.LJ(C1553670qX7.LIZ(), LIZIZ);
        if (strLJ == null) {
            strLJ = "";
        }
        if (list == null || (backgroundItem2 = (TextModeBackgroundSettings.BackgroundItem) C13LP.LJJJLZIJ(i2, list)) == null || (str2 = backgroundItem2.backgroundFileName) == null) {
            str2 = "";
        }
        C1456210nzv c1456210nzvLIZLLL = LIZLLL(i2, str2, strLJ);
        while (true) {
            if (c1456210nzvLIZLLL == null) {
                if (i2 != iLJIIIZ) {
                    int i3 = i2 + 1;
                    List<TextModeBackgroundSettings.BackgroundItem> list2 = LIZJ;
                    if (list2 != null) {
                        size2 = list2.size();
                    } else {
                        size2 = 1;
                    }
                    i2 = i3 % size2;
                    if (list2 == null || (backgroundItem = (TextModeBackgroundSettings.BackgroundItem) C13LP.LJJJLZIJ(i2, list2)) == null || (str3 = backgroundItem.backgroundFileName) == null) {
                        str3 = "";
                    }
                    c1456210nzvLIZLLL = LIZLLL(i2, str3, strLJ);
                } else {
                    c1456210nzvLIZLLL = new C1456210nzv("textmode_main.png", LJFF(C0CHQ.LIZ, creativeInfo), -1, null, LJIIIIZZ(0));
                    break;
                }
            } else {
                break;
            }
        }
        LIZ.getClass();
        LJIIL().storeString("background_name", c1456210nzvLIZLLL.LIZ);
        return c1456210nzvLIZLLL;
    }

    public static C1456210nzv LIZLLL(int i, String str, String str2) {
        int color;
        String str3;
        TextModeBackgroundSettings.BackgroundItem backgroundItem;
        List<TextModeBackgroundSettings.BackgroundItem> list;
        TextModeBackgroundSettings.BackgroundItem backgroundItem2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        String str4 = File.separator;
        sbLIZ.append(str4);
        sbLIZ.append(str);
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (c0vsj.exists() && !c0vsj.isDirectory()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str2);
            sbLIZ2.append(str4);
            sbLIZ2.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            try {
                list = LIZJ;
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (list != null && (backgroundItem2 = (TextModeBackgroundSettings.BackgroundItem) C13LP.LJJJLZIJ(i, list)) != null) {
                color = Color.parseColor(backgroundItem2.textColor);
            } else {
                color = -1;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(File.separator);
            List<TextModeBackgroundSettings.BackgroundItem> list2 = LIZJ;
            if (list2 == null || (backgroundItem = (TextModeBackgroundSettings.BackgroundItem) C13LP.LJJJLZIJ(i, list2)) == null || (str3 = backgroundItem.buttonIconName) == null) {
                str3 = "";
            }
            sb.append(str3);
            return new C1456210nzv(str, strLIZIZ, color, sb.toString(), null);
        }
        return null;
    }
}
