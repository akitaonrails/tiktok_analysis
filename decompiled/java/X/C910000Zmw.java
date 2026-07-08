package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.changename.fragment.EditGroupNameFragment;
import com.ss.android.ugc.aweme.im.ability.SuppressPanelAutoSwitchAbility;

/* JADX INFO: renamed from: X.0Zmw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C910000Zmw {
    public static void LIZ(Context context, Fragment fragment, String str, String str2) {
        FragmentManager supportFragmentManager;
        SuppressPanelAutoSwitchAbility suppressPanelAutoSwitchAbility;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            EditGroupNameFragment editGroupNameFragment = new EditGroupNameFragment();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("key_conversation_id", str, bundle);
            C786410Ut5.LJJJI("key_ui_type", EnumC910040Zn0.PANEL.getValue(), bundle);
            C786410Ut5.LJJJI("enter_from", "chat", bundle);
            C786410Ut5.LJJJI("enter_method", str2, bundle);
            editGroupNameFragment.setArguments(bundle);
            if (fragment != null && (suppressPanelAutoSwitchAbility = (SuppressPanelAutoSwitchAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), SuppressPanelAutoSwitchAbility.class, null)) != null) {
                suppressPanelAutoSwitchAbility.rq0(true);
            }
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LIZ.LLJJIJI = editGroupNameFragment;
            c1390920mIc.LJI(53);
            c1390920mIc.LIZ.LLJLILLLLZIIL = false;
            c1390920mIc.LJIIIIZZ(1);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJLLL = false;
            tuxSheet.LLILLJJLI = new C0IDZ(fragment, 1);
            tuxSheet.show(supportFragmentManager, "ChangeGroupNameFragment");
        }
    }
}
