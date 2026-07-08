package X;

import com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.ChooseSearchMusicFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Qnu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.ChooseSearchMusicFragment$onViewCreated$11", f = "ChooseSearchMusicFragment.kt", l = {387}, m = "invokeSuspend")
public final class C681280Qnu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ChooseSearchMusicFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C681280Qnu(ChooseSearchMusicFragment chooseSearchMusicFragment, InterfaceC1364105Vn<? super C681280Qnu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = chooseSearchMusicFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C681280Qnu(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C681280Qnu.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
