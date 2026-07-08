package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01NF, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.utils.downloader.SGTAssetDownloader$sgtTemplateDownloadWithMusic$2$2", f = "SGTAssetDownloader.kt", l = {74}, m = "invokeSuspend")
public final class C01NF extends C09AX implements Function2<InterfaceC346701Wf<? super Pair<? extends Integer, ? extends AVMusic>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C01NF(InterfaceC1364105Vn<? super C01NF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C01NF c01nf = new C01NF(interfaceC1364105Vn);
        c01nf.LLILLJJLI = obj;
        return c01nf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SGTAssetDownloader@5d0a.sgtTemplateDownloadWithMusic$2$2");
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
            InterfaceC346701Wf interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            Pair pair = new Pair(C2286608xc.LJ(0), null);
            this.LL = 1;
            if (interfaceC346701Wf.emit(pair, this) == objLJFF) {
                C1C7U.LIZIZ("SGTAssetDownloader@5d0a.sgtTemplateDownloadWithMusic$2$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SGTAssetDownloader@5d0a.sgtTemplateDownloadWithMusic$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super Pair<? extends Integer, ? extends AVMusic>> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
