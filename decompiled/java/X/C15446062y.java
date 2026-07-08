package X;

import com.ss.android.ugc.aweme.openplatform.IGroupChatOpenPlatformServiceFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.062y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.df.GroupChatOpenPlatformServiceWrapper$onDFDownloadedWithOpenPlatformTo$1$run$$inlined$onDFDownloaded$im_group_chat_api_release$1$1$1", f = "GroupChatOpenPlatformServiceWrapper.kt", l = {}, m = "invokeSuspend")
public final class C15446062y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Object LL;
    public final /* synthetic */ DialogC1389620mGW LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Function1 LLILZ;
    public final /* synthetic */ C1231470i9R LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15446062y(Object obj, InterfaceC1364105Vn interfaceC1364105Vn, DialogC1389620mGW dialogC1389620mGW, boolean z, Function1 function1, C1231470i9R c1231470i9R) {
        super(2, interfaceC1364105Vn);
        this.LL = obj;
        this.LLILLJJLI = dialogC1389620mGW;
        this.LLILLL = z;
        this.LLILZ = function1;
        this.LLILZIL = c1231470i9R;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15446062y(this.LL, interfaceC1364105Vn, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupChatOpenPlatformServiceWrapper@ce08.onDFDownloadedWithOpenPlatformTo$1$run$$inlined$onDFDownloaded$im_group_chat_api_release$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object obj2 = this.LL;
        Unit unit = null;
        if (obj2 != null) {
            IGroupChatOpenPlatformServiceFactory iGroupChatOpenPlatformServiceFactory = (IGroupChatOpenPlatformServiceFactory) obj2;
            if (this.LLILLJJLI.isShowing()) {
                this.LLILLJJLI.setOnDismissListener(null);
                if (!this.LLILLL) {
                    C786410Ut5.LJIIJ(this.LLILLJJLI);
                }
                Function1 function1 = this.LLILZ;
                C1231470i9R c1231470i9R = this.LLILZIL;
                function1.invoke(iGroupChatOpenPlatformServiceFactory.LIZ(c1231470i9R.LIZ, c1231470i9R.LIZIZ, c1231470i9R.LIZJ));
            }
            unit = Unit.LIZ;
        }
        C1C7U.LIZIZ("GroupChatOpenPlatformServiceWrapper@ce08.onDFDownloadedWithOpenPlatformTo$1$run$$inlined$onDFDownloaded$im_group_chat_api_release$1$1$1");
        return unit;
    }
}
