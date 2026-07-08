package X;

import com.bytedance.poplayer.BasePopupTask;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS397S0200000_31;

/* JADX INFO: renamed from: X.15sq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractC20659815sq<Popup> extends BasePopupTask<Popup> implements C11VC {
    public final AtomicBoolean LL;
    public final AtomicBoolean LLILLJJLI;
    public final C1DEK LLILLL;
    public Function1<? super Boolean, Unit> LLILZ;

    @Override // X.C11VC
    public final long getTimeout() {
        return Mp4ScreenVideoLoadTimeout.CONTROL;
    }

    public AbstractC20659815sq() {
        super(C20660315sv.LL);
        this.LL = new AtomicBoolean(false);
        this.LLILLJJLI = new AtomicBoolean(false);
        this.LLILLL = C095G.LIZ(0, null, 7);
    }

    @Override // X.C11VC
    public final Function1<Boolean, Unit> LIZ() {
        return this.LLILZ;
    }

    @Override // X.C11VC
    public final C1DEK LJ() {
        return this.LLILLL;
    }

    @Override // X.C11VC
    public final AtomicBoolean LJIIIZ() {
        return this.LLILLJJLI;
    }

    @Override // X.C11VC
    public final AtomicBoolean LJIIJJI() {
        return this.LL;
    }

    @Override // X.C11VC
    public final void LIZJ(AwS397S0200000_31 awS397S0200000_31) {
        this.LLILZ = awS397S0200000_31;
    }
}
