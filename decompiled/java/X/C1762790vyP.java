package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS11S0101000_26;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS392S0200000_26;

/* JADX INFO: renamed from: X.0vyP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1762790vyP extends LinearLayout implements InterfaceC1763260vzA {
    public int LL;
    public int LLILLJJLI;
    public Function1<? super Integer, Unit> LLILLL;
    public List<C1763070vyr> LLILZ;
    public List<MediaItem> LLILZIL;
    public boolean LLILZLL;

    public final Function1<Integer, Unit> getClickStrategy() {
        return this.LLILLL;
    }

    private final void setTitles(List<C1763070vyr> list) {
        boolean z;
        if (list == null) {
            return;
        }
        if (getChildCount() > 0) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
            removeAllViews();
        }
        int i = 0;
        for (C1763070vyr c1763070vyr : list) {
            int i2 = i + 1;
            if (i >= 0) {
                C1763070vyr c1763070vyr2 = c1763070vyr;
                C389720FPu c389720FPu = new C389720FPu(getContext());
                if (i == this.LL) {
                    z = true;
                } else {
                    z = false;
                }
                c389720FPu.setIsSelected(z);
                LIZIZ(c1763070vyr2, c389720FPu);
                c389720FPu.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76)));
                C786410Ut5.I7(new AjS11S0101000_26(this, i, 1), c389720FPu);
                addView(c389720FPu, new LinearLayout.LayoutParams(-2, -1));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public final void setClickStrategy(Function1<? super Integer, Unit> function1) {
        this.LLILLL = function1;
    }

    @Override // X.InterfaceC1763260vzA
    public void setTabPosition(int i) {
        int iLJIIJ = C1697810uHb.LJIIJ(this.LLILZ);
        while (true) {
            if (-1 < iLJIIJ) {
                if (i >= ((C1763070vyr) ListProtector.get(this.LLILZ, iLJIIJ)).LIZJ) {
                    break;
                } else {
                    iLJIIJ--;
                }
            } else {
                iLJIIJ = 0;
                break;
            }
        }
        LIZ(iLJIIJ, i);
    }

    @Override // X.InterfaceC1763260vzA
    public void setVisible(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, this);
    }

    public C1762790vyP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = -1;
        this.LLILLJJLI = -1;
        C13BV c13bv = C13BV.INSTANCE;
        this.LLILZ = c13bv;
        this.LLILZIL = c13bv;
        setBackgroundResource(R.drawable.b2_);
    }

    public final void LIZ(int i, int i2) {
        boolean z;
        if (this.LL != i || this.LLILLJJLI != i2) {
            this.LL = i;
            this.LLILLJJLI = i2;
            int i3 = 0;
            for (Object obj : new C2500209qy(this, 4)) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    View view = (View) obj;
                    if (view instanceof C389720FPu) {
                        C389720FPu c389720FPu = (C389720FPu) view;
                        if (i3 == i) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c389720FPu.setIsSelected(z);
                        C1763070vyr c1763070vyr = (C1763070vyr) C13LP.LJJJLZIJ(i3, this.LLILZ);
                        if (c1763070vyr != null) {
                            LIZIZ(c1763070vyr, c389720FPu);
                        }
                    }
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    public final void LIZIZ(C1763070vyr c1763070vyr, C389720FPu c389720FPu) {
        int i = 1;
        if (c1763070vyr.LIZ == 1) {
            if (c389720FPu.isSelected()) {
                List<MediaItem> list = this.LLILZIL;
                int i2 = 0;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<MediaItem> it2 = list.iterator();
                    i2 = 0;
                    while (it2.hasNext()) {
                        if (it2.next().type == 1 && (i2 = i2 + 1) < 0) {
                            C1697810uHb.LJIJ();
                            throw null;
                        }
                    }
                }
                int i3 = i2 - (this.LLILZLL ? 1 : 0);
                int i4 = (this.LLILLJJLI - c1763070vyr.LIZJ) + 1;
                if (i4 >= 1) {
                    i = i4;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append('/');
                sb.append(i3);
                c389720FPu.setTitle(sb.toString());
                return;
            }
            c389720FPu.setTitle(c1763070vyr.LIZIZ);
            return;
        }
        c389720FPu.setTitle(c1763070vyr.LIZIZ);
    }

    public final void LIZJ(List<MediaItem> list, SeaPdpViewModel seaPdpViewModel, Function1<? super Integer, Unit> function1) {
        this.LLILZIL = list;
        boolean z = true;
        if (!seaPdpViewModel.lS2()) {
            z = false;
        }
        this.LLILZLL = z;
        List<C1763070vyr> listLIZ = C1762500vxw.LIZ(seaPdpViewModel, getContext(), list);
        C786410Ut5.LJLLLLLL(0, this);
        this.LLILZ = listLIZ;
        setTitles(listLIZ);
        this.LLILLL = new AwS392S0200000_26(this, (C1762790vyP) function1, (Function1<? super Integer, Unit>) 41);
    }
}
