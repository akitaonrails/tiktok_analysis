package X;

import com.ss.android.ugc.aweme.creative.model.CelebrationData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MPV, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.component.OnThisDayTemplateComponent$downloadMusic$1", f = "OnThisDayTemplateComponent.kt", l = {}, m = "invokeSuspend")
public final class C0MPV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0MPY LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MPV(C0MPY c0mpy, InterfaceC1364105Vn<? super C0MPV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0mpy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MPV(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OnThisDayTemplateComponent@dac0.downloadMusic$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        final C0MPY c0mpy = this.LL;
        String str = c0mpy.LLJ;
        if (str != null) {
            C1403010mc7.LIZ.getMusicService().requestMusic(str, new InterfaceC1416890myV() { // from class: X.0MPU
                @Override // X.InterfaceC1416890myV
                public final void LIZIZ(Exception exc) {
                    C201955140j.LJII(C554890LpX.LIZIZ, "CeleTemplateApply, onLoadMusicFail");
                }

                @Override // X.InterfaceC1416890myV
                public final void LIZLLL(AVMusic aVMusic) {
                    MusicObject musicObjectExtractMusicObject;
                    C0MPY c0mpy2 = c0mpy;
                    String name = null;
                    if (aVMusic != null) {
                        musicObjectExtractMusicObject = MusicBeanUtilKt.extractMusicObject(aVMusic);
                    } else {
                        musicObjectExtractMusicObject = null;
                    }
                    c0mpy2.LLJI = musicObjectExtractMusicObject;
                    C554890LpX c554890LpX = C554890LpX.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("CeleTemplateApply, onLoadMusicSuccess, music = ");
                    if (aVMusic != null) {
                        name = aVMusic.getName();
                    }
                    sbLIZ.append(name);
                    C201955140j.LIZJ(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
                    CelebrationData celebrationData = c0mpy.H3().creativeModel.celebrationData;
                    if (celebrationData != null) {
                        celebrationData.setMusic(aVMusic);
                    }
                }
            });
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OnThisDayTemplateComponent@dac0.downloadMusic$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
