package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bjp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C984950bjp extends FrameLayout {
    public static final C01BH LLIZLLLIL = new C01BH(0, 0, null);
    public static final C01BH LLJ = new C01BH(0, 0, null);
    public boolean LL;
    public final C1324720kZq LLILLJJLI;
    public final C1324720kZq LLILLL;
    public final C0GRL LLILZ;
    public boolean LLILZIL;
    public C01BH LLILZLL;
    public final C1324720kZq LLIZ;

    public final C01BH getUserInfo() {
        return this.LLILZLL;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final int LIZ(C985000bju c985000bju) {
        c985000bju.getClass();
        if (!Intrinsics.LJFF(c985000bju, C985000bju.LIZJ)) {
            String str = c985000bju.LIZ;
            switch (str.hashCode()) {
                case -1924984242:
                    if (!str.equals("Orange")) {
                        return 0;
                    }
                    return R.drawable.fdp;
                case -1893076004:
                    if (!str.equals("Purple")) {
                        return 0;
                    }
                    return R.drawable.fdq;
                case 82033:
                    if (!str.equals("Red")) {
                        return 0;
                    }
                    return R.drawable.fdr;
                case 2073722:
                    if (!str.equals("Blue")) {
                        return 0;
                    }
                    return R.drawable.fdo;
                default:
                    return 0;
            }
        }
        if (this.LLILZIL) {
            return R.drawable.fa_;
        }
        return R.drawable.fa9;
    }

    public final void setRingColor(C985000bju c985000bju) {
        c985000bju.getClass();
        if (!Intrinsics.LJFF(c985000bju, C985000bju.LIZJ)) {
            int[] iArr = c985000bju.LIZIZ;
            if (iArr.length != 0) {
                try {
                    C0GRL c0grl = this.LLILZ;
                    if (c0grl != null) {
                        c0grl.setGradientColors(iArr);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Cannot set the gradient color. Fallback to the default implementation. e=");
                    sbLIZ.append(e);
                    C20441214yg.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
        if (this.LLILZIL) {
            C0GRL c0grl2 = this.LLILZ;
            if (c0grl2 != null) {
                c0grl2.setGradientColors(new int[]{C20736316Cj.LIZIZ(R.attr.es2, getContext()), C20736316Cj.LIZIZ(R.attr.es1, getContext())});
                return;
            }
            return;
        }
        C0GRL c0grl3 = this.LLILZ;
        if (c0grl3 == null) {
            return;
        }
        c0grl3.setGradientColors(new int[]{C20736316Cj.LIZIZ(R.attr.eug, getContext()), C20736316Cj.LIZIZ(R.attr.euf, getContext())});
    }

    public C984950bjp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.hq3, this, true);
        this.LLILLJJLI = (C1324720kZq) findViewById(R.id.oz1);
        this.LLILLL = (C1324720kZq) findViewById(R.id.oyy);
        this.LLILZ = (C0GRL) findViewById(R.id.user_stroke);
        this.LLIZ = (C1324720kZq) findViewById(R.id.oyt);
    }
}
