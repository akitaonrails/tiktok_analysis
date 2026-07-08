package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.assem.FakeSubSpaceEditorAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JuD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C506830JuD extends C09AY implements Function0<View> {
    public final /* synthetic */ FakeSubSpaceEditorAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C506830JuD(FakeSubSpaceEditorAssem fakeSubSpaceEditorAssem) {
        super(0);
        this.LL = fakeSubSpaceEditorAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        return this.LL.getContentView().findViewById(R.id.hkj);
    }
}
