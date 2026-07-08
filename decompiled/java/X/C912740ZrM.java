package X;

import Y.ACListenerS149S0100000_14;
import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0ZrM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C912740ZrM extends C893640Z3y {
    public final View LL;
    public final C054G LLILLJJLI;
    public Animator LLILLL;
    public EnumC912750ZrN LLILZ;
    public EnumC912790ZrR LLILZIL;
    public InterfaceC912720ZrK LLILZLL;

    @Override // X.C893640Z3y
    public final boolean LIZJ() {
        return this.LLILZ == EnumC912750ZrN.VISIBLE;
    }

    public final Animator getCurrentAnimator() {
        return this.LLILLL;
    }

    public final EnumC912750ZrN getCurrentDisplayState() {
        return this.LLILZ;
    }

    public final EnumC912790ZrR getLastEntryState() {
        return this.LLILZIL;
    }

    public final View getMaskViewContainer() {
        return this.LL;
    }

    public final InterfaceC912720ZrK getPopupCallback() {
        return this.LLILZLL;
    }

    public final InterfaceC497601wk getScope() {
        return this.LLILLJJLI;
    }

    public final void setCurrentAnimator(Animator animator) {
        this.LLILLL = animator;
    }

    public final void setCurrentDisplayState(EnumC912750ZrN enumC912750ZrN) {
        this.LLILZ = enumC912750ZrN;
    }

    public final void setLastEntryState(EnumC912790ZrR enumC912790ZrR) {
        this.LLILZIL = enumC912790ZrR;
    }

    public final void setPopupCallback(InterfaceC912720ZrK interfaceC912720ZrK) {
        this.LLILZLL = interfaceC912720ZrK;
    }

    public C912740ZrM(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static Object LIZLLL(View view, InterfaceC1364105Vn interfaceC1364105Vn) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        if (view.isLaidOut() && !view.isLayoutRequested()) {
            Unit unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
            c23260099m.resumeWith(unit);
        } else {
            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC913850Zt9(c23260099m, 0));
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }

    public C912740ZrM(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLILLJJLI = C2296808zG.LIZ(C2107308Nj.LIZ);
        this.LLILZ = EnumC912750ZrN.HIDDEN;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.cqr, this, true);
        View viewFindViewById = findViewById(R.id.nqh);
        this.LL = viewFindViewById;
        int i2 = C20094413jq.LJIIZILJ;
        C1397760mTe c1397760mTe = new C1397760mTe();
        c1397760mTe.LIZ = C1383370m6R.LJIIJ(2131828871);
        c1397760mTe.LJFF = C1383370m6R.LJIIJ(2131828871);
        C20094813ju.LIZ(viewFindViewById, c1397760mTe.LIZ());
        C786410Ut5.I7(new ACListenerS149S0100000_14(this, 23), viewFindViewById);
        this.LLILZIL = EnumC912790ZrR.FROM_START;
    }
}
