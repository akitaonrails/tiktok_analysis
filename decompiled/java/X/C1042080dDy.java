package X;

import com.bytedance.lynx.hybrid.ssp.base.SSPResponse;
import com.ss.android.ugc.aweme.ad.recording.engageinfo.IAdLandPageEngageInfoProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dDy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1042080dDy extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ SSPResponse.Rule LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1042040dDu LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1042080dDy(SSPResponse.Rule rule, String str, C1042040dDu c1042040dDu, String str2, String str3) {
        super(1);
        this.LL = rule;
        this.LLILLJJLI = str;
        this.LLILLL = c1042040dDu;
        this.LLILZ = str2;
        this.LLILZIL = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        String strLIZIZ;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C2274581E1g.LIZ.getClass();
        c1023640ckE2.withParam(C2274581E1g.LJJI, this.LL.regex);
        c1023640ckE2.withParam(C2274581E1g.LJJIFFI, this.LL.name);
        c1023640ckE2.withParam(C2274581E1g.LIZIZ, this.LLILLJJLI);
        IAdLandPageEngageInfoProvider iAdLandPageEngageInfoProvider = (IAdLandPageEngageInfoProvider) PluggableExtentionKt.pluggableSpi$default(IAdLandPageEngageInfoProvider.class, false, false, false, 14, null);
        if (iAdLandPageEngageInfoProvider != null) {
            strLIZIZ = iAdLandPageEngageInfoProvider.LIZIZ(this.LLILLL.LIZ.getRealCreativeIdStr());
        } else {
            strLIZIZ = null;
        }
        c1023640ckE2.withParam(C2274581E1g.LIZJ, strLIZIZ);
        c1023640ckE2.withParam(C2274581E1g.LJFF, this.LLILZ);
        c1023640ckE2.withParam(C2274581E1g.LJ, Long.valueOf(System.currentTimeMillis()));
        c1023640ckE2.withParam(C2274581E1g.LJJIIZ, this.LLILZIL);
        return Unit.LIZ;
    }
}
