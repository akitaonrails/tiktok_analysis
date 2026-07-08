package X;

import Y.AObserverS218S0100000_14;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseActionViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS298S0000000_14;
import kotlin.jvm.internal.AwS163S1100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: renamed from: X.0Z2G, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z2G extends C1A23 {
    public final long LLJILJILJ;
    public final C0Z2I LLJILLL;
    public final C0Z2F LLJJ;
    public final MutableLiveData<Integer> LLJJI;
    public AObserverS218S0100000_14 LLJJIII;
    public final AwS593S0100000_14 LLJJIJI;
    public final AwS593S0100000_14 LLJJIJIIJIL;

    @Override // X.C1A23, X.AbstractC894380Z6u
    public final Function1<BaseActionViewModel<?>, Unit> LIZJ() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.C1A23, X.AbstractC894380Z6u
    public final Function1<BaseActionViewModel<?>, Unit> LIZLLL() {
        return this.LLJJIJI;
    }

    public C0Z2G(String str, long j, C0Z2I c0z2i, C0Z2F c0z2f) {
        super(new C2172771A1r(new C06WA() { // from class: X.0Z2J
        }, 2131831433, R.raw.icon_gear, null, null, true, null, 1976), new AwS163S1100000_14(c0z2f, str, 4), new C0Z2H(str, j, c0z2i), AFwS298S0000000_14.get$arr$(10), null, 48);
        this.LLJILJILJ = j;
        this.LLJILLL = c0z2i;
        this.LLJJ = c0z2f;
        this.LLJJI = new MutableLiveData<>();
        this.LLJJIJI = new AwS593S0100000_14(this, 281);
        this.LLJJIJIIJIL = new AwS593S0100000_14(this, 280);
    }
}
