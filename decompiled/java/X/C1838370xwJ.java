package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.font.viewmodel.BoardTextSelectFontStyleViewModel;
import com.bytedance.android.livesdk.model.BoardItem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xwJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1838370xwJ extends C09AY implements Function0<BoardItem> {
    public final /* synthetic */ BoardTextSelectFontStyleViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1838370xwJ(BoardTextSelectFontStyleViewModel boardTextSelectFontStyleViewModel) {
        super(0);
        this.LL = boardTextSelectFontStyleViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final BoardItem invoke() {
        return ((C01DP) this.LL.LL.getValue()).LL;
    }
}
