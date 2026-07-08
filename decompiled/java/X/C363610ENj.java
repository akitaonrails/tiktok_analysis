package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ENj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C363610ENj extends C2217421BqW implements Function1<Boolean, Unit> {
    public C363610ENj(C363550ENd c363550ENd) {
        super(1, c363550ENd, C363550ENd.class, "onTextContentEditEnd", "onTextContentEditEnd(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ((C363550ENd) this.receiver).L6(bool.booleanValue());
        return Unit.LIZ;
    }
}
