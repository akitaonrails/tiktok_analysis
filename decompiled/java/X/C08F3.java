package X;

import java.util.Arrays;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.08F3, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08F3 extends C09AY implements Function1<Byte, CharSequence> {
    public C08F3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
        return C786410Ut5.j4("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b.byteValue())}, 1));
    }
}
