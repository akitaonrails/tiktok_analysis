package X;

import android.view.ViewGroup;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.CustomizedBoardKeyboardPlaceHolderAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0cAH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1001350cAH extends C09AY implements Function0<ViewGroup> {
    public final /* synthetic */ CustomizedBoardKeyboardPlaceHolderAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1001350cAH(CustomizedBoardKeyboardPlaceHolderAssem customizedBoardKeyboardPlaceHolderAssem) {
        super(0);
        this.LL = customizedBoardKeyboardPlaceHolderAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, android.view.ViewGroup] */
    @Override // kotlin.jvm.functions.Function0
    public final ViewGroup invoke() {
        return this.LL.LJJIJL().findViewById(R.id.chh);
    }
}
