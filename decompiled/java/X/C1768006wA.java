package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.user.UserAssem;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.user.UserPanelViewModel;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.instruction.edit.InstructionEditAssem;
import com.ss.android.ugc.aweme.story.highlights.immersivesheet.StoryHighlightsCreationSheetFragment;
import com.ss.android.ugc.aweme.story.highlights.immersivesheet.StoryHighlightsImmersiveSheetVM;
import com.ss.android.ugc.aweme.story.userpanel.ui.StoryUserListPanelHeaderAssem;
import kotlin.jvm.internal.AwS53S1000000_2;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.06wA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1768006wA implements TextWatcher {
    public final int $t;
    public Object l0;

    public static final void afterTextChanged$1(C1768006wA c1768006wA, Editable editable) {
    }

    public static final void beforeTextChanged$0(C1768006wA c1768006wA, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(C1768006wA c1768006wA, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$2(C1768006wA c1768006wA, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$3(C1768006wA c1768006wA, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$4(C1768006wA c1768006wA, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$0(C1768006wA c1768006wA, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$2(C1768006wA c1768006wA, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$3(C1768006wA c1768006wA, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$4(C1768006wA c1768006wA, CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.$t) {
            case 0:
                afterTextChanged$0(this, editable);
                break;
            case 1:
                afterTextChanged$1(this, editable);
                break;
            case 2:
                afterTextChanged$2(this, editable);
                break;
            case 3:
                afterTextChanged$3(this, editable);
                break;
            case 4:
                afterTextChanged$4(this, editable);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                beforeTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                beforeTextChanged$1(this, charSequence, i, i2, i3);
                break;
            case 2:
                beforeTextChanged$2(this, charSequence, i, i2, i3);
                break;
            case 3:
                beforeTextChanged$3(this, charSequence, i, i2, i3);
                break;
            case 4:
                beforeTextChanged$4(this, charSequence, i, i2, i3);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                onTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                onTextChanged$1(this, charSequence, i, i2, i3);
                break;
            case 2:
                onTextChanged$2(this, charSequence, i, i2, i3);
                break;
            case 3:
                onTextChanged$3(this, charSequence, i, i2, i3);
                break;
            case 4:
                onTextChanged$4(this, charSequence, i, i2, i3);
                break;
        }
    }

    public C1768006wA(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void afterTextChanged$0(C1768006wA c1768006wA, Editable editable) {
        String string;
        UserPanelViewModel userPanelViewModelHp = ((UserAssem) c1768006wA.l0).hp();
        if (editable == null || (string = editable.toString()) == null) {
            string = "";
        }
        userPanelViewModelHp.setState(new AwS53S1000000_2(string, 26));
    }

    public static final void afterTextChanged$2(C1768006wA c1768006wA, Editable editable) {
        InterfaceC947803nA interfaceC947803nA;
        if (editable != null && (interfaceC947803nA = (InterfaceC947803nA) ((C259800zU) c1768006wA.l0).element) != null) {
            interfaceC947803nA.onNext(editable.toString());
        }
    }

    public static final void afterTextChanged$3(C1768006wA c1768006wA, Editable editable) {
        StoryHighlightsImmersiveSheetVM storyHighlightsImmersiveSheetVMSR = ((StoryHighlightsCreationSheetFragment) c1768006wA.l0).SR();
        storyHighlightsImmersiveSheetVMSR.LL.setValue(String.valueOf(editable));
    }

    public static final void afterTextChanged$4(C1768006wA c1768006wA, Editable editable) {
        String string;
        String string2;
        if (editable == null || (string2 = editable.toString()) == null || (string = a0.LJLIIIL(string2).toString()) == null) {
            string = "";
        }
        StoryUserListPanelHeaderAssem storyUserListPanelHeaderAssem = (StoryUserListPanelHeaderAssem) c1768006wA.l0;
        AnonymousClass0956 anonymousClass0956 = storyUserListPanelHeaderAssem.LLJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C1DFH c1dfh = C0PEM.LIZ;
        storyUserListPanelHeaderAssem.LLJI = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C06Y6(storyUserListPanelHeaderAssem, string, null), 3);
    }

    public static final void onTextChanged$1(C1768006wA c1768006wA, CharSequence charSequence, int i, int i2, int i3) {
        ((InstructionEditAssem) c1768006wA.l0).ip().setState(new AwS53S1000000_2(String.valueOf(charSequence), 28));
    }
}
