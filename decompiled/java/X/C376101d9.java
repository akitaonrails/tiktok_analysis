package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.ShareService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01d9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.improve.action.DownloadAction$copyFileToAlbum$1", f = "DownloadAction.kt", l = {358}, m = "invokeSuspend")
public final class C376101d9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C1376170lup LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C376101d9(String str, Aweme aweme, String str2, C1376170lup c1376170lup, InterfaceC1364105Vn<? super C376101d9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = aweme;
        this.LLILZ = str2;
        this.LLILZIL = c1376170lup;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C376101d9(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("DownloadAction@71a5.copyFileToAlbum$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String str = "";
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            String str2 = this.LLILLJJLI;
            if (str2 == null) {
                str2 = "";
            }
            this.LL = 1;
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C375701d5(str2, false, false, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DownloadAction@71a5.copyFileToAlbum$1");
                return objLJFF;
            }
        }
        if (obj instanceof C375901d7) {
            ShareService shareService = C621180OYa.LIZ;
            Aweme aweme = this.LLILLL;
            String[] strArr = new String[1];
            String str3 = this.LLILLJJLI;
            if (str3 != null) {
                str = str3;
            }
            strArr[0] = str;
            shareService.LJJJJZI(aweme, C093Y.LJ(strArr), this.LLILZ, this.LLILZIL.LL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DownloadAction@71a5.copyFileToAlbum$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
