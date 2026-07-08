package Y;

import X.C09JN;
import X.C1344030l4z;
import X.C1350920lG6;
import X.C1606010rtX;
import X.C1C7U;
import X.C2188811AlT;
import X.EnumC1233370iCV;
import X.EnumC1606080rte;
import X.EnumC1615506Uf;
import com.ss.android.ugc.aweme.comment.viewerlist.model.ViewerListResponse;
import com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewerListVM;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS257S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public class AfS1S1111000_19 implements C09JN {
    public final int $t;
    public int i3;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS1S1111000_19 afS1S1111000_19, Object obj) {
        C1C7U.LIZ("VideoViewerListVM$BubbleVideoViewerViewModel@8118.fetchVideoViewerList$1");
        ViewerListResponse viewerListResponse = (ViewerListResponse) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load viewer list success  ");
        sbLIZ.append(viewerListResponse);
        C1344030l4z.LIZJ("VideoViewerListVM", C2188811AlT.LIZIZ(sbLIZ));
        if (afS1S1111000_19.z2) {
            ((Set) ((VideoViewerListVM.BubbleVideoViewerViewModel) afS1S1111000_19.l1).LLIZLLLIL.getValue()).clear();
            if (afS1S1111000_19.i3 == EnumC1233370iCV.ENTRANCE.getValue()) {
                ((VideoViewerListVM.BubbleVideoViewerViewModel) afS1S1111000_19.l1).zQ2(new Pair(afS1S1111000_19.s0, viewerListResponse), "REFRESH_ENTRANCE_VIDEO_VIEW_SUCCESS");
            } else {
                ((VideoViewerListVM.BubbleVideoViewerViewModel) afS1S1111000_19.l1).zQ2(new Pair(afS1S1111000_19.s0, viewerListResponse), "REFRESH_VIDEO_VIEWER_HISTORY_SUCCESS");
            }
        } else if (afS1S1111000_19.i3 == EnumC1233370iCV.ENTRANCE.getValue()) {
            ((VideoViewerListVM.BubbleVideoViewerViewModel) afS1S1111000_19.l1).zQ2(new Pair(afS1S1111000_19.s0, viewerListResponse), "LOAD_MORE_ENTRANCE_VIDEO_VIEW_SUCCESS");
        } else {
            ((VideoViewerListVM.BubbleVideoViewerViewModel) afS1S1111000_19.l1).zQ2(new Pair(afS1S1111000_19.s0, viewerListResponse), "LOAD_MORE_VIDEO_VIEWER_HISTORY_SUCCESS");
        }
        C1606010rtX.LIZIZ.LIZJ(EnumC1615506Uf.STORY, EnumC1606080rte.COMMENT, viewerListResponse.getViewerList(), AFwS257S0000000_19.get$arr$(93));
        C1350920lG6.LJIJI("normal_video", "viewer_list", viewerListResponse.getViewerList(), (Set) ((VideoViewerListVM.BubbleVideoViewerViewModel) afS1S1111000_19.l1).LLIZLLLIL.getValue());
        C1C7U.LIZIZ("VideoViewerListVM$BubbleVideoViewerViewModel@8118.fetchVideoViewerList$1");
    }

    public static final void accept$1(AfS1S1111000_19 afS1S1111000_19, Object obj) {
        C1C7U.LIZ("VideoViewerListVM$BubbleVideoViewerViewModel@8118.fetchVideoViewerList$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load viewer list  fail ");
        sbLIZ.append(obj);
        C1344030l4z.LIZJ("VideoViewerListVM", C2188811AlT.LIZIZ(sbLIZ));
        if (afS1S1111000_19.z2) {
            if (afS1S1111000_19.i3 == EnumC1233370iCV.ENTRANCE.getValue()) {
                ((VideoViewerListVM.BubbleVideoViewerViewModel) afS1S1111000_19.l1).zQ2(new Pair(afS1S1111000_19.s0, obj), "REFRESH_ENTRANCE_VIDEO_VIEW_FAIL");
            } else {
                ((VideoViewerListVM.BubbleVideoViewerViewModel) afS1S1111000_19.l1).zQ2(afS1S1111000_19.s0, "REFRESH_VIDEO_VIEWER_HISTORY_FAIL");
            }
        } else if (afS1S1111000_19.i3 == EnumC1233370iCV.ENTRANCE.getValue()) {
            ((VideoViewerListVM.BubbleVideoViewerViewModel) afS1S1111000_19.l1).zQ2(new Pair(afS1S1111000_19.s0, obj), "LOAD_MORE_ENTRANCE_VIDEO_VIEW_FAIL");
        } else {
            ((VideoViewerListVM.BubbleVideoViewerViewModel) afS1S1111000_19.l1).zQ2(afS1S1111000_19.s0, "LOAD_MORE_VIDEO_VIEWER_HISTORY_FAIL");
        }
        C1C7U.LIZIZ("VideoViewerListVM$BubbleVideoViewerViewModel@8118.fetchVideoViewerList$2");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS1S1111000_19(int r2, com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewerListVM.BubbleVideoViewerViewModel r3, java.lang.String r4, boolean r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            if (r6 == 0) goto L11
            r0 = r1
            r0.z2 = r5
            r0.i3 = r2
            r0.l1 = r3
            r0.s0 = r4
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.z2 = r5
            r0.l1 = r3
            r0.i3 = r2
            r0.s0 = r4
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS1S1111000_19.<init>(int, com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewerListVM$BubbleVideoViewerViewModel, java.lang.String, boolean, int):void");
    }
}
