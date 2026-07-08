package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0642, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.video.VideoPostKt$postDownload$videoPath$downloadResult$1", f = "VideoPost.kt", l = {52}, m = "invokeSuspend")
public final class AnonymousClass0642 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C2249008rY>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0642(String str, String str2, InterfaceC1364105Vn<? super AnonymousClass0642> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0642(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C2249008rY> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoPostKt@9c9f.postDownload$videoPath$downloadResult$1");
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
            String str = this.LLILLJJLI;
            String path = C786410Ut5.w2(C2213981Bky.LIZIZ.getApplicationContext()).getPath();
            String strLIZ = C1004300cF2.LIZ(this.LLILLL);
            this.LL = 1;
            obj = C2248908rX.LIZ(str, path, strLIZ, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("VideoPostKt@9c9f.postDownload$videoPath$downloadResult$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("VideoPostKt@9c9f.postDownload$videoPath$downloadResult$1");
        return obj;
    }
}
