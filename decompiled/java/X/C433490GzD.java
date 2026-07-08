package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.bottom.font.CustomizedBoardTextFontDescriptionColorAssem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0GzD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C433490GzD extends C09AY implements Function1<C01D5, Unit> {
    public final /* synthetic */ CustomizedBoardTextFontDescriptionColorAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C433490GzD(CustomizedBoardTextFontDescriptionColorAssem customizedBoardTextFontDescriptionColorAssem) {
        super(1);
        this.LL = customizedBoardTextFontDescriptionColorAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C01D5 c01d5) {
        Object next;
        C433480GzC c433480GzC = (C433480GzC) this.LL.LLIZLLLIL.getValue();
        int i = c01d5.LLILLJJLI;
        Iterator it2 = ((ArrayList) c433480GzC.LLILZIL).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((C0GS0) next).getColor() == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        View view = (View) next;
        if (view != null) {
            view.performClick();
        }
        return Unit.LIZ;
    }
}
