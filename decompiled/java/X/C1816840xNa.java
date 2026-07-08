package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent.RichTextPreviewView;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.BoardItemTransform;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xNa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1816840xNa extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C1838450xwR LL;
    public final /* synthetic */ C229200uY LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ BoardItem LLILZ;
    public final /* synthetic */ RichTextPreviewView LLILZIL;
    public final /* synthetic */ InterfaceC20236714Gf<View> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1816840xNa(C1838450xwR c1838450xwR, C229200uY c229200uY, float f, BoardItem boardItem, RichTextPreviewView richTextPreviewView, InterfaceC20236714Gf<? super View> interfaceC20236714Gf) {
        super(1);
        this.LL = c1838450xwR;
        this.LLILLJJLI = c229200uY;
        this.LLILLL = f;
        this.LLILZ = boardItem;
        this.LLILZIL = richTextPreviewView;
        this.LLILZLL = interfaceC20236714Gf;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) throws Throwable {
        float f;
        bool.booleanValue();
        this.LL.i0(this.LLILLJJLI, false);
        float f2 = this.LLILLL;
        BoardItemTransform boardItemTransform = this.LLILZ.transform;
        if (boardItemTransform != null) {
            f = boardItemTransform.scale;
        } else {
            f = 1.0f;
        }
        float f3 = f2 * f;
        RichTextPreviewView richTextPreviewView = this.LLILZIL;
        C1838450xwR c1838450xwR = this.LL;
        richTextPreviewView.getClass();
        RichTextPreviewView.e0(c1838450xwR, f3);
        C500260Jjc.LJIILLIIL(this.LL);
        ConstraintLayout dslPreviewsContainer = this.LLILZIL.getDslPreviewsContainer();
        if (dslPreviewsContainer != null) {
            dslPreviewsContainer.addView(this.LL);
        }
        InterfaceC20236714Gf<View> interfaceC20236714Gf = this.LLILZLL;
        C1838450xwR c1838450xwR2 = this.LL;
        C189200o6.m2constructorimpl(c1838450xwR2);
        interfaceC20236714Gf.resumeWith(c1838450xwR2);
        return Unit.LIZ;
    }
}
