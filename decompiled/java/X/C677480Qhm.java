package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qhm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C677480Qhm implements InterfaceC1164530gPT, InterfaceC676500QgC {
    public C678130Qip LL;
    public final ConcurrentHashMap<String, C679540Ql6> LLILLJJLI = new ConcurrentHashMap<>();
    public long LLILLL;
    public InterfaceC677960QiY LLILZ;
    public InterfaceC621800OaA LLILZIL;
    public boolean LLILZLL;

    @Override // X.InterfaceC676500QgC
    public final void onPause() {
    }

    @Override // X.InterfaceC676500QgC
    public final void onResume() {
    }

    public final boolean LIZLLL() {
        C1540620qC4 c1540620qC4;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        if (this.LLILZLL) {
            C678130Qip c678130Qip = this.LL;
            if (((c678130Qip == null || (lifecycleOwner = c678130Qip.LJIIIZ) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? null : lifecycle.getCurrentState()) == Lifecycle.State.RESUMED) {
                Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("data", C2097608Jq.LJIIJ(new Pair(Scene.SCENE_SERVICE, "button"))));
                C678130Qip c678130Qip2 = this.LL;
                if (c678130Qip2 != null && (c1540620qC4 = c678130Qip2.LJIIIIZZ) != null) {
                    c1540620qC4.LJJIII("ec_search_notify_return_event", C678560QjW.LIZLLL(mapLJIIJ));
                }
                this.LLILZLL = false;
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC676500QgC
    public final void onCreate() {
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZLLL("ec_search_block_back_event", this);
        }
    }

    @Override // X.InterfaceC676500QgC
    public final void onDestroy() {
        C1540620qC4 c1540620qC4;
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZJ("ec_search_block_back_event", this);
        }
        C678130Qip c678130Qip = this.LL;
        if (c678130Qip == null || (c1540620qC4 = c678130Qip.LJIIIIZZ) == null) {
            return;
        }
        c1540620qC4.LJII();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C677480Qhm.LIZIZ(java.lang.String):java.lang.Object");
    }

    public final void LIZJ(C1540620qC4 c1540620qC4) {
        if (((Boolean) C134400fG.LIZ.getValue()).booleanValue()) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LJ), null, null, new C678260Qj2(this, c1540620qC4, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.Object r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C677480Qhm.LIZ(java.lang.Object, java.lang.String):java.lang.Object");
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        Object obj;
        if (Intrinsics.LJFF(str, "ec_search_block_back_event")) {
            HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(str2);
            if (mapLJIIJ != null) {
                obj = mapLJIIJ.get("state");
            } else {
                obj = null;
            }
            this.LLILZLL = Intrinsics.LJFF(obj, "on");
        }
    }
}
