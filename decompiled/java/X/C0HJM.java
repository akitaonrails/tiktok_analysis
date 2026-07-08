package X;

import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0HJM, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.replytosticker.ReplyToStickerUtil$buildSimilarStickerGrid$dataSource$1", f = "ReplyToStickerUtil.kt", l = {170}, m = "invokeSuspend")
public final class C0HJM extends C09AX implements Function1<InterfaceC1364105Vn<? super List<? extends StickerItem>>, Object> {
    public int LL;
    public final /* synthetic */ C869590Y9l LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HJM(C869590Y9l c869590Y9l, InterfaceC1364105Vn<? super C0HJM> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c869590Y9l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HJM(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super List<? extends StickerItem>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Function1<InterfaceC1364105Vn<? super List<StickerItem>>, Object> function1;
        C1C7U.LIZ("ReplyToStickerUtil@c6c1.buildSimilarStickerGrid$dataSource$1");
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
            C0HJO c0hjoLIZ = C453530HqR.LIZ(this.LLILLJJLI);
            if (c0hjoLIZ != null && (function1 = c0hjoLIZ.LIZIZ) != null) {
                this.LL = 1;
                obj = function1.invoke(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ReplyToStickerUtil@c6c1.buildSimilarStickerGrid$dataSource$1");
                    return objLJFF;
                }
            }
            obj = C13BV.INSTANCE;
            C1C7U.LIZIZ("ReplyToStickerUtil@c6c1.buildSimilarStickerGrid$dataSource$1");
            return obj;
        }
        if (obj == null) {
            obj = C13BV.INSTANCE;
        }
        C1C7U.LIZIZ("ReplyToStickerUtil@c6c1.buildSimilarStickerGrid$dataSource$1");
        return obj;
    }
}
