package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sZd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.ui.BaseMusicWithEffectDownloader$subscribeDownloadSubject$4$1$1", f = "MusicAndEffectDownloadExtension.kt", l = {}, m = "invokeSuspend")
public final class C1632110sZd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ AbstractC1661070tKL LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1632110sZd(String str, AbstractC1661070tKL abstractC1661070tKL, Map<String, String> map, InterfaceC1364105Vn<? super C1632110sZd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = abstractC1661070tKL;
        this.LLILLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1632110sZd(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseMusicWithEffectDownloader@f9ff.subscribeDownloadSubject$4$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1632070sZZ.LIZ(this.LL, this.LLILLJJLI.LJ, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseMusicWithEffectDownloader@f9ff.subscribeDownloadSubject$4$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
