package X;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wIh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1775370wIh extends AbstractC1775260wIW implements InterfaceC1775470wIr {
    public long LJI;

    public abstract InterfaceC1775440wIo LJI();

    public abstract C1775180wIO LJII();

    @Override // X.InterfaceC1775470wIr
    public final void LIZLLL(Boolean bool) {
        String strLLLL;
        C1775180wIO c1775180wIOLJII = LJII();
        if (c1775180wIOLJII != null) {
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                strLLLL = EnumC1775410wIl.PLAYING.getStatus();
            } else if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
                strLLLL = EnumC1775410wIl.STOP.getStatus();
            } else {
                strLLLL = LJI().LLLL();
            }
            c1775180wIOLJII.LJIJJ = strLLLL;
        }
    }

    public AbstractC1775370wIh(ViewGroup viewGroup, C21341418fU c21341418fU) {
        super(viewGroup);
    }

    @Override // X.InterfaceC1775470wIr
    public final void LJ(Integer num, String str, String str2) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZ), null, null, new C1775340wIe(this, str, num, str2, null), 3);
    }
}
