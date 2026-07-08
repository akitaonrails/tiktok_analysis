package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.comment.exposedcmt.ExposedCommentVM;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0RqT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C708350RqT implements InterfaceC1731706qJ<Object, ExposedCommentVM> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public ExposedCommentVM LL;
    public final InterfaceC1731706qJ LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C708350RqT.class, "vmByAssemViewModel", "getVmByAssemViewModel()Lcom/bytedance/assem/arch/viewModel/AssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public C708350RqT(ReusedAssem reusedAssem) {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ExposedCommentVM.class);
        this.LLILLJJLI = C737910Sx3.LIZ(reusedAssem, C724750Sbp.LJIIJ(reusedAssem, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 1682), null, AFwS243S0000000_11.get$arr$(829));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.bytedance.assem.arch.viewModel.AssemViewModel, com.ss.android.ugc.aweme.comment.exposedcmt.ExposedCommentVM] */
    @Override // X.InterfaceC1731706qJ
    public final ExposedCommentVM getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        if (this.LL == null) {
            this.LL = (AssemViewModel) this.LLILLJJLI.getValue(this, LLILLL[0]);
        }
        ExposedCommentVM exposedCommentVM = this.LL;
        if (exposedCommentVM == null) {
            return null;
        }
        return exposedCommentVM;
    }
}
