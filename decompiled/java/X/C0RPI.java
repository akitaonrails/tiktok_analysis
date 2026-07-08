package X;

import com.ss.android.ugc.feed.platform.cell.interact.info.InteractInfoAreaComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RPI, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RPI extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ InteractInfoAreaComponent LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RPI(boolean z, InteractInfoAreaComponent interactInfoAreaComponent, boolean z2, boolean z3) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = interactInfoAreaComponent;
        this.LLILLL = z2;
        this.LLILZ = z3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.LL) {
            C0RPK c0rpk = this.LLILLJJLI.LLJLL;
            if (c0rpk != null) {
                c0rpk.qe(true);
            }
            C0RPK c0rpk2 = this.LLILLJJLI.LLJLL;
            if (c0rpk2 != null) {
                c0rpk2.oC(true);
            }
            C0RPK c0rpk3 = this.LLILLJJLI.LLJLL;
            if (c0rpk3 != null) {
                c0rpk3.wF();
            }
        } else if (this.LLILLL) {
            C0RPK c0rpk4 = this.LLILLJJLI.LLJLL;
            if (c0rpk4 != null) {
                c0rpk4.qe(true);
            }
            C0RPK c0rpk5 = this.LLILLJJLI.LLJLL;
            if (c0rpk5 != null) {
                c0rpk5.SC(true);
            }
            C0RPK c0rpk6 = this.LLILLJJLI.LLJLL;
            if (c0rpk6 != null) {
                c0rpk6.wF();
            }
        } else if (this.LLILZ) {
            C0RPK c0rpk7 = this.LLILLJJLI.LLJLL;
            if (c0rpk7 != null) {
                c0rpk7.qe(true);
            }
            C0RPK c0rpk8 = this.LLILLJJLI.LLJLL;
            if (c0rpk8 != null) {
                c0rpk8.wF();
            }
        }
        return Unit.LIZ;
    }
}
