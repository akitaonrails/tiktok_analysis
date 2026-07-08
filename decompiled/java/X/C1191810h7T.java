package X;

import Y.ACListenerS153S0100000_18;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.AbstractRefactorPoiReviewCell;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h7T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1191810h7T implements InterfaceC1192080h7u {
    public final Function0<InterfaceC1191710h7J> LIZ;
    public final Function0<Integer> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final C587440N2g LIZLLL;
    public InterfaceC1191840h7W LJ;
    public long LJFF = System.currentTimeMillis();

    @Override // X.InterfaceC1192080h7u
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1192080h7u
    public final void onResume(boolean z) {
    }

    public final void LIZLLL() {
        InterfaceC1191840h7W interfaceC1191840h7W;
        AbstractRefactorPoiReviewCell abstractRefactorPoiReviewCellLLLLLLIL;
        View view;
        Context context;
        InterfaceC1191840h7W interfaceC1191840h7W2 = this.LJ;
        if (interfaceC1191840h7W2 == null || interfaceC1191840h7W2.LJIL() == null || (interfaceC1191840h7W = this.LJ) == null || (abstractRefactorPoiReviewCellLLLLLLIL = interfaceC1191840h7W.LLLLLLIL()) == null || (view = abstractRefactorPoiReviewCellLLLLLLIL.itemView) == null || (context = view.getContext()) == null) {
            return;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LIZIZ(context.getResources().getString(2131844853));
        C985403tE.LIZ(c1397580mTM, new AwS384S0200000_18(context, this, 240));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    @Override // X.InterfaceC1192080h7u
    public final void LIZIZ(InterfaceC1191840h7W interfaceC1191840h7W) {
        this.LJ = interfaceC1191840h7W;
    }

    @Override // X.InterfaceC1192080h7u
    public final void LIZJ(PoiReviewsApi.PoiReviewModel poiReviewModel, List<? extends Object> list) {
        String str;
        View viewInvoke = this.LIZLLL.LIZ.invoke();
        if (viewInvoke == null) {
            return;
        }
        PoiReviewsApi.PoiReviewUserModel author = poiReviewModel.getAuthor();
        if (author != null) {
            str = author.userId;
        } else {
            str = null;
        }
        boolean zLJFF = Intrinsics.LJFF(str, C0XQ7.LJFF().getCurUserId());
        int i = 0;
        if (!zLJFF || ((C1190820h5s.LJFF(poiReviewModel) && !C1190820h5s.LJII(poiReviewModel)) || !this.LIZLLL.LIZIZ.invoke().booleanValue())) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewInvoke);
        C1191890h7b.LIZ(viewInvoke, 10, 10, 10, 10);
        C786410Ut5.I7(new ACListenerS153S0100000_18(this, 177), viewInvoke);
    }

    public C1191810h7T(AwS562S0100000_18 awS562S0100000_18, AwS562S0100000_18 awS562S0100000_182, AwS562S0100000_18 awS562S0100000_183, C587440N2g c587440N2g) {
        this.LIZ = awS562S0100000_18;
        this.LIZIZ = awS562S0100000_182;
        this.LIZJ = awS562S0100000_183;
        this.LIZLLL = c587440N2g;
    }
}
