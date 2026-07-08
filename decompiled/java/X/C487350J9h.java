package X;

import com.ss.android.ugc.aweme.feed.interest.card.InterestCardCellComponent;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0J9h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C487350J9h extends C09AY implements InterfaceC1631620sYq<InterestCardCellComponent, Boolean, Integer, Unit> {
    public C487350J9h() {
        super(3);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(InterestCardCellComponent interestCardCellComponent, Boolean bool, Integer num) {
        C197039127h c197039127h;
        boolean zBooleanValue = bool.booleanValue();
        int iIntValue = num.intValue();
        C1735500vGO c1735500vGO = interestCardCellComponent.LLLF;
        if (c1735500vGO != null && (c197039127h = c1735500vGO.LLILLL) != null) {
            c197039127h.setEnabled(zBooleanValue);
            c197039127h.setText(c197039127h.getContext().getString(2131836208, Integer.valueOf(iIntValue)));
        }
        return Unit.LIZ;
    }
}
