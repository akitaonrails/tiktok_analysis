package X;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.userright.SeaUserRightViewHolderV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.03oU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C956003oU extends C09AY implements Function2<ExposeUserRight, ExposeUserRight, Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ SeaUserRightViewHolderV2 LLILLJJLI;
    public final /* synthetic */ C259800zU<Integer> LLILLL;
    public final /* synthetic */ C118300cf LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C956003oU(Context context, SeaUserRightViewHolderV2 seaUserRightViewHolderV2, C259800zU<Integer> c259800zU, C118300cf c118300cf, int i) {
        super(2);
        this.LL = context;
        this.LLILLJJLI = seaUserRightViewHolderV2;
        this.LLILLL = c259800zU;
        this.LLILZ = c118300cf;
        this.LLILZIL = i;
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [T, java.lang.Integer] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(ExposeUserRight exposeUserRight, ExposeUserRight exposeUserRight2) {
        int i;
        int i2;
        TuxTextView tuxTextViewLIZ;
        int[] iArr;
        ConstraintLayout constraintLayout;
        int i3;
        int i4;
        ExposeUserRight exposeUserRight3 = exposeUserRight2;
        int i5 = SeaUserRightViewHolderV2.LLJJLIIIJLLLLLLLZ;
        TuxTextView tuxTextViewLIZ2 = C956103oV.LIZ(this.LL, exposeUserRight);
        C118300cf c118300cf = this.LLILZ;
        int i6 = this.LLILZIL;
        C259800zU<Integer> c259800zU = this.LLILLL;
        tuxTextViewLIZ2.setId(View.generateViewId());
        C19ME c19me = new C19ME(-2, -2);
        c19me.setMargins(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        if (c118300cf.element == 0) {
            i = SeaUserRightViewHolderV2.LLJL;
        } else {
            i = SeaUserRightViewHolderV2.LLJLIL;
        }
        c19me.setMarginStart(i);
        if (c118300cf.element == i6 - 1) {
            i2 = SeaUserRightViewHolderV2.LLJLILLLLZIIL;
        } else {
            i2 = 0;
        }
        c19me.setMarginEnd(i2);
        c19me.topToTop = 0;
        Integer num = c259800zU.element;
        if (num != null) {
            c19me.startToEnd = num.intValue();
        } else {
            c19me.startToStart = 0;
        }
        C786410Ut5.R6(tuxTextViewLIZ2, c19me);
        Integer numValueOf = null;
        if (exposeUserRight3 != null) {
            Context context = this.LL;
            C118300cf c118300cf2 = this.LLILZ;
            int i7 = this.LLILZIL;
            C259800zU<Integer> c259800zU2 = this.LLILLL;
            tuxTextViewLIZ = C956103oV.LIZ(context, exposeUserRight3);
            tuxTextViewLIZ.setId(View.generateViewId());
            C19ME c19me2 = new C19ME(-2, -2);
            c19me2.setMargins(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
            if (c118300cf2.element == 0) {
                i3 = SeaUserRightViewHolderV2.LLJL;
            } else {
                i3 = SeaUserRightViewHolderV2.LLJLIL;
            }
            c19me2.setMarginStart(i3);
            if (c118300cf2.element == i7 - 1) {
                i4 = SeaUserRightViewHolderV2.LLJLILLLLZIIL;
            } else {
                i4 = 0;
            }
            c19me2.setMarginEnd(i4);
            c19me2.topToBottom = tuxTextViewLIZ2.getId();
            c19me2.bottomToBottom = 0;
            Integer num2 = c259800zU2.element;
            if (num2 != null) {
                c19me2.startToEnd = num2.intValue();
            } else {
                c19me2.startToStart = 0;
            }
            C786410Ut5.R6(tuxTextViewLIZ, c19me2);
        } else {
            tuxTextViewLIZ = null;
        }
        ConstraintLayout constraintLayout2 = this.LLILLJJLI.LLJJL;
        if (constraintLayout2 != null) {
            constraintLayout2.addView(tuxTextViewLIZ2);
        }
        if (tuxTextViewLIZ != null && (constraintLayout = this.LLILLJJLI.LLJJL) != null) {
            constraintLayout.addView(tuxTextViewLIZ);
        }
        Context context2 = this.LL;
        int id = tuxTextViewLIZ2.getId();
        if (tuxTextViewLIZ != null) {
            numValueOf = Integer.valueOf(tuxTextViewLIZ.getId());
        }
        C19MW c19mw = new C19MW(context2);
        c19mw.setId(View.generateViewId());
        c19mw.setType(6);
        if (numValueOf != null) {
            iArr = new int[]{id, numValueOf.intValue()};
        } else {
            iArr = new int[]{id};
        }
        c19mw.setReferencedIds(iArr);
        C118300cf c118300cf3 = this.LLILZ;
        int i8 = this.LLILZIL;
        C19ME c19me3 = new C19ME(-2, -2);
        if (c118300cf3.element == i8 - 1) {
            c19me3.endToEnd = 0;
        }
        C786410Ut5.l6(c19mw, c19me3);
        ConstraintLayout constraintLayout3 = this.LLILLJJLI.LLJJL;
        if (constraintLayout3 != null) {
            constraintLayout3.addView(c19mw);
        }
        this.LLILLL.element = Integer.valueOf(c19mw.getId());
        this.LLILZ.element++;
        return Unit.LIZ;
    }
}
