package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Cwo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC330080Cwo extends Serializable {
    void initExtra(Map<String, ? extends Object> map);

    void initScope(InterfaceC665370Q7z interfaceC665370Q7z);

    void mobEnter(Context context, InterfaceC665370Q7z interfaceC665370Q7z);

    void mobInviteButtonClicked(Context context, InterfaceC665370Q7z interfaceC665370Q7z, boolean z, List<UserInvitee> list);

    void mobSelectChange(Context context, InterfaceC665370Q7z interfaceC665370Q7z, boolean z, UserInvitee userInvitee, String str, boolean z2);

    Object onSelected(Fragment fragment, List<UserInvitee> list, List<UserInvitee> list2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    void onSelectionChange(List<UserInvitee> list, View view);
}
