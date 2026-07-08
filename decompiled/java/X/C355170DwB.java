package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.logic.BeatInfo;
import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import njp.a;

/* JADX INFO: renamed from: X.0DwB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.logic.MusicBeatGenerator$saveBeatsToLocal$2", f = "MusicBeatGenerator.kt", l = {}, m = "invokeSuspend")
public final class C355170DwB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<BeatInfo> LL;
    public final /* synthetic */ C355240DwI LLILLJJLI;
    public final /* synthetic */ AVMusic LLILLL;
    public final /* synthetic */ EnumC355940DxQ LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C355170DwB(List<BeatInfo> list, C355240DwI c355240DwI, AVMusic aVMusic, EnumC355940DxQ enumC355940DxQ, InterfaceC1364105Vn<? super C355170DwB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = c355240DwI;
        this.LLILLL = aVMusic;
        this.LLILZ = enumC355940DxQ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C355170DwB(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("MusicBeatGenerator@9595.saveBeatsToLocal$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.isEmpty()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MusicBeatGenerator@9595.saveBeatsToLocal$2");
            return unit;
        }
        String json = GsonProtectorUtils.toJson((Gson) this.LLILLJJLI.LIZLLL.getValue(), this.LL);
        this.LLILLJJLI.LIZJ.getCreativeInfo();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILLL.getMusicId());
        sbLIZ.append('/');
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(".json");
        C0VSJ c0vsjLJIIJJI = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJJI(C1445850njD.LIZ, EnumC20228014Cw.MUSIC_BEATS, C2188811AlT.LIZIZ(sbLIZ), true);
        try {
            C09BH.LJIIIZ(c0vsjLJIIJJI, json, Charsets.UTF_8);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            C0E5P c0e5p = C0E5P.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("saveBeatsToLocal:writeText error ");
            sbLIZ2.append(e.getMessage());
            C356530DyN.LIZJ(c0e5p, C2188811AlT.LIZIZ(sbLIZ2));
        }
        C356530DyN.LIZ(C0E5P.LIZIZ, "saveBeatsToLocal:cache Path " + c0vsjLJIIJJI.getPath());
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MusicBeatGenerator@9595.saveBeatsToLocal$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
