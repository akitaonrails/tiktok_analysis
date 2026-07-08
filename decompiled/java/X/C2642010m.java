package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.010m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2642010m extends C09AY implements Function1<Integer, Unit> {
    public final /* synthetic */ Object LL;
    public final /* synthetic */ Function1<Integer, Unit> LLILLJJLI;
    public final /* synthetic */ HashMap<String, Integer> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ HashSet<String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2642010m(Object obj, Function1<? super Integer, Unit> function1, HashMap<String, Integer> map, String str, HashSet<String> hashSet) {
        super(1);
        this.LL = obj;
        this.LLILLJJLI = function1;
        this.LLILLL = map;
        this.LLILZ = str;
        this.LLILZIL = hashSet;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        float fLJZI;
        int iIntValue = num.intValue();
        Object obj = this.LL;
        HashMap<String, Integer> map = this.LLILLL;
        String str = this.LLILZ;
        HashSet<String> hashSet = this.LLILZIL;
        synchronized (obj) {
            try {
                map.put(str, Integer.valueOf(iIntValue));
                fLJZI = C13LP.LJZI(map.values()) / hashSet.size();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LLILLJJLI.invoke(Integer.valueOf((int) fLJZI));
        return Unit.LIZ;
    }
}
