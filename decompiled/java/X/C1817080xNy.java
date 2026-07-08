package X;

import android.graphics.Typeface;
import com.bytedance.android.livesdk.model.BoardItemContent;
import com.bytedance.android.livesdk.model.BoardItemStyle;
import com.bytedance.android.livesdk.model.BoardItemTemplate;
import com.bytedance.android.livesdkapi.host.editor.IHostMultiCanvas;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0xNy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1817080xNy {
    public final InterfaceC971680bOQ LIZ;
    public int LIZIZ;
    public final List<Pair<BoardItemTemplate, BoardItemContent>> LIZJ;
    public String LIZLLL;
    public BoardItemStyle LJ;

    public C1817080xNy() {
        this(0);
    }

    public C1817080xNy(int i) {
        InterfaceC971680bOQ interfaceC971680bOQEu1;
        if (C1815390xLF.LIZ()) {
            interfaceC971680bOQEu1 = ((IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class)).Eu1();
        } else {
            interfaceC971680bOQEu1 = null;
        }
        this.LIZ = interfaceC971680bOQEu1;
        this.LIZJ = new ArrayList();
        this.LIZLLL = "";
        this.LJ = new BoardItemStyle();
    }

    public final void LIZ(int i) {
        String str;
        Pair<C1817980xPQ, Typeface> pairLIZ;
        C1817980xPQ first;
        List<String> list = this.LJ.fonts;
        InterfaceC971680bOQ interfaceC971680bOQ = this.LIZ;
        if (interfaceC971680bOQ == null || (pairLIZ = interfaceC971680bOQ.LIZ()) == null || (first = pairLIZ.getFirst()) == null || (str = first.LIZIZ) == null) {
            str = "";
        }
        C08FK.LIZ(list, i, str);
    }
}
