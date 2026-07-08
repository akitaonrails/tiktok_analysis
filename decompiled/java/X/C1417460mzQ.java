package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0mzQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1417460mzQ implements InterfaceC1417610mzf<Unit> {
    public final VideoPublishEditModel LIZ;
    public final LinkedHashMap<Pair<Integer, C0MJ9>, C1417670mzl> LIZIZ = new LinkedHashMap<>();

    @Override // X.InterfaceC1417610mzf
    public final void LIZ() {
    }

    @Override // X.InterfaceC1417610mzf
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1417610mzf
    public final void cancel() {
        for (C1417670mzl c1417670mzl : this.LIZIZ.values()) {
            if (c1417670mzl != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cancel. url=");
                sbLIZ.append(c1417670mzl.LIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                AbstractC1321260kUG abstractC1321260kUG = c1417670mzl.LIZIZ;
                if (abstractC1321260kUG != null) {
                    abstractC1321260kUG.close();
                }
            }
        }
        this.LIZIZ.clear();
    }

    public C1417460mzQ(VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = videoPublishEditModel;
    }
}
