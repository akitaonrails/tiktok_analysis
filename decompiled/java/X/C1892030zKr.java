package X;

import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zKr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C1892030zKr extends C2217421BqW implements Function0<Unit> {
    public C1892030zKr(Object obj) {
        super(0, obj, C1891990zKn.class, "hideEmojiPanel", "hideEmojiPanel()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        TuxSheet tuxSheet = ((C1891990zKn) this.receiver).LJ;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
        return Unit.LIZ;
    }
}
