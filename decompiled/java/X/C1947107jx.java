package X;

import java.util.Iterator;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.07jx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1947107jx implements Sequence<String> {
    public final /* synthetic */ CharSequence LIZ;

    @Override // kotlin.sequences.Sequence
    public final Iterator<String> iterator() {
        return new C1946907jv(this.LIZ);
    }

    public C1947107jx(CharSequence charSequence) {
        this.LIZ = charSequence;
    }
}
