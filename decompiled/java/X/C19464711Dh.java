package X;

import X.AbstractC21673619ry;
import X.InterfaceC19464411De;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11Dh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19464711Dh<T extends AbstractC21673619ry<?> & InterfaceC19464411De<?, ? extends C19465311Dn<?>>> implements InterfaceC1891370zJn {

    /* JADX INFO: Incorrect field signature: TT; */
    public final AbstractC21673619ry LL;
    public final Function1<Integer, Integer> LLILLJJLI;

    public final C19464811Di LIZ() {
        return ((InterfaceC19464411De) this.LL).LIZJ().LJFF.LIZLLL;
    }

    /* JADX WARN: Incorrect types in method signature: (TT;Lkotlin/jvm/functions/Function1<-Ljava/lang/Integer;Ljava/lang/Integer;>;)V */
    public C19464711Dh(AbstractC21673619ry abstractC21673619ry, Function1 function1) {
        this.LL = abstractC21673619ry;
        this.LLILLJJLI = function1;
    }

    @Override // X.InterfaceC1891370zJn
    public final void LJZL(int i, int i2) {
        if (i2 == 0) {
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            ((InterfaceC19464411De) this.LL).LIZJ().LJFF.LIZJ.LIZ(i4, false);
            LIZ().LIZIZ(i4, null);
        }
        ((InterfaceC19464411De) this.LL).LIZJ().LIZLLL.LIZ();
        int iIntValue = this.LLILLJJLI.invoke(Integer.valueOf(i)).intValue();
        this.LL.notifyItemRangeInserted(iIntValue, i2);
        ((InterfaceC19464411De) this.LL).LIZJ().LIZLLL.LIZIZ(iIntValue);
    }

    @Override // X.InterfaceC1891370zJn
    public final void LLI(int i, int i2) {
        ArrayList arrayList = (ArrayList) ((InterfaceC19464411De) this.LL).LIZJ().LJFF.LIZJ.LIZ;
        if (i < arrayList.size() && i2 < arrayList.size()) {
            boolean zBooleanValue = ((Boolean) ListProtector.get(arrayList, i)).booleanValue();
            ListProtector.set(arrayList, i, ListProtector.get(arrayList, i2));
            ListProtector.set(arrayList, i2, Boolean.valueOf(zBooleanValue));
        }
        ArrayList arrayList2 = (ArrayList) LIZ().LIZIZ;
        if (i < arrayList2.size() && i2 < arrayList2.size()) {
            Object obj = ListProtector.get(arrayList2, i);
            ListProtector.set(arrayList2, i, ListProtector.get(arrayList2, i2));
            ListProtector.set(arrayList2, i2, obj);
        }
        this.LL.notifyItemMoved(this.LLILLJJLI.invoke(Integer.valueOf(i)).intValue(), this.LLILLJJLI.invoke(Integer.valueOf(i2)).intValue());
    }

    @Override // X.InterfaceC1891370zJn
    public final void LLIZLLLIL(int i, int i2) {
        JediViewHolderProxy jediViewHolderProxy;
        if (i2 == 0) {
            return;
        }
        C19464911Dj c19464911Dj = ((InterfaceC19464411De) this.LL).LIZJ().LJFF.LIZJ;
        if (i == 0 && i2 >= ((ArrayList) c19464911Dj.LIZ).size()) {
            if (((ArrayList) c19464911Dj.LIZ).size() != 0) {
                ((ArrayList) c19464911Dj.LIZ).clear();
            }
            LIZ().LIZ();
            this.LL.notifyDataSetChanged();
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (i < ((ArrayList) c19464911Dj.LIZ).size()) {
                ListProtector.remove(c19464911Dj.LIZ, i);
            }
            C19464811Di c19464811DiLIZ = LIZ();
            if (i < ((ArrayList) c19464811DiLIZ.LIZIZ).size() && (jediViewHolderProxy = (JediViewHolderProxy) ListProtector.remove(c19464811DiLIZ.LIZIZ, i)) != null) {
                c19464811DiLIZ.LIZ.LIZ(jediViewHolderProxy);
            }
        }
        this.LL.notifyItemRangeRemoved(this.LLILLJJLI.invoke(Integer.valueOf(i)).intValue(), i2);
    }

    @Override // X.InterfaceC1891370zJn
    public final void LLJJJJJIL(int i, int i2, Object obj) {
        this.LL.notifyItemRangeChanged(this.LLILLJJLI.invoke(Integer.valueOf(i)).intValue(), i2, new Pair(obj, C19465211Dm.LIZ));
    }
}
