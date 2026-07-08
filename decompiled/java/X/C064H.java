package X;

import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.064H, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.RecordStickerExtensionKt$createBackgroundVideoHandler$7$1$1", f = "RecordStickerExtension.kt", l = {}, m = "invokeSuspend")
public final class C064H extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ShortVideoContext LL;
    public final /* synthetic */ AIGCInfo LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C064H(ShortVideoContext shortVideoContext, AIGCInfo aIGCInfo, InterfaceC1364105Vn<? super C064H> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = shortVideoContext;
        this.LLILLJJLI = aIGCInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C064H(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordStickerExtensionKt@6df8.createBackgroundVideoHandler$7$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.cameraComponentModel.greenScreenSourceInfos.clear();
        this.LL.cameraComponentModel.greenScreenSourceInfos.add(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecordStickerExtensionKt@6df8.createBackgroundVideoHandler$7$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
