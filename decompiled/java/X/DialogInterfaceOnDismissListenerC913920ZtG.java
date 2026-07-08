package X;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.assem.MessageRequestTopBarAssem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZtG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class DialogInterfaceOnDismissListenerC913920ZtG implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) throws Exception {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                break;
            case 1:
                onDismiss$1(this, dialogInterface);
                break;
        }
    }

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC913920ZtG dialogInterfaceOnDismissListenerC913920ZtG, DialogInterface dialogInterface) {
        String str;
        String mobValue;
        EnumC880520YgU enumC880520YgU;
        String str2 = TuxSheet._pnsPageId;
        AbstractC343940De4 abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
        C885310YoD c885310YoD = C885310YoD.LIZ;
        C888230Ysv c888230Ysv = C888230Ysv.LIZ;
        if (Intrinsics.LJFF(abstractC343940De4LJIIJJI, c888230Ysv)) {
            str = "click_apply";
        } else {
            str = "click_cancel";
        }
        C878960Ydy c878960Ydy = ((MessageRequestTopBarAssem) dialogInterfaceOnDismissListenerC913920ZtG.l0).op().getState().LLILLL;
        if (c878960Ydy != null && (enumC880520YgU = c878960Ydy.LLILLL) != null) {
            mobValue = enumC880520YgU.getMobValue();
        } else {
            mobValue = null;
        }
        String strLJJLIIIJ = "";
        if (mobValue == null) {
            mobValue = "";
        }
        if (Intrinsics.LJFF(abstractC343940De4LJIIJJI, c888230Ysv)) {
            List list = (List) dialogInterfaceOnDismissListenerC913920ZtG.l1;
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                List<C888120Ysk> selectedOptionList = ((C888210Yst) it2.next()).getSelectedOptionList();
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(selectedOptionList, 10));
                Iterator<C888120Ysk> it3 = selectedOptionList.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(it3.next().LIZJ);
                }
                C19719612Di.LJJI(arrayList2, arrayList);
            }
            strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
        }
        c885310YoD.LIZJ("non_filtered_message_request", str, mobValue, "", strLJJLIIIJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC913920ZtG dialogInterfaceOnDismissListenerC913920ZtG, DialogInterface dialogInterface) throws Exception {
        DialogFragment dialogFragment;
        T t = ((C259800zU) dialogInterfaceOnDismissListenerC913920ZtG.l0).element;
        if (t == 0) {
            dialogFragment = null;
        } else {
            dialogFragment = (DialogFragment) t;
        }
        Dialog dialog = dialogFragment.getDialog();
        if (dialog != null) {
            C2211631BhB.LIZIZ(dialog);
        }
        InterfaceC913210Zs7 interfaceC913210Zs7 = (InterfaceC913210Zs7) dialogInterfaceOnDismissListenerC913920ZtG.l1;
        if (interfaceC913210Zs7 != null) {
            interfaceC913210Zs7.onDismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DialogInterfaceOnDismissListenerC913920ZtG(Object obj, MessageRequestTopBarAssem messageRequestTopBarAssem, List<C888210Yst> list) {
        this.$t = list;
        this.l0 = obj;
        this.l1 = messageRequestTopBarAssem;
    }
}
