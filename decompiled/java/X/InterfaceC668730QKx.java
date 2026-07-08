package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0QKx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC668730QKx {
    void LIZ(C0QLY c0qly);

    void LIZIZ();

    void LIZLLL(int i);

    void LJ();

    void LJIIJJI(Fragment fragment, InterfaceC668720QKw interfaceC668720QKw, Function1<? super C0QLX, Unit> function1);

    Fragment getCurrentFragment();

    NextLiveData<Boolean> getEcMiddleAIStateObservable();

    SearchResultParam getSearchParam();

    int getViewVisibility();

    void onDestroy();

    void setViewVisibility(int i);
}
