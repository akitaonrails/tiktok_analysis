package X;

import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.TypingStickerRecommendAssem;
import com.ss.android.ugc.aweme.experiment.CommentStickerTypingRecConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HoK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.TypingStickerRecommendAssem$restartAutoDismiss$1", f = "TypingStickerRecommendAssem.kt", l = {156}, m = "invokeSuspend")
public final class C452220HoK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TypingStickerRecommendAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C452220HoK(TypingStickerRecommendAssem typingStickerRecommendAssem, InterfaceC1364105Vn<? super C452220HoK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = typingStickerRecommendAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C452220HoK(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TypingStickerRecommendAssem@fc2.restartAutoDismiss$1");
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
            CommentStickerTypingRecConfig commentStickerTypingRecConfigLIZ = C452340HoW.LIZ();
            if (commentStickerTypingRecConfigLIZ == null) {
                commentStickerTypingRecConfigLIZ = C452340HoW.LIZ;
            }
            long j = commentStickerTypingRecConfigLIZ.autoDisappearTimeMs;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("TypingStickerRecommendAssem@fc2.restartAutoDismiss$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.getClass();
        this.LLILLJJLI.mp(false);
        this.LLILLJJLI.LLJJIJIIJIL = null;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TypingStickerRecommendAssem@fc2.restartAutoDismiss$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
