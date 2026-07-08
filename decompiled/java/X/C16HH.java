package X;

import android.text.Editable;
import android.view.View;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.story.userpanel.ui.StoryUserListPanelHeaderAssem;
import com.ss.android.ugc.aweme.topic.trendingtopic.ui.VideoTrendingTopicHeaderAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS43S0010000_31;

/* JADX INFO: renamed from: X.16HH, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16HH implements View.OnFocusChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.$t) {
            case 0:
                onFocusChange$0(this, view, z);
                break;
            case 1:
                onFocusChange$1(this, view, z);
                break;
            case 2:
                onFocusChange$2(this, view, z);
                break;
            case 3:
                onFocusChange$3(this, view, z);
                break;
        }
    }

    public C16HH(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFocusChange$0(C16HH c16hh, View view, boolean z) {
        if (z) {
            C786410Ut5.LLF(0, (ViewOnAttachStateChangeListenerC20604515jv) ((VideoTrendingTopicHeaderAssem) c16hh.l0).LJJIJL().findViewById(R.id.tds));
            View view2 = ((VideoTrendingTopicHeaderAssem) c16hh.l0).LLJ;
            View view3 = null;
            if (view2 == null) {
                view2 = null;
            }
            C786410Ut5.LJLLLLLL(0, view2);
            View view4 = ((VideoTrendingTopicHeaderAssem) c16hh.l0).LLJI;
            if (view4 != null) {
                view3 = view4;
            }
            C786410Ut5.LJLLLLLL(0, view3);
        }
    }

    public static final void onFocusChange$1(C16HH c16hh, View view, boolean z) {
        ((AssemViewModel) ((StoryUserListPanelHeaderAssem) c16hh.l0).LLIZLLLIL.getValue()).setState(new AwS43S0010000_31(z, 19));
    }

    public static final void onFocusChange$2(C16HH c16hh, View view, boolean z) {
        int height;
        Editable editableLLLFFI;
        Editable editableLLLFFI2;
        String string = null;
        int length = 0;
        if (!z) {
            C20376014oA c20376014oA = (C20376014oA) c16hh.l0;
            c20376014oA.LIZ(false);
            LiveEditText liveEditText = c20376014oA.LLILLL;
            if (liveEditText != null) {
                liveEditText.setMinHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
            }
            c20376014oA.LLJI = 0;
            InterfaceC20376314oD interfaceC20376314oD = c20376014oA.LLJILJIL;
            if (interfaceC20376314oD != null) {
                LiveEditText liveEditText2 = c20376014oA.LLILLL;
                if (liveEditText2 != null && (editableLLLFFI2 = C2204961BRm.LLLFFI(liveEditText2, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+2VtFZpmdg6UUTXIC64GRAvPEceM8Zqav/OjVT0skDfdYqrRfCjtPWLhN4RLmgaDCg=", null))) != null) {
                    string = editableLLLFFI2.toString();
                }
                interfaceC20376314oD.LIZIZ(string, false);
                return;
            }
            return;
        }
        C20376014oA c20376014oA2 = (C20376014oA) c16hh.l0;
        c20376014oA2.LLIZ = false;
        c20376014oA2.LIZ(true);
        LiveEditText liveEditText3 = c20376014oA2.LLILLL;
        if (liveEditText3 != null) {
            liveEditText3.setMinHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)));
        }
        LiveEditText liveEditText4 = c20376014oA2.LLILLL;
        if (liveEditText4 != null) {
            height = liveEditText4.getHeight();
        } else {
            height = 0;
        }
        c20376014oA2.LLJI = height;
        try {
            LiveEditText liveEditText5 = c20376014oA2.LLILLL;
            if (liveEditText5 != null) {
                Editable editableLLLFZ = C2204961BRm.LLLFZ(liveEditText5, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+2VtFZpmdg6UUTXIC64GRAvPEceM8Zqav/OjVT0skDfdYqrRfCjtPWLhN4RLmgaDCg=", null));
                if (editableLLLFZ != null) {
                    length = editableLLLFZ.length();
                }
                liveEditText5.setSelection(length);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJ("TextAreaColumField", String.valueOf(th.getMessage()));
        }
        InterfaceC20376314oD interfaceC20376314oD2 = c20376014oA2.LLJILJIL;
        if (interfaceC20376314oD2 == null) {
            return;
        }
        LiveEditText liveEditText6 = c20376014oA2.LLILLL;
        if (liveEditText6 != null && (editableLLLFFI = C2204961BRm.LLLFFI(liveEditText6, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+2VtFZpmdg6UUTXIC64GRAvPEceM8Zqav/OjVT0skDfdYqrRfCjtPWLhN4RLmgaDCg=", null))) != null) {
            string = editableLLLFFI.toString();
        }
        interfaceC20376314oD2.LIZIZ(string, true);
    }

    public static final void onFocusChange$3(C16HH c16hh, View view, boolean z) {
        Editable editableLLLFFI;
        Editable editableLLLFFI2;
        String string = null;
        if (!z) {
            C20375614o6 c20375614o6 = (C20375614o6) c16hh.l0;
            c20375614o6.LIZ(false);
            InterfaceC20376314oD interfaceC20376314oD = c20375614o6.LLJ;
            if (interfaceC20376314oD != null) {
                LiveEditText liveEditText = c20375614o6.LLILLL;
                if (liveEditText != null && (editableLLLFFI2 = C2204961BRm.LLLFFI(liveEditText, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+2VtFZpmdg6UUTXIC64GRAvPEceM8Zqav/OjVT0skDfdYqrRfCjtOSLn+0VDW0b", null))) != null) {
                    string = editableLLLFFI2.toString();
                }
                interfaceC20376314oD.LIZIZ(string, false);
                return;
            }
            return;
        }
        C20375614o6 c20375614o62 = (C20375614o6) c16hh.l0;
        c20375614o62.LIZ(true);
        InterfaceC20376314oD interfaceC20376314oD2 = c20375614o62.LLJ;
        if (interfaceC20376314oD2 != null) {
            LiveEditText liveEditText2 = c20375614o62.LLILLL;
            if (liveEditText2 != null && (editableLLLFFI = C2204961BRm.LLLFFI(liveEditText2, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+2VtFZpmdg6UUTXIC64GRAvPEceM8Zqav/OjVT0skDfdYqrRfCjtOSLn+0VDW0b", null))) != null) {
                string = editableLLLFFI.toString();
            }
            interfaceC20376314oD2.LIZIZ(string, true);
        }
        ((C20375614o6) c16hh.l0).LLIZLLLIL = false;
    }
}
