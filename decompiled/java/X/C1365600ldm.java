package X;

import android.content.Context;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ldm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1365600ldm extends C09AY implements Function2<AbstractC1375550ltp, Boolean, Unit> {
    public final /* synthetic */ InterfaceC1369790lkX LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ C1371740lng LLILLL;
    public final /* synthetic */ AwemeSharePackage LLILZ;
    public final /* synthetic */ DialogC1389620mGW LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1365600ldm(InterfaceC1369790lkX interfaceC1369790lkX, Context context, C1371740lng c1371740lng, AwemeSharePackage awemeSharePackage, DialogC1389620mGW dialogC1389620mGW) {
        super(2);
        this.LL = interfaceC1369790lkX;
        this.LLILLJJLI = context;
        this.LLILLL = c1371740lng;
        this.LLILZ = awemeSharePackage;
        this.LLILZIL = dialogC1389620mGW;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(AbstractC1375550ltp abstractC1375550ltp, Boolean bool) {
        AbstractC1375550ltp abstractC1375550ltp2 = abstractC1375550ltp;
        if (bool.booleanValue() && this.LL.LJJIIJ(abstractC1375550ltp2, this.LLILLJJLI, null)) {
            this.LLILLL.LJIILLIIL(this.LL, true, this.LLILZ, this.LLILLJJLI);
        }
        if (C1366550lfJ.LIZ(this.LL.key())) {
            C571830Mbl.LIZ(this.LLILZIL);
        }
        return Unit.LIZ;
    }
}
