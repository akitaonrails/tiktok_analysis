package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0qs5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1566670qs5 extends AbstractC1566610qrz {
    public final String LIZLLL;
    public final Function0<List<Aweme>> LJ;
    public final InterfaceC1566600qry LJFF;
    public final boolean LJI;

    @Override // X.AbstractC1566610qrz
    public final InterfaceC1566600qry LIZ() {
        return this.LJFF;
    }

    @Override // X.AbstractC1566610qrz
    public final String LIZIZ() {
        return this.LIZLLL;
    }

    public C1566670qs5(String str, AFwS213S0000000_24 aFwS213S0000000_24, C1566790qsH c1566790qsH, boolean z) {
        super(str, true, c1566790qsH);
        this.LIZLLL = str;
        this.LJ = aFwS213S0000000_24;
        this.LJFF = c1566790qsH;
        this.LJI = z;
    }
}
