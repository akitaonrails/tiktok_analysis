package X;

import android.app.Application;
import android.net.Uri;
import com.bytedance.forest.Forest;
import com.bytedance.forest.chain.fetchers.GeckoXAdapter;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS12S1310000_23;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0q18, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533840q18 implements IResourceServiceX {
    public final C1533900q1E LIZ;
    public String LIZIZ = "hybridkit_default_bid";

    @Override // com.bytedance.lynx.hybrid.service.IResourceServiceX, X.InterfaceC1075470e5p
    public final void onUnRegister() {
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceServiceX
    public final Forest getForest() {
        return this.LIZ.LIZ;
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceServiceX
    public final C1533560q0g getResourceConfig() {
        return this.LIZ.LIZ.getConfig();
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceServiceX
    public final String getBid() {
        return this.LIZIZ;
    }

    public C1533840q18(C1533900q1E c1533900q1E) {
        this.LIZ = c1533900q1E;
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceServiceX
    public final IResourceServiceX copyAndModifyConfig(AbstractC1076640e7i abstractC1076640e7i) {
        Application application = this.LIZ.LIZ.getApplication();
        C1533560q0g c1533560q0gLIZ = getResourceConfig().LIZ();
        abstractC1076640e7i.LIZ(c1533560q0gLIZ);
        this.LIZ.LIZ = new Forest(application, c1533560q0gLIZ);
        return this;
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceServiceX, X.InterfaceC1075470e5p
    public final void onRegister(String str) {
        this.LIZIZ = str;
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceServiceX
    public final C1533910q1F createSyncRequest(String str, RequestParams requestParams) {
        return this.LIZ.LIZLLL(str, requestParams, false, true, "createSyncRequest", false);
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceServiceX
    public final C1533910q1F fetchResourceAsync(String str, RequestParams requestParams, Function1<? super C1533790q13, Unit> function1) {
        C1533900q1E c1533900q1E = this.LIZ;
        C1533910q1F c1533910q1FLIZLLL = c1533900q1E.LIZLLL(str, requestParams, true, true, "fetchResourceAsync", false);
        if (c1533910q1FLIZLLL == null) {
            return null;
        }
        C086F.LIZ.getClass();
        C086F.LJI(new AwS12S1310000_23(c1533900q1E, (C1533900q1E) str, (String) c1533910q1FLIZLLL, (C1533910q1F) C086F.LIZ(), (boolean) function1, (Function1<? super C1533790q13, Unit>) 1));
        return c1533910q1FLIZLLL;
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceServiceX
    public final C1533910q1F fetchResourceAsyncIfNeed(String str, RequestParams requestParams, Function1<? super C1533790q13, Unit> function1) {
        return this.LIZ.LIZJ(str, requestParams, true, function1);
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceServiceX
    public final C1533910q1F preload(String str, RequestParams requestParams, Function1<? super C1533790q13, Unit> function1) {
        return this.LIZ.LJFF(str, requestParams, true, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.lynx.hybrid.service.IResourceServiceX
    @InterfaceC1294060jmO
    public final void preloadContainer(final String str, final RequestParams requestParams, C1537480q70 c1537480q70, boolean z) {
        final String strSubstring;
        final boolean z2;
        final C1533900q1E c1533900q1E = this.LIZ;
        final long j = C1535630q41.LJIIL;
        c1533900q1E.getClass();
        final String str2 = requestParams.sessionId;
        boolean z3 = true;
        c1533900q1E.LJFF(str, requestParams, true, null);
        if (a0.LJJIIZI(str, "?", false)) {
            strSubstring = str.substring(0, a0.LJJJ(str, "?", 0, false, 6));
        } else {
            strSubstring = str;
        }
        if (!u.LJIIZILJ(strSubstring, ".html", false) && !u.LJIIZILJ(strSubstring, ".htm", false) && requestParams.resourceScene != EnumC1533980q1M.WEB_MAIN_DOCUMENT) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!u.LJIIZILJ(strSubstring, "/template.js", false) && requestParams.resourceScene != EnumC1533980q1M.LYNX_TEMPLATE) {
            z3 = false;
        }
        if ((z2 || z3) && z) {
            C086F c086f = C086F.LIZ;
            final String str3 = null;
            final Object[] objArr = 0 == true ? 1 : 0;
            Runnable runnable = new Runnable(str3, strSubstring, c1533900q1E, str, j, requestParams, objArr, str2, z2) { // from class: X.0q17
                public final /* synthetic */ String LL;
                public final /* synthetic */ String LLILLJJLI;
                public final /* synthetic */ C1533900q1E LLILLL;
                public final /* synthetic */ String LLILZ;
                public final /* synthetic */ RequestParams LLILZIL;
                public final /* synthetic */ Function1<C1533790q13, Unit> LLILZLL;
                public final /* synthetic */ String LLIZ;
                public final /* synthetic */ boolean LLIZLLLIL;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.LLILZIL = requestParams;
                    this.LLILZLL = objArr;
                    this.LLIZ = str2;
                    this.LLIZLLLIL = z2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v22, types: [T, X.0q0b] */
                /* JADX WARN: Type inference failed for: r1v26 */
                /* JADX WARN: Type inference failed for: r1v27 */
                /* JADX WARN: Type inference failed for: r1v28 */
                public final void LIZ() {
                    C1533790q13 c1533790q13LIZIZ;
                    LinkedHashMap linkedHashMap;
                    Map map;
                    Double d;
                    Boolean bool;
                    String str4 = this.LL;
                    if (str4 == null) {
                        str4 = this.LLILLJJLI;
                    }
                    Uri uri = UriProtector.parse(str4);
                    C259800zU c259800zU = new C259800zU();
                    String strLJJIFFI = this.LL;
                    if (strLJJIFFI == null) {
                        C1533900q1E c1533900q1E2 = this.LLILLL;
                        String str5 = this.LLILLJJLI;
                        String str6 = this.LLILZ;
                        GeckoXAdapter.Companion companion = GeckoXAdapter.Companion;
                        String path = uri.getPath();
                        if (path == null) {
                            path = "";
                        }
                        C1533510q0b c1533510q0bLIZIZ = C1956907lX.LIZIZ(str5, companion.getPrefixAsGeckoCDN(path));
                        ?? r1 = c1533510q0bLIZIZ;
                        if (c1533510q0bLIZIZ == null) {
                            C1533510q0b c1533510q0b = new C1533510q0b("", "", "");
                            boolean zLIZJ = c1533900q1E2.LIZ.getConfig().LIZJ(str6, c1533510q0b);
                            r1 = c1533510q0b;
                            if (!zLIZJ) {
                                r1 = 0;
                            }
                        }
                        c259800zU.element = r1;
                        if (r1 == 0) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("cannot parse ak/channel/bundle from ");
                            sbLIZ.append(str5);
                            C1534250q1n.LJFF("ResourceGroup", "prefetchGroup", C2188811AlT.LIZIZ(sbLIZ), null, false);
                            return;
                        }
                        strLJJIFFI = u.LJJIFFI(str5, r1.LIZJ, "preload.json", false);
                    }
                    C1533900q1E c1533900q1E3 = this.LLILLL;
                    RequestParams requestParams2 = new RequestParams(EnumC1533980q1M.PRELOAD_CONFIG);
                    C1533900q1E c1533900q1E4 = this.LLILLL;
                    String str7 = this.LLIZ;
                    RequestParams requestParams3 = this.LLILZIL;
                    String str8 = c1533900q1E4.LIZIZ;
                    requestParams2.groupId = str8;
                    requestParams2.needLocalFile = Boolean.FALSE;
                    requestParams2.sessionId = str7;
                    requestParams2.source = requestParams3.source;
                    requestParams2.customParams.put("rl_container_uuid", str8);
                    C1533510q0b c1533510q0b2 = (C1533510q0b) c259800zU.element;
                    if (c1533510q0b2 != null) {
                        requestParams2.channel = c1533510q0b2.LIZIZ;
                        requestParams2.bundle = "preload.json";
                    }
                    C1533910q1F c1533910q1FLIZLLL = c1533900q1E3.LIZLLL(strLJJIFFI, requestParams2, false, true, "createSyncRequest", false);
                    if (c1533910q1FLIZLLL != null) {
                        c1533790q13LIZIZ = c1533910q1FLIZLLL.LIZIZ();
                        if (c1533790q13LIZIZ != null && c1533790q13LIZIZ.LIZIZ) {
                            try {
                                Map map2 = (Map) C1551400qTS.LIZIZ.LIZ.LJII(new String(c1533790q13LIZIZ.LJIIIZ(), Charsets.UTF_8), Map.class);
                                Map<String, String> mapLIZ = C1942307jB.LIZ(UriProtector.parse(this.LLILZ));
                                Object obj = map2.get(this.LLILLJJLI);
                                if (obj == null) {
                                    C1534250q1n.LJFF("ResourceGroup", "prefetchGroup", "Building PreloadConfig for " + this.LLILZ + " failed, no matched item in preload.json", null, false);
                                    return;
                                }
                                boolean z4 = this.LLIZLLLIL;
                                RequestParams requestParams4 = this.LLILZIL;
                                EnumC1534650q2R enumC1534650q2R = z4 ? EnumC1534650q2R.WEB : EnumC1534650q2R.LYNX;
                                if (!(obj instanceof Map) || (map = (Map) obj) == null) {
                                    linkedHashMap = null;
                                } else {
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
                                    linkedHashMap2.remove("type");
                                    Set<Map.Entry> setEntrySet = linkedHashMap2.entrySet();
                                    int i = 10;
                                    int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(setEntrySet, 10));
                                    if (iLIZIZ < 16) {
                                        iLIZIZ = 16;
                                    }
                                    linkedHashMap = new LinkedHashMap(iLIZIZ);
                                    for (Map.Entry entry : setEntrySet) {
                                        String str9 = (String) entry.getKey();
                                        List<Map> list = (List) entry.getValue();
                                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, i));
                                        for (Map map3 : list) {
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append((String) map3.get("url"));
                                            sbLIZ2.append('?');
                                            sbLIZ2.append(C13LP.LJJLIIIJ(((LinkedHashMap) mapLIZ).entrySet(), "&", null, null, 0, null, null, 62));
                                            String strLJJJLL = a0.LJJJLL("?", C2188811AlT.LIZIZ(sbLIZ2));
                                            Object obj2 = map3.get("enableMemory");
                                            boolean zBooleanValue = (!(obj2 instanceof Boolean) || (bool = (Boolean) obj2) == null) ? false : bool.booleanValue();
                                            Object obj3 = map3.get("size");
                                            if ((obj3 instanceof Double) && (d = (Double) obj3) != null) {
                                                d.doubleValue();
                                            }
                                            arrayList.add(new C1533140q00(strLJJJLL, zBooleanValue, requestParams4.disableCdn));
                                        }
                                        Pair pair = new Pair(str9, arrayList);
                                        linkedHashMap.put(pair.getFirst(), pair.getSecond());
                                        i = 10;
                                    }
                                }
                                C1534660q2S c1534660q2S = new C1534660q2S(null, enumC1534650q2R, linkedHashMap);
                                c1534660q2S.LIZLLL = requestParams4.customParams;
                                C1533900q1E c1533900q1E5 = this.LLILLL;
                                RequestParams requestParams5 = this.LLILZIL;
                                c1533900q1E5.LJI(c1534660q2S, requestParams5.source, requestParams5.sessionId, this.LLILZLL);
                                return;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C1534250q1n.LJFF("ResourceGroup", "prefetchGroup", "Building PreloadConfig for " + this.LLILZ + " failed, " + th, null, false);
                                return;
                            }
                        }
                    } else {
                        c1533790q13LIZIZ = null;
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("get preload.json failed, reason: ");
                    sbLIZ3.append(c1533790q13LIZIZ != null ? c1533790q13LIZIZ.LIZLLL : null);
                    C1534250q1n.LJFF("ResourceGroup", "prefetchGroup", C2188811AlT.LIZIZ(sbLIZ3), null, false);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ResourceGroup@cc82.prefetchGroup$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ResourceGroup@cc82.prefetchGroup$1");
                }
            };
            c086f.getClass();
            if (C086F.LIZ()) {
                C086F.LJFF(runnable);
            } else {
                runnable.run();
            }
        }
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceServiceX
    public final void preloadContainer(C1534660q2S c1534660q2S, String str, String str2, String str3) {
        this.LIZ.LJI(c1534660q2S, str3, str2, null);
    }
}
