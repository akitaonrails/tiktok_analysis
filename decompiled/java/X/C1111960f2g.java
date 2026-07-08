package X;

import Y.AObjectS392S0100000_17;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenFirstMessagesReleaseSetting;
import com.bytedance.android.livesdkapi.depend.model.live.EpiphronDecision;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0f2g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1111960f2g {
    public static final C01GW<List<String>> LJIIZILJ = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(173));
    public static final C01GW<List<Integer>> LJIJ = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(171));
    public static final C01GW<List<Long>> LJIJI = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(172));
    public final boolean LIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public long LJFF;
    public boolean LJI;
    public Room LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public RecycleSource LJIIJJI;
    public AObjectS392S0100000_17 LJIILIIL;
    public boolean LJIILJJIL;
    public Boolean LJIILL;
    public int LIZIZ = -1;
    public final Set<Integer> LJII = new LinkedHashSet();
    public final List<C1110310f01> LJIIL = new ArrayList();
    public final Map<String, C1112590f3h> LJIILLIIL = C2097608Jq.LJIIIIZZ(new Pair("self_enter", new C1112590f3h(null)), new Pair("welcome", new C1112590f3h(null)), new Pair("warn", new C1112590f3h(null)), new Pair("intro", new C1112590f3h(null)), new Pair("game_intro", new C1112590f3h(null)), new Pair("pk_notice", new C1112590f3h(null)), new Pair("ai_summary", new C1112590f3h(null)));

    public final int LIZ() {
        int size = ((ArrayList) this.LJIIL).size();
        Iterator<Map.Entry<String, C1112590f3h>> it2 = this.LJIILLIIL.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getValue().LIZ != null) {
                size++;
            }
        }
        return size;
    }

    public final boolean LIZIZ() {
        EpiphronDecision epiphronDecision;
        Map<String, String> map;
        String str;
        Integer numLJIIJJI;
        if (this.LJIIJ != 0 || this.LJIIJJI == RecycleSource.FROM_CONFIG_CHANGE || this.LIZ) {
            return false;
        }
        LivePublicScreenFirstMessagesReleaseSetting livePublicScreenFirstMessagesReleaseSetting = LivePublicScreenFirstMessagesReleaseSetting.INSTANCE;
        if (!livePublicScreenFirstMessagesReleaseSetting.enable()) {
            return false;
        }
        if (this.LJIILL == null) {
            int iMaxHotLevel = livePublicScreenFirstMessagesReleaseSetting.maxHotLevel();
            Room room = this.LJIIIIZZ;
            this.LJIILL = Boolean.valueOf(iMaxHotLevel < 0 || ((room == null || (epiphronDecision = room.decisions) == null || (map = epiphronDecision.serverFeatures) == null || (str = map.get("hot_level")) == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str)) == null) ? 0 : numLJIIJJI.intValue()) <= iMaxHotLevel);
        }
        Boolean bool = this.LJIILL;
        return (bool == null || !bool.booleanValue() || this.LJI) ? false : true;
    }

    public final boolean LJ() {
        C1112530f3b c1112530f3b = (C1112530f3b) DataChannelGlobal.LLILZ.gg0(C1148350fzN.class);
        if (c1112530f3b == null) {
            return false;
        }
        long j = c1112530f3b.LIZ;
        Room room = this.LJIIIIZZ;
        if (j != (room != null ? room.getId() : 0L)) {
            return this.LIZLLL >= 1;
        }
        List<Integer> list = c1112530f3b.LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (this.LJII.contains(Integer.valueOf(num.intValue()))) {
                arrayList.add(num);
            }
        }
        int size = arrayList.size();
        int i = c1112530f3b.LIZJ;
        if (this.LJ < size - i || this.LIZJ < this.LIZIZ || this.LIZLLL < 1) {
            return (i <= 0 || !(c1112530f3b.LIZIZ.isEmpty() ^ true)) && this.LJFF > 0 && SystemClock.uptimeMillis() - this.LJFF > LivePublicScreenFirstMessagesReleaseSetting.INSTANCE.messageReceiveTimeout();
        }
        return true;
    }

    public final long LJI() {
        C01GW<List<Long>> c01gw = LJIJI;
        if (c01gw.getValue().isEmpty()) {
            return 0L;
        }
        List<Long> value = c01gw.getValue();
        int i = this.LJIIIZ;
        int size = c01gw.getValue().size() - 1;
        if (i > size) {
            i = size;
        }
        return ((Number) ListProtector.get(value, i)).longValue();
    }

    public final boolean LIZJ() {
        if (LIZIZ()) {
            return LJ() && LIZ() == 0;
        }
        return true;
    }

    public final boolean LIZLLL(String str) {
        String next;
        Iterator<String> it2 = LJIIZILJ.getValue().iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            }
            next = it2.next();
        } while (!Intrinsics.LJFF(next, str));
        if (next == null) {
            return true;
        }
        if (Intrinsics.LJFF(str, "chat")) {
            if (this.LIZIZ >= 0 && ((ArrayList) this.LJIIL).size() >= this.LIZIZ) {
                return true;
            }
            return false;
        }
        C1112590f3h c1112590f3h = this.LJIILLIIL.get(str);
        if (c1112590f3h != null && c1112590f3h.LIZ != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJFF(X.InterfaceC1112060f2q r6) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1111960f2g.LJFF(X.0f2q):boolean");
    }

    public C1111960f2g(boolean z, boolean z2) {
        this.LIZ = z;
    }

    public final boolean LJII(String str, InterfaceC1112060f2q interfaceC1112060f2q) {
        if (!LIZLLL(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onInterceptModel: add ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            this.LJFF = SystemClock.elapsedRealtime();
            C1112590f3h c1112590f3h = this.LJIILLIIL.get(str);
            if (c1112590f3h != null) {
                c1112590f3h.LIZ = interfaceC1112060f2q;
                return true;
            }
            return true;
        }
        return false;
    }
}
