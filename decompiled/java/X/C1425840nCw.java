package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS636S0100000_22;

/* JADX INFO: renamed from: X.0nCw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1425840nCw extends AbstractC1664490tPr<C1425460nCK, C1425900nD2> {
    public final C1425870nCz LLJJJIL = new C1425870nCz();

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        RecyclerView recyclerView;
        super.onActivityCreated(bundle);
        View view = this.mView;
        if (view != null && (recyclerView = (RecyclerView) view.findViewById(R.id.xif)) != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setNestedScrollingEnabled(false);
            recyclerView.setOverScrollMode(2);
            C1425870nCz c1425870nCz = this.LLJJJIL;
            c1425870nCz.LLILLL = new AwS636S0100000_22(this, 16);
            c1425870nCz.LLILZ = new AwS636S0100000_22(this, 17);
            c1425870nCz.LLILZIL = new AwS566S0100000_22(this, 425);
            recyclerView.setAdapter(c1425870nCz);
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0nCL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1425460nCK) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 286));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setTheme(C1425570nCV.LIZIZ.LIZLLL());
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.fs7, viewGroup, false);
    }
}
