package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.preload.services.PreloadServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0cde, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1019560cde extends C09AY implements Function1<Fragment, Unit> {
    public final /* synthetic */ PreloadServiceImpl LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1019560cde(PreloadServiceImpl preloadServiceImpl, String str) {
        super(1);
        this.LL = preloadServiceImpl;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Fragment fragment) {
        PreloadServiceImpl preloadServiceImpl = this.LL;
        String str = this.LLILLJJLI;
        preloadServiceImpl.getClass();
        PreloadServiceImpl.LIZIZ(fragment, str);
        return Unit.LIZ;
    }
}
