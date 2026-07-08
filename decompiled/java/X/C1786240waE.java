package X;

import com.bytedance.android.live.rank.impl.page.ui.CreatorRankingPageDialogFragment;
import java.util.LinkedHashMap;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0waE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1786240waE {
    public final InterfaceC1786180wa8 LIZ;
    public final C1786010wZr LIZIZ;

    public final void LIZ(String str) {
        if (!a0.LJJJIL(str)) {
            boolean z = C1105900esu.LIZIZ;
            C1105900esu.LJ(this.LIZ.getDataChannel(), str, true, false, "", new LinkedHashMap());
        }
        this.LIZ.UJ();
    }

    public C1786240waE(CreatorRankingPageDialogFragment creatorRankingPageDialogFragment, C1786010wZr c1786010wZr) {
        this.LIZ = creatorRankingPageDialogFragment;
        this.LIZIZ = c1786010wZr;
    }
}
