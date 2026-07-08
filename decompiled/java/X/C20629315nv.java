package X;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15nv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20629315nv extends C09AY implements Function0<C20628315nl> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20629315nv(Context context) {
        super(0);
        this.LL = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C20628315nl invoke() {
        return new C20628315nl(this.LL);
    }
}
