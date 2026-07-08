package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.RichTextStyleEditViewModel;
import com.bytedance.android.livesdk.model.BoardItem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.019m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2876019m extends C09AY implements Function0<BoardItem> {
    public final /* synthetic */ RichTextStyleEditViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2876019m(RichTextStyleEditViewModel richTextStyleEditViewModel) {
        super(0);
        this.LL = richTextStyleEditViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final BoardItem invoke() {
        return ((C01DP) this.LL.LL.getValue()).LL;
    }
}
