package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.AnchorSelectionFragment;
import com.ss.android.ugc.aweme.api.model.AnchorModule;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.118S, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C118S extends C1260870iur<C118L, C118U> implements InterfaceC1255940imu<Object> {
    public AnchorSelectionFragment LLILZ;

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
        View view;
        TextView textView;
        T t = this.LL;
        if (t == 0 || (k = this.LLILLJJLI) == 0) {
            return;
        }
        if (((C118L) t).LLIZ) {
            ((C118U) k).hM1();
        } else {
            ((C118U) k).mf0();
        }
        C118L c118l = (C118L) this.LL;
        int i = c118l.mListQueryType;
        boolean z = false;
        if (i != 1) {
            if (i == 2) {
                ((InterfaceC1212360hec) this.LLILLJJLI).mE(c118l.LLILLL, !c118l.isNewDataEmpty());
                return;
            }
            if (i == 4) {
                InterfaceC1212360hec interfaceC1212360hec = (InterfaceC1212360hec) this.LLILLJJLI;
                List<Object> list = c118l.LLILLL;
                if (c118l.LLILZLL && !c118l.isNewDataEmpty()) {
                    z = true;
                }
                interfaceC1212360hec.Pj(list, z);
                return;
            }
            return;
        }
        List<AnchorModule> list2 = c118l.LLILZ;
        if (list2 == null || ((ArrayList) list2).isEmpty()) {
            ((InterfaceC1212360hec) this.LLILLJJLI).Ng1();
        } else {
            InterfaceC1212360hec interfaceC1212360hec2 = (InterfaceC1212360hec) this.LLILLJJLI;
            C118L c118l2 = (C118L) this.LL;
            interfaceC1212360hec2.LLJJJIL(c118l2.LLILLL, c118l2.LLILZLL);
        }
        String str = ((C118L) this.LL).LLIZLLLIL;
        if (this.LLILZ == null || TextUtils.isEmpty(str) || (view = this.LLILZ.LLJILLL) == null || (textView = (TextView) view.findViewById(R.id.txt_title)) == null) {
            return;
        }
        textView.setText(str);
    }

    @Override // X.C1260870iur
    public final void LIZ() {
        super.LIZ();
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        K k;
        T t = this.LL;
        if (t != 0 && (k = this.LLILLJJLI) != 0) {
            if (((C118L) t).LLIZ) {
                ((C118U) k).hM1();
            } else {
                ((C118U) k).mf0();
            }
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
