package X;

import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0JyB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C509290JyB extends AbstractC508030Jw9<C507720Jve> {
    public final C19R6 LLILLJJLI;
    public final C1324720kZq LLILLL;
    public final C16F5 LLILZ;
    public final C16F5 LLILZIL;
    public final ViewGroup LLILZLL;
    public final C16F5 LLIZ;
    public final ViewGroup LLIZLLLIL;
    public final C16F5 LLJ;
    public final C1126540fQC LLJI;
    public final LiveIconView LLJIJIL;
    public final C509310JyD LLJILJIL;
    public final C16F5 LLJILJILJ;
    public final ViewGroup LLJILLL;
    public final C16F5 LLJJ;
    public final ViewGroup LLJJI;
    public final ViewGroup LLJJIII;
    public final C16F5 LLJJIJI;
    public final C16F5 LLJJIJIIJIL;
    public final Paint LLJJIJIL;
    public final C1143920fsE LLJJJ;

    @Override // X.C0K07
    public final void L5() {
        this.LLJJJ.LIZ();
    }

    public C509290JyB(View view) {
        super(view);
        this.LLILLJJLI = (C19R6) view.findViewById(R.id.rt6);
        this.LLILLL = (C1324720kZq) view.findViewById(R.id.rt7);
        this.LLILZ = (C16F5) view.findViewById(R.id.rt_);
        this.LLILZIL = (C16F5) view.findViewById(R.id.rt9);
        this.LLILZLL = (ViewGroup) view.findViewById(R.id.pi6);
        this.LLIZ = (C16F5) view.findViewById(R.id.pi7);
        this.LLIZLLLIL = (ViewGroup) view.findViewById(R.id.b4i);
        this.LLJ = (C16F5) view.findViewById(R.id.b4k);
        this.LLJI = (C1126540fQC) view.findViewById(R.id.b4j);
        this.LLJIJIL = (LiveIconView) view.findViewById(R.id.wf4);
        this.LLJILJIL = (C509310JyD) view.findViewById(R.id.pi9);
        this.LLJILJILJ = (C16F5) view.findViewById(R.id.ptu);
        this.LLJILLL = (ViewGroup) view.findViewById(R.id.fwt);
        this.LLJJ = (C16F5) view.findViewById(R.id.rte);
        this.LLJJI = (ViewGroup) view.findViewById(R.id.rt8);
        this.LLJJIII = (ViewGroup) view.findViewById(R.id.il4);
        this.LLJJIJI = (C16F5) view.findViewById(R.id.il3);
        this.LLJJIJIIJIL = (C16F5) view.findViewById(R.id.il1);
        this.LLJJIJIL = new Paint();
        this.LLJJJ = new C1143920fsE();
    }

    /* JADX WARN: Removed duplicated region for block: B:214:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011c  */
    @Override // X.C0K07
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5(X.InterfaceC515600KJy r25) {
        /*
            Method dump skipped, instruction units count: 1861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C509290JyB.I5(X.0KJy):void");
    }

    public final int S5(C16F5 c16f5) {
        String string;
        if (c16f5 == null) {
            return 0;
        }
        this.LLJJIJIL.setTypeface(c16f5.getTypeface());
        this.LLJJIJIL.setTextSize(c16f5.getTextSize());
        Paint paint = this.LLJJIJIL;
        CharSequence text = c16f5.getText();
        if (text == null || (string = text.toString()) == null) {
            string = "";
        }
        return (int) paint.measureText(string);
    }
}
