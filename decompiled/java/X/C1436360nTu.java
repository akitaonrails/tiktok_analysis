package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0nTu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1436360nTu extends C2217421BqW implements Function2<Integer, Object, Unit> {
    public C1436360nTu(C1436330nTr c1436330nTr) {
        super(2, c1436330nTr, C1436330nTr.class, "onProgress", "onProgress(ILjava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, Object obj) {
        ((AbstractC1433570nPP) this.receiver).onProgress(num.intValue(), obj);
        return Unit.LIZ;
    }
}
