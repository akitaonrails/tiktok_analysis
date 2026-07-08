package X;

import X.C11EV;
import X.C19464111Db;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS229S0000000_2;

/* JADX INFO: renamed from: X.11DS, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11DS<T, VH extends C11EV<T>, M extends C19464111Db<VH>> extends C11DX<VH, M> implements C11DO<T> {
    public final C11DQ LL = null;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return LLILZIL().LJFF.size();
    }

    public C11DS(C11DU c11du) {
        new C11DR(new InterfaceC1891370zJn(this) { // from class: X.11DZ

            /* JADX INFO: Incorrect field signature: TT; */
            public final AbstractC21673619ry LL;
            public final Function1<Integer, Integer> LLILLJJLI;

            {
                AFwS229S0000000_2 aFwS229S0000000_2 = AFwS229S0000000_2.get$arr$(827);
                this.LL = this;
                this.LLILLJJLI = aFwS229S0000000_2;
            }

            @Override // X.InterfaceC1891370zJn
            public final void LJZL(int i, int i2) {
                if (i2 == 0) {
                    return;
                }
                ((InterfaceC19464411De) this.LL).LIZJ().LIZLLL.LIZ();
                int iIntValue = this.LLILLJJLI.invoke(Integer.valueOf(i)).intValue();
                this.LL.notifyItemRangeInserted(iIntValue, i2);
                ((InterfaceC19464411De) this.LL).LIZJ().LIZLLL.LIZIZ(iIntValue);
            }

            @Override // X.InterfaceC1891370zJn
            public final void LLI(int i, int i2) {
                this.LL.notifyItemMoved(this.LLILLJJLI.invoke(Integer.valueOf(i)).intValue(), this.LLILLJJLI.invoke(Integer.valueOf(i2)).intValue());
            }

            @Override // X.InterfaceC1891370zJn
            public final void LLIZLLLIL(int i, int i2) {
                if (i2 == 0) {
                    return;
                }
                this.LL.notifyItemRangeRemoved(this.LLILLJJLI.invoke(Integer.valueOf(i)).intValue(), i2);
            }

            @Override // X.InterfaceC1891370zJn
            public final void LLJJJJJIL(int i, int i2, Object obj) {
                this.LL.notifyItemRangeChanged(this.LLILLJJLI.invoke(Integer.valueOf(i)).intValue(), i2, obj);
            }
        }, c11du, null);
    }

    @Override // X.C11DO
    public final void LLII(List<? extends T> list, Function0<Unit> function0) {
        C11DT.LIZ(this, list, function0);
    }

    @Override // X.C11DX
    public final T LLLFZ(int i, boolean z) {
        return LLLII(i, z);
    }

    public final T LLLII(int i, boolean z) {
        return LLILZIL().LIZ(i, z);
    }
}
