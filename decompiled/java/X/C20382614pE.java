package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.14pE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20382614pE {
    public final BasePlaybookViewModel LIZ;
    public final DataChannel LIZIZ;
    public final Set<Long> LIZJ = new LinkedHashSet();

    public C20382614pE(PlaybookAnchorViewModel playbookAnchorViewModel, DataChannel dataChannel) {
        this.LIZ = playbookAnchorViewModel;
        this.LIZIZ = dataChannel;
    }
}
