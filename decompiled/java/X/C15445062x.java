package X;

import com.ss.android.ugc.aweme.openplatform.IGroupChatOpenPlatformServiceFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.062x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.df.GroupChatOpenPlatformServiceWrapper$onDFDownloadedWithOpenPlatformTo$1$run$$inlined$onDFDownloaded$im_group_chat_api_release$1$1", f = "GroupChatOpenPlatformServiceWrapper.kt", l = {151, 153}, m = "invokeSuspend")
public final class C15445062x extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ DialogC1389620mGW LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Function1 LLILZIL;
    public final /* synthetic */ C1231470i9R LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15445062x(String str, InterfaceC1364105Vn interfaceC1364105Vn, DialogC1389620mGW dialogC1389620mGW, boolean z, Function1 function1, C1231470i9R c1231470i9R) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = dialogC1389620mGW;
        this.LLILZ = z;
        this.LLILZIL = function1;
        this.LLILZLL = c1231470i9R;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15445062x(this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLIZLLL = obj;
        C1C7U.LIZ("GroupChatOpenPlatformServiceWrapper@ce08.onDFDownloadedWithOpenPlatformTo$1$run$$inlined$onDFDownloaded$im_group_chat_api_release$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLIZLLL);
                    C1C7U.LIZIZ("GroupChatOpenPlatformServiceWrapper@ce08.onDFDownloadedWithOpenPlatformTo$1$run$$inlined$onDFDownloaded$im_group_chat_api_release$1$1");
                    return objLIZLLL;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLIZLLL);
        } else {
            C155000ia.LIZIZ(objLIZLLL);
            C1311205Be c1311205Be = C1311205Be.LIZ;
            String str = this.LLILLJJLI;
            this.LL = 1;
            c1311205Be.getClass();
            objLIZLLL = C1311205Be.LIZLLL(IGroupChatOpenPlatformServiceFactory.class, str, this);
            if (objLIZLLL == objLJFF) {
                C1C7U.LIZIZ("GroupChatOpenPlatformServiceWrapper@ce08.onDFDownloadedWithOpenPlatformTo$1$run$$inlined$onDFDownloaded$im_group_chat_api_release$1$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C15446062y c15446062y = new C15446062y(objLIZLLL, null, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
        this.LL = 2;
        objLIZLLL = C23250099c.LJI(this, abstractC2238408pq, c15446062y);
        if (objLIZLLL == objLJFF) {
            C1C7U.LIZIZ("GroupChatOpenPlatformServiceWrapper@ce08.onDFDownloadedWithOpenPlatformTo$1$run$$inlined$onDFDownloaded$im_group_chat_api_release$1$1");
            return objLJFF;
        }
        C1C7U.LIZIZ("GroupChatOpenPlatformServiceWrapper@ce08.onDFDownloadedWithOpenPlatformTo$1$run$$inlined$onDFDownloaded$im_group_chat_api_release$1$1");
        return objLIZLLL;
    }
}
