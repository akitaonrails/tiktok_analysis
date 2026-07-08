package X;

import android.content.Context;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nul, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.download.StickPointMusicAlgFileDownloadV1$startDownloadFile$1$jobs$1$1", f = "StickPointMusicAlgFileDownloadV1.kt", l = {59}, m = "invokeSuspend")
public final class C609090Nul extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C609100Num LLILLJJLI;
    public final /* synthetic */ AtomicBoolean LLILLL;
    public final /* synthetic */ C1421070n5F LLILZ;
    public final /* synthetic */ Context LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C609090Nul(C609100Num c609100Num, AtomicBoolean atomicBoolean, C1421070n5F c1421070n5F, Context context, InterfaceC1364105Vn<? super C609090Nul> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c609100Num;
        this.LLILLL = atomicBoolean;
        this.LLILZ = c1421070n5F;
        this.LLILZIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C609090Nul(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickPointMusicAlgFileDownloadV1@3c2c.startDownloadFile$1$jobs$1$1");
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
            if (C2354709Kn.LIZIZ(this.LLILLJJLI.LIZIZ)) {
                this.LLILLL.set(true);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("StickPointMusicAlgFileDownloadV1@3c2c.startDownloadFile$1$jobs$1$1");
                return unit;
            }
            final C1421070n5F c1421070n5F = this.LLILZ;
            Context context = this.LLILZIL;
            C609100Num c609100Num = this.LLILLJJLI;
            final String str = c609100Num.LIZ;
            String str2 = c609100Num.LIZIZ;
            final String str3 = c609100Num.LIZJ;
            this.LL = 1;
            c1421070n5F.getClass();
            if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
                final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
                C1420960n54 c1420960n54 = C1420960n54.LIZ;
                C1421000n58 c1421000n58 = new C1421000n58() { // from class: X.0n59
                    @Override // X.C1421000n58, com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onSuccessed(DownloadInfo downloadInfo) {
                        C1441170nbf c1441170nbf = C1441170nbf.LIZ;
                        String str4 = c1421070n5F.LIZJ;
                        String str5 = str3;
                        c1441170nbf.getClass();
                        C1441170nbf.LIZ(str4, str5, true);
                        C1441170nbf.LIZIZ(null, str, str3, true);
                        InterfaceC1364105Vn<Boolean> interfaceC1364105Vn = c23260099m;
                        Boolean bool = Boolean.TRUE;
                        C189200o6.m2constructorimpl(bool);
                        interfaceC1364105Vn.resumeWith(bool);
                    }

                    @Override // X.C1421000n58, com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                        C1441170nbf c1441170nbf = C1441170nbf.LIZ;
                        String str4 = c1421070n5F.LIZJ;
                        String str5 = str3;
                        c1441170nbf.getClass();
                        C1441170nbf.LIZ(str4, str5, false);
                        C1441170nbf.LIZIZ(baseException, str, str3, false);
                        InterfaceC1364105Vn<Boolean> interfaceC1364105Vn = c23260099m;
                        Boolean bool = Boolean.FALSE;
                        C189200o6.m2constructorimpl(bool);
                        interfaceC1364105Vn.resumeWith(bool);
                    }
                };
                c1420960n54.getClass();
                C1420960n54.LIZ(context, str, str2, c1421000n58);
                obj = c23260099m.LIZ();
                if (obj == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
            } else {
                obj = false;
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StickPointMusicAlgFileDownloadV1@3c2c.startDownloadFile$1$jobs$1$1");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            this.LLILLL.set(true);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StickPointMusicAlgFileDownloadV1@3c2c.startDownloadFile$1$jobs$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
