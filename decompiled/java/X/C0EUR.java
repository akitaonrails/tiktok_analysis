package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EUR, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EUR extends C0FC9<C0EUM, C0EUT> {
    public final Activity LLJJJJJIL;
    public LinearLayout LLJJJJLIIL;
    public ConstraintLayout LLJJL;
    public FrameLayout LLJJLIIIJLLLLLLLZ;
    public RecyclerView LLJL;
    public C365350EUb LLJLIL;
    public C367060EaG LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public C1390410mHn LLJLLIL;
    public C197039127h LLJLLL;
    public TuxIconView LLJZ;
    public final C01GW LLJZIJLIL;
    public C0EFU LLL;

    public final C0EF4 LLLLLJLJLL() {
        return (C0EF4) this.LLJZIJLIL.getValue();
    }

    public final TuxIconView LLLLLL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.ai4);
            this.LLJZ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final RecyclerView LLLLLLIL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.h91);
            this.LLJL = (RecyclerView) callbackFindViewById;
        }
        return (RecyclerView) callbackFindViewById;
    }

    public final LinearLayout LLLLLLJ() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJJJJLIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.ai6);
            this.LLJJJJLIIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final C367060EaG LLLLLLL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJLILLLLZIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.h92);
            this.LLJLILLLLZIIL = (C367060EaG) callbackFindViewById;
        }
        return (C367060EaG) callbackFindViewById;
    }

    public final C365350EUb LLLLLLLLL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.h93);
            this.LLJLIL = (C365350EUb) callbackFindViewById;
        }
        return (C365350EUb) callbackFindViewById;
    }

    public final TuxTextView LLLLLLLLLL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.h94);
            this.LLJLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final FrameLayout LLLLLLLZIL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.h8r);
            this.LLJJLIIIJLLLLLLLZ = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final C1390410mHn LLLLLLZ() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.h8z);
            this.LLJLLIL = (C1390410mHn) callbackFindViewById;
        }
        return (C1390410mHn) callbackFindViewById;
    }

    public final C197039127h LLLLLLZZ() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJLLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.h90);
            this.LLJLLL = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public C0EUR(C1DRG c1drg, Activity activity) {
        super(c1drg);
        this.LLJJJJJIL = activity;
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 437));
    }

    public static final void LLLLLZ(View view, boolean z) {
        if (view == null) {
            return;
        }
        if (z) {
            C786410Ut5.T4(view, 1.0f);
            view.setOnTouchListener(null);
        } else {
            C786410Ut5.T4(view, 0.36f);
            view.setOnTouchListener(new View.OnTouchListener() { // from class: X.0EUa
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return true;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0221 A[PHI: r2
      0x0221: PHI (r2v4 android.view.View) = (r2v3 android.view.View), (r2v33 android.view.View) binds: [B:59:0x0214, B:61:0x021f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
            Method dump skipped, instruction units count: 1146
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EUR.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (C357780E0y.LIZ()) {
            return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.byx, viewGroup, false);
        }
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.byw, viewGroup, false);
    }
}
