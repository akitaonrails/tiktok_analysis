package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.contentlanguage.viewmodel.ContentPreferenceViewModel;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.10kD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class DialogInterfaceOnClickListenerC19332310kD implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                break;
            case 1:
                onClick$1(this, dialogInterface, i);
                break;
        }
    }

    public DialogInterfaceOnClickListenerC19332310kD(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onClick$0(DialogInterfaceOnClickListenerC19332310kD dialogInterfaceOnClickListenerC19332310kD, DialogInterface dialogInterface, int i) {
        C1916910zyz.LIZIZ((C19EG) dialogInterfaceOnClickListenerC19332310kD.l0, "popup_warning");
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", "dialog");
        c2344009Gk.LJIIIIZZ("enter_from", ((C1916960zz4) dialogInterfaceOnClickListenerC19332310kD.l1).LLILLJJLI);
        C20684815ws.LJIILLIIL("enter_violation_record", c2344009Gk.LIZ);
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        C19633311rf c19633311rf = C1916910zyz.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("has_click_warning_dialog_");
        sbLIZ.append(curUserId);
        c19633311rf.LJI(C2188811AlT.LIZIZ(sbLIZ), true);
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
    }

    public static final void onClick$1(DialogInterfaceOnClickListenerC19332310kD dialogInterfaceOnClickListenerC19332310kD, DialogInterface dialogInterface, int i) {
        if (i != -2) {
            if (i == -1) {
                ((C19270210aC) dialogInterfaceOnClickListenerC19332310kD.l0).LLILLJJLI.remove((ContentLanguage) dialogInterfaceOnClickListenerC19332310kD.l1);
                ContentPreferenceViewModel contentPreferenceViewModel = ((C19270210aC) dialogInterfaceOnClickListenerC19332310kD.l0).LLILLL;
                ContentLanguage contentLanguage = (ContentLanguage) dialogInterfaceOnClickListenerC19332310kD.l1;
                if (contentLanguage != null) {
                    ArrayList<ContentLanguage> value = contentPreferenceViewModel.wQ2().getValue();
                    if (value != null) {
                        value.remove(contentLanguage);
                    }
                    contentPreferenceViewModel.LLILZIL = true;
                }
                ((C19270210aC) dialogInterfaceOnClickListenerC19332310kD.l0).LLILZ.LIZ((ContentLanguage) dialogInterfaceOnClickListenerC19332310kD.l1, 0);
                ((C19270210aC) dialogInterfaceOnClickListenerC19332310kD.l0).notifyDataSetChanged();
                dialogInterface.dismiss();
                return;
            }
            return;
        }
        dialogInterface.dismiss();
    }
}
