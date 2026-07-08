package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.detailpage.audit.fragment.AuditRequestFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS257S0000000_19;

/* JADX INFO: renamed from: X.0hnM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1217780hnM extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ AuditRequestFragment LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1217780hnM(AuditRequestFragment auditRequestFragment, String str, long j, int i) {
        super(1);
        this.LL = auditRequestFragment;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        assembler2.DQ2(this.LL, new C1218640hok(this.LLILLJJLI, this.LLILLL, this.LLILZ));
        assembler2.QQ2(this.LL, AFwS257S0000000_19.get$arr$(140));
        assembler2.QQ2(this.LL, AFwS257S0000000_19.get$arr$(141));
        assembler2.RQ2(this.LL, AFwS257S0000000_19.get$arr$(142));
        assembler2.QQ2(this.LL, AFwS257S0000000_19.get$arr$(143));
        return Unit.LIZ;
    }
}
