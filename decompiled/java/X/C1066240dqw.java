package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: renamed from: X.0dqw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1066240dqw extends AbstractC1762740vyK {
    public List<? extends C03IT> LLILZ;
    public Aweme LLILZIL;
    public InterfaceC427850Gq7 LLILZLL;
    public InterfaceC1066270dqz LLIZ;
    public boolean LLIZLLLIL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLILZ.size();
    }

    public C1066240dqw(Context context) {
        super(C786410Ut5.ne(context));
        this.LLILZ = C13BV.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0127  */
    @Override // X.AbstractC1762740vyK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LJJIJIL(int r18, android.view.View r19, android.view.ViewGroup r20) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1066240dqw.LJJIJIL(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public static void LJJIJLIJ(C1066240dqw c1066240dqw, Aweme aweme, List list, C1010260cOe c1010260cOe, InterfaceC1066270dqz interfaceC1066270dqz, int i) {
        boolean z;
        List list2;
        if ((i & 4) != 0) {
            c1010260cOe = null;
        }
        if ((i & 8) != 0) {
            interfaceC1066270dqz = null;
        }
        if ((i & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        c1066240dqw.LLILZIL = aweme;
        if (list == null) {
            list2 = C13BV.INSTANCE;
        } else {
            list2 = list;
        }
        c1066240dqw.LLILZ = list2;
        if (list != null && list.size() != 1 && ListProtector.get(list, 0) != null && z) {
            c1066240dqw.LLILZ = C13LP.LJLILLLLZI(ListProtector.get(list, 0), list);
        }
        c1066240dqw.LLIZLLLIL = z;
        c1066240dqw.LLILZLL = c1010260cOe;
        c1066240dqw.LLIZ = interfaceC1066270dqz;
    }
}
