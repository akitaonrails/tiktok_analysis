package X;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JUW, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JUW extends C09AY implements Function1<C0JUV, C0JUV> {
    public final /* synthetic */ ArrayList<C0JUN> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JUW(ArrayList<C0JUN> arrayList) {
        super(1);
        this.LL = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0JUV invoke(C0JUV c0juv) {
        return C0JUV.LIZ(c0juv, null, this.LL, null, false, null, null, new C291001Au(Boolean.TRUE), 61);
    }
}
