package com.bytedance.android.live.design.view.sheet;

import X.AbstractC20485115Dt;
import X.C1602160rnK;
import X.C16HB;
import X.C415690GRr;
import X.C786410Ut5;
import Y.ACListenerS165S0100000_31;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes32.dex */
public class LiveBaseSheetDialog extends LiveBottomSheetDialog {
    public static final /* synthetic */ int LLJLIL = 0;
    public View LLJJJIL;
    public View LLJJJJ;
    public TextView LLJJJJJIL;
    public C415690GRr LLJJJJLIIL;
    public CharSequence LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;

    public LiveBaseSheetDialog() {
        throw null;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, com.bytedance.android.live.design.app.LifecycleAwareDialog, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJLILLLLZI() {
        setTitle(this.LLJJL);
        boolean z = this.LLJJLIIIJLLLLLLLZ;
        this.LLJJLIIIJLLLLLLLZ = z;
        View view = this.LLJJJJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(z ? 0 : 8, view);
        }
    }

    public LiveBaseSheetDialog(Context context) {
        super(context);
        this.LLJL = true;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, X.C19GU, X.C19EK, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, X.C19GU, X.C19EK, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(LJLJI(null, i, new ViewGroup.LayoutParams(-1, -1)));
        LJLILLLLZI();
    }

    @Override // X.C19GU, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        this.LLJJL = charSequence;
        TextView textView = this.LLJJJJJIL;
        if (textView != null) {
            textView.setText(charSequence);
            if (TextUtils.isEmpty(charSequence)) {
                C786410Ut5.LJLLLLLL(8, this.LLJJJIL);
            } else {
                C786410Ut5.LJLLLLLL(0, this.LLJJJIL);
            }
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, X.C19GU, X.C19EK, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(LJLJI(view, 0, new ViewGroup.LayoutParams(-1, -1)));
        LJLILLLLZI();
    }

    @Override // X.C19GU, android.app.Dialog
    public void setTitle(int i) {
        setTitle(getContext().getResources().getString(i));
    }

    public LiveBaseSheetDialog(Context context, int i) {
        super(context, i);
        this.LLJL = true;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, X.C19GU, X.C19EK, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(LJLJI(view, 0, layoutParams));
        LJLILLLLZI();
    }

    public final View LJLJI(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int i2;
        View viewSd = C786410Ut5.Sd(R.layout.dec, C786410Ut5.ne(getContext()), null);
        this.LLJJJIL = viewSd.findViewById(R.id.v4i);
        View viewFindViewById = viewSd.findViewById(R.id.v4j);
        this.LLJJJJ = viewFindViewById;
        C786410Ut5.I7(new ACListenerS165S0100000_31(this, 206), viewFindViewById);
        this.LLJJJJJIL = (TextView) viewSd.findViewById(R.id.v4k);
        C415690GRr c415690GRr = (C415690GRr) viewSd.findViewById(R.id.v4h);
        this.LLJJJJLIIL = c415690GRr;
        boolean z = this.LLJL;
        this.LLJL = z;
        if (c415690GRr != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            int visibility = c415690GRr.getVisibility();
            c415690GRr.setVisibility(i2);
            C1602160rnK.LIZIZ(visibility, i2, c415690GRr);
        }
        ViewGroup viewGroup = (ViewGroup) viewSd.findViewById(R.id.v48);
        if (view == null && i != 0) {
            view = C786410Ut5.Td(getLayoutInflater(), i, viewGroup, false);
        }
        if (layoutParams == null) {
            viewGroup.addView(view, -1, -1);
        } else {
            viewGroup.addView(view, layoutParams);
        }
        this.LLJJJJLIIL.addOnLayoutChangeListener(new C16HB(this, 0));
        if (this.LLJILJIL == null) {
            LJLIIL();
        }
        this.LLJILJIL.LIZ(new AbstractC20485115Dt() { // from class: X.16BQ
            @Override // X.AbstractC20485115Dt
            public final void LIZIZ(int i3) {
            }

            @Override // X.AbstractC20485115Dt
            public final void LIZ(float f) {
                this.LIZ.LLJJJJLIIL.setOffset(Math.max(f, 0.0f));
            }
        });
        return viewSd;
    }
}
