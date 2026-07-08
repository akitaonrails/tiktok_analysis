package X;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: renamed from: X.0yVj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1860330yVj extends C09AY implements InterfaceC1631620sYq<LinearLayoutManager, Context, Integer, Boolean> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Integer LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1860330yVj(boolean z, Integer num) {
        super(3);
        this.LL = z;
        this.LLILLJJLI = num;
    }

    @Override // X.InterfaceC1631620sYq
    public final Boolean invoke(LinearLayoutManager linearLayoutManager, Context context, Integer num) {
        boolean z;
        LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
        Context context2 = context;
        int iIntValue = num.intValue();
        if (this.LL) {
            C1861360yXO c1861360yXO = C1861360yXO.LIZ;
            Integer num2 = this.LLILLJJLI;
            c1861360yXO.getClass();
            C1861330yXL.LJII(linearLayoutManager2, iIntValue, context2, C1861360yXO.LIZIZ(num2), 8);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
