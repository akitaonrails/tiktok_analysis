package X;

import X.EnumC1711310udN;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.n;
import com.ss.android.ugc.aweme.pipo.cashier.refund.api.model.RefundArrivingTime;
import com.ss.android.ugc.aweme.pipo.cashier.refund.embedded.vo.EmptyRefundCashierCell;
import com.ss.android.ugc.aweme.pipo.cashier.refund.embedded.vo.RefundOptionCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: renamed from: X.0ufW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1712640ufW extends FrameLayout implements InterfaceC1711260udI {
    public C0DWG LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public LinearLayout LLILZ;
    public final C1712640ufW LLILZIL;
    public List<C1712670ufZ> LLILZLL;
    public EnumC1709240ua2 LLIZ;
    public EnumC1711310udN LLIZLLLIL;
    public int LLJ;
    public C1712670ufZ LLJI;
    public String LLJIJIL;
    public Function1<? super C1711280udK, Unit> LLJILJIL;
    public Function1<? super AbstractC1711120ud4, Unit> LLJILJILJ;
    public final AwS605S0100000_26 LLJILLL;

    public final void LIZLLL() {
        C1712670ufZ c1712670ufZ;
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("RefundCashier");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notifyOptionSelect ");
        sbLIZ.append(this.LLJ);
        c1708720uZCLIZ.LIZ(3, C2188811AlT.LIZIZ(sbLIZ));
        List<C1712670ufZ> list = this.LLILZLL;
        n nVar = null;
        if (list == null || (c1712670ufZ = (C1712670ufZ) C13LP.LJJJLZIJ(this.LLJ, list)) == null) {
            Function1<? super C1711280udK, Unit> function1 = this.LLJILJIL;
            C1712660ufY.LIZ.getClass();
            function1.invoke(new C1711280udK("", "", ""));
            this.LLJILJILJ.invoke(C1711230udF.LIZ);
            return;
        }
        Function1<? super C1711280udK, Unit> function12 = this.LLJILJIL;
        C1712660ufY c1712660ufY = C1712660ufY.LIZ;
        EnumC1709240ua2 enumC1709240ua2 = this.LLIZ;
        c1712660ufY.getClass();
        String strLIZIZ = C1712660ufY.LIZIZ(c1712670ufZ.LLJI, c1712670ufZ.LLJIJIL);
        RefundArrivingTime refundArrivingTime = c1712670ufZ.LLJJ;
        if (refundArrivingTime != null) {
            nVar = new n();
            nVar.LJJIII(refundArrivingTime.refundArrivingFrom, "refund_arriving_from");
            nVar.LJJIII(refundArrivingTime.refundArrivingTo, "refund_arriving_to");
        }
        function12.invoke(new C1711280udK(strLIZIZ, C1712660ufY.LIZ(c1712670ufZ.LLJIJIL, nVar), C1712660ufY.LIZJ(c1712670ufZ.LLIZLLLIL, enumC1709240ua2)));
        this.LLJILJILJ.invoke(C1711220udE.LIZ);
    }

    public final TuxTextView getCashierDescFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dh3);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C0DWG getCashierRefundOptionListFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dh4);
            this.LL = (C0DWG) callbackFindViewById;
        }
        return (C0DWG) callbackFindViewById;
    }

    public final TuxTextView getCashierTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dh5);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout getRefundRootContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.t37);
            this.LLILZ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getCashierRefundOptionListFromXml().LJIILJJIL(EmptyRefundCashierCell.class, RefundOptionCell.class);
        C0DWG cashierRefundOptionListFromXml = getCashierRefundOptionListFromXml();
        final Context context = getContext();
        cashierRefundOptionListFromXml.setLayoutManager(new LinearLayoutManager(context) { // from class: com.ss.android.ugc.aweme.pipo.cashier.refund.embedded.LegacyRefundContentView$onAttachedToWindow$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final boolean canScrollHorizontally() {
                return false;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final boolean canScrollVertically() {
                return this.LL.LLIZLLLIL == EnumC1711310udN.MAIN;
            }
        });
        getCashierRefundOptionListFromXml().setItemAnimator(null);
    }

    @Override // X.InterfaceC1711260udI
    public View getContentView() {
        return this.LLILZIL;
    }

    public C1712640ufW(Context context) {
        super(context, null, 0);
        this.LLILZIL = this;
        this.LLIZ = EnumC1709240ua2.DEFAULT;
        this.LLIZLLLIL = EnumC1711310udN.EMBEDDED;
        this.LLJ = -1;
        this.LLJIJIL = "";
        this.LLJILJIL = AFwS268S0000000_26.get$arr$(523);
        this.LLJILJILJ = AFwS268S0000000_26.get$arr$(522);
        this.LLJILLL = new AwS605S0100000_26(this, 384);
        addView(C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dvz, this, false), new FrameLayout.LayoutParams(-1, -2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
    }

    @Override // X.InterfaceC1711260udI
    public final void LIZ(EnumC1709240ua2 enumC1709240ua2) {
        List<C1712670ufZ> listLLIIII;
        boolean z;
        this.LLIZ = enumC1709240ua2;
        List<C1712670ufZ> list = this.LLILZLL;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            int i = 0;
            for (C1712670ufZ c1712670ufZ : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    C1712670ufZ c1712670ufZ2 = c1712670ufZ;
                    EnumC1709240ua2 enumC1709240ua22 = this.LLIZ;
                    if (i == this.LLJ) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList.add(C1712670ufZ.LIZ(c1712670ufZ2, enumC1709240ua22, z, 32702));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            listLLIIII = C13LP.LLIIII(arrayList);
        } else {
            listLLIIII = null;
        }
        this.LLILZLL = listLLIIII;
        if (listLLIIII != null) {
            getCashierRefundOptionListFromXml().getState().LJIILL(listLLIIII, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Runnable, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // X.InterfaceC1711260udI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C1711330udP r56) {
        /*
            Method dump skipped, instruction units count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1712640ufW.LIZIZ(X.0udP):void");
    }

    @Override // X.InterfaceC1711260udI
    public final void LIZJ(EnumC1711310udN enumC1711310udN) {
        this.LLIZLLLIL = enumC1711310udN;
        int i = C1711320udO.LIZ[enumC1711310udN.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C786410Ut5.LLLLZLL(getCashierTitleFromXml(), 8);
                C786410Ut5.LLLLZLL(getCashierDescFromXml(), 8);
                getRefundRootContainerFromXml().setPadding(getRefundRootContainerFromXml().getPaddingLeft(), 0, getRefundRootContainerFromXml().getPaddingRight(), 0);
                return;
            }
            throw new C1954807lC();
        }
    }

    public final void setCashierDescFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setCashierRefundOptionListFromXml(C0DWG c0dwg) {
        this.LL = c0dwg;
    }

    public final void setCashierTitleFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setRefundRootContainerFromXml(LinearLayout linearLayout) {
        this.LLILZ = linearLayout;
    }
}
