package X;

import com.ss.android.ugc.aweme.favorites.business.music.raven.MusicCollectionBannerInfo;
import com.ss.android.ugc.aweme.favorites.business.music.raven.banner.MusicCollectionBannerAssem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Gz3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.favorites.business.music.raven.banner.MusicCollectionBannerAssem$changeListener$1$onChange$1", f = "MusicCollectionBannerAssem.kt", l = {}, m = "invokeSuspend")
public final class C433390Gz3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PrivacyUserSettingsV2 LL;
    public final /* synthetic */ MusicCollectionBannerAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C433390Gz3(PrivacyUserSettingsV2 privacyUserSettingsV2, MusicCollectionBannerAssem musicCollectionBannerAssem, InterfaceC1364105Vn<? super C433390Gz3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = privacyUserSettingsV2;
        this.LLILLJJLI = musicCollectionBannerAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C433390Gz3(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLIZ;
        C1C7U.LIZ("MusicCollectionBannerAssem@a184.changeListener$1$onChange$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        PrivacyUserSettingsV2 privacyUserSettingsV2 = this.LL;
        if (privacyUserSettingsV2 != null && (numLIZ = privacyUserSettingsV2.LIZ("favorite_music")) != null && numLIZ.intValue() == 2) {
            MusicCollectionBannerInfo musicCollectionBannerInfo = this.LLILLJJLI.LLJJIII;
            if (musicCollectionBannerInfo != null) {
                musicCollectionBannerInfo.setVisible(false);
            }
        } else {
            MusicCollectionBannerAssem musicCollectionBannerAssem = this.LLILLJJLI;
            MusicCollectionBannerInfo musicCollectionBannerInfo2 = musicCollectionBannerAssem.LLJJIII;
            if (musicCollectionBannerInfo2 != null) {
                musicCollectionBannerInfo2.setVisible(musicCollectionBannerAssem.LLJJIJI);
            }
        }
        MusicCollectionBannerAssem musicCollectionBannerAssem2 = this.LLILLJJLI;
        MusicCollectionBannerInfo musicCollectionBannerInfo3 = musicCollectionBannerAssem2.LLJJIII;
        if (musicCollectionBannerInfo3 != null) {
            musicCollectionBannerAssem2.Ab1(musicCollectionBannerInfo3);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicCollectionBannerAssem@a184.changeListener$1$onChange$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
