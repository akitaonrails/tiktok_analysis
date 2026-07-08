package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.RichTextStyleEditViewModel;
import com.bytedance.android.livesdk.userservice.UserService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.012Y, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C012Y extends C09AY implements Function1<C2880019q, Unit> {
    public final /* synthetic */ RichTextStyleEditViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C012Y(RichTextStyleEditViewModel richTextStyleEditViewModel) {
        super(1);
        this.LL = richTextStyleEditViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C2880019q c2880019q) {
        String str;
        int iIntValue;
        int iIntValue2 = this.LL.getState().LLILZLL.getFirst().intValue();
        int i = 2;
        if (iIntValue2 != 1) {
            if (iIntValue2 != 2) {
                str = "left";
                i = 1;
            } else {
                str = "right";
                i = 3;
            }
        } else {
            str = "center";
        }
        Integer num = this.LL.LLILZ.get(Integer.valueOf(i));
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = ((Number) C13LP.LJJJJZ(this.LL.LLILZ.values())).intValue();
        }
        this.LL.setState(new C229600uc(i, iIntValue));
        RichTextStyleEditViewModel.xQ2(this.LL, Integer.valueOf(i), null, null, null, null, null, null, false, null, null, null, 2046);
        if (((C01DP) this.LL.LL.getValue()).LIZ()) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_decoration_text_item_editing_page");
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
            c474500IjALIZ.LJJII(((C01DP) this.LL.LL.getValue()).LLILZ, "decoration_entrance");
            c474500IjALIZ.LJJII("click", "action_type");
            c474500IjALIZ.LJJII("alignment", "click_position");
            c474500IjALIZ.LJJII(str, "clicked_alignment");
            c474500IjALIZ.LIZ();
        }
        return Unit.LIZ;
    }
}
