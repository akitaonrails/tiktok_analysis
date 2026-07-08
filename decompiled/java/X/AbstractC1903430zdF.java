package X;

import X.AbstractC895380ZAq;
import Y.AObserverS230S0100000_28;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.inbox.v2.InboxFragmentV2;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zdF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC1903430zdF<T extends AbstractC895380ZAq> extends RecyclerView.ViewHolder implements C0Z32<Object>, InterfaceC1586360rNq {
    public final C01GW LL;
    public Function0<Unit> LLILLJJLI;
    public T LLILLL;
    public InboxFragmentV2 LLILZ;
    public final C01GW LLILZIL;
    public C1906880zio LLILZLL;
    public final AObserverS230S0100000_28 LLIZ;
    public final AObserverS230S0100000_28 LLIZLLLIL;

    public void LLLZLZ(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
    }

    public void P5(C1906880zio c1906880zio) {
    }

    public void R5(T t) {
    }

    public void reportShowEvent() {
    }

    public final Activity L5() {
        return C1388190mED.LIZ(this.itemView.getContext());
    }

    public final MultiViewModel N5() {
        return (MultiViewModel) this.LLILZIL.getValue();
    }

    public void onAttach() {
        NextLiveData<Boolean> nextLiveData;
        NextLiveData<Boolean> nextLiveData2;
        InterfaceC1903450zdH interfaceC1903450zdH;
        String strUniqueItemIdForFirstScreen;
        T t = this.LLILLL;
        if (t != null && (t instanceof InterfaceC1903450zdH) && (interfaceC1903450zdH = (InterfaceC1903450zdH) t) != null && (strUniqueItemIdForFirstScreen = interfaceC1903450zdH.uniqueItemIdForFirstScreen()) != null) {
            C1599780rjU.LIZ.LIZLLL(strUniqueItemIdForFirstScreen);
        }
        InboxFragmentV2 inboxFragmentV2 = this.LLILZ;
        if (inboxFragmentV2 != null) {
            MultiViewModel multiViewModelN5 = N5();
            if (multiViewModelN5 != null && (nextLiveData2 = multiViewModelN5.LLILZLL) != null) {
                nextLiveData2.observe(inboxFragmentV2, this.LLIZ);
            }
            MultiViewModel multiViewModelN52 = N5();
            if (multiViewModelN52 != null && (nextLiveData = multiViewModelN52.LLIZ) != null) {
                nextLiveData.observe(inboxFragmentV2, this.LLIZLLLIL);
            }
        }
        S5(0);
    }

    @Override // X.C0Z32
    public void onDetach() {
        NextLiveData<Boolean> nextLiveData;
        NextLiveData<Boolean> nextLiveData2;
        MultiViewModel multiViewModelN5 = N5();
        if (multiViewModelN5 != null && (nextLiveData2 = multiViewModelN5.LLILZLL) != null) {
            nextLiveData2.removeObserver(this.LLIZ);
        }
        MultiViewModel multiViewModelN52 = N5();
        if (multiViewModelN52 == null || (nextLiveData = multiViewModelN52.LLIZ) == null) {
            return;
        }
        nextLiveData.removeObserver(this.LLIZLLLIL);
    }

    public AbstractC1903430zdF(View view) {
        super(view);
        this.LL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 953));
        this.LLILZIL = C452501pT.LIZIZ(new AwS558S0100000_14(view, 1580));
        this.LLIZ = new AObserverS230S0100000_28(this, 95);
        this.LLIZLLLIL = new AObserverS230S0100000_28(this, 94);
    }

    @Override // X.C0Z34
    public final void LLLLJ(C1906880zio c1906880zio) {
        if (Intrinsics.LJFF(this.LLILZLL, c1906880zio)) {
            return;
        }
        this.LLILZLL = c1906880zio;
        P5(c1906880zio);
    }

    public void S5(int i) {
        MultiViewModel multiViewModelN5;
        if (this.LLILLL != null && (multiViewModelN5 = N5()) != null) {
            multiViewModelN5.UQ2(this.LLILLL, new AwS572S0100000_28(this, 954));
        }
    }

    public final void I5(int i, Object obj) {
        AbstractC895380ZAq abstractC895380ZAq;
        if ((obj instanceof AbstractC895380ZAq) && (abstractC895380ZAq = (AbstractC895380ZAq) obj) != null) {
            this.LLILLL = (T) obj;
            R5(abstractC895380ZAq);
        } else {
            C786410Ut5.LJLLLLLL(8, this.itemView);
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZ("MultiBaseVH", "MultiBaseVH innerOnBind data type is not match!");
        }
    }
}
