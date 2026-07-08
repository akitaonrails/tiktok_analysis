package X;

import Y.ACListenerS148S0100000_13;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.settingsrequest.model.PopupSetting;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.10gD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class DialogC19307510gD extends DialogC1239100iLk {
    public String LLILZ;
    public String LLILZIL;
    public TextView LLILZLL;
    public TextView LLIZ;
    public View LLIZLLLIL;
    public View LLJ;
    public Activity LLJI;
    public View LLJIJIL;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
    }

    public DialogC19307510gD(Activity activity, PopupSetting popupSetting) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        super(activity, R.style.aed);
        this.LLJI = activity;
        String str8 = null;
        View viewSd = C786410Ut5.Sd(R.layout.bmi, C786410Ut5.ne(activity), null);
        this.LLJIJIL = viewSd;
        setContentView(viewSd);
        this.LLILZLL = (TextView) this.LLJIJIL.findViewById(R.id.tv_title);
        this.LLIZ = (TextView) this.LLJIJIL.findViewById(R.id.zhs);
        this.LLIZLLLIL = this.LLJIJIL.findViewById(R.id.crd);
        this.LLJ = this.LLJIJIL.findViewById(R.id.cny);
        Activity activity2 = this.LLJI;
        if (activity2 != null) {
            this.LLILZ = activity2.getString(2131837672);
            this.LLILZIL = this.LLJI.getString(2131837670);
        }
        if (popupSetting != null) {
            try {
                str = popupSetting.popupText.buttons.get(0).buttonActionStruct.target;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    str2 = popupSetting.popupText.buttons.get(0).buttonActionStruct.target;
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    str2 = null;
                }
                this.LLILZ = str2;
            }
            try {
                str3 = popupSetting.popupText.buttons.get(1).buttonActionStruct.target;
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                str3 = null;
            }
            if (!TextUtils.isEmpty(str3)) {
                try {
                    str7 = popupSetting.popupText.buttons.get(1).buttonActionStruct.target;
                } catch (Exception e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    str7 = null;
                }
                this.LLILZIL = str7;
            }
            try {
                str4 = popupSetting.popupText.title;
            } catch (Exception e5) {
                TryCatchGuardChecker.doCheck(e5);
                str4 = null;
            }
            if (!TextUtils.isEmpty(str4)) {
                this.LLILZLL.setText(str4);
            }
            try {
                str5 = popupSetting.popupText.context;
            } catch (Exception e6) {
                TryCatchGuardChecker.doCheck(e6);
                str5 = null;
            }
            if (!TextUtils.isEmpty(str5)) {
                this.LLIZ.setText(str5);
            }
            try {
                str6 = popupSetting.popupText.buttons.get(0).text;
            } catch (Exception e7) {
                TryCatchGuardChecker.doCheck(e7);
                str6 = null;
            }
            if (!TextUtils.isEmpty(str6)) {
                this.LLIZLLLIL.setContentDescription(str6);
            }
            try {
                str8 = popupSetting.popupText.buttons.get(1).text;
            } catch (Exception e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
            if (!TextUtils.isEmpty(str8)) {
                this.LLJ.setContentDescription(str8);
            }
        }
        C786410Ut5.I7(new ACListenerS148S0100000_13(this, 33), this.LLIZLLLIL);
        C786410Ut5.I7(new ACListenerS148S0100000_13(this, 34), this.LLJ);
    }
}
