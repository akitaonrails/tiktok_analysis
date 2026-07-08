package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.150h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.bytedance.android.livesdk.game.broadcast.bgbroadcast.clientai.debug.module.SimpleGameSexualInferModule$startInference$1", f = "SimpleGameSexualInferModule.kt", l = {106}, m = "invokeSuspend")
public final class C204501150h extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AnonymousClass1513 LLILLJJLI;
    public final /* synthetic */ ByteBuffer LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ ByteBuffer LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ long LLJ;
    public final /* synthetic */ InterfaceC204502150i LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C204501150h(AnonymousClass1513 anonymousClass1513, ByteBuffer byteBuffer, String str, boolean z, ByteBuffer byteBuffer2, int i, int i2, long j, InterfaceC204502150i interfaceC204502150i, InterfaceC1364105Vn<? super C204501150h> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = anonymousClass1513;
        this.LLILLL = byteBuffer;
        this.LLILZ = str;
        this.LLILZIL = z;
        this.LLILZLL = byteBuffer2;
        this.LLIZ = i;
        this.LLIZLLLIL = i2;
        this.LLJ = j;
        this.LLJI = interfaceC204502150i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C204501150h(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC204502150i interfaceC204502150i;
        Object objLJIIJ = obj;
        C1C7U.LIZ("SimpleGameSexualInferModule@d6a9.startInference$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(objLJIIJ);
                } else {
                    C155000ia.LIZIZ(objLJIIJ);
                    AnonymousClass1513 anonymousClass1513 = this.LLILLJJLI;
                    ByteBuffer byteBuffer = this.LLILLL;
                    String str = this.LLILZ;
                    boolean z = this.LLILZIL;
                    this.LL = 1;
                    objLJIIJ = anonymousClass1513.LJIIJ(str, byteBuffer, this, z);
                    if (objLJIIJ == objLJFF) {
                        C1C7U.LIZIZ("SimpleGameSexualInferModule@d6a9.startInference$1");
                        return objLJFF;
                    }
                }
                this.LLILLJJLI.LJIIIZ(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLILLL, (C204518150y) objLJIIJ, this.LLJ);
                this.LLILLJJLI.LIZIZ.set(false);
                interfaceC204502150i = this.LLJI;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                Map<String, Object> map = C1338270kvh.LIZ;
                this.LLILLJJLI.LIZIZ.set(false);
                interfaceC204502150i = this.LLJI;
                if (interfaceC204502150i != null) {
                }
            }
            if (interfaceC204502150i != null) {
                interfaceC204502150i.LIZ();
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SimpleGameSexualInferModule@d6a9.startInference$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLJJLI.LIZIZ.set(false);
            InterfaceC204502150i interfaceC204502150i2 = this.LLJI;
            if (interfaceC204502150i2 != null) {
                interfaceC204502150i2.LIZ();
            }
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
