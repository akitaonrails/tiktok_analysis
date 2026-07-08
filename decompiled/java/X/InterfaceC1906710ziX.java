package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import java.util.List;

/* JADX INFO: renamed from: X.0ziX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC1906710ziX {
    <T extends InterfaceC336510DHd> void LIZ(T t, Class<T> cls);

    void LIZIZ(RecyclerView recyclerView, List<? extends Class<? extends PowerCell<?>>> list);

    int LIZJ();

    void LIZLLL();

    <T extends InterfaceC336510DHd> T LJ(Class<T> cls);

    void LJFF(int i, View view);

    void LJI();

    void LJII();

    void LJIIIIZZ(List<? extends View> list);

    int LJIIIZ();

    void LJIIJ(View view);

    AbstractC1906720ziY LJIIJJI();

    void LJIIL(List<? extends View> list);

    int LJIILIIL();

    List<InterfaceC1891350zJl> LJIILJJIL();

    <T extends ViewModel> T getActivityViewModel(Class<T> cls, ViewModelProvider.Factory factory);

    Context getContext();

    <T extends ViewModel> T getFragmentViewModel(Class<T> cls, ViewModelProvider.Factory factory);

    LifecycleOwner getLifecycleOwner();
}
