package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import java.util.List;

/* JADX INFO: renamed from: X.0Jc4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC495580Jc4<T> extends AbstractC495800JcQ<T> {
    public final int LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final MutableLiveData<List<EnumC495590Jc5>> LLJ;

    public AbstractC495580Jc4(C495920Jcc c495920Jcc) {
        int iLJIILLIIL;
        super(c495920Jcc);
        if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Nx()) {
            iLJIILLIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(375));
        } else if (c495920Jcc.LJ) {
            iLJIILLIIL = C497740JfY.LJIIZILJ();
        } else {
            iLJIILLIIL = C497740JfY.LJIILLIIL();
        }
        this.LLILZIL = iLJIILLIIL;
        this.LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        this.LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
        this.LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        this.LLJ = new MutableLiveData<>();
    }
}
