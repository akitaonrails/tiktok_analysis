package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Ele, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C374120Ele extends C2217421BqW implements Function2<C373800El8, Integer, Unit> {
    public C374120Ele(C373730El1 c373730El1) {
        super(2, c373730El1, C373730El1.class, "handleOnItemClick", "handleOnItemClick(Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/toolbar/CutoutToolBarItem;I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C373800El8 c373800El8, Integer num) {
        int iIntValue = num.intValue();
        ((C373730El1) this.receiver).x5(c373800El8, iIntValue);
        return Unit.LIZ;
    }
}
