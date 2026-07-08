package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.RichTextStyleEditViewModel;
import com.bytedance.android.livesdk.userservice.UserService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.019n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2877019n extends C09AY implements Function1<C2880019q, Unit> {
    public final /* synthetic */ RichTextStyleEditViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2877019n(RichTextStyleEditViewModel richTextStyleEditViewModel) {
        super(1);
        this.LL = richTextStyleEditViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C2880019q c2880019q) {
        C2878019o c2878019oFirst;
        String str;
        C2883019t c2883019t = (C2883019t) this.LL.LLILLJJLI.getValue();
        if (c2883019t.LIZIZ.isEmpty()) {
            c2878019oFirst = c2883019t.LIZ();
        } else {
            C13E8<C2878019o> c13e8 = c2883019t.LIZIZ;
            c13e8.addLast(c13e8.removeFirst());
            c2878019oFirst = c2883019t.LIZIZ.first();
        }
        int i = c2878019oFirst.LIZ;
        this.LL.setState(new C233700vH(i, c2878019oFirst.LIZIZ));
        RichTextStyleEditViewModel richTextStyleEditViewModel = this.LL;
        richTextStyleEditViewModel.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_decoration_text_item_editing_page");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(((C01DP) richTextStyleEditViewModel.LL.getValue()).LLILZ, "decoration_entrance");
        c474500IjALIZ.LJJII("click", "action_type");
        c474500IjALIZ.LJJII("style", "click_position");
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 6) {
                                if (i != 999) {
                                    str = "";
                                } else {
                                    str = "ignore";
                                }
                            } else {
                                str = "outline_thin";
                            }
                        } else {
                            str = "3d";
                        }
                    } else {
                        str = "translucent";
                    }
                } else {
                    str = "solid_color";
                }
            } else {
                str = "with_outline";
            }
        } else {
            str = "no_outline";
        }
        c474500IjALIZ.LJJII(str, "clicked_style");
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }
}
