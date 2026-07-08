package X;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xN3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1816510xN3 {
    public final Context LIZ;
    public final ConstraintLayout LIZIZ;
    public final ConstraintLayout LIZJ;
    public final DataChannel LIZLLL;
    public final C482301uH LJ;
    public final InterfaceC1816560xN8 LJFF;

    public C1816510xN3(Context context, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, DataChannel dataChannel, C482301uH c482301uH, C1816520xN4 c1816520xN4) {
        this.LIZ = context;
        this.LIZIZ = constraintLayout;
        this.LIZJ = constraintLayout2;
        this.LIZLLL = dataChannel;
        this.LJ = c482301uH;
        this.LJFF = c1816520xN4;
    }

    public final void LIZ(BoardItem boardItem, Board board, boolean z, C1733900vDo c1733900vDo, C1705740uUO c1705740uUO, ConstraintLayout constraintLayout, Function0 function0) {
        AbstractC1817020xNs abstractC1817020xNs = (AbstractC1817020xNs) function0.invoke();
        if (constraintLayout != null) {
            constraintLayout.addView(abstractC1817020xNs);
        }
        abstractC1817020xNs.LJIIJ(this.LJFF.LIZIZ(board, boardItem, z, c1733900vDo, c1705740uUO), this.LIZLLL);
    }
}
