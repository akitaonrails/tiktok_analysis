package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.04Iq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1075804Iq extends ConstraintLayout {
    public abstract C422790Ghx getIvAvatar();

    public abstract TuxIconView getIvTokoTag();

    public abstract int getLayoutResId();

    public abstract C0DJG getRsStar();

    public abstract TuxTextView getTvAspect();

    public abstract TuxTextView getTvSku();

    public abstract TuxTextView getTvUserName();

    public abstract View getVClickHotZone();

    public final void setSku(String str) {
        View viewFindViewById = findViewById(R.id.vvd);
        if (viewFindViewById != null) {
            int i = 0;
            if (str == null || a0.LJJJIL(str)) {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, viewFindViewById);
        }
        TuxTextView tvSku = getTvSku();
        if (tvSku != null) {
            C0H1U.LJIIL(tvSku, str, true);
        }
    }

    public final void setStarRate(float f) {
        C0DJG rsStar = getRsStar();
        if (rsStar != null) {
            rsStar.setRate(f);
        }
    }

    public final void setUiStyle(InterfaceC1075904Ir interfaceC1075904Ir) {
        if (Intrinsics.LJFF(null, interfaceC1075904Ir)) {
            return;
        }
        C422790Ghx ivAvatar = getIvAvatar();
        if (ivAvatar != null) {
            ViewGroup.LayoutParams layoutParams = ivAvatar.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(ivAvatar.getContext(), (AttributeSet) null);
            }
            layoutParams.width = interfaceC1075904Ir.LJIILIIL();
            layoutParams.height = interfaceC1075904Ir.LJIJI();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(ivAvatar);
            ivAvatar.setLayoutParams(layoutParams);
        }
        TuxTextView tvUserName = getTvUserName();
        if (tvUserName != null) {
            interfaceC1075904Ir.LJIJ();
            tvUserName.setTuxFont(62);
        }
        Context context = getContext();
        interfaceC1075904Ir.LJIIIIZZ();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            TuxTextView tvUserName2 = getTvUserName();
            if (tvUserName2 != null) {
                tvUserName2.setTextColor(iIntValue);
            }
        }
        Integer numLJJIFFI = interfaceC1075904Ir.LJJIFFI();
        if (numLJJIFFI != null) {
            int iIntValue2 = numLJJIFFI.intValue();
            TuxTextView tvUserName3 = getTvUserName();
            if (tvUserName3 != null) {
                C0H9H.LJFF(iIntValue2, tvUserName3);
            }
        }
        Integer numLIZ = interfaceC1075904Ir.LIZ();
        if (numLIZ != null) {
            int iIntValue3 = numLIZ.intValue();
            C0DJG rsStar = getRsStar();
            if (rsStar != null) {
                C0H9H.LJI(iIntValue3, rsStar);
            }
        }
        Integer numLIZJ2 = interfaceC1075904Ir.LIZJ();
        if (numLIZJ2 != null) {
            int iIntValue4 = numLIZJ2.intValue();
            C0DJG rsStar2 = getRsStar();
            if (rsStar2 != null) {
                C0H9H.LJFF(iIntValue4, rsStar2);
            }
        }
        C0DJG rsStar3 = getRsStar();
        if (rsStar3 != null) {
            interfaceC1075904Ir.LJJIII();
            rsStar3.setStarSize(12);
        }
        TuxTextView tvSku = getTvSku();
        if (tvSku != null) {
            tvSku.setTuxFont(interfaceC1075904Ir.LJIILJJIL());
        }
    }

    public final void setUsername(String str) {
        TuxTextView tvUserName = getTvUserName();
        if (tvUserName != null) {
            tvUserName.setText(str);
        }
    }

    public AbstractC1075804Iq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC1075804Iq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), getLayoutResId(), this, true);
    }
}
