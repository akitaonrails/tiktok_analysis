package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IMainService;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS262S0000000_23;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0puP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1529670puP {
    public static final C1529670puP LIZ = new C1529670puP();
    public static final List<String> LIZIZ;
    public static volatile boolean LIZJ;

    static {
        IntRange intRange = new IntRange(1, 6);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(intRange, 10));
        Iterator<Integer> it2 = intRange.iterator();
        while (it2.hasNext()) {
            arrayList.add(C786410Ut5.j4("story_reveal_cutout_res_%02d.png", Arrays.copyOf(new Object[]{Integer.valueOf(((AbstractC2098408Jy) it2).nextInt())}, 1)));
        }
        LIZIZ = arrayList;
    }

    public static String LIZ() {
        String anywhereChannelPath;
        IMainService iMainService = (IMainService) PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null);
        if (iMainService == null || (anywhereChannelPath = iMainService.getAnywhereChannelPath("story_thought_bg_res")) == null) {
            return null;
        }
        List<String> list = LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(anywhereChannelPath);
            sbLIZ.append('/');
            sbLIZ.append((String) obj);
            File fileLJFF = C2114508Qd.LJFF(new C0VSJ(""), C2188811AlT.LIZIZ(sbLIZ));
            if (fileLJFF != null && fileLJFF.exists()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (String) C13LP.LJLJJI(arrayList, AbstractC19994813Le.Default);
    }

    public final void LIZIZ() {
        Object c098200Yq;
        if (LIZJ) {
            return;
        }
        LIZJ = true;
        try {
            Forest forestLIZ = C0T1N.LIZ();
            RequestParams requestParams = new RequestParams(null, 1, null);
            requestParams.channel = "story_thought_bg_res";
            requestParams.bundle = "/";
            requestParams.supportDirectory = true;
            requestParams.waitGeckoUpdate = true;
            requestParams.enableRequestReuse = true;
            Boolean bool = Boolean.TRUE;
            requestParams.enableMemoryCache = bool;
            requestParams.enableCDNCache = bool;
            requestParams.resourceScene = EnumC1533980q1M.OTHER;
            requestParams.consumeType = File.class;
            c098200Yq = forestLIZ.fetchResourceAsync("", requestParams, new AwS262S0000000_23(this, 2));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            LIZJ = false;
        }
    }
}
