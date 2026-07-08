package X;

import Y.ACListenerS118S0200000_15;
import android.content.Context;
import android.util.AttributeSet;
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

/* JADX INFO: renamed from: X.0bPD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C972170bPD extends ConstraintLayout implements InterfaceC964220bCO {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public User LLILZ;

    @Override // X.InterfaceC964220bCO
    public void setSwitchTargetClick(Function0<Unit> function0) {
    }

    private final C19R6 getIvReceiverAvatar() {
        return (C19R6) this.LL.getValue();
    }

    private final C20743416Fc getTvHostTag() {
        return (C20743416Fc) this.LLILLL.getValue();
    }

    private final C429470Gsj getTvReceiverName() {
        return (C429470Gsj) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC964220bCO
    public final void LJLJI(AbstractC964230bCP abstractC964230bCP) {
        List urls;
        int i = 8;
        if (abstractC964230bCP instanceof C964240bCQ) {
            this.LLILZ = null;
            int visibility = getVisibility();
            setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, this);
            return;
        }
        if (abstractC964230bCP instanceof C964210bCN) {
            C964210bCN c964210bCN = (C964210bCN) abstractC964230bCP;
            User user = c964210bCN.LIZ;
            this.LLILZ = user;
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
            int visibility2 = getVisibility();
            setVisibility(0);
            C1602160rnK.LIZIZ(visibility2, 0, this);
            return;
        }
        if (abstractC964230bCP instanceof C964200bCM) {
            int visibility3 = getVisibility();
            setVisibility(8);
            C1602160rnK.LIZIZ(visibility3, 8, this);
            return;
        }
        throw new C1954807lC();
    }

    @Override // X.InterfaceC964220bCO
    public void setUserProfileClick(Function1<? super User, Unit> function1) {
        C786410Ut5.G8(getTvReceiverName(), new ACListenerS118S0200000_15(function1, this, 50));
        C786410Ut5.J8(getIvReceiverAvatar(), new ACListenerS118S0200000_15(function1, this, 51));
    }

    public C972170bPD(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 961));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS559S0100000_15(this, 963));
        this.LLILLL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 962));
        ViewGroup.inflate(context, R.layout.gfr, this);
    }
}
