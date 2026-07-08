package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: renamed from: X.0QVs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C671540QVs extends C0QW9 {
    public final Map<C0QUT, Function1<C0QWD, Unit>> LLJJIJIL;

    @Override // X.C0QW9
    public final Map<C0QUT, Function1<C0QWD, Unit>> LIZIZ() {
        return this.LLJJIJIL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C671540QVs(C0QWG c0qwg, Function0 function0, Function0 function02, Function0 function03, Function0 function04) {
        C0QUT c0qut = C0QUT.RESULT;
        super(c0qwg, function0, function02, function03, function04, C1697810uHb.LJIILJJIL(C0QUT.SUGGEST, c0qut));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(c0qut, new AwS589S0100000_10(this, 524));
        this.LLJJIJIL = linkedHashMap;
    }
}
