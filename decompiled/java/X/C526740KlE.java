package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.service.TemplateMusicServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KlE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.service.TemplateMusicServiceImpl$downloadMusicByMusicId$newDeferred$1", f = "TemplateMusicServiceImpl.kt", l = {84}, m = "invokeSuspend")
public final class C526740KlE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C531370Ksh>, Object> {
    public int LL;
    public final /* synthetic */ TemplateMusicServiceImpl LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C526740KlE(TemplateMusicServiceImpl templateMusicServiceImpl, String str, Context context, InterfaceC1364105Vn<? super C526740KlE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = templateMusicServiceImpl;
        this.LLILLL = str;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C526740KlE(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateMusicServiceImpl@1ac4.downloadMusicByMusicId$newDeferred$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                TemplateMusicServiceImpl templateMusicServiceImpl = this.LLILLJJLI;
                String str = this.LLILLL;
                Context context = this.LLILZ;
                this.LL = 1;
                obj = templateMusicServiceImpl.LJFF(context, str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("TemplateMusicServiceImpl@1ac4.downloadMusicByMusicId$newDeferred$1");
                    return objLJFF;
                }
            }
            C531370Ksh c531370Ksh = (C531370Ksh) obj;
            this.LLILLJJLI.LIZJ.remove(this.LLILLL);
            C1C7U.LIZIZ("TemplateMusicServiceImpl@1ac4.downloadMusicByMusicId$newDeferred$1");
            return c531370Ksh;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLJJLI.LIZJ.remove(this.LLILLL);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C531370Ksh> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
