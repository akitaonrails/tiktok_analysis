package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel;

/* JADX INFO: renamed from: X.0Rk8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C704420Rk8 implements InterfaceC1731706qJ<Object, TranslationStatusViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public TranslationStatusViewModel LL;
    public final InterfaceC1731706qJ LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C704420Rk8.class, "vmByAssemViewModel", "getVmByAssemViewModel()Lcom/bytedance/assem/arch/viewModel/AssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public C704420Rk8(ReusedAssem reusedAssem) {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TranslationStatusViewModel.class);
        this.LLILLJJLI = C737910Sx3.LIZ(reusedAssem, C724750Sbp.LJIIJ(reusedAssem, c19719912DlLIZ), null, C1637806bA.LIZ, new C704410Rk7(c19719912DlLIZ), null, new C704430Rk9());
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.bytedance.assem.arch.viewModel.AssemViewModel, com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel] */
    @Override // X.InterfaceC1731706qJ
    public final TranslationStatusViewModel getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        if (this.LL == null) {
            this.LL = (AssemViewModel) this.LLILLJJLI.getValue(this, LLILLL[0]);
        }
        TranslationStatusViewModel translationStatusViewModel = this.LL;
        if (translationStatusViewModel == null) {
            return null;
        }
        return translationStatusViewModel;
    }
}
