package X;

import com.ss.android.ugc.aweme.ability.IPhotoModeAbility;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0SIQ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SIQ<V> implements Callable {
    public final /* synthetic */ C718770SHj LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ IPhotoModeAbility LLILLL;

    public C0SIQ(C718770SHj c718770SHj, boolean z, IPhotoModeAbility iPhotoModeAbility) {
        this.LL = c718770SHj;
        this.LLILLJJLI = z;
        this.LLILLL = iPhotoModeAbility;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1C7U.LIZ("NewVideoDescDelegate@fb8f.trackDescToggle$1");
        this.LL.LLILLJJLI.PQ2(this.LLILLJJLI, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NewVideoDescDelegate@fb8f.trackDescToggle$1");
        return unit;
    }
}
