package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0JoZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C503330JoZ extends C502700JnY {
    public final View LL;
    public final SubSpaceFeedVM LLILLJJLI;
    public final C16F5 LLILLL;
    public final ViewGroup LLILZ;

    public C503330JoZ(View view, SubSpaceFeedVM subSpaceFeedVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceFeedVM;
        this.LLILLL = (C16F5) view.findViewById(R.id.rsd);
        this.LLILZ = (ViewGroup) view.findViewById(R.id.wi4);
    }

    @Override // X.C502700JnY
    public final void I5(AbstractC503810JpL abstractC503810JpL, final InterfaceC2753014t interfaceC2753014t) {
        C503350Job c503350Job;
        String strLJIJI = null;
        if (!(abstractC503810JpL instanceof C503350Job) || (c503350Job = (C503350Job) abstractC503810JpL) == null || !(interfaceC2753014t instanceof C504510JqT)) {
            return;
        }
        boolean zDQ2 = this.LLILLJJLI.DQ2();
        C16F5 c16f5 = this.LLILLL;
        if (c16f5 != null) {
            if (zDQ2) {
                strLJIJI = C497740JfY.LJIJI(2131856646);
            } else {
                String strLJIJI2 = c503350Job.LIZ.previewTextIndicator;
                if (strLJIJI2 != null) {
                    if (strLJIJI2.length() == 0) {
                        strLJIJI2 = C497740JfY.LJIJI(2131849261);
                    }
                    strLJIJI = strLJIJI2;
                }
            }
            c16f5.setText(strLJIJI);
        }
        ViewGroup viewGroup = this.LLILZ;
        if (viewGroup != null) {
            viewGroup.setBackground(C507390Jv7.LIZ((int) C497740JfY.LIZIZ(8.0f), C20736316Cj.LIZIZ(R.attr.ezl, this.LL.getContext()), 0, (int) C497740JfY.LIZIZ(0.0f)));
        }
        ViewGroup viewGroup2 = this.LLILZ;
        if (viewGroup2 != null) {
            C786410Ut5.K7(viewGroup2, new View.OnClickListener() { // from class: X.0Joa
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C505720JsQ.LIZIZ((C504510JqT) interfaceC2753014t, this.LL.getContext());
                }
            });
        }
    }
}
