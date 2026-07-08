package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E3w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C358540E3w extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C358530E3v LL;
    public final /* synthetic */ C370820EgK LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C358540E3w(C358530E3v c358530E3v, C370820EgK c370820EgK) {
        super(0);
        this.LL = c358530E3v;
        this.LLILLJJLI = c370820EgK;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C358530E3v c358530E3v = this.LL;
        Map<NLETrackSlot, Set<C370780EgG>> map = c358530E3v.LIZLLL;
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
                            c358530E3v.LIZIZ.LIZ(c358530E3v.LJ.indexOf(key));
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
