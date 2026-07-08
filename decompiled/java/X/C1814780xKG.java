package X;

import android.graphics.Bitmap;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.BoardItem;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xKG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1814780xKG extends AbstractC1814790xKH {
    public final Board LLILLL;
    public final Bitmap LLILZ;
    public final boolean LLILZIL;
    public final int LLILZLL;
    public final boolean LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1814780xKG)) {
            return false;
        }
        C1814780xKG c1814780xKG = (C1814780xKG) obj;
        return Intrinsics.LJFF(this.LLILLL, c1814780xKG.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1814780xKG.LLILZ) && this.LLILZIL == c1814780xKG.LLILZIL && this.LLILZLL == c1814780xKG.LLILZLL && this.LLIZ == c1814780xKG.LLIZ;
    }

    public final int hashCode() {
        int iHashCode = this.LLILLL.hashCode() * 31;
        Bitmap bitmap = this.LLILZ;
        return ((((((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + this.LLILZLL) * 31) + C786410Ut5.Z2(this.LLIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveDecorationItem(board=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", localBitmap=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isDisplaying=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", displayAppealStatus=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", isSpoSponsorshipDisclosure=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1814790xKH
    public final Board LIZ() {
        return this.LLILLL;
    }

    @Override // X.AbstractC1814790xKH
    public final boolean LIZIZ() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC1814790xKH, X.C994110byb, X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        BoardItem boardItem;
        boolean z;
        BoardItem next;
        boolean z2;
        boolean z3;
        if (interfaceC1891350zJl instanceof AbstractC1814790xKH) {
            Iterator<BoardItem> it2 = this.LLILLL.boardItemList.iterator();
            while (true) {
                boardItem = null;
                z = false;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.boardItemType == 6) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AbstractC1814790xKH abstractC1814790xKH = (AbstractC1814790xKH) interfaceC1891350zJl;
            Iterator<BoardItem> it3 = abstractC1814790xKH.LIZ().boardItemList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                BoardItem next2 = it3.next();
                if (next2.boardItemType == 6) {
                    boardItem = next2;
                    break;
                }
            }
            if (abstractC1814790xKH.LIZIZ() != this.LLILZIL) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (abstractC1814790xKH.LIZ().status != this.LLILLL.status) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z4 = !Intrinsics.LJFF(abstractC1814790xKH.LIZ().previewImageUri, this.LLILLL.previewImageUri);
            if (boardItem == null || !Intrinsics.LJFF(boardItem, next)) {
                z = true;
            }
            return new C1828310xg5(z2, z3, z4, z);
        }
        return super.getChangePayload(interfaceC1891350zJl);
    }

    public C1814780xKG(Board board, Bitmap bitmap, boolean z, int i, boolean z2) {
        super(board, z, i, z2);
        this.LLILLL = board;
        this.LLILZ = bitmap;
        this.LLILZIL = z;
        this.LLILZLL = i;
        this.LLIZ = z2;
    }

    public static C1814780xKG LIZLLL(C1814780xKG c1814780xKG, Board board, boolean z, int i, int i2) {
        Bitmap bitmap;
        boolean z2;
        int i3 = i;
        boolean z3 = z;
        Board board2 = board;
        if ((i2 & 1) != 0) {
            board2 = c1814780xKG.LLILLL;
        }
        if ((i2 & 2) != 0) {
            bitmap = c1814780xKG.LLILZ;
        } else {
            bitmap = null;
        }
        if ((i2 & 4) != 0) {
            z3 = c1814780xKG.LLILZIL;
        }
        if ((i2 & 8) != 0) {
            i3 = c1814780xKG.LLILZLL;
        }
        if ((i2 & 16) != 0) {
            z2 = c1814780xKG.LLIZ;
        } else {
            z2 = false;
        }
        return new C1814780xKG(board2, bitmap, z3, i3, z2);
    }
}
