package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lvp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1376790lvp implements InterfaceC1370310llN, InterfaceC1370280llK {
    public final C1373790lqz LL;
    public C21411818qq LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1397));

    @Override // X.InterfaceC1370280llK
    public final void LIZIZ(Context context, ViewGroup viewGroup) {
    }

    @Override // X.InterfaceC1370310llN
    public final float LIZLLL() {
        return -1.0f;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJIILJJIL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIJJLI() {
        return 0;
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJJIJIIJIL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJIL() {
        return true;
    }

    @Override // X.InterfaceC1370310llN
    public final String LJJIZ() {
        return "";
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJJI(BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJJJJIZL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJJJL() {
        return false;
    }

    @Override // X.InterfaceC1370450llb
    public final int LJJJJLI() {
        return 100;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJJLZIJ() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJLIIIJL() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final String label() {
        return "";
    }

    @Override // X.InterfaceC1370310llN
    public final void LJI() {
        AbstractC1376810lvr abstractC1376810lvr;
        C1373790lqz c1373790lqz = this.LL;
        if (c1373790lqz == null || (abstractC1376810lvr = c1373790lqz.LIZIZ) == null) {
            return;
        }
        abstractC1376810lvr.LIZJ();
    }

    @Override // X.InterfaceC1370310llN
    public final int LJII() {
        C1373780lqy c1373780lqy;
        C419910GdJ c419910GdJ;
        C1376820lvs c1376820lvs = (C1376820lvs) this.LLILLL.getValue();
        if (c1376820lvs != null) {
            return c1376820lvs.LIZIZ;
        }
        C1373790lqz c1373790lqz = this.LL;
        if (c1373790lqz == null || (c1373780lqy = c1373790lqz.LIZ) == null || (c419910GdJ = c1373780lqy.LIZ) == null) {
            return -1;
        }
        return c419910GdJ.LIZ;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        C1373780lqy c1373780lqy;
        C419910GdJ c419910GdJ;
        C1376820lvs c1376820lvs = (C1376820lvs) this.LLILLL.getValue();
        if (c1376820lvs != null) {
            return c1376820lvs.LIZ;
        }
        C1373790lqz c1373790lqz = this.LL;
        if (c1373790lqz == null || (c1373780lqy = c1373790lqz.LIZ) == null || (c419910GdJ = c1373780lqy.LIZ) == null) {
            return -1;
        }
        return c419910GdJ.LIZ;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJIIIZ() {
        AbstractC1376810lvr abstractC1376810lvr;
        C1373790lqz c1373790lqz = this.LL;
        if (c1373790lqz == null || (abstractC1376810lvr = c1373790lqz.LIZIZ) == null) {
            return false;
        }
        return abstractC1376810lvr.LIZ();
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJLIIIJJIZ() {
        C1373780lqy c1373780lqy;
        C1373790lqz c1373790lqz = this.LL;
        if (c1373790lqz == null || (c1373780lqy = c1373790lqz.LIZ) == null) {
            return -1;
        }
        return c1373780lqy.LIZIZ;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean enable() {
        C1373790lqz c1373790lqz = this.LL;
        if (c1373790lqz != null) {
            return c1373790lqz.LIZJ;
        }
        return true;
    }

    @Override // X.InterfaceC1370310llN
    public final String key() {
        C1373780lqy c1373780lqy;
        String str;
        C1373790lqz c1373790lqz = this.LL;
        return (c1373790lqz == null || (c1373780lqy = c1373790lqz.LIZ) == null || (str = c1373780lqy.LIZLLL) == null) ? "" : str;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIJJI() {
        return !enable() ? 1 : 0;
    }

    @Override // X.InterfaceC1370310llN
    public final C0M7Z LJIIJ() {
        return C0M7Z.LongPress;
    }

    @Override // X.InterfaceC1370310llN
    public final EnumC1216710hld LJJJZ() {
        return EnumC1216710hld.NORMAL;
    }

    public C1376790lvp(C1373790lqz c1373790lqz) {
        this.LL = c1373790lqz;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIJJ(TextView textView) {
        C1370320llO.LJ(this, textView);
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
        return C1370320llO.LIZJ(enumC1369720lkQ);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
        AbstractC1376810lvr abstractC1376810lvr;
        C1373790lqz c1373790lqz = this.LL;
        if (c1373790lqz != null && (abstractC1376810lvr = c1373790lqz.LIZIZ) != null) {
            abstractC1376810lvr.LJII(view);
        }
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZ(this, view, baseSharePackage);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZIZ(this, view, baseSharePackage);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZLLL(context, baseSharePackage, this);
    }

    @Override // X.InterfaceC1370280llK
    public final View LIZ(ViewGroup viewGroup, Context context, C1370200llC c1370200llC) {
        if (c1370200llC != null && this.LLILLJJLI == null) {
            C21411818qq c21411818qq = null;
            if (Intrinsics.LJFF(key(), "auto_scroll") || Intrinsics.LJFF(key(), "bcg_audio") || Intrinsics.LJFF(key(), "auto_dubbing")) {
                C21411818qq c21411818qq2 = new C21411818qq(context, null, 6);
                if (viewGroup != null) {
                    viewGroup.addView(c21411818qq2, new ViewGroup.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28))));
                }
                c21411818qq = c21411818qq2;
            }
            this.LLILLJJLI = c21411818qq;
        }
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJIJ(ImageView imageView, View view, int i) {
        AbstractC1376810lvr abstractC1376810lvr;
        C1373790lqz c1373790lqz = this.LL;
        if (c1373790lqz != null && (abstractC1376810lvr = c1373790lqz.LIZIZ) != null) {
            abstractC1376810lvr.LJIIIIZZ(imageView, view, i);
        }
    }

    @Override // X.InterfaceC1370280llK
    public final void LJ(C1370200llC c1370200llC, final int i, final InterfaceC1369750lkT interfaceC1369750lkT, final Function0 function0) {
        AbstractC1376810lvr abstractC1376810lvr;
        boolean zLJIIJ;
        C21411818qq c21411818qq = this.LLILLJJLI;
        if (c21411818qq != null) {
            if (Intrinsics.LJFF(key(), "auto_scroll") || Intrinsics.LJFF(key(), "bcg_audio") || Intrinsics.LJFF(key(), "auto_dubbing")) {
                C1373790lqz c1373790lqz = this.LL;
                if (c1373790lqz != null) {
                    abstractC1376810lvr = c1373790lqz.LIZIZ;
                } else {
                    abstractC1376810lvr = null;
                }
                if (abstractC1376810lvr instanceof AbstractC734730Srv) {
                    zLJIIJ = ((AbstractC734730Srv) abstractC1376810lvr).LJIIJ();
                } else {
                    zLJIIJ = false;
                }
                c21411818qq.setChecked(zLJIIJ);
                if (interfaceC1369750lkT != null) {
                    C786410Ut5.C7(c21411818qq, new CompoundButton.OnCheckedChangeListener() { // from class: X.0lqu
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                            if (C0R90.LIZ(1200L, compoundButton)) {
                                return;
                            }
                            Function0<Unit> function02 = function0;
                            if (function02 != null) {
                                function02.invoke();
                            }
                            interfaceC1369750lkT.LIZIZ(this, i);
                        }
                    });
                }
            }
        }
    }
}
