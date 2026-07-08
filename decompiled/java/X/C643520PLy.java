package X;

import Y.ARunnableS110S0100000_10;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import java.util.Set;
import kotlin.jvm.internal.AwS45S0500000_10;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: renamed from: X.0PLy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C643520PLy implements C0PJT {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final C0PNX LIZLLL;
    public final C0PI7 LJ;
    public final InterfaceC642940PJs LJFF;
    public final Integer LJI;
    public final String LJII;
    public C11JL LJIIIIZZ;
    public SearchMixFeedList LJIIIZ;
    public String LJIIJ;
    public C0PI9 LJIIJJI;
    public C0PHT LJIIL;

    @Override // X.C0PJT
    public final void release() {
        C11JL c11jl = this.LJIIIIZZ;
        if (c11jl != null) {
            c11jl.dispose();
        }
    }

    @Override // X.C0PJO
    public final void LIZ(C0PHT c0pht, Set set, Set set2, AwS589S0100000_10 awS589S0100000_10, AwS589S0100000_10 awS589S0100000_102) {
        this.LJIIL = c0pht;
        if (C300610BqN.LIZ() && C0BQZ.LIZ()) {
            C644770PQt c644770PQt = C644770PQt.LIZ;
            AwS45S0500000_10 awS45S0500000_10 = new AwS45S0500000_10(this, set, set2, awS589S0100000_10, awS589S0100000_102, 1);
            c644770PQt.getClass();
            System.currentTimeMillis();
            C2252051DCp c2252051DCp = C2252051DCp.LIZ;
            ARunnableS110S0100000_10 aRunnableS110S0100000_10 = new ARunnableS110S0100000_10(awS45S0500000_10, 128);
            c2252051DCp.getClass();
            C2252051DCp.LJFF().execute(aRunnableS110S0100000_10);
            return;
        }
        LIZIZ(null, this.LJFF.LJIIIZ(this.LJIIJ), set, set2, awS589S0100000_10, awS589S0100000_102);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0261 A[Catch: ExecutionException -> 0x02a0, TRY_LEAVE, TryCatch #0 {ExecutionException -> 0x02a0, blocks: (B:91:0x0221, B:93:0x0261), top: B:101:0x0221 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.google.gson.h r78, final int r79, java.util.Set<java.lang.String> r80, final java.util.Set<java.lang.String> r81, final kotlin.jvm.functions.Function1<? super android.os.Message, kotlin.Unit> r82, kotlin.jvm.functions.Function1<? super android.os.Message, kotlin.Unit> r83) {
        /*
            Method dump skipped, instruction units count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C643520PLy.LIZIZ(com.google.gson.h, int, java.util.Set, java.util.Set, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void");
    }

    public C643520PLy(String str, String str2, String str3, C0PNX c0pnx, C0PI7 c0pi7, C0PJH c0pjh, Integer num, String str4) {
        String strLIZJ;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = c0pnx;
        this.LJ = c0pi7;
        this.LJFF = c0pjh;
        this.LJI = num;
        this.LJII = str4;
        SearchMixFeedList searchMixFeedList = this.LJIIIZ;
        this.LJIIJ = (searchMixFeedList == null || (strLIZJ = C0PI4.LIZJ(searchMixFeedList)) == null) ? "" : strLIZJ;
    }
}
