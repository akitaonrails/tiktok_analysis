package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mly, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.image.textsticker.CommentImageEditStickerTextComponent$getStickerEventListener$1$onMoveBegin$1", f = "CommentImageEditStickerTextComponent.kt", l = {443}, m = "invokeSuspend")
public final class C1409120mly extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C19626111qV LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1409120mly(C19626111qV c19626111qV, InterfaceC1364105Vn<? super C1409120mly> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c19626111qV;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1409120mly(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentImageEditStickerTextComponent@2376.getStickerEventListener$1$onMoveBegin$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(100L, this) == objLJFF) {
                C1C7U.LIZIZ("CommentImageEditStickerTextComponent@2376.getStickerEventListener$1$onMoveBegin$1");
                return objLJFF;
            }
        }
        InterfaceC1451690nsd interfaceC1451690nsdO2 = this.LLILLJJLI.o2();
        if (interfaceC1451690nsdO2 != null) {
            interfaceC1451690nsdO2.hide();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentImageEditStickerTextComponent@2376.getStickerEventListener$1$onMoveBegin$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
