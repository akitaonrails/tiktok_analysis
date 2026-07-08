package X;

import java.io.BufferedReader;
import java.util.Iterator;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.08KD, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08KD implements Sequence<String> {
    public final BufferedReader LIZ;

    @Override // kotlin.sequences.Sequence
    public final Iterator<String> iterator() {
        return new C08KE(this);
    }

    public C08KD(BufferedReader bufferedReader) {
        this.LIZ = bufferedReader;
    }
}
