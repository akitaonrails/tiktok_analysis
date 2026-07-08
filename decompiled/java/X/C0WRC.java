package X;

import android.os.SystemClock;
import com.bytedance.pumbaa.pipeline.PrivacyEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: renamed from: X.0WRC, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WRC {
    public static PrivacyEvent LIZ(String str, String str2) {
        Object c098200Yq;
        C0WRB c0wrb = null;
        PrivacyEvent privacyEvent = new PrivacyEvent(str, str2);
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap(20);
            C823230WRd.LIZIZ.LIZJ(linkedHashMap);
            C0WRB c0wrb2 = new C0WRB(str2, linkedHashMap);
            privacyEvent.contextInfo = c0wrb2;
            EnumC823400WRu enumC823400WRu = EnumC823400WRu.String;
            c0wrb2.LJ("trigger_biz", new C0WQ8(enumC823400WRu, str2));
            C0WRB c0wrb3 = privacyEvent.contextInfo;
            if (c0wrb3 == null) {
                c0wrb3 = null;
            }
            EnumC823400WRu enumC823400WRu2 = EnumC823400WRu.Any;
            c0wrb3.LJ("_stack_info", new C0WR8(enumC823400WRu2, AFwS200S0000000_13.get$arr$(50)));
            C0WRB c0wrb4 = privacyEvent.contextInfo;
            if (c0wrb4 == null) {
                c0wrb4 = null;
            }
            c0wrb4.LJ("stack", new C0WR8(enumC823400WRu, new AwS557S0100000_13(privacyEvent, 20)));
            C0WRB c0wrb5 = privacyEvent.contextInfo;
            if (c0wrb5 == null) {
                c0wrb5 = null;
            }
            EnumC823400WRu enumC823400WRu3 = EnumC823400WRu.Bool;
            c0wrb5.LJ("is_cross_stack_enabled", new C0WR8(enumC823400WRu3, AFwS200S0000000_13.get$arr$(51)));
            C0WRB c0wrb6 = privacyEvent.contextInfo;
            if (c0wrb6 == null) {
                c0wrb6 = null;
            }
            c0wrb6.LJ("is_cross_stack", new C0WR8(enumC823400WRu3, new AwS557S0100000_13(privacyEvent, 21)));
            C0WRB c0wrb7 = privacyEvent.contextInfo;
            if (c0wrb7 == null) {
                c0wrb7 = null;
            }
            c0wrb7.LJ("stack_extra_info", new C0WR8(enumC823400WRu, new AwS557S0100000_13(privacyEvent, 22)));
            C0WRB c0wrb8 = privacyEvent.contextInfo;
            if (c0wrb8 == null) {
                c0wrb8 = null;
            }
            c0wrb8.LJ("method_id", new C0WR8(enumC823400WRu, AFwS200S0000000_13.get$arr$(52)));
            C0WRB c0wrb9 = privacyEvent.contextInfo;
            if (c0wrb9 == null) {
                c0wrb9 = null;
            }
            c0wrb9.LJ("method_id_extra_info", new C0WR8(enumC823400WRu, AFwS200S0000000_13.get$arr$(53)));
            C0WRB c0wrb10 = privacyEvent.contextInfo;
            if (c0wrb10 == null) {
                c0wrb10 = null;
            }
            c0wrb10.LJ("_cross_page_info", new C0WR8(enumC823400WRu2, AFwS200S0000000_13.get$arr$(54)));
            C0WRB c0wrb11 = privacyEvent.contextInfo;
            if (c0wrb11 == null) {
                c0wrb11 = null;
            }
            c0wrb11.LJ("cross_page_stack", new C0WR8(enumC823400WRu, new AwS557S0100000_13(privacyEvent, 23)));
            C0WRB c0wrb12 = privacyEvent.contextInfo;
            if (c0wrb12 == null) {
                c0wrb12 = null;
            }
            c0wrb12.LJ("cross_page", new C0WR8(enumC823400WRu, new AwS557S0100000_13(privacyEvent, 18)));
            C0WRB c0wrb13 = privacyEvent.contextInfo;
            if (c0wrb13 != null) {
                c0wrb = c0wrb13;
            }
            c0wrb.LJ("x_tt_pba_encode", new C0WR8(enumC823400WRu, new AwS557S0100000_13(privacyEvent, 19)));
            privacyEvent.setEventInitCost$pipeline_release((SystemClock.elapsedRealtimeNanos() - privacyEvent.getEventCreateTime$pipeline_release()) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            privacyEvent.contextInfo = new C0WRB(str2, new LinkedHashMap());
            C823280WRi.LIZJ("create privacy event failed", "ensure_not_reach_here", thM5exceptionOrNullimpl);
        }
        return privacyEvent;
    }
}
