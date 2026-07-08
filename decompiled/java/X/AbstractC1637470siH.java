package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import irm.AkS92S0100000_25;
import kotlin.Unit;
import kotlin.jvm.internal.AwS674S0100000_25;
import u4.q0;

/* JADX INFO: renamed from: X.0siH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1637470siH<DATA> extends RecyclerView.ViewHolder {
    public final C1662850tND LL;
    public final InterfaceC1631620sYq<DATA, Integer, EnumC1641420soe, Unit> LLILLJJLI;
    public DATA LLILLL;
    public EnumC1641420soe LLILZ;
    public int LLILZIL;

    public abstract void V2(DATA data);

    public AbstractC1637470siH(View view, C1662850tND c1662850tND, AwS674S0100000_25 awS674S0100000_25) {
        super(view);
        this.LL = c1662850tND;
        this.LLILLJJLI = awS674S0100000_25;
        this.LLILZ = EnumC1641420soe.NOT_DOWNLOAD;
        C786410Ut5.I7(new AkS92S0100000_25(this, (AbstractC1637470siH<Object>) 18), view);
        q0.LJIJ(view, new C786390Ut3(12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I5(int i, EnumC1641420soe enumC1641420soe, Integer num, Object obj) {
        this.LLILLL = obj;
        this.LLILZ = enumC1641420soe;
        this.LLILZIL = i;
        V2(obj);
        C1632130sZf.LIZ(this.LL, enumC1641420soe, num);
    }
}
