package X;

import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.playbooklist.PlaybookFavoritesListV2Dialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import kotlin.Unit;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.14qW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final /* synthetic */ class C20390614qW extends C2217421BqW implements InterfaceC1631620sYq<String, C1117360fBO, LinearLayoutManager, Unit> {
    public C20390614qW(Object obj) {
        super(3, obj, PlaybookFavoritesListV2Dialog.class, "onExpose", "onExpose(Ljava/lang/String;Lme/drakeet/multitype/MultiTypeAdapter;Landroidx/recyclerview/widget/LinearLayoutManager;)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(String str, C1117360fBO c1117360fBO, LinearLayoutManager linearLayoutManager) {
        boolean z;
        MutableLiveData<ActivePlaybook> mutableLiveData;
        ActivePlaybook value;
        Playbook playbook;
        C1117360fBO c1117360fBO2 = c1117360fBO;
        LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
        PlaybookFavoritesListV2Dialog playbookFavoritesListV2Dialog = (PlaybookFavoritesListV2Dialog) this.receiver;
        playbookFavoritesListV2Dialog.getClass();
        int iFindFirstVisibleItemPosition = linearLayoutManager2.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager2.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition != -1 && iFindLastVisibleItemPosition != -1 && iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
            while (true) {
                if (iFindFirstVisibleItemPosition < linearLayoutManager2.getItemCount()) {
                    Object obj = ListProtector.get(c1117360fBO2.LL, iFindFirstVisibleItemPosition);
                    if (obj instanceof C20390914qZ) {
                        C20390914qZ c20390914qZ = (C20390914qZ) obj;
                        if (!playbookFavoritesListV2Dialog.LLLFZ.contains(Long.valueOf(c20390914qZ.LIZ.playbookId))) {
                            playbookFavoritesListV2Dialog.LLLFZ.add(Long.valueOf(c20390914qZ.LIZ.playbookId));
                            C978410bZH c978410bZH = c20390914qZ.LIZLLL;
                            if (c978410bZH != null) {
                                C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                                C978360bZC.LJJIIZ(c20390914qZ.LIZ.playbookId, c978410bZH);
                            }
                            C915190ZvJ c915190ZvJ2 = C978360bZC.LIZJ;
                            DataChannel dataChannel = playbookFavoritesListV2Dialog.LLJZIJLIL;
                            Playbook playbook2 = c20390914qZ.LIZ;
                            int i = iFindFirstVisibleItemPosition + 1;
                            PlaybookAnchorViewModel playbookAnchorViewModel = playbookFavoritesListV2Dialog.LLL;
                            if (playbookAnchorViewModel != null && (mutableLiveData = playbookAnchorViewModel.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null && (playbook = value.playbook) != null && playbook.playbookId == c20390914qZ.LIZ.playbookId) {
                                z = true;
                            } else {
                                z = false;
                            }
                            C978360bZC.LJIILL(dataChannel, "show", playbook2, "favorite", i, z, false, null, null, 0, null, null, 4032);
                        }
                    }
                }
                if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                    break;
                }
                iFindFirstVisibleItemPosition++;
            }
        }
        return Unit.LIZ;
    }
}
