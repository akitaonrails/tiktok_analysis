package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0syF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.secretreplies.RecordSecretRepliesResponseStickerComponent$onCreate$1$1$1$1", f = "RecordSecretRepliesResponseStickerComponent.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
public final class C1647370syF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0FTJ<StickerModel> LLILLJJLI;
    public final /* synthetic */ C1647170sxv LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1647370syF(C0FTJ<? extends StickerModel> c0ftj, C1647170sxv c1647170sxv, InterfaceC1364105Vn<? super C1647370syF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0ftj;
        this.LLILLL = c1647170sxv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1647370syF(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordSecretRepliesResponseStickerComponent@bc03.onCreate$1$1$1$1");
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
            C0FTJ<StickerModel> c0ftj = this.LLILLJJLI;
            if (c0ftj != null) {
                this.LL = 1;
                if (c0ftj.LJIJJ(false, this) == objLJFF) {
                    C1C7U.LIZIZ("RecordSecretRepliesResponseStickerComponent@bc03.onCreate$1$1$1$1");
                    return objLJFF;
                }
            }
        }
        this.LLILLL.jw1();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecordSecretRepliesResponseStickerComponent@bc03.onCreate$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
