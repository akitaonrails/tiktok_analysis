package X;

import com.ss.android.ugc.aweme.fetch.OutreachFetchRequestBody;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0NWr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C595350NWr {
    public static final InterfaceC595380NWu LIZ;
    public static final C01GW LIZIZ;
    public static final ConcurrentHashMap<String, C09AE> LIZJ;

    static {
        InterfaceC595380NWu.LIZ.getClass();
        LIZ = C595390NWv.LIZJ;
        LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(678));
        LIZJ = new ConcurrentHashMap<>();
    }

    public static void LIZ(OutreachFetchRequestBody outreachFetchRequestBody, Function1 function1, Function2 function2) {
        if (LIZ == null) {
            function2.invoke(10000, new Throwable("API instance is null!"));
            return;
        }
        ConcurrentHashMap<String, C09AE> concurrentHashMap = LIZJ;
        C09AE c09ae = concurrentHashMap.get(outreachFetchRequestBody.fetchTiming);
        if (c09ae != null && c09ae.isActive()) {
            c09ae.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL((InterfaceC497601wk) LIZIZ.getValue(), null, null, new C595370NWt(outreachFetchRequestBody, function2, function1, null), 3);
        String str = outreachFetchRequestBody.fetchTiming;
        if (str != null) {
            concurrentHashMap.put(str, anonymousClass0956LIZLLL);
        }
    }
}
