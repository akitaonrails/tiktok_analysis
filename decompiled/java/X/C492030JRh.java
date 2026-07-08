package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.vm.EmotePollDetailVM;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0JRh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C492030JRh extends C491980JRc {
    public final View LL;
    public final EmotePollDetailVM LLILLJJLI;
    public final C19R6 LLILLL;
    public final C1324720kZq LLILZ;
    public final TextView LLILZIL;
    public final TextView LLILZLL;
    public final View LLIZ;
    public final View LLIZLLLIL;
    public final View LLJ;

    public C492030JRh(View view, EmotePollDetailVM emotePollDetailVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = emotePollDetailVM;
        this.LLILLL = (C19R6) view.findViewById(R.id.h16);
        this.LLILZ = (C1324720kZq) view.findViewById(R.id.bh2);
        this.LLILZIL = (TextView) view.findViewById(R.id.zz2);
        this.LLILZLL = (TextView) view.findViewById(R.id.tv_percentage);
        this.LLIZ = view.findViewById(R.id.vote_percentage);
        this.LLIZLLLIL = view.findViewById(R.id.rfa);
        this.LLJ = view.findViewById(R.id.k23);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007f  */
    @Override // X.C491980JRc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5(X.AbstractC492010JRf r11, X.InterfaceC2753014t r12) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C492030JRh.I5(X.0JRf, X.014t):void");
    }

    public final void N5(float f, int i) {
        int iIntValue;
        Integer numLIZJ;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(12));
        gradientDrawable.setColor(C446980Hfs.LIZ(this.LL.getContext(), android.R.color.transparent));
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(1.0f)));
        Context context = this.LL.getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(i, context)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        gradientDrawable.setStroke(iLIZIZ, iIntValue);
        this.LLIZLLLIL.setBackground(gradientDrawable);
    }
}
