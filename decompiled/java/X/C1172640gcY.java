package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.KeyboardFakePopupWindow;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS15S0401000_18;

/* JADX INFO: renamed from: X.0gcY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1172640gcY extends C09AY implements Function1<C1680570tpn, InterfaceC1680560tpm> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C05P0<Integer> LLILZIL;
    public final /* synthetic */ C05P0<Boolean> LLILZLL;
    public final /* synthetic */ C05P0<Boolean> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1172640gcY(Context context, View view, int i, int i2, C05P0<Integer> c05p0, C05P0<Boolean> c05p02, C05P0<Boolean> c05p03) {
        super(1);
        this.LL = context;
        this.LLILLJJLI = view;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = c05p0;
        this.LLILZLL = c05p02;
        this.LLIZ = c05p03;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC1680560tpm invoke(C1680570tpn c1680570tpn) {
        View decorView;
        boolean z;
        Window window;
        Activity activityLIZ = C1388190mED.LIZ(this.LL);
        if (activityLIZ == null || (window = activityLIZ.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            decorView = this.LLILLJJLI;
        }
        KeyboardFakePopupWindow keyboardFakePopupWindowLIZ = C1110404Vy.LIZ().LIZ(this.LL, decorView);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("popup=");
        boolean z2 = true;
        if (keyboardFakePopupWindowLIZ != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(" anchorIsActivity=");
        if (decorView == this.LLILLJJLI) {
            z2 = false;
        }
        sbLIZ.append(z2);
        sbLIZ.append(" estimate=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" nav=");
        sbLIZ.append(this.LLILZ);
        C2188811AlT.LIZIZ(sbLIZ);
        final AwS15S0401000_18 awS15S0401000_18 = new AwS15S0401000_18(this.LLILZ, (int) this.LLILLJJLI, (View) this.LLILZIL, (C05P0<Integer>) this.LLILZLL, this.LLIZ, (C05P0<Boolean>) 2);
        if (keyboardFakePopupWindowLIZ != null) {
            final View view = this.LLILLJJLI;
            final C05P0<Boolean> c05p0 = this.LLIZ;
            keyboardFakePopupWindowLIZ.LLJ = new InterfaceC1352000lHq() { // from class: X.0gcX
                @Override // X.InterfaceC1352000lHq
                public final void LLILII() {
                    c05p0.setValue(Boolean.FALSE);
                    view.requestLayout();
                }

                @Override // X.InterfaceC1352000lHq
                public final void LLLLZI(int i) {
                    awS15S0401000_18.invoke(Integer.valueOf(i));
                }

                @Override // X.InterfaceC1352000lHq
                public final void j(int i) {
                    awS15S0401000_18.invoke(Integer.valueOf(i));
                }
            };
            keyboardFakePopupWindowLIZ.show();
        }
        return new C1208980hZA(keyboardFakePopupWindowLIZ, 0);
    }
}
