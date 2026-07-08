package X;

import X.InterfaceC20476615Am;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.15AJ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public interface C15AJ<T extends InterfaceC20476615Am> {
    void LJIIJ();

    void LJLL(List<? extends C15AK<? extends C15A8>> list, T t, Function2<? super Boolean, ? super String, Unit> function2);

    boolean LLIIII();

    ViewGroup.LayoutParams LLIIIZ(Rect rect);

    void LLIIL(View view);

    void LLJJIJIL(List<? extends C15AK<? extends C15A8>> list, T t, Function2<? super Boolean, ? super String, Unit> function2);

    void LLJLILLLLZIIL(T t, String str, Function2<? super Boolean, ? super String, Unit> function2);

    void LLLIILIL();

    void LLLZZIL(T t, String str, boolean z, Function2<? super Boolean, ? super String, Unit> function2);

    boolean LLZZLLIL();

    void W(T t);

    void g();

    String getGeniusId();

    T getGeniusModel();

    ViewGroup getRoot();

    String getTag();

    void log(String str);

    void setGeniusModel(T t);

    void setRoot(ViewGroup viewGroup);
}
