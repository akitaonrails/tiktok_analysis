package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionViewModelV2;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.15zn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20702915zn implements InterfaceC1731706qJ<Object, CLACaptionViewModelV2> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public CLACaptionViewModelV2 LL;
    public final InterfaceC1731706qJ LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C20702915zn.class, "vmByAssemViewModel", "getVmByAssemViewModel()Lcom/bytedance/assem/arch/viewModel/AssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public C20702915zn(ReusedAssem reusedAssem) {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CLACaptionViewModelV2.class);
        this.LLILLJJLI = C737910Sx3.LIZ(reusedAssem, C724750Sbp.LJIIJ(reusedAssem, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS575S0100000_31(c19719912DlLIZ, 227), null, AFwS276S0000000_31.get$arr$(49));
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
