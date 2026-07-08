package X;

import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.bottom.font.CustomizedBoardTextFontButtonLayoutAssem;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01A1, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01A1 extends C09AY implements Function2<UIAssem, Pair<? extends Integer, ? extends Integer>, Unit> {
    public final /* synthetic */ CustomizedBoardTextFontButtonLayoutAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01A1(CustomizedBoardTextFontButtonLayoutAssem customizedBoardTextFontButtonLayoutAssem) {
        super(2);
        this.LL = customizedBoardTextFontButtonLayoutAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, Pair<? extends Integer, ? extends Integer> pair) {
        int iIntValue = pair.getSecond().intValue();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LJ = Integer.valueOf(R.attr.c9i);
        c419910GdJ.LIZ = iIntValue;
        CustomizedBoardTextFontButtonLayoutAssem customizedBoardTextFontButtonLayoutAssem = this.LL;
        customizedBoardTextFontButtonLayoutAssem.Go((LiveIconView) customizedBoardTextFontButtonLayoutAssem.LLJ.getValue(), c419910GdJ);
        return Unit.LIZ;
    }
}
