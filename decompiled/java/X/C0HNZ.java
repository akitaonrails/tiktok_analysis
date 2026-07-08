package X;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.List;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0HNZ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HNZ extends LinearLayout {
    public final C0HNS LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;

    private final ViewOnAttachStateChangeListenerC20604515jv getElementViewList() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLILZ.getValue();
    }

    private final FrameLayout getMixIdView() {
        return (FrameLayout) this.LLILLJJLI.getValue();
    }

    public final C427870Gq9 getIdImageView() {
        return (C427870Gq9) this.LLILLL.getValue();
    }

    public C0HNZ(Context context) {
        C0HNS c0hns = new C0HNS();
        super(context, null, 0);
        this.LL = c0hns;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS407S0200000_6(context, this, 98));
        this.LLILLL = C452501pT.LIZIZ(new AwS550S0100000_6(context, 1453));
        this.LLILZ = C452501pT.LIZIZ(new AwS407S0200000_6(context, this, 97));
        addView(getMixIdView());
        addView(getElementViewList());
        setOrientation(0);
        setGravity(16);
    }

    public final void setElement(List<? extends C0H6M> list) {
        getElementViewList().getState().LJFF(null);
        for (C0H6M c0h6m : list) {
            if (c0h6m != null) {
                C20600815jK.LIZJ(getElementViewList().getState(), new C0HNR(c0h6m, this.LL));
            }
        }
    }

    public final void setId(InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb) {
        String str;
        C0HOM<? extends Object> value = interfaceC440230HOb.getState().getValue();
        if (value instanceof C1372405Ys) {
            C440440HOw c440440HOw = (C440440HOw) C13LP.LJJJLL((List) ((C1372405Ys) value).LIZIZ);
            if (c440440HOw != null) {
                str = c440440HOw.LIZ;
            } else {
                str = null;
            }
            C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse(str));
            c1331670kl3LJI.LJJ(getIdImageView());
            C786410Ut5.h3(c1331670kl3LJI);
        }
    }
}
