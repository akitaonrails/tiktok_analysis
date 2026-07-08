package X;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08bS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.voice.BulletinVoicePublishPipeline$runUploadAndCallback$2", f = "BulletinVoicePublishPipeline.kt", l = {}, m = "invokeSuspend")
public final class C2149208bS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC2149308bT LL;
    public final /* synthetic */ C259800zU<C2150108bb> LLILLJJLI;
    public final /* synthetic */ File LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2149208bS(InterfaceC2149308bT interfaceC2149308bT, C259800zU<C2150108bb> c259800zU, File file, InterfaceC1364105Vn<? super C2149208bS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC2149308bT;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = file;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2149208bS(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinVoicePublishPipeline@9c99.runUploadAndCallback$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC2149308bT interfaceC2149308bT = this.LL;
        String str = this.LLILLJJLI.element.LIZ;
        this.LLILLL.getAbsolutePath();
        interfaceC2149308bT.LIZIZ(str);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinVoicePublishPipeline@9c99.runUploadAndCallback$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
