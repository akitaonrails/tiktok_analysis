package X;

import Y.AfS178S0100000_9;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0Ohw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C626620Ohw extends LinearLayout {
    public static final int LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public C11JF LLILLL;

    private final TuxTextView getEntranceText() {
        return (TuxTextView) this.LLILLJJLI.getValue();
    }

    public final TuxIconView getAvatarView() {
        return (TuxIconView) this.LL.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C11JF c11jf = this.LLILLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
    }

    public C626620Ohw(Context context, AttributeSet attributeSet) {
        int iLIZIZ;
        super(context, attributeSet, 0);
        this.LL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1665));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1666));
        C786410Ut5.Sd(R.layout.i6z, C786410Ut5.ne(context), this);
        setOrientation(0);
        setGravity(17);
        TuxTextView entranceText = getEntranceText();
        if (C497820Jfg.LIZIZ(context) > 0) {
            iLIZIZ = (int) (C497820Jfg.LIZIZ(context) * 0.7f);
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(252));
        }
        entranceText.setMaxWidth(iLIZIZ);
    }

    public final void LIZ(int i, List<? extends User> list) {
        C11JF c11jf;
        if (i != 0) {
            if (i == 1) {
                if (list != null && !list.isEmpty()) {
                    C786410Ut5.LLLLLLZZ(getAvatarView(), 0);
                    C1246110iX3 c1246110iX3 = null;
                    C2177251AIx c2177251AIx = new C2177251AIx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), 0, null, 0, 0, 0.0f, 0.0f, 0, 0, null, null, false, false, false, null, 114686);
                    Context context = getContext();
                    if (list != null) {
                        ArrayList arrayList = new ArrayList();
                        Iterator<? extends User> it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(it2.next().getAvatarThumb());
                        }
                        c1246110iX3 = new C1246110iX3(arrayList, list.size());
                    }
                    C2177241AIw c2177241AIw = new C2177241AIw(context, c1246110iX3, c2177251AIx);
                    getAvatarView().setImageBitmap(c2177241AIw.LIZ());
                    C11JF c11jf2 = this.LLILLL;
                    if (c11jf2 != null && !c11jf2.isDisposed() && (c11jf = this.LLILLL) != null) {
                        c11jf.dispose();
                    }
                    this.LLILLL = (C11JF) c2177241AIw.LIZLLL().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS178S0100000_9(this, 32));
                    return;
                }
                C786410Ut5.LLLLLLZZ(getAvatarView(), 8);
                return;
            }
            return;
        }
        C786410Ut5.LLLLLLZZ(getAvatarView(), 0);
        C786410Ut5.M6(getAvatarView(), new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18))));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_video_stack_square_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
        getAvatarView().setTuxIcon(c419910GdJ);
    }
}
