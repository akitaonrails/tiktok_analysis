package X;

import com.ss.android.ugc.aweme.memory.MemoryOptWhenAnrABParameters;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AlE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2188661AlE extends C09AY implements Function0<Boolean> {
    public C2188661AlE() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C01GW c01gw = C2188671AlF.LIZIZ;
        return Boolean.valueOf(((MemoryOptWhenAnrABParameters) c01gw.getValue()).majorFault > 0 || ((MemoryOptWhenAnrABParameters) c01gw.getValue()).blockGcTime > 0);
    }
}
