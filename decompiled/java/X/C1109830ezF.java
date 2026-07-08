package X;

import Y.ARunnableS22S1100000_17;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.publicscreen.impl.setting.LivePublicScreenPinOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAnchorTextFontWeightSetting;
import com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAudienceTextFontWeightSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS135S0110000_17;
import kotlin.jvm.internal.AwS418S0200000_17;

/* JADX INFO: renamed from: X.0ezF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1109830ezF extends AbstractC1109880ezK<C1110310f01, C1109610eyt<C1110310f01>> {
    public final AbstractC1114210f6J LLJLIL;
    public final C01GW LLJLILLLLZIIL;

    @Override // X.AbstractC1109880ezK
    public final Drawable h6() {
        if (this.LLJJIJIIJIL) {
            return null;
        }
        return C800330VaR.LIZIZ(this.itemView.getContext(), LivePublicScreenPinOptimizeSetting.INSTANCE.isEnabled() ? R.drawable.e2g : R.drawable.e2f);
    }

    @Override // X.AbstractC1109720ez4
    public final void I5(boolean z) {
        if (LivePublicScreenPinOptimizeSetting.INSTANCE.isEnabled() && !this.LLJJIJIIJIL) {
            C786410Ut5.LJZI(8, this.LLJJIJI);
            ((C1109810ezD) this.LLJLILLLLZIIL.getValue()).LJIIIZ = this.LLJJJIL.getSuffix();
            C1109810ezD c1109810ezD = (C1109810ezD) this.LLJLILLLLZIIL.getValue();
            C500260Jjc.LJIILIIL(c1109810ezD.LIZJ);
            c1109810ezD.LIZIZ.setMeasureListener(new AwS135S0110000_17(c1109810ezD, z, 0));
            return;
        }
        super.I5(z);
    }

    @Override // X.AbstractC1109840ezG
    public final void e6(String str) {
        if (LivePublicScreenPinOptimizeSetting.INSTANCE.isEnabled() && !this.LLJJIJIIJIL) {
            C434330H1j c434330H1j = C434330H1j.LIZ;
            View view = this.itemView;
            c434330H1j.getClass();
            TextView textView = (TextView) view.findViewById(R.id.qgb);
            if (textView != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('s');
                textView.setText(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            return;
        }
        super.e6(str);
    }

    @Override // X.AbstractC1109880ezK, X.AbstractC1109840ezG
    /* JADX INFO: renamed from: z6, reason: merged with bridge method [inline-methods] */
    public final void f6(C1109610eyt<C1110310f01> c1109610eyt) {
        boolean z;
        CharSequence charSequenceLLJLL;
        String string;
        super.f6(c1109610eyt);
        if (LivePublicScreenPinOptimizeSetting.INSTANCE.isEnabled() && !this.LLJJIJIIJIL) {
            C434330H1j c434330H1j = C434330H1j.LIZ;
            View view = this.itemView;
            c434330H1j.getClass();
            View viewFindViewById = view.findViewById(R.id.m4t);
            View viewFindViewById2 = view.findViewById(R.id.qgu);
            ImageView imageView = (ImageView) view.findViewById(R.id.qgv);
            TextView textView = (TextView) view.findViewById(R.id.qgb);
            C1109020exw c1109020exw = c1109610eyt.LJIIIZ;
            if (c1109020exw.LIZJ) {
                C500260Jjc.LJIILIIL(viewFindViewById2);
                C500260Jjc.LLFFF(viewFindViewById);
            } else {
                C500260Jjc.LJIILIIL(viewFindViewById);
                C500260Jjc.LLFFF(viewFindViewById2);
                C434330H1j.LIZIZ(view, imageView);
                if (c1109020exw.LJ && c1109020exw.LIZ() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                C434330H1j.LIZ(c1109020exw.LIZ(), textView, z);
            }
            AbstractC1110520f0M abstractC1110520f0M = this.LLJ;
            if (abstractC1110520f0M != null && (charSequenceLLJLL = abstractC1110520f0M.LLJLL()) != null && (string = charSequenceLLJLL.toString()) != null) {
                HandlerHook.viewPost(this.itemView, new ARunnableS22S1100000_17(this, string, 1));
            }
        }
    }

    @Override // X.AbstractC1109880ezK, X.AbstractC1109840ezG, X.AbstractC1109720ez4
    public final void T5(C1109600eys c1109600eys, List list) {
        AbstractC1110520f0M abstractC1110520f0M;
        CharSequence charSequenceLLJLL;
        String string;
        super.T5(c1109600eys, list);
        if (LivePublicScreenPinOptimizeSetting.INSTANCE.isEnabled() && !this.LLJJIJIIJIL && (abstractC1110520f0M = this.LLJ) != null && (charSequenceLLJLL = abstractC1110520f0M.LLJLL()) != null && (string = charSequenceLLJLL.toString()) != null) {
            HandlerHook.viewPost(this.itemView, new ARunnableS22S1100000_17(this, string, 0));
        }
    }

    @Override // X.AbstractC1109880ezK
    public final boolean v6(C1109600eys c1109600eys, List list) {
        C1109610eyt<C1110310f01> c1109610eyt = (C1109610eyt) c1109600eys;
        boolean z = false;
        for (Object obj : list) {
            if ((obj instanceof C1109700ez2) && c1109610eyt.LJIIL) {
                z = true;
            }
            if ((obj instanceof C1109710ez3) && c1109610eyt.LJIIL) {
                f6(c1109610eyt);
                z = true;
            }
        }
        return z;
    }

    public C1109830ezF(View view, C1109770ez9 c1109770ez9, boolean z) {
        int value;
        super(view, c1109770ez9, z);
        this.LLJLIL = (AbstractC1114210f6J) view.findViewById(R.id.p0n);
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS418S0200000_17(view, this, 2));
        this.LLJLILLLLZIIL = c01gwLIZIZ;
        this.LLJJJIL.setTextDirection(5);
        C1110060ezc c1110060ezc = this.LLJJJIL;
        ViewGroup.LayoutParams layoutParams = c1110060ezc.getLayoutParams();
        if (layoutParams != null) {
            C19ME c19me = (C19ME) layoutParams;
            c19me.matchConstraintDefaultWidth = 1;
            C786410Ut5.W5(c1110060ezc, c19me);
            if (!z) {
                C1109770ez9 c1109770ez92 = this.LL;
                if (c1109770ez92 != null && c1109770ez92.LIZLLL) {
                    if (c1109770ez92.LJI) {
                        value = LivePublicScreenUiConfigAnchorTextFontWeightSetting.INSTANCE.getValue();
                    } else {
                        value = LivePublicScreenUiConfigAudienceTextFontWeightSetting.INSTANCE.getValue();
                    }
                    if (value > 0) {
                        this.LLJJJIL.setFontWeight(value);
                    }
                }
                if (LivePublicScreenPinOptimizeSetting.INSTANCE.isEnabled()) {
                    Drawable drawableH6 = h6();
                    View viewFindViewById = view.findViewById(R.id.qg1);
                    if (viewFindViewById != null) {
                        viewFindViewById.setBackground(drawableH6);
                        view.setBackground(null);
                    }
                    ((C1109810ezD) c01gwLIZIZ.getValue()).LIZIZ();
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }
}
