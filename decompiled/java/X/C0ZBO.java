package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.editinfo.EditGroupInfoFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS248S0000000_14;

/* JADX INFO: renamed from: X.0ZBO, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZBO extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ EditGroupInfoFragment LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZBO(EditGroupInfoFragment editGroupInfoFragment, String str, String str2, boolean z) {
        super(1);
        this.LL = editGroupInfoFragment;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        assembler2.DQ2(this.LL, new C0ZBP(this.LLILLJJLI, this.LLILLL, this.LLILZ));
        assembler2.QQ2(this.LL, AFwS248S0000000_14.get$arr$(40));
        assembler2.QQ2(this.LL, AFwS248S0000000_14.get$arr$(41));
        assembler2.QQ2(this.LL, AFwS229S0000000_2.get$arr$(82));
        assembler2.QQ2(this.LL, AFwS229S0000000_2.get$arr$(83));
        assembler2.QQ2(this.LL, AFwS248S0000000_14.get$arr$(42));
        return Unit.LIZ;
    }
}
