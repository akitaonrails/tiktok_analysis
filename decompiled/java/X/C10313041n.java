package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.041n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10313041n extends AbstractC1585810rMx {
    public final Function1<String, Unit> LL;
    public int LLILLJJLI;
    public String LLILLL = "";
    public int LLILZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C10313041n(Function1<? super String, Unit> function1) {
        this.LL = function1;
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        if (this.LLILLJJLI != 0) {
            if (i == 0) {
                if (this.LLILZ > 8) {
                    this.LL.invoke(this.LLILLL);
                }
                this.LLILZ = 0;
            }
        } else if (i == 0) {
            this.LLILZ = 0;
        }
        this.LLILLJJLI = i;
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        String str;
        if (i < 0) {
            str = "show_left";
        } else {
            str = "show_right";
        }
        this.LLILLL = str;
        this.LLILZ += Math.abs(i);
    }
}
