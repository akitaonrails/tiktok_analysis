package X;

import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0l95, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1346570l95 extends C09AY implements Function1<C1346950l9h, Unit> {
    public final /* synthetic */ KeyboardVMV2 LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1346570l95(KeyboardVMV2 keyboardVMV2, boolean z, boolean z2) {
        super(1);
        this.LL = keyboardVMV2;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1346950l9h c1346950l9h) {
        this.LL.IQ2(this.LLILLJJLI, c1346950l9h, this.LLILLL);
        return Unit.LIZ;
    }
}
