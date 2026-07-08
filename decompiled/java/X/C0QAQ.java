package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0QAQ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QAQ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(List list, Map map, C054000Hq c054000Hq, List list2, int i) {
        String strValueOf;
        Pair pair;
        C09CT c09ct;
        Object objLJJJLL;
        String str;
        if (list != null && map != null) {
            boolean z = false;
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    Aweme aweme = (Aweme) obj;
                    if (C1839507Ij.LIZ()) {
                        AwemeExtKt.appendExtraParamUseInSearch(aweme, "search_result_id", (String) map.get("search_result_id"));
                    }
                    AwemeExtKt.appendExtraParamUseInSearch(aweme, "token_type", (String) map.get("token_type"));
                    AwemeExtKt.appendMobParam(aweme, "inside_page_name", (String) map.get("inside_page_name"));
                    AwemeExtKt.appendMobParam(aweme, "list_item_id", (String) map.get("list_item_id"));
                    String aid = aweme.getAid();
                    String str2 = "";
                    if (aid == null) {
                        aid = "";
                    }
                    AwemeExtKt.appendMobParam(aweme, "search_third_item_id", aid);
                    if (map.containsKey("is_top_item")) {
                        String aid2 = aweme.getAid();
                        if (list2 != null) {
                            objLJJJLL = C13LP.LJJJLL(list2);
                        } else {
                            objLJJJLL = null;
                        }
                        if (Intrinsics.LJFF(aid2, objLJJJLL)) {
                            str = "1";
                        } else {
                            str = CardStruct.IStatusCode.DEFAULT;
                        }
                        AwemeExtKt.appendMobParam(aweme, "is_top_item", str);
                    }
                    if (c054000Hq != null) {
                        int i4 = i + i2;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.putAll(c054000Hq.LIZ);
                        for (C0QAR c0qar : c054000Hq.LIZIZ) {
                            new Object() { // from class: X.0QAS
                            }.getClass();
                            String str3 = c0qar.LIZIZ;
                            if (Intrinsics.LJFF(str3, "path")) {
                                String str4 = c0qar.LIZJ;
                                if (!a0.LJJJIL(str4)) {
                                    char[] cArr = new char[1];
                                    cArr[z ? 1 : 0] = '/';
                                    List listLJJLIIIJ = a0.LJJLIIIJ(str4, cArr, z, z ? 1 : 0, 6);
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj2 : listLJJLIIIJ) {
                                        if (!a0.LJJJIL((String) obj2)) {
                                            arrayList.add(obj2);
                                        }
                                    }
                                    if (!arrayList.isEmpty()) {
                                        Iterator it2 = arrayList.iterator();
                                        Object c098200Yq = aweme;
                                        while (true) {
                                            if (it2.hasNext()) {
                                                Object next = it2.next();
                                                new Object() { // from class: X.0QAS
                                                }.getClass();
                                                for (Class<?> superclass = c098200Yq.getClass(); superclass != null && !Intrinsics.LJFF(superclass, Object.class); superclass = superclass.getSuperclass()) {
                                                    for (Field field : superclass.getDeclaredFields()) {
                                                        if (!Modifier.isStatic(field.getModifiers()) && (c09ct = (C09CT) field.getAnnotation(C09CT.class)) != null && (Intrinsics.LJFF(c09ct.value(), next) || C13LQ.LJIILLIIL(next, c09ct.alternate()))) {
                                                            try {
                                                                field.setAccessible(true);
                                                                c098200Yq = field.get(c098200Yq);
                                                                C189200o6.m2constructorimpl(c098200Yq);
                                                            } catch (Throwable th) {
                                                                TryCatchGuardChecker.doCheck(th);
                                                                c098200Yq = new C098200Yq(th);
                                                                C189200o6.m2constructorimpl(c098200Yq);
                                                            }
                                                            if (C189200o6.m7isFailureimpl(c098200Yq) || c098200Yq == null) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                String string = c098200Yq.toString();
                                                if (string != null) {
                                                    pair = new Pair(c0qar.LIZ, string);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (Intrinsics.LJFF(str3, "enum")) {
                                String str5 = c0qar.LIZJ;
                                if (Intrinsics.LJFF(str5, "aweme_id")) {
                                    strValueOf = aweme.getAid();
                                } else if (Intrinsics.LJFF(str5, "rank")) {
                                    strValueOf = String.valueOf(i4);
                                }
                                if (strValueOf != null) {
                                    pair = new Pair(c0qar.LIZ, strValueOf);
                                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                                }
                            }
                            z = false;
                        }
                        if (!linkedHashMap.isEmpty()) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            String aid3 = aweme.getAid();
                            if (aid3 != null) {
                                str2 = aid3;
                            }
                            sbLIZ.append(str2);
                            sbLIZ.append('_');
                            sbLIZ.append(System.currentTimeMillis());
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            C2091808Hk.LIZ.put(strLIZIZ, linkedHashMap);
                            if (strLIZIZ != null) {
                                AwemeExtKt.appendExtraParamUseInSearch(aweme, "aweme_pass_through_log_params", strLIZIZ);
                            }
                        }
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }
}
