package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionViewModelV2;

/* JADX INFO: renamed from: X.15zx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20703915zx implements InterfaceC1731706qJ<Object, CLACaptionViewModelV2> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public CLACaptionViewModelV2 LL;
    public final InterfaceC1731706qJ LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C20703915zx.class, "vmByAssemViewModel", "getVmByAssemViewModel()Lcom/bytedance/assem/arch/viewModel/AssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public C20703915zx(ReusedAssem reusedAssem) {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CLACaptionViewModelV2.class);
        this.LLILLJJLI = C737910Sx3.LIZ(reusedAssem, C724750Sbp.LJIIJ(reusedAssem, c19719912DlLIZ), null, C1637806bA.LIZ, new C20704015zy(c19719912DlLIZ), null, new C20704115zz());
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.bytedance.assem.arch.viewModel.AssemViewModel, com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionViewModelV2] */
    @Override // X.InterfaceC1731706qJ
    public final CLACaptionViewModelV2 getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        if (this.LL == null) {
            this.LL = (AssemViewModel) this.LLILLJJLI.getValue(this, LLILLL[0]);
        }
        CLACaptionViewModelV2 cLACaptionViewModelV2 = this.LL;
        if (cLACaptionViewModelV2 == null) {
            return null;
        }
        return cLACaptionViewModelV2;
    }
}
