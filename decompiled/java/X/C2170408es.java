package X;

import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.ss.android.vesdk.algorithm.VEFaceDetectCropResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS404S0200000_3;
import njp.a;

/* JADX INFO: renamed from: X.08es, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.network.SocialAvatarGenerator$cropImageWithSlowPath$2$cropResultAsync$1", f = "SocialAvatarGenerator.kt", l = {231}, m = "invokeSuspend")
public final class C2170408es extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super VEFaceDetectCropResult>, Object> {
    public C259800zU LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C013C LLILZ;
    public final /* synthetic */ C0HLZ LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2170408es(C013C c013c, C0HLZ c0hlz, InterfaceC1364105Vn<? super C2170408es> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c013c;
        this.LLILZIL = c0hlz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2170408es(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C259800zU c259800zU;
        Thread threadLIZ;
        C1C7U.LIZ("SocialAvatarGenerator@55bc.cropImageWithSlowPath$2$cropResultAsync$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                threadLIZ = (Thread) this.LLILLJJLI;
                c259800zU = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c259800zU = new C259800zU();
            threadLIZ = C2102208Lk.LIZ(null, new AwS404S0200000_3(c259800zU, (C259800zU<VEFaceDetectCropResult>) this.LLILZIL, (C0HLZ) 73), 31);
        }
        while (ThreadMethodProxy.isAlive(threadLIZ) && !this.LLILZ.element) {
            this.LL = c259800zU;
            this.LLILLJJLI = threadLIZ;
            this.LLILLL = 1;
            if (AnonymousClass0958.LIZIZ(100L, this) == objLJFF) {
                C1C7U.LIZIZ("SocialAvatarGenerator@55bc.cropImageWithSlowPath$2$cropResultAsync$1");
                return objLJFF;
            }
        }
        threadLIZ.interrupt();
        T t = c259800zU.element;
        C1C7U.LIZIZ("SocialAvatarGenerator@55bc.cropImageWithSlowPath$2$cropResultAsync$1");
        return t;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super VEFaceDetectCropResult> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
