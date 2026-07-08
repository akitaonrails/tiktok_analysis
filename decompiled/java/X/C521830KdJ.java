package X;

import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.android.livesdk.adminsetting.LiveMuteRulesEditFragmentSheet;
import com.bytedance.android.livesdkapi.depend.model.live.debug.Answer;
import com.bytedance.android.livesdkapi.depend.model.live.debug.Question;
import com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCoursePinNoticeEditSheet;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0KdJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C521830KdJ implements TextWatcher {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void beforeTextChanged$0(C521830KdJ c521830KdJ, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(C521830KdJ c521830KdJ, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$2(C521830KdJ c521830KdJ, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$3(C521830KdJ c521830KdJ, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$1(C521830KdJ c521830KdJ, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$2(C521830KdJ c521830KdJ, CharSequence charSequence, int i, int i2, int i3) {
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
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
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
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0064 A[PHI: r4
      0x0064: PHI (r4v1 android.view.View) = (r4v0 android.view.View), (r4v3 android.view.View) binds: [B:21:0x004e, B:26:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void afterTextChanged$0(X.C521830KdJ r6, android.text.Editable r7) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C521830KdJ.afterTextChanged$0(X.0KdJ, android.text.Editable):void");
    }

    public static final void afterTextChanged$1(C521830KdJ c521830KdJ, Editable editable) {
        long j;
        if (editable != null) {
            C475090Ik7 c475090Ik7 = (C475090Ik7) c521830KdJ.l0;
            Question question = (Question) c521830KdJ.l1;
            String string = editable.toString();
            if (TextUtils.isEmpty(string)) {
                string = "";
            }
            if (question != null) {
                j = question.questionId;
            } else {
                j = 0;
            }
            Answer answer = c475090Ik7.LLILLL.LLILZ.get(Long.valueOf(j));
            if (answer != null) {
                HashSet<String> hashSet = answer.answers;
                if (hashSet != null) {
                    hashSet.clear();
                }
            } else {
                answer = new Answer(j, new HashSet());
            }
            answer.answers.add(string);
            c475090Ik7.LLILLL.LLILZ.put(Long.valueOf(j), answer);
            InterfaceC475100Ik8 interfaceC475100Ik8 = c475090Ik7.LLILLL.LLILZIL;
            if (interfaceC475100Ik8 != null) {
                interfaceC475100Ik8.eM();
            }
        }
    }

    public static final void afterTextChanged$2(C521830KdJ c521830KdJ, Editable editable) {
        int length;
        int max;
        if (editable != null) {
            length = editable.length();
        } else {
            length = 0;
        }
        C16F5 c16f5 = ((PcsCoursePinNoticeEditSheet) c521830KdJ.l0).LLILZ;
        if (c16f5 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(length);
            sbLIZ.append('/');
            C089E c089e = new C089E(((EditText) c521830KdJ.l1).getFilters());
            while (true) {
                if (c089e.hasNext()) {
                    InputFilter inputFilter = (InputFilter) c089e.next();
                    if (inputFilter instanceof InputFilter.LengthFilter) {
                        max = ((InputFilter.LengthFilter) inputFilter).getMax();
                        break;
                    }
                } else {
                    max = -1;
                    break;
                }
            }
            sbLIZ.append(max);
            c16f5.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (length <= 0) {
            C16F5 c16f52 = ((PcsCoursePinNoticeEditSheet) c521830KdJ.l0).LLILLL;
            if (c16f52 != null) {
                c16f52.setEnabled(false);
                C786410Ut5.k5(c16f52, 0.4f);
                return;
            }
            return;
        }
        C16F5 c16f53 = ((PcsCoursePinNoticeEditSheet) c521830KdJ.l0).LLILLL;
        if (c16f53 == null) {
            return;
        }
        c16f53.setEnabled(true);
        C786410Ut5.k5(c16f53, 1.0f);
    }

    public static final void afterTextChanged$3(C521830KdJ c521830KdJ, Editable editable) {
        ((C0K4H) c521830KdJ.l1).LIZ.LIZ = String.valueOf(editable);
        ((C0K40) c521830KdJ.l0).LLILLJJLI.IQ2();
    }

    public C521830KdJ(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onTextChanged$0(C521830KdJ c521830KdJ, CharSequence charSequence, int i, int i2, int i3) {
        int length;
        if (charSequence != null) {
            length = charSequence.length();
        } else {
            length = 0;
        }
        if (length >= ((LiveMuteRulesEditFragmentSheet) c521830KdJ.l0).LLLIIIIL) {
            C766270U4b.LIZLLL(2131841268);
        }
    }

    public static final void onTextChanged$3(C521830KdJ c521830KdJ, CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        int length = 0;
        if (charSequence != null && charSequence.length() > 50) {
            C0JCX.LIZLLL(((C0K40) c521830KdJ.l0).LL.getContext().getString(2131839334));
            ((C0K40) c521830KdJ.l0).LLILLL.setText(charSequence.subSequence(0, 50));
            ((C0K40) c521830KdJ.l0).LLILLL.setSelection(50);
        }
        TextView textView = ((C0K40) c521830KdJ.l0).LLILZ;
        StringBuilder sb = new StringBuilder();
        Editable editableLLLLJI = C2204961BRm.LLLLJI(((C0K40) c521830KdJ.l0).LLILLL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm9YYzNzjswHj2F3VAulxUa0OAqDFRqxwzyWDU72fVAuS1kJclzonE/JMyt/d7Om6L4SFQ3iteOY1Cf1q7ZP19abyWVVjWWYt2RVJtrZMUp", null));
        if (editableLLLLJI != null) {
            length = editableLLLLJI.length();
        }
        sb.append(length);
        sb.append("/50");
        textView.setText(sb.toString());
    }
}
