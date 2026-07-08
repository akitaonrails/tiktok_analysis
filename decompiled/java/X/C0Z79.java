package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Z79, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z79 implements InterfaceC884800YnO {
    public static final C01GW<C0Z79> LJ = C452501pT.LIZIZ(new C0Z7E());
    public final C01GW LIZ = C452501pT.LIZIZ(new C1495705tL());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C0Z7D());
    public final C0Z7B LIZJ = new C0Z7B();
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C04PU());

    public final AtomicBoolean LJIILJJIL() {
        return (AtomicBoolean) this.LIZIZ.getValue();
    }

    public final C0Z7C LJIILL() {
        return (C0Z7C) this.LIZLLL.getValue();
    }

    public static Map LJIIL(C0Z7B c0z7b) {
        Object obj;
        Object obj2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long j = c0z7b.LJIILIIL;
        long j2 = j - c0z7b.LIZ;
        long j3 = c0z7b.LJIJJ;
        long j4 = c0z7b.LJIILL;
        long j5 = j3 - j4;
        long j6 = j - j4;
        if (j6 < 0) {
            j6 = 0;
        }
        long j7 = c0z7b.LJIJ + j2 + c0z7b.LJIILLIIL;
        linkedHashMap.put("data_flow_duration", Long.valueOf(j2));
        linkedHashMap.put("user_experience_duration", Long.valueOf(j5));
        linkedHashMap.put("vh_create_duration", Long.valueOf(c0z7b.LJIJ));
        linkedHashMap.put("vh_create_count", Long.valueOf(c0z7b.LJIJI));
        linkedHashMap.put("vh_bind_duration", Long.valueOf(c0z7b.LJIILLIIL));
        linkedHashMap.put("vh_bind_count", Long.valueOf(c0z7b.LJIIZILJ));
        linkedHashMap.put("total_time_duration", Long.valueOf((j2 + j5) - j6));
        linkedHashMap.put("dm_only_duration", Long.valueOf(j7));
        linkedHashMap.put("gap_between_inbox_and_data_flow_exit", Long.valueOf(j6));
        linkedHashMap.put("origin_conversation_count", Integer.valueOf(c0z7b.LIZIZ));
        linkedHashMap.put("session_convert_duration", Long.valueOf(c0z7b.LJ - c0z7b.LIZ));
        linkedHashMap.put("user_load_duration", Long.valueOf(c0z7b.LIZLLL));
        linkedHashMap.put("data_source_layer_duration", Long.valueOf(c0z7b.LJFF - c0z7b.LIZ));
        linkedHashMap.put("lazy_processor_duration", Long.valueOf(c0z7b.LJI - c0z7b.LJFF));
        linkedHashMap.put("before_filter_updater_chain", Long.valueOf(c0z7b.LJII - c0z7b.LJI));
        linkedHashMap.put("filter", Long.valueOf(c0z7b.LJIIIIZZ - c0z7b.LJII));
        linkedHashMap.put("after_filter_updater_chain", Long.valueOf(c0z7b.LJIIIZ - c0z7b.LJIIIIZZ));
        linkedHashMap.put("decorator_chain", Long.valueOf(c0z7b.LJIIJ - c0z7b.LJIIIZ));
        linkedHashMap.put("vo_convert_chain", Long.valueOf(c0z7b.LJIIJJI - c0z7b.LJIIJ));
        linkedHashMap.put("data_sort_and_copy_duration", Long.valueOf(c0z7b.LJIIL - c0z7b.LJIIJJI));
        linkedHashMap.put("conversation_count", Integer.valueOf(c0z7b.LJIILJJIL));
        linkedHashMap.putAll(c0z7b.LJIJJLI);
        linkedHashMap.putAll(c0z7b.LJIL);
        linkedHashMap.put("account_type", C1668706g9.LIZ(IIMBusinessChatService.LIZ).LJIILJJIL().LIZIZ(C461720I8s.LIZJ()));
        linkedHashMap.put("unread_cnt", Integer.valueOf(c0z7b.LIZJ));
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        String str = "1";
        if (C881500Yi4.LIZJ()) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_extra_preload_light", obj);
        if (C293380Bei.LIZ() == 2 || C293380Bei.LIZ() == 4) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("first_preload_run_on_default_executor", obj2);
        if (!C293380Bei.LIZIZ()) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("remove_redundant_operation", str);
        return linkedHashMap;
    }

    public static boolean LJIILIIL(C0Z7C c0z7c) {
        if (((Number) C270380Aii.LIZ.getValue()).intValue() != 1 || c0z7c.LIZJ()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC884800YnO
    public final void LIZ(long j) {
        if (LJIILJJIL().get()) {
            return;
        }
        this.LIZJ.LJIIIZ = j;
    }

    @Override // X.InterfaceC884800YnO
    public final void LIZIZ(long j) {
        if (LJIILJJIL().get()) {
            return;
        }
        this.LIZJ.LJIIJ = j;
    }

    @Override // X.InterfaceC884800YnO
    public final void LJ(long j) {
        if (LJIILJJIL().get()) {
            return;
        }
        this.LIZJ.LJIIIIZZ = j;
    }

    @Override // X.InterfaceC884800YnO
    public final void LJFF(long j) {
        if (LJIILJJIL().get()) {
            return;
        }
        this.LIZJ.LJII = j;
    }

    @Override // X.InterfaceC884800YnO
    public final void LJI(long j) {
        if (LJIILJJIL().get()) {
            return;
        }
        this.LIZJ.LJIIL = j;
    }

    @Override // X.InterfaceC884800YnO
    public final void LJII(int i) {
        if (LJIILJJIL().get()) {
            return;
        }
        this.LIZJ.LJIILJJIL = i;
    }

    @Override // X.InterfaceC884800YnO
    public final void LJIIIIZZ(long j) {
        if (LJIILJJIL().get()) {
            return;
        }
        this.LIZJ.LJIILIIL = j;
    }

    @Override // X.InterfaceC884800YnO
    public final void LJIIIZ(long j) {
        if (LJIILJJIL().get()) {
            return;
        }
        this.LIZJ.LJI = j;
    }

    @Override // X.InterfaceC884800YnO
    public final void LJIIJ(long j) {
        if (LJIILJJIL().get()) {
            return;
        }
        this.LIZJ.LJIIJJI = j;
    }

    @Override // X.InterfaceC884800YnO
    public final void LJIIJJI(long j) {
        if (LJIILJJIL().get()) {
            return;
        }
        this.LIZJ.LJFF = j;
    }

    public final void LJIILLIIL(long j) {
        C0Z7C c0z7cLJIILL;
        C0Z7C c0z7cLJIILL2 = LJIILL();
        if (c0z7cLJIILL2 != null && LJIILIIL(c0z7cLJIILL2) && (c0z7cLJIILL = LJIILL()) != null) {
            c0z7cLJIILL.LIZ(j, "activity_status_ready", null);
        }
    }

    public final void LJIJ(long j) {
        if (LJIILJJIL().get()) {
            return;
        }
        this.LIZJ.LJ = j;
    }

    public final void LJIJI(long j) {
        if (LJIILJJIL().get()) {
            return;
        }
        this.LIZJ.LIZ = j;
    }

    @Override // X.InterfaceC884800YnO
    public final void LIZJ(long j, String str) {
        if (LJIILJJIL().get()) {
            return;
        }
        this.LIZJ.LJIJJLI.put(str, Long.valueOf(j));
    }

    @Override // X.InterfaceC884800YnO
    public final boolean LIZLLL(InterfaceC879010Ye3 interfaceC879010Ye3, boolean z) {
        if (!z || !(interfaceC879010Ye3 instanceof C878950Ydx)) {
            return false;
        }
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        return Intrinsics.LJFF(interfaceC879010Ye3, C881500Yi4.LIZLLL());
    }

    public final void LJIIZILJ(long j, boolean z) {
        C0Z7C c0z7cLJIILL = LJIILL();
        if (c0z7cLJIILL == null || !LJIILIIL(c0z7cLJIILL)) {
            return;
        }
        C0Z7C c0z7cLJIILL2 = LJIILL();
        if (c0z7cLJIILL2 != null) {
            c0z7cLJIILL2.LIZIZ(C2097908Jt.LIZJ(new Pair("avatar_success", Boolean.valueOf(z))));
        }
        C0Z7C c0z7cLJIILL3 = LJIILL();
        if (c0z7cLJIILL3 != null) {
            c0z7cLJIILL3.LIZ(j, "avatar_rendered", null);
        }
    }
}
