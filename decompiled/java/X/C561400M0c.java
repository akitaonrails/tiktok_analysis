package X;

import Y.ARunnableS10S1100000_4;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxPageViewModel;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M0c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C561400M0c implements C0M1L {
    public RecyclerView LIZ;
    public C1749280vcc LIZIZ;
    public DraftBoxPageViewModel LIZJ;

    @Override // X.C0M1L
    public final void onDestroy() {
    }

    public final void LIZIZ(boolean z) {
        Map<String, Boolean> mapLJ;
        Context context;
        String string;
        MutableLiveData<Map<String, Boolean>> mutableLiveData;
        if (z) {
            DraftBoxPageViewModel draftBoxPageViewModel = this.LIZJ;
            if (draftBoxPageViewModel == null || (mutableLiveData = draftBoxPageViewModel.LLJIJIL) == null || (mapLJ = mutableLiveData.getValue()) == null) {
                mapLJ = C2097608Jq.LJ();
            }
            C1749280vcc c1749280vcc = this.LIZIZ;
            if (c1749280vcc != null && (context = c1749280vcc.getContext()) != null) {
                Boolean bool = mapLJ.get("filter_type_effect");
                Boolean bool2 = Boolean.TRUE;
                boolean zLJFF = Intrinsics.LJFF(bool, bool2);
                if (Intrinsics.LJFF(mapLJ.get("filter_type_template"), bool2)) {
                    if (zLJFF) {
                        string = context.getString(2131832399);
                    } else {
                        string = context.getString(2131832398);
                    }
                } else if (zLJFF) {
                    string = context.getString(2131832396);
                } else {
                    string = "";
                }
                C1749280vcc c1749280vcc2 = this.LIZIZ;
                if (c1749280vcc2 != null) {
                    HandlerHook.viewPost(c1749280vcc2, new ARunnableS10S1100000_4(this, string, 8));
                }
                RecyclerView recyclerView = this.LIZ;
                if (recyclerView != null) {
                    C786410Ut5.LLIZLLLIL(recyclerView, 4);
                    return;
                }
                return;
            }
            return;
        }
        C1749280vcc c1749280vcc3 = this.LIZIZ;
        if (c1749280vcc3 != null) {
            C786410Ut5.LLLZLZ(c1749280vcc3, 8);
        }
        RecyclerView recyclerView2 = this.LIZ;
        if (recyclerView2 == null) {
            return;
        }
        C786410Ut5.LLIZLLLIL(recyclerView2, 0);
    }

    @Override // X.C0M1L
    public final void LIZ(View view, DraftBoxPageViewModel draftBoxPageViewModel, InterfaceC561590M0v interfaceC561590M0v) {
        C1749280vcc c1749280vcc;
        if (view instanceof C1749280vcc) {
            c1749280vcc = (C1749280vcc) view;
        } else {
            c1749280vcc = null;
        }
        this.LIZIZ = c1749280vcc;
        this.LIZJ = draftBoxPageViewModel;
    }
}
