package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.nimblecard.tako.context.NimbleTemplateContext;
import com.ss.android.ugc.aweme.nimblecard.tako.model.LoopVariables;
import com.ss.android.ugc.aweme.nimblecard.tako.model.NimbleViewProps;
import com.ss.android.ugc.aweme.nimblecard.tako.model.TemplateData;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS396S0200000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14Ox, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20259314Ox extends C14NT<C427760Gpy> {
    public EnumC428930Grr LJIIL;
    public Drawable LJIILIIL;

    public C20259314Ox(NimbleTemplateContext nimbleTemplateContext) {
        super(nimbleTemplateContext);
        this.LJIIL = EnumC428930Grr.X_SMALL;
    }

    @Override // X.C14NT
    public final View LJJIII(Context context) {
        return new C427760Gpy(context, null, 6);
    }

    @Override // X.C14NT
    public final void LJJIIJZLJL(boolean z) {
        Object objLIZLLL;
        Object objLIZLLL2;
        Object objLIZLLL3;
        float fFloatValue;
        Object objLIZLLL4;
        Object objLIZLLL5;
        Object objLIZLLL6;
        Object objLIZLLL7;
        String str;
        String str2;
        String str3;
        String str4;
        float fFloatValue2;
        String str5;
        String str6;
        String str7;
        super.LJJIIJZLJL(z);
        TemplateData templateData = this.LJIIIZ;
        if (templateData == null) {
            return;
        }
        C427760Gpy view = getView();
        NimbleViewProps nimbleViewProps = templateData.props;
        Object obj = null;
        if (nimbleViewProps != null && (str7 = nimbleViewProps.avatarStackSize) != null) {
            objLIZLLL = LJ(str7);
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
                    Type type = new TypeToken<String>() { // from class: X.14P0
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
        String str8 = (String) objLIZLLL;
        Object obj2 = ((LinkedHashMap) this.LJFF).get("avatarStackSize");
        if (!(obj2 instanceof String)) {
            obj2 = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateCacheIfNeeded: cachedValue = ");
        sbLIZ.append(obj2);
        sbLIZ.append(", castValue = ");
        sbLIZ.append((Object) str8);
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateCacheIfNeeded: isInitializing = ");
        sbLIZ2.append(z);
        sbLIZ2.append(" !cachedValue.deepEquals(castValue):");
        sbLIZ2.append(!C14P7.LIZ(obj2, str8));
        C2188811AlT.LIZIZ(sbLIZ2);
        if (!C14P7.LIZ(obj2, str8)) {
            EnumC428930Grr enumC428930GrrLIZIZ = C20259414Oy.LIZIZ(str8);
            this.LJIIL = enumC428930GrrLIZIZ;
            view.setSize(enumC428930GrrLIZIZ);
            this.LJFF.put("avatarStackSize", str8);
        } else if (z) {
            EnumC428930Grr enumC428930GrrLIZIZ2 = C20259414Oy.LIZIZ(str8);
            this.LJIIL = enumC428930GrrLIZIZ2;
            view.setSize(enumC428930GrrLIZIZ2);
        }
        NimbleViewProps nimbleViewProps2 = templateData.props;
        if (nimbleViewProps2 != null && (str6 = nimbleViewProps2.stacking) != null) {
            objLIZLLL2 = LJ(str6);
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
                    Type type2 = new TypeToken<String>() { // from class: X.14P1
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
        String str9 = (String) objLIZLLL2;
        Object obj3 = ((LinkedHashMap) this.LJFF).get("stacking");
        if (!(obj3 instanceof String)) {
            obj3 = null;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("updateCacheIfNeeded: cachedValue = ");
        sbLIZ3.append(obj3);
        sbLIZ3.append(", castValue = ");
        sbLIZ3.append((Object) str9);
        C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("updateCacheIfNeeded: isInitializing = ");
        sbLIZ4.append(z);
        sbLIZ4.append(" !cachedValue.deepEquals(castValue):");
        sbLIZ4.append(!C14P7.LIZ(obj3, str9));
        C2188811AlT.LIZIZ(sbLIZ4);
        if (!C14P7.LIZ(obj3, str9)) {
            view.setStacking(C20259414Oy.LIZ(str9));
            this.LJFF.put("stacking", str9);
        } else if (z) {
            view.setStacking(C20259414Oy.LIZ(str9));
        }
        NimbleViewProps nimbleViewProps3 = templateData.props;
        if (nimbleViewProps3 != null && (str5 = nimbleViewProps3.extraItemSpacing) != null) {
            objLIZLLL3 = LJ(str5);
        } else {
            objLIZLLL3 = null;
        }
        if (Float.class == Double.class) {
            objLIZLLL3 = C20252814Mk.LIZ(objLIZLLL3);
        } else if (Float.class == Float.class) {
            objLIZLLL3 = C20252814Mk.LIZIZ(objLIZLLL3);
        } else if (Float.class == Integer.class) {
            objLIZLLL3 = C20252814Mk.LIZJ(objLIZLLL3);
        } else if (Float.class == Long.class) {
            objLIZLLL3 = C20252814Mk.LIZLLL(objLIZLLL3);
        } else if (Float.class == String.class) {
            if (objLIZLLL3 != null) {
                objLIZLLL3 = objLIZLLL3.toString();
            } else {
                objLIZLLL3 = null;
            }
        } else if (Float.class != String.class && Float.class != Map.class) {
            if ((objLIZLLL3 instanceof Map) && !Map.class.isAssignableFrom(Float.class)) {
                try {
                    C1227904rF.LIZ.getClass();
                    Gson gsonLIZLLL5 = C1227904rF.LIZLLL();
                    objLIZLLL3 = gsonLIZLLL5.LIZJ(gsonLIZLLL5.LJIJJLI(objLIZLLL3), Float.class);
                } catch (Exception e5) {
                    TryCatchGuardChecker.doCheck(e5);
                }
            } else if (objLIZLLL3 instanceof List) {
                try {
                    Type type3 = new TypeToken<Float>() { // from class: X.14P2
                    }.getType();
                    if (List.class.isAssignableFrom(Float.class)) {
                        C1227904rF.LIZ.getClass();
                        Gson gsonLIZLLL6 = C1227904rF.LIZLLL();
                        objLIZLLL3 = gsonLIZLLL6.LIZLLL(gsonLIZLLL6.LJIJJLI(objLIZLLL3), type3);
                    }
                } catch (Exception e6) {
                    TryCatchGuardChecker.doCheck(e6);
                }
            } else if ((objLIZLLL3 instanceof String) && List.class.isAssignableFrom(Float.class)) {
                objLIZLLL3 = C14P7.LJJ((String) objLIZLLL3);
            }
        }
        if (!(objLIZLLL3 instanceof Float)) {
            objLIZLLL3 = null;
        }
        Float f = (Float) objLIZLLL3;
        Object obj4 = ((LinkedHashMap) this.LJFF).get("extraItemSpacing");
        if (!(obj4 instanceof Float)) {
            obj4 = null;
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("updateCacheIfNeeded: cachedValue = ");
        sbLIZ5.append(obj4);
        sbLIZ5.append(", castValue = ");
        sbLIZ5.append(f);
        C2188811AlT.LIZIZ(sbLIZ5);
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("updateCacheIfNeeded: isInitializing = ");
        sbLIZ6.append(z);
        sbLIZ6.append(" !cachedValue.deepEquals(castValue):");
        sbLIZ6.append(!C14P7.LIZ(obj4, f));
        C2188811AlT.LIZIZ(sbLIZ6);
        float fFloatValue3 = 0.0f;
        if (!C14P7.LIZ(obj4, f)) {
            if (f != null) {
                fFloatValue2 = f.floatValue();
            } else {
                fFloatValue2 = 0.0f;
            }
            view.setExtraItemSpacingDp(fFloatValue2);
            this.LJFF.put("extraItemSpacing", f);
        } else if (z) {
            if (f != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            view.setExtraItemSpacingDp(fFloatValue);
        }
        NimbleViewProps nimbleViewProps4 = templateData.props;
        if (nimbleViewProps4 != null && (str4 = nimbleViewProps4.extraCutoutSize) != null) {
            objLIZLLL4 = LJ(str4);
        } else {
            objLIZLLL4 = null;
        }
        if (Float.class == Double.class) {
            objLIZLLL4 = C20252814Mk.LIZ(objLIZLLL4);
        } else if (Float.class == Float.class) {
            objLIZLLL4 = C20252814Mk.LIZIZ(objLIZLLL4);
        } else if (Float.class == Integer.class) {
            objLIZLLL4 = C20252814Mk.LIZJ(objLIZLLL4);
        } else if (Float.class == Long.class) {
            objLIZLLL4 = C20252814Mk.LIZLLL(objLIZLLL4);
        } else if (Float.class == String.class) {
            if (objLIZLLL4 != null) {
                objLIZLLL4 = objLIZLLL4.toString();
            } else {
                objLIZLLL4 = null;
            }
        } else if (Float.class != String.class && Float.class != Map.class) {
            if ((objLIZLLL4 instanceof Map) && !Map.class.isAssignableFrom(Float.class)) {
                try {
                    C1227904rF.LIZ.getClass();
                    Gson gsonLIZLLL7 = C1227904rF.LIZLLL();
                    objLIZLLL4 = gsonLIZLLL7.LIZJ(gsonLIZLLL7.LJIJJLI(objLIZLLL4), Float.class);
                } catch (Exception e7) {
                    TryCatchGuardChecker.doCheck(e7);
                }
            } else if (objLIZLLL4 instanceof List) {
                try {
                    Type type4 = new TypeToken<Float>() { // from class: X.14P3
                    }.getType();
                    if (List.class.isAssignableFrom(Float.class)) {
                        C1227904rF.LIZ.getClass();
                        Gson gsonLIZLLL8 = C1227904rF.LIZLLL();
                        objLIZLLL4 = gsonLIZLLL8.LIZLLL(gsonLIZLLL8.LJIJJLI(objLIZLLL4), type4);
                    }
                } catch (Exception e8) {
                    TryCatchGuardChecker.doCheck(e8);
                }
            } else if ((objLIZLLL4 instanceof String) && List.class.isAssignableFrom(Float.class)) {
                objLIZLLL4 = C14P7.LJJ((String) objLIZLLL4);
            }
        }
        if (!(objLIZLLL4 instanceof Float)) {
            objLIZLLL4 = null;
        }
        Float f2 = (Float) objLIZLLL4;
        Object obj5 = ((LinkedHashMap) this.LJFF).get("extraCutoutSize");
        if (!(obj5 instanceof Float)) {
            obj5 = null;
        }
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("updateCacheIfNeeded: cachedValue = ");
        sbLIZ7.append(obj5);
        sbLIZ7.append(", castValue = ");
        sbLIZ7.append(f2);
        C2188811AlT.LIZIZ(sbLIZ7);
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("updateCacheIfNeeded: isInitializing = ");
        sbLIZ8.append(z);
        sbLIZ8.append(" !cachedValue.deepEquals(castValue):");
        sbLIZ8.append(!C14P7.LIZ(obj5, f2));
        C2188811AlT.LIZIZ(sbLIZ8);
        if (!C14P7.LIZ(obj5, f2)) {
            if (f2 != null) {
                fFloatValue3 = f2.floatValue();
            }
            view.setExtraItemSpacingDp(fFloatValue3);
            this.LJFF.put("extraCutoutSize", f2);
        } else if (z) {
            if (f2 != null) {
                fFloatValue3 = f2.floatValue();
            }
            view.setExtraItemSpacingDp(fFloatValue3);
        }
        NimbleViewProps nimbleViewProps5 = templateData.props;
        if (nimbleViewProps5 != null && (str3 = nimbleViewProps5.totalCount) != null) {
            objLIZLLL5 = LJ(str3);
        } else {
            objLIZLLL5 = null;
        }
        if (Integer.class == Double.class) {
            objLIZLLL5 = C20252814Mk.LIZ(objLIZLLL5);
        } else if (Integer.class == Float.class) {
            objLIZLLL5 = C20252814Mk.LIZIZ(objLIZLLL5);
        } else if (Integer.class == Integer.class) {
            objLIZLLL5 = C20252814Mk.LIZJ(objLIZLLL5);
        } else if (Integer.class == Long.class) {
            objLIZLLL5 = C20252814Mk.LIZLLL(objLIZLLL5);
        } else if (Integer.class == String.class) {
            if (objLIZLLL5 != null) {
                objLIZLLL5 = objLIZLLL5.toString();
            } else {
                objLIZLLL5 = null;
            }
        } else if (Integer.class != String.class && Integer.class != Map.class) {
            if ((objLIZLLL5 instanceof Map) && !Map.class.isAssignableFrom(Integer.class)) {
                try {
                    C1227904rF.LIZ.getClass();
                    Gson gsonLIZLLL9 = C1227904rF.LIZLLL();
                    objLIZLLL5 = gsonLIZLLL9.LIZJ(gsonLIZLLL9.LJIJJLI(objLIZLLL5), Integer.class);
                } catch (Exception e9) {
                    TryCatchGuardChecker.doCheck(e9);
                }
            } else if (objLIZLLL5 instanceof List) {
                try {
                    Type type5 = new TypeToken<Integer>() { // from class: X.14P4
                    }.getType();
                    if (List.class.isAssignableFrom(Integer.class)) {
                        C1227904rF.LIZ.getClass();
                        Gson gsonLIZLLL10 = C1227904rF.LIZLLL();
                        objLIZLLL5 = gsonLIZLLL10.LIZLLL(gsonLIZLLL10.LJIJJLI(objLIZLLL5), type5);
                    }
                } catch (Exception e10) {
                    TryCatchGuardChecker.doCheck(e10);
                }
            } else if ((objLIZLLL5 instanceof String) && List.class.isAssignableFrom(Integer.class)) {
                objLIZLLL5 = C14P7.LJJ((String) objLIZLLL5);
            }
        }
        if (!(objLIZLLL5 instanceof Integer)) {
            objLIZLLL5 = null;
        }
        Integer num = (Integer) objLIZLLL5;
        Object obj6 = ((LinkedHashMap) this.LJFF).get("totalCount");
        if (!(obj6 instanceof Integer)) {
            obj6 = null;
        }
        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
        sbLIZ9.append("updateCacheIfNeeded: cachedValue = ");
        sbLIZ9.append(obj6);
        sbLIZ9.append(", castValue = ");
        sbLIZ9.append(num);
        C2188811AlT.LIZIZ(sbLIZ9);
        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
        sbLIZ10.append("updateCacheIfNeeded: isInitializing = ");
        sbLIZ10.append(z);
        sbLIZ10.append(" !cachedValue.deepEquals(castValue):");
        sbLIZ10.append(!C14P7.LIZ(obj6, num));
        C2188811AlT.LIZIZ(sbLIZ10);
        int iIntValue = 0;
        if (!C14P7.LIZ(obj6, num)) {
            if (num != null) {
                iIntValue = num.intValue();
            }
            view.setTotalCount(iIntValue);
            this.LJFF.put("totalCount", num);
        } else if (z) {
            if (num != null) {
                iIntValue = num.intValue();
            }
            view.setTotalCount(iIntValue);
        }
        NimbleViewProps nimbleViewProps6 = templateData.props;
        if (nimbleViewProps6 != null && (str2 = nimbleViewProps6.maxImageCount) != null) {
            objLIZLLL6 = LJ(str2);
        } else {
            objLIZLLL6 = null;
        }
        if (Integer.class == Double.class) {
            objLIZLLL6 = C20252814Mk.LIZ(objLIZLLL6);
        } else if (Integer.class == Float.class) {
            objLIZLLL6 = C20252814Mk.LIZIZ(objLIZLLL6);
        } else if (Integer.class == Integer.class) {
            objLIZLLL6 = C20252814Mk.LIZJ(objLIZLLL6);
        } else if (Integer.class == Long.class) {
            objLIZLLL6 = C20252814Mk.LIZLLL(objLIZLLL6);
        } else if (Integer.class == String.class) {
            if (objLIZLLL6 != null) {
                objLIZLLL6 = objLIZLLL6.toString();
            } else {
                objLIZLLL6 = null;
            }
        } else if (Integer.class != String.class && Integer.class != Map.class) {
            if ((objLIZLLL6 instanceof Map) && !Map.class.isAssignableFrom(Integer.class)) {
                try {
                    C1227904rF.LIZ.getClass();
                    Gson gsonLIZLLL11 = C1227904rF.LIZLLL();
                    objLIZLLL6 = gsonLIZLLL11.LIZJ(gsonLIZLLL11.LJIJJLI(objLIZLLL6), Integer.class);
                } catch (Exception e11) {
                    TryCatchGuardChecker.doCheck(e11);
                }
            } else if (objLIZLLL6 instanceof List) {
                try {
                    Type type6 = new TypeToken<Integer>() { // from class: X.14P5
                    }.getType();
                    if (List.class.isAssignableFrom(Integer.class)) {
                        C1227904rF.LIZ.getClass();
                        Gson gsonLIZLLL12 = C1227904rF.LIZLLL();
                        objLIZLLL6 = gsonLIZLLL12.LIZLLL(gsonLIZLLL12.LJIJJLI(objLIZLLL6), type6);
                    }
                } catch (Exception e12) {
                    TryCatchGuardChecker.doCheck(e12);
                }
            } else if ((objLIZLLL6 instanceof String) && List.class.isAssignableFrom(Integer.class)) {
                objLIZLLL6 = C14P7.LJJ((String) objLIZLLL6);
            }
        }
        if (!(objLIZLLL6 instanceof Integer)) {
            objLIZLLL6 = null;
        }
        Integer num2 = (Integer) objLIZLLL6;
        Object obj7 = ((LinkedHashMap) this.LJFF).get("maxImageCount");
        if (!(obj7 instanceof Integer)) {
            obj7 = null;
        }
        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
        sbLIZ11.append("updateCacheIfNeeded: cachedValue = ");
        sbLIZ11.append(obj7);
        sbLIZ11.append(", castValue = ");
        sbLIZ11.append(num2);
        C2188811AlT.LIZIZ(sbLIZ11);
        StringBuilder sbLIZ12 = C2188811AlT.LIZ();
        sbLIZ12.append("updateCacheIfNeeded: isInitializing = ");
        sbLIZ12.append(z);
        sbLIZ12.append(" !cachedValue.deepEquals(castValue):");
        sbLIZ12.append(!C14P7.LIZ(obj7, num2));
        C2188811AlT.LIZIZ(sbLIZ12);
        int iIntValue2 = 3;
        if (!C14P7.LIZ(obj7, num2)) {
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            }
            view.setMaxImageNum(iIntValue2);
            this.LJFF.put("maxImageCount", num2);
        } else if (z) {
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            }
            view.setMaxImageNum(iIntValue2);
        }
        NimbleViewProps nimbleViewProps7 = templateData.props;
        if (nimbleViewProps7 != null && (str = nimbleViewProps7.placeholder) != null) {
            objLIZLLL7 = LJ(str);
        } else {
            objLIZLLL7 = null;
        }
        if (Integer.class == Double.class) {
            objLIZLLL7 = C20252814Mk.LIZ(objLIZLLL7);
        } else if (Integer.class == Float.class) {
            objLIZLLL7 = C20252814Mk.LIZIZ(objLIZLLL7);
        } else if (Integer.class == Integer.class) {
            objLIZLLL7 = C20252814Mk.LIZJ(objLIZLLL7);
        } else if (Integer.class == Long.class) {
            objLIZLLL7 = C20252814Mk.LIZLLL(objLIZLLL7);
        } else if (Integer.class == String.class) {
            if (objLIZLLL7 != null) {
                objLIZLLL7 = objLIZLLL7.toString();
            } else {
                objLIZLLL7 = null;
            }
        } else if (Integer.class != String.class && Integer.class != Map.class) {
            if ((objLIZLLL7 instanceof Map) && !Map.class.isAssignableFrom(Integer.class)) {
                try {
                    C1227904rF.LIZ.getClass();
                    Gson gsonLIZLLL13 = C1227904rF.LIZLLL();
                    objLIZLLL7 = gsonLIZLLL13.LIZJ(gsonLIZLLL13.LJIJJLI(objLIZLLL7), Integer.class);
                } catch (Exception e13) {
                    TryCatchGuardChecker.doCheck(e13);
                }
            } else if (objLIZLLL7 instanceof List) {
                try {
                    Type type7 = new TypeToken<Integer>() { // from class: X.14P6
                    }.getType();
                    if (List.class.isAssignableFrom(Integer.class)) {
                        C1227904rF.LIZ.getClass();
                        Gson gsonLIZLLL14 = C1227904rF.LIZLLL();
                        objLIZLLL7 = gsonLIZLLL14.LIZLLL(gsonLIZLLL14.LJIJJLI(objLIZLLL7), type7);
                    }
                } catch (Exception e14) {
                    TryCatchGuardChecker.doCheck(e14);
                }
            } else if ((objLIZLLL7 instanceof String) && List.class.isAssignableFrom(Integer.class)) {
                objLIZLLL7 = C14P7.LJJ((String) objLIZLLL7);
            }
        }
        if (!(objLIZLLL7 instanceof Integer)) {
            objLIZLLL7 = null;
        }
        Integer num3 = (Integer) objLIZLLL7;
        Object obj8 = ((LinkedHashMap) this.LJFF).get("placeholder");
        if (obj8 instanceof Integer) {
            obj = obj8;
        }
        StringBuilder sbLIZ13 = C2188811AlT.LIZ();
        sbLIZ13.append("updateCacheIfNeeded: cachedValue = ");
        sbLIZ13.append(obj);
        sbLIZ13.append(", castValue = ");
        sbLIZ13.append(num3);
        C2188811AlT.LIZIZ(sbLIZ13);
        StringBuilder sbLIZ14 = C2188811AlT.LIZ();
        sbLIZ14.append("updateCacheIfNeeded: isInitializing = ");
        sbLIZ14.append(z);
        sbLIZ14.append(" !cachedValue.deepEquals(castValue):");
        sbLIZ14.append(!C14P7.LIZ(obj, num3));
        C2188811AlT.LIZIZ(sbLIZ14);
        if (!C14P7.LIZ(obj, num3)) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZ = num3;
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LJIIL.getSizeDp())));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LJIIL.getSizeDp())));
            this.LJIILIIL = c384050F3z.LIZ(view.getContext());
            this.LJFF.put("placeholder", num3);
            return;
        }
        if (!z) {
            return;
        }
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZ = num3;
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        c384050F3z2.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LJIIL.getSizeDp())));
        c384050F3z2.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LJIIL.getSizeDp())));
        this.LJIILIIL = c384050F3z2.LIZ(view.getContext());
    }

    @Override // X.C14NT, X.C14NX
    public final void LJIILJJIL(Map<String, ? extends Object> map, C14NF c14nf) {
        String str;
        String str2;
        Object objLIZLLL;
        int iIntValue;
        LoopVariables loopVariables;
        Object objLJIIZILJ;
        int iIntValue2;
        Object objLJJ;
        Unit unit;
        NimbleViewProps nimbleViewProps;
        String str3;
        NimbleViewProps nimbleViewProps2;
        String str4;
        NimbleViewProps nimbleViewProps3;
        String str5;
        Object objLJIIZILJ2;
        Integer numLIZJ;
        String str6;
        Object objLJIIZILJ3;
        super.LJIILJJIL(map, c14nf);
        TemplateData templateData = this.LJIIIZ;
        if (templateData != null) {
            str = templateData.variable;
        } else {
            str = null;
        }
        int i = 0;
        if (C123100dR.LIZ(str) && templateData != null && templateData.loopVariables != null) {
            if (templateData != null) {
                str2 = templateData.loopType;
            } else {
                str2 = null;
            }
            if (Intrinsics.LJFF(str2, "_loop")) {
                TemplateData templateData2 = this.LJIIIZ;
                if (templateData2 != null && (str6 = templateData2.variable) != null && (objLJIIZILJ3 = LJIIZILJ(str6)) != null) {
                    objLIZLLL = LJ(objLJIIZILJ3);
                } else {
                    objLIZLLL = null;
                }
                if (List.class == Double.class) {
                    objLIZLLL = C20252814Mk.LIZ(objLIZLLL);
                } else if (List.class == Float.class) {
                    objLIZLLL = C20252814Mk.LIZIZ(objLIZLLL);
                } else if (List.class == Integer.class) {
                    objLIZLLL = C20252814Mk.LIZJ(objLIZLLL);
                } else if (List.class == Long.class) {
                    objLIZLLL = C20252814Mk.LIZLLL(objLIZLLL);
                } else if (List.class == String.class) {
                    if (objLIZLLL != null) {
                        objLIZLLL = objLIZLLL.toString();
                    } else {
                        objLIZLLL = null;
                    }
                } else if (List.class != String.class && List.class != Map.class) {
                    if ((objLIZLLL instanceof Map) && !Map.class.isAssignableFrom(List.class)) {
                        try {
                            C1227904rF.LIZ.getClass();
                            Gson gsonLIZLLL = C1227904rF.LIZLLL();
                            objLIZLLL = gsonLIZLLL.LIZJ(gsonLIZLLL.LJIJJLI(objLIZLLL), List.class);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } else if (objLIZLLL instanceof List) {
                        try {
                            Type type = new TypeToken<List<?>>() { // from class: X.14Oz
                            }.getType();
                            if (List.class.isAssignableFrom(List.class)) {
                                C1227904rF.LIZ.getClass();
                                Gson gsonLIZLLL2 = C1227904rF.LIZLLL();
                                objLIZLLL = gsonLIZLLL2.LIZLLL(gsonLIZLLL2.LJIJJLI(objLIZLLL), type);
                            }
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    } else if ((objLIZLLL instanceof String) && List.class.isAssignableFrom(List.class)) {
                        objLIZLLL = C14P7.LJJ((String) objLIZLLL);
                    }
                }
                if (!(objLIZLLL instanceof List)) {
                    objLIZLLL = null;
                }
                List list = (List) objLIZLLL;
                Object obj = ((LinkedHashMap) this.LJFF).get("avatarList");
                if (!(obj instanceof List)) {
                    obj = null;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateCacheIfNeeded: cachedValue = ");
                sbLIZ.append(obj);
                sbLIZ.append(", castValue = ");
                sbLIZ.append(list);
                C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("updateCacheIfNeeded: isInitializing = ");
                sbLIZ2.append(false);
                sbLIZ2.append(" !cachedValue.deepEquals(castValue):");
                sbLIZ2.append(true ^ C14P7.LIZ(obj, list));
                C2188811AlT.LIZIZ(sbLIZ2);
                if (C14P7.LIZ(obj, list) || list == null) {
                    return;
                }
                int size = list.size();
                TemplateData templateData3 = this.LJIIIZ;
                if (templateData3 != null && (nimbleViewProps3 = templateData3.props) != null && (str5 = nimbleViewProps3.maxImageCount) != null && (objLJIIZILJ2 = LJIIZILJ(str5)) != null && (numLIZJ = C20252814Mk.LIZJ(objLJIIZILJ2)) != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 3;
                }
                int i2 = iIntValue + 1;
                if (size == i2) {
                    iIntValue = i2;
                }
                getView().setTotalCount(size);
                getView().setMaxImageNum(iIntValue);
                Iterator it2 = list.iterator();
                while (true) {
                    int i3 = i;
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        i++;
                        if (i3 >= 0) {
                            TemplateData templateData4 = this.LJIIIZ;
                            if (templateData4 != null) {
                                loopVariables = templateData4.loopVariables;
                            } else {
                                loopVariables = null;
                            }
                            Map<String, ? extends Object> mapLIZIZ = C14NE.LIZIZ(new C14ND(i3, loopVariables, next));
                            TemplateData templateData5 = this.LJIIIZ;
                            if (templateData5 != null && (nimbleViewProps2 = templateData5.props) != null && (str4 = nimbleViewProps2.maxImageCount) != null) {
                                objLJIIZILJ = LJIIZILJ(str4);
                            } else {
                                objLJIIZILJ = null;
                            }
                            Integer numLIZJ2 = C20252814Mk.LIZJ(objLJIIZILJ);
                            if (numLIZJ2 != null) {
                                iIntValue2 = numLIZJ2.intValue();
                            } else {
                                iIntValue2 = 3;
                            }
                            if (i3 <= iIntValue2) {
                                TemplateData templateData6 = this.LJIIIZ;
                                if (templateData6 != null && (nimbleViewProps = templateData6.props) != null && (str3 = nimbleViewProps.url) != null) {
                                    objLJJ = LJJ(str3, mapLIZIZ);
                                } else {
                                    objLJJ = null;
                                }
                                if (objLJJ == null) {
                                    unit = null;
                                } else {
                                    try {
                                        C427760Gpy.LIZ(getView(), i3, objLJJ, null, "nimble_card", null, false, new AwS396S0200000_30(this, (C20259314Ox) mapLIZIZ, (Map<String, ? extends Object>) 66), 984);
                                        unit = Unit.LIZ;
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        C189200o6.m2constructorimpl(new C098200Yq(th));
                                    }
                                }
                                C189200o6.m2constructorimpl(unit);
                            }
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    } else {
                        this.LJFF.put("avatarList", list);
                        return;
                    }
                }
            }
        }
    }
}
