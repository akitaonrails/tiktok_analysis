package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleModelAbility;
import com.ss.android.ugc.aweme.nimblecard.tako.context.NimbleTemplateContext;
import com.ss.android.ugc.aweme.nimblecard.tako.model.NimbleViewProps;
import com.ss.android.ugc.aweme.nimblecard.tako.model.TemplateData;
import com.ss.android.ugc.aweme.search.pages.result.nimble.config.NimbleV2ConfigData;
import com.ss.android.ugc.aweme.search.pages.result.nimble.v2.component.Top1SurroundedImageListAssem;
import com.ss.android.ugc.aweme.search.pages.result.nimble.v2.container.ITop1NimbleActionAbility;
import com.ss.android.ugc.aweme.search.pages.result.nimble.v2.container.vertical.IVerticalNimbleActionAbility;
import com.ss.android.ugc.aweme.search.pages.result.pov.ITop1CommonAbility;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14Mt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20253714Mt {
    public static boolean LIZ;

    public static void LIZ(Map map) {
        List<NimbleV2ConfigData> list = C1867190ygn.LIZ().templateList;
        List<NimbleV2ConfigData> list2 = C1867190ygn.LIZ().containerTemplateList;
        int i = 0;
        if ((list == null || list.isEmpty()) && (list2 == null || list2.isEmpty())) {
            return;
        }
        C14NH.LIZ.getClass();
        C14NH.LJIILL();
        C14NH.LIZIZ(C1697810uHb.LJIIJJI(new C14NZ() { // from class: X.14Mw
            @Override // X.C14NZ
            public final C13IQ LIZIZ() {
                return null;
            }

            @Override // X.C14NZ
            public final void LIZLLL() {
            }

            @Override // X.C14NZ
            public final boolean LIZ(String str) {
                return Intrinsics.LJFF(str, "Top1MarkdownText");
            }

            @Override // X.C14NZ
            public final C14NX LIZJ(NimbleTemplateContext nimbleTemplateContext) {
                return new C14RU(nimbleTemplateContext);
            }
        }, new C14NZ() { // from class: X.14Mv
            @Override // X.C14NZ
            public final C13IQ LIZIZ() {
                return null;
            }

            @Override // X.C14NZ
            public final void LIZLLL() {
            }

            @Override // X.C14NZ
            public final boolean LIZ(String str) {
                return Intrinsics.LJFF(str, "Top1ImageList");
            }

            @Override // X.C14NZ
            public final C14NX LIZJ(final NimbleTemplateContext nimbleTemplateContext) {
                return new AbstractC20257014Oa<View>(nimbleTemplateContext) { // from class: X.14N3
                    @Override // X.AbstractC20257014Oa
                    public final Function0<ReusedUIAssem<?>> LJJIIZ() {
                        return new AwS574S0100000_30(this, 364);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
                    /* JADX WARN: Removed duplicated region for block: B:43:0x0098  */
                    /* JADX WARN: Removed duplicated region for block: B:56:0x00d9  */
                    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
                    /* JADX WARN: Removed duplicated region for block: B:67:0x00ee  */
                    @Override // X.AbstractC20257014Oa
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final X.InterfaceC1587906Jp LJJIIZI() {
                        /*
                            Method dump skipped, instruction units count: 257
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C14N3.LJJIIZI():X.06Jp");
                    }

                    @Override // X.AbstractC20257014Oa, X.C14NT, X.C14NX
                    public final void LJII(TemplateData templateData) {
                        super.LJII(templateData);
                    }

                    @Override // X.C14NT
                    public final View LJJIII(Context context) {
                        FrameLayout.LayoutParams layoutParamsLIZ = C425100Glg.LIZ(C1697810uHb.LJIIJJI(0, 0, 0, 0));
                        layoutParamsLIZ.width = -2;
                        FrameLayout frameLayout = new FrameLayout(context);
                        frameLayout.setId(R.id.y8k);
                        C786410Ut5.a6(frameLayout, layoutParamsLIZ);
                        return frameLayout;
                    }
                };
            }
        }, new C14NZ() { // from class: X.14IX
            @Override // X.C14NZ
            public final C13IQ LIZIZ() {
                return C13LE.LIZ(Top1SurroundedImageListAssem.class);
            }

            @Override // X.C14NZ
            public final void LIZLLL() {
            }

            @Override // X.C14NZ
            public final boolean LIZ(String str) {
                return Intrinsics.LJFF(str, "Top1SurroundedImageList");
            }

            @Override // X.C14NZ
            public final C14NX LIZJ(final NimbleTemplateContext nimbleTemplateContext) {
                return new C14NT<View>(nimbleTemplateContext) { // from class: X.14IY
                    @Override // X.C14NT
                    public final View LJJIII(Context context) {
                        FrameLayout.LayoutParams layoutParamsLIZ = C425100Glg.LIZ(C1697810uHb.LJIIJJI(0, 0, 0, 0));
                        layoutParamsLIZ.width = -2;
                        FrameLayout frameLayout = new FrameLayout(context);
                        frameLayout.setId(R.id.y8m);
                        C786410Ut5.a6(frameLayout, layoutParamsLIZ);
                        return frameLayout;
                    }
                };
            }
        }, new C14NZ() { // from class: X.14Mu
            @Override // X.C14NZ
            public final C13IQ LIZIZ() {
                return null;
            }

            @Override // X.C14NZ
            public final void LIZLLL() {
            }

            @Override // X.C14NZ
            public final boolean LIZ(String str) {
                return Intrinsics.LJFF("SearchSingleFeedback", str);
            }

            @Override // X.C14NZ
            public final C14NX LIZJ(final NimbleTemplateContext nimbleTemplateContext) {
                return new AbstractC20257014Oa<View>(nimbleTemplateContext) { // from class: X.14Np
                    @Override // X.AbstractC20257014Oa
                    public final Function0<ReusedUIAssem<?>> LJJIIZ() {
                        return AFwS219S0000000_30.get$arr$(297);
                    }

                    @Override // X.AbstractC20257014Oa
                    public final InterfaceC1587906Jp LJJIIZI() {
                        String strValueOf;
                        LinkedHashMap linkedHashMap;
                        Map map2;
                        Object obj;
                        Map map3;
                        NimbleViewProps nimbleViewProps;
                        Object obj2;
                        NimbleViewProps nimbleViewProps2;
                        String str;
                        Object obj3;
                        NimbleViewProps nimbleViewProps3;
                        String str2;
                        String string = null;
                        INimbleModelAbility iNimbleModelAbility = (INimbleModelAbility) C1558520qew.LIZ(this.LIZ, INimbleModelAbility.class, null);
                        Map<String, Object> mapZo0 = iNimbleModelAbility != null ? iNimbleModelAbility.Zo0() : null;
                        this.LIZ.LLILZ.getResources().getString(R.string.video);
                        TemplateData templateData = this.LJIIIZ;
                        Object objLJ = (templateData == null || (nimbleViewProps3 = templateData.props) == null || (str2 = nimbleViewProps3.feedbackTitle) == null) ? null : LJ(str2);
                        if (Object.class == Double.class) {
                            objLJ = C20252814Mk.LIZ(objLJ);
                        } else if (Object.class == Float.class) {
                            objLJ = C20252814Mk.LIZIZ(objLJ);
                        } else if (Object.class == Integer.class) {
                            objLJ = C20252814Mk.LIZJ(objLJ);
                        } else if (Object.class == Long.class) {
                            objLJ = C20252814Mk.LIZLLL(objLJ);
                        } else if (Object.class == String.class) {
                            objLJ = objLJ != null ? objLJ.toString() : null;
                        } else if (Object.class != String.class && Object.class != Map.class) {
                            if ((objLJ instanceof Map) && !Map.class.isAssignableFrom(Object.class)) {
                                try {
                                    C1227904rF.LIZ.getClass();
                                    Gson gsonLIZLLL = C1227904rF.LIZLLL();
                                    objLJ = gsonLIZLLL.LIZJ(gsonLIZLLL.LJIJJLI(objLJ), Object.class);
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            } else if (objLJ instanceof List) {
                                try {
                                    Type type = new TypeToken<Object>() { // from class: X.14Nq
                                    }.getType();
                                    if (List.class.isAssignableFrom(Object.class)) {
                                        C1227904rF.LIZ.getClass();
                                        Gson gsonLIZLLL2 = C1227904rF.LIZLLL();
                                        objLJ = gsonLIZLLL2.LIZLLL(gsonLIZLLL2.LJIJJLI(objLJ), type);
                                    }
                                } catch (Exception e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                }
                            } else if ((objLJ instanceof String) && List.class.isAssignableFrom(Object.class)) {
                                objLJ = C14P7.LJJ((String) objLJ);
                            }
                        }
                        if (!(objLJ instanceof Object)) {
                            objLJ = null;
                        }
                        Object obj4 = ((LinkedHashMap) this.LJFF).get("feedbackTitle");
                        if (!(obj4 instanceof Object)) {
                            obj4 = null;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("updateCacheIfNeeded: cachedValue = ");
                        sbLIZ.append(obj4);
                        sbLIZ.append(", castValue = ");
                        sbLIZ.append(objLJ);
                        C2188811AlT.LIZIZ(sbLIZ);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("updateCacheIfNeeded: isInitializing = ");
                        sbLIZ2.append(true);
                        sbLIZ2.append(" !cachedValue.deepEquals(castValue):");
                        sbLIZ2.append(!C14P7.LIZ(obj4, objLJ));
                        C2188811AlT.LIZIZ(sbLIZ2);
                        if (C14P7.LIZ(obj4, objLJ)) {
                            strValueOf = String.valueOf(objLJ);
                        } else {
                            strValueOf = String.valueOf(objLJ);
                            this.LJFF.put("feedbackTitle", objLJ);
                        }
                        if (mapZo0 != null && (obj3 = mapZo0.get("feedbackType")) != null) {
                            obj3.toString();
                        }
                        TemplateData templateData2 = this.LJIIIZ;
                        Object objLJ2 = (templateData2 == null || (nimbleViewProps2 = templateData2.props) == null || (str = nimbleViewProps2.feedbackType) == null) ? null : LJ(str);
                        if (Object.class == Double.class) {
                            objLJ2 = C20252814Mk.LIZ(objLJ2);
                        } else if (Object.class == Float.class) {
                            objLJ2 = C20252814Mk.LIZIZ(objLJ2);
                        } else if (Object.class == Integer.class) {
                            objLJ2 = C20252814Mk.LIZJ(objLJ2);
                        } else if (Object.class == Long.class) {
                            objLJ2 = C20252814Mk.LIZLLL(objLJ2);
                        } else if (Object.class == String.class) {
                            objLJ2 = objLJ2 != null ? objLJ2.toString() : null;
                        } else if (Object.class != String.class && Object.class != Map.class) {
                            if ((objLJ2 instanceof Map) && !Map.class.isAssignableFrom(Object.class)) {
                                try {
                                    C1227904rF.LIZ.getClass();
                                    Gson gsonLIZLLL3 = C1227904rF.LIZLLL();
                                    objLJ2 = gsonLIZLLL3.LIZJ(gsonLIZLLL3.LJIJJLI(objLJ2), Object.class);
                                } catch (Exception e3) {
                                    TryCatchGuardChecker.doCheck(e3);
                                }
                            } else if (objLJ2 instanceof List) {
                                try {
                                    Type type2 = new TypeToken<Object>() { // from class: X.14Nr
                                    }.getType();
                                    if (List.class.isAssignableFrom(Object.class)) {
                                        C1227904rF.LIZ.getClass();
                                        Gson gsonLIZLLL4 = C1227904rF.LIZLLL();
                                        objLJ2 = gsonLIZLLL4.LIZLLL(gsonLIZLLL4.LJIJJLI(objLJ2), type2);
                                    }
                                } catch (Exception e4) {
                                    TryCatchGuardChecker.doCheck(e4);
                                }
                            } else if ((objLJ2 instanceof String) && List.class.isAssignableFrom(Object.class)) {
                                objLJ2 = C14P7.LJJ((String) objLJ2);
                            }
                        }
                        if (!(objLJ2 instanceof Object)) {
                            objLJ2 = null;
                        }
                        Object obj5 = ((LinkedHashMap) this.LJFF).get("feedbackType");
                        if (!(obj5 instanceof Object)) {
                            obj5 = null;
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("updateCacheIfNeeded: cachedValue = ");
                        sbLIZ3.append(obj5);
                        sbLIZ3.append(", castValue = ");
                        sbLIZ3.append(objLJ2);
                        C2188811AlT.LIZIZ(sbLIZ3);
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("updateCacheIfNeeded: isInitializing = ");
                        sbLIZ4.append(true);
                        sbLIZ4.append(" !cachedValue.deepEquals(castValue):");
                        sbLIZ4.append(!C14P7.LIZ(obj5, objLJ2));
                        C2188811AlT.LIZIZ(sbLIZ4);
                        if (C14P7.LIZ(obj5, objLJ2)) {
                            String.valueOf(objLJ2);
                        } else {
                            String.valueOf(objLJ2);
                            this.LJFF.put("feedbackType", objLJ2);
                        }
                        C2097608Jq.LJ();
                        TemplateData templateData3 = this.LJIIIZ;
                        Object objLJ3 = (templateData3 == null || (nimbleViewProps = templateData3.props) == null || (obj2 = nimbleViewProps.feedbackTrackExtraParams) == null) ? null : LJ(obj2);
                        if (Object.class == Double.class) {
                            objLJ3 = C20252814Mk.LIZ(objLJ3);
                        } else if (Object.class == Float.class) {
                            objLJ3 = C20252814Mk.LIZIZ(objLJ3);
                        } else if (Object.class == Integer.class) {
                            objLJ3 = C20252814Mk.LIZJ(objLJ3);
                        } else if (Object.class == Long.class) {
                            objLJ3 = C20252814Mk.LIZLLL(objLJ3);
                        } else if (Object.class == String.class) {
                            objLJ3 = objLJ3 != null ? objLJ3.toString() : null;
                        } else if (Object.class != String.class && Object.class != Map.class) {
                            if ((objLJ3 instanceof Map) && !Map.class.isAssignableFrom(Object.class)) {
                                try {
                                    C1227904rF.LIZ.getClass();
                                    Gson gsonLIZLLL5 = C1227904rF.LIZLLL();
                                    objLJ3 = gsonLIZLLL5.LIZJ(gsonLIZLLL5.LJIJJLI(objLJ3), Object.class);
                                } catch (Exception e5) {
                                    TryCatchGuardChecker.doCheck(e5);
                                }
                            } else if (objLJ3 instanceof List) {
                                try {
                                    Type type3 = new TypeToken<Object>() { // from class: X.14Ns
                                    }.getType();
                                    if (List.class.isAssignableFrom(Object.class)) {
                                        C1227904rF.LIZ.getClass();
                                        Gson gsonLIZLLL6 = C1227904rF.LIZLLL();
                                        objLJ3 = gsonLIZLLL6.LIZLLL(gsonLIZLLL6.LJIJJLI(objLJ3), type3);
                                    }
                                } catch (Exception e6) {
                                    TryCatchGuardChecker.doCheck(e6);
                                }
                            } else if ((objLJ3 instanceof String) && List.class.isAssignableFrom(Object.class)) {
                                objLJ3 = C14P7.LJJ((String) objLJ3);
                            }
                        }
                        if (!(objLJ3 instanceof Object)) {
                            objLJ3 = null;
                        }
                        Object obj6 = ((LinkedHashMap) this.LJFF).get("feedbackTrackExtraParams");
                        if (!(obj6 instanceof Object)) {
                            obj6 = null;
                        }
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("updateCacheIfNeeded: cachedValue = ");
                        sbLIZ5.append(obj6);
                        sbLIZ5.append(", castValue = ");
                        sbLIZ5.append(objLJ3);
                        C2188811AlT.LIZIZ(sbLIZ5);
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("updateCacheIfNeeded: isInitializing = ");
                        sbLIZ6.append(true);
                        sbLIZ6.append(" !cachedValue.deepEquals(castValue):");
                        sbLIZ6.append(!C14P7.LIZ(obj6, objLJ3));
                        C2188811AlT.LIZIZ(sbLIZ6);
                        if (C14P7.LIZ(obj6, objLJ3)) {
                            linkedHashMap = new LinkedHashMap();
                            if ((objLJ3 instanceof Map) && (map2 = (Map) objLJ3) != null) {
                                for (Map.Entry entry : map2.entrySet()) {
                                    Object key = entry.getKey();
                                    Object value = entry.getValue();
                                    linkedHashMap.put(key, value != null ? LJ(value) : null);
                                }
                            }
                        } else {
                            linkedHashMap = new LinkedHashMap();
                            if ((objLJ3 instanceof Map) && (map3 = (Map) objLJ3) != null) {
                                for (Map.Entry entry2 : map3.entrySet()) {
                                    Object key2 = entry2.getKey();
                                    Object value2 = entry2.getValue();
                                    linkedHashMap.put(key2, value2 != null ? LJ(value2) : null);
                                }
                            }
                            this.LJFF.put("feedbackTrackExtraParams", objLJ3);
                        }
                        if (mapZo0 != null && (obj = mapZo0.get("feedbackType")) != null) {
                            string = obj.toString();
                        }
                        return new C656600PpC(strValueOf, string, linkedHashMap);
                    }

                    @Override // X.C14NT
                    public final View LJJIII(Context context) {
                        FrameLayout.LayoutParams layoutParamsLIZ = C425100Glg.LIZ(C1697810uHb.LJIIJJI(0, 0, 0, 0));
                        layoutParamsLIZ.width = -2;
                        FrameLayout frameLayout = new FrameLayout(context);
                        frameLayout.setId(R.id.ud2);
                        C786410Ut5.a6(frameLayout, layoutParamsLIZ);
                        frameLayout.setClickable(true);
                        return frameLayout;
                    }
                };
            }
        }));
        C14NH.LIZ(C1697810uHb.LJIIJJI(new C14NJ() { // from class: X.14Mg
            @Override // X.C14NJ
            public final String getName() {
                return "top1Feedback";
            }

            @Override // X.C14NJ
            public final void LIZ(Map<String, ? extends Object> map2, C14NX c14nx, Map<String, ? extends Object> map3, C14NF c14nf) {
                ITop1NimbleActionAbility iTop1NimbleActionAbility = (ITop1NimbleActionAbility) C1558520qew.LIZ(c14nx.LIZIZ(), ITop1NimbleActionAbility.class, null);
                if (iTop1NimbleActionAbility != null) {
                    iTop1NimbleActionAbility.WY1();
                }
            }
        }, new C14NJ() { // from class: X.14Mh
            @Override // X.C14NJ
            public final String getName() {
                return "top1OpenLandingPage";
            }

            @Override // X.C14NJ
            public final void LIZ(Map<String, ? extends Object> map2, C14NX c14nx, Map<String, ? extends Object> map3, C14NF c14nf) {
                ITop1NimbleActionAbility iTop1NimbleActionAbility = (ITop1NimbleActionAbility) C1558520qew.LIZ(c14nx.LIZIZ(), ITop1NimbleActionAbility.class, null);
                if (iTop1NimbleActionAbility != null) {
                    iTop1NimbleActionAbility.oq0();
                }
            }
        }, new C14NJ() { // from class: X.14Md
            @Override // X.C14NJ
            public final String getName() {
                return "top1TrackEvent";
            }

            @Override // X.C14NJ
            public final void LIZ(Map<String, ? extends Object> map2, C14NX c14nx, Map<String, ? extends Object> map3, C14NF c14nf) {
                Map map4;
                String str;
                Object objLIZLLL;
                ITop1NimbleActionAbility iTop1NimbleActionAbility = (ITop1NimbleActionAbility) C1558520qew.LIZ(c14nx.LIZIZ(), ITop1NimbleActionAbility.class, null);
                Object objLIZIZ = C444200HbO.LIZIZ("extraParams", map2);
                if (objLIZIZ instanceof Map) {
                    map4 = (Map) objLIZIZ;
                } else {
                    map4 = null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (map4 != null) {
                    for (Map.Entry entry : map4.entrySet()) {
                        String strValueOf = String.valueOf(entry.getKey());
                        Object value = entry.getValue();
                        if (value != null) {
                            objLIZLLL = c14nx.LJ(value);
                        } else {
                            objLIZLLL = null;
                        }
                        if (String.class == Double.class) {
                            objLIZLLL = C20252814Mk.LIZ(objLIZLLL);
                        } else if (String.class == Float.class) {
                            objLIZLLL = C20252814Mk.LIZIZ(objLIZLLL);
                        } else if (String.class == Integer.class) {
                            objLIZLLL = C20252814Mk.LIZJ(objLIZLLL);
                        } else if (String.class == Long.class) {
                            objLIZLLL = C20252814Mk.LIZLLL(objLIZLLL);
                        } else if (String.class == String.class) {
                            if (objLIZLLL != null) {
                                objLIZLLL = objLIZLLL.toString();
                            } else {
                                objLIZLLL = null;
                            }
                        } else if (String.class != String.class && String.class != Map.class) {
                            if ((objLIZLLL instanceof Map) && !Map.class.isAssignableFrom(String.class)) {
                                try {
                                    C1227904rF.LIZ.getClass();
                                    Gson gsonLIZLLL = C1227904rF.LIZLLL();
                                    objLIZLLL = gsonLIZLLL.LIZJ(gsonLIZLLL.LJIJJLI(objLIZLLL), String.class);
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            } else if (objLIZLLL instanceof List) {
                                try {
                                    Type type = new TypeToken<String>() { // from class: X.14Me
                                    }.getType();
                                    if (List.class.isAssignableFrom(String.class)) {
                                        C1227904rF.LIZ.getClass();
                                        Gson gsonLIZLLL2 = C1227904rF.LIZLLL();
                                        objLIZLLL = gsonLIZLLL2.LIZLLL(gsonLIZLLL2.LJIJJLI(objLIZLLL), type);
                                    }
                                } catch (Exception e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                }
                            } else if ((objLIZLLL instanceof String) && List.class.isAssignableFrom(String.class)) {
                                objLIZLLL = C14P7.LJJ((String) objLIZLLL);
                            }
                        }
                        if (!(objLIZLLL instanceof String) || objLIZLLL == null) {
                            objLIZLLL = "";
                        }
                        linkedHashMap.put(strValueOf, objLIZLLL);
                    }
                }
                Object objLIZIZ2 = C444200HbO.LIZIZ("eventName", map2);
                if ((objLIZIZ2 instanceof String) && (str = (String) objLIZIZ2) != null && str.length() != 0 && iTop1NimbleActionAbility != null) {
                    iTop1NimbleActionAbility.Ha0(str, linkedHashMap);
                }
            }
        }, new C0R26(), new C14N4(), new C14NJ() { // from class: X.14Mz
            @Override // X.C14NJ
            public final String getName() {
                return "top1SurroundedVideoShow";
            }

            @Override // X.C14NJ
            public final void LIZ(Map<String, ? extends Object> map2, C14NX c14nx, Map<String, ? extends Object> map3, C14NF c14nf) {
                Object objLJ;
                Object obj;
                String str = null;
                ITop1CommonAbility iTop1CommonAbility = (ITop1CommonAbility) C1558520qew.LIZ(c14nx.LIZIZ(), ITop1CommonAbility.class, null);
                if (iTop1CommonAbility != null) {
                    View view = c14nx.getView();
                    if (map2 != null && (obj = map2.get("surrounded_video_id")) != null) {
                        objLJ = c14nx.LJ(obj);
                    } else {
                        objLJ = null;
                    }
                    if (objLJ instanceof String) {
                        str = (String) objLJ;
                    }
                    iTop1CommonAbility.jS(view, str);
                }
            }
        }, new C14NJ() { // from class: X.14My
            @Override // X.C14NJ
            public final String getName() {
                return "top1SurroundedVideoClick";
            }

            @Override // X.C14NJ
            public final void LIZ(Map<String, ? extends Object> map2, C14NX c14nx, Map<String, ? extends Object> map3, C14NF c14nf) {
                Object objLJ;
                Object obj;
                String str = null;
                ITop1CommonAbility iTop1CommonAbility = (ITop1CommonAbility) C1558520qew.LIZ(c14nx.LIZIZ(), ITop1CommonAbility.class, null);
                if (iTop1CommonAbility != null) {
                    if (map2 != null && (obj = map2.get("surrounded_video_id")) != null) {
                        objLJ = c14nx.LJ(obj);
                    } else {
                        objLJ = null;
                    }
                    if (objLJ instanceof String) {
                        str = (String) objLJ;
                    }
                    iTop1CommonAbility.Tt0(str);
                }
            }
        }, new C14NJ() { // from class: X.14Mm
            @Override // X.C14NJ
            public final String getName() {
                return "helpPostCardOpenLandingPage";
            }

            @Override // X.C14NJ
            public final void LIZ(Map<String, ? extends Object> map2, C14NX c14nx, Map<String, ? extends Object> map3, C14NF c14nf) {
                boolean z;
                Object objLIZLLL;
                Object objLIZLLL2;
                Object objLIZLLL3;
                Object obj;
                Object obj2;
                Object obj3;
                Object obj4 = null;
                IVerticalNimbleActionAbility iVerticalNimbleActionAbility = (IVerticalNimbleActionAbility) C1558520qew.LIZ(c14nx.LIZIZ(), IVerticalNimbleActionAbility.class, null);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("processEvent: verticalNimbleAbility is null: ");
                int iIntValue = 0;
                if (iVerticalNimbleActionAbility == null) {
                    z = true;
                } else {
                    z = false;
                }
                sbLIZ.append(z);
                sbLIZ.append(' ');
                C2188811AlT.LIZIZ(sbLIZ);
                if (map2 != null && (obj3 = map2.get("question")) != null) {
                    objLIZLLL = c14nx.LJ(obj3);
                } else {
                    objLIZLLL = null;
                }
                if (String.class == Double.class) {
                    objLIZLLL = C20252814Mk.LIZ(objLIZLLL);
                } else if (String.class == Float.class) {
                    objLIZLLL = C20252814Mk.LIZIZ(objLIZLLL);
                } else if (String.class == Integer.class) {
                    objLIZLLL = C20252814Mk.LIZJ(objLIZLLL);
                } else if (String.class == Long.class) {
                    objLIZLLL = C20252814Mk.LIZLLL(objLIZLLL);
                } else if (String.class == String.class) {
                    if (objLIZLLL != null) {
                        objLIZLLL = objLIZLLL.toString();
                    } else {
                        objLIZLLL = null;
                    }
                } else if (String.class != String.class && String.class != Map.class) {
                    if ((objLIZLLL instanceof Map) && !Map.class.isAssignableFrom(String.class)) {
                        try {
                            C1227904rF.LIZ.getClass();
                            Gson gsonLIZLLL = C1227904rF.LIZLLL();
                            objLIZLLL = gsonLIZLLL.LIZJ(gsonLIZLLL.LJIJJLI(objLIZLLL), String.class);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } else if (objLIZLLL instanceof List) {
                        try {
                            Type type = new TypeToken<String>() { // from class: X.14Mn
                            }.getType();
                            if (List.class.isAssignableFrom(String.class)) {
                                C1227904rF.LIZ.getClass();
                                Gson gsonLIZLLL2 = C1227904rF.LIZLLL();
                                objLIZLLL = gsonLIZLLL2.LIZLLL(gsonLIZLLL2.LJIJJLI(objLIZLLL), type);
                            }
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    } else if ((objLIZLLL instanceof String) && List.class.isAssignableFrom(String.class)) {
                        objLIZLLL = C14P7.LJJ((String) objLIZLLL);
                    }
                }
                if (!(objLIZLLL instanceof String)) {
                    objLIZLLL = null;
                }
                String str = (String) objLIZLLL;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                if (map2 != null && (obj2 = map2.get("demandType")) != null) {
                    objLIZLLL2 = c14nx.LJ(obj2);
                } else {
                    objLIZLLL2 = null;
                }
                if (String.class == Double.class) {
                    objLIZLLL2 = C20252814Mk.LIZ(objLIZLLL2);
                } else if (String.class == Float.class) {
                    objLIZLLL2 = C20252814Mk.LIZIZ(objLIZLLL2);
                } else if (String.class == Integer.class) {
                    objLIZLLL2 = C20252814Mk.LIZJ(objLIZLLL2);
                } else if (String.class == Long.class) {
                    objLIZLLL2 = C20252814Mk.LIZLLL(objLIZLLL2);
                } else if (String.class == String.class) {
                    if (objLIZLLL2 != null) {
                        objLIZLLL2 = objLIZLLL2.toString();
                    } else {
                        objLIZLLL2 = null;
                    }
                } else if (String.class != String.class && String.class != Map.class) {
                    if ((objLIZLLL2 instanceof Map) && !Map.class.isAssignableFrom(String.class)) {
                        try {
                            C1227904rF.LIZ.getClass();
                            Gson gsonLIZLLL3 = C1227904rF.LIZLLL();
                            objLIZLLL2 = gsonLIZLLL3.LIZJ(gsonLIZLLL3.LJIJJLI(objLIZLLL2), String.class);
                        } catch (Exception e3) {
                            TryCatchGuardChecker.doCheck(e3);
                        }
                    } else if (objLIZLLL2 instanceof List) {
                        try {
                            Type type2 = new TypeToken<String>() { // from class: X.14Mo
                            }.getType();
                            if (List.class.isAssignableFrom(String.class)) {
                                C1227904rF.LIZ.getClass();
                                Gson gsonLIZLLL4 = C1227904rF.LIZLLL();
                                objLIZLLL2 = gsonLIZLLL4.LIZLLL(gsonLIZLLL4.LJIJJLI(objLIZLLL2), type2);
                            }
                        } catch (Exception e4) {
                            TryCatchGuardChecker.doCheck(e4);
                        }
                    } else if ((objLIZLLL2 instanceof String) && List.class.isAssignableFrom(String.class)) {
                        objLIZLLL2 = C14P7.LJJ((String) objLIZLLL2);
                    }
                }
                if (!(objLIZLLL2 instanceof String)) {
                    objLIZLLL2 = null;
                }
                String str3 = (String) objLIZLLL2;
                if (str3 != null) {
                    str2 = str3;
                }
                if (map2 != null && (obj = map2.get("editPageStyle")) != null) {
                    objLIZLLL3 = c14nx.LJ(obj);
                } else {
                    objLIZLLL3 = null;
                }
                if (Integer.class == Double.class) {
                    objLIZLLL3 = C20252814Mk.LIZ(objLIZLLL3);
                } else if (Integer.class == Float.class) {
                    objLIZLLL3 = C20252814Mk.LIZIZ(objLIZLLL3);
                } else if (Integer.class == Integer.class) {
                    objLIZLLL3 = C20252814Mk.LIZJ(objLIZLLL3);
                } else if (Integer.class == Long.class) {
                    objLIZLLL3 = C20252814Mk.LIZLLL(objLIZLLL3);
                } else if (Integer.class == String.class) {
                    if (objLIZLLL3 != null) {
                        objLIZLLL3 = objLIZLLL3.toString();
                    } else {
                        objLIZLLL3 = null;
                    }
                } else if (Integer.class != String.class && Integer.class != Map.class) {
                    if ((objLIZLLL3 instanceof Map) && !Map.class.isAssignableFrom(Integer.class)) {
                        try {
                            C1227904rF.LIZ.getClass();
                            Gson gsonLIZLLL5 = C1227904rF.LIZLLL();
                            objLIZLLL3 = gsonLIZLLL5.LIZJ(gsonLIZLLL5.LJIJJLI(objLIZLLL3), Integer.class);
                        } catch (Exception e5) {
                            TryCatchGuardChecker.doCheck(e5);
                        }
                    } else if (objLIZLLL3 instanceof List) {
                        try {
                            Type type3 = new TypeToken<Integer>() { // from class: X.14Mp
                            }.getType();
                            if (List.class.isAssignableFrom(Integer.class)) {
                                C1227904rF.LIZ.getClass();
                                Gson gsonLIZLLL6 = C1227904rF.LIZLLL();
                                objLIZLLL3 = gsonLIZLLL6.LIZLLL(gsonLIZLLL6.LJIJJLI(objLIZLLL3), type3);
                            }
                        } catch (Exception e6) {
                            TryCatchGuardChecker.doCheck(e6);
                        }
                    } else if ((objLIZLLL3 instanceof String) && List.class.isAssignableFrom(Integer.class)) {
                        objLIZLLL3 = C14P7.LJJ((String) objLIZLLL3);
                    }
                }
                if (objLIZLLL3 instanceof Integer) {
                    obj4 = objLIZLLL3;
                }
                Integer num = (Integer) obj4;
                if (num != null) {
                    iIntValue = num.intValue();
                }
                if (iVerticalNimbleActionAbility != null) {
                    iVerticalNimbleActionAbility.gi(Integer.valueOf(iIntValue), str, str2);
                }
            }
        }, new C14NJ() { // from class: X.14Mq
            @Override // X.C14NJ
            public final String getName() {
                return "helpPostCardShowRecord";
            }

            @Override // X.C14NJ
            public final void LIZ(Map<String, ? extends Object> map2, C14NX c14nx, Map<String, ? extends Object> map3, C14NF c14nf) {
                IVerticalNimbleActionAbility iVerticalNimbleActionAbility = (IVerticalNimbleActionAbility) C1558520qew.LIZ(c14nx.LIZIZ(), IVerticalNimbleActionAbility.class, null);
                if (iVerticalNimbleActionAbility != null) {
                    iVerticalNimbleActionAbility.X9();
                }
            }
        }));
        if (list != null && C07F6.LIZ()) {
            int i2 = 0;
            for (NimbleV2ConfigData nimbleV2ConfigData : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    C14NH c14nh = C14NH.LIZ;
                    List listSingletonList = Collections.singletonList(Integer.valueOf(i2 + 5000));
                    String str = nimbleV2ConfigData.templateKey;
                    c14nh.getClass();
                    C14NH.LJFF(str, listSingletonList, map);
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        if (list2 != null && C07C1.LIZ()) {
            for (NimbleV2ConfigData nimbleV2ConfigData2 : list2) {
                int i4 = i + 1;
                if (i >= 0) {
                    NimbleV2ConfigData nimbleV2ConfigData3 = nimbleV2ConfigData2;
                    Integer num = nimbleV2ConfigData3.sceneType;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        C14NH c14nh2 = C14NH.LIZ;
                        List listSingletonList2 = Collections.singletonList(Integer.valueOf(iIntValue + 5500));
                        String str2 = nimbleV2ConfigData3.templateKey;
                        c14nh2.getClass();
                        C14NH.LJFF(str2, listSingletonList2, map);
                    }
                    i = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    public static void LIZIZ(Map map) {
        if (!LIZ) {
            if (C07F6.LIZ() || C07C1.LIZ()) {
                LIZ = true;
                if (C07F5.LIZ()) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1312605Bs(map, null), 3);
                } else {
                    LIZ(map);
                }
            }
        }
    }
}
