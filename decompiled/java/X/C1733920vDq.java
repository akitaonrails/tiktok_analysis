package X;

import com.bytedance.android.livesdk.model.BoardItem;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0vDq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1733920vDq extends C09AY implements Function1<BoardItem, CharSequence> {
    public C1733920vDq() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(BoardItem boardItem) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(boardItem.id);
        sbLIZ.append(", ");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
