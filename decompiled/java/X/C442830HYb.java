package X;

import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tiktok.homepage.mainpagefragment.SocialAvatarIconFlipPrerequisiteViewModel;
import com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageSocialAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0HYb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C442830HYb extends C09AY implements Function0<Unit> {
    public final /* synthetic */ MainPageSocialAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C442830HYb(MainPageSocialAssem mainPageSocialAssem) {
        super(0);
        this.LL = mainPageSocialAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (!C1578630rBN.LJIIIZ(this.LL)) {
            MainPageSocialAssem mainPageSocialAssem = this.LL;
            AssemVMLazy assemVMLazy = mainPageSocialAssem.LLJILLL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MainPageSocialAssem.LLJJJIL;
            C736680Sv4.LJIIIIZZ(mainPageSocialAssem, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.08r6
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C2003307t1) obj).LLILLJJLI);
                }
            }, C736820SvI.LIZLLL(), new C446410Hex(this.LL), 4);
            SocialAvatarIconFlipPrerequisiteViewModel socialAvatarIconFlipPrerequisiteViewModel = (SocialAvatarIconFlipPrerequisiteViewModel) this.LL.LLJILLL.getValue();
            C1910890zpH logger = socialAvatarIconFlipPrerequisiteViewModel.getLogger();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SocialAvatarIconFlipPrerequisiteViewModel performPrivacyPopupShowCheck with ");
            sbLIZ.append(socialAvatarIconFlipPrerequisiteViewModel.hashCode());
            logger.LIZ("iconFlipVM", C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC497601wk assemVMScope = socialAvatarIconFlipPrerequisiteViewModel.getAssemVMScope();
            C1DFB c1dfb = C0PEM.LIZJ;
            C23250099c.LIZLLL(assemVMScope, c1dfb, null, new C0HYR(socialAvatarIconFlipPrerequisiteViewModel, null), 2);
            SocialAvatarIconFlipPrerequisiteViewModel socialAvatarIconFlipPrerequisiteViewModel2 = (SocialAvatarIconFlipPrerequisiteViewModel) this.LL.LLJILLL.getValue();
            if (C1644806cI.LIZJ()) {
                C1910890zpH logger2 = socialAvatarIconFlipPrerequisiteViewModel2.getLogger();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("SocialAvatarIconFlipPrerequisiteViewModel listenToSocialAvatarStatus start with ");
                sbLIZ2.append(C0XQ7.LJFF().getCurUserId());
                sbLIZ2.append(" is ");
                sbLIZ2.append(C0XQ7.LJFF().getCurUserId());
                logger2.LIZ("iconFlipVM", C2188811AlT.LIZIZ(sbLIZ2));
                C23250099c.LIZLLL(socialAvatarIconFlipPrerequisiteViewModel2.getAssemVMScope(), c1dfb, null, new C437590HDx(socialAvatarIconFlipPrerequisiteViewModel2, null), 2);
            }
        }
        return Unit.LIZ;
    }
}
