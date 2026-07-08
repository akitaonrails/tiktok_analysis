package X;

import com.bytedance.otis.memory.EnsureLoad;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Bbc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C291460Bbc extends C09AY implements Function0<Boolean> {
    public C291460Bbc() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf((C291440Bba.LIZ() & 1) == 1 && EnsureLoad.LIZIZ);
    }
}
