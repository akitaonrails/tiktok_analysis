package X;

import android.view.View;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.search.model.RefSource;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel.SearchRefreshPredictMobCanShowVM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS219S0300000_10;
import kotlin.jvm.internal.AwS45S0500000_10;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: renamed from: X.0PXJ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PXJ {
    public static final C0PXJ LIZ = new C0PXJ();

    public static String LJI(SearchMixFeed searchMixFeed) {
        if (searchMixFeed == null) {
            return null;
        }
        Integer num = searchMixFeed.docType;
        if (num != null && num.intValue() == 105) {
            return null;
        }
        if (searchMixFeed.getFeedType() == 204) {
            return "2";
        }
        return "1";
    }

    public static void LJII(Map map, Map map2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(map);
        c2344009Gk.LJII(map2);
        C20684815ws.LJIILLIIL("search_card_click", c2344009Gk.LIZ);
    }

    public static void LJIIJ(Map map, Map map2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(map);
        c2344009Gk.LJII(map2);
        c2344009Gk.LJIIIIZZ("is_page", "1");
        C20684815ws.LJIILLIIL("search_landing_page_perf", c2344009Gk.LIZ);
    }

    public static void LJIIJJI(Map map, Map map2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(map);
        c2344009Gk.LJII(map2);
        c2344009Gk.LJIIIIZZ("is_page", "1");
        C20684815ws.LJIILLIIL("search_landing_page_show", c2344009Gk.LIZ);
    }

    public static void LJIIL(Map map, Map map2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(map);
        c2344009Gk.LJII(map2);
        C20684815ws.LJIILLIIL("search_result_click", c2344009Gk.LIZ);
    }

    public static void LJIILJJIL(Map map, Map map2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(map);
        c2344009Gk.LJII(map2);
        C20684815ws.LJIILLIIL("search_result_show", c2344009Gk.LIZ);
    }

    public static void LJIILL(Map map, Map map2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(map);
        c2344009Gk.LJII(map2);
        C20684815ws.LJIILLIIL("search_result_show_video", c2344009Gk.LIZ);
    }

    public static void LJIILLIIL(String str, Map map) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(map);
        c2344009Gk.LJIIIIZZ("click_type", str);
        C20684815ws.LJIILLIIL("search_top1_click_fail", c2344009Gk.LIZ);
    }

    public static void LIZJ(String str, Map map, boolean z) {
        String str2;
        if (str != null) {
            map.put("multi_card_type", str);
        }
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_page", str2);
    }

    public static void LIZLLL(View view, PowerCell powerCell, Function0 function0) {
        InterfaceC665370Q7z interfaceC665370Q7zLIZ;
        if (C0BD9.LIZ()) {
            interfaceC665370Q7zLIZ = C1196320hEk.LIZ(powerCell);
        } else {
            interfaceC665370Q7zLIZ = null;
        }
        LJFF(view, interfaceC665370Q7zLIZ, function0);
    }

    public static void LJFF(View view, InterfaceC665370Q7z interfaceC665370Q7z, Function0 function0) {
        AwS589S0100000_10 awS589S0100000_10 = new AwS589S0100000_10(interfaceC665370Q7z, 498);
        C259800zU c259800zU = new C259800zU();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(view.hashCode());
        sbLIZ.append(((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLILLL);
        C2211631BhB.LJ(view, new C0PXK(C2188811AlT.LIZIZ(sbLIZ), view, function0, c259800zU, awS589S0100000_10));
    }

    public static void LJIIIZ(long j, Map map, Map map2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(map);
        c2344009Gk.LJII(map2);
        c2344009Gk.LIZLLL(j, "duration");
        c2344009Gk.LJIIIIZZ("is_page", "1");
        C20684815ws.LJIILLIIL("search_landing_page_finish", c2344009Gk.LIZ);
    }

    public static void LJIILIIL(boolean z, Map map, boolean z2) {
        String str;
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str2 = "1";
        if (z2) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_default_show", str);
        if (!z) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_page", str2);
        c2344009Gk.LJIIIIZZ("element_type", "highlight");
        c2344009Gk.LJII(map);
        C20684815ws.LJIILLIIL("search_result_element_show", c2344009Gk.LIZ);
    }

    public static void LIZIZ(Map map, List list, List list2, Map map2) {
        List listLJLLI;
        String str;
        if (!((Boolean) C0BCK.LIZ.getValue()).booleanValue()) {
            return;
        }
        if (list != null && list2 != null) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    Integer numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(((CharSequence) it2.next()).toString()) - 1);
                    int iIntValue = numValueOf.intValue();
                    if (iIntValue >= 0 && iIntValue < list.size()) {
                        arrayList.add(numValueOf);
                    }
                }
                Set setLLIIJI = C13LP.LLIIJI(arrayList);
                if (setLLIIJI != null && (listLJLLI = C13LP.LJLLI(setLLIIJI, list)) != null && (!listLJLLI.isEmpty())) {
                    if (!listLJLLI.isEmpty()) {
                        Iterator it3 = listLJLLI.iterator();
                        while (it3.hasNext()) {
                            Integer num = ((RefSource) it3.next()).type;
                            if (num != null && num.intValue() == 2) {
                                str = "web_source";
                                break;
                            }
                        }
                        str = "user_posts";
                        map.put("words_source_type", str);
                    } else {
                        str = "user_posts";
                        map.put("words_source_type", str);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (map2 != null) {
            Object obj = map2.get("title");
            if (obj != null) {
                map.put("corner_mark_url", obj.toString());
            }
            Object obj2 = map2.get("sup_order");
            if (obj2 != null) {
                map.put("corner_mark_rank", obj2.toString());
            }
        }
    }

    public static void LJ(View view, Function0 function0, Function0 function02, Function0 function03) {
        C2211631BhB.LJ(view, new AwS219S0300000_10(function0, (Function0<String>) function03, (Function0<Unit>) function02, (Function0<Boolean>) 21));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel.SearchRefreshPredictMobCanShowVM] */
    public static void LJIIIIZZ(View view, Function0 function0, Function0 function02, Function0 function03, boolean z) {
        C259800zU c259800zU = new C259800zU();
        if (z) {
            if (view.isAttachedToWindow()) {
                c259800zU.element = C0P72.LIZ(C946803n0.LIZ(view));
            } else {
                view.addOnAttachStateChangeListener(new C0R48(c259800zU, view, 15));
            }
        }
        C2211631BhB.LJ(view, new AwS45S0500000_10(function03, (Function0<String>) view, (View) c259800zU, (C259800zU<SearchRefreshPredictMobCanShowVM>) function0, (Function0<? extends Map<String, String>>) function02, (Function0<? extends Map<String, String>>) 4));
    }

    public static Map LIZ(C0PXJ c0pxj, View view, Aweme aweme, String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, String str8, Integer num2, Integer num3, int i) {
        String string;
        String uid;
        Integer num4 = null;
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 256) != 0) {
            str6 = null;
        }
        if ((i & 1024) != 0) {
            str7 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str8 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            num2 = null;
        }
        if ((i & 8192) == 0) {
            num4 = num3;
        }
        c0pxj.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        User author = aweme.getAuthor();
        if (author != null && (uid = author.getUid()) != null) {
            linkedHashMap.put("author_id", uid);
        }
        String groupId = aweme.getGroupId();
        if (groupId != null) {
            linkedHashMap.put("group_id", groupId);
        }
        if (str2 != null) {
            linkedHashMap.put("multi_card_type", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("current_title_keyword", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("list_result_type", str4);
            String aid = aweme.getAid();
            if (aid == null) {
                aid = "";
            }
            linkedHashMap.put("list_item_id", aid);
            if (num == null || (string = num.toString()) == null) {
                string = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("item_rank", string);
        }
        Video video = aweme.getVideo();
        if (video != null) {
            linkedHashMap.put("search_video_duration", String.valueOf(video.getDuration()));
        }
        linkedHashMap.put("is_page", str);
        C662670Pyz.LIZ.getClass();
        String strLIZ = C662670Pyz.LIZ();
        if (strLIZ != null) {
            linkedHashMap.put("end_to_end_search_session_id", strLIZ);
        }
        if (view != null && (str6 == null || linkedHashMap.put("is_first_screen", str6) == null)) {
            C645920PVe.LIZ(view, str5, aweme.getAid(), linkedHashMap);
        }
        if (str7 != null) {
            linkedHashMap.put("show_status", str7);
        }
        if (str8 != null) {
            linkedHashMap.put("block_type", str8);
        }
        if (num2 != null && num2.intValue() >= 0) {
            linkedHashMap.put("block_index", String.valueOf(num2.intValue()));
        }
        if (num4 != null && num4.intValue() >= 0) {
            linkedHashMap.put("position_in_block", String.valueOf(num4.intValue()));
        }
        return linkedHashMap;
    }
}
