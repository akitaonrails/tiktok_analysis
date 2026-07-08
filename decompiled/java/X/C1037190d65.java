package X;

import Y.ARunnableS2S0111000_16;
import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0d65, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1037190d65 extends C09AY implements InterfaceC1631620sYq<Boolean, Integer, Boolean, Unit> {
    public final /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LL;
    public final /* synthetic */ SparkContext LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1037190d65(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, SparkContext sparkContext, boolean z) {
        super(3);
        this.LL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        this.LLILLJJLI = sparkContext;
        this.LLILLL = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Boolean bool, Integer num, Boolean bool2) {
        final C1035880d3y c1035880d3y;
        int downY;
        int currentOffset;
        final InterfaceC1036210d4V interfaceC1036210d4V;
        Integer numValueOf;
        long j;
        C1035880d3y c1035880d3y2;
        C1035880d3y c1035880d3y3;
        boolean z;
        String str;
        String currentUrl;
        T tLJFF;
        T tLJFF2;
        final boolean zBooleanValue = bool.booleanValue();
        final int iIntValue = num.intValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        if (this.LL.hasFocus()) {
            C1041180dCW.LJ = zBooleanValue;
            C1041180dCW c1041180dCW = C1041180dCW.LIZ;
            SparkContext sparkContext = this.LLILLJJLI;
            final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LL;
            final boolean z2 = this.LLILLL;
            c1041180dCW.getClass();
            boolean z3 = false;
            if (!C04WF.LIZ()) {
                j = 100;
            } else {
                if (sparkContext != null) {
                    c1035880d3y = (C1035880d3y) sparkContext.LJFF(C1035880d3y.class);
                } else {
                    c1035880d3y = null;
                }
                final C118300cf c118300cf = new C118300cf();
                if (c1035880d3y != null) {
                    downY = (int) c1035880d3y.getDownY();
                } else {
                    downY = 0;
                }
                c118300cf.element = downY;
                final C118300cf c118300cf2 = new C118300cf();
                if (c1035880d3y != null) {
                    currentOffset = c1035880d3y.getCurrentOffset();
                } else {
                    currentOffset = 0;
                }
                c118300cf2.element = currentOffset;
                if (sparkContext != null) {
                    interfaceC1036210d4V = (InterfaceC1036210d4V) sparkContext.LJFF(InterfaceC1036210d4V.class);
                } else {
                    interfaceC1036210d4V = null;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("lastTouchY ");
                sbLIZ.append(c118300cf.element);
                sbLIZ.append(" currentScrollY ");
                if (c1035880d3y != null) {
                    numValueOf = Integer.valueOf(c1035880d3y.getCurrentOffset());
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                C2188811AlT.LIZIZ(sbLIZ);
                C786410Ut5.LJLIIL(100L, C1041180dCW.LJFF, new Runnable() { // from class: X.0d4W
                    public final void LIZ() {
                        C118300cf c118300cf3 = c118300cf;
                        C1035880d3y c1035880d3y4 = c1035880d3y;
                        c118300cf3.element = c1035880d3y4 != null ? (int) c1035880d3y4.getDownY() : 0;
                        C1035880d3y c1035880d3y5 = c1035880d3y;
                        int currentOffset2 = c1035880d3y5 != null ? c1035880d3y5.getCurrentOffset() : 0;
                        InterfaceC1036210d4V interfaceC1036210d4V2 = interfaceC1036210d4V;
                        if (interfaceC1036210d4V2 != null && interfaceC1036210d4V2.getAnimatorIsRunning() && zBooleanValue) {
                            return;
                        }
                        InterfaceC1036210d4V interfaceC1036210d4V3 = interfaceC1036210d4V;
                        if (interfaceC1036210d4V3 != null) {
                            interfaceC1036210d4V3.getView();
                        }
                        int iLIZJ = z2 ? (int) C12ES.LIZJ(64.5f, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getContext()) : 0;
                        if (!zBooleanValue) {
                            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2);
                            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.setTranslationY(0.0f);
                            return;
                        }
                        Context context = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getContext();
                        int iLJIIIIZZ = (C12ES.LJIIIIZZ(context != null ? C1388190mED.LIZ(context) : null) - iIntValue) - iLIZJ;
                        int i = c118300cf.element;
                        if (i <= iLJIIIIZZ || currentOffset2 != c118300cf2.element) {
                            return;
                        }
                        int i2 = (i - iLJIIIIZZ) + 100;
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3);
                        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3.setTranslationY(i2 * (-1.0f));
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("AdAutofillKeyboardManager@6061.onKeyboardChange$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("AdAutofillKeyboardManager@6061.onKeyboardChange$1");
                    }
                });
                j = 100;
            }
            SparkContext sparkContext2 = this.LLILLJJLI;
            if (sparkContext2 != null) {
                c1035880d3y2 = (C1035880d3y) sparkContext2.LJFF(C1035880d3y.class);
            } else {
                c1035880d3y2 = null;
            }
            if (!C291640Bbu.LIZ()) {
                z = false;
            } else {
                if (sparkContext2 != null) {
                    c1035880d3y3 = (C1035880d3y) sparkContext2.LJFF(C1035880d3y.class);
                } else {
                    c1035880d3y3 = null;
                }
                z = !C1041180dCW.LIZ(c1035880d3y3);
            }
            boolean zLIZ = C1041180dCW.LIZ(c1035880d3y2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("handleAutofillKeyboardListener enter: keyboardShow=");
            sbLIZ2.append(zBooleanValue);
            sbLIZ2.append(" keyboardHeight=");
            sbLIZ2.append(iIntValue);
            sbLIZ2.append(" isUpdateHeight=");
            sbLIZ2.append(zBooleanValue2);
            sbLIZ2.append(" containerId=");
            if (sparkContext2 != null) {
                str = sparkContext2.containerId;
            } else {
                str = null;
            }
            sbLIZ2.append(str);
            sbLIZ2.append(" enableAutofillKeyboard=");
            sbLIZ2.append(z);
            sbLIZ2.append(" isLeadAd=");
            sbLIZ2.append(zLIZ);
            sbLIZ2.append(" currentUrl=");
            if (c1035880d3y2 != null) {
                currentUrl = c1035880d3y2.getCurrentUrl();
            } else {
                currentUrl = null;
            }
            sbLIZ2.append(currentUrl);
            C2188811AlT.LIZIZ(sbLIZ2);
            if (z && !zLIZ) {
                C259800zU c259800zU = new C259800zU();
                if (sparkContext2 != null) {
                    tLJFF = sparkContext2.LJFF(InterfaceC1036190d4T.class);
                } else {
                    tLJFF = 0;
                }
                c259800zU.element = tLJFF;
                if (zBooleanValue) {
                    if (tLJFF == 0) {
                        if (sparkContext2 != null) {
                            String str2 = sparkContext2.containerId;
                            if (str2 != null) {
                                C1440005kM.LIZ(new C1036410d4p(str2));
                            }
                            tLJFF2 = sparkContext2.LJFF(InterfaceC1036190d4T.class);
                        }
                        tLJFF2 = 0;
                    } else if (sparkContext2 != null) {
                        tLJFF2 = sparkContext2.LJFF(InterfaceC1036190d4T.class);
                    } else {
                        tLJFF2 = 0;
                    }
                    c259800zU.element = tLJFF2;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("handleAutofillKeyboardListener show branch: hasCoverView=");
                    if (c259800zU.element != 0) {
                        z3 = true;
                    }
                    sbLIZ3.append(z3);
                    sbLIZ3.append(" useDelayed=");
                    sbLIZ3.append(C04WF.LIZ());
                    C2188811AlT.LIZIZ(sbLIZ3);
                    if (C04WF.LIZ()) {
                        C786410Ut5.LJLIIL(j, C1041180dCW.LJFF, new ARunnableS2S0111000_16(c259800zU, iIntValue, zBooleanValue2, 2));
                    } else {
                        InterfaceC1036190d4T interfaceC1036190d4T = (InterfaceC1036190d4T) c259800zU.element;
                        if (interfaceC1036190d4T != null) {
                            interfaceC1036190d4T.LJIIJJI(iIntValue, zBooleanValue2);
                        }
                    }
                } else {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("handleAutofillKeyboardListener hide branch: hasCoverView=");
                    if (c259800zU.element != 0) {
                        z3 = true;
                    }
                    sbLIZ4.append(z3);
                    C2188811AlT.LIZIZ(sbLIZ4);
                    InterfaceC1036190d4T interfaceC1036190d4T2 = (InterfaceC1036190d4T) c259800zU.element;
                    if (interfaceC1036190d4T2 != null) {
                        interfaceC1036190d4T2.LIZLLL();
                    }
                    C0P0T c0p0t = C1041180dCW.LIZJ;
                    if (c0p0t != null) {
                        c0p0t.dismiss();
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
