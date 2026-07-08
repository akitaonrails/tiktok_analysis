package X;

import android.text.Editable;
import android.text.TextWatcher;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.SearchSchoolMembersAssem;
import com.ss.android.ugc.tiktok.addyours.ui.assem.AddYoursInviteFriendsAssem;
import com.ss.android.ugc.tiktok.addyours.ui.vm.AddYoursInviteFriendsViewModel;
import kotlin.jvm.internal.AwS370S0200000_4;

/* JADX INFO: renamed from: X.0Di4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C346420Di4 implements TextWatcher {
    public final int $t;
    public Object l0;

    public static final void afterTextChanged$0(C346420Di4 c346420Di4, Editable editable) {
    }

    public static final void beforeTextChanged$0(C346420Di4 c346420Di4, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(C346420Di4 c346420Di4, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$1(C346420Di4 c346420Di4, CharSequence charSequence, int i, int i2, int i3) {
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

    public C346420Di4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void afterTextChanged$1(C346420Di4 c346420Di4, Editable editable) {
        AddYoursInviteFriendsViewModel addYoursInviteFriendsViewModelHo = ((AddYoursInviteFriendsAssem) c346420Di4.l0).Ho();
        CharSequence charSequence = editable;
        if (editable == null) {
            charSequence = "";
        }
        addYoursInviteFriendsViewModelHo.withState(new AwS370S0200000_4(addYoursInviteFriendsViewModelHo, charSequence, 47));
    }

    public static final void onTextChanged$0(C346420Di4 c346420Di4, CharSequence charSequence, int i, int i2, int i3) {
        String string;
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        AnonymousClass0956 anonymousClass0956 = ((SearchSchoolMembersAssem) c346420Di4.l0).LLJJL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        SearchSchoolMembersAssem searchSchoolMembersAssem = (SearchSchoolMembersAssem) c346420Di4.l0;
        searchSchoolMembersAssem.LLJJL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(searchSchoolMembersAssem), null, null, new C338320DOc((SearchSchoolMembersAssem) c346420Di4.l0, string, null), 3);
    }
}
