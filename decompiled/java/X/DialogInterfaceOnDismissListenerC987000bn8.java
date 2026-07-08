package X;

import android.content.DialogInterface;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.api.ShowNoticeBoardManagePanel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bn8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class DialogInterfaceOnDismissListenerC987000bn8 implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                break;
            case 1:
                onDismiss$1(this, dialogInterface);
                break;
            case 2:
                onDismiss$2(this, dialogInterface);
                break;
            case 3:
                onDismiss$3(this, dialogInterface);
                break;
        }
    }

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC987000bn8 dialogInterfaceOnDismissListenerC987000bn8, DialogInterface dialogInterface) {
        if (!((DialogC933230aOP) dialogInterfaceOnDismissListenerC987000bn8.l0).LLJJJJJIL) {
            ((C932910aNt) dialogInterfaceOnDismissListenerC987000bn8.l1).LIZ.FQ2(ShowNoticeBoardManagePanel.class);
        }
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC987000bn8 dialogInterfaceOnDismissListenerC987000bn8, DialogInterface dialogInterface) {
        C946050aj5 c946050aj5LIZIZ;
        DataChannel dataChannel = (DataChannel) dialogInterfaceOnDismissListenerC987000bn8.l0;
        if (dataChannel != null) {
            ((MultiGuestSharedBgAnchorViewModel) dialogInterfaceOnDismissListenerC987000bn8.l1).getClass();
            C946060aj6 c946060aj6XQ2 = MultiGuestSharedBgAnchorViewModel.xQ2(dataChannel);
            if (c946060aj6XQ2 != null && (c946050aj5LIZIZ = c946060aj6XQ2.LIZIZ()) != null) {
                c946050aj5LIZIZ.LIZIZ(1);
            }
        }
    }

    public static final void onDismiss$2(DialogInterfaceOnDismissListenerC987000bn8 dialogInterfaceOnDismissListenerC987000bn8, DialogInterface dialogInterface) {
        ArrayList arrayList;
        String strLJJLIIIJ;
        MutableLiveData<Map<Boolean, List<C954460awe>>> mutableLiveData;
        Map<Boolean, List<C954460awe>> value;
        List<C954460awe> list;
        C977580bXw c977580bXw = (C977580bXw) dialogInterfaceOnDismissListenerC987000bn8.l0;
        c977580bXw.getClass();
        InterfaceC980390bcT.Ka.LJFF(Long.valueOf(C915980Zwa.LJII().getChannelId()));
        C977590bXx c977590bXx = c977580bXw.LJ;
        String strLJJLIIIJ2 = null;
        if (c977590bXx != null && (mutableLiveData = c977590bXx.LJFF) != null && (value = mutableLiveData.getValue()) != null && (list = value.get(Boolean.TRUE)) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C954460awe> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(it2.next().LJ));
            }
        } else {
            arrayList = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("save last selected member ---");
        if (arrayList != null) {
            strLJJLIIIJ2 = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
        }
        sbLIZ.append(strLJJLIIIJ2);
        C20441214yg.LJ("TeamMatchInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ));
        C20337914i1<String> c20337914i1 = InterfaceC980390bcT.Ja;
        if (arrayList == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62)) == null) {
            strLJJLIIIJ = "";
        }
        c20337914i1.LJFF(strLJJLIIIJ);
        ((Function0) dialogInterfaceOnDismissListenerC987000bn8.l1).invoke();
    }

    public static final void onDismiss$3(DialogInterfaceOnDismissListenerC987000bn8 dialogInterfaceOnDismissListenerC987000bn8, DialogInterface dialogInterface) {
        if (!((DialogC933230aOP) dialogInterfaceOnDismissListenerC987000bn8.l0).LLJJJJJIL) {
            ((C920060a3A) dialogInterfaceOnDismissListenerC987000bn8.l1).LIZ.LIZ.FQ2(ShowNoticeBoardManagePanel.class);
        }
    }

    public DialogInterfaceOnDismissListenerC987000bn8(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
