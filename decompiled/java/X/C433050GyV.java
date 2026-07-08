package X;

import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0GyV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.favorites.business.music.MusicCollectionPublicBanner$changeListener$1$onChange$1", f = "MusicCollectionPublicBanner.kt", l = {}, m = "invokeSuspend")
public final class C433050GyV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PrivacyUserSettingsV2 LL;
    public final /* synthetic */ C432050Gwt LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C433050GyV(PrivacyUserSettingsV2 privacyUserSettingsV2, C432050Gwt c432050Gwt, InterfaceC1364105Vn<? super C433050GyV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = privacyUserSettingsV2;
        this.LLILLJJLI = c432050Gwt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C433050GyV(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLIZ;
        C1C7U.LIZ("MusicCollectionPublicBanner@b8e4.changeListener$1$onChange$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        PrivacyUserSettingsV2 privacyUserSettingsV2 = this.LL;
        if (privacyUserSettingsV2 != null && (numLIZ = privacyUserSettingsV2.LIZ("favorite_music")) != null && numLIZ.intValue() == 2) {
            this.LLILLJJLI.LIZIZ();
        } else {
            this.LLILLJJLI.LIZ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicCollectionPublicBanner@b8e4.changeListener$1$onChange$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
