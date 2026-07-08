package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent.RichTextPreviewView;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.BoardItem;

/* JADX INFO: renamed from: X.0xNZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent.RichTextPreviewView", f = "RichTextPreviewView.kt", l = {137}, m = "generateBoardTextPreviews")
public final class C1816830xNZ extends AbstractC23140094w {
    public Board LL;
    public C817403Hg LLILLJJLI;
    public Object LLILLL;
    public BoardItem LLILZ;
    public int LLILZIL;
    public long LLILZLL;
    public float LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ RichTextPreviewView LLJ;
    public int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1816830xNZ(RichTextPreviewView richTextPreviewView, InterfaceC1364105Vn<? super C1816830xNZ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJ = richTextPreviewView;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RichTextPreviewView@d7e5.generateBoardTextPreviews$1");
        this.LLIZLLLIL = obj;
        this.LLJI |= Integer.MIN_VALUE;
        Object objI0 = this.LLJ.i0(null, 0, 0L, this);
        C1C7U.LIZIZ("RichTextPreviewView@d7e5.generateBoardTextPreviews$1");
        return objI0;
    }
}
