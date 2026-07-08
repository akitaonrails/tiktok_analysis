package X;

import Y.ACListenerS130S0200000_28;
import Y.ACListenerS162S0100000_28;
import Y.ARunnableS25S0110000_6;
import Y.ATListenerS440S0100000_6;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.promote.PromoteProgramResponse;
import com.ss.android.ugc.aweme.promote.TextClickable;
import com.zhiliaoapp.musically.R;
import java.util.regex.Matcher;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.10at, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class DialogC19274510at extends DialogC1239100iLk implements WeakHandler.IHandler {
    public String LLILZ;
    public String LLILZIL;
    public TextView LLILZLL;
    public TextView LLIZ;
    public TextView LLIZLLLIL;
    public View LLJ;
    public View LLJI;
    public View LLJIJIL;
    public Activity LLJILJIL;
    public C814520VxK LLJILJILJ;
    public View LLJILLL;
    public WeakHandler LLJJ;
    public DialogC1389620mGW LLJJI;

    @Override // X.DialogC19728412Gs, android.app.Dialog
    public final void show() throws Throwable {
        Object obj;
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPq6bJLByDdrbA/Iwmex71F46W1Bg90S5UClHxE=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/ss/android/ugc/aweme/views/ResizableDialog", "show", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "com/ss/android/ugc/aweme/views/ResizableDialog", "show", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            DialogC19728412Gs dialogC19728412Gs = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (DialogC19728412Gs) obj;
            super.show();
            c0wst.LIZ(300000, "com/ss/android/ugc/aweme/views/ResizableDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
        }
        View view = this.LLJIJIL;
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS25S0110000_6(view, 1));
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        LJJLIIJ(false);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        if (eventBusLIZLLL.LJIIJ(this)) {
            eventBusLIZLLL.LJJI(this);
        }
    }

    public DialogC19274510at(C19EG c19eg) {
        super(c19eg, R.style.aed, false, true, true);
        this.LLJILJIL = c19eg;
        final int i = 0;
        setCancelable(false);
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        if (!eventBusLIZLLL.LJIIJ(this)) {
            eventBusLIZLLL.LJIJJ(this);
        }
        View viewSd = C786410Ut5.Sd(R.layout.bmv, C786410Ut5.ne(c19eg), null);
        this.LLJILLL = viewSd;
        setContentView(viewSd);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.dimAmount = 0.5f;
        window.addFlags(2);
        window.setAttributes(attributes);
        window.setWindowAnimations(0);
        attributes.width = (int) C12ES.LIZJ(280.0f, getContext());
        this.LLILZ = this.LLJILLL.getContext().getString(R.string.rl6);
        this.LLILZLL = (TextView) this.LLJILLL.findViewById(R.id.tv_title);
        this.LLIZ = (TextView) this.LLJILLL.findViewById(R.id.zy3);
        this.LLIZLLLIL = (TextView) this.LLJILLL.findViewById(R.id.tv_protocol);
        this.LLJ = this.LLJILLL.findViewById(R.id.crd);
        this.LLJI = this.LLJILLL.findViewById(R.id.csc);
        this.LLJIJIL = this.LLJILLL.findViewById(R.id.tqy);
        this.LLJILJILJ = new C814520VxK();
        String strLIZ = SharePrefCache.inst().getPromoteDialogPopupPopupUrl().LIZ();
        this.LLILZIL = TextUtils.isEmpty(strLIZ) ? "" : strLIZ;
        String strLIZ2 = SharePrefCache.inst().getPromoteDialogPopupPopupLinkText().LIZ();
        this.LLILZ = TextUtils.isEmpty(strLIZ2) ? this.LLILZ : strLIZ2;
        this.LLJJ = new WeakHandler(this);
        Integer numLIZ = SharePrefCache.inst().getPromoteDialogPopupClickType().LIZ();
        C786410Ut5.I7(new ACListenerS130S0200000_28(numLIZ, this, 31), this.LLJ);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(2.0f)));
        this.LLJ.setBackground(c384050F3z.LIZ(this.LLJILJIL));
        C786410Ut5.I7(new ACListenerS162S0100000_28(this, 70), this.LLJI);
        String strLIZ3 = SharePrefCache.inst().getPromoteDialogPopupPopupTitle().LIZ();
        String strLIZ4 = SharePrefCache.inst().getPromoteDialogPopupPopupMsg().LIZ();
        String strLIZ5 = SharePrefCache.inst().getPromoteDialogPopupPopupContent().LIZ();
        if (!TextUtils.isEmpty(strLIZ3)) {
            this.LLILZLL.setText(strLIZ3);
        }
        if (this.LLILZLL.getText() != null) {
            if (numLIZ.intValue() == 0) {
                TextView textView = this.LLILZLL;
                textView.setText(textView.getText().toString().replaceAll("!", "").replaceAll("！", ""));
            }
            TextView textView2 = this.LLILZLL;
            textView2.setText(textView2.getText().toString().replaceAll("\\\\n", "\n"));
        }
        if (!TextUtils.isEmpty(strLIZ4)) {
            this.LLIZ.setText(strLIZ4);
        } else {
            C786410Ut5.LLIL(this.LLIZ, 8);
        }
        if (!TextUtils.isEmpty(strLIZ5)) {
            this.LLIZLLLIL.setText(strLIZ5);
        }
        final TextClickable textClickable = new TextClickable();
        textClickable.LIZJ = PatternProtector.compile(this.LLILZ);
        textClickable.LIZ = 0;
        TextView textView3 = this.LLIZLLLIL;
        if (textView3 != null) {
            SpannableString spannableString = new SpannableString(textView3.getText());
            String string = spannableString.toString();
            Matcher matcher = textClickable.LIZJ.matcher(string);
            Matcher matcher2 = textClickable.LIZLLL.matcher(string);
            boolean z = false;
            while (true) {
                final int i2 = 1;
                if (!matcher2.find()) {
                    break;
                }
                final String strGroup = matcher2.group(1);
                C786410Ut5.o2(spannableString, new ClickableSpan(strGroup, i2) { // from class: X.10au
                    public final String LL;

                    @Override // android.text.style.ClickableSpan
                    public final void onClick(View view) {
                        C19274910ax c19274910ax = this.LLILLJJLI.LIZIZ;
                        if (c19274910ax != null) {
                            if (c19274910ax.LIZ.LLILZ.equals(this.LL)) {
                                DialogC19274510at dialogC19274510at = c19274910ax.LIZ;
                                C814520VxK.LIZ(dialogC19274510at.LLJILJIL, dialogC19274510at.LLILZIL, dialogC19274510at.LLILZ);
                            }
                        }
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                        C19274910ax c19274910ax = this.LLILLJJLI.LIZIZ;
                        if (c19274910ax != null) {
                            C444890HcV c444890HcV = new C444890HcV();
                            c444890HcV.LIZ(82);
                            textPaint.setTypeface(c444890HcV.getTypeface());
                            textPaint.setColor(C960203pA.LIZ(R.attr.uc, c19274910ax.LIZ.LLJILJIL));
                            textPaint.setUnderlineText(true);
                        }
                    }

                    {
                        this.LL = strGroup;
                    }
                }, matcher2.start(), matcher2.end(), 33);
                z = true;
            }
            while (matcher.find()) {
                final String strGroup2 = matcher.group(textClickable.LIZ);
                C786410Ut5.o2(spannableString, new ClickableSpan(strGroup2, i) { // from class: X.10au
                    public final String LL;

                    @Override // android.text.style.ClickableSpan
                    public final void onClick(View view) {
                        C19274910ax c19274910ax = this.LLILLJJLI.LIZIZ;
                        if (c19274910ax != null) {
                            if (c19274910ax.LIZ.LLILZ.equals(this.LL)) {
                                DialogC19274510at dialogC19274510at = c19274910ax.LIZ;
                                C814520VxK.LIZ(dialogC19274510at.LLJILJIL, dialogC19274510at.LLILZIL, dialogC19274510at.LLILZ);
                            }
                        }
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                        C19274910ax c19274910ax = this.LLILLJJLI.LIZIZ;
                        if (c19274910ax != null) {
                            C444890HcV c444890HcV = new C444890HcV();
                            c444890HcV.LIZ(82);
                            textPaint.setTypeface(c444890HcV.getTypeface());
                            textPaint.setColor(C960203pA.LIZ(R.attr.uc, c19274910ax.LIZ.LLJILJIL));
                            textPaint.setUnderlineText(true);
                        }
                    }

                    {
                        this.LL = strGroup2;
                    }
                }, matcher.start(), matcher.end(), 33);
                z = true;
            }
            if (z) {
                textView3.setText(spannableString);
                textView3.setOnTouchListener(new ATListenerS440S0100000_6(spannableString, 4));
            }
        }
        textClickable.LIZIZ = new C19274910ax(this);
    }

    public final void LJJLIIJ(boolean z) {
        if (z) {
            if (this.LLJJI == null) {
                DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(this.LLJILJIL);
                this.LLJJI = dialogC1389620mGW;
                dialogC1389620mGW.LJJLJ(2131835638);
            }
            C786410Ut5.J4(this.LLJJI);
            return;
        }
        DialogC1389620mGW dialogC1389620mGW2 = this.LLJJI;
        if (dialogC1389620mGW2 == null) {
            return;
        }
        C786410Ut5.LJIIJ(dialogC1389620mGW2);
    }

    @C14EU
    public void closeKrCopyright(C19275010ay c19275010ay) {
        dismiss();
        C785410UrT.LIZ(this);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        LJJLIIJ(false);
        Object messageObj = HandlerHook.getMessageObj(message.obj);
        int i = message.what;
        if (messageObj instanceof C0XIR) {
            C1389890mGx c1389890mGx = new C1389890mGx(this.LLJILJIL);
            c1389890mGx.LJIIJ(((C0XIR) messageObj).getErrorMsg());
            c1389890mGx.LJIIJJI();
        } else if (messageObj instanceof Exception) {
            C1389890mGx c1389890mGx2 = new C1389890mGx(this.LLJILJIL);
            c1389890mGx2.LJIIJ(getContext().getResources().getString(2131837963));
            c1389890mGx2.LJIIJJI();
        } else if ((messageObj instanceof PromoteProgramResponse) && i == 1 && ((PromoteProgramResponse) messageObj).isConfirmedSuccess()) {
            dismiss();
            C785410UrT.LIZ(this);
            SharedPreferences.Editor editorEdit = C19268510Zv.LIZ().edit();
            editorEdit.putBoolean("joined", true);
            editorEdit.apply();
        }
    }
}
