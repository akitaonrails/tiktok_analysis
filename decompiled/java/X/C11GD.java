package X;

import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.11GD, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11GD extends DialogC1389100mFg {
    public final boolean LLJILJIL;
    public final String LLJILJILJ;
    public final C11GG LLJILLL;
    public final Long LLJJ;
    public final String LLJJI;
    public final String LLJJIII;
    public View LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public TuxIconView LLJJIJIL;
    public C0I7D LLJJJ;
    public TuxTextView LLJJJIL;
    public C197039127h LLJJJJ;
    public BottomSheetBehavior<View> LLJJJJJIL;
    public String LLJJJJLIIL;
    public String LLJJL;
    public final ACListenerS163S0100000_29 LLJJLIIIJLLLLLLLZ;

    @Override // X.DialogC19728412Gs, android.app.Dialog
    public final void show() {
        Object obj;
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytZpuAzycnpn1gnMaoLhqnxjKgkq6DR72TgzPDsHMMqTe/emE0PpL+SMejyIMp", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/google/android/material/bottomsheet/BottomSheetDialog", "show", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "com/google/android/material/bottomsheet/BottomSheetDialog", "show", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            DialogC19728412Gs dialogC19728412Gs = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (DialogC19728412Gs) obj;
            super.show();
            c0wst.LIZ(300000, "com/google/android/material/bottomsheet/BottomSheetDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
        }
        C0I7D c0i7d = this.LLJJJ;
        if (c0i7d != null) {
            c0i7d.setFocusable(true);
            c0i7d.setFocusableInTouchMode(true);
            c0i7d.requestFocus();
            KeyboardUtils.LIZJ(c0i7d);
        }
        if (this.LLJILJIL) {
            C505201xy c505201xy = C505201xy.LIZ;
            C19660411w2.LIZ.getClass();
            String str = C19660411w2.LJ;
            Long l = this.LLJJ;
            String str2 = this.LLJJI;
            String str3 = this.LLJJIII;
            c505201xy.getClass();
            C505201xy.LIZIZ(l, "show", str, str2, str3);
        }
    }

    @Override // X.C19GU, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        if (this.LLJILJIL) {
            C505201xy c505201xy = C505201xy.LIZ;
            String str = this.LLJJL;
            C19660411w2.LIZ.getClass();
            String str2 = C19660411w2.LJ;
            Long l = this.LLJJ;
            String str3 = this.LLJJI;
            String str4 = this.LLJJIII;
            c505201xy.getClass();
            C505201xy.LIZIZ(l, str, str2, str3, str4);
        }
        this.LLJJJJLIIL = "";
    }

    @Override // X.DialogC1389100mFg, X.C19EK, android.app.Dialog
    public final void onStart() {
        super.onStart();
        final View viewFindViewById = findViewById(R.id.fpl);
        if (viewFindViewById != null) {
            viewFindViewById.setBackground(null);
        }
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: X.11GE
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                BottomSheetBehavior<View> bottomSheetBehaviorFrom;
                C11GD c11gd = this.LL;
                View view = viewFindViewById;
                if (view != null) {
                    bottomSheetBehaviorFrom = BottomSheetBehavior.from(view);
                } else {
                    bottomSheetBehaviorFrom = null;
                }
                c11gd.LLJJJJJIL = bottomSheetBehaviorFrom;
                BottomSheetBehavior<View> bottomSheetBehavior = this.LL.LLJJJJJIL;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.setHideable(false);
                }
            }
        });
    }

    @Override // X.DialogC1389100mFg, X.C19GU, X.C19EK, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        try {
            Window window = getWindow();
            if (window != null) {
                window.addFlags(Integer.MIN_VALUE);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LJ(e.getMessage());
        }
        super.onCreate(bundle);
        if (this.LLJILJIL) {
            i = R.layout.b4m;
        } else {
            i = R.layout.bam;
        }
        setContentView(i);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setStatusBarColor(0);
        }
        this.LLJJIJI = findViewById(R.id.q1v);
        this.LLJJIJIIJIL = (TuxTextView) findViewById(R.id.tv_title);
        this.LLJJIJIL = (TuxIconView) findViewById(R.id.jzi);
        this.LLJJJ = (C0I7D) findViewById(R.id.pv5);
        this.LLJJJIL = (TuxTextView) findViewById(R.id.evp);
        this.LLJJJJ = (C197039127h) findViewById(R.id.cpn);
        TuxIconView tuxIconView = this.LLJJIJIL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, this.LLJJLIIIJLLLLLLLZ);
        }
        C197039127h c197039127h = this.LLJJJJ;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, this.LLJJLIIIJLLLLLLLZ);
        }
        C197039127h c197039127h2 = this.LLJJJJ;
        if (c197039127h2 != null) {
            c197039127h2.setEnabled(false);
            c197039127h2.setClickable(false);
        }
        TuxTextView tuxTextView = this.LLJJIJIIJIL;
        if (tuxTextView != null) {
            tuxTextView.setText(2131836154);
        }
        TuxTextView tuxTextView2 = this.LLJJJIL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText("0/200");
        }
        C0I7D c0i7d = this.LLJJJ;
        if (c0i7d != null) {
            c0i7d.addTextChangedListener(new C786120Usc(this, 1));
        }
        C0I7D c0i7d2 = this.LLJJJ;
        if (c0i7d2 != null) {
            c0i7d2.setText(this.LLJILJILJ);
        }
    }

    public C11GD(Context context, boolean z, String str, C11GG c11gg, Long l, String str2, String str3) {
        super(context, R.style.ab7);
        this.LLJILJIL = z;
        this.LLJILJILJ = str;
        this.LLJILLL = c11gg;
        this.LLJJ = l;
        this.LLJJI = str2;
        this.LLJJIII = str3;
        this.LLJJL = "click";
        this.LLJJLIIIJLLLLLLLZ = new ACListenerS163S0100000_29(this, 9);
    }
}
