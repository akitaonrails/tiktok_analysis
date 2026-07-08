package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookInteractivePolymerizationDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.UserHasLivePermission;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookFetchListResponse;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.user.ApplyLivePermission;
import com.bytedance.android.livesdkapi.user.DetailLivePermission;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import webcast.data.multi_guest_play.PlaybookTagAggregation;

/* JADX INFO: renamed from: X.14qU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20390414qU implements InterfaceC170900l9<C470590Icr<PlaybookFetchListResponse.ResponseData>> {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ PlaybookInteractivePolymerizationDialog LIZIZ;

    @Override // X.InterfaceC170900l9
    public final void onFailed(Throwable th) {
    }

    @Override // X.InterfaceC170900l9
    public final void LIZ(C470590Icr<PlaybookFetchListResponse.ResponseData> c470590Icr) {
        C20632315oP c20632315oP;
        C470590Icr<PlaybookFetchListResponse.ResponseData> c470590Icr2 = c470590Icr;
        if (!this.LIZ && (!c470590Icr2.data.tagAggregations.isEmpty())) {
            PlaybookInteractivePolymerizationDialog playbookInteractivePolymerizationDialog = this.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchList onSucceeded tagAggregations.size:");
            sbLIZ.append(c470590Icr2.data.tagAggregations.size());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            playbookInteractivePolymerizationDialog.getClass();
            C20441214yg.LIZIZ("PlaybookInteractivePolymerizationDialog", strLIZIZ);
            List<PlaybookTagAggregation> list = c470590Icr2.data.tagAggregations;
            PlaybookInteractivePolymerizationDialog playbookInteractivePolymerizationDialog2 = this.LIZIZ;
            Iterator<PlaybookTagAggregation> it2 = list.iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().playbookFirstLevelTagType == playbookInteractivePolymerizationDialog2.LLLILZ) {
                        if (i >= 0) {
                            this.LIZIZ.LLLILZJ = Integer.valueOf(i);
                            if (i > 0 && (c20632315oP = this.LIZIZ.LLLIILIL) != null) {
                                c20632315oP.LJ(i, false);
                            }
                        }
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            PlaybookInteractivePolymerizationDialog playbookInteractivePolymerizationDialog3 = this.LIZIZ;
            List<PlaybookTagAggregation> list2 = c470590Icr2.data.tagAggregations;
            playbookInteractivePolymerizationDialog3.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator<PlaybookTagAggregation> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList.add(new C1203140hPk(it3.next().firstLevelTagTranslatedName, null, 14));
            }
            C1203130hPj c1203130hPj = playbookInteractivePolymerizationDialog3.LLLIIIL;
            if (c1203130hPj != null) {
                c1203130hPj.setChips(arrayList);
            }
            C1203130hPj c1203130hPj2 = playbookInteractivePolymerizationDialog3.LLLIIIL;
            if (c1203130hPj2 != null) {
                c1203130hPj2.LIZ(i, true, C1203200hPq.LIZ);
            }
            IHostUser iHostUser = (IHostUser) C1161920gLG.LIZJ(IHostUser.class);
            final PlaybookInteractivePolymerizationDialog playbookInteractivePolymerizationDialog4 = this.LIZIZ;
            iHostUser.requestLivePermission(new InterfaceC472150IfN() { // from class: X.14qY
                @Override // X.InterfaceC472150IfN
                public final void onFailed(Throwable th) {
                    RecyclerView recyclerView;
                    AbstractC21673619ry adapter;
                    DataChannel dataChannel = playbookInteractivePolymerizationDialog4.LLJZIJLIL;
                    if (dataChannel != null) {
                        dataChannel.zW(UserHasLivePermission.class, Boolean.FALSE);
                    }
                    C20398214rk c20398214rk = playbookInteractivePolymerizationDialog4.LLLIIL;
                    if (c20398214rk != null && (recyclerView = c20398214rk.LLJJ) != null && (adapter = recyclerView.getAdapter()) != null) {
                        adapter.notifyDataSetChanged();
                    }
                }

                @Override // X.InterfaceC472150IfN
                public final void LIZ(Boolean bool, DetailLivePermission detailLivePermission, ApplyLivePermission applyLivePermission, Boolean bool2, C783980UpA c783980UpA, Map<String, String> map) {
                    RecyclerView recyclerView;
                    AbstractC21673619ry adapter;
                    boolean zBooleanValue;
                    DataChannel dataChannel = playbookInteractivePolymerizationDialog4.LLJZIJLIL;
                    if (dataChannel != null) {
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        dataChannel.zW(UserHasLivePermission.class, Boolean.valueOf(zBooleanValue));
                    }
                    C20398214rk c20398214rk = playbookInteractivePolymerizationDialog4.LLLIIL;
                    if (c20398214rk != null && (recyclerView = c20398214rk.LLJJ) != null && (adapter = recyclerView.getAdapter()) != null) {
                        adapter.notifyDataSetChanged();
                    }
                }
            }, "playbook_recommend_list");
        }
    }

    public C20390414qU(boolean z, PlaybookInteractivePolymerizationDialog playbookInteractivePolymerizationDialog) {
        this.LIZ = z;
        this.LIZIZ = playbookInteractivePolymerizationDialog;
    }
}
