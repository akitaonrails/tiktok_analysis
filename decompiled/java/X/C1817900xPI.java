package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.bottom.font.CustomizedBoardTextFontSelectAreaAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm.FullyCustomizedBoardEditFontViewModel;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.BoardItemStyle;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xPI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1817900xPI extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ CustomizedBoardTextFontSelectAreaAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1817900xPI(CustomizedBoardTextFontSelectAreaAssem customizedBoardTextFontSelectAreaAssem) {
        super(1);
        this.LL = customizedBoardTextFontSelectAreaAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        List<String> list;
        View view2 = view;
        if (view2 != null) {
            this.LL.LLIZLLLIL = view2;
        }
        FullyCustomizedBoardEditFontViewModel fullyCustomizedBoardEditFontViewModelGo = this.LL.Go();
        View view3 = this.LL.LLIZLLLIL;
        BoardItemStyle boardItemStyle = ((BoardItem) fullyCustomizedBoardEditFontViewModelGo.LLILLL.getValue()).style;
        if (boardItemStyle != null && (list = boardItemStyle.fonts) != null) {
            int i = 0;
            for (String str : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    String str2 = str;
                    InterfaceC971680bOQ interfaceC971680bOQ = fullyCustomizedBoardEditFontViewModelGo.LL;
                    if (interfaceC971680bOQ != null) {
                        interfaceC971680bOQ.LIZJ(view3, str2, new C1817920xPK(fullyCustomizedBoardEditFontViewModelGo, i));
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return Unit.LIZ;
    }
}
