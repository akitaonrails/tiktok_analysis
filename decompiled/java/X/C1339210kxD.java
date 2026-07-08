package X;

import android.text.Editable;
import android.view.KeyEvent;
import android.widget.TextView;
import com.bytedance.ies.xelement.input.LynxTextAreaView;
import com.ss.android.ugc.aweme.poi.textarea.LocalServiceTextArea;
import com.ss.android.ugc.aweme.poi.textarea.LocalServiceTextAreaNew;

/* JADX INFO: renamed from: X.0kxD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1339210kxD implements TextView.OnEditorActionListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.$t) {
            case 0:
                return onEditorAction$0(this, textView, i, keyEvent);
            case 1:
                return onEditorAction$1(this, textView, i, keyEvent);
            case 2:
                return onEditorAction$2(this, textView, i, keyEvent);
            default:
                return false;
        }
    }

    public C1339210kxD(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final boolean onEditorAction$0(C1339210kxD c1339210kxD, TextView textView, int i, KeyEvent keyEvent) throws Throwable {
        if (i != 0 && i != 2 && i != 3 && i != 4 && i != 5 && i != 6) {
            return false;
        }
        LocalServiceTextArea localServiceTextArea = (LocalServiceTextArea) c1339210kxD.l0;
        if (!localServiceTextArea.LLJJJIL) {
            return false;
        }
        C1298720jtu c1298720jtu = localServiceTextArea.mContext.LLIZ;
        C1289960jfm c1289960jfm = new C1289960jfm(localServiceTextArea.getSign(), "confirm");
        String string = null;
        Editable editableLLLLII = C2204961BRm.LLLLII((C21397018oS) c1339210kxD.l1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqnatHa2SoBJs7n+GpotKgle3l7urOBr7eA1VhaZX/pgQ==", null));
        if (editableLLLLII != null) {
            string = editableLLLLII.toString();
        }
        c1289960jfm.LIZIZ(string, "value");
        c1298720jtu.LIZIZ(c1289960jfm);
        return false;
    }

    public static final boolean onEditorAction$1(C1339210kxD c1339210kxD, TextView textView, int i, KeyEvent keyEvent) throws Throwable {
        if (i != 0 && i != 2 && i != 3 && i != 4 && i != 5 && i != 6) {
            return false;
        }
        LocalServiceTextAreaNew localServiceTextAreaNew = (LocalServiceTextAreaNew) c1339210kxD.l0;
        if (!localServiceTextAreaNew.LLJJJIL) {
            return false;
        }
        C1298720jtu c1298720jtu = localServiceTextAreaNew.mContext.LLIZ;
        C1289960jfm c1289960jfm = new C1289960jfm(localServiceTextAreaNew.getSign(), "confirm");
        String string = null;
        Editable editableLLLLII = C2204961BRm.LLLLII((C21397018oS) c1339210kxD.l1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqnatHa2SoBJs7n+GpotKgle3l7urOBr7eA1VhaZX/pgY2T7Q==", null));
        if (editableLLLLII != null) {
            string = editableLLLLII.toString();
        }
        c1289960jfm.LIZIZ(string, "value");
        c1298720jtu.LIZIZ(c1289960jfm);
        return false;
    }

    public static final boolean onEditorAction$2(C1339210kxD c1339210kxD, TextView textView, int i, KeyEvent keyEvent) throws Throwable {
        LynxTextAreaView lynxTextAreaView = (LynxTextAreaView) c1339210kxD.l0;
        C21397018oS c21397018oS = (C21397018oS) c1339210kxD.l1;
        if ((i != 0 && i != 2 && i != 3 && i != 4 && i != 5 && i != 6) || !lynxTextAreaView.LLJJJIL) {
            return false;
        }
        C1298720jtu c1298720jtu = lynxTextAreaView.mContext.LLIZ;
        C1289960jfm c1289960jfm = new C1289960jfm(lynxTextAreaView.getSign(), "confirm");
        String string = null;
        Editable editableLLLLII = C2204961BRm.LLLLII(c21397018oS, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvW5E5Tb1cuCxHeYGA/Jtubh98hIYE2+6xAQb2wHJXw==", null));
        if (editableLLLLII != null) {
            string = editableLLLLII.toString();
        }
        c1289960jfm.LIZIZ(string, "value");
        c1298720jtu.LIZIZ(c1289960jfm);
        return false;
    }
}
