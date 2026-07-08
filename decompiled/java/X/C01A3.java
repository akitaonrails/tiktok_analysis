package X;

import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.bottom.font.CustomizedBoardTextFontButtonLayoutAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01A3, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01A3 extends C09AY implements Function2<UIAssem, Function0<? extends C419910GdJ>, Unit> {
    public final /* synthetic */ CustomizedBoardTextFontButtonLayoutAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01A3(CustomizedBoardTextFontButtonLayoutAssem customizedBoardTextFontButtonLayoutAssem) {
        super(2);
        this.LL = customizedBoardTextFontButtonLayoutAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, Function0<? extends C419910GdJ> function0) {
        C419910GdJ c419910GdJInvoke = function0.invoke();
        CustomizedBoardTextFontButtonLayoutAssem customizedBoardTextFontButtonLayoutAssem = this.LL;
        customizedBoardTextFontButtonLayoutAssem.Go((LiveIconView) customizedBoardTextFontButtonLayoutAssem.LLIZLLLIL.getValue(), c419910GdJInvoke);
        return Unit.LIZ;
    }
}
