package X;

import android.graphics.Bitmap;
import com.bytedance.android.livesdk.model.Board;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xJB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1814110xJB extends C09AY implements Function1<C1159750gHl, C1159750gHl> {
    public final /* synthetic */ Board LL;
    public final /* synthetic */ Bitmap LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814110xJB(Board board, Bitmap bitmap, int i) {
        super(1);
        this.LL = board;
        this.LLILLJJLI = bitmap;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1159750gHl invoke(C1159750gHl c1159750gHl) {
        return C1159750gHl.LIZ(c1159750gHl, null, new C291001Au(new C443120HZe(this.LL, this.LLILLJJLI, Integer.valueOf(this.LLILLL))), 3);
    }
}
