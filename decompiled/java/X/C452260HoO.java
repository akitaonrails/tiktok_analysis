package X;

import com.ss.android.ugc.aweme.experiment.CommentStickerTypingRecConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HoO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.sticker.typing.CommentTypingRecManager$scheduleDebounce$1", f = "CommentTypingRecManager.kt", l = {153, 155}, m = "invokeSuspend")
public final class C452260HoO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C452280HoQ LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C452260HoO(C452280HoQ c452280HoQ, String str, long j, InterfaceC1364105Vn<? super C452260HoO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c452280HoQ;
        this.LLILLL = str;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C452260HoO(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentTypingRecManager@ed40.scheduleDebounce$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("CommentTypingRecManager@ed40.scheduleDebounce$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            CommentStickerTypingRecConfig commentStickerTypingRecConfigLIZ = C452340HoW.LIZ();
            if (commentStickerTypingRecConfigLIZ == null) {
                commentStickerTypingRecConfigLIZ = C452340HoW.LIZ;
            }
            long j = commentStickerTypingRecConfigLIZ.pauseMs;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("CommentTypingRecManager@ed40.scheduleDebounce$1");
                return objLJFF;
            }
        }
        C452280HoQ c452280HoQ = this.LLILLJJLI;
        C452330HoV c452330HoV = c452280HoQ.LIZLLL;
        if (c452330HoV == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("CommentTypingRecManager@ed40.scheduleDebounce$1");
            return unit2;
        }
        String str = this.LLILLL;
        long j2 = this.LLILZ;
        this.LL = 2;
        if (c452280HoQ.LJ(c452330HoV, str, j2, this) == objLJFF) {
            C1C7U.LIZIZ("CommentTypingRecManager@ed40.scheduleDebounce$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("CommentTypingRecManager@ed40.scheduleDebounce$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
