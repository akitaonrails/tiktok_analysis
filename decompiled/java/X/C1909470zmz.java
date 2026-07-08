package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFLocalTestAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zmz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1909470zmz extends C09AY implements Function0<ViewGroup> {
    public final /* synthetic */ MFLocalTestAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1909470zmz(MFLocalTestAssem mFLocalTestAssem) {
        super(0);
        this.LL = mFLocalTestAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, android.view.ViewGroup] */
    @Override // kotlin.jvm.functions.Function0
    public final ViewGroup invoke() {
        return this.LL.LJJIJL().findViewById(R.id.i9v);
    }
}
