package X;

import com.bytedance.android.livesdk.model.Board;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fuX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1145350fuX extends C09AY implements Function1<C1145340fuW, C1145340fuW> {
    public final /* synthetic */ Board LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1145350fuX(Board board) {
        super(1);
        this.LL = board;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1145340fuW invoke(C1145340fuW c1145340fuW) {
        return new C1145340fuW(c1145340fuW.LLILLJJLI, new C291001Au(this.LL));
    }
}
