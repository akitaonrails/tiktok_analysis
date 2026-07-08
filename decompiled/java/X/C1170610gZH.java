package X;

import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gZH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel$fetchShowPoiListBannerData$1", f = "VideoCollectionContentViewModel.kt", l = {340}, m = "invokeSuspend")
public final class C1170610gZH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public VideoCollectionContentViewModel LL;
    public CollectionDetail LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ CollectionDetail LLILZ;
    public final /* synthetic */ VideoCollectionContentViewModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1170610gZH(CollectionDetail collectionDetail, VideoCollectionContentViewModel videoCollectionContentViewModel, InterfaceC1364105Vn<? super C1170610gZH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = collectionDetail;
        this.LLILZIL = videoCollectionContentViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1170610gZH(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096 A[Catch: Exception -> 0x00d7, TryCatch #0 {Exception -> 0x00d7, blocks: (B:22:0x0058, B:23:0x005b, B:24:0x005d, B:26:0x0071, B:28:0x0077, B:30:0x007d, B:33:0x0087, B:35:0x008b, B:40:0x0096, B:43:0x00aa, B:46:0x00b0, B:49:0x00b6, B:51:0x00ba, B:52:0x00bc, B:53:0x00c7, B:54:0x00cd, B:9:0x0025, B:11:0x0029, B:15:0x0033, B:17:0x0046, B:13:0x002d), top: B:59:0x0011 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1170610gZH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
