package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm.FullyCustomizedBoardEditFontViewModel;
import com.bytedance.android.livesdk.model.BoardItem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xPJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1817910xPJ extends C09AY implements Function0<BoardItem> {
    public final /* synthetic */ FullyCustomizedBoardEditFontViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1817910xPJ(FullyCustomizedBoardEditFontViewModel fullyCustomizedBoardEditFontViewModel) {
        super(0);
        this.LL = fullyCustomizedBoardEditFontViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final BoardItem invoke() {
        return ((C01DP) this.LL.LLILLJJLI.getValue()).LL;
    }
}
