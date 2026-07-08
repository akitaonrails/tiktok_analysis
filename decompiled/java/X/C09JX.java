package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09JX, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.sticker.editcomponent.sharedcomment.SharedCommentStickerView$loadImageForCompile$1", f = "SharedCommentStickerView.kt", l = {217}, m = "invokeSuspend")
public final class C09JX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ C1322110kVd LLILLJJLI;
    public final /* synthetic */ UrlModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09JX(C1322110kVd c1322110kVd, UrlModel urlModel, InterfaceC1364105Vn<? super C09JX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1322110kVd;
        this.LLILLL = urlModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09JX(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SharedCommentStickerView@8e71.loadImageForCompile$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C19591311kt c19591311kt = C19591311kt.LIZ;
            C1322110kVd c1322110kVd = this.LLILLJJLI;
            UrlModel urlModel = this.LLILLL;
            float f = C19578811is.LLJ;
            c19591311kt.getClass();
            C099F c099fLJII = C19591311kt.LJII(c1322110kVd, urlModel, f, f, f, f);
            this.LL = 1;
            obj = c099fLJII.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SharedCommentStickerView@8e71.loadImageForCompile$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SharedCommentStickerView@8e71.loadImageForCompile$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
