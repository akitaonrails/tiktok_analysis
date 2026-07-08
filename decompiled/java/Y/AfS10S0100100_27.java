package Y;

import X.AbstractC1837070xuD;
import X.C09JN;
import X.C158B;
import X.C1805320x50;
import X.C1805760x5i;
import X.C1806360x6g;
import X.C1834040xpK;
import X.C1836170xsl;
import X.C1836330xt1;
import X.C1837040xuA;
import X.C1837050xuB;
import X.C1C7U;
import X.C20337914i1;
import X.C500260Jjc;
import X.C766270U4b;
import X.C785410UrT;
import X.DialogC1390150mHN;
import X.InterfaceC1833600xoc;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.api.SMBCourse;
import com.bytedance.android.livesdk.chatroom.api.SMBCourseVideo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.LiveReplayVideoPlayerDialogFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.LiveReplayVideoClipActivity;
import com.ss.android.ugc.aweme.pcs.course.coursedetailpage.viewmodel.PcsCourseDetailVM;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.anchor.ScheduleAutoDownloadData;
import tikcast.api.anchor.ScheduleAutoDownloadResponse;
import webcast.api.smb.GetSMBCourseDetailResponse;

/* JADX INFO: loaded from: classes28.dex */
public class AfS10S0100100_27 implements C09JN {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS10S0100100_27 afS10S0100100_27, Object obj) {
        Throwable cause;
        C1C7U.LIZ("EmailIncentiveBalancePageStrategy@c920.callAPI$2");
        Throwable th = (Throwable) obj;
        C1805760x5i.LIZ = Long.valueOf(UserService.getInstance().user().getCurrentUserId());
        C1805760x5i.LIZIZ = null;
        C1805760x5i.LIZJ = C158B.LIZJ();
        C1806360x6g c1806360x6g = new C1806360x6g();
        long j = afS10S0100100_27.j1;
        c1806360x6g.LIZ("status_code", String.valueOf(-1));
        c1806360x6g.LIZ("duration", String.valueOf(C158B.LIZ() - j));
        String message = th.getMessage();
        if (message == null && ((cause = th.getCause()) == null || (message = cause.getMessage()) == null)) {
            message = "";
        }
        c1806360x6g.LIZ("error_message", message);
        c1806360x6g.LIZIZ();
        ((C1805320x50) afS10S0100100_27.l0).LIZ = null;
        C1C7U.LIZIZ("EmailIncentiveBalancePageStrategy@c920.callAPI$2");
    }

    public static final void accept$1(AfS10S0100100_27 afS10S0100100_27, Object obj) {
        Boolean boolValueOf;
        ScheduleAutoDownloadData scheduleAutoDownloadData;
        C1C7U.LIZ("LiveReplayVideoPlayerDialogFragment@7fa2.scheduleAutoDownloadRequest$1");
        ScheduleAutoDownloadResponse scheduleAutoDownloadResponse = (ScheduleAutoDownloadResponse) obj;
        ((LiveReplayVideoPlayerDialogFragment) afS10S0100100_27.l0).LLLIL = false;
        if (scheduleAutoDownloadResponse != null && (scheduleAutoDownloadData = scheduleAutoDownloadResponse.data) != null) {
            boolValueOf = Boolean.valueOf(scheduleAutoDownloadData.scheduleSuccess);
        } else {
            boolValueOf = null;
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            ((LiveReplayVideoPlayerDialogFragment) afS10S0100100_27.l0).wS("livesdk_live_replay_download_schedule_succeed", null);
            ((LiveReplayVideoPlayerDialogFragment) afS10S0100100_27.l0).aS().LIZLLL();
            long j = afS10S0100100_27.j1;
            C20337914i1<Map<String, String>> c20337914i1 = InterfaceC1833600xoc.ya;
            Map<String, String> mapLIZIZ = c20337914i1.LIZIZ();
            mapLIZIZ.put(String.valueOf(j), "");
            c20337914i1.LJFF(mapLIZIZ);
            ((LiveReplayVideoPlayerDialogFragment) afS10S0100100_27.l0).L1(2131842560);
        } else {
            ((LiveReplayVideoPlayerDialogFragment) afS10S0100100_27.l0).L1(2131842557);
        }
        C1C7U.LIZIZ("LiveReplayVideoPlayerDialogFragment@7fa2.scheduleAutoDownloadRequest$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$2(AfS10S0100100_27 afS10S0100100_27, Object obj) {
        AbstractC1837070xuD c1837050xuB;
        C1837040xuA c1837040xuA;
        C1C7U.LIZ("PcsCourseDetailVM@bb7.fetchCourseDetailAfterBuy$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        SMBCourse sMBCourse = ((GetSMBCourseDetailResponse.Data) baseResponse.data).course;
        if (sMBCourse != null) {
            sMBCourse.isPurchased = true;
            List<SMBCourseVideo> list = sMBCourse.videoList;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (SMBCourseVideo sMBCourseVideo : list) {
                    if (sMBCourseVideo.awemeStructStr.length() > 0) {
                        arrayList.add(sMBCourseVideo);
                    }
                }
                ((PcsCourseDetailVM) afS10S0100100_27.l0).vQ2(arrayList);
                AbstractC1837070xuD abstractC1837070xuD = ((PcsCourseDetailVM) afS10S0100100_27.l0).getState().LL;
                if ((abstractC1837070xuD instanceof C1837040xuA) && (c1837040xuA = (C1837040xuA) abstractC1837070xuD) != null) {
                    c1837050xuB = new C1837040xuA((GetSMBCourseDetailResponse.Data) baseResponse.data, c1837040xuA.LIZIZ);
                } else if ((abstractC1837070xuD instanceof C1837050xuB) && abstractC1837070xuD != null) {
                    c1837050xuB = new C1837050xuB((GetSMBCourseDetailResponse.Data) baseResponse.data);
                } else {
                    ((PcsCourseDetailVM) afS10S0100100_27.l0).AQ2(afS10S0100100_27.j1, false);
                }
                ((PcsCourseDetailVM) afS10S0100100_27.l0).setState(new AwS606S0100000_27(c1837050xuB, 174));
                ((PcsCourseDetailVM) afS10S0100100_27.l0).AQ2(afS10S0100100_27.j1, true);
            }
        }
        C1C7U.LIZIZ("PcsCourseDetailVM@bb7.fetchCourseDetailAfterBuy$1");
    }

    public static final void accept$3(AfS10S0100100_27 afS10S0100100_27, Object obj) {
        C1C7U.LIZ("LiveReplayVideoPlayerDialogFragment@7fa2.cancelAutoDownloadRequest$1");
        ((LiveReplayVideoPlayerDialogFragment) afS10S0100100_27.l0).wS("livesdk_live_replay_download_schedule_cancel", null);
        LiveReplayVideoPlayerDialogFragment liveReplayVideoPlayerDialogFragment = (LiveReplayVideoPlayerDialogFragment) afS10S0100100_27.l0;
        liveReplayVideoPlayerDialogFragment.LLLIL = false;
        liveReplayVideoPlayerDialogFragment.aS().LIZJ();
        C1834040xpK.LIZ(afS10S0100100_27.j1);
        ((LiveReplayVideoPlayerDialogFragment) afS10S0100100_27.l0).L1(2131842565);
        C1C7U.LIZIZ("LiveReplayVideoPlayerDialogFragment@7fa2.cancelAutoDownloadRequest$1");
    }

    public static final void accept$4(AfS10S0100100_27 afS10S0100100_27, Object obj) {
        C1C7U.LIZ("PcsCourseDetailVM@bb7.fetchCourseDetailAfterBuy$2");
        ((PcsCourseDetailVM) afS10S0100100_27.l0).AQ2(afS10S0100100_27.j1, false);
        C1C7U.LIZIZ("PcsCourseDetailVM@bb7.fetchCourseDetailAfterBuy$2");
    }

    public static final void accept$5(AfS10S0100100_27 afS10S0100100_27, Object obj) {
        String str;
        C1C7U.LIZ("LiveReplayVideoClipActivity@182e.getLiveReplayFragment$2");
        Throwable th = (Throwable) obj;
        if (!((LiveReplayVideoClipActivity) afS10S0100100_27.l0).LLJZIJLIL.isEmpty()) {
            C766270U4b.LIZLLL(2131843970);
        }
        C1836170xsl c1836170xsl = C1836170xsl.LIZ;
        int iLJIIIZ = C500260Jjc.LJIIIZ(th);
        String strValueOf = String.valueOf(afS10S0100100_27.j1);
        C1836330xt1 c1836330xt1 = ((LiveReplayVideoClipActivity) afS10S0100100_27.l0).LLJJIJIL;
        if (c1836330xt1 != null) {
            str = c1836330xt1.LIZ;
        } else {
            str = null;
        }
        c1836170xsl.getClass();
        C1836170xsl.LIZIZ(iLJIIIZ, "fail", "get_info_fail", strValueOf, str);
        DialogC1390150mHN dialogC1390150mHN = ((LiveReplayVideoClipActivity) afS10S0100100_27.l0).LLJJJJJIL;
        if (dialogC1390150mHN != null) {
            dialogC1390150mHN.dismiss();
            C785410UrT.LIZ(dialogC1390150mHN);
        }
        ((LinkedHashMap) ((LiveReplayVideoClipActivity) afS10S0100100_27.l0).LLJZIJLIL).clear();
        C1C7U.LIZIZ("LiveReplayVideoClipActivity@182e.getLiveReplayFragment$2");
    }

    public AfS10S0100100_27(Object obj, long j, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j1 = j;
    }
}
