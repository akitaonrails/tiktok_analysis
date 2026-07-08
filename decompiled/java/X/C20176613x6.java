package X;

import android.graphics.Bitmap;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13x6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.cover.manager.strategy.MvCoverStrategy$extract$2", f = "MvCoverStrategy.kt", l = {LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT, 37}, m = "invokeSuspend")
public final class C20176613x6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ C20176713x7 LLILLL;
    public final /* synthetic */ C1457070o1J LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20176613x6(C20176713x7 c20176713x7, C1457070o1J c1457070o1J, InterfaceC1364105Vn<? super C20176613x6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c20176713x7;
        this.LLILZ = c1457070o1J;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20176613x6(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        long jCurrentTimeMillis;
        Bitmap bitmap;
        C1C7U.LIZ("MvCoverStrategy@3a4d.extract$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        jCurrentTimeMillis = this.LL;
                        C155000ia.LIZIZ(obj);
                        bitmap = (Bitmap) obj;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    jCurrentTimeMillis = this.LL;
                    C155000ia.LIZIZ(obj);
                    bitmap = (Bitmap) obj;
                }
            } else {
                C155000ia.LIZIZ(obj);
                this.LLILLL.getClass();
                C20178313xN.LJI("MvCover", this.LLILZ);
                InterfaceC1452170ntP interfaceC1452170ntP = this.LLILZ.LIZIZ;
                if (interfaceC1452170ntP != null) {
                    jCurrentTimeMillis = System.currentTimeMillis();
                    try {
                        C1457070o1J c1457070o1J = this.LLILZ;
                        if (c1457070o1J.LJIILIIL) {
                            C20176713x7 c20176713x7 = this.LLILLL;
                            this.LL = jCurrentTimeMillis;
                            this.LLILLJJLI = 1;
                            c20176713x7.getClass();
                            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C20176913x9(interfaceC1452170ntP, c1457070o1J, c20176713x7, null));
                            if (obj == objLJFF) {
                                C1C7U.LIZIZ("MvCoverStrategy@3a4d.extract$2");
                                return objLJFF;
                            }
                            bitmap = (Bitmap) obj;
                        } else {
                            C20176713x7 c20176713x72 = this.LLILLL;
                            this.LL = jCurrentTimeMillis;
                            this.LLILLJJLI = 2;
                            c20176713x72.getClass();
                            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C20176813x8(interfaceC1452170ntP, c1457070o1J, c20176713x72, null));
                            if (obj == objLJFF) {
                                C1C7U.LIZIZ("MvCoverStrategy@3a4d.extract$2");
                                return objLJFF;
                            }
                            bitmap = (Bitmap) obj;
                        }
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        this.LLILLL.getClass();
                        C20178313xN.LIZLLL("MvCover", System.currentTimeMillis() - jCurrentTimeMillis, false, C2097608Jq.LJ());
                        throw new C20176113x1("MV cover extraction failed", e);
                    }
                } else {
                    throw new C20176113x1("VEEditor required for MV strategy", null);
                }
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            this.LLILLL.getClass();
            C20178313xN.LIZLLL("MvCover", jCurrentTimeMillis2, true, C2097608Jq.LJ());
            C1C7U.LIZIZ("MvCoverStrategy@3a4d.extract$2");
            return bitmap;
        } catch (Exception e2) {
            e = e2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
