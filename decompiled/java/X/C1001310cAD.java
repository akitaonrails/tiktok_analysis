package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.CustomizedBoardKeyboardPlaceHolderAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0cAD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1001310cAD extends C09AY implements Function2<UIAssem, Integer, Unit> {
    public final /* synthetic */ CustomizedBoardKeyboardPlaceHolderAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1001310cAD(CustomizedBoardKeyboardPlaceHolderAssem customizedBoardKeyboardPlaceHolderAssem) {
        super(2);
        this.LL = customizedBoardKeyboardPlaceHolderAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, Integer num) {
        this.LL.LLJI = num.intValue();
        return Unit.LIZ;
    }
}
