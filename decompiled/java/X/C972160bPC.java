package X;

import Y.ACListenerS118S0200000_15;
import Y.ACListenerS150S0100000_15;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS559S0100000_15;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0bPC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C972160bPC extends ConstraintLayout implements InterfaceC964220bCO {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public User LLILZIL;

    private final View getBtnSwitchReceiver() {
        return (View) this.LL.getValue();
    }

    private final C19R6 getIvReceiverAvatar() {
        return (C19R6) this.LLILLJJLI.getValue();
    }

    private final C20743416Fc getTvHostTag() {
        return (C20743416Fc) this.LLILZ.getValue();
    }

    private final C429470Gsj getTvReceiverName() {
        return (C429470Gsj) this.LLILLL.getValue();
    }

    @Override // X.InterfaceC964220bCO
    public final void LJLJI(AbstractC964230bCP abstractC964230bCP) {
        List urls;
        Drawable drawable = null;
        int i = 8;
        if (abstractC964230bCP instanceof C964240bCQ) {
            this.LLILZIL = null;
            int visibility = getVisibility();
            setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, this);
            return;
        }
        if (abstractC964230bCP instanceof C964210bCN) {
            C964210bCN c964210bCN = (C964210bCN) abstractC964230bCP;
            this.LLILZIL = c964210bCN.LIZ;
            int visibility2 = getVisibility();
            setVisibility(0);
            C1602160rnK.LIZIZ(visibility2, 0, this);
            C786410Ut5.LLLJIL(getIvReceiverAvatar(), 0);
            User user = this.LLILZIL;
            if (user == null) {
                return;
            }
            boolean z = c964210bCN.LIZIZ;
            ImageModel avatarThumb = user.getAvatarThumb();
            if (avatarThumb != null && (urls = avatarThumb.getUrls()) != null) {
                C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(urls);
                c1324610kZfLIZJ.LJIILIIL = Boolean.TRUE;
                c1324610kZfLIZJ.LJIIIZ = R.drawable.ela;
                c1324610kZfLIZJ.LJJI(getIvReceiverAvatar());
            }
            getTvReceiverName().setText(C0KVU.LIZ(user));
            C20743416Fc tvHostTag = getTvHostTag();
            if (z) {
                i = 0;
            }
            C786410Ut5.LLJJJJLIIL(tvHostTag, i);
            C972180bPE.LIZ(getTvReceiverName(), z);
            return;
        }
        if (abstractC964230bCP instanceof C964200bCM) {
            this.LLILZIL = null;
            int visibility3 = getVisibility();
            setVisibility(0);
            C1602160rnK.LIZIZ(visibility3, 0, this);
            C786410Ut5.LLLJIL(getIvReceiverAvatar(), 8);
            int i2 = ((C964200bCM) abstractC964230bCP).LIZ;
            C786410Ut5.LLJJJJLIIL(getTvHostTag(), 8);
            if (i2 <= 0) {
                int visibility4 = getVisibility();
                setVisibility(8);
                C1602160rnK.LIZIZ(visibility4, 8, this);
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) C497740JfY.LJIJI(2131843408));
            spannableStringBuilder.append((CharSequence) e3.h);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) " ");
            int length2 = spannableStringBuilder.length();
            Drawable drawableLIZ = C0UDZ.LIZ(R.drawable.ee2);
            if (drawableLIZ != null) {
                drawableLIZ.setBounds(0, 0, C439101nJ.LIZ(12), C439101nJ.LIZ(12));
                drawable = drawableLIZ;
            }
            C786410Ut5.q2(spannableStringBuilder, new C416760GVu(drawable), length, length2, 33);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(' ');
            sbLIZ.append(i2);
            spannableStringBuilder.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ));
            spannableStringBuilder.append((CharSequence) ")");
            getTvReceiverName().setText(spannableStringBuilder);
            C972180bPE.LIZ(getTvReceiverName(), false);
            return;
        }
        throw new C1954807lC();
    }

    @Override // X.InterfaceC964220bCO
    public void setSwitchTargetClick(Function0<Unit> function0) {
        C786410Ut5.I7(new ACListenerS150S0100000_15(function0, 233), getBtnSwitchReceiver());
    }

    @Override // X.InterfaceC964220bCO
    public void setUserProfileClick(Function1<? super User, Unit> function1) {
        C786410Ut5.G8(getTvReceiverName(), new ACListenerS118S0200000_15(function1, this, 45));
        C786410Ut5.J8(getIvReceiverAvatar(), new ACListenerS118S0200000_15(function1, this, 46));
    }

    public C972160bPC(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 888));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS559S0100000_15(this, 889));
        this.LLILLL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 891));
        this.LLILZ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 890));
        ViewGroup.inflate(context, R.layout.g34, this);
    }
}
