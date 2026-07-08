package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: renamed from: X.0K36, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K36 extends C0K3V {
    public final View LL;
    public final SubSpaceDetailVM LLILLJJLI;
    public final TextView LLILLL;
    public final TextView LLILZ;
    public final View LLILZIL;
    public final View LLILZLL;
    public final View LLIZ;
    public final C01GW LLIZLLLIL;

    public C0K36(View view, SubSpaceDetailVM subSpaceDetailVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceDetailVM;
        this.LLILLL = (TextView) view.findViewById(R.id.rfe);
        this.LLILZ = (TextView) view.findViewById(R.id.rfy);
        this.LLILZIL = view.findViewById(R.id.vote_percentage);
        this.LLILZLL = view.findViewById(R.id.rfa);
        this.LLIZ = view.findViewById(R.id.j8g);
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 599));
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x01b0  */
    @Override // X.C0K3V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5(X.AbstractC511160K2w r14, X.InterfaceC2753014t r15) {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0K36.I5(X.0K2w, X.014t):void");
    }

    public final void U5(float f, int i) {
        int iIntValue;
        Integer numLIZJ;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(8));
        gradientDrawable.setColor(C446980Hfs.LIZ(this.LL.getContext(), android.R.color.transparent));
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f)));
        Context context = this.LL.getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(i, context)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        gradientDrawable.setStroke(iLIZIZ, iIntValue);
        this.LLILZLL.setBackground(gradientDrawable);
    }
}
