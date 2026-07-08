package X;

import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IMentionMixSearchService;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioAssem;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS273S0000000_29;

/* JADX INFO: renamed from: X.1Cw5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2246351Cw5 extends C09AY implements InterfaceC1685420txc<UIAssem, String, EnumC2246361Cw6, String, Pair<? extends Integer, ? extends Integer>, Unit> {
    public final /* synthetic */ ProfileEditBioAssem LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2246351Cw5(ProfileEditBioAssem profileEditBioAssem, View view) {
        super(5);
        this.LL = profileEditBioAssem;
        this.LLILLJJLI = view;
    }

    @Override // X.InterfaceC1685420txc
    public final Unit invoke(UIAssem uIAssem, String str, EnumC2246361Cw6 enumC2246361Cw6, String str2, Pair<? extends Integer, ? extends Integer> pair) throws Throwable {
        String str3;
        IMentionMixSearchService iMentionMixSearchService;
        ConstraintLayout constraintLayout;
        InterfaceC1356670lPN interfaceC1356670lPN;
        InterfaceC1356670lPN interfaceC1356670lPN2;
        InterfaceC1356670lPN interfaceC1356670lPN3;
        String str4 = str;
        String str5 = str2;
        Pair<? extends Integer, ? extends Integer> pair2 = pair;
        TuxNavBar tuxNavBar = null;
        C1355350lNF c1355350lNF = null;
        C1355350lNF c1355350lNF2 = null;
        C1355350lNF c1355350lNF3 = null;
        if (enumC2246361Cw6 == EnumC2246361Cw6.OVERFLOW) {
            ProfileEditBioAssem profileEditBioAssem = this.LL;
            profileEditBioAssem.LLJJIJIIJIL = false;
            if (profileEditBioAssem.No() && (interfaceC1356670lPN3 = this.LL.LLJJIJIL) != null && interfaceC1356670lPN3.Be()) {
                this.LL.Lo();
            }
            C1355350lNF c1355350lNF4 = this.LL.LLJILJILJ;
            if (c1355350lNF4 == null) {
                c1355350lNF4 = null;
            }
            Editable editableU = C2204961BRm.U(c1355350lNF4, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzY9KpKwb9K4Q==", null));
            C1355350lNF c1355350lNF5 = this.LL.LLJILJILJ;
            if (c1355350lNF5 == null) {
                c1355350lNF5 = null;
            }
            c1355350lNF5.setText(str5);
            if (this.LL.No()) {
                this.LL.Jo();
                C1355350lNF c1355350lNF6 = this.LL.LLJILJILJ;
                if (c1355350lNF6 == null) {
                    c1355350lNF6 = null;
                }
                ProfileEditBioViewModel.zQ2(editableU, C2204961BRm.U(c1355350lNF6, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzY9KpKwb9K4Q==", null)));
            }
            if (pair2.getFirst().intValue() <= str5.length()) {
                C1355350lNF c1355350lNF7 = this.LL.LLJILJILJ;
                if (c1355350lNF7 != null) {
                    c1355350lNF = c1355350lNF7;
                }
                c1355350lNF.setSelection(pair2.getFirst().intValue());
            } else {
                C1355350lNF c1355350lNF8 = this.LL.LLJILJILJ;
                if (c1355350lNF8 != null) {
                    c1355350lNF2 = c1355350lNF8;
                }
                c1355350lNF2.setSelection(str5.length());
            }
            C1389890mGx c1389890mGx = new C1389890mGx(this.LLILLJJLI);
            c1389890mGx.LJIIIZ(2131827367);
            c1389890mGx.LJIIJJI();
            this.LL.Ho(str4.length(), true);
        } else if (enumC2246361Cw6 == EnumC2246361Cw6.OVERFLOW_NEWLINES) {
            ProfileEditBioAssem profileEditBioAssem2 = this.LL;
            profileEditBioAssem2.LLJJIJIIJIL = false;
            if (profileEditBioAssem2.No() && (interfaceC1356670lPN2 = this.LL.LLJJIJIL) != null && interfaceC1356670lPN2.Be()) {
                this.LL.Lo();
            }
            C1355350lNF c1355350lNF9 = this.LL.LLJILJILJ;
            if (c1355350lNF9 == null) {
                c1355350lNF9 = null;
            }
            Editable editableU2 = C2204961BRm.U(c1355350lNF9, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzY9KpKwb9K4Q==", null));
            C1355350lNF c1355350lNF10 = this.LL.LLJILJILJ;
            if (c1355350lNF10 == null) {
                c1355350lNF10 = null;
            }
            c1355350lNF10.setText(str5);
            if (this.LL.No()) {
                this.LL.Jo();
                C1355350lNF c1355350lNF11 = this.LL.LLJILJILJ;
                if (c1355350lNF11 == null) {
                    c1355350lNF11 = null;
                }
                ProfileEditBioViewModel.zQ2(editableU2, C2204961BRm.U(c1355350lNF11, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzY9KpKwb9K4Q==", null)));
            }
            C1355350lNF c1355350lNF12 = this.LL.LLJILJILJ;
            if (c1355350lNF12 != null) {
                c1355350lNF3 = c1355350lNF12;
            }
            c1355350lNF3.setSelection(pair2.getFirst().intValue());
            C1389890mGx c1389890mGx2 = new C1389890mGx(this.LLILLJJLI);
            c1389890mGx2.LJIIIZ(2131833195);
            c1389890mGx2.LJIIJJI();
        } else if (enumC2246361Cw6 == EnumC2246361Cw6.NORMAL) {
            ProfileEditBioAssem profileEditBioAssem3 = this.LL;
            profileEditBioAssem3.LLJJIJIIJIL = false;
            if (profileEditBioAssem3.No() && (interfaceC1356670lPN = this.LL.LLJJIJIL) != null && interfaceC1356670lPN.Be()) {
                this.LL.Lo();
            }
            this.LL.Ho(str4.length(), false);
            if (C1EDI.LJ() && (constraintLayout = this.LL.LLJJJ) != null) {
                constraintLayout.setBackgroundResource(R.drawable.cr7);
            }
        } else if (this.LL.No() && enumC2246361Cw6 == EnumC2246361Cw6.MENTIONING) {
            ProfileEditBioAssem profileEditBioAssem4 = this.LL;
            if (profileEditBioAssem4.No()) {
                C197039127h c197039127h = profileEditBioAssem4.LLJILLL;
                if (c197039127h == null) {
                    c197039127h = null;
                }
                C786410Ut5.LLLLLLJ(c197039127h, 8);
                InterfaceC1356670lPN interfaceC1356670lPN4 = profileEditBioAssem4.LLJJIJIL;
                if (interfaceC1356670lPN4 != null) {
                    interfaceC1356670lPN4.Hi(0, false);
                }
                C21405618pq c21405618pq = profileEditBioAssem4.LLJJJIL;
                EditText editText = c21405618pq.LIZ;
                if (editText != null && !c21405618pq.LIZJ && ((iMentionMixSearchService = (IMentionMixSearchService) PluggableExtentionKt.pluggableSpi$default(IMentionMixSearchService.class, false, false, false, 14, null)) == null || !iMentionMixSearchService.LJI())) {
                    c21405618pq.LIZJ = true;
                    c21405618pq.LIZIZ(editText, 524289);
                    InputMethodManager inputMethodManager = (InputMethodManager) editText.getContext().getSystemService(InputMethodManager.class);
                    if (inputMethodManager != null) {
                        inputMethodManager.restartInput(editText);
                    }
                }
                if (profileEditBioAssem4.LLJJIJIIJIL) {
                    str3 = "click_mention_button";
                } else {
                    str3 = "type_in";
                }
                C1232140iAW.LIZ.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_method", str3);
                c2344009Gk.LJIIIIZZ("action_type", "show");
                C20684815ws.LJIILLIIL("show_mention_list", c2344009Gk.LIZ);
            }
            this.LL.Ho(str4.length(), false);
            if (C1EDI.LJ()) {
                ConstraintLayout constraintLayout2 = this.LL.LLJJJ;
                if (constraintLayout2 != null) {
                    constraintLayout2.setBackgroundResource(R.drawable.cr7);
                }
                TuxNavBar tuxNavBar2 = this.LL.LLJILJIL;
                if (tuxNavBar2 != null) {
                    tuxNavBar = tuxNavBar2;
                }
                tuxNavBar.LJJ(AFwS273S0000000_29.get$arr$(279), "save");
            }
        }
        return Unit.LIZ;
    }
}
