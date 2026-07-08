package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS145S0101000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E3t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C358510E3t extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C358500E3s LL;
    public final /* synthetic */ C370820EgK LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C358510E3t(C358500E3s c358500E3s, C370820EgK c370820EgK) {
        super(0);
        this.LL = c358500E3s;
        this.LLILLJJLI = c370820EgK;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C358500E3s c358500E3s = this.LL;
        Map<NLETrackSlot, Set<C370780EgG>> map = c358500E3s.LIZIZ;
        C370820EgK c370820EgK = this.LLILLJJLI;
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            Object key = entry.getKey();
            Iterator it2 = ((Set) entry.getValue()).iterator();
            while (true) {
                if (it2.hasNext()) {
                    Object next = it2.next();
                    C370780EgG c370780EgG = (C370780EgG) next;
                    if (Intrinsics.LJFF(c370780EgG.LIZ, c370820EgK.LIZ) && c370780EgG.LIZIZ == c370820EgK.LIZIZ) {
                        if (next != null) {
                            int iIndexOf = c358500E3s.LIZLLL.indexOf(key);
                            C368010Ebn c368010Ebn = c358500E3s.LIZ;
                            c368010Ebn.getClass();
                            C354270Duj.LIZJ(0L, new AwS145S0101000_5(iIndexOf, c368010Ebn, 7));
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
