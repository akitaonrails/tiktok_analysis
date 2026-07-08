package X;

import Y.AfS154S0200000_18;
import Y.AfS33S1300000_4;
import com.ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0gQJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1165050gQJ implements InterfaceC736910SvR<C613200O3i> {
    public final C054G LL;
    public final int LLILLJJLI;

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    @Override // X.InterfaceC736910SvR
    public final InterfaceC149400hg getOperator() {
        return new C613200O3i();
    }

    public C1165050gQJ() {
        C1DFH c1dfh = C0PEM.LIZ;
        this.LL = C2296808zG.LIZ(C2107308Nj.LIZ);
        this.LLILLJJLI = C1164030gOf.LIZ();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, X.01kM] */
    public static void LIZ(final String str, Function0 function0, final Function1 function1) {
        final C259800zU c259800zU = new C259800zU();
        MixFeedApi.LIZ.getClass();
        c259800zU.element = C1169360gXG.LIZ().manageMixFeed(EnumC1163900gOS.MIXDELETE.getOperation(), str, null, null, null, "", null).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS33S1300000_4(str, function0, function1, c259800zU, 1), new C09JN() { // from class: X.0D2X
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PlaylistManageRepo@fa57.deletePlaylist$2");
                Throwable th = (Throwable) obj;
                Function1<Throwable, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(th);
                }
                C589140N8u c589140N8u = C589140N8u.LJ;
                String str2 = str;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("failed, error message: ");
                sbLIZ.append(th.getMessage());
                c589140N8u.LJIJI(str2, C2188811AlT.LIZIZ(sbLIZ));
                InterfaceC420801kM interfaceC420801kM = c259800zU.element;
                if (interfaceC420801kM != null) {
                    interfaceC420801kM.dispose();
                }
                C1C7U.LIZIZ("PlaylistManageRepo@fa57.deletePlaylist$2");
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, X.01kM] */
    public static void LIZIZ(String str, String str2, String str3, boolean z, Function1 function1, Function1 function12) {
        C259800zU c259800zU = new C259800zU();
        MixFeedApi.LIZ.getClass();
        c259800zU.element = C1169360gXG.LIZ().getMixDetail(str, str2, str3, false, z, false, null, null).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS154S0200000_18(c259800zU, function1, 24), new C515801zg(function12, c259800zU, 47));
    }

    public final void LIZLLL(String str, String str2, long j, String str3, Boolean bool, InterfaceC1631620sYq<? super List<MixStruct>, ? super Boolean, ? super Long, Unit> interfaceC1631620sYq, Function1<? super Exception, Unit> function1) {
        C23250099c.LIZLLL(this.LL, null, null, new C0O3K(this, str, str2, j, str3, bool, interfaceC1631620sYq, function1, null), 3);
    }

    public static void LIZJ(C1165050gQJ c1165050gQJ, String str, int i, String str2, String str3, long j, Function1 function1, InterfaceC1631620sYq interfaceC1631620sYq, Function1 function12) {
        int i2 = c1165050gQJ.LLILLJJLI;
        if (j == 0) {
            c1165050gQJ.getClass();
            if (i == 2) {
                interfaceC1631620sYq.invoke(C13BV.INSTANCE, Boolean.FALSE, 0L);
                return;
            }
        }
        C23250099c.LIZLLL(c1165050gQJ.LL, null, null, new C0O3N(function1, i, interfaceC1631620sYq, function12, str, "", j, str2, str3, false, i2, 1, null), 3);
    }
}
