package X;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01ma, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.userpanel.ui.mention.MentionAfterPublishListContentAssem$mentionButtonClickCallback$1$1", f = "MentionAfterPublishListContentAssem.kt", l = {}, m = "invokeSuspend")
public final class C434601ma extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Fragment LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C434601ma(Fragment fragment, String str, InterfaceC1364105Vn<? super C434601ma> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = fragment;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C434601ma(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MentionAfterPublishListContentAssem@9f01.mentionButtonClickCallback$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Fragment fragment = this.LL;
        if (fragment != null) {
            String str = this.LLILLJJLI;
            C1389890mGx c1389890mGx = new C1389890mGx(fragment);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MentionAfterPublishListContentAssem@9f01.mentionButtonClickCallback$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
