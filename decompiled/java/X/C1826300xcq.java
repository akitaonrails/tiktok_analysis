package X;

import android.widget.LinearLayout;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.content.CustomizedBoardTextEditContentDescriptionAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xcq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1826300xcq extends C09AY implements Function0<LinearLayout> {
    public final /* synthetic */ CustomizedBoardTextEditContentDescriptionAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1826300xcq(CustomizedBoardTextEditContentDescriptionAssem customizedBoardTextEditContentDescriptionAssem) {
        super(0);
        this.LL = customizedBoardTextEditContentDescriptionAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, android.widget.LinearLayout] */
    @Override // kotlin.jvm.functions.Function0
    public final LinearLayout invoke() {
        return this.LL.getContentView().findViewById(R.id.cxx);
    }
}
