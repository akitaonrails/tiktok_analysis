package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.font.viewmodel.BoardTextDynamicStyleViewModel;
import com.bytedance.android.livesdkapi.host.editor.board.BoardTextFontStyleData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Iiq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C474300Iiq extends C09AY implements Function1<List<? extends BoardTextFontStyleData>, Unit> {
    public final /* synthetic */ InterfaceC20236714Gf<List<BoardTextFontStyleData>> LL;
    public final /* synthetic */ BoardTextDynamicStyleViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C474300Iiq(C2252611DEt c2252611DEt, BoardTextDynamicStyleViewModel boardTextDynamicStyleViewModel) {
        super(1);
        this.LL = c2252611DEt;
        this.LLILLJJLI = boardTextDynamicStyleViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends BoardTextFontStyleData> list) {
        List<? extends BoardTextFontStyleData> list2 = list;
        if (this.LL.isActive()) {
            ((ArrayList) this.LLILLJJLI.LLILLJJLI).clear();
            ((ArrayList) this.LLILLJJLI.LLILLJJLI).addAll(list2);
            this.LL.LJJIFFI(new C474310Iir(), list2);
        }
        return Unit.LIZ;
    }
}
