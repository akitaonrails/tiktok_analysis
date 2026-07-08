package X;

import android.text.TextUtils;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.widget.LiveReportMaskWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0IEA, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IEA implements InterfaceC1141530foN {
    public volatile boolean LL;
    public WeakReference<LivePlayFragment> LLILLJJLI;
    public DataChannel LLILLL;

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        LiveReportMaskWidget liveReportMaskWidget;
        LivePlayFragment livePlayFragment;
        InterfaceC1107590evd interfaceC1107590evd2;
        String str = c262100zr.LIZ;
        str.getClass();
        if (!str.equals("ttlive_report_preview")) {
            if (str.equals("ttlive_report_success") && (livePlayFragment = this.LLILLJJLI.get()) != null && (interfaceC1107590evd2 = c262100zr.LIZIZ) != null) {
                String string = interfaceC1107590evd2.getString("source");
                String string2 = c262100zr.LIZIZ.getString("action");
                if ("message".equals(string) && "".equals(string2)) {
                    ((IAdminSettingService) C1161920gLG.LIZJ(IAdminSettingService.class)).M22(livePlayFragment.LLILLJJLI, c262100zr.LIZIZ.getString("content"), livePlayFragment.getFragmentManager(), 3, 0L);
                }
                if (TextUtils.equals(string, "anchor")) {
                    livePlayFragment.onEvent(new C0IF2(1));
                    C0IGD c0igd = livePlayFragment.f307n2;
                    if (TextUtils.equals(string2, "remove")) {
                        this.LLILLL.IQ2(C749240TaE.class, new Pair(401, 401001));
                        if (c0igd != null) {
                            if (((LiveRoomFragment) c0igd).rS(livePlayFragment.LLILLJJLI)) {
                                C0IIS.LIZ(livePlayFragment.g1, C0II1.USER_REPORT_SUCCESS, "slide_next_room");
                                return;
                            }
                        }
                        C0IIS.LIZ(livePlayFragment.g1, C0II1.USER_REPORT_SUCCESS, "exit_room_container");
                        livePlayFragment.sS(null, C0IIQ.ERROR, -1);
                        return;
                    }
                    if (TextUtils.equals(string2, "mask")) {
                        LiveReportMaskWidget.LLILZLL.add(Long.valueOf(livePlayFragment.LLILLJJLI));
                        if (c0igd != null && ((LiveRoomFragment) c0igd).GS()) {
                            return;
                        }
                        livePlayFragment.OV(2);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        LivePlayFragment livePlayFragment2 = this.LLILLJJLI.get();
        if (livePlayFragment2 != null && (interfaceC1107590evd = c262100zr.LIZIZ) != null) {
            String string3 = interfaceC1107590evd.getString("source");
            String string4 = c262100zr.LIZIZ.getString("action");
            if (TextUtils.equals(string3, "anchor")) {
                if (TextUtils.equals(string4, "hide")) {
                    livePlayFragment2.OV(1);
                } else if (TextUtils.equals(string4, "unhide") && (liveReportMaskWidget = livePlayFragment2.H) != null) {
                    liveReportMaskWidget.hide();
                }
            }
        }
    }

    public C0IEA(LivePlayFragment livePlayFragment, DataChannel dataChannel) {
        this.LLILLJJLI = new WeakReference<>(livePlayFragment);
        this.LLILLL = dataChannel;
    }
}
