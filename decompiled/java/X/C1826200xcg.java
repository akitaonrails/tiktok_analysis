package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.content.CustomizedBoardTextEditContentDescriptionAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm.FullyCustomizedBoardEditPageViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.setting.LiveSecondaryBoardItemMaxInputSetting;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0xcg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1826200xcg implements TextWatcher {
    public int LLILLJJLI;
    public final /* synthetic */ CustomizedBoardTextEditContentDescriptionAssem LLILZ;
    public final LinkedList<String> LL = new LinkedList<>();
    public final int LLILLL = LiveSecondaryBoardItemMaxInputSetting.INSTANCE.getValue().descLineLimit;

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C1826200xcg(CustomizedBoardTextEditContentDescriptionAssem customizedBoardTextEditContentDescriptionAssem) {
        this.LLILZ = customizedBoardTextEditContentDescriptionAssem;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) throws Throwable {
        int i;
        String string;
        String string2;
        Editable editableLLLIIIL = C2204961BRm.LLLIIIL(this.LLILZ.ip(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGtwrDPgFrNfxjCwZSeODpCZgAi+sxACTDGSjySpEBXETYFW6HJz8IX7dXItfrncbtCedtf/syrizfX9N/6hHZy2STvp1lnORDb4ILja6IN37lbKpNeWuB3bjgfxbqPiRIJOvbIjENO7mrRccif8lnXAJ6U=", null));
        if (editableLLLIIIL != null && editableLLLIIIL.length() > 0) {
            i = 8388627;
        } else {
            i = 8388659;
        }
        if (this.LLILZ.ip().getGravity() != i) {
            this.LLILZ.ip().setGravity(i);
        }
        Editable editableLLLIIIL2 = C2204961BRm.LLLIIIL(this.LLILZ.ip(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGtwrDPgFrNfxjCwZSeODpCZgAi+sxACTDGSjySpEBXETYFW6HJz8IX7dXItfrncbtCedtf/syrizfX9N/6hHZy2STvp1lnORDb4ILja6IN37lbKpNeWuB3bjgfxbqPiRIJOvbIjENO7mrRccif8lnXAJ6U=", null));
        if (editableLLLIIIL2 != null && (string = editableLLLIIIL2.toString()) != null) {
            final String strPop = this.LL.pop();
            if (string.length() > this.LLILZ.lp()) {
                CustomizedBoardTextEditContentDescriptionAssem customizedBoardTextEditContentDescriptionAssem = this.LLILZ;
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
                interfaceC1818210xPnHp.jq(new C1817880xPG(C497740JfY.LJIJJ(2131851424, Integer.valueOf(this.LLILZ.lp())), "ttlive_boards_live_createBoard_characterToast"));
                String strSubstring = string.substring(0, this.LLILZ.lp());
                this.LLILZ.ip().setText(strSubstring);
                this.LLILZ.ip().setSelection(strSubstring.length());
                AssemVMLazy assemVMLazy = this.LLILZ.LLJJJ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CustomizedBoardTextEditContentDescriptionAssem.LLJLIL;
                FullyCustomizedBoardEditPageViewModel fullyCustomizedBoardEditPageViewModel = (FullyCustomizedBoardEditPageViewModel) assemVMLazy.getValue();
                Editable editableLLLIIIL3 = C2204961BRm.LLLIIIL(this.LLILZ.ip(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGtwrDPgFrNfxjCwZSeODpCZgAi+sxACTDGSjySpEBXETYFW6HJz8IX7dXItfrncbtCedtf/syrizfX9N/6hHZy2STvp1lnORDb4ILja6IN37lbKpNeWuB3bjgfxbqPiRIJOvbIjENO7mrRccif8lnXAJ6U=", null));
                if (editableLLLIIIL3 == null || (string2 = editableLLLIIIL3.toString()) == null) {
                    string2 = "";
                }
                ((BoardItem) fullyCustomizedBoardEditPageViewModel.LLILLJJLI.getValue()).fullyCustomizedContent = string2;
                fullyCustomizedBoardEditPageViewModel.vQ2();
                return;
            }
            C1836370xt5 c1836370xt5Ip = this.LLILZ.ip();
            final CustomizedBoardTextEditContentDescriptionAssem customizedBoardTextEditContentDescriptionAssem2 = this.LLILZ;
            HandlerHook.viewPost(c1836370xt5Ip, new Runnable() { // from class: X.0xch
                public final void LIZ() throws Throwable {
                    String string3;
                    C1836370xt5 c1836370xt5Ip2 = customizedBoardTextEditContentDescriptionAssem2.ip();
                    String str = strPop;
                    C1826200xcg c1826200xcg = this;
                    if (str != null && c1836370xt5Ip2.getLineCount() > c1826200xcg.LLILLL) {
                        c1836370xt5Ip2.setText(str);
                        Editable editableLLLIIIL4 = C2204961BRm.LLLIIIL(c1836370xt5Ip2, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGtwrDPgFrNfxjCwZSeODpCZgAi+sxACTDGSjySpEBXETYFW6HJz8IX7dXItfrncbtCedtf/syrizfX9N/6hHZy2STvp1lnORDb4ILja6IN37lbKpNeWuB3bjgfxbqPiRIJOvbIjENO7mrRccif8lnXAJ6U=", null));
                        int length = editableLLLIIIL4 != null ? editableLLLIIIL4.length() : 0;
                        if (Math.min(c1826200xcg.LLILLJJLI, length) >= 0) {
                            c1836370xt5Ip2.setSelection(Math.min(c1826200xcg.LLILLJJLI, length));
                        } else {
                            c1836370xt5Ip2.setSelection(0);
                        }
                        int i2 = c1826200xcg.LLILLL;
                        C766270U4b.LJIIJJI(C497740JfY.LJIIL(2131755793, i2, Integer.valueOf(i2)));
                    }
                    AssemVMLazy assemVMLazy2 = customizedBoardTextEditContentDescriptionAssem2.LLJJJ;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = CustomizedBoardTextEditContentDescriptionAssem.LLJLIL;
                    FullyCustomizedBoardEditPageViewModel fullyCustomizedBoardEditPageViewModel2 = (FullyCustomizedBoardEditPageViewModel) assemVMLazy2.getValue();
                    Editable editableLLLIIIL5 = C2204961BRm.LLLIIIL(customizedBoardTextEditContentDescriptionAssem2.ip(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGtwrDPgFrNfxjCwZSeODpCZgAi+sxACTDGSjySpEBXETYFW6HJz8IX7dXItfrncbtCedtf/syrizfX9N/6hHZy2STvp1lnORDb4ILja6IN37lbKpNeWuB3bjgfxbqPiRIJOvbIjENO7mrRccif8lnXAJ6U=", null));
                    if (editableLLLIIIL5 == null || (string3 = editableLLLIIIL5.toString()) == null) {
                        string3 = "";
                    }
                    ((BoardItem) fullyCustomizedBoardEditPageViewModel2.LLILLJJLI.getValue()).fullyCustomizedContent = string3;
                    fullyCustomizedBoardEditPageViewModel2.vQ2();
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("CustomizedBoardTextEditContentDescriptionAssem@216b.textWatcher$1$afterTextChanged$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("CustomizedBoardTextEditContentDescriptionAssem@216b.textWatcher$1$afterTextChanged$1");
                }
            });
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.LL.push(String.valueOf(C2204961BRm.LLLIIIL(this.LLILZ.ip(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGtwrDPgFrNfxjCwZSeODpCZgAi+sxACTDGSjySpEBXETYFW6HJz8IX7dXItfrncbtCedtf/syrizfX9N/6hHZy2STvp1lnORDb4ILja6IN37lbKpNeWuB3bjgfxbqPiRIJOvbIjENO7mrRccif8lnXAJ6U=", null))));
        this.LLILLJJLI = this.LLILZ.ip().getSelectionStart();
    }
}
