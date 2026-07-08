package X;

import Y.ACListenerS95S0300000_31;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.condition.ConditionParams;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14mu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20368214mu extends AbstractC960470b6L<C1868270yiX> {
    public final InterfaceC20368414mw LL;
    public final C16F5 LLILLJJLI;
    public final C1841350y17 LLILLL;
    public final ViewGroup LLILZ;
    public final ArrayList<C16F5> LLILZIL;

    public final void L5(C1868270yiX c1868270yiX) {
        Integer num;
        String string;
        Integer numLJJLIIJ;
        int size = c1868270yiX.LIZ.LJ.size();
        Iterator<C16F5> it2 = this.LLILZIL.iterator();
        int i = 0;
        while (true) {
            C16F5 c16f5 = null;
            if (it2.hasNext()) {
                C16F5 next = it2.next();
                int i2 = i + 1;
                if (i >= 0) {
                    C16F5 c16f52 = next;
                    if (i < size) {
                        c16f52.setText(String.valueOf(((Number) ListProtector.get(c1868270yiX.LIZ.LJ, i)).intValue()));
                        C12ES.LJIILL(0, c16f52);
                        c16f52.setSelected(false);
                    } else if (size <= 0) {
                        C439101nJ.LJI(c16f52);
                    } else if (size <= 4) {
                        if (i < 4) {
                            C12ES.LJIILL(4, c16f52);
                        } else {
                            C439101nJ.LJI(c16f52);
                        }
                    } else {
                        C12ES.LJIILL(4, c16f52);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                ConditionParams conditionParamsLJIIJ = C20359314lT.LJIIJ(c1868270yiX.LIZ.LIZ.params);
                if (conditionParamsLJIIJ != null && (num = conditionParamsLJIIJ.micCount) != null) {
                    int iIntValue = num.intValue();
                    Iterator<C16F5> it3 = this.LLILZIL.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        C16F5 next2 = it3.next();
                        CharSequence text = next2.getText();
                        if (text != null && (string = text.toString()) != null && (numLJJLIIJ = C500260Jjc.LJJLIIJ(string)) != null && numLJJLIIJ.intValue() == iIntValue) {
                            c16f5 = next2;
                            break;
                        }
                    }
                    C16F5 c16f53 = c16f5;
                    if (c16f53 != null) {
                        c16f53.setSelected(true);
                    }
                }
                for (C16F5 c16f54 : this.LLILZIL) {
                    C786410Ut5.l8(c16f54, new ACListenerS95S0300000_31(c1868270yiX, c16f54, this, 1));
                }
                this.LLILLJJLI.setText(c1868270yiX.LIZ.LIZLLL);
                this.LLILLL.setChecked(c1868270yiX.LIZ.LIZIZ);
                C500260Jjc.LJLIIIL(500L, this.LLILZ, new AwS397S0200000_31(this, c1868270yiX, 115));
                this.LLILLL.setClickable(false);
                return;
            }
        }
    }

    public final void N5(C1868270yiX c1868270yiX) {
        int iIntValue;
        if (!this.LLILLL.isChecked()) {
            this.LLILLL.setChecked(true);
            Integer num = (Integer) C13LP.LJJJLL(c1868270yiX.LIZ.LJ);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 1;
            }
            ConditionParams conditionParamsLJIIJ = C20359314lT.LJIIJ(c1868270yiX.LIZ.LIZ.params);
            C16F5 c16f5 = null;
            if (conditionParamsLJIIJ == null || conditionParamsLJIIJ.micCount == null) {
                Iterator<C16F5> it2 = this.LLILZIL.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C16F5 next = it2.next();
                    if (Intrinsics.LJFF(next.getText(), String.valueOf(iIntValue))) {
                        c16f5 = next;
                        break;
                    }
                }
                C16F5 c16f52 = c16f5;
                if (c16f52 != null) {
                    c16f52.setSelected(true);
                }
                c1868270yiX.LIZ.LIZ.setParams(C20359314lT.LIZ(new ConditionParams(Integer.valueOf(iIntValue))));
                c1868270yiX.LIZ.LIZ.setOperator("GREATER_THAN_OR_EQUAL_TO");
            }
            InterfaceC20368414mw interfaceC20368414mw = this.LL;
            if (interfaceC20368414mw != null) {
                interfaceC20368414mw.LIZ(c1868270yiX.LIZ);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20368214mu(View view, InterfaceC20368414mw interfaceC20368414mw) {
        super(view);
        this.LL = interfaceC20368414mw;
        this.LLILLJJLI = (C16F5) view.findViewById(R.id.qoy);
        this.LLILLL = (C1841350y17) view.findViewById(R.id.qpa);
        this.LLILZ = (ViewGroup) view.findViewById(R.id.qp9);
        this.LLILZIL = C1697810uHb.LJ(view.findViewById(R.id.qoz), view.findViewById(R.id.qp0), view.findViewById(R.id.qp1), view.findViewById(R.id.qp2), view.findViewById(R.id.qp3), view.findViewById(R.id.qp4), view.findViewById(R.id.qp5), view.findViewById(R.id.qp6));
    }

    @Override // X.AbstractC960470b6L
    public final /* bridge */ /* synthetic */ void I5(int i, Object obj) {
        L5((C1868270yiX) obj);
    }
}
