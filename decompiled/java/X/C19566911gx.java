package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.11gx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.download.DraftStickerDownloadListener$onSuccessed$1", f = "DraftStickerDownloadListener.kt", l = {38}, m = "invokeSuspend")
public final class C19566911gx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C19567111gz LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19566911gx(C19567111gz c19567111gz, InterfaceC1364105Vn<? super C19566911gx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c19567111gz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19566911gx(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("DraftStickerDownloadListener@1958.onSuccessed$1");
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
            Effect effect = this.LLILLJJLI.LL.LIZIZ;
            this.LL = 1;
            Object objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C2190608i8(effect, null));
            if (objLJI != C099R.LJFF()) {
                objLJI = Unit.LIZ;
            }
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("DraftStickerDownloadListener@1958.onSuccessed$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LL.LIZ(3);
        C19567111gz c19567111gz = this.LLILLJJLI;
        AbstractC19568411hC<Effect, Unit> abstractC19568411hC = c19567111gz.LL;
        abstractC19568411hC.getClass();
        c19567111gz.LLILLJJLI.LIZ(abstractC19568411hC);
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLJJLI.LLILLL;
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("duration", String.valueOf(jCurrentTimeMillis));
        C1637890six.LJ("aweme_tool_draft_amazing_infosticker_update_download_error", 0, c543670LTx.LJ());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftStickerDownloadListener@1958.onSuccessed$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
