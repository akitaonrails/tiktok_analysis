package X;

import androidx.lifecycle.Observer;

/* JADX INFO: renamed from: X.0PDE, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PDE implements Observer<Integer> {
    public C0PDF LL;
    public boolean LLILLJJLI = true;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Integer num) {
        Integer num2 = num;
        if (num2 != null) {
            if (num2.intValue() == 5) {
                this.LL.LIZ();
                return;
            }
            if (num2.intValue() == 6) {
                this.LL.LLFF();
                return;
            }
            if (num2.intValue() == 3) {
                this.LL.LIZIZ(false);
            } else if (this.LLILLJJLI) {
                this.LLILLJJLI = false;
            } else {
                this.LL.LIZIZ(true);
            }
        }
    }
}
