package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.profile.business.ur.editprofile.pronouns.ui.ProfileEditPronounsSearchAndDisplayAssem;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.toolkit.keywords.CommentFilterKeywordsPageV2;

/* JADX INFO: renamed from: X.10kT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19333910kT implements TextWatcher {
    public final int $t;
    public Object l0;

    public static final void afterTextChanged$1(C19333910kT c19333910kT, Editable editable) {
    }

    public static final void beforeTextChanged$1(C19333910kT c19333910kT, CharSequence charSequence, int i, int i2, int i3) {
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
        }
    }

    public C19333910kT(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void afterTextChanged$0(C19333910kT c19333910kT, Editable editable) {
        ((ProfileEditPronounsSearchAndDisplayAssem) c19333910kT.l0).Lo();
    }

    public static final void beforeTextChanged$0(C19333910kT c19333910kT, CharSequence charSequence, int i, int i2, int i3) {
        ((ProfileEditPronounsSearchAndDisplayAssem) c19333910kT.l0).No(i, i2, i3);
        if (((ProfileEditPronounsSearchAndDisplayAssem) c19333910kT.l0).dp().getMaxLines() != 1) {
            ((ProfileEditPronounsSearchAndDisplayAssem) c19333910kT.l0).dp().setMaxLines(1);
        }
        if (!((ProfileEditPronounsSearchAndDisplayAssem) c19333910kT.l0).dp().isCursorVisible()) {
            ((ProfileEditPronounsSearchAndDisplayAssem) c19333910kT.l0).dp().setCursorVisible(true);
        }
    }

    public static final void onTextChanged$0(C19333910kT c19333910kT, CharSequence charSequence, int i, int i2, int i3) {
        if (((ProfileEditPronounsSearchAndDisplayAssem) c19333910kT.l0).Gp()) {
            return;
        }
        String strIp = ((ProfileEditPronounsSearchAndDisplayAssem) c19333910kT.l0).ip(charSequence);
        if (strIp.length() == 0) {
            ((ProfileEditPronounsSearchAndDisplayAssem) c19333910kT.l0).Ip();
        }
        ((ProfileEditPronounsSearchAndDisplayAssem) c19333910kT.l0).So().onNext(strIp);
    }

    public static final void onTextChanged$1(C19333910kT c19333910kT, CharSequence charSequence, int i, int i2, int i3) {
        TuxIconView tuxIconView = ((CommentFilterKeywordsPageV2) c19333910kT.l0).LLILZLL;
        if (tuxIconView != null) {
            int i4 = 0;
            if (charSequence == null || charSequence.length() == 0) {
                i4 = 8;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, i4);
        }
    }
}
