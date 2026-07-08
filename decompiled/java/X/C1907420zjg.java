package X;

import Y.ACListenerS92S0300000_28;
import Y.ARunnableS86S0200000_17;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0zjg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1907420zjg extends LinearLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final int LLILZIL;
    public final AwS596S0100000_17 LLILZLL;

    private final C424620Gku getChannelIcon() {
        return (C424620Gku) this.LL.getValue();
    }

    private final TuxTextView getChannelName() {
        return (TuxTextView) this.LLILLJJLI.getValue();
    }

    private final C426770GoN getUnreadRot() {
        return (C426770GoN) this.LLILLL.getValue();
    }

    public final TuxIconView getMoreOperation() {
        return (TuxIconView) this.LLILZ.getValue();
    }

    public final void LIZJ() {
        C426770GoN unreadRot = getUnreadRot();
        if (unreadRot != null) {
            C786410Ut5.LLLLLLIL(unreadRot, 8);
        }
    }

    public final void LIZLLL() {
        Object parent = getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            while (true) {
                if (view != null) {
                    if (view.getId() != R.id.ww7) {
                        Object parent2 = view.getParent();
                        if (!(parent2 instanceof View)) {
                            break;
                        } else {
                            view = (View) parent2;
                        }
                    } else {
                        view.setTouchDelegate(null);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        TuxTextView channelName = getChannelName();
        if (channelName != null) {
            channelName.setText("");
        }
        C426770GoN unreadRot = getUnreadRot();
        if (unreadRot != null) {
            C786410Ut5.LLLLLLIL(unreadRot, 8);
        }
        TuxIconView moreOperation = getMoreOperation();
        if (moreOperation != null) {
            C786410Ut5.LLLLLLZZ(moreOperation, 8);
        }
        TuxIconView moreOperation2 = getMoreOperation();
        if (moreOperation2 != null) {
            C786410Ut5.a9(moreOperation2, null);
        }
    }

    public C1907420zjg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 687));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 688));
        this.LLILLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 690));
        this.LLILZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 689));
        this.LLILZIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        this.LLILZLL = new AwS596S0100000_17(this, 312);
        setOrientation(0);
        setGravity(16);
        LinearLayout.inflate(context, R.layout.abq, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C1246520iXi r9, java.util.List<X.C443090HZb> r10) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1907420zjg.LIZ(X.0iXi, java.util.List):void");
    }

    public final void LIZIZ(C1246520iXi c1246520iXi, List<C443090HZb> list) {
        TuxIconView moreOperation;
        ViewGroup.LayoutParams layoutParams;
        if (list.isEmpty()) {
            TuxIconView moreOperation2 = getMoreOperation();
            if (moreOperation2 != null) {
                C786410Ut5.LLLLLLZZ(moreOperation2, 8);
                return;
            }
            return;
        }
        if (C635610OwR.LIZ() && (moreOperation = getMoreOperation()) != null && (layoutParams = moreOperation.getLayoutParams()) != null) {
            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            C786410Ut5.M6(moreOperation, layoutParams);
        }
        TuxIconView moreOperation3 = getMoreOperation();
        if (moreOperation3 != null) {
            C786410Ut5.LLLLLLZZ(moreOperation3, 0);
        }
        TuxIconView moreOperation4 = getMoreOperation();
        if (moreOperation4 != null) {
            C786410Ut5.a9(moreOperation4, new ACListenerS92S0300000_28(this, list, c1246520iXi, 1));
        }
        TuxIconView moreOperation5 = getMoreOperation();
        if (moreOperation5 != null) {
            HandlerHook.viewPost(moreOperation5, new ARunnableS86S0200000_17(this, moreOperation5, 31));
        }
    }
}
