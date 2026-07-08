package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.14qy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20393414qy extends AbstractC20394014r4 {
    public final DataChannel LIZIZ;
    public final PlaybookAnchorViewModel LIZJ;
    public final C0UPI LIZLLL;
    public final MutableLiveData<List<Playbook>> LJ = new MutableLiveData<>(null);

    public C20393414qy(DataChannel dataChannel, PlaybookAnchorViewModel playbookAnchorViewModel, C0UPI c0upi) {
        this.LIZIZ = dataChannel;
        this.LIZJ = playbookAnchorViewModel;
        this.LIZLLL = c0upi;
    }
}
