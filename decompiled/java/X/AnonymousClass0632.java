package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0632, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.df.GroupChatOpenPlatformServiceWrapper$loadFanGroupListAssem$lambda$6$lambda$5$$inlined$onDFDownloaded$im_group_chat_api_release$1$1$1", f = "GroupChatOpenPlatformServiceWrapper.kt", l = {}, m = "invokeSuspend")
public final class AnonymousClass0632 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Object LL;
    public final /* synthetic */ C259800zU LLILLJJLI;
    public final /* synthetic */ C1231470i9R LLILLL;
    public final /* synthetic */ Fragment LLILZ;
    public final /* synthetic */ FrameLayout LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ C1230910i8X LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0632(Object obj, InterfaceC1364105Vn interfaceC1364105Vn, C259800zU c259800zU, C1231470i9R c1231470i9R, Fragment fragment, FrameLayout frameLayout, String str, int i, C1230910i8X c1230910i8X) {
        super(2, interfaceC1364105Vn);
        this.LL = obj;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = c1231470i9R;
        this.LLILZ = fragment;
        this.LLILZIL = frameLayout;
        this.LLILZLL = str;
        this.LLIZ = i;
        this.LLIZLLLIL = c1230910i8X;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0632(this.LL, interfaceC1364105Vn, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ViewGroup viewGroup;
        C1C7U.LIZ("GroupChatOpenPlatformServiceWrapper@ce08.loadFanGroupListAssem$lambda$6$lambda$5$$inlined$onDFDownloaded$im_group_chat_api_release$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object parent = null;
        if (this.LL != null) {
            View view = (View) this.LLILLJJLI.element;
            if (view != null) {
                parent = view.getParent();
            }
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ((View) this.LLILLJJLI.element, viewGroup);
            }
            this.LLILLL.LJII(this.LLILZIL.getId(), this.LLIZ, this.LLILZ, this.LLIZLLLIL, this.LLILZLL);
            parent = Unit.LIZ;
        }
        C1C7U.LIZIZ("GroupChatOpenPlatformServiceWrapper@ce08.loadFanGroupListAssem$lambda$6$lambda$5$$inlined$onDFDownloaded$im_group_chat_api_release$1$1$1");
        return parent;
    }
}
