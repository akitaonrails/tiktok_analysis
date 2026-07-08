package X;

import Y.AComparatorS33S0000000_14;
import Y.AComparatorS513S0100000_14;
import java.util.List;

/* JADX INFO: renamed from: X.0YN4, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YN4 {
    public static final /* synthetic */ int LJFF = 0;
    public final C0YNF LIZ;
    public final InterfaceC863970Xut LIZIZ;
    public final C868780Y6i LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    public final List<C869840YAk> LIZ(String str, List<? extends C869590Y9l> list, C0YNC c0ync, boolean z) {
        List<C869840YAk> listLIZJ = this.LIZ.LIZJ(c0ync.LIZ, c0ync.LIZJ, str);
        C868780Y6i c868780Y6i = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("buildAndMergeSegments start with segments size ");
        sbLIZ.append(listLIZJ.size());
        C868780Y6i.LJIILJJIL(c868780Y6i, "MessageSegmentManager", C2188811AlT.LIZIZ(sbLIZ), 4);
        C0YND c0ynd = C0YND.LIZ;
        C868780Y6i c868780Y6i2 = this.LIZJ;
        InterfaceC863970Xut interfaceC863970Xut = this.LIZIZ;
        boolean z2 = this.LIZLLL;
        c0ynd.getClass();
        List<C869840YAk> listLIZ = C0YND.LIZ(str, list, c0ync, listLIZJ, c868780Y6i2, interfaceC863970Xut, z2);
        if (z) {
            this.LIZ.LIZLLL(listLIZJ, listLIZ);
        }
        return listLIZ;
    }

    public C0YN4(C0YNF c0ynf, InterfaceC863970Xut interfaceC863970Xut, C868780Y6i c868780Y6i, boolean z, boolean z2) {
        this.LIZ = c0ynf;
        this.LIZIZ = interfaceC863970Xut;
        this.LIZJ = c868780Y6i;
        this.LIZLLL = z;
        this.LJ = z2;
    }

    public final C869840YAk LIZIZ(C0Y8T c0y8t, List<? extends C869590Y9l> list, C0YNC c0ync, List<C869840YAk> list2, EnumC873090YMx enumC873090YMx) {
        C0YND c0ynd = C0YND.LIZ;
        String conversationId = c0y8t.getConversationId();
        C868780Y6i c868780Y6i = this.LIZJ;
        InterfaceC863970Xut interfaceC863970Xut = this.LIZIZ;
        boolean z = this.LIZLLL;
        c0ynd.getClass();
        List<C869840YAk> listLJLLLL = C13LP.LJLLLL(new AComparatorS513S0100000_14(new AComparatorS33S0000000_14(13), 4), C0YND.LIZ(conversationId, list, c0ync, list2, c868780Y6i, interfaceC863970Xut, z));
        this.LIZ.LIZLLL(list2, listLJLLLL);
        if (listLJLLLL.isEmpty()) {
            this.LIZJ.LJIIIIZZ("MessageSegmentManager", "rebuildSegmentsByLinkage: mergedMsgSegment is empty after rebuild, unexpected state", null);
            return null;
        }
        if (enumC873090YMx == EnumC873090YMx.FROM_OLD_TO_NEW) {
            return (C869840YAk) C13LP.LJJJJZI(listLJLLLL);
        }
        return (C869840YAk) C13LP.LJJLIIIJJI(listLJLLLL);
    }
}
