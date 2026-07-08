package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.DecorationTextEditContentAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xwI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1838360xwI extends C09AY implements Function0<C1838450xwR> {
    public final /* synthetic */ DecorationTextEditContentAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1838360xwI(DecorationTextEditContentAssem decorationTextEditContentAssem) {
        super(0);
        this.LL = decorationTextEditContentAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0xwR, android.view.View] */
    @Override // kotlin.jvm.functions.Function0
    public final C1838450xwR invoke() {
        return this.LL.getContentView().findViewById(R.id.fhs);
    }
}
