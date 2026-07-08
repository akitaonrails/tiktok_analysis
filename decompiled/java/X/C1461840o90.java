package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0o90, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1461840o90 extends C2217421BqW implements Function2<Function1<? super Boolean, ? extends Unit>, String, Unit> {
    public C1461840o90(C1461800o8w c1461800o8w) {
        super(2, c1461800o8w, C1461800o8w.class, "onClickCollage", "onClickCollage(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Function1<? super Boolean, ? extends Unit> function1, String str) {
        ((C1461800o8w) this.receiver).E5(function1, str);
        return Unit.LIZ;
    }
}
