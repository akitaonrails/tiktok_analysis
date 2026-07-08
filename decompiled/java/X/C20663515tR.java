package X;

import android.content.Context;
import android.widget.PopupWindow;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushBanStrategy;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushFreqControlStrategy;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.innerpush.ui.InnerPushPopupWindow;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS1S0320000_31;
import kotlin.jvm.internal.AwS20S1210000_31;
import kotlin.jvm.internal.AwS61S0310000_31;

/* JADX INFO: renamed from: X.15tR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20663515tR implements InterfaceC539120LCk {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public WeakReference<InterfaceC20663615tS> LL;

    public final boolean LJ() {
        InterfaceC20663615tS interfaceC20663615tS;
        C20671715ul c20671715ul;
        InnerPushPopupWindow innerPushPopupWindow;
        C20663915tV c20663915tV;
        WeakReference<InterfaceC20663615tS> weakReference = this.LL;
        if ((weakReference != null ? weakReference.get() : null) instanceof C20663915tV) {
            WeakReference<InterfaceC20663615tS> weakReference2 = this.LL;
            interfaceC20663615tS = weakReference2 != null ? weakReference2.get() : null;
            if (!(interfaceC20663615tS instanceof C20663915tV) || (c20663915tV = (C20663915tV) interfaceC20663615tS) == null) {
                return false;
            }
            return c20663915tV.LLILLL.LLIZLLLIL;
        }
        WeakReference<InterfaceC20663615tS> weakReference3 = this.LL;
        if ((weakReference3 != null ? weakReference3.get() : null) instanceof InnerPushPopupWindow) {
            WeakReference<InterfaceC20663615tS> weakReference4 = this.LL;
            interfaceC20663615tS = weakReference4 != null ? weakReference4.get() : null;
            return (interfaceC20663615tS instanceof InnerPushPopupWindow) && (innerPushPopupWindow = (InnerPushPopupWindow) interfaceC20663615tS) != null && innerPushPopupWindow.isShowing() && innerPushPopupWindow.LLILLJJLI.getType() == 21;
        }
        WeakReference<InterfaceC20663615tS> weakReference5 = this.LL;
        if (!((weakReference5 != null ? weakReference5.get() : null) instanceof C20671715ul)) {
            return false;
        }
        WeakReference<InterfaceC20663615tS> weakReference6 = this.LL;
        interfaceC20663615tS = weakReference6 != null ? weakReference6.get() : null;
        return (interfaceC20663615tS instanceof C20671715ul) && (c20671715ul = (C20671715ul) interfaceC20663615tS) != null && c20671715ul.isShowing() && c20671715ul.LLILLJJLI.getType() == 21;
    }

    public final boolean LIZLLL(boolean z) {
        InterfaceC20663615tS interfaceC20663615tS;
        WeakReference<InterfaceC20663615tS> weakReference = this.LL;
        if (weakReference == null || (interfaceC20663615tS = weakReference.get()) == null || !interfaceC20663615tS.isShowing()) {
            if (z) {
                return false;
            }
            C19329910jp c19329910jp = C19329910jp.LIZ;
            c19329910jp.getClass();
            c19329910jp.getClass();
            if (!C19329910jp.LIZIZ) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C0Z9I
    public final void LIZ(int i, InnerPushMessage innerPushMessage, String str) {
        C10M5 c10m5 = C10M5.LIZ;
        Context contextLJFF = C2214201BlK.LJFF();
        InterfaceC20663615tS interfaceC20663615tS = null;
        if (!(contextLJFF instanceof C19EG) || contextLJFF == null) {
            contextLJFF = C1383370m6R.LIZ;
        }
        WeakReference<InterfaceC20663615tS> weakReference = this.LL;
        if (weakReference != null) {
            interfaceC20663615tS = weakReference.get();
        }
        c10m5.getClass();
        C10M5.LIZ(str, contextLJFF, interfaceC20663615tS, 3, innerPushMessage);
    }

    @Override // X.InterfaceC539120LCk
    public final void LIZIZ(String str, Function0 function0, boolean z) {
        C19331310k3.LJII(new AwS20S1210000_31(this, (C20663515tR) function0, (Function0<Unit>) z, (boolean) str, (String) 0));
    }

    public final void LJFF(InnerPushMessage innerPushMessage, boolean z, String str) {
        InnerPushFreqControlStrategy innerPushFreqControlStrategy;
        InnerPushBanStrategy innerPushBanStrategy;
        InnerPushFreqControlStrategy innerPushFreqControlStrategy2;
        InnerPushBanStrategy innerPushBanStrategy2;
        Object objLIZLLL;
        C20665115th.LIZ(innerPushMessage);
        if (z) {
            C19329510jl c19329510jl = C19329510jl.LIZ;
            EnumC19330310jt enumC19330310jt = EnumC19330310jt.CANCEL_BY_USER;
            c19329510jl.getClass();
            C19329510jl.LIZIZ(innerPushMessage, enumC19330310jt);
            InnerPushConfig config = innerPushMessage.getConfig();
            if (config != null && (innerPushFreqControlStrategy2 = config.freqControlStrategy) != null && (innerPushBanStrategy2 = innerPushFreqControlStrategy2.banStrategy) != null) {
                try {
                    objLIZLLL = JsonParseUtils.LIZLLL(InnerPushBanStrategy.class, C19329210ji.LJ().getString(C19329210ji.LIZ(innerPushBanStrategy2.id), ""));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C098200Yq c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    if (thM5exceptionOrNullimpl != null) {
                        C19331210k2 c19331210k2 = C19331210k2.LIZ;
                        EnumC19355710nz enumC19355710nz = EnumC19355710nz.JSON_PARSE_OBJECT;
                        String message = thM5exceptionOrNullimpl.getMessage();
                        c19331210k2.getClass();
                        C19331210k2.LJIIIZ(null, enumC19355710nz, message);
                    }
                    objLIZLLL = null;
                }
                InnerPushBanStrategy innerPushBanStrategy3 = (InnerPushBanStrategy) objLIZLLL;
                if (innerPushBanStrategy3 != null) {
                    List list = innerPushBanStrategy3.records;
                    if (list == null) {
                        list = C13BV.INSTANCE;
                    }
                    C19506911Tn c19506911Tn = new C19506911Tn(list, ((Number) com.ss.android.ugc.aweme.innerpush.settings.InnerPushConfig.LIZLLL.getValue()).intValue());
                    c19506911Tn.LIZ(Long.valueOf(System.currentTimeMillis()));
                    innerPushBanStrategy3.setRecords(c19506911Tn.LIZIZ);
                    Keva kevaLJ = C19329210ji.LJ();
                    String strLIZ = C19329210ji.LIZ(innerPushBanStrategy2.id);
                    C19329910jp.LIZ.getClass();
                    kevaLJ.storeString(strLIZ, C19329910jp.LIZJ(innerPushBanStrategy3));
                } else {
                    List list2 = innerPushBanStrategy2.records;
                    if (list2 == null) {
                        list2 = C13BV.INSTANCE;
                    }
                    C19506911Tn c19506911Tn2 = new C19506911Tn(list2, ((Number) com.ss.android.ugc.aweme.innerpush.settings.InnerPushConfig.LIZLLL.getValue()).intValue());
                    c19506911Tn2.LIZ(Long.valueOf(System.currentTimeMillis()));
                    innerPushBanStrategy2.setRecords(c19506911Tn2.LIZIZ);
                    Keva kevaLJ2 = C19329210ji.LJ();
                    String strLIZ2 = C19329210ji.LIZ(innerPushBanStrategy2.id);
                    C19329910jp.LIZ.getClass();
                    kevaLJ2.storeString(strLIZ2, C19329910jp.LIZJ(innerPushBanStrategy2));
                }
            }
        } else {
            InnerPushConfig config2 = innerPushMessage.getConfig();
            if (config2 != null && (innerPushFreqControlStrategy = config2.freqControlStrategy) != null && (innerPushBanStrategy = innerPushFreqControlStrategy.banStrategy) != null) {
                C19329210ji.LJ().erase(C19329210ji.LIZ(innerPushBanStrategy.id));
            }
            C19329510jl c19329510jl2 = C19329510jl.LIZ;
            EnumC19330310jt enumC19330310jt2 = EnumC19330310jt.DISAPPEAR;
            c19329510jl2.getClass();
            C19329510jl.LIZIZ(innerPushMessage, enumC19330310jt2);
        }
        int i = C20642815q6.LIZ;
        C20642815q6.LIZJ(innerPushMessage.getType(), innerPushMessage, z, str);
        C19331210k2.LIZ.getClass();
        C19331210k2.LJII(innerPushMessage, z);
        if (((Boolean) C261010AKt.LIZ.getValue()).booleanValue()) {
            this.LL = null;
        }
    }

    @Override // X.InterfaceC539120LCk
    public final void LIZJ(InnerPushMessage innerPushMessage, int[] iArr, boolean z, boolean z2) {
        C19331310k3.LJII(new AwS1S0320000_31(this, innerPushMessage, iArr, z, z2, 1));
    }

    public final void LJI(C19EG c19eg, final InnerPushMessage innerPushMessage, boolean z, final Function0<Unit> function0) {
        InterfaceC20663615tS c20663915tV;
        C20665215ti c20665215ti;
        C20663815tU c20663815tULJIIIZ;
        WeakReference<InterfaceC20663615tS> weakReference;
        InterfaceC20663615tS interfaceC20663615tS;
        if (LIZLLL(false) && (weakReference = this.LL) != null && (interfaceC20663615tS = weakReference.get()) != null) {
            interfaceC20663615tS.dismiss();
        }
        if (z) {
            if (C296900BkO.LIZ()) {
                c20663915tV = new C20671715ul(c19eg, innerPushMessage);
            } else {
                c20663915tV = new InnerPushPopupWindow(c19eg, innerPushMessage);
            }
        } else {
            c20663915tV = new C20663915tV(c19eg, innerPushMessage);
        }
        if (z && C296900BkO.LIZ()) {
            c20665215ti = null;
        } else {
            c20665215ti = new C20665215ti(c20663915tV, c19eg);
            c20665215ti.LIZIZ(innerPushMessage);
        }
        InterfaceC19330810jy interfaceC19330810jyLIZ = C20641815pw.LIZ(innerPushMessage.getType());
        if (interfaceC19330810jyLIZ != null && (c20663815tULJIIIZ = interfaceC19330810jyLIZ.LJIIIZ(this, innerPushMessage)) != null) {
            if (c20665215ti != null) {
                c20665215ti.LIZ(c20663815tULJIIIZ);
            }
            if (C296900BkO.LIZ()) {
                C1276704z7.LIZ(c20663815tULJIIIZ.LIZ, c20663815tULJIIIZ.LIZIZ);
            }
        }
        InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
        if (uiTemplate != null) {
            for (Map.Entry entry : ((ConcurrentHashMap) C20663315tP.LIZ.getValue()).entrySet()) {
                int iIntValue = ((Number) entry.getKey()).intValue();
                if (iIntValue != 1) {
                    if (iIntValue == 3) {
                        Object value = entry.getValue();
                        ((InterfaceC20663415tQ) value).LIZJ();
                        if (C13LQ.LJJIJ(uiTemplate.rightType, C0ZF6.LIZIZ) < 0) {
                            value = null;
                        }
                        InterfaceC20663415tQ interfaceC20663415tQ = (InterfaceC20663415tQ) value;
                        if (interfaceC20663415tQ != null) {
                            interfaceC20663415tQ.LIZIZ(this, innerPushMessage);
                        }
                    }
                } else {
                    Object value2 = entry.getValue();
                    ((InterfaceC20663415tQ) value2).LIZJ();
                    if (C13LQ.LJJIJ(uiTemplate.leftType, C0ZF6.LIZIZ) < 0) {
                        value2 = null;
                    }
                    InterfaceC20663415tQ interfaceC20663415tQ2 = (InterfaceC20663415tQ) value2;
                    if (interfaceC20663415tQ2 != null) {
                        interfaceC20663415tQ2.LIZIZ(this, innerPushMessage);
                    }
                }
            }
        }
        c20663915tV.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: X.15qL
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                C19290510dT.LIZIZ("InnerPushWindowManager", "popup window will dismiss");
                C20666215ts tracker = innerPushMessage.getTracker();
                C19329910jp.LIZ.getClass();
                tracker.LIZLLL = System.currentTimeMillis() - innerPushMessage.getTracker().LIZJ;
                C15O7.LJIIIIZZ(Mp4ScreenVideoLoadTimeout.CONTROL).LIZLLL(new C20749016Hg(innerPushMessage, 1));
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }
        });
        c20663915tV.LJJIII(c20665215ti, innerPushMessage);
        this.LL = new WeakReference<>(c20663915tV);
    }

    public static void LJII(C20663515tR c20663515tR, InnerPushMessage innerPushMessage, boolean z, C20665215ti c20665215ti, int i) {
        C20665215ti c20665215ti2 = c20665215ti;
        boolean z2 = z;
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            c20665215ti2 = null;
        }
        c20663515tR.getClass();
        C19331310k3.LJII(new AwS61S0310000_31(c20665215ti2, innerPushMessage, c20663515tR, z2, 1));
    }
}
