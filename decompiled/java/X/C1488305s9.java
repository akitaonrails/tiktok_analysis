package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05s9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1488305s9 extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ AbstractC1488405sA LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1488305s9(AbstractC1488405sA abstractC1488405sA) {
        super(0);
        this.LL = abstractC1488405sA;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Keva kevaLIZ = this.LL.LIZ();
        this.LL.getClass();
        return Boolean.valueOf(kevaLIZ.getBoolean(C1488205s8.LJ, false));
    }
}
