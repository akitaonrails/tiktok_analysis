package X;

import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0633, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.df.GroupChatOpenPlatformServiceWrapper$loadFanGroupListAssem$lambda$6$lambda$5$$inlined$onDFDownloaded$im_group_chat_api_release$1", f = "GroupChatOpenPlatformServiceWrapper.kt", l = {150}, m = "invokeSuspend")
public final class AnonymousClass0633 extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
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
    public AnonymousClass0633(String str, InterfaceC1364105Vn interfaceC1364105Vn, C259800zU c259800zU, C1231470i9R c1231470i9R, Fragment fragment, FrameLayout frameLayout, String str2, int i, C1230910i8X c1230910i8X) {
        super(1, interfaceC1364105Vn);
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
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0633(this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("GroupChatOpenPlatformServiceWrapper@ce08.loadFanGroupListAssem$lambda$6$lambda$5$$inlined$onDFDownloaded$im_group_chat_api_release$1");
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
            AnonymousClass0631 anonymousClass0631 = new AnonymousClass0631(this.LLILLJJLI, null, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfh, anonymousClass0631);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GroupChatOpenPlatformServiceWrapper@ce08.loadFanGroupListAssem$lambda$6$lambda$5$$inlined$onDFDownloaded$im_group_chat_api_release$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("GroupChatOpenPlatformServiceWrapper@ce08.loadFanGroupListAssem$lambda$6$lambda$5$$inlined$onDFDownloaded$im_group_chat_api_release$1");
        return obj;
    }
}
