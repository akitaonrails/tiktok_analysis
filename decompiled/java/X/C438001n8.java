package X;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01n8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.userpanel.ui.mention.MentionAfterPublishListContentAssem$mentionButtonClickCallback$2$1", f = "MentionAfterPublishListContentAssem.kt", l = {}, m = "invokeSuspend")
public final class C438001n8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Fragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C438001n8(Fragment fragment, InterfaceC1364105Vn<? super C438001n8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = fragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C438001n8(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MentionAfterPublishListContentAssem@9f01.mentionButtonClickCallback$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C438600HHu.LIZ(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MentionAfterPublishListContentAssem@9f01.mentionButtonClickCallback$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
