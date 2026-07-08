package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0oEI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.audio.music.logic.EditorProAIMusicPanelHelper$listener$1$panelHide$1", f = "EditorProAIMusicPanelHelper.kt", l = {}, m = "invokeSuspend")
public final class C1465120oEI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AVMusic LL;
    public final /* synthetic */ C1465110oEH LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1465120oEI(AVMusic aVMusic, C1465110oEH c1465110oEH, InterfaceC1364105Vn<? super C1465120oEI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aVMusic;
        this.LLILLJJLI = c1465110oEH;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1465120oEI(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String musicOriginWithCheck;
        Boolean bool;
        C1C7U.LIZ("EditorProAIMusicPanelHelper@a844.listener$1$panelHide$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AVMusic aVMusic = this.LL;
        boolean zBooleanValue = false;
        if (aVMusic != null && C1152660g6K.LIZ.containsKey(aVMusic.getMusicId())) {
            AVMusic aVMusic2 = this.LL;
            AVMusic aVMusic3 = this.LLILLJJLI.LJIILJJIL;
            if (aVMusic3 != null && (bool = C1152660g6K.LIZ.get(aVMusic3.getMusicId())) != null) {
                zBooleanValue = bool.booleanValue();
            }
            aVMusic2.setCollected(zBooleanValue);
        }
        InterfaceC1453610nvj interfaceC1453610nvj = this.LLILLJJLI.LJJIII;
        if (interfaceC1453610nvj != null) {
            MusicModel musicModelLIZ = C389120FNm.LIZ(this.LL);
            this.LLILLJJLI.getClass();
            VideoPublishEditModel videoPublishEditModelLJIIJ = C1465110oEH.LJIIJ();
            if (videoPublishEditModelLJIIJ == null || (musicOriginWithCheck = videoPublishEditModelLJIIJ.getMusicOriginWithCheck()) == null) {
                musicOriginWithCheck = "";
            }
            interfaceC1453610nvj.ZN(musicModelLIZ, musicOriginWithCheck);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditorProAIMusicPanelHelper@a844.listener$1$panelHide$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
