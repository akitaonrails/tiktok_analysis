package X;

import com.ss.android.ugc.aweme.tako.share.panel.TakoLongImageSharePackage;

/* JADX INFO: renamed from: X.063c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.share.panel.TakoLongImageSharePackage", f = "TakoLongImageSharePackage.kt", l = {112}, m = "awaitC2PATagging")
public final class C15450063c extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ TakoLongImageSharePackage LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15450063c(TakoLongImageSharePackage takoLongImageSharePackage, InterfaceC1364105Vn<? super C15450063c> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = takoLongImageSharePackage;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoLongImageSharePackage@f869.awaitC2PATagging$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJ = this.LLILLJJLI.LJJ(this);
        C1C7U.LIZIZ("TakoLongImageSharePackage@f869.awaitC2PATagging$1");
        return objLJJ;
    }
}
