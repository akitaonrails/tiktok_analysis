package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.biz.PlaybookBizDataChanged;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.UserHasLivePermission;
import com.bytedance.android.live.liveinteract.multiguestv3.playbook.ActivePlaybookChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: X.0blS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C985960blS {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0blV, X.0rMx] */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, X.0blU, kotlin.jvm.functions.Function1] */
    public static void LIZ(RecyclerView recyclerView, LifecycleOwner lifecycleOwner, final DataChannel dataChannel, final C986010blX c986010blX) {
        C1117360fBO c1117360fBO;
        if (dataChannel != 0) {
            dataChannel.zW(UserHasLivePermission.class, Boolean.TRUE);
        }
        C259800zU c259800zU = new C259800zU();
        T tLIZ = 0;
        if (dataChannel != 0) {
            tLIZ = C784920Uqg.LIZ(dataChannel);
        }
        c259800zU.element = tLIZ;
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        C259800zU c259800zU2 = new C259800zU();
        ?? c985980blU = new C985980blU(recyclerView, linkedHashSet, dataChannel, c986010blX, c259800zU2, lifecycleOwner);
        c259800zU2.element = c985980blU;
        if (dataChannel != 0) {
            dataChannel.BQ2(lifecycleOwner, PlaybookBizDataChanged.class, c985980blU);
        }
        ?? r3 = new AbstractC1585810rMx() { // from class: X.0blV
            @Override // X.AbstractC1585810rMx
            public final void LJJIIJ(RecyclerView recyclerView2, int i) {
                C985960blS.LIZIZ(recyclerView2, linkedHashSet, dataChannel, c986010blX);
            }
        };
        recyclerView.addOnScrollListener(r3);
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if ((adapter instanceof C1117360fBO) && (c1117360fBO = (C1117360fBO) adapter) != null && dataChannel != 0) {
            dataChannel.BQ2(lifecycleOwner, ActivePlaybookChannel.class, new C985730bl5(recyclerView, c259800zU, c1117360fBO));
        }
        PlaybookUtilKt.LJJII(lifecycleOwner, new C986000blW(recyclerView, r3));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(androidx.recyclerview.widget.RecyclerView r27, java.util.Set r28, com.bytedance.ies.sdk.datachannel.DataChannel r29, X.C986010blX r30) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C985960blS.LIZIZ(androidx.recyclerview.widget.RecyclerView, java.util.Set, com.bytedance.ies.sdk.datachannel.DataChannel, X.0blX):boolean");
    }
}
