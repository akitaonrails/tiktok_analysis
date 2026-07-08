package X;

import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0K5L, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K5L extends C0K1I<C0K0K> {
    public final C417410GYh LLILLJJLI;
    public final C417410GYh LLILLL;
    public final TuxTextView LLILZ;
    public final TuxTextView LLILZIL;
    public final ViewGroup LLILZLL;
    public final TuxTextView LLIZ;
    public final ViewGroup LLIZLLLIL;
    public final TuxTextView LLJ;
    public final C417410GYh LLJI;
    public final TuxIconView LLJIJIL;
    public final C0K5Q LLJILJIL;
    public final TuxTextView LLJILJILJ;
    public final ViewGroup LLJILLL;
    public final TuxTextView LLJJ;
    public final ViewGroup LLJJI;
    public final ViewGroup LLJJIII;
    public final TuxTextView LLJJIJI;
    public final TuxTextView LLJJIJIIJIL;
    public final Paint LLJJIJIL;
    public final C0K5V LLJJJ;

    @Override // X.AbstractC339560DSw
    public final void L5() {
        Unit unit;
        C0K77 c0k77C3;
        C0K5V c0k5v = this.LLJJJ;
        long j = c0k5v.LJII;
        if (j > 0) {
            c0k5v.LJII = 0L;
            try {
                ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
                if (iLiveOuterService == null || (c0k77C3 = iLiveOuterService.C3()) == null) {
                    unit = null;
                } else {
                    c0k77C3.LJJIJ(j);
                    unit = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public C0K5L(View view) {
        super(view);
        this.LLILLJJLI = (C417410GYh) view.findViewById(R.id.rt6);
        this.LLILLL = (C417410GYh) view.findViewById(R.id.rt7);
        this.LLILZ = (TuxTextView) view.findViewById(R.id.rt_);
        this.LLILZIL = (TuxTextView) view.findViewById(R.id.rt9);
        this.LLILZLL = (ViewGroup) view.findViewById(R.id.pi6);
        this.LLIZ = (TuxTextView) view.findViewById(R.id.pi7);
        this.LLIZLLLIL = (ViewGroup) view.findViewById(R.id.b4i);
        this.LLJ = (TuxTextView) view.findViewById(R.id.b4k);
        this.LLJI = (C417410GYh) view.findViewById(R.id.b4j);
        this.LLJIJIL = (TuxIconView) view.findViewById(R.id.wf4);
        this.LLJILJIL = (C0K5Q) view.findViewById(R.id.pi9);
        this.LLJILJILJ = (TuxTextView) view.findViewById(R.id.ptu);
        this.LLJILLL = (ViewGroup) view.findViewById(R.id.fwt);
        this.LLJJ = (TuxTextView) view.findViewById(R.id.rte);
        this.LLJJI = (ViewGroup) view.findViewById(R.id.rt8);
        this.LLJJIII = (ViewGroup) view.findViewById(R.id.il4);
        this.LLJJIJI = (TuxTextView) view.findViewById(R.id.il3);
        this.LLJJIJIIJIL = (TuxTextView) view.findViewById(R.id.il1);
        this.LLJJIJIL = new Paint();
        this.LLJJJ = new C0K5V();
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0141  */
    @Override // X.AbstractC339560DSw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5(X.InterfaceC339570DSx r27) {
        /*
            Method dump skipped, instruction units count: 1969
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0K5L.I5(X.0DSx):void");
    }

    public final int R5(AppCompatTextView appCompatTextView) {
        String string;
        if (appCompatTextView == null) {
            return 0;
        }
        this.LLJJIJIL.setTypeface(appCompatTextView.getTypeface());
        this.LLJJIJIL.setTextSize(appCompatTextView.getTextSize());
        Paint paint = this.LLJJIJIL;
        CharSequence text = appCompatTextView.getText();
        if (text == null || (string = text.toString()) == null) {
            string = "";
        }
        return (int) paint.measureText(string);
    }
}
