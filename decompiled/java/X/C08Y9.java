package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08Y9, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectUtil$initVM$5$1$2$1$1$uri$1$1", f = "TakoMultipleSelectUtil.kt", l = {}, m = "invokeSuspend")
public final class C08Y9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Uri>, Object> {
    public final /* synthetic */ Activity LL;
    public final /* synthetic */ Bitmap LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08Y9(Activity activity, Bitmap bitmap, InterfaceC1364105Vn<? super C08Y9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = activity;
        this.LLILLJJLI = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08Y9(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object c098200Yq;
        C1C7U.LIZ("TakoMultipleSelectUtil@65f7.initVM$5$1$2$1$1$uri$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C08YA c08ya = new Object() { // from class: X.08YA
        };
        Activity activity = this.LL;
        Bitmap bitmap = this.LLILLJJLI;
        c08ya.getClass();
        Object obj2 = null;
        obj2 = null;
        obj2 = null;
        obj2 = null;
        Throwable th = null;
        if (!bitmap.isRecycled()) {
            C0VSJ c0vsj = new C0VSJ(C786410Ut5.w2(activity), "tako_share");
            if (c0vsj.exists() || c0vsj.mkdirs()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tako_share_long_");
                sbLIZ.append(System.currentTimeMillis());
                sbLIZ.append(".png");
                C0VSJ c0vsj2 = new C0VSJ(c0vsj, C2188811AlT.LIZIZ(sbLIZ));
                C0VSV c0vsv = new C0VSV(c0vsj2);
                try {
                    if (!bitmap.compress(Bitmap.CompressFormat.PNG, 100, c0vsv)) {
                        c0vsj2.delete();
                        C2107108Nh.LIZ(c0vsv, null);
                    } else {
                        C2107108Nh.LIZ(c0vsv, null);
                        try {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(activity.getPackageName());
                            sbLIZ2.append(".fileprovider");
                            c098200Yq = FileProvider.androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(activity, C2188811AlT.LIZIZ(sbLIZ2), c0vsj2);
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            c098200Yq = new C098200Yq(th2);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                            c0vsj2.delete();
                        }
                        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                            obj2 = c098200Yq;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        TryCatchGuardChecker.doCheck(th3);
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            th = th3;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    C2107108Nh.LIZ(c0vsv, th);
                                    throw th;
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
            }
        }
        C1C7U.LIZIZ("TakoMultipleSelectUtil@65f7.initVM$5$1$2$1$1$uri$1$1");
        return obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Uri> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
