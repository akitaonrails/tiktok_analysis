package X;

import android.util.Size;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixPicItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yTs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1859180yTs implements C141B, InterfaceC1587906Jp {
    public final /* synthetic */ List<TakoMixPicItem> LL;
    public final /* synthetic */ Size LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.C141B
    public final boolean LJLJI() {
        return ((TakoMixPicItem) ListProtector.get(this.LL, 0)).type == 4;
    }

    @Override // X.C141B
    public final int LLI() {
        return this.LLILLL + C1859250yTz.LJI();
    }

    @Override // X.InterfaceC685610Qut
    public final List<C0R0A> getImageList() {
        String str;
        List<String> list;
        List<TakoMixPicItem> list2 = this.LL;
        Size size = this.LLILLJJLI;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
        for (TakoMixPicItem takoMixPicItem : list2) {
            C0R09 c0r09 = new C0R09(Integer.valueOf(size.getWidth()), Integer.valueOf(size.getHeight()));
            BaseImage baseImageLIZLLL = AnonymousClass1418.LIZLLL(takoMixPicItem);
            if (baseImageLIZLLL == null || (list = baseImageLIZLLL.urlList) == null || (str = (String) C13LP.LJJJLL(list)) == null) {
                str = "";
            }
            arrayList.add(new C0R0A(c0r09, str));
        }
        return arrayList;
    }

    @Override // X.C141B
    public final Size LJLJJL() {
        return this.LLILLJJLI;
    }

    @Override // X.C141B
    public final List<TakoMixPicItem> LLFF() {
        return this.LL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1859180yTs(List<TakoMixPicItem> list, Size size, int i) {
        this.LL = list;
        this.LLILLJJLI = size;
        this.LLILLL = i;
    }
}
