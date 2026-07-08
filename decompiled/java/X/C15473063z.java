package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.063z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.share.entrance.TakoShareKt$prepareImageForDm$2", f = "TakoShare.kt", l = {497, 506}, m = "invokeSuspend")
public final class C15473063z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15473063z(Context context, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = context;
        this.LLILZIL = str2;
        this.LLILZLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C15473063z c15473063z = new C15473063z(this.LLILZ, this.LLILLL, this.LLILZIL, interfaceC1364105Vn, this.LLILZLL);
        c15473063z.LLILLJJLI = obj;
        return c15473063z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        boolean z;
        Object obj2;
        C1C7U.LIZ("TakoShareKt@9b2.prepareImageForDm$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z2 = true;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    str = this.LLILLJJLI;
                    try {
                        C155000ia.LIZIZ(obj);
                        str = str;
                        C189200o6.m2constructorimpl(Boolean.valueOf(((Boolean) obj).booleanValue()));
                        obj2 = str;
                    } catch (Throwable th) {
                        th = th;
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                        obj2 = str;
                    }
                    C1C7U.LIZIZ("TakoShareKt@9b2.prepareImageForDm$2");
                    return obj2;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            Object obj3 = this.LLILLJJLI;
            String str2 = this.LLILLL;
            String path = C786410Ut5.w2(this.LLILZ).getPath();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tako_dm_img_");
            sbLIZ.append(this.LLILZIL);
            sbLIZ.append(".jpg");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            this.LLILLJJLI = obj3;
            this.LL = 1;
            obj = C2248908rX.LIZ(str2, path, strLIZIZ, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoShareKt@9b2.prepareImageForDm$2");
                return objLJFF;
            }
        }
        C2249008rY c2249008rY = (C2249008rY) obj;
        if (c2249008rY.LIZ != 1) {
            C1C7U.LIZIZ("TakoShareKt@9b2.prepareImageForDm$2");
            return null;
        }
        str = c2249008rY.LIZIZ;
        if (str != 0 && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            C0VSJ c0vsj = new C0VSJ(str);
            if (!c0vsj.exists() || c0vsj.length() <= 0) {
                z2 = false;
            }
            if (z2) {
                obj2 = str;
                if (this.LLILZLL) {
                    try {
                        C15453063f c15453063f = C15453063f.LIZ;
                        this.LLILLJJLI = str;
                        this.LL = 2;
                        c15453063f.getClass();
                        obj = C15453063f.LIZIZ(str, this);
                        str = str;
                        if (obj == objLJFF) {
                            C1C7U.LIZIZ("TakoShareKt@9b2.prepareImageForDm$2");
                            return objLJFF;
                        }
                        C189200o6.m2constructorimpl(Boolean.valueOf(((Boolean) obj).booleanValue()));
                        obj2 = str;
                    } catch (Throwable th2) {
                        th = th2;
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                        obj2 = str;
                    }
                }
                C1C7U.LIZIZ("TakoShareKt@9b2.prepareImageForDm$2");
                return obj2;
            }
        }
        C1C7U.LIZIZ("TakoShareKt@9b2.prepareImageForDm$2");
        return null;
    }
}
