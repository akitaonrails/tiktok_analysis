package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.search.model.RefSource;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.search.model.RefWebDoc;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.SourceFromEntities;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.SourceFromEntity;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Q7g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C665180Q7g {
    public static final C665180Q7g LIZ = new C665180Q7g();

    public static List LIZLLL(SourceFromEntities sourceFromEntities) {
        List<SourceFromEntity> list;
        C427720Gpu c427720Gpu;
        String str;
        C419910GdJ c419910GdJ;
        if (sourceFromEntities != null && (list = sourceFromEntities.entityList) != null) {
            ArrayList arrayList = new ArrayList();
            for (SourceFromEntity sourceFromEntity : list) {
                Integer num = sourceFromEntity.type;
                String str2 = "";
                if (num != null) {
                    if (num.intValue() == 1) {
                        String userAvatar = sourceFromEntity.getUserAvatar();
                        String str3 = sourceFromEntities.defaultThumbnailUrl;
                        if (str3 != null) {
                            str2 = str3;
                        }
                        C419910GdJ c419910GdJ2 = new C419910GdJ();
                        c419910GdJ2.LIZ = R.raw.icon_color_default_avatar;
                        c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                        c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                        c427720Gpu = new C427720Gpu(userAvatar, str2, c419910GdJ2);
                    } else if (num != null) {
                        if (num.intValue() == 2) {
                            RefWebDoc refWebDoc = sourceFromEntity.web;
                            if (refWebDoc == null || (str = refWebDoc.webIcon) == null) {
                                str = "";
                            }
                            String str4 = sourceFromEntities.defaultThumbnailUrl;
                            if (str4 != null) {
                                str2 = str4;
                            }
                            if (((Boolean) C301470Brl.LIZ.getValue()).booleanValue()) {
                                c419910GdJ = new C419910GdJ();
                                c419910GdJ.LIZ = R.raw.icon_earth_w_fill;
                                c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
                                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                            } else {
                                c419910GdJ = new C419910GdJ();
                                c419910GdJ.LIZ = R.raw.icon_link;
                                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                                c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
                            }
                            c427720Gpu = new C427720Gpu(str, str2, c419910GdJ);
                        } else if (num.intValue() == 3) {
                            c427720Gpu = new C427720Gpu("", null, null);
                        }
                    }
                    arrayList.add(c427720Gpu);
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static String LJ(String str) {
        String string;
        if (str != null && (string = a0.LJLIIIL(str).toString()) != null && string.length() > 0) {
            return string;
        }
        return null;
    }

    public static List LIZIZ(List list, List list2) {
        RefWebDoc refWebDoc;
        Object next;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            InterfaceC1891350zJl c434520H2c = null;
            if (i >= 0) {
                RefSource refSource = (RefSource) obj;
                Integer num = refSource.type;
                if (num != null) {
                    if (num.intValue() == 1) {
                        if (list2 != null) {
                            Iterator it2 = list2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (Intrinsics.LJFF(((Aweme) next).getAid(), refSource.awemeId)) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            Aweme aweme = (Aweme) next;
                            if (aweme != null) {
                                c434520H2c = new C434570H2h(i, list.size(), aweme);
                            }
                        }
                    } else if (num.intValue() == 2 && (refWebDoc = refSource.webDoc) != null) {
                        c434520H2c = new C434520H2c(refWebDoc.webTitle, i, list.size(), refWebDoc.webName, refWebDoc.webSummary, refWebDoc.webLink, refWebDoc.webIcon);
                    }
                }
                arrayList.add(c434520H2c);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return C13LP.LJJJJLI(arrayList);
    }

    public static void LJFF(JSONObject jSONObject, Map map) throws JSONException {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (C123100dR.LIZ((String) entry.getValue())) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public static List LIZJ(List list, List list2, List list3) {
        List listLJLLI;
        List listLIZIZ = null;
        if (list2 != null) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    boolean z = true;
                    Integer numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(((CharSequence) it2.next()).toString()) - 1);
                    int iIntValue = numValueOf.intValue();
                    if (iIntValue < 0 || iIntValue >= list.size()) {
                        z = false;
                    }
                    if (!z) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        arrayList.add(numValueOf);
                    }
                }
                Set setLLIIJI = C13LP.LLIIJI(arrayList);
                if (setLLIIJI != null && (listLJLLI = C13LP.LJLLI(setLLIIJI, list)) != null) {
                    LIZ.getClass();
                    listLIZIZ = LIZIZ(listLJLLI, list3);
                    return listLIZIZ;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return listLIZIZ;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void LIZ(InterfaceC434580H2i interfaceC434580H2i, Context context, C434640H2o c434640H2o, List list, Function1 function1) {
        Map<String, String> map;
        Map<String, String> map2;
        String str;
        boolean z;
        String str2;
        Map<String, String> map3 = null;
        String str3 = null;
        str = null;
        String str4 = null;
        if (interfaceC434580H2i instanceof C434570H2h) {
            if (context != null) {
                C665180Q7g c665180Q7g = LIZ;
                Aweme aweme = ((C434570H2h) interfaceC434580H2i).LL;
                if (c434640H2o != null) {
                    map2 = c434640H2o.LIZIZ;
                } else {
                    map2 = null;
                }
                c665180Q7g.getClass();
                if (aweme != null) {
                    if (map2 != null) {
                        str = map2.get("enter_from");
                    } else {
                        str = null;
                    }
                    boolean zLJJJJIZL = C14TF.LIZIZ.LJJJJIZL(str);
                    if (((Boolean) C079W.LIZ.getValue()).booleanValue() && list != null && !list.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Bundle bundle = new Bundle();
                    C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, aweme.getAid(), bundle);
                    if (zLJJJJIZL) {
                        C786410Ut5.LJJJI("enter_from", "from_chat_inner_cell", bundle);
                        C786410Ut5.LJJJI("tikbot_layer", "reference_layer", bundle);
                    } else if (z) {
                        C786410Ut5.LJJJI("enter_from", "general_search", bundle);
                        C786410Ut5.LJJJI("video_from", "from_no_request", bundle);
                    } else {
                        C786410Ut5.LJJJI("enter_from", "from_no_request", bundle);
                    }
                    if (map2 != null) {
                        for (Map.Entry<String, String> entry : map2.entrySet()) {
                            if (C123100dR.LIZ(entry.getValue())) {
                                C786410Ut5.LJJJI(entry.getKey(), entry.getValue(), bundle);
                            }
                        }
                    }
                    if (map2 != null) {
                        str2 = map2.get("is_page");
                    } else {
                        str2 = null;
                    }
                    if (map2 != null) {
                        str3 = map2.get("search_type");
                    }
                    if (!((Boolean) C079W.LIZ.getValue()).booleanValue() || list == null || list.isEmpty()) {
                        list = Collections.singletonList(aweme);
                    }
                    C0PNL c0pnl = new C0PNL();
                    for (Aweme aweme2 : list) {
                        AwemeExtKt.appendMobParam(aweme2, "is_page", str2);
                        AwemeExtKt.appendMobParam(aweme2, "search_type", str3);
                        if (function1 != null) {
                            for (Map.Entry entry2 : ((Map) function1.invoke(aweme2)).entrySet()) {
                                AwemeExtKt.appendMobParam(aweme2, (String) entry2.getKey(), (String) entry2.getValue());
                            }
                        }
                    }
                    c0pnl.LJIL(list);
                    c0pnl.LLJJL = C643200PKs.LJ(aweme);
                    C1603960rqE.LIZ = c0pnl;
                    SmartRoute smartRoute = new SmartRoute(context);
                    smartRoute.withParam(bundle);
                    smartRoute.withUrl("//aweme/detail");
                    smartRoute.open();
                    return;
                }
                return;
            }
            return;
        }
        if (interfaceC434580H2i instanceof C434520H2c) {
            String str5 = ((C434520H2c) interfaceC434580H2i).LLILZIL;
            if (c434640H2o != null) {
                map = c434640H2o.LIZIZ;
                if (map != null) {
                    str4 = map.get("enter_from");
                }
            } else {
                map = null;
            }
            boolean zLJJJJIZL2 = C14TF.LIZIZ.LJJJJIZL(str4);
            JSONObject jSONObject = new JSONObject();
            if (zLJJJJIZL2) {
                jSONObject.put("business_event_keys_stay_time", "tikbot_webpage_stay_time");
                jSONObject.put("business_event_keys_button_click", "tikbot_webpage_button_click");
                jSONObject.put("business_event_keys_close", "tikbot_webpage_close");
            }
            JSONObject jSONObject2 = new JSONObject();
            if (!zLJJJJIZL2) {
                jSONObject2.put("page_type", "web_rag");
            }
            LIZ.getClass();
            LJFF(jSONObject2, map);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aweme://search_third_party/?url=");
            sbLIZ.append(str5);
            Uri.Builder builderAppendQueryParameter = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)).buildUpon().appendQueryParameter("business_event_tracking", C786410Ut5.J3(jSONObject2)).appendQueryParameter("business_event_keys", C786410Ut5.J3(jSONObject)).appendQueryParameter("click_time", String.valueOf(System.currentTimeMillis()));
            if (zLJJJJIZL2) {
                JSONObject jSONObject3 = new JSONObject();
                if (map != null) {
                    for (Map.Entry<String, String> entry3 : map.entrySet()) {
                        String key = entry3.getKey();
                        String value = entry3.getValue();
                        if (value != null) {
                            switch (key.hashCode()) {
                                case -1690722221:
                                    if (key.equals("message_id")) {
                                        jSONObject3.put("tako_message_id", value);
                                    }
                                    break;
                                case -997377974:
                                    if (key.equals("sub_process_id")) {
                                        jSONObject3.put("sub_process_id", value);
                                    }
                                    break;
                                case -818786127:
                                    if (key.equals("enter_from")) {
                                        jSONObject3.put("tako_enter_from", value);
                                    }
                                    break;
                                case -685906904:
                                    if (key.equals("enter_method")) {
                                        jSONObject3.put("tako_enter_method", value);
                                    }
                                    break;
                                case 422185195:
                                    if (key.equals("process_id")) {
                                        jSONObject3.put("tako_process_id", value);
                                    }
                                    break;
                            }
                        }
                    }
                }
                builderAppendQueryParameter.appendQueryParameter("report_event_tracking", C786410Ut5.J3(jSONObject3));
            }
            if (context != null) {
                SmartRouter.buildRoute(context, builderAppendQueryParameter.build().toString()).open();
                return;
            }
            return;
        }
        if (interfaceC434580H2i instanceof C434510H2b) {
            String str6 = ((C434510H2b) interfaceC434580H2i).LLILZLL;
            if (c434640H2o != null) {
                map3 = c434640H2o.LIZIZ;
            }
            if (context != null && C123100dR.LIZ(str6) && str6 != null) {
                JSONObject jSONObject4 = new JSONObject();
                LIZ.getClass();
                LJFF(jSONObject4, map3);
                SmartRouter.buildRoute(context, UriProtector.parse(str6).buildUpon().appendQueryParameter("trackParams", C786410Ut5.J3(jSONObject4)).toString()).open();
            }
        }
    }
}
