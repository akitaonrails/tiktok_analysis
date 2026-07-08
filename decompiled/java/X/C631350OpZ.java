package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDiscoveryInfo;
import com.ss.android.ugc.aweme.music.model.PreSaveButtonType;
import com.ss.android.ugc.aweme.music.model.PreSaveLogData;
import com.ss.android.ugc.aweme.music.model.TT2DspAlbumInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OpZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.addtodsp.feed.button.presave.PresaveClickEvent$invoke$2", f = "PresaveClickEvent.kt", l = {}, m = "invokeSuspend")
public final class C631350OpZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ VideoItemParams LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C631350OpZ(VideoItemParams videoItemParams, InterfaceC1364105Vn<? super C631350OpZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = videoItemParams;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C631350OpZ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Aweme aweme;
        MusicDiscoveryInfo musicDiscoveryInfo;
        TT2DspAlbumInfo tT2DspAlbumInfo;
        boolean z;
        Music music;
        String aid;
        String string;
        C1C7U.LIZ("PresaveClickEvent@34b2.invoke$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        VideoItemParams videoItemParams = this.LL;
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null && (musicDiscoveryInfo = aweme.getMusicDiscoveryInfo()) != null && (tT2DspAlbumInfo = musicDiscoveryInfo.tt2DspAlbumInfo) != null) {
            String metaAlbumId = tT2DspAlbumInfo.getMetaAlbumId();
            if (metaAlbumId == null) {
                metaAlbumId = "";
            }
            C633020OsG c633020OsG = C633020OsG.LIZIZ;
            if (c633020OsG.LJJIZ(tT2DspAlbumInfo) != DspPlatform.UNKNOWN) {
                z = true;
            } else {
                z = false;
            }
            DspPlatform dspPlatformLJJIZ = c633020OsG.LJJIZ(tT2DspAlbumInfo);
            String str = videoItemParams.mEventType;
            String str2 = videoItemParams.mEventType;
            Aweme aweme2 = videoItemParams.getAweme();
            int size = c633020OsG.LJJLIIIJJI(videoItemParams.getAweme().getMusic(), tT2DspAlbumInfo, null, null).size();
            String eventValue = PreSaveButtonType.BIG.getEventValue();
            Boolean boolValueOf = Boolean.valueOf(z);
            Boolean boolValueOf2 = Boolean.valueOf(z);
            Integer numValueOf = Integer.valueOf(size);
            if (aweme2 != null) {
                music = aweme2.getMusic();
            } else {
                music = null;
            }
            if (aweme2 != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            if (aweme2 != null) {
                string = Integer.valueOf(aweme2.getAwemeType()).toString();
            } else {
                string = null;
            }
            c633020OsG.LJJLIIIJLLLLLLLZ(new PreSaveLogData(dspPlatformLJJIZ, str2, str, aweme2, music, aid, string, null, metaAlbumId, boolValueOf, boolValueOf2, numValueOf, null, eventValue));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PresaveClickEvent@34b2.invoke$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
