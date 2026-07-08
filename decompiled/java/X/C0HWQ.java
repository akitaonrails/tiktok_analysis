package X;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0HWQ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HWQ extends C1391540mJc {
    public final C443080HZa LLIZ;
    public int LLIZLLLIL;
    public boolean LLJ;
    public int LLJI;

    @Override // X.C1391540mJc
    public final String LJIIJ() {
        if (this.LLJI <= 0) {
            return "min(wrap_content,screen.height-96dp)";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("min(wrap_content,");
        sbLIZ.append(this.LLJI);
        sbLIZ.append("px)");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1391540mJc
    public final String LJIIJJI() {
        if (this.LLJ) {
            return "min(max(wrap_content,200dp),screen.width-32dp)";
        }
        if (this.LLIZLLLIL <= 0) {
            return "240dp";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("min(max(");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append("px,200dp),screen.width-32dp)");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0HWQ(Context context) {
        super(context);
        this.LLIZ = new C443080HZa(context);
        this.LLILLJJLI.LJII = -1001L;
    }

    public final void LJIIL(List list) {
        this.LLIZ.setMenuActions(list);
        this.LLIZ.setDismissCallback(new AwS550S0100000_6(this, 1577));
        C21578619ce c21578619ce = new C21578619ce(this.LL);
        c21578619ce.addView(this.LLIZ);
        this.LLILZIL = c21578619ce;
    }
}
