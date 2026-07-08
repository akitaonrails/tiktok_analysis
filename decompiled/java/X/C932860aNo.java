package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: renamed from: X.0aNo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C932860aNo extends ConstraintLayout {
    public final C16F5 LL;
    public final ConstraintLayout LLILLJJLI;
    public final C19R6 LLILLL;
    public final C19R6 LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;

    public final C0JBN getBgLoader() {
        return (C0JBN) this.LLILZLL.getValue();
    }

    public final C0JBN getImageLoader() {
        return (C0JBN) this.LLILZIL.getValue();
    }

    public final int e0(String str) {
        try {
            if (str.length() > 0 && str.charAt(0) == '#') {
                str = str.substring(0, 7);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return ColorProtector.parseColor(str);
    }

    public C932860aNo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C932860aNo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZIL = C292401Bi.LIZ(AFwS203S0000000_15.get$arr$(126));
        this.LLILZLL = C292401Bi.LIZ(AFwS203S0000000_15.get$arr$(125));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.hev, this, true);
        this.LL = (C16F5) findViewById(R.id.bsi);
        this.LLILLJJLI = (ConstraintLayout) findViewById(R.id.brb);
        findViewById(R.id.bsd);
        this.LLILLL = (C19R6) findViewById(R.id.brt);
        this.LLILZ = (C19R6) findViewById(R.id.brs);
    }
}
