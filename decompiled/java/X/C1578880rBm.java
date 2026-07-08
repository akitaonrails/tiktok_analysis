package X;

import android.content.Context;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.minidrama.tab.v2.navbar.NavItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0rBm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578880rBm extends LinearLayout {
    public List<NavItem> LL;
    public Function1<? super NavItem, Unit> LLILLJJLI;
    public boolean LLILLL;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1578880rBm.LIZ():void");
    }

    public C1578880rBm(Context context) {
        super(context, null, 0);
        this.LL = C13BV.INSTANCE;
        setOrientation(0);
        setGravity(16);
    }

    public final int LIZIZ(int i) {
        if (this.LLILLL) {
            return C1578770rBb.LIZ(getContext(), i);
        }
        return C1578770rBb.LIZIZ(getContext(), i);
    }

    public final void setDarkMode(boolean z) {
        if (z == this.LLILLL) {
            return;
        }
        this.LLILLL = z;
        LIZ();
    }
}
