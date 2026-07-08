package X;

import Y.ARunnableS37S0201000_33;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19qG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21663019qG extends AbstractC1762740vyK {
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
    public String LLJJI;
    public int LLJJIII;
    public InterfaceC661730PxT LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        if (this.LLJJIJIIJIL) {
            return Integer.MAX_VALUE;
        }
        return this.LLJ.size();
    }

    @Override // X.AbstractC1762740vyK, androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) {
        if (this.LLJJIJIIJIL) {
            return super.LJJI(i % this.LLJ.size(), viewGroup);
        }
        return super.LJJI(i, viewGroup);
    }

    @Override // X.AbstractC1762740vyK
    public final View LJJIJIL(int i, View view, ViewGroup viewGroup) {
        C21694119vH c21694119vH;
        Object c098200Yq;
        int iIntValue;
        InterfaceC21663319qJ interfaceC21663319qJLJLJI;
        Aweme aweme;
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
        c21694119vH.LLJ = this.LLJJI;
        c21694119vH.LLJI = this.LLJJIII;
        c21694119vH.LLJJIJI = this.LLJJIJI;
        if (Intrinsics.LJFF(this.LLILZ, "general_search") && !this.LLJJIJIL) {
            Unit unit = null;
            String aid = null;
            unit = null;
            try {
                ISearchService iSearchService = (ISearchService) PluggableExtentionKt.pluggableSpi$default(ISearchService.class, false, false, false, 14, null);
                if (iSearchService != null) {
                    c098200Yq = Integer.valueOf(iSearchService.LLLLLILLIL(this.LLJILLL));
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Integer num = (Integer) c098200Yq;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            if (iIntValue >= 0 && i == iIntValue) {
                this.LLJJIJIL = true;
                if (iIntValue > 0 && (aweme = this.LLJILLL) != null) {
                    aweme.getAid();
                }
                try {
                    ISearchService iSearchService2 = (ISearchService) PluggableExtentionKt.pluggableSpi$default(ISearchService.class, false, false, false, 14, null);
                    if (iSearchService2 != null && (interfaceC21663319qJLJLJI = iSearchService2.LJLJI(this.LLILZ)) != null) {
                        String strLIZ = C662290PyN.LIZ(this.LLJILLL);
                        Aweme aweme2 = this.LLJILLL;
                        if (aweme2 != null) {
                            aid = aweme2.getAid();
                        }
                        interfaceC21663319qJLJLJI.LIZ(viewGroup, strLIZ, aid, this.LLJJI, i, this.LLJJIII);
                        unit = Unit.LIZ;
                    }
                    C189200o6.m2constructorimpl(unit);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                }
            }
        }
        if (getCount() > 0) {
            if (C0BUS.LIZ()) {
                if (i == 0) {
                    c21694119vH.LJIILLIIL((PhotoModeImageUrlModel) ListProtector.get(this.LLJ, i), this.LLJI, this.LLJIJIL, this.LLJILLL, 0, this.LLILZ);
                } else {
                    this.LLJJ = false;
                    C786410Ut5.LJJZZIII(this.LLJILJIL, new ARunnableS37S0201000_33(this, i, c21694119vH, 9));
                    return viewTd;
                }
            } else {
                c21694119vH.LJIILLIIL((PhotoModeImageUrlModel) ListProtector.get(this.LLJ, i), this.LLJI, this.LLJIJIL, this.LLJILLL, i, this.LLILZ);
                return viewTd;
            }
        }
        return viewTd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C21663019qG(Context context, String str, EnumC671230QUn enumC671230QUn, C1910470zob c1910470zob, Function1<? super String, Unit> function1, EnumC1781440wSU enumC1781440wSU) {
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
        this.LLJJIII = -1;
    }
}
