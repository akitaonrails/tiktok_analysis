package X;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS565S0100000_21;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0lkr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@InterfaceC1294060jmO
public class DialogC1369990lkr extends DialogC1370000lks {
    public final Context LLIZ;
    public final C1371590lnR LLIZLLLIL;
    public final C01GW LLJ;
    public final boolean LLJI;
    public final boolean LLJIJIL;
    public DialogInterface.OnShowListener LLJILJIL;
    public boolean LLJILJILJ;
    public final String[] LLJILLL;
    public Object LLJJ;

    public final boolean LJJZZIII() {
        InterfaceC1370110ll3 interfaceC1370110ll3 = C1370370llT.LIZ;
        return interfaceC1370110ll3 != null && interfaceC1370110ll3.LJFF(this.LLIZLLLIL.LJIJJ);
    }

    public final void LJL() {
        C19EG c19egLIZIZ;
        InterfaceC1370540llk interfaceC1370540llk = C1370370llT.LJII;
        if (interfaceC1370540llk == null || !interfaceC1370540llk.LIZ(this.LLJIJIL) || (c19egLIZIZ = C1388190mED.LIZIZ(this.LLIZ)) == null) {
            return;
        }
        InterfaceC1370540llk interfaceC1370540llk2 = C1370370llT.LJII;
        int iLJIIJJI = interfaceC1370540llk2 != null ? interfaceC1370540llk2.LJIIJJI(c19egLIZIZ) : 0;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById(R.id.v0z).getLayoutParams();
        marginLayoutParams.setMarginEnd(C1370020lku.LIZ(64.0d) + iLJIIJJI);
        View viewFindViewById = findViewById(R.id.v0z);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewFindViewById);
        viewFindViewById.setLayoutParams(marginLayoutParams);
    }

    @Override // X.DialogC19728412Gs, android.app.Dialog
    public final void show() throws Throwable {
        Object obj;
        ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
        C1369870lkf.LJII(false);
        if (C1369870lkf.LIZJ == 0) {
            C1369870lkf.LIZJ = System.currentTimeMillis();
        }
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgYo3LznzTDdwN+gOuvh5pG+paF0KpGVL1T99z", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/ss/android/ugc/aweme/share/base/ui/DirectionDialog", "show", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "com/ss/android/ugc/aweme/share/base/ui/DirectionDialog", "show", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            DialogC19728412Gs dialogC19728412Gs = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (DialogC19728412Gs) obj;
            super.show();
            c0wst.LIZ(300000, "com/ss/android/ugc/aweme/share/base/ui/DirectionDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
        }
        LJL();
    }

    @Override // X.C19GU, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        InterfaceC1370080ll0 interfaceC1370080ll0;
        super.dismiss();
        C1371590lnR c1371590lnR = this.LLIZLLLIL;
        InterfaceC1366490lfD interfaceC1366490lfD = c1371590lnR.LJJIFFI;
        if (interfaceC1366490lfD != null) {
            interfaceC1366490lfD.LJI(this.LLIZ, c1371590lnR.LJIJJ);
        }
        Object obj = this.LLJJ;
        if (obj != null && (interfaceC1370080ll0 = C1370370llT.LIZLLL) != null) {
            interfaceC1370080ll0.LIZJ(obj);
        }
        ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
        C1369870lkf.LJIL = false;
    }

    public final void LJJZZI(boolean z) {
        int i;
        boolean z2;
        WindowManager.LayoutParams attributes;
        Bundle bundle;
        String string;
        View decorView;
        View decorView2;
        View viewFindViewById = findViewById(R.id.v0z);
        boolean z3 = this.LLJIJIL;
        BaseSharePackage baseSharePackage = this.LLIZLLLIL.LJIJJ;
        Context context = getContext();
        Window window = getWindow();
        C1370740lm4 c1370740lm4LIZ = C1370730lm3.LIZ(context);
        if (c1370740lm4LIZ != null) {
            i = c1370740lm4LIZ.LIZJ;
        } else {
            i = 0;
        }
        int iLIZJ = i - C497820Jfg.LIZJ(context);
        if (window != null) {
            if (baseSharePackage != null && (bundle = baseSharePackage.extras) != null && (string = bundle.getString("enter_method")) != null && string.equals("icon") && 1 != 0) {
                if (z) {
                    C1065860dqK.LIZ(window, -1);
                    Window window2 = getWindow();
                    if (window2 != null) {
                        C1370030lkv.LIZ(window2);
                    }
                    Window window3 = getWindow();
                    if (window3 != null) {
                        window3.setStatusBarColor(0);
                    }
                    Window window4 = getWindow();
                    if (window4 != null) {
                        window4.addFlags(Integer.MIN_VALUE);
                    }
                } else {
                    if (C0H4W.LIZIZ(getContext())) {
                        window.setGravity(8388611);
                    } else {
                        window.setGravity(8388613);
                    }
                    C1065860dqK.LIZ(window, -1);
                    Window window5 = getWindow();
                    if (window5 != null && (decorView2 = window5.getDecorView()) != null) {
                        decorView2.setSystemUiVisibility(2);
                    }
                    Window window6 = getWindow();
                    if (window6 != null && (decorView = window6.getDecorView()) != null) {
                        decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: X.0lkx
                            @Override // android.view.View.OnSystemUiVisibilityChangeListener
                            public final void onSystemUiVisibilityChange(int i2) {
                                View decorView3;
                                Window window7 = this.getWindow();
                                if (window7 != null && (decorView3 = window7.getDecorView()) != null) {
                                    decorView3.setSystemUiVisibility(5894);
                                }
                            }
                        });
                    }
                }
            } else {
                if (!z || iLIZJ == 0) {
                    iLIZJ = -1;
                }
                C1065860dqK.LIZ(window, iLIZJ);
            }
            InterfaceC1370540llk interfaceC1370540llk = C1370370llT.LJII;
            if (interfaceC1370540llk != null && interfaceC1370540llk.LIZ(z3)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                window.setGravity(80);
            } else if (z) {
                final BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((View) viewFindViewById.getParent());
                Window window7 = getWindow();
                if (window7 != null && (attributes = window7.getAttributes()) != null) {
                    bottomSheetBehaviorFrom.setPeekHeight(attributes.height);
                    bottomSheetBehaviorFrom.setState(3);
                    bottomSheetBehaviorFrom.setBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.0JSZ
                        @Override // X.AbstractC1177930gl5
                        public final void LIZJ(View view, float f) {
                        }

                        @Override // X.AbstractC1177930gl5
                        public final void LIZLLL(int i2, View view) {
                            if (i2 != 4) {
                                if (i2 == 5) {
                                    this.cancel();
                                    bottomSheetBehaviorFrom.setState(4);
                                    return;
                                }
                                return;
                            }
                            this.cancel();
                        }
                    });
                }
                window.setGravity(80);
                WindowManager.LayoutParams attributes2 = window.getAttributes();
                attributes2.gravity = 80;
                window.setAttributes(attributes2);
                C786410Ut5.qe(window, R.id.fpl).setBackgroundDrawable(new ColorDrawable(0));
            } else {
                window.addFlags(67108864);
            }
            setCanceledOnTouchOutside(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x032d  */
    @Override // X.DialogC1370000lks, X.C19GU, X.C19EK, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instruction units count: 839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC1369990lkr.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Dialog
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.LLJILJIL = onShowListener;
    }

    public DialogC1369990lkr(Context context, int i, C1371590lnR c1371590lnR) {
        InterfaceC1370040lkw c1370160ll8;
        String[] strArr;
        InterfaceC1370540llk interfaceC1370540llk = C1370370llT.LJII;
        if (interfaceC1370540llk != null && interfaceC1370540llk.LIZ(c1371590lnR.LJIJJ.LJIJJ())) {
            c1370160ll8 = new C1370170ll9();
        } else if (c1371590lnR.LJIJJ.LJIILJJIL()) {
            c1370160ll8 = new C1382490m51();
        } else {
            c1370160ll8 = new C1370160ll8();
        }
        super(context, c1370160ll8, i);
        this.LLIZ = context;
        this.LLIZLLLIL = c1371590lnR;
        this.LLJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1341));
        this.LLJI = c1371590lnR.LJIJJ.LJIILJJIL();
        this.LLJIJIL = c1371590lnR.LJIJJ.LJIJJ();
        C1370100ll2.LIZ.getClass();
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            strArr = C1370100ll2.LIZIZ;
            String[] strArr2 = (String[]) settingsManagerLIZLLL.LJIIIIZZ("landscape_share_forbid_list", String[].class, strArr);
            if (strArr2 != null) {
                if (strArr2.length != 0) {
                    strArr = strArr2;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            strArr = C1370100ll2.LIZIZ;
        }
        this.LLJILLL = strArr;
    }
}
