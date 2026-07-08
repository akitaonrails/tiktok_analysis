package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent.RichTextPreviewView;
import com.bytedance.android.livesdk.model.BoardItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xNb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1816850xNb extends C09AY implements Function0<Unit> {
    public final /* synthetic */ RichTextPreviewView LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ C1838450xwR LLILLL;
    public final /* synthetic */ C229200uY LLILZ;
    public final /* synthetic */ float LLILZIL;
    public final /* synthetic */ BoardItem LLILZLL;
    public final /* synthetic */ InterfaceC20236714Gf<View> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1816850xNb(RichTextPreviewView richTextPreviewView, List list, C1838450xwR c1838450xwR, C229200uY c229200uY, float f, BoardItem boardItem, C2252611DEt c2252611DEt) {
        super(0);
        this.LL = richTextPreviewView;
        this.LLILLJJLI = list;
        this.LLILLL = c1838450xwR;
        this.LLILZ = c229200uY;
        this.LLILZIL = f;
        this.LLILZLL = boardItem;
        this.LLIZ = c2252611DEt;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1839560xyE.LIZ(this.LL.getContext(), this.LLILLJJLI, new C1816890xNf(), new C801603Be(), new C1816840xNa(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LL, this.LLIZ));
        return Unit.LIZ;
    }
}
