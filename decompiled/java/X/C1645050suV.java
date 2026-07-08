package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.filter.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0suV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1645050suV extends C09AY implements Function0<Unit> {
    public final /* synthetic */ k LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1645050suV(k kVar, boolean z, boolean z2, boolean z3) {
        super(0);
        this.LL = kVar;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = z3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        k kVar = this.LL;
        FilterBean filterBean = kVar.LLL;
        if (filterBean != null) {
            k.d6(kVar, this.LLILLJJLI, this.LLILLL, this.LLILZ, filterBean);
            kVar.LLL = null;
            InterfaceC420801kM interfaceC420801kM = kVar.LLLF;
            if (interfaceC420801kM != null) {
                interfaceC420801kM.dispose();
            }
        }
        return Unit.LIZ;
    }
}
