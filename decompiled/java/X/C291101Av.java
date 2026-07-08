package X;

import android.graphics.Bitmap;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent.IntelligentBoardSaveAssem;
import com.bytedance.android.livesdk.model.Board;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01Av, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C291101Av extends C09AY implements Function1<Bitmap, Unit> {
    public final /* synthetic */ IntelligentBoardSaveAssem LL;
    public final /* synthetic */ Board LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C291101Av(IntelligentBoardSaveAssem intelligentBoardSaveAssem, Board board, int i) {
        super(1);
        this.LL = intelligentBoardSaveAssem;
        this.LLILLJJLI = board;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Bitmap bitmap) {
        this.LL.Jo(this.LLILLJJLI, bitmap, this.LLILLL);
        return Unit.LIZ;
    }
}
