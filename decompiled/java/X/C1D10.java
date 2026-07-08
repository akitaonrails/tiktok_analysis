package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.login.DeviceAuthDialog;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginManager;
import com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene;

/* JADX INFO: renamed from: X.1D10, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public class C1D10 implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                break;
            case 1:
                onClick$1(this, dialogInterface, i);
                break;
            case 2:
                onClick$2(this, dialogInterface, i);
                break;
            case 3:
                onClick$3(this, dialogInterface, i);
                break;
            case 4:
                onClick$4(this, dialogInterface, i);
                break;
        }
    }

    public C1D10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(C1D10 c1d10, DialogInterface dialogInterface, int i) {
        ((EditCaptionScene) c1d10.l0).LLLLIILL();
    }

    public static final void onClick$1(C1D10 c1d10, DialogInterface dialogInterface, int i) {
        ((EditCaptionScene) c1d10.l0).LLLLIILL();
    }

    public static final void onClick$2(C1D10 c1d10, DialogInterface dialogInterface, int i) {
        C2216891Bpf c2216891Bpf = (C2216891Bpf) c1d10.l0;
        c2216891Bpf.LIZ(c2216891Bpf.LJIIJ);
    }

    public static final void onClick$3(C1D10 c1d10, DialogInterface dialogInterface, int i) {
        DeviceAuthDialog deviceAuthDialog = (DeviceAuthDialog) c1d10.l0;
        View viewOR = deviceAuthDialog.OR(false);
        Dialog dialog = deviceAuthDialog.getDialog();
        if (dialog != null) {
            dialog.setContentView(viewOR);
        }
        LoginClient.Request request = deviceAuthDialog.LLJIJIL;
        if (request != null) {
            deviceAuthDialog.ZR(request);
        }
    }

    public static final void onClick$4(C1D10 c1d10, DialogInterface dialogInterface, int i) {
        LoginManager loginManager = (LoginManager) c1d10.l0;
        if (!C807660VmG.LIZ(ViewOnClickListenerC2202551BIf.class)) {
            try {
                loginManager.LIZLLL();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
