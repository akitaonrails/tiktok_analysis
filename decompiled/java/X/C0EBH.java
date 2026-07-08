package X;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.lifecycle.Lifecycle;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EBH, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EBH extends C0FC9<C0E2U, C0EBL> {
    public C0GX9 LLJJJJJIL;
    public LinearLayout LLJJJJLIIL;
    public final C01GW LLJJL;

    public final C0GX9 LLLLLJLJLL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJJJJJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.uje);
            this.LLJJJJJIL = (C0GX9) callbackFindViewById;
        }
        return (C0GX9) callbackFindViewById;
    }

    public C0EBH(C1DRG c1drg) {
        super(c1drg);
        this.LLJJL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(215));
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C0GX9 c0gx9LLLLLJLJLL = LLLLLJLJLL();
        if ((c0gx9LLLLLJLJLL instanceof C0GX9) && c0gx9LLLLLJLJLL != null) {
            c0gx9LLLLLJLJLL.setInterceTouchEventCallBack(new AwS584S0100000_5(this, 675));
        }
        C0GX9 c0gx9LLLLLJLJLL2 = LLLLLJLJLL();
        if (c0gx9LLLLLJLJLL2 != null) {
            SeekBar.OnSeekBarChangeListener c391570FWx = new C391570FWx(this, 6);
            if (C1848410yCV.LIZ) {
                c391570FWx = new C786820Utk(c391570FWx);
            }
            c0gx9LLLLLJLJLL2.setOnSeekBarChangeListener(c391570FWx);
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0E2a
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C0E2U) obj).LIZIZ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 676));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0E2b
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C0E2U) obj).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 677));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0E2c
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0E2U) obj).LIZJ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 678));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0E2Y
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((C0E2U) obj).LIZLLL);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 672));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0E2X
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((C0E2U) obj).LJ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 673));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0E2Z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C0E2U) obj).LJFF);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 674));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (((Boolean) this.LLJJL.getValue()).booleanValue()) {
            i = R.layout.c33;
        } else {
            i = R.layout.c32;
        }
        return (ViewGroup) C786410Ut5.Td(layoutInflater, i, viewGroup, false);
    }
}
