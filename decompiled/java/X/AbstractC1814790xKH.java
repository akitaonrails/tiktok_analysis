package X;

import com.bytedance.android.livesdk.model.Board;
import com.bytedance.common.utility.Logger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xKH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1814790xKH extends C994110byb {
    public final Board LL;
    public final boolean LLILLJJLI;

    public Board LIZ() {
        return this.LL;
    }

    public boolean LIZIZ() {
        return this.LLILLJJLI;
    }

    @Override // X.C994110byb, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        if (interfaceC1891350zJl instanceof AbstractC1814790xKH) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("areContentsTheSame - ");
            AbstractC1814790xKH abstractC1814790xKH = (AbstractC1814790xKH) interfaceC1891350zJl;
            if (abstractC1814790xKH.LIZIZ() == LIZIZ() && Intrinsics.LJFF(abstractC1814790xKH.LIZ(), LIZ()) && abstractC1814790xKH.LIZ().status == LIZ().status) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(z);
            sbLIZ.append(" id: ");
            sbLIZ.append(LIZ().id);
            sbLIZ.append(" vs ");
            sbLIZ.append(abstractC1814790xKH.LIZ().id);
            sbLIZ.append(" ,board: ");
            sbLIZ.append(LIZ().hashCode());
            sbLIZ.append(" vs ");
            sbLIZ.append(abstractC1814790xKH.LIZ().hashCode());
            sbLIZ.append(" ,isDisplaying: ");
            sbLIZ.append(LIZIZ());
            sbLIZ.append(" vs ");
            sbLIZ.append(abstractC1814790xKH.LIZIZ());
            Logger.i("LiveBoardsItem", C2188811AlT.LIZIZ(sbLIZ));
            if (abstractC1814790xKH.LIZIZ() == LIZIZ() && Intrinsics.LJFF(abstractC1814790xKH.LIZ(), LIZ()) && abstractC1814790xKH.LIZ().status == LIZ().status) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.C994110byb, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        if (interfaceC1891350zJl instanceof AbstractC1814790xKH) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("areItemTheSame -");
            AbstractC1814790xKH abstractC1814790xKH = (AbstractC1814790xKH) interfaceC1891350zJl;
            if (abstractC1814790xKH.LIZ().id == LIZ().id) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(z);
            sbLIZ.append(" id: ");
            sbLIZ.append(LIZ().id);
            sbLIZ.append(" vs ");
            sbLIZ.append(abstractC1814790xKH.LIZ().id);
            sbLIZ.append(" ,board: ");
            sbLIZ.append(LIZ().hashCode());
            sbLIZ.append(" vs ");
            sbLIZ.append(abstractC1814790xKH.LIZ().hashCode());
            Logger.i("LiveBoardsItem", C2188811AlT.LIZIZ(sbLIZ));
            if (abstractC1814790xKH.LIZ().id == LIZ().id) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.C994110byb, X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof AbstractC1814790xKH) {
            AbstractC1814790xKH abstractC1814790xKH = (AbstractC1814790xKH) interfaceC1891350zJl;
            abstractC1814790xKH.LIZIZ();
            LIZIZ();
            abstractC1814790xKH.LIZ();
            LIZ();
            Intrinsics.LJFF(abstractC1814790xKH.LIZ().previewImageUri, LIZ().previewImageUri);
            return new Object() { // from class: X.0xKI
            };
        }
        return null;
    }

    public AbstractC1814790xKH(Board board, boolean z, int i, boolean z2) {
        this.LL = board;
        this.LLILLJJLI = z;
    }
}
