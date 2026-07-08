package X;

import android.widget.CompoundButton;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationMethodItemCell;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0j2t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1265850j2t implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                break;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                break;
        }
    }

    public C1265850j2t(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }

    public static final void onCheckedChanged$0(C1265850j2t c1265850j2t, CompoundButton compoundButton, boolean z) {
        String string;
        C127K c127k = null;
        User user = null;
        if (z) {
            User user2 = ((ProfileEditFragment) c1265850j2t.l0).LLLLLLZ;
            if (user2 == null) {
                user2 = null;
            }
            user2.setLemon8ProfileSettings(1);
            User user3 = ((ProfileEditFragment) c1265850j2t.l0).LLLLLLZ;
            if (user3 == null) {
                user3 = null;
            }
            if (C736460Sui.LIZIZ(user3.getLemon8UserName())) {
                User user4 = ((ProfileEditFragment) c1265850j2t.l0).LLLLLLZ;
                if (user4 == null) {
                    user4 = null;
                }
                string = user4.getLemon8UserName();
            } else {
                string = ((ProfileEditFragment) c1265850j2t.l0).getString(2131821820);
            }
            Function1 function1 = (Function1) ((LinkedHashMap) ((ProfileEditFragment) c1265850j2t.l0).LLLLIILL).get(Integer.valueOf(EnumC1216830hlp.LEMON8.getType()));
            if (function1 != null) {
                function1.invoke(string);
            }
            ProfileEditFragment profileEditFragment = (ProfileEditFragment) c1265850j2t.l0;
            C127K c127k2 = profileEditFragment.LLLFF;
            if (c127k2 == null) {
                c127k2 = null;
            }
            User user5 = profileEditFragment.LLLLLLZ;
            if (user5 != null) {
                user = user5;
            }
            profileEditFragment.pT(c127k2, user.getLemon8UserName(), true);
            ProfileEditFragment profileEditFragment2 = (ProfileEditFragment) c1265850j2t.l0;
            C19EG c19eg = (C19EG) c1265850j2t.l1;
            profileEditFragment2.getClass();
            C1254160ik2.LIZIZ.LJIIIZ(1, c19eg);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("click_type", "open");
            C20684815ws.LJIILLIIL("click_lemon8_link_settings", c2344009Gk.LIZ);
            return;
        }
        User user6 = ((ProfileEditFragment) c1265850j2t.l0).LLLLLLZ;
        if (user6 == null) {
            user6 = null;
        }
        user6.setLemon8ProfileSettings(0);
        ProfileEditFragment profileEditFragment3 = (ProfileEditFragment) c1265850j2t.l0;
        int type = EnumC1216830hlp.LEMON8.getType();
        String string2 = ((ProfileEditFragment) c1265850j2t.l0).getString(2131821820);
        Function1 function12 = (Function1) ((LinkedHashMap) profileEditFragment3.LLLLIILL).get(Integer.valueOf(type));
        if (function12 != null) {
            function12.invoke(string2);
        }
        ProfileEditFragment profileEditFragment4 = (ProfileEditFragment) c1265850j2t.l0;
        C127K c127k3 = profileEditFragment4.LLLFF;
        if (c127k3 != null) {
            c127k = c127k3;
        }
        profileEditFragment4.pT(c127k, profileEditFragment4.getString(2131821820), false);
        ProfileEditFragment profileEditFragment5 = (ProfileEditFragment) c1265850j2t.l0;
        C19EG c19eg2 = (C19EG) c1265850j2t.l1;
        profileEditFragment5.getClass();
        C1254160ik2.LIZIZ.LJIIIZ(0, c19eg2);
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("click_type", "close");
        C20684815ws.LJIILLIIL("click_lemon8_link_settings", c2344009Gk2.LIZ);
    }

    public static final void onCheckedChanged$1(C1265850j2t c1265850j2t, CompoundButton compoundButton, boolean z) {
        C1233790iDB c1233790iDB;
        TwoStepVerificationMethodItemCell twoStepVerificationMethodItemCell = (TwoStepVerificationMethodItemCell) c1265850j2t.l0;
        EnumC1233840iDG enumC1233840iDG = ((C1233750iD7) c1265850j2t.l1).LL.LIZJ;
        AssemVMLazy assemVMLazy = twoStepVerificationMethodItemCell.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = TwoStepVerificationMethodItemCell.LLILLL;
        TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel = (TwoStepVerificationActivityViewModel) assemVMLazy.getValue();
        LinkedHashMap linkedHashMap = (LinkedHashMap) twoStepVerificationActivityViewModel.LLILZLL;
        C1233790iDB c1233790iDB2 = (C1233790iDB) linkedHashMap.get(enumC1233840iDG);
        if (c1233790iDB2 != null) {
            c1233790iDB = C1233790iDB.LIZ(c1233790iDB2, false, false, null, z, false, 47);
        } else {
            c1233790iDB = new C1233790iDB(false, false, enumC1233840iDG, null, z, false, 43);
        }
        linkedHashMap.put(enumC1233840iDG, c1233790iDB);
        twoStepVerificationActivityViewModel.setState(new C1233800iDC(twoStepVerificationActivityViewModel));
    }
}
