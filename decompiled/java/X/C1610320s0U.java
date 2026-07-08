package X;

import Y.ACListenerS158S0100000_24;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.assem.desc.bottom.DescBottomViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: renamed from: X.0s0U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1610320s0U implements InterfaceC1565710qqX {
    public final C19EG LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1707));
    public List<? extends InterfaceC1610370s0Z> LLILLL = new ArrayList();
    public View LLILZ;

    @Override // X.InterfaceC1565710qqX
    public final void LIZ() {
    }

    public C1610320s0U(C19EG c19eg) {
        this.LL = c19eg;
    }

    @Override // X.InterfaceC1565710qqX
    public final EnumC1565700qqW LIZJ(C737030Svd c737030Svd) {
        Object obj = c737030Svd.LIZIZ;
        if ((obj instanceof C1610380s0a) && obj != null) {
            return EnumC1565700qqW.OUT;
        }
        return EnumC1565700qqW.NONE;
    }

    @Override // X.InterfaceC1565710qqX
    public final View LIZLLL(C19EG c19eg, ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(c19eg), R.layout.b5y, viewGroup, false);
        this.LLILZ = viewTd;
        this.LLILLL = Collections.singletonList(new InterfaceC1610370s0Z() { // from class: X.0s0V
            @Override // X.InterfaceC1610370s0Z
            public final void reset() {
                ((DescBottomViewModel) this.LIZ.LLILLJJLI.getValue()).LLILLL.setValue(null);
            }

            {
                View viewFindViewById;
                View view = this.LIZ.LLILZ;
                if (view != null && (viewFindViewById = view.findViewById(R.id.fn6)) != null) {
                    C786410Ut5.I7(new ACListenerS158S0100000_24(this.LIZ, 77), viewFindViewById);
                }
            }
        });
        return viewTd;
    }

    @Override // X.InterfaceC1565710qqX
    public final void LIZIZ(C737030Svd c737030Svd, Aweme aweme, boolean z, Fragment fragment) {
        Object obj = c737030Svd.LIZIZ;
        if ((obj instanceof C1610380s0a) && obj != null) {
            if (z) {
                Iterator<? extends InterfaceC1610370s0Z> it2 = this.LLILLL.iterator();
                while (it2.hasNext()) {
                    it2.next().reset();
                }
                List<? extends InterfaceC1610370s0Z> list = this.LLILLL;
                ArrayList arrayList = new ArrayList();
                for (InterfaceC1610370s0Z interfaceC1610370s0Z : list) {
                    if (interfaceC1610370s0Z instanceof C1610340s0W) {
                        arrayList.add(interfaceC1610370s0Z);
                    }
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    it3.next().getClass();
                }
                List<? extends InterfaceC1610370s0Z> list2 = this.LLILLL;
                ArrayList arrayList2 = new ArrayList();
                for (InterfaceC1610370s0Z interfaceC1610370s0Z2 : list2) {
                    if (interfaceC1610370s0Z2 instanceof C1610350s0X) {
                        arrayList2.add(interfaceC1610370s0Z2);
                    }
                }
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    it4.next().getClass();
                }
                ((DescBottomViewModel) this.LLILLJJLI.getValue()).LLILZIL = 0;
                ((DescBottomViewModel) this.LLILLJJLI.getValue()).LLILZ = aweme;
                return;
            }
            Iterator<? extends InterfaceC1610370s0Z> it5 = this.LLILLL.iterator();
            while (it5.hasNext()) {
                it5.next().reset();
            }
        }
    }
}
