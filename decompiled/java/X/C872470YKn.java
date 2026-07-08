package X;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0YKn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C872470YKn implements InterfaceC872410YKh<Void> {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ String LIZIZ = "";
    public final /* synthetic */ C872420YKi LIZJ;

    @Override // X.InterfaceC872410YKh
    public final Void LIZ() {
        boolean z;
        C869580Y9k c869580Y9kLJI = this.LIZJ.LLJJIJIL.LJI();
        C872420YKi c872420YKi = this.LIZJ;
        List<C869590Y9l> listLJJZZI = c869580Y9kLJI.LJJZZI(c872420YKi.LLILLL, this.LIZ, c872420YKi.LL);
        this.LIZJ.LLJJIJIIJIL.LIZLLL().LJIIJJI("MessageModel initMessageListAroundIndexFromRemote, onRun");
        Iterator<C869590Y9l> it2 = listLJJZZI.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z = false;
                break;
            }
            if (it2.next().getIndex() == this.LIZ) {
                z = true;
                break;
            }
        }
        int size = listLJJZZI.size();
        C872420YKi c872420YKi2 = this.LIZJ;
        if (size >= c872420YKi2.LLILLL && z) {
            List<C0YNC> listLLILIL = c872420YKi2.LLJJIJIIJIL.LJIIZILJ().getDomain().LIZJ().LLILIL(this.LIZJ.LL, listLJJZZI);
            C868780Y6i c868780Y6iLIZLLL = this.LIZJ.LLJJIJIIJIL.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MessageModel initMessageListAroundIndexFromRemote, gaps found ");
            sbLIZ.append(listLLILIL.size());
            c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
            if (listLLILIL.isEmpty()) {
                boolean zLJJIFFI = this.LIZJ.LJJIFFI(listLJJZZI);
                boolean zLJJI = this.LIZJ.LJJI(listLJJZZI);
                C872420YKi c872420YKi3 = this.LIZJ;
                c872420YKi3.LLIZLLLIL = zLJJIFFI;
                c872420YKi3.LLIZ = zLJJI;
                c872420YKi3.LJIIZILJ(this.LIZ, this.LIZIZ, listLJJZZI);
                return null;
            }
        }
        C0Y8T c0y8tLJ = this.LIZJ.LJ();
        if (c0y8tLJ == null && (c0y8tLJ = this.LIZJ.LLJJIJIL.LJIIJJI().LIZ(this.LIZJ.LL, false)) == null) {
            this.LIZJ.LLJJIJIIJIL.LIZLLL().LJIIJJI("MessageModel initMessageListAroundIndexFromRemote, null conversation, do nothing");
            return null;
        }
        this.LIZJ.LLJJIJIIJIL.LIZLLL().LJIIJJI("MessageModel initMessageListAroundIndexFromRemote, load from remote");
        this.LIZJ.LLJJIJIIJIL.LJIIZILJ().getDomain().LIZJ().LLJJJ(this.LIZ, new C914150Ztd(this, 2), c0y8tLJ);
        return null;
    }

    public C872470YKn(C872420YKi c872420YKi, long j) {
        this.LIZJ = c872420YKi;
        this.LIZ = j;
    }
}
