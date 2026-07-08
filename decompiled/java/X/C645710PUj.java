package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.delegate.LifecycleDelegate;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0PUj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C645710PUj extends C645700PUi {
    public static final /* synthetic */ int LLILZIL = 0;
    public final LifecycleDelegate LLILLL;
    public final C647810Pb1 LLILZ;

    public C645710PUj(C647830Pb3 c647830Pb3) {
        super(c647830Pb3);
        LifecycleDelegate lifecycleDelegate = new LifecycleDelegate(c647830Pb3);
        this.LLILLL = lifecycleDelegate;
        C647810Pb1 c647810Pb1 = new C647810Pb1(c647830Pb3);
        this.LLILZ = c647810Pb1;
        ((ArrayList) this.LLILLJJLI).add(c647810Pb1);
        ((ArrayList) this.LLILLJJLI).add(lifecycleDelegate);
    }
}
