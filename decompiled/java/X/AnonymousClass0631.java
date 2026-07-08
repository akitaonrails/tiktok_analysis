package X;

import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.openplatform.IGroupChatOpenPlatformServiceFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0631, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.df.GroupChatOpenPlatformServiceWrapper$loadFanGroupListAssem$lambda$6$lambda$5$$inlined$onDFDownloaded$im_group_chat_api_release$1$1", f = "GroupChatOpenPlatformServiceWrapper.kt", l = {151, 153}, m = "invokeSuspend")
public final class AnonymousClass0631 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C259800zU LLILLL;
    public final /* synthetic */ C1231470i9R LLILZ;
    public final /* synthetic */ Fragment LLILZIL;
    public final /* synthetic */ FrameLayout LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ C1230910i8X LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0631(String str, InterfaceC1364105Vn interfaceC1364105Vn, C259800zU c259800zU, C1231470i9R c1231470i9R, Fragment fragment, FrameLayout frameLayout, String str2, int i, C1230910i8X c1230910i8X) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c259800zU;
        this.LLILZ = c1231470i9R;
        this.LLILZIL = fragment;
        this.LLILZLL = frameLayout;
        this.LLIZ = str2;
        this.LLIZLLLIL = i;
        this.LLJ = c1230910i8X;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0631(this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLIZLLL = obj;
        C1C7U.LIZ("GroupChatOpenPlatformServiceWrapper@ce08.loadFanGroupListAssem$lambda$6$lambda$5$$inlined$onDFDownloaded$im_group_chat_api_release$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLIZLLL);
                    C1C7U.LIZIZ("GroupChatOpenPlatformServiceWrapper@ce08.loadFanGroupListAssem$lambda$6$lambda$5$$inlined$onDFDownloaded$im_group_chat_api_release$1$1");
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
                C1C7U.LIZIZ("GroupChatOpenPlatformServiceWrapper@ce08.loadFanGroupListAssem$lambda$6$lambda$5$$inlined$onDFDownloaded$im_group_chat_api_release$1$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        AnonymousClass0632 anonymousClass0632 = new AnonymousClass0632(objLIZLLL, null, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ);
        this.LL = 2;
        objLIZLLL = C23250099c.LJI(this, abstractC2238408pq, anonymousClass0632);
        if (objLIZLLL == objLJFF) {
            C1C7U.LIZIZ("GroupChatOpenPlatformServiceWrapper@ce08.loadFanGroupListAssem$lambda$6$lambda$5$$inlined$onDFDownloaded$im_group_chat_api_release$1$1");
            return objLJFF;
        }
        C1C7U.LIZIZ("GroupChatOpenPlatformServiceWrapper@ce08.loadFanGroupListAssem$lambda$6$lambda$5$$inlined$onDFDownloaded$im_group_chat_api_release$1$1");
        return objLIZLLL;
    }
}
