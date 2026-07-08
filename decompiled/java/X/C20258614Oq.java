package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.nimblecard.tako.context.NimbleTemplateContext;
import com.ss.android.ugc.aweme.nimblecard.tako.model.NimbleViewProps;
import com.ss.android.ugc.aweme.nimblecard.tako.model.TemplateData;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.14Oq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20258614Oq extends C14NT<C1860130yVP> {
    public final C01GW LJIIL;

    public C20258614Oq(NimbleTemplateContext nimbleTemplateContext) {
        super(nimbleTemplateContext);
        this.LJIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 989));
    }

    @Override // X.C14NT, X.C14NX
    public final void LJII(TemplateData templateData) {
        super.LJII(templateData);
        C1860130yVP view = getView();
        C1859900yV2.LIZIZ.LJFF(view.getContext(), view, 111, R.attr.a1h);
    }

    @Override // X.C14NT
    public final View LJJIII(Context context) {
        return new C1860130yVP(context, null, 6, 0);
    }

    @Override // X.C14NT
    public final void LJJIIJZLJL(boolean z) {
        Object objLIZLLL;
        Object objLIZLLL2;
        NimbleViewProps nimbleViewProps;
        String str;
        NimbleViewProps nimbleViewProps2;
        String str2;
        super.LJJIIJZLJL(z);
        TemplateData templateData = this.LJIIIZ;
        Object obj = null;
        if (templateData != null && (nimbleViewProps2 = templateData.props) != null && (str2 = nimbleViewProps2.textColor) != null) {
            objLIZLLL = LJ(str2);
        } else {
            objLIZLLL = null;
        }
        if (Integer.class == Double.class) {
            objLIZLLL = C20252814Mk.LIZ(objLIZLLL);
        } else if (Integer.class == Float.class) {
            objLIZLLL = C20252814Mk.LIZIZ(objLIZLLL);
        } else if (Integer.class == Integer.class) {
            objLIZLLL = C20252814Mk.LIZJ(objLIZLLL);
        } else if (Integer.class == Long.class) {
            objLIZLLL = C20252814Mk.LIZLLL(objLIZLLL);
        } else if (Integer.class == String.class) {
            if (objLIZLLL != null) {
                objLIZLLL = objLIZLLL.toString();
            } else {
                objLIZLLL = null;
            }
        } else if (Integer.class != String.class && Integer.class != Map.class) {
            if ((objLIZLLL instanceof Map) && !Map.class.isAssignableFrom(Integer.class)) {
                try {
                    C1227904rF.LIZ.getClass();
                    Gson gsonLIZLLL = C1227904rF.LIZLLL();
                    objLIZLLL = gsonLIZLLL.LIZJ(gsonLIZLLL.LJIJJLI(objLIZLLL), Integer.class);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else if (objLIZLLL instanceof List) {
                try {
                    Type type = new TypeToken<Integer>() { // from class: X.14Os
                    }.getType();
                    if (List.class.isAssignableFrom(Integer.class)) {
                        C1227904rF.LIZ.getClass();
                        Gson gsonLIZLLL2 = C1227904rF.LIZLLL();
                        objLIZLLL = gsonLIZLLL2.LIZLLL(gsonLIZLLL2.LJIJJLI(objLIZLLL), type);
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            } else if ((objLIZLLL instanceof String) && List.class.isAssignableFrom(Integer.class)) {
                objLIZLLL = C14P7.LJJ((String) objLIZLLL);
            }
        }
        if (!(objLIZLLL instanceof Integer)) {
            objLIZLLL = null;
        }
        Integer num = (Integer) objLIZLLL;
        Object obj2 = ((LinkedHashMap) this.LJFF).get("color");
        if (!(obj2 instanceof Integer)) {
            obj2 = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateCacheIfNeeded: cachedValue = ");
        sbLIZ.append(obj2);
        sbLIZ.append(", castValue = ");
        sbLIZ.append(num);
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateCacheIfNeeded: isInitializing = ");
        sbLIZ2.append(z);
        sbLIZ2.append(" !cachedValue.deepEquals(castValue):");
        sbLIZ2.append(!C14P7.LIZ(obj2, num));
        C2188811AlT.LIZIZ(sbLIZ2);
        if (!C14P7.LIZ(obj2, num)) {
            if (num != null) {
                getView().setTextColor(num.intValue());
            }
            this.LJFF.put("color", num);
        } else if (z && num != null) {
            getView().setTextColor(num.intValue());
        }
        TemplateData templateData2 = this.LJIIIZ;
        if (templateData2 != null && (nimbleViewProps = templateData2.props) != null && (str = nimbleViewProps.font) != null) {
            objLIZLLL2 = LJ(str);
        } else {
            objLIZLLL2 = null;
        }
        if (Integer.class == Double.class) {
            objLIZLLL2 = C20252814Mk.LIZ(objLIZLLL2);
        } else if (Integer.class == Float.class) {
            objLIZLLL2 = C20252814Mk.LIZIZ(objLIZLLL2);
        } else if (Integer.class == Integer.class) {
            objLIZLLL2 = C20252814Mk.LIZJ(objLIZLLL2);
        } else if (Integer.class == Long.class) {
            objLIZLLL2 = C20252814Mk.LIZLLL(objLIZLLL2);
        } else if (Integer.class == String.class) {
            if (objLIZLLL2 != null) {
                objLIZLLL2 = objLIZLLL2.toString();
            } else {
                objLIZLLL2 = null;
            }
        } else if (Integer.class != String.class && Integer.class != Map.class) {
            if ((objLIZLLL2 instanceof Map) && !Map.class.isAssignableFrom(Integer.class)) {
                try {
                    C1227904rF.LIZ.getClass();
                    Gson gsonLIZLLL3 = C1227904rF.LIZLLL();
                    objLIZLLL2 = gsonLIZLLL3.LIZJ(gsonLIZLLL3.LJIJJLI(objLIZLLL2), Integer.class);
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
            } else if (objLIZLLL2 instanceof List) {
                try {
                    Type type2 = new TypeToken<Integer>() { // from class: X.14Ot
                    }.getType();
                    if (List.class.isAssignableFrom(Integer.class)) {
                        C1227904rF.LIZ.getClass();
                        Gson gsonLIZLLL4 = C1227904rF.LIZLLL();
                        objLIZLLL2 = gsonLIZLLL4.LIZLLL(gsonLIZLLL4.LJIJJLI(objLIZLLL2), type2);
                    }
                } catch (Exception e4) {
                    TryCatchGuardChecker.doCheck(e4);
                }
            } else if ((objLIZLLL2 instanceof String) && List.class.isAssignableFrom(Integer.class)) {
                objLIZLLL2 = C14P7.LJJ((String) objLIZLLL2);
            }
        }
        if (!(objLIZLLL2 instanceof Integer)) {
            objLIZLLL2 = null;
        }
        Integer num2 = (Integer) objLIZLLL2;
        Object obj3 = ((LinkedHashMap) this.LJFF).get("font");
        if (obj3 instanceof Integer) {
            obj = obj3;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("updateCacheIfNeeded: cachedValue = ");
        sbLIZ3.append(obj);
        sbLIZ3.append(", castValue = ");
        sbLIZ3.append(num2);
        C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("updateCacheIfNeeded: isInitializing = ");
        sbLIZ4.append(z);
        sbLIZ4.append(" !cachedValue.deepEquals(castValue):");
        sbLIZ4.append(!C14P7.LIZ(obj, num2));
        C2188811AlT.LIZIZ(sbLIZ4);
        if (!C14P7.LIZ(obj, num2)) {
            if (num2 != null) {
                int iIntValue = num2.intValue();
                C1860130yVP view = getView();
                C1859900yV2.LIZIZ.LJFF(view.getContext(), view, iIntValue, R.attr.a1i);
            }
            this.LJFF.put("font", num2);
            return;
        }
        if (!z || num2 == null) {
            return;
        }
        int iIntValue2 = num2.intValue();
        C1860130yVP view2 = getView();
        C1859900yV2.LIZIZ.LJFF(view2.getContext(), view2, iIntValue2, R.attr.a1i);
    }

    @Override // X.C14NT, X.C14NX
    public final void LJIILJJIL(Map<String, ? extends Object> map, C14NF c14nf) {
        Object objLIZLLL;
        NimbleViewProps nimbleViewProps;
        String str;
        super.LJIILJJIL(map, c14nf);
        TemplateData templateData = this.LJIIIZ;
        Object obj = null;
        if (templateData != null && (nimbleViewProps = templateData.props) != null && (str = nimbleViewProps.text) != null) {
            objLIZLLL = LJ(str);
        } else {
            objLIZLLL = null;
        }
        if (Object.class == Double.class) {
            objLIZLLL = C20252814Mk.LIZ(objLIZLLL);
        } else if (Object.class == Float.class) {
            objLIZLLL = C20252814Mk.LIZIZ(objLIZLLL);
        } else if (Object.class == Integer.class) {
            objLIZLLL = C20252814Mk.LIZJ(objLIZLLL);
        } else if (Object.class == Long.class) {
            objLIZLLL = C20252814Mk.LIZLLL(objLIZLLL);
        } else if (Object.class == String.class) {
            if (objLIZLLL != null) {
                objLIZLLL = objLIZLLL.toString();
            } else {
                objLIZLLL = null;
            }
        } else if (Object.class != String.class && Object.class != Map.class) {
            if ((objLIZLLL instanceof Map) && !Map.class.isAssignableFrom(Object.class)) {
                try {
                    C1227904rF.LIZ.getClass();
                    Gson gsonLIZLLL = C1227904rF.LIZLLL();
                    objLIZLLL = gsonLIZLLL.LIZJ(gsonLIZLLL.LJIJJLI(objLIZLLL), Object.class);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else if (objLIZLLL instanceof List) {
                try {
                    Type type = new TypeToken<Object>() { // from class: X.14Or
                    }.getType();
                    if (List.class.isAssignableFrom(Object.class)) {
                        C1227904rF.LIZ.getClass();
                        Gson gsonLIZLLL2 = C1227904rF.LIZLLL();
                        objLIZLLL = gsonLIZLLL2.LIZLLL(gsonLIZLLL2.LJIJJLI(objLIZLLL), type);
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            } else if ((objLIZLLL instanceof String) && List.class.isAssignableFrom(Object.class)) {
                objLIZLLL = C14P7.LJJ((String) objLIZLLL);
            }
        }
        if (!(objLIZLLL instanceof Object)) {
            objLIZLLL = null;
        }
        Object obj2 = ((LinkedHashMap) this.LJFF).get("text");
        if (obj2 instanceof Object) {
            obj = obj2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateCacheIfNeeded: cachedValue = ");
        sbLIZ.append(obj);
        sbLIZ.append(", castValue = ");
        sbLIZ.append(objLIZLLL);
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateCacheIfNeeded: isInitializing = ");
        sbLIZ2.append(true);
        sbLIZ2.append(" !cachedValue.deepEquals(castValue):");
        sbLIZ2.append(true ^ C14P7.LIZ(obj, objLIZLLL));
        C2188811AlT.LIZIZ(sbLIZ2);
        if (!C14P7.LIZ(obj, objLIZLLL)) {
            C1860130yVP view = getView();
            C1859900yV2.LIZIZ.LJIIIIZZ(view, String.valueOf(objLIZLLL), C1859250yTz.LIZ(view, this.LIZ), C1859250yTz.LIZJ(this.LIZ), new C689230R1t(this.LIZ), new C1859280yU2(this.LIZ), new C1859260yU0(this.LIZ), new C1859290yU3(this.LIZ), new C1859300yU4(this.LIZ));
            view.setOnLongClickListener(new ViewOnLongClickListenerC20307014d2(this, 1));
            this.LJFF.put("text", objLIZLLL);
            return;
        }
        C1860130yVP view2 = getView();
        C1859900yV2.LIZIZ.LJIIIIZZ(view2, String.valueOf(objLIZLLL), C1859250yTz.LIZ(view2, this.LIZ), C1859250yTz.LIZJ(this.LIZ), new C689230R1t(this.LIZ), new C1859280yU2(this.LIZ), new C1859260yU0(this.LIZ), new C1859290yU3(this.LIZ), new C1859300yU4(this.LIZ));
        view2.setOnLongClickListener(new ViewOnLongClickListenerC20307014d2(this, 1));
    }
}
