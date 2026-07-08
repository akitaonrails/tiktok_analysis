package X;

import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0miY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.MusicPublishBridgeServiceImpl$onPublishSuccess$1", f = "MusicPublishBridgeServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C1407000miY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BaseShortVideoContext LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1407000miY(BaseShortVideoContext baseShortVideoContext, InterfaceC1364105Vn<? super C1407000miY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = baseShortVideoContext;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1407000miY(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicPublishBridgeServiceImpl@4024.onPublishSuccess$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (MusicBeanUtilKt.isFromUnlimitedTab(((VideoPublishEditModel) this.LL).creativeModel.musicBuzModel)) {
            C1411810mqJ.LIZ().storeBoolean("unlimited_music_used", true);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicPublishBridgeServiceImpl@4024.onPublishSuccess$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
