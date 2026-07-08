package X;

import Y.ACallableS67S1200000_3;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09aX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.improve.action.DownloadAction$startDownload$globalListener$1$onSuccess$1", f = "DownloadAction.kt", l = {}, m = "invokeSuspend")
public final class C2398309aX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ Aweme LLILZ;
    public final /* synthetic */ C1376170lup LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2398309aX(boolean z, String str, Context context, Aweme aweme, C1376170lup c1376170lup, String str2, InterfaceC1364105Vn<? super C2398309aX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = context;
        this.LLILZ = aweme;
        this.LLILZIL = c1376170lup;
        this.LLILZLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2398309aX(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DownloadAction@71a5.startDownload$globalListener$1$onSuccess$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ShareDependService.LIZ.getClass();
        ShareDependServiceImpl.LJJJJI().LJI(false);
        if (!this.LL) {
            String str = this.LLILLJJLI;
            boolean zExists = new C0VSJ(this.LLILLJJLI).exists();
            C844470XAv.LIZ.getClass();
            C844470XAv.LIZ();
            try {
                if (C036E.LIZ.LIZIZ()) {
                    C2241008qG c2241008qG = new C2241008qG();
                    c2241008qG.LIZ.put("filePath", str);
                    c2241008qG.LIZ.put("share_platform", "download");
                    c2241008qG.LIZ.put("fileLength", String.valueOf(new C0VSJ(str).length()));
                    c2241008qG.LIZ.put("fileExist", String.valueOf(zExists));
                    C794240VDq.LIZJ("aweme_share_monitor", c2241008qG.LJ());
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (TextUtils.isEmpty(this.LLILLJJLI)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DownloadAction@71a5.startDownload$globalListener$1$onSuccess$1");
            return unit;
        }
        if (Build.VERSION.SDK_INT < 33 && C838410Wul.LIZ(this.LLILLL, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            C1AF0.LJ(new IllegalStateException("try to download video, but no permission"));
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("DownloadAction@71a5.startDownload$globalListener$1$onSuccess$1");
            return unit2;
        }
        if (C710930Rud.LJII(this.LLILZ)) {
            C1376170lup c1376170lup = this.LLILZIL;
            String str2 = this.LLILLJJLI;
            String str3 = this.LLILZLL;
            Aweme aweme = this.LLILZ;
            c1376170lup.getClass();
            C817503Hh c817503Hh = C817503Hh.LL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C376101d9(str2, aweme, str3, c1376170lup, null), 2);
        } else {
            String str4 = this.LLILLJJLI;
            Context context = this.LLILLL;
            C1375610ltv c1375610ltv = new C1375610ltv(this.LLILZIL, this.LLILZLL, str4, context);
            C013C c013c = new C013C();
            c013c.element = true;
            C15O7.LIZJ(new ACallableS67S1200000_3(context, str4, c013c, 0)).LJ(new C2501409rA(c013c, c1375610ltv, 0), C15O7.LJIIIIZZ, null);
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("DownloadAction@71a5.startDownload$globalListener$1$onSuccess$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
