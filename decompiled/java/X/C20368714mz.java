package X;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS397S0200000_31;

/* JADX INFO: renamed from: X.14mz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20368714mz extends AbstractC960470b6L<C1868280yiY> {
    public final InterfaceC20368414mw LL;
    public final C16F5 LLILLJJLI;
    public final C1841350y17 LLILLL;
    public final C19737012Ka LLILZ;
    public final ViewGroup LLILZIL;
    public final List<String> LLILZLL;

    public final void L5(final C1868280yiY c1868280yiY) {
        int iIntValue;
        this.LLILLJJLI.setText(c1868280yiY.LIZ.LIZLLL);
        this.LLILLL.setChecked(c1868280yiY.LIZ.LIZIZ);
        C500260Jjc.LJLIIIL(500L, this.LLILZIL, new AwS397S0200000_31(c1868280yiY, this, 117));
        this.LLILLL.setClickable(false);
        Integer num = c1868280yiY.LIZ.LIZ.duration;
        if (num == null || num.intValue() <= 0 || (num.intValue() / 10) - 1 < 0) {
            iIntValue = 0;
        }
        this.LLILZ.LJI(iIntValue);
        this.LLILZ.LJ(0, new InterfaceC489860JIy() { // from class: X.14n0
            @Override // X.InterfaceC489860JIy
            public final void LIZ(int i, String str) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("curIndex=");
                sbLIZ.append(i);
                sbLIZ.append(", curValue=");
                sbLIZ.append(str);
                C20441214yg.LJIIIZ("PlaybookConditionSelectTimeViewHolder", C2188811AlT.LIZIZ(sbLIZ));
                c1868280yiY.LIZ.LIZ.setDuration(Integer.valueOf((i + 1) * 10));
                this.N5(c1868280yiY);
            }
        });
    }

    public final void N5(C1868280yiY c1868280yiY) {
        if (!this.LLILLL.isChecked()) {
            this.LLILLL.setChecked(true);
            Integer num = c1868280yiY.LIZ.LIZ.duration;
            if (num == null || num.intValue() <= 0) {
                c1868280yiY.LIZ.LIZ.setDuration(10);
            }
            InterfaceC20368414mw interfaceC20368414mw = this.LL;
            if (interfaceC20368414mw != null) {
                interfaceC20368414mw.LIZ(c1868280yiY.LIZ);
            }
        }
    }

    public C20368714mz(View view, InterfaceC20368414mw interfaceC20368414mw) {
        String strLIZIZ;
        super(view);
        this.LL = interfaceC20368414mw;
        this.LLILLJJLI = (C16F5) view.findViewById(R.id.qoy);
        this.LLILLL = (C1841350y17) view.findViewById(R.id.qpa);
        this.LLILZ = (C19737012Ka) view.findViewById(R.id.qp_);
        this.LLILZIL = (ViewGroup) view.findViewById(R.id.qp9);
        String strLJIJI = C497740JfY.LJIJI(2131854666);
        String strLJIJI2 = C497740JfY.LJIJI(2131854667);
        ArrayList arrayList = new ArrayList();
        int i = 10;
        int iLIZ = C0GYY.LIZ(10, 120, 10);
        if (10 <= iLIZ) {
            while (true) {
                int i2 = i / 60;
                int i3 = i % 60;
                if (i2 == 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(i3);
                    sbLIZ.append(strLJIJI2);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else if (i3 == 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(i2);
                    sbLIZ2.append(strLJIJI);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(i2);
                    sbLIZ3.append(strLJIJI);
                    sbLIZ3.append(' ');
                    sbLIZ3.append(i3);
                    sbLIZ3.append(strLJIJI2);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                }
                arrayList.add(strLIZIZ);
                if (i == iLIZ) {
                    break;
                } else {
                    i += 10;
                }
            }
        }
        this.LLILZLL = arrayList;
        this.LLILZ.LIZLLL(arrayList);
    }

    @Override // X.AbstractC960470b6L
    public final /* bridge */ /* synthetic */ void I5(int i, Object obj) {
        L5((C1868280yiY) obj);
    }
}
