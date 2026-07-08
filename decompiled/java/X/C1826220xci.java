package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.content.CustomizedBoardTextEditContentDescriptionAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm.FullyCustomizedBoardTextColorViewModel;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xci, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1826220xci extends C09AY implements Function2<UIAssem, C291001Au<? extends String>, Unit> {
    public final /* synthetic */ CustomizedBoardTextEditContentDescriptionAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1826220xci(CustomizedBoardTextEditContentDescriptionAssem customizedBoardTextEditContentDescriptionAssem) {
        super(2);
        this.LL = customizedBoardTextEditContentDescriptionAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends String> c291001Au) {
        String strLIZ = c291001Au.LIZ();
        if (strLIZ != null) {
            CustomizedBoardTextEditContentDescriptionAssem customizedBoardTextEditContentDescriptionAssem = this.LL;
            C500260Jjc.LLFFF(customizedBoardTextEditContentDescriptionAssem.ip());
            customizedBoardTextEditContentDescriptionAssem.ip().setText(strLIZ);
            customizedBoardTextEditContentDescriptionAssem.mp(customizedBoardTextEditContentDescriptionAssem.ip());
            customizedBoardTextEditContentDescriptionAssem.ip().setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), customizedBoardTextEditContentDescriptionAssem.ip().getPaddingTop(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            if (strLIZ.length() > customizedBoardTextEditContentDescriptionAssem.lp()) {
                InterfaceC1818210xPn interfaceC1818210xPnHp = customizedBoardTextEditContentDescriptionAssem.LLJJL;
                if (interfaceC1818210xPnHp == null) {
                    synchronized (customizedBoardTextEditContentDescriptionAssem) {
                        interfaceC1818210xPnHp = customizedBoardTextEditContentDescriptionAssem.LLJJL;
                        if (interfaceC1818210xPnHp == null) {
                            interfaceC1818210xPnHp = customizedBoardTextEditContentDescriptionAssem.hp();
                            customizedBoardTextEditContentDescriptionAssem.LLJJL = interfaceC1818210xPnHp;
                        }
                    }
                }
                interfaceC1818210xPnHp.jq(new C1817880xPG(C497740JfY.LJIJJ(2131851424, Integer.valueOf(customizedBoardTextEditContentDescriptionAssem.lp())), "ttlive_boards_live_createBoard_characterToast"));
                strLIZ = strLIZ.substring(0, customizedBoardTextEditContentDescriptionAssem.lp());
            }
            customizedBoardTextEditContentDescriptionAssem.ip().setText(strLIZ);
            customizedBoardTextEditContentDescriptionAssem.ip().setSelection(strLIZ.length());
            if (!customizedBoardTextEditContentDescriptionAssem.LLJJJJJIL) {
                FullyCustomizedBoardTextColorViewModel fullyCustomizedBoardTextColorViewModelKp = customizedBoardTextEditContentDescriptionAssem.kp();
                if (fullyCustomizedBoardTextColorViewModelKp.wQ2().LIZ()) {
                    fullyCustomizedBoardTextColorViewModelKp.withState(new C01D3(fullyCustomizedBoardTextColorViewModelKp));
                }
                customizedBoardTextEditContentDescriptionAssem.kp().vQ2();
                customizedBoardTextEditContentDescriptionAssem.LLJJJJJIL = true;
            }
        }
        return Unit.LIZ;
    }
}
