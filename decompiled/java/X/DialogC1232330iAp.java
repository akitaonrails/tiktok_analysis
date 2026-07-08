package X;

import Y.ACListenerS154S0100000_19;
import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.account.login.v2.network.CheckUserNameResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.IProfileService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: renamed from: X.0iAp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class DialogC1232330iAp extends DialogC1239100iLk implements InterfaceC1232420iAy, InterfaceC1242460iRA, InterfaceC1232340iAq {
    public final Activity LLILZ;
    public final User LLILZIL;
    public final C0XIC LLILZLL;
    public C424810GlD LLIZ;
    public final InterfaceC1232320iAo LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public EditText LLJJ;
    public String LLJJI;
    public String LLJJIII;
    public boolean LLJJIJI;

    @Override // X.InterfaceC1232420iAy
    public final void Ud0(int i, User user) {
    }

    @Override // X.InterfaceC1242460iRA
    public final void onHide() {
    }

    @Override // X.InterfaceC1242460iRA
    public final void onShow() {
    }

    public final TextView LJJLIIJ() {
        return (TextView) this.LLJILJILJ.getValue();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        EditText editText = this.LLJJ;
        if (editText == null) {
            editText = null;
        }
        KeyboardUtils.LIZIZ(editText);
    }

    @Override // X.InterfaceC1232340iAq
    public final String LJIIIIZZ() {
        return this.LLJJIII;
    }

    public final void LJJLJ(int i) {
        int iIntValue = 0;
        ((C21405318pn) ((View) this.LLJIJIL.getValue()).findViewById(R.id.kq_)).LIZJ(i, 0);
        if (i == 0) {
            LJJLIIJ().setEnabled(false);
            TextView textViewLJJLIIJ = LJJLIIJ();
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            }
            textViewLJJLIIJ.setTextColor(iIntValue);
            return;
        }
        LJJLIIJ().setEnabled(true);
        TextView textViewLJJLIIJ2 = LJJLIIJ();
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, getContext());
        if (numLIZJ2 != null) {
            iIntValue = numLIZJ2.intValue();
        }
        textViewLJJLIIJ2.setTextColor(iIntValue);
    }

    @Override // X.InterfaceC1232420iAy
    public final void Pc0(boolean z) {
        if (z) {
            C1389890mGx c1389890mGx = new C1389890mGx(this.LLILZ);
            c1389890mGx.LJIIIZ(2131858159);
            c1389890mGx.LJIIJJI();
            C1440005kM.LIZ(new C849380XTs());
            this.LLJJIII = "save";
            dismiss();
            C785410UrT.LIZ(this);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        EditText editText;
        UrlModel avatarMedium;
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawableResource(android.R.color.transparent);
            window.clearFlags(2);
        }
        setContentView(R.layout.d59);
        this.LLIZLLLIL.LIZ(this);
        EditText editText2 = ((C21405318pn) ((View) this.LLJIJIL.getValue()).findViewById(R.id.kq_)).getEditText();
        this.LLJJ = editText2;
        EditText editText3 = null;
        if (editText2 == null) {
            editText2 = null;
        }
        editText2.setFocusable(true);
        EditText editText4 = this.LLJJ;
        if (editText4 == null) {
            editText4 = null;
        }
        editText4.setFocusableInTouchMode(true);
        EditText editText5 = this.LLJJ;
        if (editText5 == null) {
            editText5 = null;
        }
        editText5.requestFocus();
        EditText editText6 = this.LLJJ;
        if (editText6 == null) {
            editText = null;
        } else {
            editText = editText6;
        }
        if (editText instanceof C0I7D) {
            if (editText6 == null) {
                editText6 = null;
            }
            ((C0I7D) editText6).setTuxFont(41);
        }
        C424810GlD c424810GlD = new C424810GlD((RecyclerView) this.LLJILLL.getValue(), null, new AwS598S0100000_19(this, 619));
        this.LLIZ = c424810GlD;
        c424810GlD.LJ = true;
        C786410Ut5.T7(LJJLIIJ(), new ACListenerS154S0100000_19(this, 213));
        C786410Ut5.T7((TextView) this.LLJILJIL.getValue(), new ACListenerS154S0100000_19(this, 214));
        LJJLJ(0);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(37);
        }
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        User user = this.LLILZIL;
        if (user != null) {
            avatarMedium = user.getAvatarMedium();
        } else {
            avatarMedium = null;
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatarMedium));
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LIZ = true;
        c1331670kl3LJIIIIZZ.LJJI = new C1331730kl9(c1331750klB);
        c1331670kl3LJIIIIZZ.LJJ((SmartImageView) this.LLJ.getValue());
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        this.LLJJI = C10EU.LIZJ(user);
        TextView textView = (TextView) this.LLJI.getValue();
        String str = this.LLJJI;
        if (str == null) {
            str = null;
        }
        textView.setText(str);
        C0XIC c0xic = this.LLILZLL;
        String str2 = this.LLJJI;
        if (str2 == null) {
            str2 = null;
        }
        c0xic.LIZ(str2, new AbstractC19489511Mv<CheckUserNameResponse>() { // from class: X.0XS6
            @Override // X.C11M9
            public final void onComplete() {
            }

            @Override // X.C11M9
            public final void onError(Throwable th) {
            }

            @Override // X.C11M9
            public final void onNext(Object obj) {
                CheckUserNameResponse checkUserNameResponse = (CheckUserNameResponse) obj;
                if (checkUserNameResponse.recommended_unique_ids != null && (!r0.isEmpty())) {
                    DialogC1232330iAp dialogC1232330iAp = this.LLILLJJLI;
                    dialogC1232330iAp.getClass();
                    List<String> list = checkUserNameResponse.recommended_unique_ids;
                    EditText editText7 = null;
                    if (list != null) {
                        ArrayList arrayList = new ArrayList(C13LP.LJJJJLI(list));
                        if (!arrayList.isEmpty()) {
                            EditText editText8 = dialogC1232330iAp.LLJJ;
                            if (editText8 != null) {
                                editText7 = editText8;
                            }
                            editText7.setText((CharSequence) ListProtector.get(arrayList, 0));
                        }
                    }
                }
            }
        });
        EditText editText7 = this.LLJJ;
        if (editText7 != null) {
            editText3 = editText7;
        }
        editText3.addTextChangedListener(new C851940XbU() { // from class: X.0iAg
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                int iIntValue;
                EditText editText8 = this.LL.LLJJ;
                EditText editText9 = null;
                if (editText8 == null) {
                    editText8 = null;
                }
                String string = C2204961BRm.LLJILLL(editText8, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPyhZojdkgaBTfe3683hCAOkUshWzZ1vbaIRfRe+KGUJY9Wb", null)).toString();
                DialogC1232330iAp dialogC1232330iAp = this.LL;
                if (dialogC1232330iAp.LLJJIJI) {
                    dialogC1232330iAp.LLJJIJI = false;
                } else {
                    C424810GlD c424810GlD2 = dialogC1232330iAp.LLIZ;
                    if (c424810GlD2 != null) {
                        c424810GlD2.LIZ(null);
                    }
                }
                DialogC1232330iAp dialogC1232330iAp2 = this.LL;
                EditText editText10 = dialogC1232330iAp2.LLJJ;
                if (editText10 != null) {
                    editText9 = editText10;
                }
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, dialogC1232330iAp2.getContext());
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                editText9.setTextColor(iIntValue);
                if (TextUtils.isEmpty(string)) {
                    this.LL.LJJLJ(0);
                } else {
                    this.LL.LJJLJ(1);
                }
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DialogC1232330iAp(Activity activity, User user) {
        int i;
        if (C960203pA.LIZIZ(activity)) {
            i = R.style.y0;
        } else {
            i = R.style.xm;
        }
        super(activity, i, true, false, false);
        this.LLILZ = activity;
        this.LLILZIL = user;
        this.LLILZLL = new C0XIC();
        this.LLIZLLLIL = ((IProfileService) ServiceManager.get().getService(IProfileService.class)).newUserPresenter();
        this.LLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2921));
        this.LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2926));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2925));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2922));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2923));
        this.LLJILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2924));
        this.LLJJIII = "background";
    }

    @Override // X.InterfaceC1232420iAy
    public final void JE2(int i, Exception exc) {
        if (exc != null) {
            if ((exc instanceof ExecutionException) && (exc.getCause() instanceof C0XIR)) {
                exc = (Exception) exc.getCause();
            }
            if (exc instanceof C0XIR) {
                IProfileService iProfileService = (IProfileService) ServiceManager.get().getService(IProfileService.class);
                C0XIR c0xir = (C0XIR) exc;
                String strValueOf = String.valueOf(c0xir.getErrorCode());
                String errorMsg = c0xir.getErrorMsg();
                String str = this.LLJJI;
                if (str == null) {
                    str = null;
                }
                iProfileService.checkIDNet(strValueOf, errorMsg, str, getContext());
            }
        }
    }

    @Override // X.InterfaceC1232420iAy
    public final void aL0(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(this.LLILZ);
        c1389890mGx.LJIIJ(str);
        c1389890mGx.LJIIJJI();
    }
}
