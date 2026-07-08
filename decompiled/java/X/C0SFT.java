package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0SFT, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SFT {
    public final Context LIZ;
    public final Aweme LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1668));

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedInteractionAreaInfo(context=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", showingMusicTitle=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", showingBottomBar=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", hasPlayListPrefix=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0SFT(Context context, Aweme aweme, boolean z, boolean z2, boolean z3) {
        this.LIZ = context;
        this.LIZIZ = aweme;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
    }
}
