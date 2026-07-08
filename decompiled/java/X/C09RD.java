package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.09RD, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09RD implements Sequence<View> {
    public final /* synthetic */ ViewGroup LIZ;

    @Override // kotlin.sequences.Sequence
    public final Iterator<View> iterator() {
        return new C09RE(this.LIZ);
    }

    public C09RD(ViewGroup viewGroup) {
        this.LIZ = viewGroup;
    }
}
