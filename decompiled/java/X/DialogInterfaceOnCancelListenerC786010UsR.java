package X;

import android.content.DialogInterface;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.ss.android.ugc.aweme.comment.viewerlist.ui.VideoViewHistoryAuthorizationFragment;
import com.ss.android.ugc.aweme.rss.link.ui.RssIntroAssem;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UsR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class DialogInterfaceOnCancelListenerC786010UsR implements DialogInterface.OnCancelListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onCancel$0(this, dialogInterface);
                break;
            case 1:
                onCancel$1(this, dialogInterface);
                break;
            case 2:
                onCancel$2(this, dialogInterface);
                break;
            case 3:
                onCancel$3(this, dialogInterface);
                break;
            case 4:
                onCancel$4(this, dialogInterface);
                break;
            case 5:
                onCancel$5(this, dialogInterface);
                break;
            case 6:
                onCancel$6(this, dialogInterface);
                break;
            case 7:
                onCancel$7(this, dialogInterface);
                break;
            case 8:
                onCancel$8(this, dialogInterface);
                break;
        }
    }

    public DialogInterfaceOnCancelListenerC786010UsR(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(DialogInterfaceOnCancelListenerC786010UsR dialogInterfaceOnCancelListenerC786010UsR, DialogInterface dialogInterface) {
        ((VideoViewHistoryAuthorizationFragment) dialogInterfaceOnCancelListenerC786010UsR.l0).VR();
    }

    public static final void onCancel$1(DialogInterfaceOnCancelListenerC786010UsR dialogInterfaceOnCancelListenerC786010UsR, DialogInterface dialogInterface) {
        ((RssIntroAssem) dialogInterfaceOnCancelListenerC786010UsR.l0).Ho();
    }

    public static final void onCancel$2(DialogInterfaceOnCancelListenerC786010UsR dialogInterfaceOnCancelListenerC786010UsR, DialogInterface dialogInterface) {
        C0UXF c0uxf = (C0UXF) dialogInterfaceOnCancelListenerC786010UsR.l0;
        if (c0uxf.LLJI != LiveMode.SCREEN_RECORD) {
            return;
        }
        c0uxf.LJ();
    }

    public static final void onCancel$3(DialogInterfaceOnCancelListenerC786010UsR dialogInterfaceOnCancelListenerC786010UsR, DialogInterface dialogInterface) {
        ((Function0) dialogInterfaceOnCancelListenerC786010UsR.l0).invoke();
    }

    public static final void onCancel$4(DialogInterfaceOnCancelListenerC786010UsR dialogInterfaceOnCancelListenerC786010UsR, DialogInterface dialogInterface) {
        C784470Upx c784470Upx = (C784470Upx) dialogInterfaceOnCancelListenerC786010UsR.l0;
        c784470Upx.getClass();
        InterfaceC1106030et7.c5.LJFF(Boolean.FALSE);
        c784470Upx.LIZIZ("not_allowed");
    }

    public static final void onCancel$5(DialogInterfaceOnCancelListenerC786010UsR dialogInterfaceOnCancelListenerC786010UsR, DialogInterface dialogInterface) {
        ((Function1) dialogInterfaceOnCancelListenerC786010UsR.l0).invoke(dialogInterface);
    }

    public static final void onCancel$6(DialogInterfaceOnCancelListenerC786010UsR dialogInterfaceOnCancelListenerC786010UsR, DialogInterface dialogInterface) {
        C750580TcO c750580TcO = (C750580TcO) dialogInterfaceOnCancelListenerC786010UsR.l0;
        InterfaceC750520TcI interfaceC750520TcI = c750580TcO.LLILLJJLI;
        if (interfaceC750520TcI != null) {
            interfaceC750520TcI.LIZIZ(c750580TcO.LLILZLL);
        }
        InterfaceC750520TcI interfaceC750520TcI2 = ((C750580TcO) dialogInterfaceOnCancelListenerC786010UsR.l0).LLILLJJLI;
        if (interfaceC750520TcI2 != null) {
            interfaceC750520TcI2.LIZJ(true);
        }
    }

    public static final void onCancel$7(DialogInterfaceOnCancelListenerC786010UsR dialogInterfaceOnCancelListenerC786010UsR, DialogInterface dialogInterface) {
        InterfaceC750520TcI interfaceC750520TcI = ((C750580TcO) dialogInterfaceOnCancelListenerC786010UsR.l0).LLILLJJLI;
        if (interfaceC750520TcI != null) {
            interfaceC750520TcI.LIZJ(true);
        }
        C750580TcO c750580TcO = (C750580TcO) dialogInterfaceOnCancelListenerC786010UsR.l0;
        InterfaceC750520TcI interfaceC750520TcI2 = c750580TcO.LLILLJJLI;
        if (interfaceC750520TcI2 != null) {
            interfaceC750520TcI2.LIZIZ(c750580TcO.LLILZLL);
        }
    }

    public static final void onCancel$8(DialogInterfaceOnCancelListenerC786010UsR dialogInterfaceOnCancelListenerC786010UsR, DialogInterface dialogInterface) {
        ((Function0) dialogInterfaceOnCancelListenerC786010UsR.l0).invoke();
    }
}
