package X;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookEndResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.functions.Function1;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.01xO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C501601xO {
    public final Context LIZ;
    public final PlaybookAnchorViewModel LIZIZ;
    public final DataChannel LIZJ;

    public C501601xO(Context context, PlaybookAnchorViewModel playbookAnchorViewModel, DataChannel dataChannel) {
        this.LIZ = context;
        this.LIZIZ = playbookAnchorViewModel;
        this.LIZJ = dataChannel;
    }

    public static void LIZ(C501601xO c501601xO, boolean z, final Function1 function1, C20383814pQ c20383814pQ, int i) {
        boolean z2;
        Long lValueOf;
        MutableLiveData<ActivePlaybook> mutableLiveData;
        ActivePlaybook value;
        Playbook playbook;
        C20383814pQ c20383814pQ2 = c20383814pQ;
        if ((i & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 8) != 0) {
            c20383814pQ2 = null;
        }
        c501601xO.getClass();
        String strLIZ = C01EI.LIZ(0, "PlaybookOpenDetailHelper");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("endCurTask needAddToFavorite:");
        sbLIZ.append(z);
        sbLIZ.append(" playbookId:");
        PlaybookAnchorViewModel playbookAnchorViewModel = c501601xO.LIZIZ;
        if (playbookAnchorViewModel != null && (mutableLiveData = playbookAnchorViewModel.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null && (playbook = value.playbook) != null) {
            lValueOf = Long.valueOf(playbook.playbookId);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(' ');
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        PlaybookAnchorViewModel playbookAnchorViewModel2 = c501601xO.LIZIZ;
        if (playbookAnchorViewModel2 != null) {
            playbookAnchorViewModel2.GQ2(new InterfaceC170900l9<C470590Icr<PlaybookEndResponse.ResponseData>>() { // from class: X.00lF
                @Override // X.InterfaceC170900l9
                public final void LIZ(C470590Icr<PlaybookEndResponse.ResponseData> c470590Icr) {
                    function1.invoke(Boolean.TRUE);
                }

                @Override // X.InterfaceC170900l9
                public final void onFailed(Throwable th) {
                    String message;
                    String strLIZ2 = C01EI.LIZ(0, "PlaybookOpenDetailHelper");
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("end onFailed:");
                    if (th != null) {
                        message = th.getMessage();
                    } else {
                        message = null;
                    }
                    sbLIZ2.append(message);
                    C1AZW.LJIIJ(12, strLIZ2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
                    function1.invoke(Boolean.FALSE);
                }
            }, z, z2, c20383814pQ2, false);
        }
    }
}
