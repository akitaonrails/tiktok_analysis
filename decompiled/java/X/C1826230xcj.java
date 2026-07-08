package X;

import android.graphics.Typeface;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.content.CustomizedBoardTextEditContentDescriptionAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xcj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1826230xcj extends C09AY implements Function2<UIAssem, C291001Au<? extends Typeface>, Unit> {
    public final /* synthetic */ CustomizedBoardTextEditContentDescriptionAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1826230xcj(CustomizedBoardTextEditContentDescriptionAssem customizedBoardTextEditContentDescriptionAssem) {
        super(2);
        this.LL = customizedBoardTextEditContentDescriptionAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends Typeface> c291001Au) {
        Typeface typefaceLIZ = c291001Au.LIZ();
        if (typefaceLIZ != null) {
            CustomizedBoardTextEditContentDescriptionAssem customizedBoardTextEditContentDescriptionAssem = this.LL;
            customizedBoardTextEditContentDescriptionAssem.ip().setFontType(typefaceLIZ);
            customizedBoardTextEditContentDescriptionAssem.mp(customizedBoardTextEditContentDescriptionAssem.ip());
        }
        return Unit.LIZ;
    }
}
