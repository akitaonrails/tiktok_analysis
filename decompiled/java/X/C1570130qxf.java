package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFFeedAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qxf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1570130qxf extends C09AY implements Function0<ViewGroup> {
    public final /* synthetic */ MFFeedAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1570130qxf(MFFeedAssem mFFeedAssem) {
        super(0);
        this.LL = mFFeedAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, android.view.ViewGroup] */
    @Override // kotlin.jvm.functions.Function0
    public final ViewGroup invoke() {
        return this.LL.LJJIJL().findViewById(R.id.i9v);
    }
}
