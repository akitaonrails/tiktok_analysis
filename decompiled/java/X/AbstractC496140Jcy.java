package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.profile.dao.LiveProfilePreloadViewModel;
import java.util.List;
import kotlin.Unit;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0Jcy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC496140Jcy<T> {
    public final C495920Jcc LIZ;
    public final List<AbstractC495790JcP<?>> LIZIZ;
    public final LiveProfilePreloadViewModel LIZJ;
    public final MutableLiveData<C496270JdB<C496120Jcw>> LIZLLL = new MutableLiveData<>();
    public final C496150Jcz LJ = new C496150Jcz(CoroutineExceptionHandler.LJJLIL, this);

    public abstract Object LIZ(LifecycleCoroutineScope lifecycleCoroutineScope, boolean z);

    public abstract Object LIZIZ(T t, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    public abstract boolean LIZJ();

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC496140Jcy(C495920Jcc c495920Jcc, List<? extends AbstractC495790JcP<?>> list) {
        this.LIZ = c495920Jcc;
        this.LIZIZ = list;
        this.LIZJ = (LiveProfilePreloadViewModel) C520010KaN.LJJJI(c495920Jcc.LIZ, LiveProfilePreloadViewModel.class, null, 14);
    }
}
