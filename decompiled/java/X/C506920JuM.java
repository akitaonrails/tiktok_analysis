package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.assem.FakeSubSpaceEditorAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JuM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C506920JuM extends C09AY implements Function0<C1110070ezd> {
    public final /* synthetic */ FakeSubSpaceEditorAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C506920JuM(FakeSubSpaceEditorAssem fakeSubSpaceEditorAssem) {
        super(0);
        this.LL = fakeSubSpaceEditorAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0ezd, android.view.View] */
    @Override // kotlin.jvm.functions.Function0
    public final C1110070ezd invoke() {
        return this.LL.getContentView().findViewById(R.id.gs5);
    }
}
