package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.nimblecard.tako.model.Layout;
import com.ss.android.ugc.aweme.nimblecard.tako.model.NimbleViewProps;
import com.ss.android.ugc.aweme.nimblecard.tako.model.TemplateData;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.14RB, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14RB {
    public static final void LJII(C14NX c14nx, TemplateData templateData, boolean z) {
        NimbleViewProps nimbleViewProps;
        View view;
        if (templateData == null || (nimbleViewProps = templateData.props) == null) {
            return;
        }
        Layout layout = templateData.layout;
        if (c14nx == null || (view = c14nx.getView()) == null) {
            return;
        }
        if (LJFF(templateData)) {
            C14RC c14rc = new C14RC();
            String str = nimbleViewProps.corners;
            Object objLJ = str != null ? c14nx.LJ(str) : null;
            if (Float.class == Double.class) {
                objLJ = C20252814Mk.LIZ(objLJ);
            } else if (Float.class == Float.class) {
                objLJ = C20252814Mk.LIZIZ(objLJ);
            } else if (Float.class == Integer.class) {
                objLJ = C20252814Mk.LIZJ(objLJ);
            } else if (Float.class == Long.class) {
                objLJ = C20252814Mk.LIZLLL(objLJ);
            } else if (Float.class == String.class) {
                objLJ = objLJ != null ? objLJ.toString() : null;
            } else if (Float.class != String.class && Float.class != Map.class) {
                if ((objLJ instanceof Map) && !Map.class.isAssignableFrom(Float.class)) {
                    try {
                        C20266914Rv.LIZ().getClass();
                        Gson gsonLIZLLL = C1227904rF.LIZLLL();
                        objLJ = gsonLIZLLL.LIZJ(gsonLIZLLL.LJIJJLI(objLJ), Float.class);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C786410Ut5.v3();
                    }
                } else if (objLJ instanceof List) {
                    try {
                        Type type = new TypeToken<Float>() { // from class: X.14RJ
                        }.getType();
                        if (List.class.isAssignableFrom(Float.class)) {
                            C20266914Rv.LIZ().getClass();
                            Gson gsonLIZLLL2 = C1227904rF.LIZLLL();
                            objLJ = gsonLIZLLL2.LIZLLL(gsonLIZLLL2.LJIJJLI(objLJ), type);
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C786410Ut5.v3();
                    }
                } else if ((objLJ instanceof String) && List.class.isAssignableFrom(Float.class)) {
                    objLJ = C14P7.LJJ((String) objLJ);
                }
            }
            if (!(objLJ instanceof Float)) {
                objLJ = null;
            }
            Float f = (Float) objLJ;
            Object obj = c14nx.LIZLLL().get("corner");
            if (!(obj instanceof Float)) {
                obj = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateCacheIfNeeded: cachedValue = ");
            sbLIZ.append(obj);
            sbLIZ.append(", castValue = ");
            sbLIZ.append(f);
            C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateCacheIfNeeded: isInitializing = ");
            sbLIZ2.append(z);
            sbLIZ2.append(" !cachedValue.deepEquals(castValue):");
            sbLIZ2.append(!C14P7.LIZ(obj, f));
            C2188811AlT.LIZIZ(sbLIZ2);
            boolean z2 = false;
            if (!C14P7.LIZ(obj, f)) {
                if (f != null) {
                    float fFloatValue = f.floatValue();
                    c14rc.LJFF = Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(fFloatValue)));
                    c14rc.LJI = Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(fFloatValue)));
                    c14rc.LJII = Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(fFloatValue)));
                    c14rc.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(fFloatValue)));
                    z2 = true;
                }
                c14nx.LIZLLL().put("corner", f);
            } else if (z && f != null) {
                float fFloatValue2 = f.floatValue();
                c14rc.LJFF = Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(fFloatValue2)));
                c14rc.LJI = Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(fFloatValue2)));
                c14rc.LJII = Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(fFloatValue2)));
                c14rc.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(fFloatValue2)));
                z2 = true;
            }
            String str2 = nimbleViewProps.cornersTopLeft;
            Object objLJ2 = str2 != null ? c14nx.LJ(str2) : null;
            if (Float.class == Double.class) {
                objLJ2 = C20252814Mk.LIZ(objLJ2);
            } else if (Float.class == Float.class) {
                objLJ2 = C20252814Mk.LIZIZ(objLJ2);
            } else if (Float.class == Integer.class) {
                objLJ2 = C20252814Mk.LIZJ(objLJ2);
            } else if (Float.class == Long.class) {
                objLJ2 = C20252814Mk.LIZLLL(objLJ2);
            } else if (Float.class == String.class) {
                objLJ2 = objLJ2 != null ? objLJ2.toString() : null;
            } else if (Float.class != String.class && Float.class != Map.class) {
                if ((objLJ2 instanceof Map) && !Map.class.isAssignableFrom(Float.class)) {
                    try {
                        C20266914Rv.LIZ().getClass();
                        Gson gsonLIZLLL3 = C1227904rF.LIZLLL();
                        objLJ2 = gsonLIZLLL3.LIZJ(gsonLIZLLL3.LJIJJLI(objLJ2), Float.class);
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        C786410Ut5.v3();
                    }
                } else if (objLJ2 instanceof List) {
                    try {
                        Type type2 = new TypeToken<Float>() { // from class: X.14RK
                        }.getType();
                        if (List.class.isAssignableFrom(Float.class)) {
                            C20266914Rv.LIZ().getClass();
                            Gson gsonLIZLLL4 = C1227904rF.LIZLLL();
                            objLJ2 = gsonLIZLLL4.LIZLLL(gsonLIZLLL4.LJIJJLI(objLJ2), type2);
                        }
                    } catch (Exception e4) {
                        TryCatchGuardChecker.doCheck(e4);
                        C786410Ut5.v3();
                    }
                } else if ((objLJ2 instanceof String) && List.class.isAssignableFrom(Float.class)) {
                    objLJ2 = C14P7.LJJ((String) objLJ2);
                }
            }
            if (!(objLJ2 instanceof Float)) {
                objLJ2 = null;
            }
            Float f2 = (Float) objLJ2;
            Object obj2 = c14nx.LIZLLL().get("cornerTopLeft");
            if (!(obj2 instanceof Float)) {
                obj2 = null;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("updateCacheIfNeeded: cachedValue = ");
            sbLIZ3.append(obj2);
            sbLIZ3.append(", castValue = ");
            sbLIZ3.append(f2);
            C2188811AlT.LIZIZ(sbLIZ3);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("updateCacheIfNeeded: isInitializing = ");
            sbLIZ4.append(z);
            sbLIZ4.append(" !cachedValue.deepEquals(castValue):");
            sbLIZ4.append(!C14P7.LIZ(obj2, f2));
            C2188811AlT.LIZIZ(sbLIZ4);
            if (!C14P7.LIZ(obj2, f2)) {
                if (f2 != null) {
                    c14rc.LJFF = Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(f2.floatValue())));
                    z2 = true;
                }
                c14nx.LIZLLL().put("cornerTopLeft", f2);
            } else if (z && f2 != null) {
                c14rc.LJFF = Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(f2.floatValue())));
                z2 = true;
            }
            String str3 = nimbleViewProps.cornersTopRight;
            Object objLJ3 = str3 != null ? c14nx.LJ(str3) : null;
            if (Float.class == Double.class) {
                objLJ3 = C20252814Mk.LIZ(objLJ3);
            } else if (Float.class == Float.class) {
                objLJ3 = C20252814Mk.LIZIZ(objLJ3);
            } else if (Float.class == Integer.class) {
                objLJ3 = C20252814Mk.LIZJ(objLJ3);
            } else if (Float.class == Long.class) {
                objLJ3 = C20252814Mk.LIZLLL(objLJ3);
            } else if (Float.class == String.class) {
                objLJ3 = objLJ3 != null ? objLJ3.toString() : null;
            } else if (Float.class != String.class && Float.class != Map.class) {
                if ((objLJ3 instanceof Map) && !Map.class.isAssignableFrom(Float.class)) {
                    try {
                        C20266914Rv.LIZ().getClass();
                        Gson gsonLIZLLL5 = C1227904rF.LIZLLL();
                        objLJ3 = gsonLIZLLL5.LIZJ(gsonLIZLLL5.LJIJJLI(objLJ3), Float.class);
                    } catch (Exception e5) {
                        TryCatchGuardChecker.doCheck(e5);
                        C786410Ut5.v3();
                    }
                } else if (objLJ3 instanceof List) {
                    try {
                        Type type3 = new TypeToken<Float>() { // from class: X.14RL
                        }.getType();
                        if (List.class.isAssignableFrom(Float.class)) {
                            C20266914Rv.LIZ().getClass();
                            Gson gsonLIZLLL6 = C1227904rF.LIZLLL();
                            objLJ3 = gsonLIZLLL6.LIZLLL(gsonLIZLLL6.LJIJJLI(objLJ3), type3);
                        }
                    } catch (Exception e6) {
                        TryCatchGuardChecker.doCheck(e6);
                        C786410Ut5.v3();
                    }
                } else if ((objLJ3 instanceof String) && List.class.isAssignableFrom(Float.class)) {
                    objLJ3 = C14P7.LJJ((String) objLJ3);
                }
            }
            if (!(objLJ3 instanceof Float)) {
                objLJ3 = null;
            }
            Float f3 = (Float) objLJ3;
            Object obj3 = c14nx.LIZLLL().get("cornerTopRight");
            if (!(obj3 instanceof Float)) {
                obj3 = null;
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("updateCacheIfNeeded: cachedValue = ");
            sbLIZ5.append(obj3);
            sbLIZ5.append(", castValue = ");
            sbLIZ5.append(f3);
            C2188811AlT.LIZIZ(sbLIZ5);
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("updateCacheIfNeeded: isInitializing = ");
            sbLIZ6.append(z);
            sbLIZ6.append(" !cachedValue.deepEquals(castValue):");
            sbLIZ6.append(!C14P7.LIZ(obj3, f3));
            C2188811AlT.LIZIZ(sbLIZ6);
            if (!C14P7.LIZ(obj3, f3)) {
                if (f3 != null) {
                    c14rc.LJI = Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(f3.floatValue())));
                    z2 = true;
                }
                c14nx.LIZLLL().put("cornerTopRight", f3);
            } else if (z && f3 != null) {
                c14rc.LJI = Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(f3.floatValue())));
                z2 = true;
            }
            String str4 = nimbleViewProps.cornersBottomLeft;
            Object objLJ4 = str4 != null ? c14nx.LJ(str4) : null;
            if (Float.class == Double.class) {
                objLJ4 = C20252814Mk.LIZ(objLJ4);
            } else if (Float.class == Float.class) {
                objLJ4 = C20252814Mk.LIZIZ(objLJ4);
            } else if (Float.class == Integer.class) {
                objLJ4 = C20252814Mk.LIZJ(objLJ4);
            } else if (Float.class == Long.class) {
                objLJ4 = C20252814Mk.LIZLLL(objLJ4);
            } else if (Float.class == String.class) {
                objLJ4 = objLJ4 != null ? objLJ4.toString() : null;
            } else if (Float.class != String.class && Float.class != Map.class) {
                if ((objLJ4 instanceof Map) && !Map.class.isAssignableFrom(Float.class)) {
                    try {
                        C20266914Rv.LIZ().getClass();
                        Gson gsonLIZLLL7 = C1227904rF.LIZLLL();
                        objLJ4 = gsonLIZLLL7.LIZJ(gsonLIZLLL7.LJIJJLI(objLJ4), Float.class);
                    } catch (Exception e7) {
                        TryCatchGuardChecker.doCheck(e7);
                        C786410Ut5.v3();
                    }
                } else if (objLJ4 instanceof List) {
                    try {
                        Type type4 = new TypeToken<Float>() { // from class: X.14RM
                        }.getType();
                        if (List.class.isAssignableFrom(Float.class)) {
                            C20266914Rv.LIZ().getClass();
                            Gson gsonLIZLLL8 = C1227904rF.LIZLLL();
                            objLJ4 = gsonLIZLLL8.LIZLLL(gsonLIZLLL8.LJIJJLI(objLJ4), type4);
                        }
                    } catch (Exception e8) {
                        TryCatchGuardChecker.doCheck(e8);
                        C786410Ut5.v3();
                    }
                } else if ((objLJ4 instanceof String) && List.class.isAssignableFrom(Float.class)) {
                    objLJ4 = C14P7.LJJ((String) objLJ4);
                }
            }
            if (!(objLJ4 instanceof Float)) {
                objLJ4 = null;
            }
            Float f4 = (Float) objLJ4;
            Object obj4 = c14nx.LIZLLL().get("cornerBottomLeft");
            if (!(obj4 instanceof Float)) {
                obj4 = null;
            }
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("updateCacheIfNeeded: cachedValue = ");
            sbLIZ7.append(obj4);
            sbLIZ7.append(", castValue = ");
            sbLIZ7.append(f4);
            C2188811AlT.LIZIZ(sbLIZ7);
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("updateCacheIfNeeded: isInitializing = ");
            sbLIZ8.append(z);
            sbLIZ8.append(" !cachedValue.deepEquals(castValue):");
            sbLIZ8.append(!C14P7.LIZ(obj4, f4));
            C2188811AlT.LIZIZ(sbLIZ8);
            if (!C14P7.LIZ(obj4, f4)) {
                if (f4 != null) {
                    c14rc.LJII = Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(f4.floatValue())));
                    z2 = true;
                }
                c14nx.LIZLLL().put("cornerBottomLeft", f4);
            } else if (z && f4 != null) {
                c14rc.LJII = Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(f4.floatValue())));
                z2 = true;
            }
            String str5 = nimbleViewProps.cornersBottomRight;
            Object objLJ5 = str5 != null ? c14nx.LJ(str5) : null;
            if (Float.class == Double.class) {
                objLJ5 = C20252814Mk.LIZ(objLJ5);
            } else if (Float.class == Float.class) {
                objLJ5 = C20252814Mk.LIZIZ(objLJ5);
            } else if (Float.class == Integer.class) {
                objLJ5 = C20252814Mk.LIZJ(objLJ5);
            } else if (Float.class == Long.class) {
                objLJ5 = C20252814Mk.LIZLLL(objLJ5);
            } else if (Float.class == String.class) {
                objLJ5 = objLJ5 != null ? objLJ5.toString() : null;
            } else if (Float.class != String.class && Float.class != Map.class) {
                if ((objLJ5 instanceof Map) && !Map.class.isAssignableFrom(Float.class)) {
                    try {
                        C20266914Rv.LIZ().getClass();
                        Gson gsonLIZLLL9 = C1227904rF.LIZLLL();
                        objLJ5 = gsonLIZLLL9.LIZJ(gsonLIZLLL9.LJIJJLI(objLJ5), Float.class);
                    } catch (Exception e9) {
                        TryCatchGuardChecker.doCheck(e9);
                        C786410Ut5.v3();
                    }
                } else if (objLJ5 instanceof List) {
                    try {
                        Type type5 = new TypeToken<Float>() { // from class: X.14RN
                        }.getType();
                        if (List.class.isAssignableFrom(Float.class)) {
                            C20266914Rv.LIZ().getClass();
                            Gson gsonLIZLLL10 = C1227904rF.LIZLLL();
                            objLJ5 = gsonLIZLLL10.LIZLLL(gsonLIZLLL10.LJIJJLI(objLJ5), type5);
                        }
                    } catch (Exception e10) {
                        TryCatchGuardChecker.doCheck(e10);
                        C786410Ut5.v3();
                    }
                } else if ((objLJ5 instanceof String) && List.class.isAssignableFrom(Float.class)) {
                    objLJ5 = C14P7.LJJ((String) objLJ5);
                }
            }
            if (!(objLJ5 instanceof Float)) {
                objLJ5 = null;
            }
            Float f5 = (Float) objLJ5;
            Object obj5 = c14nx.LIZLLL().get("cornerBottomRight");
            if (!(obj5 instanceof Float)) {
                obj5 = null;
            }
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append("updateCacheIfNeeded: cachedValue = ");
            sbLIZ9.append(obj5);
            sbLIZ9.append(", castValue = ");
            sbLIZ9.append(f5);
            C2188811AlT.LIZIZ(sbLIZ9);
            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
            sbLIZ10.append("updateCacheIfNeeded: isInitializing = ");
            sbLIZ10.append(z);
            sbLIZ10.append(" !cachedValue.deepEquals(castValue):");
            sbLIZ10.append(!C14P7.LIZ(obj5, f5));
            C2188811AlT.LIZIZ(sbLIZ10);
            if (!C14P7.LIZ(obj5, f5)) {
                if (f5 != null) {
                    c14rc.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(f5.floatValue())));
                    z2 = true;
                }
                c14nx.LIZLLL().put("cornerBottomRight", f5);
            } else if (z && f5 != null) {
                c14rc.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(f5.floatValue())));
                z2 = true;
            }
            String str6 = nimbleViewProps.backgroundColor;
            Object objLJ6 = str6 != null ? c14nx.LJ(str6) : null;
            if (Integer.class == Double.class) {
                objLJ6 = C20252814Mk.LIZ(objLJ6);
            } else if (Integer.class == Float.class) {
                objLJ6 = C20252814Mk.LIZIZ(objLJ6);
            } else if (Integer.class == Integer.class) {
                objLJ6 = C20252814Mk.LIZJ(objLJ6);
            } else if (Integer.class == Long.class) {
                objLJ6 = C20252814Mk.LIZLLL(objLJ6);
            } else if (Integer.class == String.class) {
                objLJ6 = objLJ6 != null ? objLJ6.toString() : null;
            } else if (Integer.class != String.class && Integer.class != Map.class) {
                if ((objLJ6 instanceof Map) && !Map.class.isAssignableFrom(Integer.class)) {
                    try {
                        C20266914Rv.LIZ().getClass();
                        Gson gsonLIZLLL11 = C1227904rF.LIZLLL();
                        objLJ6 = gsonLIZLLL11.LIZJ(gsonLIZLLL11.LJIJJLI(objLJ6), Integer.class);
                    } catch (Exception e11) {
                        TryCatchGuardChecker.doCheck(e11);
                        C786410Ut5.v3();
                    }
                } else if (objLJ6 instanceof List) {
                    try {
                        Type type6 = new TypeToken<Integer>() { // from class: X.14RO
                        }.getType();
                        if (List.class.isAssignableFrom(Integer.class)) {
                            C20266914Rv.LIZ().getClass();
                            Gson gsonLIZLLL12 = C1227904rF.LIZLLL();
                            objLJ6 = gsonLIZLLL12.LIZLLL(gsonLIZLLL12.LJIJJLI(objLJ6), type6);
                        }
                    } catch (Exception e12) {
                        TryCatchGuardChecker.doCheck(e12);
                        C786410Ut5.v3();
                    }
                } else if ((objLJ6 instanceof String) && List.class.isAssignableFrom(Integer.class)) {
                    objLJ6 = C14P7.LJJ((String) objLJ6);
                }
            }
            if (!(objLJ6 instanceof Integer)) {
                objLJ6 = null;
            }
            Integer num = (Integer) objLJ6;
            Object obj6 = c14nx.LIZLLL().get("backgroundColor");
            if (!(obj6 instanceof Integer)) {
                obj6 = null;
            }
            StringBuilder sbLIZ11 = C2188811AlT.LIZ();
            sbLIZ11.append("updateCacheIfNeeded: cachedValue = ");
            sbLIZ11.append(obj6);
            sbLIZ11.append(", castValue = ");
            sbLIZ11.append(num);
            C2188811AlT.LIZIZ(sbLIZ11);
            StringBuilder sbLIZ12 = C2188811AlT.LIZ();
            sbLIZ12.append("updateCacheIfNeeded: isInitializing = ");
            sbLIZ12.append(z);
            sbLIZ12.append(" !cachedValue.deepEquals(castValue):");
            sbLIZ12.append(!C14P7.LIZ(obj6, num));
            C2188811AlT.LIZIZ(sbLIZ12);
            if (!C14P7.LIZ(obj6, num)) {
                if (num != null) {
                    c14rc.LIZ = Integer.valueOf(num.intValue());
                    z2 = true;
                }
                c14nx.LIZLLL().put("backgroundColor", num);
            } else if (z && num != null) {
                c14rc.LIZ = Integer.valueOf(num.intValue());
                z2 = true;
            }
            String str7 = nimbleViewProps.borderColor;
            Object objLJ7 = str7 != null ? c14nx.LJ(str7) : null;
            if (Integer.class == Double.class) {
                objLJ7 = C20252814Mk.LIZ(objLJ7);
            } else if (Integer.class == Float.class) {
                objLJ7 = C20252814Mk.LIZIZ(objLJ7);
            } else if (Integer.class == Integer.class) {
                objLJ7 = C20252814Mk.LIZJ(objLJ7);
            } else if (Integer.class == Long.class) {
                objLJ7 = C20252814Mk.LIZLLL(objLJ7);
            } else if (Integer.class == String.class) {
                objLJ7 = objLJ7 != null ? objLJ7.toString() : null;
            } else if (Integer.class != String.class && Integer.class != Map.class) {
                if ((objLJ7 instanceof Map) && !Map.class.isAssignableFrom(Integer.class)) {
                    try {
                        C20266914Rv.LIZ().getClass();
                        Gson gsonLIZLLL13 = C1227904rF.LIZLLL();
                        objLJ7 = gsonLIZLLL13.LIZJ(gsonLIZLLL13.LJIJJLI(objLJ7), Integer.class);
                    } catch (Exception e13) {
                        TryCatchGuardChecker.doCheck(e13);
                        C786410Ut5.v3();
                    }
                } else if (objLJ7 instanceof List) {
                    try {
                        Type type7 = new TypeToken<Integer>() { // from class: X.14RP
                        }.getType();
                        if (List.class.isAssignableFrom(Integer.class)) {
                            C20266914Rv.LIZ().getClass();
                            Gson gsonLIZLLL14 = C1227904rF.LIZLLL();
                            objLJ7 = gsonLIZLLL14.LIZLLL(gsonLIZLLL14.LJIJJLI(objLJ7), type7);
                        }
                    } catch (Exception e14) {
                        TryCatchGuardChecker.doCheck(e14);
                        C786410Ut5.v3();
                    }
                } else if ((objLJ7 instanceof String) && List.class.isAssignableFrom(Integer.class)) {
                    objLJ7 = C14P7.LJJ((String) objLJ7);
                }
            }
            if (!(objLJ7 instanceof Integer)) {
                objLJ7 = null;
            }
            Integer num2 = (Integer) objLJ7;
            Object obj7 = c14nx.LIZLLL().get("borderColor");
            if (!(obj7 instanceof Integer)) {
                obj7 = null;
            }
            StringBuilder sbLIZ13 = C2188811AlT.LIZ();
            sbLIZ13.append("updateCacheIfNeeded: cachedValue = ");
            sbLIZ13.append(obj7);
            sbLIZ13.append(", castValue = ");
            sbLIZ13.append(num2);
            C2188811AlT.LIZIZ(sbLIZ13);
            StringBuilder sbLIZ14 = C2188811AlT.LIZ();
            sbLIZ14.append("updateCacheIfNeeded: isInitializing = ");
            sbLIZ14.append(z);
            sbLIZ14.append(" !cachedValue.deepEquals(castValue):");
            sbLIZ14.append(!C14P7.LIZ(obj7, num2));
            C2188811AlT.LIZIZ(sbLIZ14);
            if (!C14P7.LIZ(obj7, num2)) {
                if (num2 != null) {
                    c14rc.LIZJ = Integer.valueOf(num2.intValue());
                    z2 = true;
                }
                c14nx.LIZLLL().put("borderColor", num2);
            } else if (z && num2 != null) {
                c14rc.LIZJ = Integer.valueOf(num2.intValue());
                z2 = true;
            }
            String str8 = layout.border;
            Object objLJ8 = str8 != null ? c14nx.LJ(str8) : null;
            if (Float.class == Double.class) {
                objLJ8 = C20252814Mk.LIZ(objLJ8);
            } else if (Float.class == Float.class) {
                objLJ8 = C20252814Mk.LIZIZ(objLJ8);
            } else if (Float.class == Integer.class) {
                objLJ8 = C20252814Mk.LIZJ(objLJ8);
            } else if (Float.class == Long.class) {
                objLJ8 = C20252814Mk.LIZLLL(objLJ8);
            } else if (Float.class == String.class) {
                objLJ8 = objLJ8 != null ? objLJ8.toString() : null;
            } else if (Float.class != String.class && Float.class != Map.class) {
                if ((objLJ8 instanceof Map) && !Map.class.isAssignableFrom(Float.class)) {
                    try {
                        C20266914Rv.LIZ().getClass();
                        Gson gsonLIZLLL15 = C1227904rF.LIZLLL();
                        objLJ8 = gsonLIZLLL15.LIZJ(gsonLIZLLL15.LJIJJLI(objLJ8), Float.class);
                    } catch (Exception e15) {
                        TryCatchGuardChecker.doCheck(e15);
                        C786410Ut5.v3();
                    }
                } else if (objLJ8 instanceof List) {
                    try {
                        Type type8 = new TypeToken<Float>() { // from class: X.14RQ
                        }.getType();
                        if (List.class.isAssignableFrom(Float.class)) {
                            C20266914Rv.LIZ().getClass();
                            Gson gsonLIZLLL16 = C1227904rF.LIZLLL();
                            objLJ8 = gsonLIZLLL16.LIZLLL(gsonLIZLLL16.LJIJJLI(objLJ8), type8);
                        }
                    } catch (Exception e16) {
                        TryCatchGuardChecker.doCheck(e16);
                        C786410Ut5.v3();
                    }
                } else if ((objLJ8 instanceof String) && List.class.isAssignableFrom(Float.class)) {
                    objLJ8 = C14P7.LJJ((String) objLJ8);
                }
            }
            if (!(objLJ8 instanceof Float)) {
                objLJ8 = null;
            }
            Float f6 = (Float) objLJ8;
            Object obj8 = c14nx.LIZLLL().get("borderWidth_2");
            if (!(obj8 instanceof Float)) {
                obj8 = null;
            }
            StringBuilder sbLIZ15 = C2188811AlT.LIZ();
            sbLIZ15.append("updateCacheIfNeeded: cachedValue = ");
            sbLIZ15.append(obj8);
            sbLIZ15.append(", castValue = ");
            sbLIZ15.append(f6);
            C2188811AlT.LIZIZ(sbLIZ15);
            StringBuilder sbLIZ16 = C2188811AlT.LIZ();
            sbLIZ16.append("updateCacheIfNeeded: isInitializing = ");
            sbLIZ16.append(z);
            sbLIZ16.append(" !cachedValue.deepEquals(castValue):");
            sbLIZ16.append(!C14P7.LIZ(obj8, f6));
            C2188811AlT.LIZIZ(sbLIZ16);
            if (!C14P7.LIZ(obj8, f6)) {
                if (f6 != null) {
                    c14rc.LIZIZ = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f6.floatValue()))));
                    z2 = true;
                }
                c14nx.LIZLLL().put("borderWidth_2", f6);
            } else if (z && f6 != null) {
                c14rc.LIZIZ = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f6.floatValue()))));
                z2 = true;
            }
            String str9 = layout.borderBottomWidth;
            Object objLJ9 = str9 != null ? c14nx.LJ(str9) : null;
            if (Float.class == Double.class) {
                objLJ9 = C20252814Mk.LIZ(objLJ9);
            } else if (Float.class == Float.class) {
                objLJ9 = C20252814Mk.LIZIZ(objLJ9);
            } else if (Float.class == Integer.class) {
                objLJ9 = C20252814Mk.LIZJ(objLJ9);
            } else if (Float.class == Long.class) {
                objLJ9 = C20252814Mk.LIZLLL(objLJ9);
            } else if (Float.class == String.class) {
                objLJ9 = objLJ9 != null ? objLJ9.toString() : null;
            } else if (Float.class != String.class && Float.class != Map.class) {
                if ((objLJ9 instanceof Map) && !Map.class.isAssignableFrom(Float.class)) {
                    try {
                        C20266914Rv.LIZ().getClass();
                        Gson gsonLIZLLL17 = C1227904rF.LIZLLL();
                        objLJ9 = gsonLIZLLL17.LIZJ(gsonLIZLLL17.LJIJJLI(objLJ9), Float.class);
                    } catch (Exception e17) {
                        TryCatchGuardChecker.doCheck(e17);
                        C786410Ut5.v3();
                    }
                } else if (objLJ9 instanceof List) {
                    try {
                        Type type9 = new TypeToken<Float>() { // from class: X.14RR
                        }.getType();
                        if (List.class.isAssignableFrom(Float.class)) {
                            C20266914Rv.LIZ().getClass();
                            Gson gsonLIZLLL18 = C1227904rF.LIZLLL();
                            objLJ9 = gsonLIZLLL18.LIZLLL(gsonLIZLLL18.LJIJJLI(objLJ9), type9);
                        }
                    } catch (Exception e18) {
                        TryCatchGuardChecker.doCheck(e18);
                        C786410Ut5.v3();
                    }
                } else if ((objLJ9 instanceof String) && List.class.isAssignableFrom(Float.class)) {
                    objLJ9 = C14P7.LJJ((String) objLJ9);
                }
            }
            if (!(objLJ9 instanceof Float)) {
                objLJ9 = null;
            }
            Float f7 = (Float) objLJ9;
            Object obj9 = c14nx.LIZLLL().get("borderBottomWidth_2");
            if (!(obj9 instanceof Float)) {
                obj9 = null;
            }
            StringBuilder sbLIZ17 = C2188811AlT.LIZ();
            sbLIZ17.append("updateCacheIfNeeded: cachedValue = ");
            sbLIZ17.append(obj9);
            sbLIZ17.append(", castValue = ");
            sbLIZ17.append(f7);
            C2188811AlT.LIZIZ(sbLIZ17);
            StringBuilder sbLIZ18 = C2188811AlT.LIZ();
            sbLIZ18.append("updateCacheIfNeeded: isInitializing = ");
            sbLIZ18.append(z);
            sbLIZ18.append(" !cachedValue.deepEquals(castValue):");
            sbLIZ18.append(!C14P7.LIZ(obj9, f7));
            C2188811AlT.LIZIZ(sbLIZ18);
            if (!C14P7.LIZ(obj9, f7)) {
                if (f7 != null) {
                    c14rc.LJIIJ.put(EnumC1301750jyn.BOTTOM, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f7.floatValue())))));
                    z2 = true;
                }
                c14nx.LIZLLL().put("borderBottomWidth_2", f7);
            } else if (z && f7 != null) {
                c14rc.LJIIJ.put(EnumC1301750jyn.BOTTOM, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f7.floatValue())))));
                z2 = true;
            }
            String str10 = layout.borderRightWidth;
            Object objLJ10 = str10 != null ? c14nx.LJ(str10) : null;
            if (Float.class == Double.class) {
                objLJ10 = C20252814Mk.LIZ(objLJ10);
            } else if (Float.class == Float.class) {
                objLJ10 = C20252814Mk.LIZIZ(objLJ10);
            } else if (Float.class == Integer.class) {
                objLJ10 = C20252814Mk.LIZJ(objLJ10);
            } else if (Float.class == Long.class) {
                objLJ10 = C20252814Mk.LIZLLL(objLJ10);
            } else if (Float.class == String.class) {
                objLJ10 = objLJ10 != null ? objLJ10.toString() : null;
            } else if (Float.class != String.class && Float.class != Map.class) {
                if ((objLJ10 instanceof Map) && !Map.class.isAssignableFrom(Float.class)) {
                    try {
                        C20266914Rv.LIZ().getClass();
                        Gson gsonLIZLLL19 = C1227904rF.LIZLLL();
                        objLJ10 = gsonLIZLLL19.LIZJ(gsonLIZLLL19.LJIJJLI(objLJ10), Float.class);
                    } catch (Exception e19) {
                        TryCatchGuardChecker.doCheck(e19);
                        C786410Ut5.v3();
                    }
                } else if (objLJ10 instanceof List) {
                    try {
                        Type type10 = new TypeToken<Float>() { // from class: X.14RG
                        }.getType();
                        if (List.class.isAssignableFrom(Float.class)) {
                            C20266914Rv.LIZ().getClass();
                            Gson gsonLIZLLL20 = C1227904rF.LIZLLL();
                            objLJ10 = gsonLIZLLL20.LIZLLL(gsonLIZLLL20.LJIJJLI(objLJ10), type10);
                        }
                    } catch (Exception e20) {
                        TryCatchGuardChecker.doCheck(e20);
                        C786410Ut5.v3();
                    }
                } else if ((objLJ10 instanceof String) && List.class.isAssignableFrom(Float.class)) {
                    objLJ10 = C14P7.LJJ((String) objLJ10);
                }
            }
            if (!(objLJ10 instanceof Float)) {
                objLJ10 = null;
            }
            Float f8 = (Float) objLJ10;
            Object obj10 = c14nx.LIZLLL().get("borderRightWidth_2");
            if (!(obj10 instanceof Float)) {
                obj10 = null;
            }
            StringBuilder sbLIZ19 = C2188811AlT.LIZ();
            sbLIZ19.append("updateCacheIfNeeded: cachedValue = ");
            sbLIZ19.append(obj10);
            sbLIZ19.append(", castValue = ");
            sbLIZ19.append(f8);
            C2188811AlT.LIZIZ(sbLIZ19);
            StringBuilder sbLIZ20 = C2188811AlT.LIZ();
            sbLIZ20.append("updateCacheIfNeeded: isInitializing = ");
            sbLIZ20.append(z);
            sbLIZ20.append(" !cachedValue.deepEquals(castValue):");
            sbLIZ20.append(!C14P7.LIZ(obj10, f8));
            C2188811AlT.LIZIZ(sbLIZ20);
            if (!C14P7.LIZ(obj10, f8)) {
                if (f8 != null) {
                    c14rc.LJIIJ.put(EnumC1301750jyn.RIGHT, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f8.floatValue())))));
                    z2 = true;
                }
                c14nx.LIZLLL().put("borderRightWidth_2", f8);
            } else if (z && f8 != null) {
                c14rc.LJIIJ.put(EnumC1301750jyn.RIGHT, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f8.floatValue())))));
                z2 = true;
            }
            String str11 = layout.borderLeftWidth;
            Object objLJ11 = str11 != null ? c14nx.LJ(str11) : null;
            if (Float.class == Double.class) {
                objLJ11 = C20252814Mk.LIZ(objLJ11);
            } else if (Float.class == Float.class) {
                objLJ11 = C20252814Mk.LIZIZ(objLJ11);
            } else if (Float.class == Integer.class) {
                objLJ11 = C20252814Mk.LIZJ(objLJ11);
            } else if (Float.class == Long.class) {
                objLJ11 = C20252814Mk.LIZLLL(objLJ11);
            } else if (Float.class == String.class) {
                objLJ11 = objLJ11 != null ? objLJ11.toString() : null;
            } else if (Float.class != String.class && Float.class != Map.class) {
                if ((objLJ11 instanceof Map) && !Map.class.isAssignableFrom(Float.class)) {
                    try {
                        C20266914Rv.LIZ().getClass();
                        Gson gsonLIZLLL21 = C1227904rF.LIZLLL();
                        objLJ11 = gsonLIZLLL21.LIZJ(gsonLIZLLL21.LJIJJLI(objLJ11), Float.class);
                    } catch (Exception e21) {
                        TryCatchGuardChecker.doCheck(e21);
                        C786410Ut5.v3();
                    }
                } else if (objLJ11 instanceof List) {
                    try {
                        Type type11 = new TypeToken<Float>() { // from class: X.14RH
                        }.getType();
                        if (List.class.isAssignableFrom(Float.class)) {
                            C20266914Rv.LIZ().getClass();
                            Gson gsonLIZLLL22 = C1227904rF.LIZLLL();
                            objLJ11 = gsonLIZLLL22.LIZLLL(gsonLIZLLL22.LJIJJLI(objLJ11), type11);
                        }
                    } catch (Exception e22) {
                        TryCatchGuardChecker.doCheck(e22);
                        C786410Ut5.v3();
                    }
                } else if ((objLJ11 instanceof String) && List.class.isAssignableFrom(Float.class)) {
                    objLJ11 = C14P7.LJJ((String) objLJ11);
                }
            }
            if (!(objLJ11 instanceof Float)) {
                objLJ11 = null;
            }
            Float f9 = (Float) objLJ11;
            Object obj11 = c14nx.LIZLLL().get("borderLeftWidth_2");
            if (!(obj11 instanceof Float)) {
                obj11 = null;
            }
            StringBuilder sbLIZ21 = C2188811AlT.LIZ();
            sbLIZ21.append("updateCacheIfNeeded: cachedValue = ");
            sbLIZ21.append(obj11);
            sbLIZ21.append(", castValue = ");
            sbLIZ21.append(f9);
            C2188811AlT.LIZIZ(sbLIZ21);
            StringBuilder sbLIZ22 = C2188811AlT.LIZ();
            sbLIZ22.append("updateCacheIfNeeded: isInitializing = ");
            sbLIZ22.append(z);
            sbLIZ22.append(" !cachedValue.deepEquals(castValue):");
            sbLIZ22.append(!C14P7.LIZ(obj11, f9));
            C2188811AlT.LIZIZ(sbLIZ22);
            if (!C14P7.LIZ(obj11, f9)) {
                if (f9 != null) {
                    c14rc.LJIIJ.put(EnumC1301750jyn.LEFT, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f9.floatValue())))));
                    z2 = true;
                }
                c14nx.LIZLLL().put("borderLeftWidth_2", f9);
            } else if (z && f9 != null) {
                c14rc.LJIIJ.put(EnumC1301750jyn.LEFT, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f9.floatValue())))));
                z2 = true;
            }
            String str12 = layout.borderTopWidth;
            Object objLJ12 = str12 != null ? c14nx.LJ(str12) : null;
            if (Float.class == Double.class) {
                objLJ12 = C20252814Mk.LIZ(objLJ12);
            } else if (Float.class == Float.class) {
                objLJ12 = C20252814Mk.LIZIZ(objLJ12);
            } else if (Float.class == Integer.class) {
                objLJ12 = C20252814Mk.LIZJ(objLJ12);
            } else if (Float.class == Long.class) {
                objLJ12 = C20252814Mk.LIZLLL(objLJ12);
            } else if (Float.class == String.class) {
                objLJ12 = objLJ12 != null ? objLJ12.toString() : null;
            } else if (Float.class != String.class && Float.class != Map.class) {
                if ((objLJ12 instanceof Map) && !Map.class.isAssignableFrom(Float.class)) {
                    try {
                        C20266914Rv.LIZ().getClass();
                        Gson gsonLIZLLL23 = C1227904rF.LIZLLL();
                        objLJ12 = gsonLIZLLL23.LIZJ(gsonLIZLLL23.LJIJJLI(objLJ12), Float.class);
                    } catch (Exception e23) {
                        TryCatchGuardChecker.doCheck(e23);
                        C786410Ut5.v3();
                    }
                } else if (objLJ12 instanceof List) {
                    try {
                        Type type12 = new TypeToken<Float>() { // from class: X.14RI
                        }.getType();
                        if (List.class.isAssignableFrom(Float.class)) {
                            C20266914Rv.LIZ().getClass();
                            Gson gsonLIZLLL24 = C1227904rF.LIZLLL();
                            objLJ12 = gsonLIZLLL24.LIZLLL(gsonLIZLLL24.LJIJJLI(objLJ12), type12);
                        }
                    } catch (Exception e24) {
                        TryCatchGuardChecker.doCheck(e24);
                        C786410Ut5.v3();
                    }
                } else if ((objLJ12 instanceof String) && List.class.isAssignableFrom(Float.class)) {
                    objLJ12 = C14P7.LJJ((String) objLJ12);
                }
            }
            if (!(objLJ12 instanceof Float)) {
                objLJ12 = null;
            }
            Float f10 = (Float) objLJ12;
            Object obj12 = c14nx.LIZLLL().get("borderTopWidth_2");
            if (!(obj12 instanceof Float)) {
                obj12 = null;
            }
            StringBuilder sbLIZ23 = C2188811AlT.LIZ();
            sbLIZ23.append("updateCacheIfNeeded: cachedValue = ");
            sbLIZ23.append(obj12);
            sbLIZ23.append(", castValue = ");
            sbLIZ23.append(f10);
            C2188811AlT.LIZIZ(sbLIZ23);
            StringBuilder sbLIZ24 = C2188811AlT.LIZ();
            sbLIZ24.append("updateCacheIfNeeded: isInitializing = ");
            sbLIZ24.append(z);
            sbLIZ24.append(" !cachedValue.deepEquals(castValue):");
            sbLIZ24.append(!C14P7.LIZ(obj12, f10));
            C2188811AlT.LIZIZ(sbLIZ24);
            if (!C14P7.LIZ(obj12, f10)) {
                if (f10 != null) {
                    c14rc.LJIIJ.put(EnumC1301750jyn.TOP, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f10.floatValue())))));
                    z2 = true;
                }
                c14nx.LIZLLL().put("borderTopWidth_2", f10);
            } else if (z && f10 != null) {
                c14rc.LJIIJ.put(EnumC1301750jyn.TOP, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f10.floatValue())))));
                z2 = true;
            }
            String str13 = nimbleViewProps.background;
            Object objLJ13 = str13 != null ? c14nx.LJ(str13) : null;
            if (C1201490hN5.class == Double.class) {
                objLJ13 = C20252814Mk.LIZ(objLJ13);
            } else if (C1201490hN5.class == Float.class) {
                objLJ13 = C20252814Mk.LIZIZ(objLJ13);
            } else if (C1201490hN5.class == Integer.class) {
                objLJ13 = C20252814Mk.LIZJ(objLJ13);
            } else if (C1201490hN5.class == Long.class) {
                objLJ13 = C20252814Mk.LIZLLL(objLJ13);
            } else if (C1201490hN5.class == String.class) {
                objLJ13 = objLJ13 != null ? objLJ13.toString() : null;
            } else if (C1201490hN5.class != String.class && C1201490hN5.class != Map.class) {
                if ((objLJ13 instanceof Map) && !Map.class.isAssignableFrom(C1201490hN5.class)) {
                    try {
                        C20266914Rv.LIZ().getClass();
                        Gson gsonLIZLLL25 = C1227904rF.LIZLLL();
                        objLJ13 = gsonLIZLLL25.LIZJ(gsonLIZLLL25.LJIJJLI(objLJ13), C1201490hN5.class);
                    } catch (Exception e25) {
                        TryCatchGuardChecker.doCheck(e25);
                        C786410Ut5.v3();
                    }
                } else if (objLJ13 instanceof List) {
                    try {
                        Type type13 = new TypeToken<C1201490hN5>() { // from class: X.14RT
                        }.getType();
                        if (List.class.isAssignableFrom(C1201490hN5.class)) {
                            C20266914Rv.LIZ().getClass();
                            Gson gsonLIZLLL26 = C1227904rF.LIZLLL();
                            objLJ13 = gsonLIZLLL26.LIZLLL(gsonLIZLLL26.LJIJJLI(objLJ13), type13);
                        }
                    } catch (Exception e26) {
                        TryCatchGuardChecker.doCheck(e26);
                        C786410Ut5.v3();
                    }
                } else if ((objLJ13 instanceof String) && List.class.isAssignableFrom(C1201490hN5.class)) {
                    objLJ13 = C14P7.LJJ((String) objLJ13);
                }
            }
            if (!(objLJ13 instanceof C1201490hN5)) {
                objLJ13 = null;
            }
            C1201490hN5 c1201490hN5 = (C1201490hN5) objLJ13;
            Object obj13 = c14nx.LIZLLL().get("background");
            if (!(obj13 instanceof C1201490hN5)) {
                obj13 = null;
            }
            StringBuilder sbLIZ25 = C2188811AlT.LIZ();
            sbLIZ25.append("updateCacheIfNeeded: cachedValue = ");
            sbLIZ25.append(obj13);
            sbLIZ25.append(", castValue = ");
            sbLIZ25.append(c1201490hN5);
            C2188811AlT.LIZIZ(sbLIZ25);
            StringBuilder sbLIZ26 = C2188811AlT.LIZ();
            sbLIZ26.append("updateCacheIfNeeded: isInitializing = ");
            sbLIZ26.append(z);
            sbLIZ26.append(" !cachedValue.deepEquals(castValue):");
            sbLIZ26.append(!C14P7.LIZ(obj13, c1201490hN5));
            C2188811AlT.LIZIZ(sbLIZ26);
            if (!C14P7.LIZ(obj13, c1201490hN5)) {
                if (c1201490hN5 != null) {
                    c14rc.LJIIL = c1201490hN5.LIZ;
                    c14rc.LJIIJJI = c1201490hN5.LIZIZ;
                }
                c14nx.LIZLLL().put("background", c1201490hN5);
            } else if (z && c1201490hN5 != null) {
                c14rc.LJIIL = c1201490hN5.LIZ;
                c14rc.LJIIJJI = c1201490hN5.LIZIZ;
            }
            if (z2) {
                view.setBackground(c14rc.LIZ(view.getContext()));
            }
        }
        Object objLJ14 = c14nx.LJ(Float.valueOf(nimbleViewProps.opacity));
        if (Float.class == Double.class) {
            objLJ14 = C20252814Mk.LIZ(objLJ14);
        } else if (Float.class == Float.class) {
            objLJ14 = C20252814Mk.LIZIZ(objLJ14);
        } else if (Float.class == Integer.class) {
            objLJ14 = C20252814Mk.LIZJ(objLJ14);
        } else if (Float.class == Long.class) {
            objLJ14 = C20252814Mk.LIZLLL(objLJ14);
        } else if (Float.class == String.class) {
            objLJ14 = objLJ14 != null ? objLJ14.toString() : null;
        } else if (Float.class != String.class && Float.class != Map.class) {
            if ((objLJ14 instanceof Map) && !Map.class.isAssignableFrom(Float.class)) {
                try {
                    C20266914Rv.LIZ().getClass();
                    Gson gsonLIZLLL27 = C1227904rF.LIZLLL();
                    objLJ14 = gsonLIZLLL27.LIZJ(gsonLIZLLL27.LJIJJLI(objLJ14), Float.class);
                } catch (Exception e27) {
                    TryCatchGuardChecker.doCheck(e27);
                    C786410Ut5.v3();
                }
            } else if (objLJ14 instanceof List) {
                try {
                    Type type14 = new TypeToken<Float>() { // from class: X.14RD
                    }.getType();
                    if (List.class.isAssignableFrom(Float.class)) {
                        C20266914Rv.LIZ().getClass();
                        Gson gsonLIZLLL28 = C1227904rF.LIZLLL();
                        objLJ14 = gsonLIZLLL28.LIZLLL(gsonLIZLLL28.LJIJJLI(objLJ14), type14);
                    }
                } catch (Exception e28) {
                    TryCatchGuardChecker.doCheck(e28);
                    C786410Ut5.v3();
                }
            } else if ((objLJ14 instanceof String) && List.class.isAssignableFrom(Float.class)) {
                objLJ14 = C14P7.LJJ((String) objLJ14);
            }
        }
        if (!(objLJ14 instanceof Float)) {
            objLJ14 = null;
        }
        Float f11 = (Float) objLJ14;
        Object obj14 = c14nx.LIZLLL().get("opacity");
        if (!(obj14 instanceof Float)) {
            obj14 = null;
        }
        StringBuilder sbLIZ27 = C2188811AlT.LIZ();
        sbLIZ27.append("updateCacheIfNeeded: cachedValue = ");
        sbLIZ27.append(obj14);
        sbLIZ27.append(", castValue = ");
        sbLIZ27.append(f11);
        C2188811AlT.LIZIZ(sbLIZ27);
        StringBuilder sbLIZ28 = C2188811AlT.LIZ();
        sbLIZ28.append("updateCacheIfNeeded: isInitializing = ");
        sbLIZ28.append(z);
        sbLIZ28.append(" !cachedValue.deepEquals(castValue):");
        sbLIZ28.append(!C14P7.LIZ(obj14, f11));
        C2188811AlT.LIZIZ(sbLIZ28);
        if (!C14P7.LIZ(obj14, f11)) {
            if (f11 != null) {
                C786410Ut5.T4(view, f11.floatValue());
            }
            c14nx.LIZLLL().put("opacity", f11);
        } else if (z && f11 != null) {
            C786410Ut5.T4(view, f11.floatValue());
        }
        Boolean bool = nimbleViewProps.enablePressMask;
        Object objLJ15 = bool != null ? c14nx.LJ(bool) : null;
        if (Boolean.class == Double.class) {
            objLJ15 = C20252814Mk.LIZ(objLJ15);
        } else if (Boolean.class == Float.class) {
            objLJ15 = C20252814Mk.LIZIZ(objLJ15);
        } else if (Boolean.class == Integer.class) {
            objLJ15 = C20252814Mk.LIZJ(objLJ15);
        } else if (Boolean.class == Long.class) {
            objLJ15 = C20252814Mk.LIZLLL(objLJ15);
        } else if (Boolean.class == String.class) {
            objLJ15 = objLJ15 != null ? objLJ15.toString() : null;
        } else if (Boolean.class != String.class && Boolean.class != Map.class) {
            if ((objLJ15 instanceof Map) && !Map.class.isAssignableFrom(Boolean.class)) {
                try {
                    C20266914Rv.LIZ().getClass();
                    Gson gsonLIZLLL29 = C1227904rF.LIZLLL();
                    objLJ15 = gsonLIZLLL29.LIZJ(gsonLIZLLL29.LJIJJLI(objLJ15), Boolean.class);
                } catch (Exception e29) {
                    TryCatchGuardChecker.doCheck(e29);
                    C786410Ut5.v3();
                }
            } else if (objLJ15 instanceof List) {
                try {
                    Type type15 = new TypeToken<Boolean>() { // from class: X.14RE
                    }.getType();
                    if (List.class.isAssignableFrom(Boolean.class)) {
                        C20266914Rv.LIZ().getClass();
                        Gson gsonLIZLLL30 = C1227904rF.LIZLLL();
                        objLJ15 = gsonLIZLLL30.LIZLLL(gsonLIZLLL30.LJIJJLI(objLJ15), type15);
                    }
                } catch (Exception e30) {
                    TryCatchGuardChecker.doCheck(e30);
                    C786410Ut5.v3();
                }
            } else if ((objLJ15 instanceof String) && List.class.isAssignableFrom(Boolean.class)) {
                objLJ15 = C14P7.LJJ((String) objLJ15);
            }
        }
        if (!(objLJ15 instanceof Boolean)) {
            objLJ15 = null;
        }
        Object obj15 = c14nx.LIZLLL().get("enablePressMask");
        if (!(obj15 instanceof Boolean)) {
            obj15 = null;
        }
        StringBuilder sbLIZ29 = C2188811AlT.LIZ();
        sbLIZ29.append("updateCacheIfNeeded: cachedValue = ");
        sbLIZ29.append(obj15);
        sbLIZ29.append(", castValue = ");
        sbLIZ29.append(objLJ15);
        C2188811AlT.LIZIZ(sbLIZ29);
        StringBuilder sbLIZ30 = C2188811AlT.LIZ();
        sbLIZ30.append("updateCacheIfNeeded: isInitializing = ");
        sbLIZ30.append(z);
        sbLIZ30.append(" !cachedValue.deepEquals(castValue):");
        sbLIZ30.append(!C14P7.LIZ(obj15, objLJ15));
        C2188811AlT.LIZIZ(sbLIZ30);
        if (!C14P7.LIZ(obj15, objLJ15)) {
            if (Intrinsics.LJFF(objLJ15, Boolean.TRUE)) {
                String str14 = nimbleViewProps.corners;
                Object objLJ16 = str14 != null ? c14nx.LJ(str14) : null;
                if (Float.class == Double.class) {
                    objLJ16 = C20252814Mk.LIZ(objLJ16);
                } else if (Float.class == Float.class) {
                    objLJ16 = C20252814Mk.LIZIZ(objLJ16);
                } else if (Float.class == Integer.class) {
                    objLJ16 = C20252814Mk.LIZJ(objLJ16);
                } else if (Float.class == Long.class) {
                    objLJ16 = C20252814Mk.LIZLLL(objLJ16);
                } else if (Float.class == String.class) {
                    objLJ16 = objLJ16 != null ? objLJ16.toString() : null;
                } else if (Float.class != String.class && Float.class != Map.class) {
                    if ((objLJ16 instanceof Map) && !Map.class.isAssignableFrom(Float.class)) {
                        try {
                            C20266914Rv.LIZ().getClass();
                            Gson gsonLIZLLL31 = C1227904rF.LIZLLL();
                            objLJ16 = gsonLIZLLL31.LIZJ(gsonLIZLLL31.LJIJJLI(objLJ16), Float.class);
                        } catch (Exception e31) {
                            TryCatchGuardChecker.doCheck(e31);
                            C786410Ut5.v3();
                        }
                    } else if (objLJ16 instanceof List) {
                        try {
                            Type type16 = new TypeToken<Float>() { // from class: X.14RS
                            }.getType();
                            if (List.class.isAssignableFrom(Float.class)) {
                                C20266914Rv.LIZ().getClass();
                                Gson gsonLIZLLL32 = C1227904rF.LIZLLL();
                                objLJ16 = gsonLIZLLL32.LIZLLL(gsonLIZLLL32.LJIJJLI(objLJ16), type16);
                            }
                        } catch (Exception e32) {
                            TryCatchGuardChecker.doCheck(e32);
                            C786410Ut5.v3();
                        }
                    } else if ((objLJ16 instanceof String) && List.class.isAssignableFrom(Float.class)) {
                        objLJ16 = C14P7.LJJ((String) objLJ16);
                    }
                }
                if (!(objLJ16 instanceof Float)) {
                    objLJ16 = null;
                }
                Number number = (Number) objLJ16;
                Object obj16 = c14nx.LIZLLL().get("corner");
                if (!(obj16 instanceof Float)) {
                    obj16 = null;
                }
                StringBuilder sbLIZ31 = C2188811AlT.LIZ();
                sbLIZ31.append("updateCacheIfNeeded: cachedValue = ");
                sbLIZ31.append(obj16);
                sbLIZ31.append(", castValue = ");
                sbLIZ31.append(number);
                C2188811AlT.LIZIZ(sbLIZ31);
                StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                sbLIZ32.append("updateCacheIfNeeded: isInitializing = ");
                sbLIZ32.append(z);
                sbLIZ32.append(" !cachedValue.deepEquals(castValue):");
                sbLIZ32.append(!C14P7.LIZ(obj16, number));
                C2188811AlT.LIZIZ(sbLIZ32);
                if (!C14P7.LIZ(obj16, number)) {
                    C427690Gpr.LJ(view, number != null ? C418440Gaw.LIZIZ(number) : 0.0f);
                    c14nx.LIZLLL().put("corner", number);
                } else if (z) {
                    C427690Gpr.LJ(view, number != null ? C418440Gaw.LIZIZ(number) : 0.0f);
                }
            }
            c14nx.LIZLLL().put("enablePressMask", objLJ15);
        } else if (z && Intrinsics.LJFF(objLJ15, Boolean.TRUE)) {
            String str15 = nimbleViewProps.corners;
            Object objLJ17 = str15 != null ? c14nx.LJ(str15) : null;
            if (Float.class == Double.class) {
                objLJ17 = C20252814Mk.LIZ(objLJ17);
            } else if (Float.class == Float.class) {
                objLJ17 = C20252814Mk.LIZIZ(objLJ17);
            } else if (Float.class == Integer.class) {
                objLJ17 = C20252814Mk.LIZJ(objLJ17);
            } else if (Float.class == Long.class) {
                objLJ17 = C20252814Mk.LIZLLL(objLJ17);
            } else if (Float.class == String.class) {
                objLJ17 = objLJ17 != null ? objLJ17.toString() : null;
            } else if (Float.class != String.class && Float.class != Map.class) {
                if ((objLJ17 instanceof Map) && !Map.class.isAssignableFrom(Float.class)) {
                    try {
                        C20266914Rv.LIZ().getClass();
                        Gson gsonLIZLLL33 = C1227904rF.LIZLLL();
                        objLJ17 = gsonLIZLLL33.LIZJ(gsonLIZLLL33.LJIJJLI(objLJ17), Float.class);
                    } catch (Exception e33) {
                        TryCatchGuardChecker.doCheck(e33);
                        C786410Ut5.v3();
                    }
                } else if (objLJ17 instanceof List) {
                    try {
                        Type type17 = new TypeToken<Float>() { // from class: X.14RS
                        }.getType();
                        if (List.class.isAssignableFrom(Float.class)) {
                            C20266914Rv.LIZ().getClass();
                            Gson gsonLIZLLL34 = C1227904rF.LIZLLL();
                            objLJ17 = gsonLIZLLL34.LIZLLL(gsonLIZLLL34.LJIJJLI(objLJ17), type17);
                        }
                    } catch (Exception e34) {
                        TryCatchGuardChecker.doCheck(e34);
                        C786410Ut5.v3();
                    }
                } else if ((objLJ17 instanceof String) && List.class.isAssignableFrom(Float.class)) {
                    objLJ17 = C14P7.LJJ((String) objLJ17);
                }
            }
            if (!(objLJ17 instanceof Float)) {
                objLJ17 = null;
            }
            Number number2 = (Number) objLJ17;
            Object obj17 = c14nx.LIZLLL().get("corner");
            if (!(obj17 instanceof Float)) {
                obj17 = null;
            }
            StringBuilder sbLIZ33 = C2188811AlT.LIZ();
            sbLIZ33.append("updateCacheIfNeeded: cachedValue = ");
            sbLIZ33.append(obj17);
            sbLIZ33.append(", castValue = ");
            sbLIZ33.append(number2);
            C2188811AlT.LIZIZ(sbLIZ33);
            StringBuilder sbLIZ34 = C2188811AlT.LIZ();
            sbLIZ34.append("updateCacheIfNeeded: isInitializing = ");
            sbLIZ34.append(z);
            sbLIZ34.append(" !cachedValue.deepEquals(castValue):");
            sbLIZ34.append(!C14P7.LIZ(obj17, number2));
            C2188811AlT.LIZIZ(sbLIZ34);
            if (C14P7.LIZ(obj17, number2)) {
                C427690Gpr.LJ(view, number2 != null ? C418440Gaw.LIZIZ(number2) : 0.0f);
            } else {
                C427690Gpr.LJ(view, number2 != null ? C418440Gaw.LIZIZ(number2) : 0.0f);
                c14nx.LIZLLL().put("corner", number2);
            }
        }
        String str16 = nimbleViewProps.visibility;
        Object objLJ18 = str16 != null ? c14nx.LJ(str16) : null;
        if (String.class == Double.class) {
            objLJ18 = C20252814Mk.LIZ(objLJ18);
        } else if (String.class == Float.class) {
            objLJ18 = C20252814Mk.LIZIZ(objLJ18);
        } else if (String.class == Integer.class) {
            objLJ18 = C20252814Mk.LIZJ(objLJ18);
        } else if (String.class == Long.class) {
            objLJ18 = C20252814Mk.LIZLLL(objLJ18);
        } else if (String.class == String.class) {
            objLJ18 = objLJ18 != null ? objLJ18.toString() : null;
        } else if (String.class != String.class && String.class != Map.class) {
            if ((objLJ18 instanceof Map) && !Map.class.isAssignableFrom(String.class)) {
                try {
                    C20266914Rv.LIZ().getClass();
                    Gson gsonLIZLLL35 = C1227904rF.LIZLLL();
                    objLJ18 = gsonLIZLLL35.LIZJ(gsonLIZLLL35.LJIJJLI(objLJ18), String.class);
                } catch (Exception e35) {
                    TryCatchGuardChecker.doCheck(e35);
                    C786410Ut5.v3();
                }
            } else if (objLJ18 instanceof List) {
                try {
                    Type type18 = new TypeToken<String>() { // from class: X.14RF
                    }.getType();
                    if (List.class.isAssignableFrom(String.class)) {
                        C20266914Rv.LIZ().getClass();
                        Gson gsonLIZLLL36 = C1227904rF.LIZLLL();
                        objLJ18 = gsonLIZLLL36.LIZLLL(gsonLIZLLL36.LJIJJLI(objLJ18), type18);
                    }
                } catch (Exception e36) {
                    TryCatchGuardChecker.doCheck(e36);
                    C786410Ut5.v3();
                }
            } else if ((objLJ18 instanceof String) && List.class.isAssignableFrom(String.class)) {
                objLJ18 = C14P7.LJJ((String) objLJ18);
            }
        }
        if (!(objLJ18 instanceof String)) {
            objLJ18 = null;
        }
        String str17 = (String) objLJ18;
        Object obj18 = c14nx.LIZLLL().get("visibility");
        if (!(obj18 instanceof String)) {
            obj18 = null;
        }
        StringBuilder sbLIZ35 = C2188811AlT.LIZ();
        sbLIZ35.append("updateCacheIfNeeded: cachedValue = ");
        sbLIZ35.append(obj18);
        sbLIZ35.append(", castValue = ");
        sbLIZ35.append((Object) str17);
        C2188811AlT.LIZIZ(sbLIZ35);
        StringBuilder sbLIZ36 = C2188811AlT.LIZ();
        sbLIZ36.append("updateCacheIfNeeded: isInitializing = ");
        sbLIZ36.append(z);
        sbLIZ36.append(" !cachedValue.deepEquals(castValue):");
        sbLIZ36.append(!C14P7.LIZ(obj18, str17));
        C2188811AlT.LIZIZ(sbLIZ36);
        if (!C14P7.LIZ(obj18, str17)) {
            if (str17 != null) {
                C786410Ut5.LJLLLLLL(LJ(str17), view);
            }
            c14nx.LIZLLL().put("visibility", str17);
        } else {
            if (!z || str17 == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(LJ(str17), view);
        }
    }

    public static final Float LIZ(C14NX c14nx) {
        TemplateData element;
        NimbleViewProps nimbleViewProps;
        Object objLJIIZILJ;
        Float fLIZIZ;
        Object objLJIIZILJ2;
        Float fLIZIZ2;
        if (c14nx == null || (element = c14nx.getElement()) == null || (nimbleViewProps = element.props) == null) {
            return null;
        }
        String str = nimbleViewProps.cornersBottomLeft;
        if (str != null && (objLJIIZILJ2 = c14nx.LJIIZILJ(str)) != null && (fLIZIZ2 = C20252814Mk.LIZIZ(objLJIIZILJ2)) != null) {
            return Float.valueOf(C418440Gaw.LIZIZ(fLIZIZ2));
        }
        String str2 = nimbleViewProps.corners;
        if (str2 == null || (objLJIIZILJ = c14nx.LJIIZILJ(str2)) == null || (fLIZIZ = C20252814Mk.LIZIZ(objLJIIZILJ)) == null) {
            return null;
        }
        return Float.valueOf(C418440Gaw.LIZIZ(fLIZIZ));
    }

    public static final Float LIZIZ(C14NX c14nx) {
        TemplateData element;
        NimbleViewProps nimbleViewProps;
        Object objLJIIZILJ;
        Float fLIZIZ;
        Object objLJIIZILJ2;
        Float fLIZIZ2;
        if (c14nx == null || (element = c14nx.getElement()) == null || (nimbleViewProps = element.props) == null) {
            return null;
        }
        String str = nimbleViewProps.cornersBottomRight;
        if (str != null && (objLJIIZILJ2 = c14nx.LJIIZILJ(str)) != null && (fLIZIZ2 = C20252814Mk.LIZIZ(objLJIIZILJ2)) != null) {
            return Float.valueOf(C418440Gaw.LIZIZ(fLIZIZ2));
        }
        String str2 = nimbleViewProps.corners;
        if (str2 == null || (objLJIIZILJ = c14nx.LJIIZILJ(str2)) == null || (fLIZIZ = C20252814Mk.LIZIZ(objLJIIZILJ)) == null) {
            return null;
        }
        return Float.valueOf(C418440Gaw.LIZIZ(fLIZIZ));
    }

    public static final Float LIZJ(C14NX c14nx) {
        TemplateData element;
        NimbleViewProps nimbleViewProps;
        Object objLJIIZILJ;
        Float fLIZIZ;
        Object objLJIIZILJ2;
        Float fLIZIZ2;
        if (c14nx == null || (element = c14nx.getElement()) == null || (nimbleViewProps = element.props) == null) {
            return null;
        }
        String str = nimbleViewProps.cornersTopLeft;
        if (str != null && (objLJIIZILJ2 = c14nx.LJIIZILJ(str)) != null && (fLIZIZ2 = C20252814Mk.LIZIZ(objLJIIZILJ2)) != null) {
            return Float.valueOf(C418440Gaw.LIZIZ(fLIZIZ2));
        }
        String str2 = nimbleViewProps.corners;
        if (str2 == null || (objLJIIZILJ = c14nx.LJIIZILJ(str2)) == null || (fLIZIZ = C20252814Mk.LIZIZ(objLJIIZILJ)) == null) {
            return null;
        }
        return Float.valueOf(C418440Gaw.LIZIZ(fLIZIZ));
    }

    public static final Float LIZLLL(C14NX c14nx) {
        TemplateData element;
        NimbleViewProps nimbleViewProps;
        Object objLJIIZILJ;
        Float fLIZIZ;
        Object objLJIIZILJ2;
        Float fLIZIZ2;
        if (c14nx == null || (element = c14nx.getElement()) == null || (nimbleViewProps = element.props) == null) {
            return null;
        }
        String str = nimbleViewProps.cornersTopRight;
        if (str != null && (objLJIIZILJ2 = c14nx.LJIIZILJ(str)) != null && (fLIZIZ2 = C20252814Mk.LIZIZ(objLJIIZILJ2)) != null) {
            return Float.valueOf(C418440Gaw.LIZIZ(fLIZIZ2));
        }
        String str2 = nimbleViewProps.corners;
        if (str2 == null || (objLJIIZILJ = c14nx.LJIIZILJ(str2)) == null || (fLIZIZ = C20252814Mk.LIZIZ(objLJIIZILJ)) == null) {
            return null;
        }
        return Float.valueOf(C418440Gaw.LIZIZ(fLIZIZ));
    }

    public static final int LJ(String str) {
        String lowerCase;
        String string = a0.LJLIIIL(str).toString();
        if (string != null && (lowerCase = string.toLowerCase(Locale.ROOT)) != null) {
            int iHashCode = lowerCase.hashCode();
            if (iHashCode != -1217487446) {
                if (iHashCode != 3178655) {
                    if (iHashCode == 466743410) {
                        lowerCase.equals("visible");
                        return 0;
                    }
                    return 0;
                }
                if (!lowerCase.equals("gone")) {
                    return 0;
                }
                return 8;
            }
            if (!lowerCase.equals("hidden")) {
                return 0;
            }
            return 4;
        }
        return 0;
    }

    public static final boolean LJFF(TemplateData templateData) {
        Layout layout;
        if (templateData == null || templateData.props == null) {
            return false;
        }
        if (!LJI(templateData) && (((layout = templateData.layout) == null || templateData.props == null || ((!C123100dR.LIZ(layout.borderBottomWidth) || !C123100dR.LIZ(templateData.props.borderColor)) && ((!C123100dR.LIZ(templateData.layout.borderRightWidth) || !C123100dR.LIZ(templateData.props.borderColor)) && ((!C123100dR.LIZ(templateData.layout.borderLeftWidth) || !C123100dR.LIZ(templateData.props.borderColor)) && ((!C123100dR.LIZ(templateData.layout.borderTopWidth) || !C123100dR.LIZ(templateData.props.borderColor)) && !C123100dR.LIZ(templateData.layout.border)))))) && !C123100dR.LIZ(templateData.props.backgroundColor) && !C123100dR.LIZ(templateData.props.background))) {
            return false;
        }
        return true;
    }

    public static final boolean LJI(TemplateData templateData) {
        NimbleViewProps nimbleViewProps;
        if (templateData == null || (nimbleViewProps = templateData.props) == null) {
            return false;
        }
        if (!C123100dR.LIZ(nimbleViewProps.cornersTopRight) && !C123100dR.LIZ(templateData.props.cornersTopLeft) && !C123100dR.LIZ(templateData.props.cornersBottomLeft) && !C123100dR.LIZ(templateData.props.cornersBottomRight) && !C123100dR.LIZ(templateData.props.corners)) {
            return false;
        }
        return true;
    }
}
