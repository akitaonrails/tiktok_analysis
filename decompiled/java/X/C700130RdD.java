package X;

import com.ss.android.ugc.aweme.frequency.model.RuleHitState;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RdD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700130RdD extends C09AY implements Function1<C12835050n, Boolean> {
    public final /* synthetic */ EnumC1450305m1 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C700190RdJ LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C700130RdD(EnumC1450305m1 enumC1450305m1, String str, String str2, String str3, C700190RdJ c700190RdJ) {
        super(1);
        this.LL = enumC1450305m1;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = c700190RdJ;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C12835050n c12835050n) {
        boolean zLIZ;
        String str;
        C12835050n c12835050n2 = c12835050n;
        if (this.LL == EnumC1450305m1.BY_PASS) {
            zLIZ = true;
        } else {
            C20653815rs c20653815rs = C20653815rs.LIZ;
            String str2 = this.LLILLJJLI;
            String str3 = this.LLILLL;
            String str4 = this.LLILZ;
            c20653815rs.getClass();
            RuleHitState ruleHitStateLIZ = C20653815rs.LIZ(str2, str3, str4);
            zLIZ = C700340RdY.LIZ(ruleHitStateLIZ);
            if (!zLIZ) {
                if (ruleHitStateLIZ != null) {
                    str = ruleHitStateLIZ.ruleStrategy;
                } else {
                    str = null;
                }
                c12835050n2.LIZ("density check failed", C2097908Jt.LIZJ(new Pair("outreach_strategy", str)));
                C699180Rbg c699180Rbg = C699180Rbg.LIZ;
                Function0<InterfaceC699200Rbi<?>> function0 = this.LLILZIL.LJIIIZ;
                String str5 = this.LLILLL;
                c699180Rbg.getClass();
                C699180Rbg.LIZ(function0, str5, ruleHitStateLIZ);
            }
        }
        return Boolean.valueOf(zLIZ);
    }
}
