package X;

import com.ss.android.ugc.aweme.main.MainRootFragmentBase;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0raM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1594120raM extends C09AY implements Function0<C1602170rnL> {
    public final /* synthetic */ MainRootFragmentBase LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1594120raM(MainRootFragmentBase mainRootFragmentBase) {
        super(0);
        this.LL = mainRootFragmentBase;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1602170rnL invoke() {
        if (C07I0.LIZ()) {
            return new C1602170rnL(this.LL.nS());
        }
        return null;
    }
}
