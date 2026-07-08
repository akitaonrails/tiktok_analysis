package X;

import Y.ARunnableS17S0101000_6;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.poi.detail.map.cell.PoiChipCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS235S0000000_6;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: renamed from: X.0H4Y, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H4Y extends ConstraintLayout {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final C166U LL;
    public boolean LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0H4Y.class, "viewBinding", "getViewBinding()Lcom/ss/android/ugc/tiktok/poi/databinding/PoiChipsLayoutBinding;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final C435020H4a getViewBinding() {
        C166U c166u = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
        return (C435020H4a) c166u.LIZ(this);
    }

    public final void h0() {
        C0H4U c0h4u;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = getViewBinding().LLILLJJLI;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : (ArrayList) viewOnAttachStateChangeListenerC20604515jv.getState().LJII()) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj;
            if ((interfaceC1891350zJl instanceof C0H4U) && (c0h4u = (C0H4U) interfaceC1891350zJl) != null) {
                arrayList.add(C0H4U.LIZ(c0h4u, false));
            }
            i = i2;
        }
        viewOnAttachStateChangeListenerC20604515jv.getState().LJIILL(arrayList, null);
    }

    public final void e0(List<C0H4Z> list) {
        ArrayList arrayList = new ArrayList();
        for (C0H4Z c0h4z : (ArrayList) list) {
            arrayList.add(new C0H4U(c0h4z.LIZ, c0h4z.LIZIZ, c0h4z.LIZJ, c0h4z.LIZLLL, c0h4z.LJFF, c0h4z.LJI, c0h4z.LJII, c0h4z.LJIIIIZZ, c0h4z.LJIIIZ, c0h4z, new AwS620S0100000_6(this, 46)));
        }
        getViewBinding().LLILLJJLI.getState().LJIILL(arrayList, null);
    }

    public final void setEnableSelect(boolean z) {
        this.LLILLJJLI = z;
    }

    public final void setSelectedChip(int i) {
        C0H4U c0h4u;
        C0H4U c0h4uLIZ;
        if (this.LLILLJJLI) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = getViewBinding().LLILLJJLI;
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (Object obj : (ArrayList) viewOnAttachStateChangeListenerC20604515jv.getState().LJII()) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj;
                    if ((interfaceC1891350zJl instanceof C0H4U) && (c0h4u = (C0H4U) interfaceC1891350zJl) != null) {
                        if (i == i2) {
                            c0h4uLIZ = C0H4U.LIZ(c0h4u, true);
                        } else {
                            c0h4uLIZ = C0H4U.LIZ(c0h4u, false);
                        }
                        arrayList.add(c0h4uLIZ);
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            viewOnAttachStateChangeListenerC20604515jv.getState().LJIILL(arrayList, null);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("scrollToPositionEnd from=");
            sbLIZ.append("setSelect");
            C2188811AlT.LIZIZ(sbLIZ);
            HandlerHook.viewPost(this, new ARunnableS17S0101000_6(i, this, 13));
        }
    }

    public C0H4Y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = new C166U(new AwS235S0000000_6(1));
        C786410Ut5.Sd(R.layout.dyr, C786410Ut5.ne(context), this);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = getViewBinding().LLILLJJLI;
        viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(PoiChipCell.class);
        viewOnAttachStateChangeListenerC20604515jv.setOrientation(0);
        viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C0IDG(5));
    }
}
