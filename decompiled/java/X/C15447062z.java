package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.062z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.df.GroupChatOpenPlatformServiceWrapper$onDFDownloadedWithOpenPlatformTo$1$run$$inlined$onDFDownloaded$im_group_chat_api_release$1", f = "GroupChatOpenPlatformServiceWrapper.kt", l = {150}, m = "invokeSuspend")
public final class C15447062z extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ DialogC1389620mGW LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Function1 LLILZIL;
    public final /* synthetic */ C1231470i9R LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15447062z(String str, InterfaceC1364105Vn interfaceC1364105Vn, DialogC1389620mGW dialogC1389620mGW, boolean z, Function1 function1, C1231470i9R c1231470i9R) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = dialogC1389620mGW;
        this.LLILZ = z;
        this.LLILZIL = function1;
        this.LLILZLL = c1231470i9R;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15447062z(this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("GroupChatOpenPlatformServiceWrapper@ce08.onDFDownloadedWithOpenPlatformTo$1$run$$inlined$onDFDownloaded$im_group_chat_api_release$1");
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
            C1DFH c1dfh = C0PEM.LIZ;
            C15445062x c15445062x = new C15445062x(this.LLILLJJLI, null, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfh, c15445062x);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GroupChatOpenPlatformServiceWrapper@ce08.onDFDownloadedWithOpenPlatformTo$1$run$$inlined$onDFDownloaded$im_group_chat_api_release$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("GroupChatOpenPlatformServiceWrapper@ce08.onDFDownloadedWithOpenPlatformTo$1$run$$inlined$onDFDownloaded$im_group_chat_api_release$1");
        return obj;
    }
}
