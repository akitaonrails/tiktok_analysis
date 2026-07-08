package X;

import com.bytedance.incentive.taskevent.watchvideo.AdWatchVideoTaskTrigger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zW1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1898950zW1 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ List<String> LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1898950zW1(int i, int i2, String str, String str2, String str3, String str4, List list, boolean z) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = list;
        this.LLIZ = z;
        this.LLIZLLLIL = str4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object next;
        AdWatchVideoTaskTrigger.AdExtraParam adExtraParam;
        List<AdWatchVideoTaskTrigger> list = C1898980zW4.LIZIZ;
        String str = this.LLIZLLLIL;
        Iterator it2 = ((ArrayList) list).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (Intrinsics.LJFF(((AbstractC1899090zWF) next).LL.taskEventKey, str)) {
                break;
            }
        }
        AdWatchVideoTaskTrigger adWatchVideoTaskTrigger = (AdWatchVideoTaskTrigger) next;
        if (adWatchVideoTaskTrigger != null) {
            int i = this.LL;
            int i2 = this.LLILLJJLI;
            String str2 = this.LLILLL;
            String str3 = this.LLILZ;
            String str4 = this.LLILZIL;
            List<String> list2 = this.LLILZLL;
            boolean z = this.LLIZ;
            adWatchVideoTaskTrigger.LL.LIZ = Integer.valueOf(i);
            adWatchVideoTaskTrigger.LL.LIZIZ = Integer.valueOf(i2);
            adWatchVideoTaskTrigger.LLJILJIL = i2;
            if (str2.length() > 0) {
                adWatchVideoTaskTrigger.LLJILLL = str2;
            }
            if (str3.length() > 0) {
                adWatchVideoTaskTrigger.LLJJ = str3;
            }
            adWatchVideoTaskTrigger.LLJJI = str4;
            if (str4 != null && str4.length() != 0) {
                try {
                    adExtraParam = (AdWatchVideoTaskTrigger.AdExtraParam) C20484080s.LIZ(adWatchVideoTaskTrigger.LLJJI, AdWatchVideoTaskTrigger.AdExtraParam.class);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    adExtraParam = null;
                }
                adWatchVideoTaskTrigger.LLJJIII = adExtraParam;
            }
            ArrayList arrayList = new ArrayList();
            if (list2 != null) {
                for (String str5 : list2) {
                    try {
                        AdWatchVideoTaskTrigger.AdExtraParam adExtraParam2 = (AdWatchVideoTaskTrigger.AdExtraParam) C20484080s.LIZ(str5, AdWatchVideoTaskTrigger.AdExtraParam.class);
                        if (adExtraParam2 != null) {
                            arrayList.add(new Pair(str5, adExtraParam2));
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
            }
            adWatchVideoTaskTrigger.LLJJIJI = arrayList;
            adWatchVideoTaskTrigger.LLJJIJIL = z;
        }
        return Unit.LIZ;
    }
}
