package X;

import com.ss.android.ugc.aweme.slash.data.SlashApiResponse;
import com.ss.android.ugc.aweme.slash.data.SlashRequestParam;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: renamed from: X.0gu8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1183540gu8 implements InterfaceC1181300gqW {
    public static final boolean LJFF = true;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(802));
    public final int LIZIZ = 100;
    public long LIZJ = -1;
    public long LIZLLL;
    public int LJ;

    @Override // X.InterfaceC1181300gqW
    public final C11NZ<SlashApiResponse> LIZ(SlashRequestParam slashRequestParam) {
        if (LJFF) {
            return C11NZ.LJIJJLI(new C1209010hZD(this, slashRequestParam, 2));
        }
        return C11NZ.LJIJJLI(new C1209010hZD(this, slashRequestParam, 1));
    }
}
