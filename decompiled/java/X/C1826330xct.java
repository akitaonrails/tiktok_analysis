package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.content.CustomizedBoardTextEditContentDescriptionAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1826330xct extends C09AY implements Function0<C1836370xt5> {
    public final /* synthetic */ CustomizedBoardTextEditContentDescriptionAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1826330xct(CustomizedBoardTextEditContentDescriptionAssem customizedBoardTextEditContentDescriptionAssem) {
        super(0);
        this.LL = customizedBoardTextEditContentDescriptionAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0xt5, android.view.View] */
    @Override // kotlin.jvm.functions.Function0
    public final C1836370xt5 invoke() {
        return this.LL.getContentView().findViewById(R.id.fp2);
    }
}
