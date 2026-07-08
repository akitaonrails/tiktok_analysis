package X;

import com.bytedance.poplayer.core.PopupManager;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.15sB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class RunnableC20655715sB implements Runnable {
    public final /* synthetic */ C20656115sF LL;
    public final /* synthetic */ Pair<Integer, String> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ EnumC20657115sP LLILZ;
    public final /* synthetic */ String LLILZIL;

    public RunnableC20655715sB(C20656115sF c20656115sF, EnumC20657115sP enumC20657115sP, String str, String str2, Pair pair) {
        this.LL = c20656115sF;
        this.LLILLJJLI = pair;
        this.LLILLL = str;
        this.LLILZ = enumC20657115sP;
        this.LLILZIL = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("MobHelper@b873.mobShowFailedPop$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MobHelper@b873.mobShowFailedPop$1");
    }

    public final void LIZ() {
        Function2<String, HashMap<String, String>, Unit> function2 = PopupManager.LIZLLL().LJIIIIZZ;
        if (function2 != null) {
            C20656115sF c20656115sF = this.LL;
            Pair<Integer, String> pair = this.LLILLJJLI;
            String str = this.LLILLL;
            EnumC20657115sP enumC20657115sP = this.LLILZ;
            String str2 = this.LLILZIL;
            HashMap map = new HashMap();
            map.put("task_id", c20656115sF.LLILLJJLI);
            InterfaceC20647615qs interfaceC20647615qs = (InterfaceC20647615qs) c20656115sF.LLILZLL.getClass().getAnnotation(InterfaceC20647615qs.class);
            if (interfaceC20647615qs != null) {
                map.put("popup_key", interfaceC20647615qs.value());
            }
            if (pair != null) {
                map.put("reason_code", String.valueOf(pair.getFirst().intValue()));
                map.put("reason_msg", pair.getSecond());
            }
            map.put("scene_id", str);
            map.put("fail_code", String.valueOf(enumC20657115sP.getFailCode()));
            map.put("reason", str2);
            map.put("element_label", c20656115sF.LLILZLL.elementLabel);
            map.put("trigger_id", c20656115sF.LLILZLL.triggerId);
            c20656115sF.LLIZLLLIL.LIZ(map);
            function2.invoke("pop_show_failed", (HashMap<String, String>) map);
        }
        PopupManager.LJIIIZ(this.LL.LLILZLL, false);
    }
}
