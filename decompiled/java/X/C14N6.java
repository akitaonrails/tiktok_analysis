package X;

import Y.ARunnableS15S1100000_10;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lynx.starlight.nodes.StarlightNode;
import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleModelAbility;
import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleUserDependAbility;
import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleVideoListDependAbility;
import com.ss.android.ugc.aweme.nimblecard.tako.context.NimbleTemplateContext;
import com.ss.android.ugc.aweme.nimblecard.tako.model.LoopVariables;
import com.ss.android.ugc.aweme.nimblecard.tako.model.NimbleViewProps;
import com.ss.android.ugc.aweme.nimblecard.tako.model.TemplateData;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoUserItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14N6, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14N6 {
    public final Map<String, ? extends Object> LIZ;
    public final CopyOnWriteArrayList<C14NZ> LIZIZ;
    public final CopyOnWriteArrayList<C14NJ> LIZJ;

    public C14N6() {
        try {
            new StarlightNode();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ExecutorService executorService = C1909880zne.LIZ;
            String message = e.getMessage();
            C1909880zne.LIZJ("", null, message == null ? "" : message, 26);
        }
        C844470XAv.LIZ.getClass();
        Context context = C14P7.LIZ;
        this.LIZ = C2097608Jq.LJIIIIZZ(new Pair("platform", "android"), new Pair("version", C844470XAv.LJFF()), new Pair("width", Integer.valueOf(C12ES.LJIIJ(context))), new Pair("height", Integer.valueOf(C12ES.LJIIIIZZ(context))), new Pair("cons_str", "<MERGED_CONS>"), new Pair("pros_str", "<MERGED_PROS>"));
        CopyOnWriteArrayList<C14NZ> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.addAll(C1697810uHb.LJIIJJI(new C14NZ() { // from class: X.14N7
            @Override // X.C14NZ
            public final C13IQ LIZIZ() {
                return null;
            }

            @Override // X.C14NZ
            public final void LIZLLL() {
            }

            @Override // X.C14NZ
            public final boolean LIZ(String str) {
                return Intrinsics.LJFF(str, "NimbleLynx");
            }

            @Override // X.C14NZ
            public final C14NX LIZJ(final NimbleTemplateContext nimbleTemplateContext) {
                return new AbstractC20257014Oa<View>(nimbleTemplateContext) { // from class: X.14Ob
                    @Override // X.AbstractC20257014Oa
                    public final Function0<ReusedUIAssem<?>> LJJIIZ() {
                        return AFwS219S0000000_30.get$arr$(307);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.AbstractC20257014Oa
                    public final InterfaceC1587906Jp LJJIIZI() {
                        NimbleViewProps nimbleViewProps;
                        T tLJJ;
                        T tLJJ2;
                        TemplateData templateData = this.LJIIIZ;
                        C259800zU c259800zU = new C259800zU();
                        C259800zU c259800zU2 = new C259800zU();
                        if (templateData != null && (nimbleViewProps = templateData.props) != null) {
                            String str = nimbleViewProps.schema;
                            Object objLJ = str != null ? LJ(str) : null;
                            if (String.class == Double.class) {
                                tLJJ = C20252814Mk.LIZ(objLJ);
                            } else if (String.class == Float.class) {
                                tLJJ = C20252814Mk.LIZIZ(objLJ);
                            } else if (String.class == Integer.class) {
                                tLJJ = C20252814Mk.LIZJ(objLJ);
                            } else if (String.class == Long.class) {
                                tLJJ = C20252814Mk.LIZLLL(objLJ);
                            } else if (String.class == String.class) {
                                tLJJ = objLJ != null ? objLJ.toString() : 0;
                            } else {
                                tLJJ = objLJ;
                                if (String.class != String.class) {
                                    tLJJ = objLJ;
                                    if (String.class != Map.class) {
                                        if ((objLJ instanceof Map) && !Map.class.isAssignableFrom(String.class)) {
                                            try {
                                                C1227904rF.LIZ.getClass();
                                                Gson gsonLIZLLL = C1227904rF.LIZLLL();
                                                objLJ = gsonLIZLLL.LIZJ(gsonLIZLLL.LJIJJLI(objLJ), String.class);
                                                tLJJ = objLJ;
                                            } catch (Exception e2) {
                                                TryCatchGuardChecker.doCheck(e2);
                                                tLJJ = objLJ;
                                            }
                                        } else if (objLJ instanceof List) {
                                            try {
                                                Type type = new TypeToken<String>() { // from class: X.14Od
                                                }.getType();
                                                tLJJ = objLJ;
                                                if (List.class.isAssignableFrom(String.class)) {
                                                    C1227904rF.LIZ.getClass();
                                                    Gson gsonLIZLLL2 = C1227904rF.LIZLLL();
                                                    objLJ = gsonLIZLLL2.LIZLLL(gsonLIZLLL2.LJIJJLI(objLJ), type);
                                                    tLJJ = objLJ;
                                                }
                                            } catch (Exception e3) {
                                                TryCatchGuardChecker.doCheck(e3);
                                                tLJJ = objLJ;
                                            }
                                        } else {
                                            boolean z = objLJ instanceof String;
                                            tLJJ = objLJ;
                                            if (z) {
                                                tLJJ = objLJ;
                                                if (List.class.isAssignableFrom(String.class)) {
                                                    tLJJ = C14P7.LJJ((String) objLJ);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if ((tLJJ instanceof String) && tLJJ != 0) {
                                c259800zU.element = tLJJ;
                            }
                            String str2 = nimbleViewProps.rawData;
                            Object objLJ2 = str2 != null ? LJ(str2) : null;
                            if (String.class == Double.class) {
                                tLJJ2 = C20252814Mk.LIZ(objLJ2);
                            } else if (String.class == Float.class) {
                                tLJJ2 = C20252814Mk.LIZIZ(objLJ2);
                            } else if (String.class == Integer.class) {
                                tLJJ2 = C20252814Mk.LIZJ(objLJ2);
                            } else if (String.class == Long.class) {
                                tLJJ2 = C20252814Mk.LIZLLL(objLJ2);
                            } else if (String.class == String.class) {
                                tLJJ2 = objLJ2 != null ? objLJ2.toString() : 0;
                            } else {
                                tLJJ2 = objLJ2;
                                if (String.class != String.class) {
                                    tLJJ2 = objLJ2;
                                    if (String.class != Map.class) {
                                        if ((objLJ2 instanceof Map) && !Map.class.isAssignableFrom(String.class)) {
                                            try {
                                                C1227904rF.LIZ.getClass();
                                                Gson gsonLIZLLL3 = C1227904rF.LIZLLL();
                                                objLJ2 = gsonLIZLLL3.LIZJ(gsonLIZLLL3.LJIJJLI(objLJ2), String.class);
                                                tLJJ2 = objLJ2;
                                            } catch (Exception e4) {
                                                TryCatchGuardChecker.doCheck(e4);
                                                tLJJ2 = objLJ2;
                                            }
                                        } else if (objLJ2 instanceof List) {
                                            try {
                                                Type type2 = new TypeToken<String>() { // from class: X.14Oe
                                                }.getType();
                                                tLJJ2 = objLJ2;
                                                if (List.class.isAssignableFrom(String.class)) {
                                                    C1227904rF.LIZ.getClass();
                                                    Gson gsonLIZLLL4 = C1227904rF.LIZLLL();
                                                    objLJ2 = gsonLIZLLL4.LIZLLL(gsonLIZLLL4.LJIJJLI(objLJ2), type2);
                                                    tLJJ2 = objLJ2;
                                                }
                                            } catch (Exception e5) {
                                                TryCatchGuardChecker.doCheck(e5);
                                                tLJJ2 = objLJ2;
                                            }
                                        } else {
                                            boolean z2 = objLJ2 instanceof String;
                                            tLJJ2 = objLJ2;
                                            if (z2) {
                                                tLJJ2 = objLJ2;
                                                if (List.class.isAssignableFrom(String.class)) {
                                                    tLJJ2 = C14P7.LJJ((String) objLJ2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if ((tLJJ2 instanceof String) && tLJJ2 != 0) {
                                c259800zU2.element = tLJJ2;
                            }
                        }
                        return new C20257214Oc(c259800zU, c259800zU2, this);
                    }

                    @Override // X.C14NT
                    public final View LJJIII(Context context2) {
                        FrameLayout frameLayout = new FrameLayout(context2);
                        frameLayout.setId(View.generateViewId());
                        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -2));
                        return frameLayout;
                    }
                };
            }
        }, new C14NZ() { // from class: X.14N9
            @Override // X.C14NZ
            public final C13IQ LIZIZ() {
                return null;
            }

            @Override // X.C14NZ
            public final void LIZLLL() {
            }

            @Override // X.C14NZ
            public final boolean LIZ(String str) {
                return Intrinsics.LJFF(str, "NimbleUser");
            }

            @Override // X.C14NZ
            public final C14NX LIZJ(final NimbleTemplateContext nimbleTemplateContext) {
                return new AbstractC20257014Oa<View>(nimbleTemplateContext) { // from class: X.14Nt
                    @Override // X.AbstractC20257014Oa
                    public final Function0<ReusedUIAssem<?>> LJJIIZ() {
                        return AFwS219S0000000_30.get$arr$(313);
                    }

                    @Override // X.AbstractC20257014Oa
                    public final InterfaceC1587906Jp LJJIIZI() {
                        String str;
                        NimbleViewProps nimbleViewProps;
                        TakoUserItem takoUserItem = null;
                        INimbleUserDependAbility iNimbleUserDependAbility = (INimbleUserDependAbility) C1558520qew.LIZ(this.LIZ, INimbleUserDependAbility.class, null);
                        TemplateData templateData = this.LJIIIZ;
                        if (templateData == null || (nimbleViewProps = templateData.props) == null) {
                            str = null;
                        } else {
                            String str2 = nimbleViewProps.user;
                            Object objLJ = str2 != null ? LJ(str2) : null;
                            if (TakoUserItem.class == Double.class) {
                                objLJ = C20252814Mk.LIZ(objLJ);
                            } else if (TakoUserItem.class == Float.class) {
                                objLJ = C20252814Mk.LIZIZ(objLJ);
                            } else if (TakoUserItem.class == Integer.class) {
                                objLJ = C20252814Mk.LIZJ(objLJ);
                            } else if (TakoUserItem.class == Long.class) {
                                objLJ = C20252814Mk.LIZLLL(objLJ);
                            } else if (TakoUserItem.class == String.class) {
                                objLJ = objLJ != null ? objLJ.toString() : null;
                            } else if (TakoUserItem.class != String.class && TakoUserItem.class != Map.class) {
                                if ((objLJ instanceof Map) && !Map.class.isAssignableFrom(TakoUserItem.class)) {
                                    try {
                                        C1227904rF.LIZ.getClass();
                                        Gson gsonLIZLLL = C1227904rF.LIZLLL();
                                        objLJ = gsonLIZLLL.LIZJ(gsonLIZLLL.LJIJJLI(objLJ), TakoUserItem.class);
                                    } catch (Exception e2) {
                                        TryCatchGuardChecker.doCheck(e2);
                                    }
                                } else if (objLJ instanceof List) {
                                    try {
                                        Type type = new TypeToken<TakoUserItem>() { // from class: X.14Nv
                                        }.getType();
                                        if (List.class.isAssignableFrom(TakoUserItem.class)) {
                                            C1227904rF.LIZ.getClass();
                                            Gson gsonLIZLLL2 = C1227904rF.LIZLLL();
                                            objLJ = gsonLIZLLL2.LIZLLL(gsonLIZLLL2.LJIJJLI(objLJ), type);
                                        }
                                    } catch (Exception e3) {
                                        TryCatchGuardChecker.doCheck(e3);
                                    }
                                } else if ((objLJ instanceof String) && List.class.isAssignableFrom(TakoUserItem.class)) {
                                    objLJ = C14P7.LJJ((String) objLJ);
                                }
                            }
                            if (!(objLJ instanceof TakoUserItem)) {
                                objLJ = null;
                            }
                            TakoUserItem takoUserItem2 = (TakoUserItem) objLJ;
                            if (takoUserItem2 == null) {
                                takoUserItem2 = null;
                            }
                            String str3 = nimbleViewProps.messageId;
                            Object objLJ2 = str3 != null ? LJ(str3) : null;
                            if (String.class == Double.class) {
                                objLJ2 = C20252814Mk.LIZ(objLJ2);
                            } else if (String.class == Float.class) {
                                objLJ2 = C20252814Mk.LIZIZ(objLJ2);
                            } else if (String.class == Integer.class) {
                                objLJ2 = C20252814Mk.LIZJ(objLJ2);
                            } else if (String.class == Long.class) {
                                objLJ2 = C20252814Mk.LIZLLL(objLJ2);
                            } else if (String.class == String.class) {
                                objLJ2 = objLJ2 != null ? objLJ2.toString() : null;
                            } else if (String.class != String.class && String.class != Map.class) {
                                if ((objLJ2 instanceof Map) && !Map.class.isAssignableFrom(String.class)) {
                                    try {
                                        C1227904rF.LIZ.getClass();
                                        Gson gsonLIZLLL3 = C1227904rF.LIZLLL();
                                        objLJ2 = gsonLIZLLL3.LIZJ(gsonLIZLLL3.LJIJJLI(objLJ2), String.class);
                                    } catch (Exception e4) {
                                        TryCatchGuardChecker.doCheck(e4);
                                    }
                                } else if (objLJ2 instanceof List) {
                                    try {
                                        Type type2 = new TypeToken<String>() { // from class: X.14Nu
                                        }.getType();
                                        if (List.class.isAssignableFrom(String.class)) {
                                            C1227904rF.LIZ.getClass();
                                            Gson gsonLIZLLL4 = C1227904rF.LIZLLL();
                                            objLJ2 = gsonLIZLLL4.LIZLLL(gsonLIZLLL4.LJIJJLI(objLJ2), type2);
                                        }
                                    } catch (Exception e5) {
                                        TryCatchGuardChecker.doCheck(e5);
                                    }
                                } else if ((objLJ2 instanceof String) && List.class.isAssignableFrom(String.class)) {
                                    objLJ2 = C14P7.LJJ((String) objLJ2);
                                }
                            }
                            if (!(objLJ2 instanceof String)) {
                                objLJ2 = null;
                            }
                            String str4 = (String) objLJ2;
                            str = str4 != null ? str4 : null;
                            takoUserItem = takoUserItem2;
                        }
                        return new C689360R2g(iNimbleUserDependAbility, takoUserItem, str);
                    }

                    @Override // X.C14NT
                    public final View LJJIII(Context context2) {
                        FrameLayout frameLayout = new FrameLayout(context2);
                        frameLayout.setId(View.generateViewId());
                        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -2));
                        return frameLayout;
                    }
                };
            }
        }, new C14NZ() { // from class: X.14NB
            @Override // X.C14NZ
            public final C13IQ LIZIZ() {
                return null;
            }

            @Override // X.C14NZ
            public final void LIZLLL() {
            }

            @Override // X.C14NZ
            public final boolean LIZ(String str) {
                return Intrinsics.LJFF(str, "NimbleVideoList");
            }

            @Override // X.C14NZ
            public final C14NX LIZJ(final NimbleTemplateContext nimbleTemplateContext) {
                return new AbstractC20257014Oa<View>(nimbleTemplateContext) { // from class: X.14OU
                    @Override // X.AbstractC20257014Oa
                    public final InterfaceC1587906Jp LJJIIZI() {
                        List list;
                        String str;
                        Boolean boolValueOf;
                        NimbleViewProps nimbleViewProps;
                        Integer numValueOf = null;
                        INimbleVideoListDependAbility iNimbleVideoListDependAbility = (INimbleVideoListDependAbility) C1558520qew.LIZ(this.LIZ, INimbleVideoListDependAbility.class, null);
                        TemplateData templateData = this.LJIIIZ;
                        if (templateData == null || (nimbleViewProps = templateData.props) == null) {
                            list = null;
                            str = null;
                            boolValueOf = null;
                        } else {
                            String str2 = nimbleViewProps.videoList;
                            Object objLJ = str2 != null ? LJ(str2) : null;
                            if (List.class == Double.class) {
                                objLJ = C20252814Mk.LIZ(objLJ);
                            } else if (List.class == Float.class) {
                                objLJ = C20252814Mk.LIZIZ(objLJ);
                            } else if (List.class == Integer.class) {
                                objLJ = C20252814Mk.LIZJ(objLJ);
                            } else if (List.class == Long.class) {
                                objLJ = C20252814Mk.LIZLLL(objLJ);
                            } else if (List.class == String.class) {
                                objLJ = objLJ != null ? objLJ.toString() : null;
                            } else if (List.class != String.class && List.class != Map.class) {
                                if ((objLJ instanceof Map) && !Map.class.isAssignableFrom(List.class)) {
                                    try {
                                        C1227904rF.LIZ.getClass();
                                        Gson gsonLIZLLL = C1227904rF.LIZLLL();
                                        objLJ = gsonLIZLLL.LIZJ(gsonLIZLLL.LJIJJLI(objLJ), List.class);
                                    } catch (Exception e2) {
                                        TryCatchGuardChecker.doCheck(e2);
                                    }
                                } else if (objLJ instanceof List) {
                                    try {
                                        Type type = new TypeToken<List<? extends TakoVideoItem>>() { // from class: X.14OV
                                        }.getType();
                                        if (List.class.isAssignableFrom(List.class)) {
                                            C1227904rF.LIZ.getClass();
                                            Gson gsonLIZLLL2 = C1227904rF.LIZLLL();
                                            objLJ = gsonLIZLLL2.LIZLLL(gsonLIZLLL2.LJIJJLI(objLJ), type);
                                        }
                                    } catch (Exception e3) {
                                        TryCatchGuardChecker.doCheck(e3);
                                    }
                                } else if ((objLJ instanceof String) && List.class.isAssignableFrom(List.class)) {
                                    objLJ = C14P7.LJJ((String) objLJ);
                                }
                            }
                            if (!(objLJ instanceof List)) {
                                objLJ = null;
                            }
                            list = (List) objLJ;
                            if (list == null) {
                                list = null;
                            }
                            String str3 = nimbleViewProps.showPlayIcon;
                            Object objLJ2 = str3 != null ? LJ(str3) : null;
                            if (Boolean.class == Double.class) {
                                objLJ2 = C20252814Mk.LIZ(objLJ2);
                            } else if (Boolean.class == Float.class) {
                                objLJ2 = C20252814Mk.LIZIZ(objLJ2);
                            } else if (Boolean.class == Integer.class) {
                                objLJ2 = C20252814Mk.LIZJ(objLJ2);
                            } else if (Boolean.class == Long.class) {
                                objLJ2 = C20252814Mk.LIZLLL(objLJ2);
                            } else if (Boolean.class == String.class) {
                                objLJ2 = objLJ2 != null ? objLJ2.toString() : null;
                            } else if (Boolean.class != String.class && Boolean.class != Map.class) {
                                if ((objLJ2 instanceof Map) && !Map.class.isAssignableFrom(Boolean.class)) {
                                    try {
                                        C1227904rF.LIZ.getClass();
                                        Gson gsonLIZLLL3 = C1227904rF.LIZLLL();
                                        objLJ2 = gsonLIZLLL3.LIZJ(gsonLIZLLL3.LJIJJLI(objLJ2), Boolean.class);
                                    } catch (Exception e4) {
                                        TryCatchGuardChecker.doCheck(e4);
                                    }
                                } else if (objLJ2 instanceof List) {
                                    try {
                                        Type type2 = new TypeToken<Boolean>() { // from class: X.14OW
                                        }.getType();
                                        if (List.class.isAssignableFrom(Boolean.class)) {
                                            C1227904rF.LIZ.getClass();
                                            Gson gsonLIZLLL4 = C1227904rF.LIZLLL();
                                            objLJ2 = gsonLIZLLL4.LIZLLL(gsonLIZLLL4.LJIJJLI(objLJ2), type2);
                                        }
                                    } catch (Exception e5) {
                                        TryCatchGuardChecker.doCheck(e5);
                                    }
                                } else if ((objLJ2 instanceof String) && List.class.isAssignableFrom(Boolean.class)) {
                                    objLJ2 = C14P7.LJJ((String) objLJ2);
                                }
                            }
                            if (!(objLJ2 instanceof Boolean)) {
                                objLJ2 = null;
                            }
                            Boolean bool = (Boolean) objLJ2;
                            boolValueOf = bool != null ? Boolean.valueOf(bool.booleanValue()) : null;
                            String str4 = nimbleViewProps.weakStyle;
                            Object objLJ3 = str4 != null ? LJ(str4) : null;
                            if (Boolean.class == Double.class) {
                                objLJ3 = C20252814Mk.LIZ(objLJ3);
                            } else if (Boolean.class == Float.class) {
                                objLJ3 = C20252814Mk.LIZIZ(objLJ3);
                            } else if (Boolean.class == Integer.class) {
                                objLJ3 = C20252814Mk.LIZJ(objLJ3);
                            } else if (Boolean.class == Long.class) {
                                objLJ3 = C20252814Mk.LIZLLL(objLJ3);
                            } else if (Boolean.class == String.class) {
                                objLJ3 = objLJ3 != null ? objLJ3.toString() : null;
                            } else if (Boolean.class != String.class && Boolean.class != Map.class) {
                                if ((objLJ3 instanceof Map) && !Map.class.isAssignableFrom(Boolean.class)) {
                                    try {
                                        C1227904rF.LIZ.getClass();
                                        Gson gsonLIZLLL5 = C1227904rF.LIZLLL();
                                        objLJ3 = gsonLIZLLL5.LIZJ(gsonLIZLLL5.LJIJJLI(objLJ3), Boolean.class);
                                    } catch (Exception e6) {
                                        TryCatchGuardChecker.doCheck(e6);
                                    }
                                } else if (objLJ3 instanceof List) {
                                    try {
                                        Type type3 = new TypeToken<Boolean>() { // from class: X.14OX
                                        }.getType();
                                        if (List.class.isAssignableFrom(Boolean.class)) {
                                            C1227904rF.LIZ.getClass();
                                            Gson gsonLIZLLL6 = C1227904rF.LIZLLL();
                                            objLJ3 = gsonLIZLLL6.LIZLLL(gsonLIZLLL6.LJIJJLI(objLJ3), type3);
                                        }
                                    } catch (Exception e7) {
                                        TryCatchGuardChecker.doCheck(e7);
                                    }
                                } else if ((objLJ3 instanceof String) && List.class.isAssignableFrom(Boolean.class)) {
                                    objLJ3 = C14P7.LJJ((String) objLJ3);
                                }
                            }
                            if (!(objLJ3 instanceof Boolean)) {
                                objLJ3 = null;
                            }
                            Boolean bool2 = (Boolean) objLJ3;
                            if (bool2 != null) {
                                bool2.booleanValue();
                            }
                            String str5 = nimbleViewProps.messageId;
                            Object objLJ4 = str5 != null ? LJ(str5) : null;
                            if (String.class == Double.class) {
                                objLJ4 = C20252814Mk.LIZ(objLJ4);
                            } else if (String.class == Float.class) {
                                objLJ4 = C20252814Mk.LIZIZ(objLJ4);
                            } else if (String.class == Integer.class) {
                                objLJ4 = C20252814Mk.LIZJ(objLJ4);
                            } else if (String.class == Long.class) {
                                objLJ4 = C20252814Mk.LIZLLL(objLJ4);
                            } else if (String.class == String.class) {
                                objLJ4 = objLJ4 != null ? objLJ4.toString() : null;
                            } else if (String.class != String.class && String.class != Map.class) {
                                if ((objLJ4 instanceof Map) && !Map.class.isAssignableFrom(String.class)) {
                                    try {
                                        C1227904rF.LIZ.getClass();
                                        Gson gsonLIZLLL7 = C1227904rF.LIZLLL();
                                        objLJ4 = gsonLIZLLL7.LIZJ(gsonLIZLLL7.LJIJJLI(objLJ4), String.class);
                                    } catch (Exception e8) {
                                        TryCatchGuardChecker.doCheck(e8);
                                    }
                                } else if (objLJ4 instanceof List) {
                                    try {
                                        Type type4 = new TypeToken<String>() { // from class: X.14OY
                                        }.getType();
                                        if (List.class.isAssignableFrom(String.class)) {
                                            C1227904rF.LIZ.getClass();
                                            Gson gsonLIZLLL8 = C1227904rF.LIZLLL();
                                            objLJ4 = gsonLIZLLL8.LIZLLL(gsonLIZLLL8.LJIJJLI(objLJ4), type4);
                                        }
                                    } catch (Exception e9) {
                                        TryCatchGuardChecker.doCheck(e9);
                                    }
                                } else if ((objLJ4 instanceof String) && List.class.isAssignableFrom(String.class)) {
                                    objLJ4 = C14P7.LJJ((String) objLJ4);
                                }
                            }
                            if (!(objLJ4 instanceof String)) {
                                objLJ4 = null;
                            }
                            str = (String) objLJ4;
                            if (str == null) {
                                str = null;
                            }
                            String str6 = nimbleViewProps.startSpacing;
                            Object objLJ5 = str6 != null ? LJ(str6) : null;
                            if (Integer.class == Double.class) {
                                objLJ5 = C20252814Mk.LIZ(objLJ5);
                            } else if (Integer.class == Float.class) {
                                objLJ5 = C20252814Mk.LIZIZ(objLJ5);
                            } else if (Integer.class == Integer.class) {
                                objLJ5 = C20252814Mk.LIZJ(objLJ5);
                            } else if (Integer.class == Long.class) {
                                objLJ5 = C20252814Mk.LIZLLL(objLJ5);
                            } else if (Integer.class == String.class) {
                                objLJ5 = objLJ5 != null ? objLJ5.toString() : null;
                            } else if (Integer.class != String.class && Integer.class != Map.class) {
                                if ((objLJ5 instanceof Map) && !Map.class.isAssignableFrom(Integer.class)) {
                                    try {
                                        C1227904rF.LIZ.getClass();
                                        Gson gsonLIZLLL9 = C1227904rF.LIZLLL();
                                        objLJ5 = gsonLIZLLL9.LIZJ(gsonLIZLLL9.LJIJJLI(objLJ5), Integer.class);
                                    } catch (Exception e10) {
                                        TryCatchGuardChecker.doCheck(e10);
                                    }
                                } else if (objLJ5 instanceof List) {
                                    try {
                                        Type type5 = new TypeToken<Integer>() { // from class: X.14OZ
                                        }.getType();
                                        if (List.class.isAssignableFrom(Integer.class)) {
                                            C1227904rF.LIZ.getClass();
                                            Gson gsonLIZLLL10 = C1227904rF.LIZLLL();
                                            objLJ5 = gsonLIZLLL10.LIZLLL(gsonLIZLLL10.LJIJJLI(objLJ5), type5);
                                        }
                                    } catch (Exception e11) {
                                        TryCatchGuardChecker.doCheck(e11);
                                    }
                                } else if ((objLJ5 instanceof String) && List.class.isAssignableFrom(Integer.class)) {
                                    objLJ5 = C14P7.LJJ((String) objLJ5);
                                }
                            }
                            if (!(objLJ5 instanceof Integer)) {
                                objLJ5 = null;
                            }
                            Integer num = (Integer) objLJ5;
                            if (num != null) {
                                numValueOf = Integer.valueOf(num.intValue());
                            }
                        }
                        return new C1860960yWk(list, iNimbleVideoListDependAbility, str, this, numValueOf, boolValueOf);
                    }

                    @Override // X.AbstractC20257014Oa
                    public final Function0<ReusedUIAssem<?>> LJJIIZ() {
                        return AFwS216S0000000_27.get$arr$(324);
                    }

                    @Override // X.C14NT
                    public final View LJJIII(Context context2) {
                        FrameLayout frameLayout = new FrameLayout(context2);
                        frameLayout.setId(View.generateViewId());
                        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -2));
                        return frameLayout;
                    }
                };
            }
        }));
        this.LIZIZ = copyOnWriteArrayList;
        CopyOnWriteArrayList<C14NJ> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList2.addAll(C1697810uHb.LJIIJJI(new C14NJ() { // from class: X.14NC
            @Override // X.C14NJ
            public final String getName() {
                return "set";
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r8v0, types: [X.13BV] */
            /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
            @Override // X.C14NJ
            public final void LIZ(Map<String, ? extends Object> map, C14NX c14nx, Map<String, ? extends Object> map2, C14NF c14nf) {
                String string;
                Object objLJ;
                ?? arrayList;
                List<C14ND> list;
                String str;
                Object obj;
                Object obj2;
                Object objLJ2;
                if (map == null || (obj2 = map.get("path")) == null || (objLJ2 = c14nx.LJ(obj2)) == null || (string = objLJ2.toString()) == null) {
                    string = "";
                }
                Map<String, Object> mapKD2 = null;
                if (map != null && (obj = map.get("value")) != null) {
                    objLJ = c14nx.LJ(obj);
                } else {
                    objLJ = null;
                }
                if (c14nf != null && (list = c14nf.LIZ) != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    for (C14ND c14nd : list) {
                        LoopVariables loopVariables = c14nd.LIZIZ;
                        if (loopVariables != null) {
                            str = loopVariables.indexKey;
                        } else {
                            str = null;
                        }
                        arrayList.add(new Pair(str, Integer.valueOf(c14nd.LIZ)));
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
                INimbleModelAbility iNimbleModelAbility = (INimbleModelAbility) C1558520qew.LIZ(c14nx.LIZIZ(), INimbleModelAbility.class, null);
                if (iNimbleModelAbility != null) {
                    mapKD2 = iNimbleModelAbility.KD2();
                }
                C0R2D.LIZ(string, mapKD2, arrayList, objLJ);
            }
        }, new C0R26(), new C14NJ() { // from class: X.0R28
            @Override // X.C14NJ
            public final String getName() {
                return "refresh";
            }

            @Override // X.C14NJ
            public final void LIZ(Map<String, ? extends Object> map, C14NX c14nx, Map<String, ? extends Object> map2, C14NF c14nf) {
                String strLJIJJ;
                String str;
                Object obj = null;
                if (map != null) {
                    obj = map.get("nodeId");
                }
                if (!(obj instanceof String) || (str = (String) obj) == null || (strLJIJJ = c14nx.LJIJJ(str)) == null) {
                    strLJIJJ = "";
                }
                C328930Cux.LIZ(new ARunnableS15S1100000_10(c14nx, strLJIJJ, 8));
            }
        }, new C14N4()));
        this.LIZJ = copyOnWriteArrayList2;
    }
}
