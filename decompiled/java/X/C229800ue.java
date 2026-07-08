package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.RichTextStyleEditViewModel;
import com.bytedance.android.livesdk.model.RichTextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.00ue, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C229800ue extends C09AY implements Function1<C2880019q, Unit> {
    public final /* synthetic */ RichTextStyleEditViewModel LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C229800ue(RichTextStyleEditViewModel richTextStyleEditViewModel, int i) {
        super(1);
        this.LL = richTextStyleEditViewModel;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C2880019q c2880019q) {
        RichTextStyle richTextStyleLIZ;
        int iIntValue;
        C229200uY c229200uY = this.LL.getState().LLILLJJLI.LIZ;
        if (c229200uY != null && (richTextStyleLIZ = c229200uY.LIZ()) != null) {
            Integer numValueOf = Integer.valueOf(richTextStyleLIZ.fontSize);
            if (numValueOf.intValue() != 0) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 24;
            }
            RichTextStyleEditViewModel richTextStyleEditViewModel = this.LL;
            richTextStyleLIZ.fontSize = this.LLILLJJLI;
            richTextStyleEditViewModel.vQ2(richTextStyleLIZ, iIntValue);
            this.LL.setState(new C229700ud(c229200uY));
        }
        return Unit.LIZ;
    }
}
