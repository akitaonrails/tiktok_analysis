package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tfR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1674150tfR extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C1668880tWw LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ View.OnClickListener LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ int LLJIJIL;
    public final /* synthetic */ int LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1674150tfR(boolean z, C1668880tWw c1668880tWw, String str, boolean z2, View.OnClickListener onClickListener, boolean z3, String str2, int i, boolean z4, boolean z5, int i2, int i3) {
        super(2);
        this.LL = z;
        this.LLILLJJLI = c1668880tWw;
        this.LLILLL = str;
        this.LLILZ = z2;
        this.LLILZIL = onClickListener;
        this.LLILZLL = z3;
        this.LLIZ = str2;
        this.LLIZLLLIL = i;
        this.LLJ = z4;
        this.LLJI = z5;
        this.LLJIJIL = i2;
        this.LLJILJIL = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1674130tfP.LIZIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1680500tpg, C341440Da2.LIZ(this.LLJIJIL | 1), this.LLJILJIL);
        return Unit.LIZ;
    }
}
