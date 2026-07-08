package X;

import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0a0F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C918250a0F {
    public static final void LIZ(boolean z) {
        InterfaceC975810bV5 interfaceC975810bV5LIZLLL;
        GiftMode giftMode;
        InterfaceC975870bVB interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF();
        if (interfaceC975870bVBLJFF == null || !interfaceC975870bVBLJFF.LJJ() || !C156900it.LJIIJ()) {
            return;
        }
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLILZLL, 10));
        Iterator<C954460awe> it2 = listLLILZLL.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().LJ));
        }
        if ((arrayList.size() > 1 && !C156900it.LIZ()) || (interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL()) == null || (giftMode = (GiftMode) C13LP.LJJJLL(C156900it.LJII(C156900it.LJI()))) == null) {
            return;
        }
        interfaceC975810bV5LIZLLL.LJJIIJZLJL(giftMode, true, true);
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(z);
        if (interfaceC973730bRjYf2 != null) {
            interfaceC973730bRjYf2.LJJLJ(giftMode);
        }
    }
}
