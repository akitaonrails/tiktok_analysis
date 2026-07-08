package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Sb2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC724260Sb2 implements ViewModelStoreOwner, LifecycleOwner, InterfaceC736810SvH, InterfaceC725050ScJ, C03H5 {
    public Object LL;
    public List<? extends Object> LLILLJJLI;
    public volatile boolean LLILLL;
    public ViewModelProvider LLILZ;
    public ReusedAssem<? extends C03H5> LLILZIL;
    public C19719912Dl LLILZLL;
    public Function0<Integer> LLIZ;
    public boolean LLIZLLLIL;
    public Object LLJ;
    public long LLJI;

    public abstract void LIZLLL(ReusedAssem<?> reusedAssem, long j);

    public abstract void LJ(AssemViewModel<?> assemViewModel, Object obj);

    public AbstractC724260Sb2() {
        new CopyOnWriteArrayList();
    }
}
