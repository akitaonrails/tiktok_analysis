package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS426S0200000_25;

/* JADX INFO: renamed from: X.0wsJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1797450wsJ {
    public static final C1797450wsJ LIZ = new C1797450wsJ();
    public static final C2252321DDq LIZIZ;
    public static DialogC1390150mHN LIZJ;
    public static final C01GW LIZLLL;
    public static Function0<Unit> LJ;
    public static Function1<? super Effect, Unit> LJFF;

    static {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(null);
        LIZIZ = c2252321DDqLIZ;
        C09IC.LIZIZ(c2252321DDqLIZ);
        LIZLLL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(96));
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C318940Ceq(null), 2);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0wVr] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0wsI] */
    public static void LIZ() {
        LIZIZ.setValue(new C1776470wKT(0));
        final ?? r3 = new IEffectDownloadProgressListener() { // from class: X.0wVr
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onStart(Effect effect) {
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(Effect effect) {
                Effect effect2 = effect;
                if (effect2 != null) {
                    C1797450wsJ.LIZIZ.setValue(new C1776930wLD(effect2));
                } else {
                    C1797450wsJ.LIZIZ.setValue(C1776950wLF.LIZ);
                }
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                C1797450wsJ.LIZIZ.setValue(C1776950wLF.LIZ);
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
            public final void onProgress(Effect effect, int i, long j) {
                C2252321DDq c2252321DDq = C1797450wsJ.LIZIZ;
                if (i < 10) {
                    i = 10;
                }
                c2252321DDq.setValue(new C1776470wKT(i));
            }
        };
        HashMap map = new HashMap();
        map.put("panel", "aiself_shooting");
        ?? r5 = new IFetchEffectListListener() { // from class: X.0wsI
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
            public final void onFail(ExceptionResult exceptionResult) {
                C1797450wsJ.LIZIZ.setValue(C1776950wLF.LIZ);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(List<Effect> list) {
                Effect effect;
                List<Effect> list2 = list;
                if (list2 != null && (effect = (Effect) C13LP.LJJJLL(list2)) != null) {
                    C1797450wsJ.LIZIZ.setValue(new C1776470wKT(10));
                    C1797450wsJ.LIZ.getClass();
                    ((InterfaceC1635410sex) C1797450wsJ.LIZLLL.getValue()).LIZJ(effect, r3);
                    return;
                }
                C1797450wsJ.LIZIZ.setValue(C1776950wLF.LIZ);
            }
        };
        AwS426S0200000_25 awS426S0200000_25 = new AwS426S0200000_25((Map) map, (Map<String, String>) r5, (C1797440wsI) 31);
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService == null) {
            r5.onFail(new ExceptionResult(-100001));
        } else if (creativeToolsPluginService.LJI(contextLIZ)) {
            awS426S0200000_25.invoke();
        } else {
            creativeToolsPluginService.LIZIZ(contextLIZ, false, awS426S0200000_25);
        }
    }

    public static void LIZLLL() {
        InterfaceC1776940wLE interfaceC1776940wLE = (InterfaceC1776940wLE) LIZIZ.getValue();
        if (((interfaceC1776940wLE instanceof C1776930wLD) && ((InterfaceC1635390sev) LIZLLL.getValue()).LJIJJLI(((C1776930wLD) interfaceC1776940wLE).LIZ)) || (interfaceC1776940wLE instanceof C1776470wKT)) {
            return;
        }
        LIZ();
    }

    public static boolean LIZIZ(Context context, DialogC1390150mHN dialogC1390150mHN) {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && !c19egLIZIZ.isFinishing() && !c19egLIZIZ.isDestroyed() && dialogC1390150mHN.isShowing()) {
            return true;
        }
        return false;
    }

    public static void LIZJ(Context context, Function1 function1, Function0 function0, boolean z) {
        int i;
        C1776470wKT c1776470wKT;
        LJFF = function1;
        LJ = function0;
        C2252321DDq c2252321DDq = LIZIZ;
        InterfaceC1776940wLE interfaceC1776940wLE = (InterfaceC1776940wLE) c2252321DDq.getValue();
        if (interfaceC1776940wLE instanceof C1776930wLD) {
            C1776930wLD c1776930wLD = (C1776930wLD) interfaceC1776940wLE;
            if (((InterfaceC1635390sev) LIZLLL.getValue()).LJIJJLI(c1776930wLD.LIZ)) {
                function1.invoke(c1776930wLD.LIZ);
                return;
            }
        }
        if (!(interfaceC1776940wLE instanceof C1776470wKT)) {
            LIZ();
        }
        DialogC1390150mHN dialogC1390150mHN = null;
        if (z) {
            dialogC1390150mHN = new DialogC1390150mHN(context);
            dialogC1390150mHN.LJJLJ(false);
            dialogC1390150mHN.LLILZLL = new InterfaceC1389630mGX() { // from class: X.0wsK
                @Override // X.InterfaceC1389630mGX
                public final void LIZ(DialogC19728412Gs dialogC19728412Gs) {
                    C1797450wsJ.LJFF = null;
                    C1797450wsJ.LJ = null;
                    C1797450wsJ.LIZJ = null;
                }
            };
            dialogC1390150mHN.LJJLL(0.0f, false);
            C786410Ut5.K4(dialogC1390150mHN);
            Object value = c2252321DDq.getValue();
            if ((value instanceof C1776470wKT) && (c1776470wKT = (C1776470wKT) value) != null) {
                i = c1776470wKT.LIZ;
            } else {
                i = 0;
            }
            dialogC1390150mHN.LJJLL(i, false);
        }
        LIZJ = dialogC1390150mHN;
    }
}
