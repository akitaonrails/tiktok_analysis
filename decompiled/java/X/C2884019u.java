package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.bottom.font.CustomizedBoardTextFontButtonLayoutAssem;
import com.bytedance.assem.arch.core.UIAssem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.019u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2884019u extends C09AY implements Function2<UIAssem, List<Integer>, Unit> {
    public final /* synthetic */ CustomizedBoardTextFontButtonLayoutAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2884019u(CustomizedBoardTextFontButtonLayoutAssem customizedBoardTextFontButtonLayoutAssem) {
        super(2);
        this.LL = customizedBoardTextFontButtonLayoutAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, List<Integer> list) {
        ((C2883019t) this.LL.Ho().LLILLJJLI.getValue()).LIZIZ(list);
        this.LL.Ho().wQ2();
        return Unit.LIZ;
    }
}
