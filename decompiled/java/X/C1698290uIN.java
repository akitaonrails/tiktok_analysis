package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import lth.o;

/* JADX INFO: renamed from: X.0uIN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698290uIN implements InterfaceC2385309Wh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            case 2:
                return then$2(this, c15o7);
            default:
                return null;
        }
    }

    public C1698290uIN(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object then$0(C1698290uIN c1698290uIN, C15O7 c15o7) {
        InterfaceC1622450sK3 interfaceC1622450sK3;
        C1C7U.LIZ("EffectConfigPresenter@ba9f.initObservable$2$2");
        if (((Boolean) c15o7.LJIIL()).booleanValue() && (interfaceC1622450sK3 = (InterfaceC1622450sK3) c1698290uIN.l0) != null) {
            interfaceC1622450sK3.onSuccess();
        }
        Object objLJIIL = c15o7.LJIIL();
        C1C7U.LIZIZ("EffectConfigPresenter@ba9f.initObservable$2$2");
        return objLJIIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object then$1(X.C1698290uIN r10, X.C15O7 r11) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1698290uIN.then$1(X.0uIN, X.15O7):java.lang.Object");
    }

    public static final Object then$2(C1698290uIN c1698290uIN, C15O7 c15o7) {
        C1C7U.LIZ("RecordPresetResourceLoader@16ec.handlePreparedResource$1");
        C1623940sMS c1623940sMS = (C1623940sMS) c1698290uIN.l0;
        AVMusic aVMusic = c1623940sMS.LJIILL.LIZIZ;
        if (aVMusic != null) {
            RecordPresetResource recordPresetResource = c1623940sMS.LJI;
            if (recordPresetResource == null) {
                recordPresetResource = null;
            }
            MusicModel musicModel = recordPresetResource.getMusicModel();
            if (musicModel != null) {
                aVMusic.setMusicBeginTime(musicModel.getMusicBeginTime());
                aVMusic.setMusicEndTime(musicModel.getMusicEndTime());
                aVMusic.setMusicStartFromCut(musicModel.getMusicBeginTime());
            }
            c1623940sMS.LIZIZ(aVMusic, o.LJI.LJI(aVMusic));
        }
        C1623940sMS c1623940sMS2 = (C1623940sMS) c1698290uIN.l0;
        Effect effect = c1623940sMS2.LJIILL.LIZ;
        if (effect != null) {
            c1623940sMS2.LIZ(effect);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecordPresetResourceLoader@16ec.handlePreparedResource$1");
        return unit;
    }
}
