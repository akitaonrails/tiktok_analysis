package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import iyl.i3;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0t5X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1651890t5X extends AbstractC1651610t55 {
    public final ShortVideoContext LLILZIL;
    public final InterfaceC1651800t5O LLILZLL;
    public final EnumC1651870t5V LLIZ;
    public final Function0<Unit> LLIZLLLIL;
    public final List<View> LLJ;

    @Override // X.InterfaceC1657840tF8
    public final InterfaceC1657880tFC LIZIZ(i3 i3Var) {
        final LifecycleOwner lifecycleOwner = this.LL;
        final ShortVideoContext shortVideoContext = this.LLILZIL;
        final InterfaceC1651800t5O interfaceC1651800t5O = this.LLILZLL;
        final Function0<Unit> function0 = this.LLIZLLLIL;
        final List<View> list = this.LLJ;
        final AwS604S0100000_25 awS604S0100000_25 = new AwS604S0100000_25(this, 333);
        return new C1659140tHE(lifecycleOwner, shortVideoContext, interfaceC1651800t5O, function0, list, awS604S0100000_25) { // from class: X.0t5B
            public final ShortVideoContext LLJJLIIIJLLLLLLLZ;
            public final InterfaceC1651800t5O LLJL;

            @Override // X.C1659140tHE, X.InterfaceC1657880tFC
            public final void LIZJ(i3 i3Var2) {
                AbstractC1645550svJ abstractC1645550svJ;
                super.LIZJ(i3Var2);
                C1650980t44 c1650980t44LIZJ = this.LLJL.LIZJ(i3Var2.LLILLL.getType());
                if (c1650980t44LIZJ != null) {
                    C1651440t4o c1651440t4o = C1651440t4o.LIZ;
                    ShortVideoContext shortVideoContext2 = this.LLJJLIIIJLLLLLLLZ;
                    c1651440t4o.getClass();
                    C1651440t4o.LIZIZ(shortVideoContext2, c1650980t44LIZJ);
                    InterfaceC1651630t57 interfaceC1651630t57 = c1650980t44LIZJ.LLJIJIL;
                    if ((interfaceC1651630t57 instanceof AbstractC1645550svJ) && (abstractC1645550svJ = (AbstractC1645550svJ) interfaceC1651630t57) != null) {
                        abstractC1645550svJ.LIZLLL(LJIJJ(), c1650980t44LIZJ);
                    }
                }
            }

            {
                InterfaceC1659200tHK interfaceC1659200tHK = new InterfaceC1659200tHK(interfaceC1651800t5O, function0, awS604S0100000_25, shortVideoContext) { // from class: X.0t56
                    public final InterfaceC1651800t5O LIZ;
                    public final Function0<Unit> LIZIZ;
                    public final Function1<C1650980t44, Unit> LIZJ;
                    public final ShortVideoContext LIZLLL;
                    public C1650980t44 LJ;

                    @Override // X.InterfaceC1659200tHK
                    public final boolean LIZJ(C1654400t9a c1654400t9a, i3 i3Var2) {
                        return false;
                    }

                    @Override // X.InterfaceC1659200tHK
                    public final void LIZ(C1654400t9a c1654400t9a, boolean z, i3 i3Var2) {
                        InterfaceC1651630t57 interfaceC1651630t57;
                        Function0<Unit> function02 = this.LIZIZ;
                        if (function02 != null) {
                            function02.invoke();
                        }
                        C1650980t44 c1650980t44LIZJ = this.LJ;
                        if (c1650980t44LIZJ == null) {
                            c1650980t44LIZJ = this.LIZ.LIZJ(i3Var2.LLILLL.getType());
                            if (c1650980t44LIZJ != null) {
                                this.LJ = c1650980t44LIZJ;
                            } else {
                                c1650980t44LIZJ = null;
                            }
                        }
                        if (!z) {
                            if (c1650980t44LIZJ != null && (interfaceC1651630t57 = c1650980t44LIZJ.LLJIJIL) != null) {
                                interfaceC1651630t57.LIZJ(c1650980t44LIZJ);
                                return;
                            }
                            return;
                        }
                        C0CHQ.LIZ().LJI().LJIIIZ(this.LIZLLL, i3Var2.LLILLL.getItemTag());
                        if (c1650980t44LIZJ != null) {
                            InterfaceC1651650t59 interfaceC1651650t59 = c1650980t44LIZJ.LLJJIII;
                            if (interfaceC1651650t59 != null) {
                                interfaceC1651650t59.LIZ(c1654400t9a.LIZIZ);
                            }
                            InterfaceC1651630t57 interfaceC1651630t572 = c1650980t44LIZJ.LLJIJIL;
                            if (interfaceC1651630t572 != null) {
                                C1638140sjM.LIZ(EnumC1647590syb.TOOL_BAR);
                                interfaceC1651630t572.LIZIZ(c1654400t9a.LIZ, c1650980t44LIZJ);
                                if (c1650980t44LIZJ.LLJJ) {
                                    this.LIZJ.invoke(c1650980t44LIZJ);
                                    c1650980t44LIZJ.LLJJ = false;
                                }
                            }
                        }
                    }

                    @Override // X.InterfaceC1659200tHK
                    public final void LIZIZ(C1654400t9a c1654400t9a, boolean z, i3 i3Var2) {
                        InterfaceC1651630t57 interfaceC1651630t57;
                        Function0<Unit> function02 = this.LIZIZ;
                        if (function02 != null) {
                            function02.invoke();
                        }
                        C1650980t44 c1650980t44LIZJ = this.LJ;
                        if (c1650980t44LIZJ == null) {
                            c1650980t44LIZJ = this.LIZ.LIZJ(i3Var2.LLILLL.getType());
                            if (c1650980t44LIZJ != null) {
                                this.LJ = c1650980t44LIZJ;
                            } else {
                                c1650980t44LIZJ = null;
                            }
                        }
                        if (!z) {
                            if (c1650980t44LIZJ != null && (interfaceC1651630t57 = c1650980t44LIZJ.LLJIJIL) != null) {
                                interfaceC1651630t57.LIZJ(c1650980t44LIZJ);
                                return;
                            }
                            return;
                        }
                        if (c1650980t44LIZJ != null) {
                            InterfaceC1651650t59 interfaceC1651650t59 = c1650980t44LIZJ.LLJJIII;
                            if (interfaceC1651650t59 != null) {
                                interfaceC1651650t59.LIZ(c1654400t9a.LIZIZ);
                            }
                            InterfaceC1651630t57 interfaceC1651630t572 = c1650980t44LIZJ.LLJIJIL;
                            if (interfaceC1651630t572 != null) {
                                interfaceC1651630t572.LIZ();
                                if (c1650980t44LIZJ.LLJJ) {
                                    this.LIZJ.invoke(c1650980t44LIZJ);
                                    c1650980t44LIZJ.LLJJ = false;
                                }
                            }
                        }
                    }

                    {
                        this.LIZ = interfaceC1651800t5O;
                        this.LIZIZ = function0;
                        this.LIZJ = awS604S0100000_25;
                        this.LIZLLL = shortVideoContext;
                    }
                };
                this.LLJJLIIIJLLLLLLLZ = shortVideoContext;
                this.LLJL = interfaceC1651800t5O;
            }
        };
    }

    public C1651890t5X(C1657710tEv c1657710tEv, ShortVideoContext shortVideoContext, InterfaceC1651800t5O interfaceC1651800t5O, EnumC1651870t5V enumC1651870t5V, Function0 function0, List list) {
        super(c1657710tEv);
        this.LLILZIL = shortVideoContext;
        this.LLILZLL = interfaceC1651800t5O;
        this.LLIZ = enumC1651870t5V;
        this.LLIZLLLIL = function0;
        this.LLJ = list;
    }
}
