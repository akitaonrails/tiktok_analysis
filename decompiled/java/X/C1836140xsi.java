package X;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.replay.proto.PublishPageParams;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveBusinessGiftHighlight;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.LiveReplayVideoClipActivity;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS77S1000000_27;
import tikcast.api.anchor.AnchorLiveFragmentInfoResponse;
import tikcast.api.anchor.LiveFragmentDetail;

/* JADX INFO: renamed from: X.0xsi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1836140xsi<T> implements C09JN {
    public final /* synthetic */ LiveReplayVideoClipActivity LL;
    public final /* synthetic */ long LLILLJJLI;

    public C1836140xsi(LiveReplayVideoClipActivity liveReplayVideoClipActivity, long j) {
        this.LL = liveReplayVideoClipActivity;
        this.LLILLJJLI = j;
    }

    @Override // X.C09JN
    public final void accept(Object obj) {
        final String str;
        LiveFragmentDetail liveFragmentDetail;
        List<String> arrayList;
        LiveFragmentDetail liveFragmentDetail2;
        C1C7U.LIZ("LiveReplayVideoClipActivity@182e.getLiveReplayFragment$1");
        AnchorLiveFragmentInfoResponse anchorLiveFragmentInfoResponse = (AnchorLiveFragmentInfoResponse) obj;
        String strLJIILL = "";
        AnchorLiveFragmentInfoResponse.ResponseData responseData = anchorLiveFragmentInfoResponse.data;
        if (responseData != null && (liveFragmentDetail2 = responseData.clipInfo) != null) {
            str = liveFragmentDetail2.downloadUrl;
        } else {
            str = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getLiveReplayFragment: ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("LiveReplayVideoClip", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LL.LLJZIJLIL.isEmpty() && str != null && str.length() != 0) {
            Map<Pair<Long, Long>, Long> map = this.LL.LLJZIJLIL;
            long j = this.LLILLJJLI;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                if (((Number) entry.getValue()).longValue() == j) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Set setKeySet = linkedHashMap.keySet();
            final C238400w2 c238400w2 = new C238400w2();
            if (true ^ setKeySet.isEmpty()) {
                c238400w2.element = ((Number) ((Pair) C13LP.LJJJJZ(setKeySet)).getSecond()).longValue() - ((Number) ((Pair) C13LP.LJJJJZ(setKeySet)).getFirst()).longValue();
            }
            ((LinkedHashMap) this.LL.LLJZIJLIL).clear();
            DialogC1390150mHN dialogC1390150mHN = this.LL.LLJJJJJIL;
            if (dialogC1390150mHN != null) {
                dialogC1390150mHN.LJJLL(30.0f, false);
            }
            AnchorLiveFragmentInfoResponse.ResponseData responseData2 = anchorLiveFragmentInfoResponse.data;
            if (responseData2 != null && (liveFragmentDetail = responseData2.clipInfo) != null) {
                final LiveReplayVideoClipActivity liveReplayVideoClipActivity = this.LL;
                liveReplayVideoClipActivity.getClass();
                DialogC1390150mHN dialogC1390150mHN2 = liveReplayVideoClipActivity.LLJJJJJIL;
                if (dialogC1390150mHN2 != null) {
                    dialogC1390150mHN2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: X.0xsr
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            C0IK5.LIZLLL(liveReplayVideoClipActivity.LLJJL);
                            LiveReplayVideoClipActivity liveReplayVideoClipActivity2 = liveReplayVideoClipActivity;
                            liveReplayVideoClipActivity2.LLJJJJLIIL = 0.0f;
                            liveReplayVideoClipActivity2.LLLZ(c238400w2.element);
                            C207232167i.LIZ(new AwS77S1000000_27(str, 4));
                        }
                    });
                }
                try {
                    PublishPageParams publishPageParams = new PublishPageParams();
                    PublishPageParams publishPageParams2 = liveFragmentDetail.publishPageParams;
                    if (publishPageParams2 == null || (arrayList = publishPageParams2.challenges) == null) {
                        arrayList = new ArrayList<>();
                    }
                    publishPageParams.challenges = arrayList;
                    strLJIILL = C7740030o.LIZ().getGson().LJIILL(new LiveBusinessGiftHighlight("", publishPageParams));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                C1836170xsl.LIZ.getClass();
                C1836170xsl.LIZLLL = System.currentTimeMillis();
                C1836170xsl.LIZJ(liveReplayVideoClipActivity, 30.0f, liveReplayVideoClipActivity.LLJJJJJIL, liveFragmentDetail.roomIdStr, liveFragmentDetail.fragmentIdStr, liveFragmentDetail.downloadUrl, ".mp4", liveReplayVideoClipActivity.LLJJIJIIJIL, liveReplayVideoClipActivity.LLJJIJIL, strLJIILL, liveReplayVideoClipActivity.LLLFZ, String.valueOf(liveFragmentDetail.fragmentTypeNew), C1834240xpe.LIZJ(liveReplayVideoClipActivity.LLLFFI), "replay_clip", liveReplayVideoClipActivity.LLJILJIL);
            }
        }
        C1C7U.LIZIZ("LiveReplayVideoClipActivity@182e.getLiveReplayFragment$1");
    }
}
