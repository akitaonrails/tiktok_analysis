package X;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS421S0200000_20;
import njp.a;

/* JADX INFO: renamed from: X.05c2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.voice.BulletinVoicePublishPipeline$runStart$encodeDeferred$1$1$1", f = "BulletinVoicePublishPipeline.kt", l = {233}, m = "invokeSuspend")
public final class C1388405c2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ File LLILLJJLI;
    public final /* synthetic */ File LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1388405c2(File file, File file2, InterfaceC1364105Vn<? super C1388405c2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = file;
        this.LLILLL = file2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1388405c2(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("BulletinVoicePublishPipeline@9c99.runStart$encodeDeferred$1$1$1");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            AwS421S0200000_20 awS421S0200000_20 = new AwS421S0200000_20(this.LLILLJJLI, this.LLILLL, 10);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, new C09AG(awS421S0200000_20, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BulletinVoicePublishPipeline@9c99.runStart$encodeDeferred$1$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("BulletinVoicePublishPipeline@9c99.runStart$encodeDeferred$1$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
