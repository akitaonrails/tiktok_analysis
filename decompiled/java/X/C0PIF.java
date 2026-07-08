package X;

import Y.ACallableS17S2100000_3;
import Y.ACallableS67S1200000_3;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PIF, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PIF implements InterfaceC587950N4f {
    public static final C0PIF LIZ = new C0PIF();
    public static final Map<Integer, Integer> LIZIZ = new LinkedHashMap();

    public static void LJIIIIZZ(List list) {
        if (list == null) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0HI0(list, null), 3);
    }

    public static String LJIIIZ(View view) {
        Fragment fragmentLIZ;
        InterfaceC641090PCp interfaceC641090PCpLIZ = C642600PIk.LIZ(view);
        if (interfaceC641090PCpLIZ == null || (fragmentLIZ = interfaceC641090PCpLIZ.LIZ()) == null) {
            return null;
        }
        C0PIF c0pif = LIZ;
        Integer numValueOf = Integer.valueOf(fragmentLIZ.hashCode());
        c0pif.getClass();
        if (numValueOf == null) {
            return null;
        }
        numValueOf.intValue();
        Integer num = (Integer) ((LinkedHashMap) LIZIZ).get(numValueOf);
        if (num == null) {
            return null;
        }
        return num.toString();
    }

    public static void LJIIJ(Fragment fragment) {
        if (!(fragment instanceof SearchJediMixFeedFragment)) {
            return;
        }
        int iHashCode = fragment.hashCode();
        Map<Integer, Integer> map = LIZIZ;
        Integer numValueOf = Integer.valueOf(iHashCode);
        Integer num = (Integer) ((LinkedHashMap) map).get(Integer.valueOf(iHashCode));
        int iIntValue = 1;
        if (num != null) {
            iIntValue = 1 + num.intValue();
        }
        map.put(numValueOf, Integer.valueOf(iIntValue));
    }

    @Override // X.InterfaceC587950N4f
    public final Map<String, String> LIZIZ(Aweme aweme) {
        HashMap<String, String> mobParams;
        if (aweme != null && (mobParams = aweme.getMobParams()) != null) {
            HashMap map = new HashMap();
            String str = mobParams.get("inner_search_id");
            if (str != null) {
                map.put("inner_search_id", str);
            }
            String str2 = mobParams.get("is_inner");
            if (str2 != null) {
                map.put("is_inner", str2);
            }
            String str3 = mobParams.get("rank_inner");
            if (str3 != null) {
                map.put("rank_inner", str3);
            }
            String str4 = mobParams.get("rank");
            if (str4 != null) {
                map.put("rank", str4);
            }
            String str5 = mobParams.get("click_times");
            if (str5 != null) {
                map.put("click_times", str5);
            }
            String str6 = mobParams.get("is_slide");
            if (str6 != null) {
                map.put("is_slide", str6);
            }
            String str7 = mobParams.get("slide_rank");
            if (str7 != null) {
                map.put("slide_rank", str7);
            }
            return map;
        }
        return C2097608Jq.LJ();
    }

    public static void LIZJ(Aweme aweme, AbstractC1386130mAt abstractC1386130mAt) {
        C0PCY<C0PYD> c0pcyY30;
        C0PYD c0pyd;
        if (aweme != null) {
            ISearchContextAbility iSearchContextAbilityLIZJ = C0Q3E.LIZJ(aweme);
            if (iSearchContextAbilityLIZJ != null && (c0pcyY30 = iSearchContextAbilityLIZJ.Y30()) != null && (c0pyd = (C0PYD) c0pcyY30.LIZJ()) != null) {
                C0P65 c0p65 = c0pyd.LLILLL;
                if (c0p65 != null) {
                    String str = c0p65.LIZ;
                    if (str != null && str.length() != 0) {
                        abstractC1386130mAt.LJ("fullscreen_enter_doc_id", str);
                    }
                    abstractC1386130mAt.LJ("fullscreen_rank", String.valueOf(c0p65.LIZIZ));
                }
                if (aweme == null) {
                    return;
                }
            }
            HashMap<String, String> searchExtraParams = AwemeBizExtKt.getSearchExtraParams(aweme);
            if (searchExtraParams != null) {
                String str2 = searchExtraParams.get("fullscreen_actual_rank");
                if (str2 != null) {
                    abstractC1386130mAt.LJ("fullscreen_actual_rank", str2);
                }
                String str3 = searchExtraParams.get("fullscreen_actual_enter_doc_id");
                if (str3 != null) {
                    abstractC1386130mAt.LJ("fullscreen_actual_enter_doc_id", str3);
                }
            }
        }
    }

    @Override // X.InterfaceC587950N4f
    public final void LIZ(C2344009Gk c2344009Gk, Aweme aweme) {
        if (aweme != null) {
            AwS624S0100000_10 awS624S0100000_10 = new AwS624S0100000_10(c2344009Gk, 126);
            HashMap<String, String> mobParams = aweme.getMobParams();
            if (mobParams != null) {
                String str = mobParams.get("inner_search_id");
                if (str != null) {
                    awS624S0100000_10.invoke("inner_search_id", str);
                }
                String str2 = mobParams.get("is_inner");
                if (str2 != null) {
                    awS624S0100000_10.invoke("is_inner", str2);
                }
                String str3 = mobParams.get("is_slide");
                if (str3 != null) {
                    awS624S0100000_10.invoke("is_slide", str3);
                }
                String str4 = mobParams.get("slide_rank");
                if (str4 != null) {
                    awS624S0100000_10.invoke("slide_rank", str4);
                }
                String str5 = mobParams.get("rank_inner");
                if (str5 != null) {
                    awS624S0100000_10.invoke("rank_inner", str5);
                }
                String str6 = mobParams.get("rank");
                if (str6 != null) {
                    awS624S0100000_10.invoke("rank", str6);
                }
            }
        }
    }

    public static void LIZLLL(Integer num, String str, List list) {
        if (list != null && str != null && str.length() != 0) {
            C15O7.LIZIZ(new ACallableS67S1200000_3(list, str, num, 2), C823050WQl.LIZIZ(), null);
        }
    }

    public static void LJ(String str, String str2, List list, boolean z) {
        if (list != null && str != null && str.length() != 0) {
            C15O7.LIZIZ(new ACallableS17S2100000_3(list, str, str2, 1), C823050WQl.LIZIZ(), null);
            if (z) {
                C0PDQ.LIZ.getClass();
                LJI(C0PDQ.LIZIZ, str, list, false);
            }
        }
    }

    public static void LJFF(int i, int i2, Aweme aweme, String str) {
        if (aweme != null) {
            AwemeExtKt.appendMobParam(aweme, "click_times", str);
            AwemeExtKt.appendMobParam(aweme, "is_slide", String.valueOf(i));
            AwemeExtKt.appendMobParam(aweme, "slide_rank", String.valueOf(i2));
        }
    }

    public static void LJI(int i, String str, List list, boolean z) {
        if (list == null) {
            return;
        }
        Iterator it2 = list.iterator();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (it2.hasNext()) {
                Aweme aweme = (Aweme) it2.next();
                if (aweme.getAid().equals(str) && C123100dR.LIZ(aweme.getAid())) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                Aweme aweme2 = (Aweme) obj;
                LIZ.getClass();
                LJIIJJI(aweme2, str, i3, i2, i, 0, z2, z);
                if (AwemeBizExtKt.isSubAweme(aweme2)) {
                    z2 = true;
                }
                i3 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public static void LJII(List list, String str, int i, C0PIG c0pig) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) C0PN8.LJJI(list);
        Iterator it2 = arrayList.iterator();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (it2.hasNext()) {
                Aweme aweme = (Aweme) it2.next();
                if (aweme.getAid().equals(str) && C123100dR.LIZ(aweme.getAid())) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        int i3 = 0;
        for (Object obj : arrayList) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                Aweme aweme2 = (Aweme) obj;
                LIZ.getClass();
                Integer numLJIIJJI = LJIIJJI(aweme2, str, i3, i2, 0, i, z, false);
                if (AwemeBizExtKt.isSubAweme(aweme2)) {
                    z = true;
                }
                if (numLJIIJJI != null) {
                    c0pig.LIZ(numLJIIJJI.intValue());
                }
                i3 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public static void LJIIL(int i, int i2, Aweme aweme, String str) {
        if (aweme != null) {
            AwemeExtKt.appendMobParam(aweme, "inner_search_id", str);
            AwemeExtKt.appendMobParam(aweme, "is_inner", "1");
            AwemeExtKt.appendMobParam(aweme, "rank_inner", String.valueOf(i));
            AwemeExtKt.appendMobParam(aweme, "rank", String.valueOf(i2));
        }
    }

    public static Integer LJIIJJI(Aweme aweme, String str, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        String str2;
        String str3;
        String str4;
        int i5;
        int i6;
        Integer num;
        Integer num2;
        Integer num3;
        String str5 = null;
        if (aweme == null) {
            return null;
        }
        C0P71 c0p71 = ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLLJIL;
        if (c0p71 != null) {
            str2 = c0p71.LIZIZ;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str2, str)) {
            if (c0p71 == null || (str3 = c0p71.LIZJ) == null) {
                str3 = "";
            }
        } else {
            str3 = str;
        }
        if (i3 == 0) {
            i3 = i4;
        }
        if (c0p71 != null) {
            str4 = c0p71.LIZIZ;
        } else {
            str4 = null;
        }
        if (Intrinsics.LJFF(str4, str)) {
            int iIntValue = 0;
            if (i2 == -1) {
                if (c0p71 != null && (num3 = c0p71.LIZ) != null) {
                    iIntValue = num3.intValue();
                }
                iIntValue += i;
            } else {
                i3 = i - i2;
                if (c0p71 != null && (num2 = c0p71.LIZ) != null) {
                    iIntValue = num2.intValue();
                }
            }
            i5 = iIntValue + i3;
        } else if (i2 == -1) {
            i5 = i + i3;
        } else {
            i5 = i - i2;
        }
        if (z2) {
            i6 = i;
        } else {
            i6 = i5;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("currentPosition: ");
        sbLIZ.append(i5);
        sbLIZ.append(", currentAwemeId: ");
        sbLIZ.append(C436190H8n.LIZ(aweme));
        sbLIZ.append(", index: ");
        sbLIZ.append(i);
        sbLIZ.append(", enterIndex: ");
        sbLIZ.append(i2);
        sbLIZ.append(", record rank: ");
        if (c0p71 != null) {
            num = c0p71.LIZ;
        } else {
            num = null;
        }
        sbLIZ.append(num);
        sbLIZ.append(", record id: ");
        if (c0p71 != null) {
            str5 = c0p71.LIZIZ;
        }
        sbLIZ.append(str5);
        C2188811AlT.LIZIZ(sbLIZ);
        C0Q3E.LIZJ(aweme).fe(new C0P81(new C0P65(str3, i5)));
        AwemeExtKt.appendExtraParamUseInSearch(aweme, "fullscreen_actual_enter_doc_id", str);
        AwemeExtKt.appendExtraParamUseInSearch(aweme, "fullscreen_actual_rank", String.valueOf(i6 - (z ? 1 : 0)));
        return Integer.valueOf(i5);
    }
}
