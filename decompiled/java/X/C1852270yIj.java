package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeBarAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.CreativeTemplate;
import com.ss.android.ugc.aweme.tako.ccl.model.api.CreativeTemplateAsset;
import com.ss.android.ugc.aweme.tako.ccl.model.api.CreativeTemplateTag;
import com.ss.android.ugc.aweme.tako.ccl.net.TemplateTabData;
import com.ss.android.ugc.aweme.tako.experiment.TakoEnterMethodListExperiment;
import com.ss.android.ugc.aweme.tako.model.TakoPageContext;
import com.ss.android.ugc.aweme.tako.otherpage.image.create.ITakoMultiTabTemplateAbility;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS2S2301000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yIj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1852270yIj {
    public static WeakReference<InterfaceC665370Q7z> LIZIZ;
    public static C1852650yJL LIZLLL;
    public static final C1852270yIj LIZ = new C1852270yIj();
    public static Map<String, String> LIZJ = C2097608Jq.LJ();
    public static Map<String, String> LJ = C2097608Jq.LJ();
    public static final C054G LJFF = C2296808zG.LIZ(C0PEM.LIZJ);

    public static InterfaceC665370Q7z LJIIJJI() {
        WeakReference<InterfaceC665370Q7z> weakReference = LIZIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void LJIILLIIL() {
        WeakReference<InterfaceC665370Q7z> weakReference;
        InterfaceC665370Q7z interfaceC665370Q7z;
        TakoSubModeBarAbility takoSubModeBarAbility;
        C1852650yJL c1852650yJL = LIZLLL;
        if ((c1852650yJL != null && c1852650yJL.LIZ == 4) && (weakReference = LIZIZ) != null && (interfaceC665370Q7z = weakReference.get()) != null && (takoSubModeBarAbility = (TakoSubModeBarAbility) C1558520qew.LIZ(interfaceC665370Q7z, TakoSubModeBarAbility.class, null)) != null) {
            takoSubModeBarAbility.dy1();
        }
        LIZLLL = null;
        LIZJ = C2097608Jq.LJ();
    }

    public static Map LJIIIIZZ() {
        ITakoMultiTabTemplateAbility iTakoMultiTabTemplateAbility;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIJJI = LJIIJJI();
        String str = null;
        TemplateTabData templateTabDataJ50 = (interfaceC665370Q7zLJIIJJI == null || (iTakoMultiTabTemplateAbility = (ITakoMultiTabTemplateAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIJJI, ITakoMultiTabTemplateAbility.class, null)) == null) ? null : iTakoMultiTabTemplateAbility.j50();
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("tab_id", templateTabDataJ50 != null ? templateTabDataJ50.tabId : null);
        if (templateTabDataJ50 != null && (str = templateTabDataJ50.tabEnName) == null) {
            str = templateTabDataJ50.tabName;
        }
        pairArr[1] = new Pair("template_tab", str);
        String str2 = LIZJ.get("push_id");
        if (str2 == null) {
            str2 = "";
        }
        pairArr[2] = new Pair("push_id", str2);
        return C2097608Jq.LJIIJ(pairArr);
    }

    public static List LJFF(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                CreativeTemplateAsset creativeTemplateAsset = (CreativeTemplateAsset) it2.next();
                arrayList.add(new BaseImage(creativeTemplateAsset.uri, null, Collections.singletonList(creativeTemplateAsset.url), null, creativeTemplateAsset.width, creativeTemplateAsset.height, creativeTemplateAsset.uri, null, null, null, null, "template", null, null, null, 0, 0, null, 259978, null));
            }
        }
        return arrayList;
    }

    public static Map LJIIL(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", LIZJ.get("enter_from"));
        linkedHashMap.put("enter_method", LIZJ.get("enter_method"));
        linkedHashMap.put("process_id", LIZJ.get("process_id"));
        linkedHashMap.put("tako_session_id", LIZJ.get("tako_session_id"));
        linkedHashMap.put("tako_chat_id", LIZJ.get("tako_chat_id"));
        linkedHashMap.put("source", "inspiration_hub");
        linkedHashMap.put("template_id", str);
        return linkedHashMap;
    }

    public static C1853460yKe LJ(CreativeTemplate creativeTemplate, int i) {
        String str = creativeTemplate.templateId;
        String strLJ = C1853740yL6.LJ(creativeTemplate.templateType);
        if (strLJ == null) {
            strLJ = C1853740yL6.LJFF(creativeTemplate.templateType);
        }
        String str2 = creativeTemplate.templatePrompt;
        String str3 = creativeTemplate.pictureUrl;
        String str4 = creativeTemplate.nameText;
        String str5 = creativeTemplate.subTitle;
        Integer num = creativeTemplate.defaultStdSize;
        String str6 = creativeTemplate.skillInfo;
        if (str6.length() <= 0) {
            str6 = null;
        }
        return new C1853460yKe(str, strLJ, str2, str3, null, false, null, false, str4, str5, false, C1853460yKe.IMAGE_TEMPLATE_SIZE, false, num, str6, creativeTemplate.templateType, Integer.valueOf(creativeTemplate.processType), Integer.valueOf(i));
    }

    public static Map LJII(String str, String str2, String str3, String str4) {
        Pair[] pairArr = new Pair[4];
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("mode_source", str);
        if (str3 == null) {
            str3 = "";
        }
        pairArr[1] = new Pair("tab_id", str3);
        if (str4 == null) {
            str4 = "";
        }
        pairArr[2] = new Pair("template_tab", str4);
        if (str2 == null && (str2 = LIZJ.get("push_id")) == null) {
            str2 = "";
        }
        pairArr[3] = new Pair("push_id", str2);
        return C2097608Jq.LJIIJ(pairArr);
    }

    public static void LJIILJJIL(CreativeTemplate creativeTemplate, int i, String str, String str2) {
        String strLIZJ;
        String str3;
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        String str4 = LIZJ.get("enter_from");
        if (str4 == null) {
            str4 = "";
        }
        String str5 = LIZJ.get("enter_method");
        if (str5 == null) {
            str5 = "";
        }
        String str6 = LIZJ.get("process_id");
        if (str6 == null) {
            str6 = "";
        }
        String str7 = LIZJ.get("tako_session_id");
        if (str7 == null) {
            str7 = "";
        }
        String str8 = LIZJ.get("tako_chat_id");
        if (str8 == null) {
            str8 = "";
        }
        String str9 = creativeTemplate.templateId;
        Integer numValueOf = Integer.valueOf(i);
        C1852650yJL c1852650yJL = LIZLLL;
        if (c1852650yJL != null) {
            strLIZJ = C1855920yOc.LIZJ(Integer.valueOf(c1852650yJL.LIZ));
        } else {
            strLIZJ = null;
        }
        C1852650yJL c1852650yJL2 = LIZLLL;
        if (c1852650yJL2 != null) {
            str3 = c1852650yJL2.LJI;
        } else {
            str3 = null;
        }
        String strLIZJ2 = C1853740yL6.LIZJ(creativeTemplate.templateType);
        String strValueOf = String.valueOf(creativeTemplate.processType);
        String strLJ = C1853740yL6.LJ(creativeTemplate.templateType);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZ.getClass();
        String str10 = LIZJ.get("push_id");
        if (str10 == null) {
            str10 = "";
        }
        linkedHashMap.put("push_id", str10);
        if (str != null && str.length() > 0) {
            linkedHashMap.put("tab_id", str);
        }
        if (str2 != null && str2.length() > 0) {
            linkedHashMap.put("template_tab", str2);
        }
        String str11 = creativeTemplate.skillInfo;
        if (str11.length() > 0) {
            linkedHashMap.put("skill_info", str11);
        }
        C1862330yYx.LJJ(c1862330yYx, str4, str5, str6, str7, str8, "create_image_template", "click_template", str9, numValueOf, strLIZJ, str3, strLIZJ2, strValueOf, strLJ, linkedHashMap, 32768);
    }

    public static List LIZLLL(List list, C19EG c19eg, TakoPageContext takoPageContext, String str, String str2) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    CreativeTemplate creativeTemplate = (CreativeTemplate) obj;
                    arrayList.add(new AwS606S0100000_27(creativeTemplate, 263).invoke(new AwS2S2301000_27(i, c19eg, creativeTemplate, takoPageContext, str, str2, 0)));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static List LJI(List list, C19EG c19eg, TakoPageContext takoPageContext, String str, String str2) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                List<CreativeTemplateAsset> list2 = null;
                if (i >= 0) {
                    CreativeTemplate creativeTemplate = (CreativeTemplate) obj;
                    String str3 = creativeTemplate.templateId;
                    String str4 = creativeTemplate.pictureUrl;
                    String str5 = creativeTemplate.templatePrompt;
                    String str6 = creativeTemplate.nameText;
                    List<CreativeTemplateAsset> list3 = creativeTemplate.assets;
                    if (list3 != null) {
                        for (CreativeTemplateAsset creativeTemplateAsset : list3) {
                            C1852270yIj c1852270yIj = LIZ;
                            String str7 = creativeTemplateAsset.url;
                            c1852270yIj.getClass();
                            C23250099c.LIZLLL(LJFF, null, null, new C322060Cjs(str7, null), 3);
                        }
                        list2 = list3;
                    }
                    arrayList.add(new C426570Go3(str3, str4, str5, str6, list2, new AwS2S2301000_27(i, c19eg, creativeTemplate, takoPageContext, str, str2, 1)));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static void LJIILIIL(CreativeTemplate creativeTemplate, int i, C19EG c19eg, String str, String str2, InterfaceC1631620sYq interfaceC1631620sYq) {
        C1855940yOe.LIZ.getClass();
        int iLIZ = C1855940yOe.LIZ();
        if (iLIZ <= 0) {
            iLIZ = 4;
        }
        if (c19eg == null) {
            return;
        }
        String str3 = creativeTemplate.tip;
        if (str3.length() <= 0) {
            str3 = null;
        }
        C14TF.LIZIZ.LJJJLZIJ(iLIZ, c19eg, str3, null, new C1852320yIo(interfaceC1631620sYq, creativeTemplate, i, c19eg, str, str2, c19eg), false, true);
        LJIILJJIL(creativeTemplate, i, str, str2);
    }

    public static List LIZ(List list, C19EG c19eg, TakoPageContext takoPageContext, String str, String str2, int i, Function2 function2, InterfaceC1631620sYq interfaceC1631620sYq) {
        InterfaceC1891350zJl c1845450y7j;
        Integer num;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    CreativeTemplate creativeTemplate = (CreativeTemplate) obj;
                    final C1852240yIg c1852240yIg = new C1852240yIg(creativeTemplate, i + i2, c19eg, takoPageContext, str, str2, function2, interfaceC1631620sYq);
                    if (C07G6.LIZ() && (num = creativeTemplate.templateType) != null && num.intValue() == 2) {
                        String str3 = creativeTemplate.templateId;
                        String str4 = creativeTemplate.pictureUrl;
                        String str5 = creativeTemplate.templatePrompt;
                        Integer num2 = creativeTemplate.templateType;
                        List<CreativeTemplateTag> list2 = creativeTemplate.tags;
                        String str6 = creativeTemplate.nameText;
                        List<CreativeTemplateAsset> list3 = creativeTemplate.assets;
                        List<BaseVideo> list4 = creativeTemplate.videos;
                        LIZ.getClass();
                        Map mapLJIIL = LJIIL(str3);
                        String str7 = creativeTemplate.skillInfo;
                        if (str7.length() <= 0) {
                            str7 = null;
                        }
                        c1845450y7j = new C1845450y7j(str3, str4, str5, num2, list2, str6, list3, c1852240yIg, list4, mapLJIIL, str7);
                    } else {
                        final String str8 = creativeTemplate.templateId;
                        final String str9 = creativeTemplate.pictureUrl;
                        final String str10 = creativeTemplate.templatePrompt;
                        final Integer num3 = creativeTemplate.templateType;
                        final List<CreativeTemplateTag> list5 = creativeTemplate.tags;
                        final String str11 = creativeTemplate.nameText;
                        final List<CreativeTemplateAsset> list6 = creativeTemplate.assets;
                        creativeTemplate.skillInfo.length();
                        c1845450y7j = new InterfaceC1845470y7l(str8, str9, str10, num3, list5, str11, list6, c1852240yIg) { // from class: X.0y7m
                            public final String LL;
                            public final String LLILLJJLI;
                            public final String LLILLL;
                            public final Integer LLILZ;
                            public final List<CreativeTemplateTag> LLILZIL;
                            public final String LLILZLL;
                            public final List<CreativeTemplateAsset> LLIZ;
                            public final Function0<Unit> LLIZLLLIL;

                            @Override // X.InterfaceC1891350zJl
                            public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                                return null;
                            }

                            @Override // X.InterfaceC1845470y7l
                            public final List<CreativeTemplateAsset> LJIIJ() {
                                return this.LLIZ;
                            }

                            @Override // X.InterfaceC1845470y7l
                            public final Function0<Unit> LJIILJJIL() {
                                return this.LLIZLLLIL;
                            }

                            @Override // X.InterfaceC1845470y7l
                            public final String LLJLILLLLZIIL() {
                                return this.LLILZLL;
                            }

                            @Override // X.InterfaceC1845470y7l
                            public final String getId() {
                                return this.LL;
                            }

                            @Override // X.InterfaceC1845470y7l
                            public final String getPicUrl() {
                                return this.LLILLJJLI;
                            }

                            @Override // X.InterfaceC1845470y7l
                            public final List<CreativeTemplateTag> getTags() {
                                return this.LLILZIL;
                            }

                            @Override // X.InterfaceC1845470y7l
                            public final Integer getType() {
                                return this.LLILZ;
                            }

                            @Override // X.InterfaceC1891350zJl
                            public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                                if (interfaceC1891350zJl instanceof C1845480y7m) {
                                    C1845480y7m c1845480y7m = (C1845480y7m) interfaceC1891350zJl;
                                    if (Intrinsics.LJFF(c1845480y7m.LLILLL, this.LLILLL) && Intrinsics.LJFF(c1845480y7m.LLILZLL, this.LLILZLL) && Intrinsics.LJFF(c1845480y7m.LLILLJJLI, this.LLILLJJLI) && Intrinsics.LJFF(c1845480y7m.LLILZ, this.LLILZ) && Intrinsics.LJFF(c1845480y7m.LLIZ, this.LLIZ) && Intrinsics.LJFF(c1845480y7m.LLILZIL, this.LLILZIL)) {
                                        return true;
                                    }
                                    return false;
                                }
                                return false;
                            }

                            @Override // X.InterfaceC1891350zJl
                            public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                                if ((interfaceC1891350zJl instanceof C1845480y7m) && Intrinsics.LJFF(((C1845480y7m) interfaceC1891350zJl).LL, this.LL)) {
                                    return true;
                                }
                                return false;
                            }

                            {
                                this.LL = str8;
                                this.LLILLJJLI = str9;
                                this.LLILLL = str10;
                                this.LLILZ = num3;
                                this.LLILZIL = list5;
                                this.LLILZLL = str11;
                                this.LLIZ = list6;
                                this.LLIZLLLIL = c1852240yIg;
                            }
                        };
                    }
                    arrayList.add(c1845450y7j);
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static List LIZIZ(List list, C19EG c19eg, TakoPageContext takoPageContext, String str, String str2, int i, Function2 function2, InterfaceC1631620sYq interfaceC1631620sYq) {
        boolean z;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    CreativeTemplate creativeTemplate = (CreativeTemplate) obj;
                    int i4 = i + i2;
                    if (creativeTemplate.templateId.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList.add(new C1781260wSC(creativeTemplate, i4, z, new C1852250yIh(creativeTemplate, i, i2, c19eg, takoPageContext, str, str2, function2, interfaceC1631620sYq)));
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIIIZ(CreativeTemplate creativeTemplate, int i, C19EG c19eg, TakoPageContext takoPageContext, String str, String str2, Function2 function2, InterfaceC1631620sYq interfaceC1631620sYq, boolean z) {
        String str3;
        String str4;
        String str5;
        int i2 = creativeTemplate.processType;
        if (i2 != 1) {
            if (i2 != 2) {
                C1561220qjI.LIZ.getClass();
                Object obj = null;
                Object obj2 = "";
                if (C1561220qjI.LIZ()) {
                    C1852290yIl c1852290yIl = C1852290yIl.LIZ;
                    C1852650yJL c1852650yJL = LIZLLL;
                    if (c1852650yJL != null) {
                        obj = c1852650yJL.LJIIJ;
                    }
                    String str6 = LIZJ.get("enter_from");
                    if (str6 == null) {
                        str6 = "";
                    }
                    String str7 = LIZJ.get("enter_method");
                    if (str7 == null) {
                        str7 = "";
                    }
                    C1852650yJL c1852650yJL2 = LIZLLL;
                    if (c1852650yJL2 == null || (str3 = c1852650yJL2.LJI) == null) {
                        str3 = "";
                    }
                    Pair[] pairArr = new Pair[5];
                    if (str == null) {
                        str4 = "";
                    } else {
                        str4 = str;
                    }
                    pairArr[0] = new Pair("tab_id", str4);
                    if (str2 == null) {
                        str5 = "";
                    } else {
                        str5 = str2;
                    }
                    pairArr[1] = new Pair("template_tab", str5);
                    String str8 = LIZJ.get("process_id");
                    if (str8 == null) {
                        str8 = "";
                    }
                    pairArr[2] = new Pair("process_id", str8);
                    String str9 = LIZJ.get("tako_session_id");
                    if (str9 == null) {
                        str9 = "";
                    }
                    pairArr[3] = new Pair("tako_session_id", str9);
                    String str10 = LIZJ.get("tako_chat_id");
                    if (str10 == null) {
                        str10 = "";
                    }
                    pairArr[4] = new Pair("tako_chat_id", str10);
                    Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                    String str11 = LJ.get("word_page_source");
                    if (str11 != null) {
                        mapLJIIJ.put("word_page_source", str11);
                    }
                    String str12 = LJ.get("guide_type");
                    if (str12 != null) {
                        mapLJIIJ.put("guide_type", str12);
                    }
                    if (C123100dR.LIZ(LIZJ.get("push_id"))) {
                        Object obj3 = LIZJ.get("push_id");
                        if (obj3 != null) {
                            obj2 = obj3;
                        }
                        mapLJIIJ.put("push_id", obj2);
                    }
                    c1852290yIl.getClass();
                    C1852290yIl.LIZ(c19eg, creativeTemplate, obj, str6, str7, str3, takoPageContext, mapLJIIJ, null);
                } else {
                    C1854260yLw c1854260yLw = C1854260yLw.LIZ;
                    String str13 = creativeTemplate.templatePrompt;
                    C1852650yJL c1852650yJL3 = LIZLLL;
                    InterfaceC665370Q7z interfaceC665370Q7zLJIIJJI = LJIIJJI();
                    String str14 = creativeTemplate.templateId;
                    List listLJFF = LJFF(creativeTemplate.assets);
                    if (!C123100dR.LIZ(LIZJ.get("push_id")) || (obj = (String) LIZJ.get("push_id")) != null) {
                        obj2 = obj;
                    }
                    c1854260yLw.getClass();
                    C1854260yLw.LJIIIIZZ(c19eg, c1852650yJL3, interfaceC665370Q7zLJIIJJI, false, str13, listLJFF, str14, str, str2, 1001, obj2);
                }
                LJIILJJIL(creativeTemplate, i, str, str2);
                return;
            }
            LJIILIIL(creativeTemplate, i, c19eg, str, str2, interfaceC1631620sYq);
            return;
        }
        if (z) {
            LJIILJJIL(creativeTemplate, i, str, str2);
        }
        if (function2 == null) {
            return;
        }
        function2.invoke(creativeTemplate, Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LJIILL(C1852270yIj c1852270yIj, Context context, C1852650yJL c1852650yJL, InterfaceC665370Q7z interfaceC665370Q7z, Integer num, Map map, String str, TakoPageContext takoPageContext, int i) {
        Map<String, String> mapLJ;
        InterfaceC665370Q7z interfaceC665370Q7z2;
        ITakoContextAbility iTakoContextAbility;
        LifecycleOwner lifecycleOwner;
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            map = C2097608Jq.LJ();
        }
        if ((i & 32) != 0) {
            str = null;
        }
        c1852270yIj.getClass();
        if (context == 0 || interfaceC665370Q7z == null || c1852650yJL == null) {
            return false;
        }
        LIZIZ = new WeakReference<>(interfaceC665370Q7z);
        if (C07EC.LIZ() && TakoEnterMethodListExperiment.LIZ(false)) {
            C07QC.LIZ.getClass();
            if (C07QC.LIZ() && (context instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) context) != null) {
                if (((Number) C1818107Ad.LIZ.getValue()).intValue() == 1 && TakoEnterMethodListExperiment.LIZ(false)) {
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), C0PEM.LIZJ, null, new C322020Cjo(null), 2);
                } else {
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new C322030Cjp(null), 3);
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        WeakReference<InterfaceC665370Q7z> weakReference = LIZIZ;
        if (weakReference == null || (interfaceC665370Q7z2 = weakReference.get()) == null || (iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7z2, ITakoContextAbility.class, null)) == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        linkedHashMap.putAll(mapLJ);
        if (str != null) {
            linkedHashMap.put("push_id", str);
        }
        LIZJ = linkedHashMap;
        LIZLLL = c1852650yJL;
        LJ = map;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//tako/image/create");
        smartRouteBuildRoute.withParam("tab_id", c1852650yJL.LJIIIZ);
        C1227904rF.LIZ.getClass();
        smartRouteBuildRoute.withParam("tako_page_context", GsonProtectorUtils.toJson(C1227904rF.LIZLLL(), takoPageContext));
        if (num != null) {
            smartRouteBuildRoute.open(num.intValue());
        } else {
            smartRouteBuildRoute.open();
        }
        return true;
    }
}
