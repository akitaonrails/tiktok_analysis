package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0n6w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1422120n6w extends C2217421BqW implements Function2<List<? extends C1422430n7R>, Integer, Unit> {
    public C1422120n6w(C1422780n80 c1422780n80) {
        super(2, c1422780n80, C1422780n80.class, "onTemplateShowWhenScrollFinish", "onTemplateShowWhenScrollFinish(Ljava/util/List;I)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(List<? extends C1422430n7R> list, Integer num) {
        int iIntValue = num.intValue();
        ((C1422780n80) this.receiver).d5(list, iIntValue);
        return Unit.LIZ;
    }
}
