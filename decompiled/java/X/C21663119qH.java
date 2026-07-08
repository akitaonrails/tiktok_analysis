package X;

import Y.ARunnableS37S0201000_33;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.19qH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21663119qH extends AbstractC1762740vyK implements InterfaceC21662719qD {
    public final String LLILZ;
    public final EnumC671230QUn LLILZIL;
    public final C1910470zob LLILZLL;
    public final Function1<String, Unit> LLIZ;
    public final EnumC1781440wSU LLIZLLLIL;
    public List<PhotoModeImageUrlModel> LLJ;
    public final int LLJI;
    public final int LLJIJIL;
    public final BPEAHandler LLJILJIL;
    public List<View> LLJILJILJ;
    public Aweme LLJILLL;
    public boolean LLJJ;
    public InterfaceC661730PxT LLJJI;

    @Override // X.InterfaceC21662719qD
    public final boolean LIZLLL() {
        return this.LLJ.size() > 1;
    }

    @Override // X.InterfaceC21662719qD
    public final int LJIIJJI() {
        return this.LLJ.size();
    }

    @Override // X.InterfaceC21662719qD
    public final int LJIILL() {
        int size = this.LLJ.size();
        if (size <= 0) {
            return 0;
        }
        return !LIZLLL() ? size - 1 : size;
    }

    @Override // X.InterfaceC21662719qD
    public final int LJIIIZ() {
        return LIZLLL() ? 1 : 0;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        if (!LIZLLL()) {
            return this.LLJ.size();
        }
        if (this.LLJ.isEmpty()) {
            return 0;
        }
        return this.LLJ.size() + 2;
    }

    @Override // X.InterfaceC21662719qD
    public final int LIZ(int i) {
        if (!LIZLLL()) {
            int size = this.LLJ.size() - 1;
            if (size < 0) {
                size = 0;
            }
            return C13LZ.LJ(i, 0, size);
        }
        if (this.LLJ.isEmpty()) {
            return 0;
        }
        return (((i % this.LLJ.size()) + this.LLJ.size()) % this.LLJ.size()) + 1;
    }

    @Override // X.InterfaceC21662719qD
    public final int LJIILIIL(int i) {
        if (this.LLJ.isEmpty()) {
            return 0;
        }
        if (!LIZLLL()) {
            return C13LZ.LJ(i, 0, this.LLJ.size() - 1);
        }
        if (i == 0) {
            return this.LLJ.size() - 1;
        }
        if (i == getCount() - 1) {
            return 0;
        }
        return C13LZ.LJ(i - 1, 0, this.LLJ.size() - 1);
    }

    @Override // X.AbstractC1762740vyK
    public final View LJJIJIL(int i, View view, ViewGroup viewGroup) {
        C21694119vH c21694119vH;
        View viewTd = view;
        if (viewTd == null) {
            if (C0BUS.LIZ()) {
                if (!this.LLJILJILJ.isEmpty()) {
                    viewTd = (View) ListProtector.remove(this.LLJILJILJ, 0);
                } else {
                    viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eae, viewGroup, false);
                }
                c21694119vH = new C21694119vH(viewTd, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLJILLL, this.LLIZ, this.LLIZLLLIL);
                viewTd.setTag(c21694119vH);
            } else {
                viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eae, viewGroup, false);
                c21694119vH = new C21694119vH(viewTd, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLJILLL, this.LLIZ, this.LLIZLLLIL);
                viewTd.setTag(c21694119vH);
            }
        } else {
            c21694119vH = (C21694119vH) viewTd.getTag();
        }
        c21694119vH.LLILLL = i;
        int iLJIILIIL = LJIILIIL(i);
        c21694119vH.LLJJIJI = this.LLJJI;
        if (getCount() > 0) {
            if (C0BUS.LIZ()) {
                if (i == LIZLLL()) {
                    c21694119vH.LJIILLIIL((PhotoModeImageUrlModel) ListProtector.get(this.LLJ, iLJIILIIL), this.LLJI, this.LLJIJIL, this.LLJILLL, iLJIILIIL, this.LLILZ);
                } else {
                    this.LLJJ = false;
                    C786410Ut5.LJJZZIII(this.LLJILJIL, new ARunnableS37S0201000_33(this, iLJIILIIL, c21694119vH, 8));
                    return viewTd;
                }
            } else {
                c21694119vH.LJIILLIIL((PhotoModeImageUrlModel) ListProtector.get(this.LLJ, iLJIILIIL), this.LLJI, this.LLJIJIL, this.LLJILLL, iLJIILIIL, this.LLILZ);
                return viewTd;
            }
        }
        return viewTd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C21663119qH(Context context, String str, EnumC671230QUn enumC671230QUn, C1910470zob c1910470zob, Function1<? super String, Unit> function1, EnumC1781440wSU enumC1781440wSU) {
        super(C786410Ut5.ne(context));
        this.LLILZ = str;
        this.LLILZIL = enumC671230QUn;
        this.LLILZLL = c1910470zob;
        this.LLIZ = function1;
        this.LLIZLLLIL = enumC1781440wSU;
        this.LLJ = C13BV.INSTANCE;
        this.LLJI = -1;
        this.LLJIJIL = -1;
        this.LLJILJIL = new BPEAHandler(Looper.getMainLooper());
        this.LLJILJILJ = new ArrayList();
    }
}
