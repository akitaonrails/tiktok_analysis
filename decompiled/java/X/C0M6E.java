package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0M6E, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public abstract class C0M6E extends AbstractC1620180sGO<C553680Lna> {
    public final Context LLILZIL;
    public final SafeHandler LLILZLL;
    public final AtomicInteger LLIZ;
    public final C557050Lt1 LLIZLLLIL;
    public Drawable LLJ;

    public C0M6E(View view, ViewGroup viewGroup) {
        LifecycleOwner lifecycleOwnerLIZIZ;
        super(view);
        this.LLIZ = new AtomicInteger(0);
        this.LLIZLLLIL = new C557050Lt1(false);
        this.LLJ = null;
        Context context = view.getContext();
        this.LLILZIL = context;
        if (context != null && (lifecycleOwnerLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            LifecycleOwner lifecycleOwnerFindSAFExpLifecycleOwner = IMainSAFLifecycleKt.findSAFExpLifecycleOwner(viewGroup, (C19EG) null);
            this.LLILZLL = new SafeHandler(lifecycleOwnerFindSAFExpLifecycleOwner != null ? lifecycleOwnerFindSAFExpLifecycleOwner : lifecycleOwnerLIZIZ);
        }
    }
}
