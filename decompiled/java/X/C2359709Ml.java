package X;

import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.09Ml, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.commonalbum.viewmodel.LocalServiceAlbumVM$GenerateMultiResponseTask$newCompressUploadImageTask$1$1", f = "LocalServiceAlbumVM.kt", l = {639}, m = "invokeSuspend")
public final class C2359709Ml extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ RunnableC2359909Mn LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ C2359809Mm LLILZIL;
    public final /* synthetic */ List<C2360009Mo> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2359709Ml(String str, RunnableC2359909Mn runnableC2359909Mn, long j, C2359809Mm c2359809Mm, List<C2360009Mo> list, InterfaceC1364105Vn<? super C2359709Ml> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = runnableC2359909Mn;
        this.LLILZ = j;
        this.LLILZIL = c2359809Mm;
        this.LLILZLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2359709Ml(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLIZ = obj;
        C1C7U.LIZ("LocalServiceAlbumVM$GenerateMultiResponseTask@d954.newCompressUploadImageTask$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            C2359109Mf c2359109Mf = C2359109Mf.LIZ;
            String str = this.LLILLJJLI;
            Activity activity = this.LLILLL.LL;
            this.LL = 1;
            c2359109Mf.getClass();
            try {
                boolean zLJFF = Intrinsics.LJFF(C2359109Mf.LIZIZ(str), "image/png");
                objLIZ = str;
                if (!zLJFF) {
                    objLIZ = C2359109Mf.LIZ(activity, str);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                objLIZ = null;
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("LocalServiceAlbumVM$GenerateMultiResponseTask@d954.newCompressUploadImageTask$1$1");
                return objLJFF;
            }
        }
        String str2 = (String) objLIZ;
        if (str2 != null) {
            C2359809Mm c2359809Mm = this.LLILZIL;
            List<C2360009Mo> list = this.LLILZLL;
            String str3 = this.LLILLJJLI;
            System.currentTimeMillis();
            if (C123100dR.LIZ(str2)) {
                C2360009Mo c2360009Mo = new C2360009Mo(str2, null, c2359809Mm.LIZ, c2359809Mm.LIZIZ, 6);
                list.add(c2360009Mo);
                C2359109Mf.LIZ.getClass();
                C2359109Mf.LIZIZ.put(str3, c2360009Mo);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LocalServiceAlbumVM$GenerateMultiResponseTask@d954.newCompressUploadImageTask$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
