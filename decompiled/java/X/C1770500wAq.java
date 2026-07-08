package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0wAq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1770500wAq {
    public final String LIZ;
    public final Keva LIZIZ;

    public C1770500wAq(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_frequency");
        this.LIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LIZIZ = Keva.getRepo("EcSearchFeedVideoGuideFrequencyKeva");
    }
}
