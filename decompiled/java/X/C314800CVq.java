package X;

import com.bytedance.android.livesdk.comment.emoji.OnlineDrawableEmojiResourceManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CVq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.comment.emoji.OnlineDrawableEmojiResourceManager$getAllOnlineSmallEmoji$1", f = "OnlineDrawableEmojiResourceManager.kt", l = {107}, m = "invokeSuspend")
public final class C314800CVq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC314810CVr LL;
    public int LLILLJJLI;
    public final /* synthetic */ InterfaceC314810CVr<List<C1115490f8N>, Unit> LLILLL;
    public final /* synthetic */ OnlineDrawableEmojiResourceManager LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C314800CVq(InterfaceC314810CVr<List<C1115490f8N>, Unit> interfaceC314810CVr, OnlineDrawableEmojiResourceManager onlineDrawableEmojiResourceManager, InterfaceC1364105Vn<? super C314800CVq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC314810CVr;
        this.LLILZ = onlineDrawableEmojiResourceManager;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C314800CVq(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC314810CVr interfaceC314810CVr;
        C1C7U.LIZ("OnlineDrawableEmojiResourceManager@2e65.getAllOnlineSmallEmoji$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                interfaceC314810CVr = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC314810CVr = this.LLILLL;
            C1DFB c1dfb = C0PEM.LIZJ;
            C314830CVt c314830CVt = new C314830CVt(this.LLILZ, null);
            this.LL = interfaceC314810CVr;
            this.LLILLJJLI = 1;
            obj = C23250099c.LJI(this, c1dfb, c314830CVt);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("OnlineDrawableEmojiResourceManager@2e65.getAllOnlineSmallEmoji$1");
                return objLJFF;
            }
        }
        interfaceC314810CVr.apply(obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OnlineDrawableEmojiResourceManager@2e65.getAllOnlineSmallEmoji$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
