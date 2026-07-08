package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0Lfh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C548790Lfh {
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0Lfc, X.0Lfd] */
    public static final InterfaceC548750Lfd LIZ(final InterfaceC548750Lfd interfaceC548750Lfd, Object obj) {
        InterfaceC548750Lfd interfaceC548750LfdLIZ;
        if (obj == null || (interfaceC548750LfdLIZ = C548910Lft.LIZ(obj)) == null) {
            return interfaceC548750Lfd;
        }
        if (interfaceC548750Lfd instanceof C548740Lfc) {
            C548740Lfc c548740Lfc = (C548740Lfc) interfaceC548750Lfd;
            C548740Lfc.LIZ(c548740Lfc, interfaceC548750LfdLIZ);
            return c548740Lfc;
        }
        ?? r0 = new AbstractC548720Lfa(interfaceC548750Lfd) { // from class: X.0Lfc
            public final String LL = "MultiAIGCMobDataSource";
            public final List<InterfaceC548750Lfd> LLILLJJLI;

            @Override // X.InterfaceC548750Lfd
            public final String getName() {
                return this.LL;
            }

            @Override // X.AbstractC548720Lfa
            public final List<InterfaceC548750Lfd> provideDataSources() {
                return this.LLILLJJLI;
            }

            {
                this.LLILLJJLI = new ArrayList(LIZIZ(interfaceC548750Lfd));
            }

            public static List LIZIZ(InterfaceC548750Lfd interfaceC548750Lfd2) {
                if (interfaceC548750Lfd2 instanceof AbstractC548720Lfa) {
                    List<InterfaceC548750Lfd> listProvideDataSources = ((AbstractC548720Lfa) interfaceC548750Lfd2).provideDataSources();
                    ArrayList arrayList = new ArrayList();
                    Iterator<InterfaceC548750Lfd> it2 = listProvideDataSources.iterator();
                    while (it2.hasNext()) {
                        C19719612Di.LJJI(LIZIZ(it2.next()), arrayList);
                    }
                    return arrayList;
                }
                return Collections.singletonList(interfaceC548750Lfd2);
            }

            public static void LIZ(C548740Lfc c548740Lfc2, InterfaceC548750Lfd interfaceC548750Lfd2) {
                c548740Lfc2.getClass();
                for (InterfaceC548750Lfd interfaceC548750Lfd3 : LIZIZ(interfaceC548750Lfd2)) {
                    C19719612Di.LJJIIJ(c548740Lfc2.LLILLJJLI, new AwS587S0100000_8(interfaceC548750Lfd3, 635), true);
                    ((ArrayList) c548740Lfc2.LLILLJJLI).add(interfaceC548750Lfd3);
                }
                C547140Ld2 c547140Ld2 = C547130Ld1.LIZIZ;
                String str = c548740Lfc2.LL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("bindDataSource:");
                sbLIZ.append(C13LP.LJJLIIIJ(c548740Lfc2.LLILLJJLI, ",", null, null, 0, null, AFwS239S0000000_8.get$arr$(282), 30));
                c547140Ld2.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        C548740Lfc.LIZ(r0, interfaceC548750LfdLIZ);
        return r0;
    }
}
