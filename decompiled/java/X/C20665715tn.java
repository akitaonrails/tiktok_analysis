package X;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.15tn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20665715tn extends AbstractViewOnClickListenerC20665415tk {
    public final TuxTextView LLILZ;
    public final TuxTextView LLILZIL;
    public final TuxTextView LLILZLL;
    public final ConstraintLayout LLIZ;

    @Override // X.AbstractViewOnClickListenerC20665415tk
    public final void LJFF() {
        this.LLILZ.setText("");
        this.LLILZLL.setText("");
        this.LLILZIL.setText("");
    }

    @Override // X.AbstractViewOnClickListenerC20665415tk
    public void LIZLLL(InnerPushMessage innerPushMessage) {
        boolean z;
        super.LIZLLL(innerPushMessage);
        InnerPushUITemplate templatePushMsg = getTemplatePushMsg();
        if (templatePushMsg != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("middle view bindContent title:");
            sbLIZ.append(templatePushMsg.title);
            sbLIZ.append(" avatar2 url:");
            sbLIZ.append(templatePushMsg.title);
            C19290510dT.LIZ("inner_push_platform", C2188811AlT.LIZIZ(sbLIZ));
            String str = templatePushMsg.title;
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                this.LLILZ.setText(templatePushMsg.title);
                TuxTextView tuxTextView = this.LLILZLL;
                CharSequence charSequence = templatePushMsg.content;
                if (charSequence == null) {
                    charSequence = templatePushMsg.contentChar;
                }
                tuxTextView.setText(charSequence);
                if (templatePushMsg.contentLimitLines != this.LLILZLL.getMaxLines()) {
                    this.LLILZLL.setMaxLines(templatePushMsg.contentLimitLines);
                }
            } else {
                C786410Ut5.LL(8, this.LLIZ);
                this.LLILZLL.setMaxLines(3);
                TuxTextView tuxTextView2 = this.LLILZLL;
                CharSequence charSequence2 = templatePushMsg.content;
                if (charSequence2 == null && (charSequence2 = templatePushMsg.contentChar) == null) {
                    charSequence2 = "";
                }
                tuxTextView2.setText(charSequence2);
            }
            String str2 = templatePushMsg.tagText;
            if (str2 != null && str2.length() != 0) {
                this.LLILZIL.setText(templatePushMsg.tagText);
                C786410Ut5.LLLLZLL(this.LLILZIL, 0);
            } else {
                C786410Ut5.LLLLZLL(this.LLILZIL, 8);
            }
            if (templatePushMsg.middleAlignment == 1) {
                this.LLILZ.setGravity(17);
                this.LLILZLL.setGravity(17);
                setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), 0);
                this.LLILZ.setTuxFont(33);
            }
        }
    }

    @Override // X.AbstractViewOnClickListenerC20665415tk
    public final boolean LJ(int i, View view) {
        String str;
        InterfaceC19330810jy interfaceC19330810jyLIZ;
        InnerPushMessage curMsg = getCurMsg();
        if (curMsg != null && (interfaceC19330810jyLIZ = C20641815pw.LIZ(curMsg.getType())) != null && interfaceC19330810jyLIZ.LIZ(i, curMsg)) {
            return true;
        }
        InnerPushUITemplate templatePushMsg = getTemplatePushMsg();
        if (templatePushMsg == null || (str = templatePushMsg.middleSchemaUrl) == null) {
            return false;
        }
        LIZ(2, getCurMsg(), str);
        return true;
    }

    public C20665715tn(Context context, AttributeSet attributeSet, int i) {
        View viewInflate;
        super(context, attributeSet, i);
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (C20674015v8.LIZIZ() && C20673215v0.LIZ(R.layout.ctd, context) && activityLIZ != null) {
            viewInflate = C20673215v0.LIZLLL(R.layout.ctd, activityLIZ, this, true);
        } else if (C20674015v8.LIZJ() && activityLIZ != null) {
            viewInflate = C21146717pB.LIZIZ(activityLIZ, R.layout.ctd, this, true);
        } else {
            viewInflate = FrameLayout.inflate(context, R.layout.ctd, this);
        }
        this.LLILZ = (TuxTextView) viewInflate.findViewById(R.id.kov);
        this.LLILZIL = (TuxTextView) viewInflate.findViewById(R.id.kp0);
        this.LLIZ = (ConstraintLayout) viewInflate.findViewById(R.id.kp1);
        this.LLILZLL = (TuxTextView) viewInflate.findViewById(R.id.kon);
    }
}
