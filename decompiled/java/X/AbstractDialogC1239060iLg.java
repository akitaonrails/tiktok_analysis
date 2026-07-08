package X;

import Y.ARunnableS92S0000000_13;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.services.IFeed0VVManagerService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0iLg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public abstract class AbstractDialogC1239060iLg extends DialogC1239100iLk implements InterfaceC19303310fX, InterfaceC1238290iKR, InterfaceC852200Xbu {
    public final Activity LLILZ;
    public final Bundle LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public View LLJILLL;

    public static void LJJLIIJ(DialogC1239100iLk dialogC1239100iLk, C0WZX c0wzx) throws Throwable {
        Object obj;
        DialogC19728412Gs dialogC19728412Gs = dialogC1239100iLk;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/ss/android/ugc/aweme/views/ResizableDialog", "show", dialogC19728412Gs, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "com/ss/android/ugc/aweme/views/ResizableDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            dialogC19728412Gs = (DialogC19728412Gs) obj;
        }
        super.show();
        c0wst.LIZ(300000, "com/ss/android/ugc/aweme/views/ResizableDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
    }

    public abstract void LJJLJ();

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        this.LLJILJILJ = true;
        super.dismiss();
        ((CopyOnWriteArrayList) C1238280iKQ.LIZIZ).remove(this);
        if (this.LLJIJIL) {
            this.LLJIJIL = false;
            return;
        }
        C0XQ5.LJIIIZ(1, 4);
        if (this.LLJILJIL) {
            return;
        }
        C786410Ut5.LJLIIL(200L, new BPEAHandler(), new ARunnableS92S0000000_13(54));
    }

    @Override // X.InterfaceC852200Xbu
    public final String dm() {
        return "";
    }

    @Override // X.DialogC19728412Gs, android.app.Dialog
    public final void show() {
        this.LLJILJILJ = false;
        try {
            if (getOwnerActivity() == null || !getOwnerActivity().isFinishing()) {
                LJJLIIJ(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk4KJ0g7ZnSameGHdKBErJLdHaNg==", null));
                C0XQ5.LJIIIZ(1, 1);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC852200Xbu
    public final String channel() {
        String str = this.LLJI;
        return str == null ? "" : str;
    }

    @Override // X.DialogC1239100iLk, android.app.Dialog
    public final void onStart() {
        super.onStart();
        if (getWindow() == null) {
            return;
        }
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().setLayout(C12ES.LJIIJ(getContext()), -2);
    }

    @Override // X.InterfaceC852200Xbu
    public final String LJJLIIIJJI() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC852200Xbu
    public final String LLIIJI() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC852200Xbu
    public final String Nn() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC852200Xbu
    public final String bt() {
        return this.LLJ;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        super.cancel();
    }

    @Override // X.InterfaceC852200Xbu
    public final Bundle getExtras() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC19303310fX
    public final String LJJJIL(C1239090iLj c1239090iLj) throws Throwable {
        String str = c1239090iLj.LIZ;
        str.getClass();
        if (!str.equals("login")) {
            if (str.equals("dismiss")) {
                super.cancel();
            }
            return null;
        }
        T[] tArr = c1239090iLj.LIZIZ;
        if (tArr == 0 || tArr.length == 0) {
            return null;
        }
        getContext();
        try {
            if (C036E.LIZ.LIZIZ()) {
                this.LLJIJIL = true;
                if (isShowing()) {
                    dismiss();
                    C785410UrT.LIZ(this);
                }
                String strLIZ = c1239090iLj.LIZ();
                if (this.LLILZIL != null) {
                    C1239070iLh c1239070iLh = new C1239070iLh();
                    c1239070iLh.LIZLLL = this.LLILZIL.getString("enter_from");
                    c1239070iLh.LJ = strLIZ;
                    c1239070iLh.LIZJ();
                }
                C852170Xbr c852170Xbr = C852170Xbr.LIZ;
                Boolean bool = Boolean.FALSE;
                c852170Xbr.getClass();
                C852170Xbr.LJIIJ(bool, strLIZ, this, false, null);
                List<InterfaceC586170Myt> list = C0XQ5.LIZ;
                IFeed0VVManagerService iFeed0VVManagerService = (IFeed0VVManagerService) C0XPY.LIZIZ(IFeed0VVManagerService.class);
                if (iFeed0VVManagerService != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Mob.Event.LOGIN_SUBMIT_");
                    sbLIZ.append(strLIZ);
                    C2188811AlT.LIZIZ(sbLIZ);
                    iFeed0VVManagerService.LIZIZ();
                    iFeed0VVManagerService.LIZJ("LOGIN");
                }
                Intent intent = new Intent(this.LLILZ, C0TT5.LIZ());
                Bundle bundle = this.LLILZIL;
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
                intent.putExtra("platform", strLIZ);
                intent.putExtra("enter_from", this.LLILZLL);
                intent.putExtra("enter_method", this.LLIZ);
                intent.putExtra("enter_type", this.LLIZLLLIL);
                intent.putExtra("login_panel_type", this.LLJ);
                Activity activity = this.LLILZ;
                if (activity != null) {
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Activity_startActivityForResult_2");
                    C1701330uNH.LIZ(intent, activity);
                    C2204961BRm.LJIIZILJ(1001, activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk4KJ0g7ZnSameGHdKBErJLdHaNg==", null));
                }
                String str2 = this.LLILZLL;
                String str3 = this.LLIZ;
                C0XGR c0xgr = new C0XGR();
                c0xgr.LIZLLL("enter_method", str3);
                c0xgr.LIZLLL("enter_from", str2);
                c0xgr.LIZLLL("platform", strLIZ);
                c0xgr.LIZ(1, "_perf_monitor");
                C20684815ws.LJIILLIIL("login_choose_platform", c0xgr.LIZ);
                return null;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1233040iBy c1233040iBy = new C1233040iBy(getContext());
        c1233040iBy.LIZIZ(2131837962);
        c1233040iBy.LIZLLL();
        return null;
    }

    @Override // X.InterfaceC1238290iKR
    public final void LLJJ(int i) {
        if (i == 11 && !this.LLJILJILJ) {
            try {
                dismiss();
                C785410UrT.LIZ(this);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public AbstractDialogC1239060iLg(Activity activity, Bundle bundle) {
        super(activity, R.style.a_a);
        this.LLILZ = activity;
        this.LLILZIL = bundle;
        LJJLJ();
        if (bundle != null) {
            this.LLILZLL = bundle.getString("enter_from");
            this.LLIZ = bundle.getString("enter_method");
            this.LLIZLLLIL = bundle.getString("enter_type");
            this.LLJ = bundle.getString("login_panel_type");
            this.LLJI = bundle.getString("channel");
        }
    }
}
