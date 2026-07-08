package X;

import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinPhotoItem;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinVoiceItem;
import java.util.List;

/* JADX INFO: renamed from: X.0OO6, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OO6 {
    public static BulletinBaseItem LIZ(BulletinBaseItem bulletinBaseItem, boolean z, int i, boolean z2, boolean z3, boolean z4, int i2, List list, String str, int i3) {
        int iLJJJLZIJ;
        BulletinBaseItem bulletinBaseItemLLIIIL;
        String strLJJJJLI = str;
        List listLJIJJLI = list;
        int iLJJJJI = i2;
        boolean zLJJZZIII = z3;
        boolean zLJJIL = z;
        boolean zLJLIIIL = z4;
        int iLJJIJL = i;
        boolean zLJJJJ = z2;
        if ((i3 & 1) != 0) {
            zLJJIL = bulletinBaseItem.LJJIL();
        }
        if ((i3 & 2) != 0) {
            iLJJIJL = bulletinBaseItem.LJJIJL();
        }
        if ((i3 & 4) != 0) {
            zLJJJJ = bulletinBaseItem.LJJJJ();
        }
        if ((i3 & 8) != 0) {
            zLJJZZIII = bulletinBaseItem.LJJZZIII();
        }
        if ((i3 & 16) != 0) {
            zLJLIIIL = bulletinBaseItem.LJLIIIL();
        }
        if ((i3 & 32) != 0) {
            iLJJJJI = bulletinBaseItem.LJJJJI();
        }
        if ((i3 & 64) != 0) {
            listLJIJJLI = bulletinBaseItem.LJIJJLI();
        }
        if ((i3 & 128) != 0) {
            strLJJJJLI = bulletinBaseItem.LJJJJLI();
        }
        if ((i3 & 256) != 0) {
            iLJJJLZIJ = bulletinBaseItem.LJJJLZIJ();
        } else {
            iLJJJLZIJ = 0;
        }
        if (bulletinBaseItem instanceof C0OOP) {
            bulletinBaseItemLLIIIL = C0OOP.LLIIIL((C0OOP) bulletinBaseItem, zLJJIL, zLJJZZIII, zLJLIIIL, zLJJJJ, iLJJIJL, iLJJJJI, listLJIJJLI, strLJJJJLI, null, 249053179);
        } else if (bulletinBaseItem instanceof BulletinPhotoItem) {
            bulletinBaseItemLLIIIL = BulletinPhotoItem.LLIIIL((BulletinPhotoItem) bulletinBaseItem, zLJJIL, zLJJZZIII, zLJLIIIL, zLJJJJ, iLJJIJL, iLJJJJI, listLJIJJLI, strLJJJJLI, null, 28708861);
        } else if (bulletinBaseItem instanceof C0OOO) {
            bulletinBaseItemLLIIIL = C0OOO.LLIIIL((C0OOO) bulletinBaseItem, zLJJIL, zLJJZZIII, zLJLIIIL, zLJJJJ, iLJJIJL, iLJJJJI, listLJIJJLI, strLJJJJLI, iLJJJLZIJ, 7561469);
        } else if (bulletinBaseItem instanceof C0OON) {
            C0OON c0oon = (C0OON) bulletinBaseItem;
            int i4 = C0OON.LLJL;
            bulletinBaseItemLLIIIL = new C0OON(c0oon.LLILZLL, zLJJIL, c0oon.LLIZLLLIL, c0oon.LLJ, c0oon.LLJI, c0oon.LLJIJIL, c0oon.LLJILJIL, c0oon.LLJILJILJ, c0oon.LLJILLL, zLJJZZIII, zLJLIIIL, zLJJJJ, iLJJIJL, iLJJJJI, c0oon.LLJJIJIL, c0oon.LLJJJ, listLJIJJLI, c0oon.LLJJJJ, c0oon.LLJJJJJIL, c0oon.LLJJJJLIIL, c0oon.LLJJL, strLJJJJLI);
        } else if (bulletinBaseItem instanceof C0OOV) {
            bulletinBaseItemLLIIIL = C0OOV.LLIIIL((C0OOV) bulletinBaseItem, zLJJIL, zLJJZZIII, zLJLIIIL, zLJJJJ, iLJJIJL, iLJJJJI, listLJIJJLI, 0, null, strLJJJJLI, null, 62894205);
        } else if (bulletinBaseItem instanceof C0OO5) {
            C0OO5 c0oo5 = (C0OO5) bulletinBaseItem;
            bulletinBaseItemLLIIIL = new C0OO5(c0oo5.LLILZLL, c0oo5.LLIZ, c0oo5.LLIZLLLIL, c0oo5.LLJ, c0oo5.LLJI, c0oo5.LLJIJIL, c0oo5.LLJILJIL, iLJJJJI, c0oo5.LLJILLL, c0oo5.LLJJ, c0oo5.LLJJI, c0oo5.LLJJIII, c0oo5.LLJJIJI, c0oo5.LLJJIJIIJIL);
        } else if (bulletinBaseItem instanceof C0OO7) {
            C0OO7 c0oo7 = (C0OO7) bulletinBaseItem;
            bulletinBaseItemLLIIIL = new C0OO7(c0oo7.LLILZLL, c0oo7.LLIZ, c0oo7.LLIZLLLIL, c0oo7.LLJ, c0oo7.LLJI, zLJJZZIII, zLJLIIIL, iLJJJJI, c0oo7.LLJILLL);
        } else if (bulletinBaseItem instanceof C0OKH) {
            C0OKH c0okh = (C0OKH) bulletinBaseItem;
            bulletinBaseItemLLIIIL = new C0OKH(c0okh.LLIZ, c0okh.LLILZLL, iLJJJJI, c0okh.LLJ);
        } else if (bulletinBaseItem instanceof C0OKG) {
            bulletinBaseItemLLIIIL = new C0OKG(((C0OKG) bulletinBaseItem).LLILZLL, iLJJJJI);
        } else if (bulletinBaseItem instanceof C618680OOk) {
            bulletinBaseItemLLIIIL = C618680OOk.LLIIIL((C618680OOk) bulletinBaseItem, null, zLJJIL, zLJJZZIII, zLJLIIIL, zLJJJJ, iLJJIJL, iLJJJJI, 0, strLJJJJLI, 508351);
        } else if (bulletinBaseItem instanceof BulletinVoiceItem) {
            bulletinBaseItemLLIIIL = BulletinVoiceItem.LLIIIL((BulletinVoiceItem) bulletinBaseItem, null, zLJJIL, zLJJZZIII, zLJLIIIL, zLJJJJ, iLJJIJL, iLJJJJI, listLJIJJLI, strLJJJJLI, iLJJJLZIJ, -845612033);
        } else {
            bulletinBaseItemLLIIIL = bulletinBaseItem;
        }
        bulletinBaseItemLLIIIL.LLILLL = bulletinBaseItem.LLILLL;
        return bulletinBaseItemLLIIIL;
    }
}
