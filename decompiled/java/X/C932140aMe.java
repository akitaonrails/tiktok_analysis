package X;

import android.graphics.Paint;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: renamed from: X.0aMe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C932140aMe {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(71));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(72));

    public static Map LJ() {
        return (Map) LIZ.getValue();
    }

    public static void LIZ(C16F5 c16f5) {
        ViewGroup.LayoutParams layoutParams = c16f5.getLayoutParams();
        if (layoutParams instanceof C19ME) {
            ((C19ME) layoutParams).matchConstraintMinWidth = 0;
            C786410Ut5.W5(c16f5, layoutParams);
        }
    }

    public static List LIZJ(long j) {
        List<String> list;
        C932150aMf c932150aMf = (C932150aMf) ((Map) LIZIZ.getValue()).get(Long.valueOf(j));
        if (c932150aMf == null || (list = c932150aMf.LIZIZ) == null) {
            return new ArrayList();
        }
        return list;
    }

    public static List LIZLLL(long j) {
        List<String> list;
        C932150aMf c932150aMf = (C932150aMf) ((Map) LIZIZ.getValue()).get(Long.valueOf(j));
        if (c932150aMf == null || (list = c932150aMf.LIZ) == null) {
            return new ArrayList();
        }
        return list;
    }

    public static String LJI(List list) {
        if (list == null) {
            return "";
        }
        if (list.size() == 1) {
            String str = (String) LJ().get(ListProtector.get(list, 0));
            if (str == null) {
                return "";
            }
            return str;
        }
        if (list.size() <= 1) {
            return "";
        }
        return ((String) LJ().get(ListProtector.get(list, 0))) + " · " + ((String) LJ().get(ListProtector.get(list, 1)));
    }

    public static List LJII(LinkPlayerInfo linkPlayerInfo) {
        ArrayList arrayList = new ArrayList();
        List<String> list = linkPlayerInfo.recommendTagList;
        if (list != null && list.size() != 0) {
            Map<String, String> map = linkPlayerInfo.tagMap;
            List<String> list2 = linkPlayerInfo.recommendTagList;
            if (list2 != null) {
                for (String str : list2) {
                    String strLJI = LJI(C1697810uHb.LJIILJJIL(str));
                    if (strLJI.length() == 0 && map != null && (strLJI = map.get(str)) == null) {
                        strLJI = "";
                    }
                    if (strLJI.length() > 0) {
                        arrayList.add(strLJI);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i >= 0) {
                    if (i <= 1) {
                        arrayList2.add(obj);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return arrayList2;
        }
        return arrayList;
    }

    public static void LJIIIIZZ(LinkPlayerInfo linkPlayerInfo) {
        List<String> list = linkPlayerInfo.tagKeyList;
        if (list != null) {
            ((Map) LIZIZ.getValue()).put(Long.valueOf(linkPlayerInfo.mUser.getId()), new C932150aMf(list, LIZIZ(0, linkPlayerInfo)));
        }
    }

    public static void LJIIJJI(Map map) {
        LJ().clear();
        LJ().putAll(map);
    }

    public static List LIZIZ(int i, LinkPlayerInfo linkPlayerInfo) {
        int size;
        String str;
        ArrayList arrayList = new ArrayList();
        List<String> list = linkPlayerInfo.tagKeyList;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        StringBuilder sb = new StringBuilder("");
        String str2 = null;
        if (size == 1) {
            List<String> list2 = linkPlayerInfo.tagKeyList;
            if (list2 != null) {
                str2 = (String) ListProtector.get(list2, 0);
            }
            LJIIJ(sb, arrayList, str2, i);
        } else if (size > 1) {
            List<String> list3 = linkPlayerInfo.tagKeyList;
            if (list3 != null) {
                str = (String) ListProtector.get(list3, 0);
            } else {
                str = null;
            }
            Boolean boolValueOf = Boolean.valueOf(LJIIJ(sb, arrayList, str, i));
            if (boolValueOf.booleanValue()) {
                boolValueOf.booleanValue();
                sb.append(" · ");
                List<String> list4 = linkPlayerInfo.tagKeyList;
                if (list4 != null) {
                    str2 = (String) ListProtector.get(list4, 1);
                }
                LJIIJ(sb, arrayList, str2, i);
                return arrayList;
            }
        }
        return arrayList;
    }

    public static String LJFF(LinkPlayerInfo linkPlayerInfo, int i, boolean z) {
        List listLIZIZ = LIZIZ(i, linkPlayerInfo);
        ArrayList arrayList = (ArrayList) listLIZIZ;
        if (arrayList.size() == 1 || (z && arrayList.size() > 1)) {
            String str = (String) LJ().get(ListProtector.get(listLIZIZ, 0));
            if (str == null) {
                return "";
            }
            return str;
        }
        if (arrayList.size() <= 1) {
            return "";
        }
        return ((String) LJ().get(ListProtector.get(listLIZIZ, 0))) + " · " + ((String) LJ().get(ListProtector.get(listLIZIZ, 1)));
    }

    public static void LJIIIZ(C16F5 c16f5, C16F5 c16f52, int i) {
        if (i <= 0) {
            C20441214yg.LIZIZ("live_user_info", "UserTagHelper_tryAdaptWidthByText return as maxWidth is zero");
            return;
        }
        Paint paint = new Paint();
        paint.setTextSize(c16f5.getTextSize());
        CharSequence text = c16f5.getText();
        ViewGroup.LayoutParams layoutParams = c16f5.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = c16f52.getLayoutParams();
        if ((layoutParams instanceof C19ME) && (layoutParams2 instanceof C19ME) && text.length() != 0 && c16f52.getVisibility() != 8) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(text.subSequence(0, Math.min(text.length(), 3)).toString());
            sbLIZ.append("...");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            int iMeasureText = ((int) paint.measureText(strLIZIZ)) + c16f5.getPaddingStart() + c16f5.getPaddingEnd();
            paint.setTextSize(c16f52.getTextSize());
            int iMeasureText2 = ((int) paint.measureText(c16f52.getText().toString())) + c16f52.getPaddingStart() + c16f52.getPaddingEnd();
            C19ME c19me = (C19ME) layoutParams;
            C19ME c19me2 = (C19ME) layoutParams2;
            int i2 = iMeasureText + iMeasureText2 + ((ViewGroup.MarginLayoutParams) c19me).leftMargin + ((ViewGroup.MarginLayoutParams) c19me).rightMargin + ((ViewGroup.MarginLayoutParams) c19me2).leftMargin + ((ViewGroup.MarginLayoutParams) c19me2).rightMargin;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("UserTagHelper_tryAdaptWidthByText currentUserNameWidth:");
            sbLIZ2.append(iMeasureText);
            sbLIZ2.append(" currentRelationWidth:");
            sbLIZ2.append(iMeasureText2);
            sbLIZ2.append(" totalWidth:");
            sbLIZ2.append(i2);
            sbLIZ2.append(" maxWidth:");
            sbLIZ2.append(i);
            C20441214yg.LIZIZ("live_user_info", C2188811AlT.LIZIZ(sbLIZ2));
            if (i2 < i) {
                C20441214yg.LIZIZ("live_user_info", "UserTagHelper_tryAdaptWidthByText totalWidth < maxWidth");
                LIZ(c16f5);
                LIZ(c16f52);
                return;
            }
            paint.setTextSize(c16f5.getTextSize());
            int iMeasureText3 = ((int) paint.measureText(strLIZIZ)) + c16f5.getPaddingStart() + c16f5.getPaddingEnd() + C439101nJ.LIZ(3);
            c19me.matchConstraintMinWidth = iMeasureText3;
            c19me2.matchConstraintMinWidth = (i - iMeasureText3) - (((c19me.getMarginStart() + c19me.getMarginEnd()) + c19me2.getMarginStart()) + c19me2.getMarginEnd());
            c16f5.setText(strLIZIZ);
            C786410Ut5.g6(c16f5, layoutParams);
            C786410Ut5.g6(c16f52, layoutParams2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("UserTagHelper_tryAdaptWidthByText minText:");
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(" tvUserNameLpMinWidth:");
            sbLIZ3.append(c19me.matchConstraintMinWidth);
            sbLIZ3.append(" tvRelationLpMinWidth:");
            sbLIZ3.append(c19me2.matchConstraintMinWidth);
            C20441214yg.LIZIZ("live_user_info", C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        LIZ(c16f5);
        LIZ(c16f52);
    }

    public static boolean LJIIJ(StringBuilder sb, List list, String str, int i) {
        String str2;
        if (str == null || (str2 = (String) LJ().get(str)) == null) {
            return false;
        }
        Paint paint = new Paint();
        paint.setTextSize((int) C497740JfY.LIZIZ(13.0f));
        if (paint.measureText(sb.toString() + str2) <= (C497740JfY.LJIIZILJ() - ((int) C497740JfY.LIZIZ(224.0f))) - i) {
            sb.append(str2);
            ((ArrayList) list).add(str);
            return true;
        }
        return false;
    }
}
