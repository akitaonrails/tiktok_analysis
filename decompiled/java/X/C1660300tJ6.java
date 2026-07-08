package X;

import com.ss.android.ugc.aweme.social.creation.edit.uiview.EditToolbarViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tJ6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1660300tJ6 extends C2217421BqW implements Function2<AbstractC1678220tm0, InterfaceC1660090tIl, Unit> {
    public C1660300tJ6(EditToolbarViewModel editToolbarViewModel) {
        super(2, editToolbarViewModel, EditToolbarViewModel.class, "handleUiActionForEditItem", "handleUiActionForEditItem(Lcom/ss/android/ugc/aweme/social/creation/common/toolbar/ToolbarItemType$Edit;Lcom/ss/android/ugc/aweme/social/creation/common/toolbar/ToolbarUiAction;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(AbstractC1678220tm0 abstractC1678220tm0, InterfaceC1660090tIl interfaceC1660090tIl) {
        AbstractC1678220tm0 abstractC1678220tm02 = abstractC1678220tm0;
        InterfaceC1660090tIl interfaceC1660090tIl2 = interfaceC1660090tIl;
        EditToolbarViewModel editToolbarViewModel = (EditToolbarViewModel) this.receiver;
        editToolbarViewModel.getClass();
        if (interfaceC1660090tIl2 instanceof C1660220tIy) {
            editToolbarViewModel.LLILLJJLI.invoke(abstractC1678220tm02);
        }
        InterfaceC1660130tIp interfaceC1660130tIpVQ2 = editToolbarViewModel.vQ2(abstractC1678220tm02);
        if (interfaceC1660130tIpVQ2 != null) {
            interfaceC1660130tIpVQ2.LIZ(interfaceC1660090tIl2);
        }
        return Unit.LIZ;
    }
}
