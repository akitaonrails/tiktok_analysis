package X;

import com.ss.android.ugc.aweme.music.dsp.dm.repo.Dsp2ttDmRepoOperator;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O1M, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O1M implements InterfaceC736910SvR<Dsp2ttDmRepoOperator> {
    public static final C01GW<C0O4P<MusicDetail>> LL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(494));

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    @Override // X.InterfaceC736910SvR
    public final InterfaceC149400hg getOperator() {
        return new Dsp2ttDmRepoOperator() { // from class: X.0O3H
            @Override // com.ss.android.ugc.aweme.music.dsp.dm.repo.Dsp2ttDmRepoOperator
            public final InterfaceC346201Wa<C0O7A<C0O1N>> getMusicDetail(String str) {
                C613960O6g c613960O6gLIZIZ = C613940O6e.LIZ().LIZIZ(new C0O3V(str));
                C0O4P<MusicDetail> value = C0O1M.LL.getValue();
                AFwS292S0000000_9 aFwS292S0000000_9 = AFwS292S0000000_9.get$arr$(64);
                AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(881);
                Intrinsics.LJFF(MusicDetail.class, C0O1N.class);
                c613960O6gLIZIZ.LIZ(new C0O8D(new C0O70(value, aFwS292S0000000_9, aFwS240S0000000_9, C0O1N.class, MusicDetail.class)));
                C0O7F.LIZIZ(c613960O6gLIZIZ, C0O3P.NetWhenCacheMiss);
                return c613960O6gLIZIZ.LIZIZ();
            }
        };
    }
}
