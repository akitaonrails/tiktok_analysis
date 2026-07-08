package X;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.SetNicknameFragment;
import com.ss.android.ugc.aweme.account.org.permissions.InvitePageViewModel;
import com.ss.android.ugc.aweme.account.pii.PIIBindPromptFragment;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0j39, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1266010j39 implements TextWatcher {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void afterTextChanged$2(C1266010j39 c1266010j39, Editable editable) {
    }

    public static final void beforeTextChanged$0(C1266010j39 c1266010j39, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(C1266010j39 c1266010j39, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$3(C1266010j39 c1266010j39, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$4(C1266010j39 c1266010j39, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$0(C1266010j39 c1266010j39, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$3(C1266010j39 c1266010j39, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$4(C1266010j39 c1266010j39, CharSequence charSequence, int i, int i2, int i3) {
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

    public static final void afterTextChanged$0(C1266010j39 c1266010j39, Editable editable) {
        String string;
        PIIBindPromptFragment pIIBindPromptFragment = (PIIBindPromptFragment) c1266010j39.l0;
        boolean z = true;
        boolean z2 = false;
        if (!pIIBindPromptFragment.LLLLII) {
            pIIBindPromptFragment.LLLLII = true;
            C20684815ws.LJIILLIIL("start_phone_typing", C2097608Jq.LJIIIIZZ(new Pair("enter_from", pIIBindPromptFragment.getEnterFrom()), new Pair("enter_method", ((PIIBindPromptFragment) c1266010j39.l0).getEnterMethod()), new Pair("page", ((PIIBindPromptFragment) c1266010j39.l0).RR())));
        }
        ((C1238240iKM) c1266010j39.l1).setValidationStatus(0);
        ((C1238240iKM) c1266010j39.l1).LIZ();
        C197039127h c197039127hPS = ((PIIBindPromptFragment) c1266010j39.l0).PS();
        if (editable != null && (string = editable.toString()) != null) {
            if (string.length() <= 0) {
                z = false;
            }
            z2 = z;
        }
        c197039127hPS.setEnabled(z2);
    }

    public static final void afterTextChanged$1(C1266010j39 c1266010j39, Editable editable) {
        boolean z;
        C197039127h c197039127h = ((SetNicknameFragment) c1266010j39.l0).LLLLJ;
        if (c197039127h != null) {
            if (editable.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            c197039127h.setEnabled(z);
        }
        SetNicknameFragment setNicknameFragment = (SetNicknameFragment) c1266010j39.l0;
        if (!setNicknameFragment.LLLL) {
            setNicknameFragment.LLLL = true;
            C0XGR c0xgr = new C0XGR();
            c0xgr.LIZLLL("enter_from", ((SetNicknameFragment) c1266010j39.l0).getEnterFrom());
            c0xgr.LIZLLL("enter_method", ((SetNicknameFragment) c1266010j39.l0).getEnterMethod());
            c0xgr.LIZLLL("platform", ((SetNicknameFragment) c1266010j39.l0).LLLLII);
            c0xgr.LIZLLL("login_panel_type", "signup");
            C20684815ws.LJIILLIIL("start_nickname_typing", c0xgr.LIZ);
        }
        if (editable.length() > 30) {
            C013C c013c = (C013C) c1266010j39.l1;
            if (c013c.element) {
                c013c.element = false;
                editable.delete(30, editable.length());
            }
        }
    }

    public static final void afterTextChanged$3(C1266010j39 c1266010j39, Editable editable) {
        String string;
        InvitePageViewModel invitePageViewModel = (InvitePageViewModel) c1266010j39.l0;
        Editable text = ((C1237880iJm) c1266010j39.l1).getInputBox().getText();
        if (text != null) {
            string = text.toString();
        } else {
            string = null;
        }
        invitePageViewModel.LLJI = string;
        invitePageViewModel.LL.setValue(new C1238330iKV(invitePageViewModel.xQ2()));
    }

    public static final void afterTextChanged$4(C1266010j39 c1266010j39, Editable editable) {
        if (((C1238240iKM) c1266010j39.l0).getPhoneNumberString().length() == 0) {
            InvitePageViewModel invitePageViewModel = (InvitePageViewModel) c1266010j39.l1;
            invitePageViewModel.LLJ = null;
            invitePageViewModel.LL.setValue(new C1238330iKV(invitePageViewModel.xQ2()));
        } else {
            InvitePageViewModel invitePageViewModel2 = (InvitePageViewModel) c1266010j39.l1;
            invitePageViewModel2.LLJ = ((C1238240iKM) c1266010j39.l0).getFullPhoneNumber();
            invitePageViewModel2.LL.setValue(new C1238330iKV(invitePageViewModel2.xQ2()));
        }
    }

    public C1266010j39(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void beforeTextChanged$2(C1266010j39 c1266010j39, CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence.length() <= 30) {
            ((C1243380iSe) c1266010j39.l0).LIZ = charSequence.toString();
            ((C1243380iSe) c1266010j39.l0).LIZIZ = Selection.getSelectionEnd(((C1748440vbG) c1266010j39.l1).getText());
        }
    }

    public static final void onTextChanged$1(C1266010j39 c1266010j39, CharSequence charSequence, int i, int i2, int i3) {
        if (i == 0 && i3 - i2 >= 2) {
            SetNicknameFragment setNicknameFragment = (SetNicknameFragment) c1266010j39.l0;
            if (setNicknameFragment.LLLLIILL) {
                if (!Intrinsics.LJFF(charSequence.toString(), ((SetNicknameFragment) c1266010j39.l0).LLLLIILLL)) {
                    ((SetNicknameFragment) c1266010j39.l0).LLLLIL = true;
                }
            } else {
                setNicknameFragment.LLLLILI = true;
                ((C013C) c1266010j39.l1).element = true;
            }
        } else {
            ((SetNicknameFragment) c1266010j39.l0).LLLLIL = true;
        }
        ((SetNicknameFragment) c1266010j39.l0).QS();
    }

    public static final void onTextChanged$2(C1266010j39 c1266010j39, CharSequence charSequence, int i, int i2, int i3) {
        int length = charSequence.length();
        int i4 = 30;
        if (length > 30) {
            if (length - ((C1243380iSe) c1266010j39.l0).LIZ.length() > 1) {
                if (Character.isHighSurrogate(charSequence.charAt(29))) {
                    i4 = 29;
                }
                C1748440vbG.LJIILL((C1748440vbG) c1266010j39.l1, charSequence.subSequence(0, i4));
                Selection.setSelection(((C1748440vbG) c1266010j39.l1).getText(), i4);
                return;
            }
            C1748440vbG.LJIILL((C1748440vbG) c1266010j39.l1, ((C1243380iSe) c1266010j39.l0).LIZ);
            Selection.setSelection(((C1748440vbG) c1266010j39.l1).getText(), ((C1243380iSe) c1266010j39.l0).LIZIZ);
        }
    }
}
