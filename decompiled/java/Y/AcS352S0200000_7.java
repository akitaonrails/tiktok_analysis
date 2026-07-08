package Y;

import X.C0IJT;
import X.C0JFN;
import X.C0JFO;
import X.C0UNN;
import X.C1086800eO6;
import X.C1161920gLG;
import X.C2188811AlT;
import X.C474500IjA;
import X.C475510Ikn;
import X.C5183020f;
import X.C781270Ukn;
import X.InterfaceC1106030et7;
import X.InterfaceC743640TFa;
import X.InterfaceC914470Zu9;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.broadcast.preview.onetap.OneTapGoLiveManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEventPageLynxUrl;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.qa.CloseQuestionEvent;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.u;

/* JADX INFO: loaded from: classes8.dex */
public class AcS352S0200000_7 implements InterfaceC743640TFa {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC743640TFa
    public final void LIZ(LiveDialog liveDialog) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, liveDialog);
                break;
            case 1:
                LIZ$1(this, liveDialog);
                break;
            case 2:
                LIZ$2(this, liveDialog);
                break;
            case 3:
                LIZ$3(this, liveDialog);
                break;
            case 4:
                LIZ$4(this, liveDialog);
                break;
            case 5:
                LIZ$5(this, liveDialog);
                break;
            case 6:
                LIZ$6(this, liveDialog);
                break;
            case 7:
                LIZ$7(this, liveDialog);
                break;
        }
    }

    public static final void LIZ$0(AcS352S0200000_7 acS352S0200000_7, LiveDialog liveDialog) {
        liveDialog.dismiss();
        InterfaceC1106030et7.E8.LIZJ(Double.valueOf(0.0d));
        InterfaceC1106030et7.F8.LIZJ(Double.valueOf(0.0d));
        String string = UriProtector.parse(LiveEventPageLynxUrl.INSTANCE.getLiveEventGuideSchema()).buildUpon().appendQueryParameter("enter_from", "live_take_page_exit").build().toString();
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle((Context) acS352S0200000_7.l1, string);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_takepage_exit_event_popup_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII("create_event", "click_area");
        c474500IjALIZ.LJJII(((DataChannel) acS352S0200000_7.l0).gg0(C0UNN.class), "enter_from");
        c474500IjALIZ.LIZ();
    }

    public static final void LIZ$1(AcS352S0200000_7 acS352S0200000_7, LiveDialog liveDialog) {
        String strLJJIFFI;
        long jLongValue;
        Long l;
        String str;
        liveDialog.dismiss();
        Hashtag hashtag = ((OneTapGoLiveManager) acS352S0200000_7.l0).LLJILLL;
        if (hashtag == null || (str = hashtag.title) == null || (strLJJIFFI = u.LJJIFFI(str, "&", "%26", false)) == null) {
            strLJJIFFI = "";
        }
        Hashtag hashtag2 = ((OneTapGoLiveManager) acS352S0200000_7.l0).LLJILLL;
        if (hashtag2 != null && (l = hashtag2.id) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("source_params={\"hashtag_title\":\"");
        sbLIZ.append(strLJJIFFI);
        sbLIZ.append("\",\"hashtag_id\":");
        sbLIZ.append(jLongValue);
        sbLIZ.append(",\"showApplyDialog\":1,\"request_from\":oneTapGoLive}");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        IHostAction iHostActionLJIIJ = C781270Ukn.LJIIJ();
        Context context = (Context) acS352S0200000_7.l1;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("sslocal://openRecord?enter_from=direct_shoot&tab=live&");
        sbLIZ2.append(strLIZIZ);
        iHostActionLJIIJ.handleSchema(context, C2188811AlT.LIZIZ(sbLIZ2), new Bundle());
    }

    public static final void LIZ$2(AcS352S0200000_7 acS352S0200000_7, LiveDialog liveDialog) {
        ((Function1) acS352S0200000_7.l0).invoke(Boolean.FALSE);
        C0JFO.LJIIJ((DataChannel) acS352S0200000_7.l1, "QA", false);
        liveDialog.dismiss();
    }

    public static final void LIZ$3(AcS352S0200000_7 acS352S0200000_7, LiveDialog liveDialog) {
        DataChannel dataChannel = (DataChannel) acS352S0200000_7.l0;
        if (dataChannel != null) {
            dataChannel.LC0(CloseQuestionEvent.class, new C5183020f((Function1) acS352S0200000_7.l1, (Function1<? super Long, Object>) 366));
        }
        C0JFO.LJIIJ((DataChannel) acS352S0200000_7.l0, "QA", true);
        liveDialog.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0JFT] */
    public static final void LIZ$4(AcS352S0200000_7 acS352S0200000_7, LiveDialog liveDialog) {
        IInteractService iInteractService = (IInteractService) acS352S0200000_7.l0;
        final Function0 function0 = (Function0) acS352S0200000_7.l1;
        iInteractService.GR(new InterfaceC914470Zu9() { // from class: X.0JFT
            @Override // X.InterfaceC914470Zu9
            public final void onFailed() {
            }

            @Override // X.InterfaceC914470Zu9
            public final void onSuccess() {
                function0.invoke();
            }
        });
        liveDialog.dismiss();
    }

    public static final void LIZ$5(AcS352S0200000_7 acS352S0200000_7, LiveDialog liveDialog) {
        ((Function1) acS352S0200000_7.l0).invoke(Boolean.FALSE);
        C0JFN c0jfn = C0JFN.LIZ;
        DataChannel dataChannelLJ = C475510Ikn.LJ((Fragment) acS352S0200000_7.l1);
        c0jfn.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_pictionary_change_popup_click");
        c474500IjALIZ.LJIJJLI(dataChannelLJ);
        c474500IjALIZ.LJJII("close", "click_type");
        c474500IjALIZ.LIZ();
        liveDialog.dismiss();
    }

    public static final void LIZ$6(AcS352S0200000_7 acS352S0200000_7, LiveDialog liveDialog) {
        ((Function1) acS352S0200000_7.l0).invoke(Boolean.FALSE);
        C0JFO.LJIIJ((DataChannel) acS352S0200000_7.l1, "poll", false);
        liveDialog.dismiss();
    }

    public static final void LIZ$7(AcS352S0200000_7 acS352S0200000_7, LiveDialog liveDialog) {
        C1086800eO6.LIZ.LIZ(1, new C5183020f((Function1) acS352S0200000_7.l1, (Function1<? super Long, Object>) 367));
        C0JFO.LJIIJ((DataChannel) acS352S0200000_7.l0, "poll", true);
        liveDialog.dismiss();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AcS352S0200000_7(com.bytedance.ies.sdk.datachannel.DataChannel r2, kotlin.jvm.functions.Function1 r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 2: goto Le;
                case 3: goto L5;
                case 4: goto L5;
                case 5: goto L5;
                case 6: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AcS352S0200000_7.<init>(com.bytedance.ies.sdk.datachannel.DataChannel, kotlin.jvm.functions.Function1, int):void");
    }

    public AcS352S0200000_7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
