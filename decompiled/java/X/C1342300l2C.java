package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.commentlist.managementv2.CommentManagementAssemVM;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardVMAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS32S0010000_18;

/* JADX INFO: renamed from: X.0l2C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1342300l2C extends C09AY implements Function1<C1159060gGe, Unit> {
    public final /* synthetic */ CommentManagementAssemVM LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Fragment LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1342300l2C(CommentManagementAssemVM commentManagementAssemVM, boolean z, Fragment fragment, boolean z2) {
        super(1);
        this.LL = commentManagementAssemVM;
        this.LLILLJJLI = z;
        this.LLILLL = fragment;
        this.LLILZ = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1159060gGe c1159060gGe) {
        InterfaceC665370Q7z interfaceC665370Q7z;
        ICommentListVMAbility iCommentListVMAbilityLJ;
        InterfaceC665370Q7z interfaceC665370Q7z2;
        IKeyboardVMAbility iKeyboardVMAbilityLJIIIIZZ;
        EnumC1341660l1A enumC1341660l1A;
        this.LL.setState(new AwS32S0010000_18(this.LLILZ, 34));
        if (!this.LLILLJJLI && (interfaceC665370Q7z2 = this.LL.LLILZ) != null && (iKeyboardVMAbilityLJIIIIZZ = C1345760l7m.LJIIIIZZ(this.LLILLL, interfaceC665370Q7z2)) != null) {
            if (this.LLILZ) {
                enumC1341660l1A = EnumC1341660l1A.MANAGE_MODE;
            } else {
                enumC1341660l1A = EnumC1341660l1A.AVAILABLE;
            }
            iKeyboardVMAbilityLJIIIIZZ.Ti1(enumC1341660l1A);
        }
        if (this.LLILZ && (interfaceC665370Q7z = this.LL.LLILZ) != null && (iCommentListVMAbilityLJ = C1345760l7m.LJ(this.LLILLL, interfaceC665370Q7z)) != null) {
            iCommentListVMAbilityLJ.qI0();
        }
        return Unit.LIZ;
    }
}
