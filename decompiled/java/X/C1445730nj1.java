package X;

import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0nj1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editpost.DownloadEditPostPhotoManager$downloadPhotoModeResourceNew$1$results$1", f = "DownloadEditPostPhotoManager.kt", l = {}, m = "invokeSuspend")
public final class C1445730nj1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends AnonymousClass0957<? extends SrcImageInfo>>>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ List<PhotoModeImageUrlModel> LLILLJJLI;
    public final /* synthetic */ C1445720nj0 LLILLL;
    public final /* synthetic */ InterfaceC1445690nix LLILZ;
    public final /* synthetic */ AtomicInteger LLILZIL;
    public final /* synthetic */ AtomicInteger LLILZLL;
    public final /* synthetic */ AtomicInteger LLIZ;
    public final /* synthetic */ AtomicReference<String> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1445730nj1(List<PhotoModeImageUrlModel> list, C1445720nj0 c1445720nj0, InterfaceC1445690nix interfaceC1445690nix, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, AtomicInteger atomicInteger3, AtomicReference<String> atomicReference, InterfaceC1364105Vn<? super C1445730nj1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = c1445720nj0;
        this.LLILZ = interfaceC1445690nix;
        this.LLILZIL = atomicInteger;
        this.LLILZLL = atomicInteger2;
        this.LLIZ = atomicInteger3;
        this.LLIZLLLIL = atomicReference;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1445730nj1 c1445730nj1 = new C1445730nj1(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c1445730nj1.LL = obj;
        return c1445730nj1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DownloadEditPostPhotoManager@d4bd.downloadPhotoModeResourceNew$1$results$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        List<PhotoModeImageUrlModel> list = this.LLILLJJLI;
        C1445720nj0 c1445720nj0 = this.LLILLL;
        InterfaceC1445690nix interfaceC1445690nix = this.LLILZ;
        AtomicInteger atomicInteger = this.LLILZIL;
        AtomicInteger atomicInteger2 = this.LLILZLL;
        AtomicInteger atomicInteger3 = this.LLIZ;
        AtomicReference<String> atomicReference = this.LLIZLLLIL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<PhotoModeImageUrlModel> it2 = list.iterator();
        while (it2.hasNext()) {
            AtomicInteger atomicInteger4 = atomicInteger3;
            AtomicInteger atomicInteger5 = atomicInteger2;
            arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1445740nj2(c1445720nj0, it2.next(), interfaceC1445690nix, atomicInteger, atomicInteger5, atomicInteger4, atomicReference, list, null), 3));
            atomicInteger3 = atomicInteger4;
            atomicInteger2 = atomicInteger5;
        }
        C1C7U.LIZIZ("DownloadEditPostPhotoManager@d4bd.downloadPhotoModeResourceNew$1$results$1");
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends AnonymousClass0957<? extends SrcImageInfo>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
