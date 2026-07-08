package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.StickPointMusicAlg;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DwJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.logic.MusicBeatGenerator$getMusicAVModel$2", f = "MusicBeatGenerator.kt", l = {}, m = "invokeSuspend")
public final class C355250DwJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AVMusic>, Object> {
    public final /* synthetic */ C355240DwI LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C355250DwJ(C355240DwI c355240DwI, InterfaceC1364105Vn<? super C355250DwJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c355240DwI;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C355250DwJ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String str;
        String str2;
        StickPointMusicAlg stickPointMusicAlg;
        String noStrengthBeatsPath;
        C1C7U.LIZ("MusicBeatGenerator@9595.getMusicAVModel$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(this.LL.LIZJ.creativeModel.musicBuzModel);
        C0E5P c0e5p = C0E5P.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicBeatGenerate getMusicBeatsFromMusicInfo is null: ");
        if (aVMusicExtractAVMusic == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C356530DyN.LIZ(c0e5p, C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("MusicBeatGenerate getMusicBeatsFromMusicInfo name: ");
        String downBeatsPath = null;
        if (aVMusicExtractAVMusic != null) {
            str = aVMusicExtractAVMusic.musicName;
        } else {
            str = null;
        }
        sbLIZ2.append(str);
        C356530DyN.LIZ(c0e5p, C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("MusicBeatGenerate getMusicBeatsFromMusicInfo extra: ");
        if (aVMusicExtractAVMusic != null) {
            str2 = aVMusicExtractAVMusic.extra;
        } else {
            str2 = null;
        }
        sbLIZ3.append(str2);
        C356530DyN.LIZ(c0e5p, C2188811AlT.LIZIZ(sbLIZ3));
        C1444820nhY.LJII(aVMusicExtractAVMusic);
        if (aVMusicExtractAVMusic != null) {
            stickPointMusicAlg = aVMusicExtractAVMusic.getStickPointMusicAlg();
        } else {
            stickPointMusicAlg = null;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("MusicBeatGenerate getMusicBeatsFromMusicInfo beats_tracker path ");
        if (stickPointMusicAlg != null) {
            noStrengthBeatsPath = stickPointMusicAlg.getNoStrengthBeatsPath();
        } else {
            noStrengthBeatsPath = null;
        }
        sbLIZ4.append(noStrengthBeatsPath);
        C356530DyN.LIZ(c0e5p, C2188811AlT.LIZIZ(sbLIZ4));
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("MusicBeatGenerate getMusicBeatsFromMusicInfo merged_beats path ");
        if (stickPointMusicAlg != null) {
            downBeatsPath = stickPointMusicAlg.getDownBeatsPath();
        }
        sbLIZ5.append(downBeatsPath);
        C356530DyN.LIZ(c0e5p, C2188811AlT.LIZIZ(sbLIZ5));
        C1C7U.LIZIZ("MusicBeatGenerator@9595.getMusicAVModel$2");
        return aVMusicExtractAVMusic;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AVMusic> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
