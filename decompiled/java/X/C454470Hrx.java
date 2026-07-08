package X;

import android.view.View;
import com.ss.android.ugc.aweme.comment.model.CommentStickerStruct;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hrx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.photocomment.component.CommentImageComponent$bindCommentStickerLegacy$4$onComplete$2$1$1", f = "CommentImageComponent.kt", l = {}, m = "invokeSuspend")
public final class C454470Hrx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Map<String, String> LL;
    public final /* synthetic */ C1341150l0L LLILLJJLI;
    public final /* synthetic */ CommentStickerStruct LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C454470Hrx(Map<String, String> map, C1341150l0L c1341150l0L, CommentStickerStruct commentStickerStruct, View view, boolean z, InterfaceC1364105Vn<? super C454470Hrx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = map;
        this.LLILLJJLI = c1341150l0L;
        this.LLILLL = commentStickerStruct;
        this.LLILZ = view;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C454470Hrx(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a9  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C454470Hrx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
