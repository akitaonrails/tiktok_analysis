package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.liveevent.LiveEventModule;
import com.ss.android.ugc.aweme.liveevent.LiveEventSelectionFragment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.118T, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C118T extends C1260870iur<AnonymousClass1123, C118U> implements InterfaceC1255940imu<Object> {
    public LiveEventSelectionFragment LLILZ;

    @Override // X.InterfaceC1255940imu
    public final /* synthetic */ boolean B1(C0PN0 c0pn0) {
        return false;
    }

    @Override // X.InterfaceC1255940imu
    public final /* synthetic */ void Dl(int[] iArr) {
    }

    @Override // X.InterfaceC1255940imu
    public final /* synthetic */ void L4(List<Object> list) {
    }

    @Override // X.InterfaceC1255940imu
    public final /* synthetic */ void LLLZZIL(List<Object> list) {
    }

    @Override // X.InterfaceC1255940imu
    public final /* synthetic */ void V1(int i, Object obj) {
    }

    @Override // X.InterfaceC1255940imu
    public final void Y1(int i) {
    }

    @Override // X.InterfaceC1255940imu
    public final void w(int i, List list) {
    }

    @Override // X.C1260870iur
    public final void LJIILIIL() {
        K k;
        T t = this.LL;
        if (t == 0 || (k = this.LLILLJJLI) == 0) {
            return;
        }
        int i = ((AbstractC1255880imo) t).mListQueryType;
        if (i == 1) {
            ((InterfaceC1212360hec) k).LJ();
        } else if (i == 2) {
            ((InterfaceC1212360hec) k).Jm();
        } else if (i == 4) {
            ((InterfaceC1212360hec) k).showLoadMoreLoading();
        }
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onSuccess() {
        K k;
        if (this.LL == 0 || (k = this.LLILLJJLI) == 0) {
            return;
        }
        ((C118U) k).mf0();
        AnonymousClass1123 anonymousClass1123 = (AnonymousClass1123) this.LL;
        int i = anonymousClass1123.mListQueryType;
        if (i != 1) {
            if (i == 2) {
                ((InterfaceC1212360hec) this.LLILLJJLI).mE(anonymousClass1123.LL, !anonymousClass1123.isNewDataEmpty());
                return;
            } else {
                if (i == 4) {
                    ((InterfaceC1212360hec) this.LLILLJJLI).Pj(anonymousClass1123.LL, false);
                    return;
                }
                return;
            }
        }
        List<LiveEventModule> list = anonymousClass1123.LLILLJJLI;
        if (list == null || ((ArrayList) list).isEmpty()) {
            ((InterfaceC1212360hec) this.LLILLJJLI).Ng1();
        } else {
            ((InterfaceC1212360hec) this.LLILLJJLI).LLJJJIL(((AnonymousClass1123) this.LL).LL, false);
        }
        if (this.LLILZ != null) {
            TextUtils.isEmpty(null);
        }
    }

    @Override // X.C1260870iur
    public final void LIZ() {
        super.LIZ();
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        K k;
        if (this.LL != 0 && (k = this.LLILLJJLI) != 0) {
            ((C118U) k).mf0();
            int i = ((AbstractC1255880imo) this.LL).mListQueryType;
            if (i != 1) {
                if (i != 2) {
                    if (i == 4) {
                        ((InterfaceC1212360hec) this.LLILLJJLI).Wi(exc);
                        return;
                    }
                    return;
                }
                ((InterfaceC1212360hec) this.LLILLJJLI).bD1(exc);
                return;
            }
            ((InterfaceC1212360hec) this.LLILLJJLI).Uq2(exc);
        }
    }
}
