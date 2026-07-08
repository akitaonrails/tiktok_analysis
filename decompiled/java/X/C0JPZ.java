package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.RichTextStyleEditViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.TextSizeSliderAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JPZ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JPZ extends C09AY implements Function1<Integer, Unit> {
    public final /* synthetic */ TextSizeSliderAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JPZ(TextSizeSliderAssem textSizeSliderAssem) {
        super(1);
        this.LL = textSizeSliderAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        TextSizeSliderAssem textSizeSliderAssem = this.LL;
        textSizeSliderAssem.getClass();
        double dLJ = ((double) C13LZ.LJ(iIntValue, 0, 100)) / 100.0d;
        int i = textSizeSliderAssem.LLJILJIL;
        int i2 = textSizeSliderAssem.LLJIJIL;
        int iLJ = C13LZ.LJ(C814420VxA.LIZ(((double) i2) + (dLJ * ((double) (i - i2)))), textSizeSliderAssem.LLJIJIL, textSizeSliderAssem.LLJILJIL);
        AssemVMLazy assemVMLazy = this.LL.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = TextSizeSliderAssem.LLJILJILJ;
        RichTextStyleEditViewModel richTextStyleEditViewModel = (RichTextStyleEditViewModel) assemVMLazy.getValue();
        richTextStyleEditViewModel.withState(new C229800ue(richTextStyleEditViewModel, iLJ));
        return Unit.LIZ;
    }
}
