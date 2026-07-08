package X;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: X.0sY1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class ViewOnClickListenerC1631110sY1 implements View.OnClickListener {
    public final /* synthetic */ ViewOnClickListenerC1638020sjA LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;

    public ViewOnClickListenerC1631110sY1(ViewOnClickListenerC1638020sjA viewOnClickListenerC1638020sjA, String str, String str2, boolean z) {
        this.LL = viewOnClickListenerC1638020sjA;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        Context context = view.getContext();
        if (context == null) {
            return;
        }
        ViewOnClickListenerC1638020sjA viewOnClickListenerC1638020sjA = this.LL;
        if (viewOnClickListenerC1638020sjA.LLJLL == 0) {
            InterfaceC1631100sY0 interfaceC1631100sY0 = viewOnClickListenerC1638020sjA.LLJ;
            i = 1;
            interfaceC1631100sY0.LJI(true);
        } else {
            InterfaceC1631100sY0 interfaceC1631100sY02 = viewOnClickListenerC1638020sjA.LLJ;
            i = 0;
            interfaceC1631100sY02.LJI(false);
        }
        ViewOnClickListenerC1638020sjA viewOnClickListenerC1638020sjA2 = this.LL;
        InterfaceC1631100sY0 interfaceC1631100sY03 = viewOnClickListenerC1638020sjA2.LLJ;
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        interfaceC1631100sY03.LJII(i, str, str2, new C1637320si2(this.LLILZ, context, viewOnClickListenerC1638020sjA2, str, str2));
    }
}
