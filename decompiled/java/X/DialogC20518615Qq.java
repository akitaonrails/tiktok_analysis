package X;

import Y.ACListenerS60S0101000_28;
import Y.ARunnableS131S0100000_31;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import webcast.data.multi_guest_play.CountdownConfig;

/* JADX INFO: renamed from: X.15Qq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class DialogC20518615Qq extends AbstractDialogC423201kk {
    public final InterfaceC422501kd LLJILJIL;
    public final String LLJILJILJ;
    public final String LLJILLL;
    public final CountdownConfig LLJJ;
    public final DataChannel LLJJI;
    public C20743716Ff LLJJIII;
    public C20743716Ff LLJJIJI;
    public View LLJJIJIIJIL;
    public C16FS LLJJIJIL;
    public C16FS LLJJJ;
    public C16FS LLJJJIL;
    public C16FS LLJJJJ;
    public C16FS LLJJJJJIL;
    public C16FS LLJJJJLIIL;
    public C21578619ce LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public View LLJLIL;
    public C1749190vcT LLJLILLLLZIIL;
    public C1748440vbG LLJLL;
    public C16FS LLJLLIL;
    public View LLJLLL;
    public Integer LLJZ;
    public int LLJZIJLIL;
    public int LLL;
    public boolean LLLF;
    public long LLLFF;
    public final HashMap<Integer, C16FS> LLLFFI;
    public TuxSheet LLLFZ;
    public C948750anR LLLI;
    public C20518715Qr LLLII;
    public String LLLIIII;
    public EnumC421801kW LLLIIIIL;

    @Override // X.AbstractDialogC972150bPB
    public final int LJJZZIII() {
        return R.layout.g92;
    }

    public final CountdownConfig LJLIIIL() {
        CountdownConfig countdownConfig = new CountdownConfig();
        int iIntValue = this.LLL;
        if (iIntValue == 0) {
            Integer num = this.LLJZ;
            iIntValue = num != null ? num.intValue() : 0;
        }
        countdownConfig.duration = ((long) iIntValue) * 60;
        countdownConfig.autoExpand = this.LLLF;
        countdownConfig.targetScore = this.LLLFF;
        return countdownConfig;
    }

    public final void LJLIL() {
        C1748440vbG c1748440vbG = this.LLJLL;
        if (c1748440vbG != null) {
            c1748440vbG.setValidationStatus(3);
        }
        C1749190vcT c1749190vcT = this.LLJLILLLLZIIL;
        if (c1749190vcT != null) {
            c1749190vcT.LJFF(true);
        }
        C1749190vcT c1749190vcT2 = this.LLJLILLLLZIIL;
        if (c1749190vcT2 != null) {
            HandlerHook.viewPostDelay(c1749190vcT2, new ARunnableS131S0100000_31(this, 135), 220L);
        }
        C16FS c16fs = this.LLJLLIL;
        if (c16fs != null) {
            c16fs.setEnabled(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0310  */
    @Override // X.AbstractDialogC423201kk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJL() {
        /*
            Method dump skipped, instruction units count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC20518615Qq.LJL():void");
    }

    @Override // X.AbstractDialogC972150bPB, android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onDetachedFromWindow();
        TuxSheet tuxSheet = this.LLLFZ;
        if (tuxSheet != null) {
            tuxSheet.dismissAllowingStateLoss();
        }
        C20518715Qr c20518715Qr = this.LLLII;
        if (c20518715Qr != null) {
            C20441214yg.LIZIZ("NestedScrollViewBoundaryHelper", "release");
            View viewLIZ = c20518715Qr.LIZ();
            if (viewLIZ != null && (viewTreeObserver = viewLIZ.getViewTreeObserver()) != null) {
                C16HN c16hn = c20518715Qr.LIZIZ;
                viewTreeObserver.removeOnGlobalLayoutListener(c16hn);
                C2187701Ajg.LIZIZ(viewTreeObserver, c16hn, ViewTreeObserver.OnGlobalLayoutListener.class);
            }
            c20518715Qr.LIZJ = null;
        }
        C948750anR c948750anR = this.LLLI;
        if (c948750anR != null) {
            c948750anR.LIZ();
        }
    }

    public final void LJLI(int i) {
        for (View view : this.LLLFFI.values()) {
            if (view != null) {
                view.setSelected(false);
            }
        }
        C16FS c16fs = this.LLLFFI.get(Integer.valueOf(i));
        if (c16fs != null) {
            c16fs.setSelected(true);
        }
        this.LLL = i;
    }

    @Override // X.AbstractDialogC423201kk, X.AbstractDialogC972150bPB, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            attributes.width = -1;
            attributes.height = -1;
            window.setSoftInputMode(48);
            window.setAttributes(attributes);
        }
        double dLJIILLIIL = ((double) C497740JfY.LJIILLIIL()) * 0.4d;
        View view = this.LLJLIL;
        if (view != null) {
            C500260Jjc.LJJZ((int) dLJIILLIIL, view);
        }
        String str = this.LLJILLL;
        String str2 = this.LLJILJILJ;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("link_id", str);
        map.put("guest_id", str2);
        C0KX4.LIZ("livesdk_anchor_guest_countdown_setting_show", map, null, true);
    }

    public final void LJLIIL(C16FS c16fs, int i) {
        if (c16fs != null) {
            c16fs.setTextColor(C20736316Cj.LIZIZ(R.attr.ex3, getContext()));
            C786410Ut5.h8(c16fs, new ACListenerS60S0101000_28(i, this, 1));
        }
    }

    public DialogC20518615Qq(Context context, C421501kT c421501kT, String str, String str2, CountdownConfig countdownConfig, DataChannel dataChannel) {
        super(context, false);
        this.LLJILJIL = c421501kT;
        this.LLJILJILJ = str;
        this.LLJILLL = str2;
        this.LLJJ = countdownConfig;
        this.LLJJI = dataChannel;
        this.LLJZIJLIL = 1;
        this.LLL = 1;
        this.LLLFFI = new HashMap<>();
        this.LLLIIII = "";
        this.LLLIIIIL = EnumC421801kW.OTHER;
    }
}
