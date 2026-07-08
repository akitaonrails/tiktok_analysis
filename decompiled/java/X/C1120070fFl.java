package X;

import Y.ACListenerS152S0100000_17;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0fFl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120070fFl extends FrameLayout implements InterfaceC964220bCO {
    public final C01GW LL;
    public final C01GW LLILLJJLI;

    @Override // X.InterfaceC964220bCO
    public final void LJLJI(AbstractC964230bCP abstractC964230bCP) {
    }

    private final View getBtnChangeReceiver() {
        return (View) this.LL.getValue();
    }

    public final C16F5 getSendForView() {
        return (C16F5) this.LLILLJJLI.getValue();
    }

    public final void setReceiver(C1120080fFm c1120080fFm) {
        int iIntValue;
        String strLJIJJ = C497740JfY.LJIJJ(2131852655, c1120080fFm.LIZIZ);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strLJIJJ);
        String str = c1120080fFm.LIZIZ;
        int iLJJJ = a0.LJJJ(strLJIJJ, str, 0, false, 6);
        if (iLJJJ < 0) {
            Map<String, Object> map = C1338270kvh.LIZ;
        } else {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.eyv, getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(iIntValue), iLJJJ, str.length() + iLJJJ, 33);
            C786410Ut5.q2(spannableStringBuilder, new C444930HcZ(C1119920fFW.LIZJ(TypedValue.applyDimension(2, 13, C786410Ut5.N3(C497740JfY.LJII()).getResources().getDisplayMetrics()), 500, getContext())), iLJJJ, str.length() + iLJJJ, 33);
        }
        ImageModel imageModel = c1120080fFm.LIZJ;
        AwS418S0200000_17 awS418S0200000_17 = new AwS418S0200000_17(this, spannableStringBuilder, 17);
        int iLJJJ2 = a0.LJJJ(strLJIJJ, "{avatar}", 0, false, 6);
        if (iLJJJ2 < 0) {
            Map<String, Object> map2 = C1338270kvh.LIZ;
            return;
        }
        Resources resources = getContext().getResources();
        if (resources == null) {
            return;
        }
        final C1120050fFj c1120050fFj = new C1120050fFj(resources, spannableStringBuilder, iLJJJ2, awS418S0200000_17);
        ((IHostFrescoHelper) C1161920gLG.LIZJ(IHostFrescoHelper.class)).xW1(imageModel, new InterfaceC177000m8() { // from class: X.0fFk
            @Override // X.InterfaceC177000m8
            public final void LIZ(Bitmap bitmap) {
                if (bitmap != null) {
                    Bitmap.Config config = bitmap.getConfig();
                    if (bitmap != null && !bitmap.isRecycled() && config != null) {
                        c1120050fFj.invoke(bitmap.copy(config, true));
                    }
                }
            }
        });
    }

    @Override // X.InterfaceC964220bCO
    public void setSwitchTargetClick(Function0<Unit> function0) {
        C786410Ut5.I7(new ACListenerS152S0100000_17(function0, 54), getBtnChangeReceiver());
    }

    @Override // X.InterfaceC964220bCO
    public void setUserProfileClick(Function1<? super User, Unit> function1) {
        C786410Ut5.l8(getSendForView(), new ACListenerS152S0100000_17(function1, 55));
    }

    public C1120070fFl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 353));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS561S0100000_17(this, 354));
        FrameLayout.inflate(context, R.layout.go_, this);
    }
}
