package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mwH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1415510mwH extends C2217421BqW implements Function1<Integer, Unit> {
    public C1415510mwH(C1409690mmt c1409690mmt) {
        super(1, c1409690mmt, C1409690mmt.class, "onClickItem", "onClickItem(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        ((C1409690mmt) this.receiver).C5(num.intValue());
        return Unit.LIZ;
    }
}
