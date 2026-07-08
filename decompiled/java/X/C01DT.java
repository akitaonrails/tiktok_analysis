package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.title.CustomizedBoardTitleDoneAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01DT, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01DT extends C09AY implements Function2<UIAssem, C291001Au<? extends Boolean>, Unit> {
    public final /* synthetic */ CustomizedBoardTitleDoneAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01DT(CustomizedBoardTitleDoneAssem customizedBoardTitleDoneAssem) {
        super(2);
        this.LL = customizedBoardTitleDoneAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends Boolean> c291001Au) {
        T t = c291001Au.LIZ;
        this.LL.Jo().setState(new C1159370gH9(((Boolean) t).booleanValue()));
        return Unit.LIZ;
    }
}
