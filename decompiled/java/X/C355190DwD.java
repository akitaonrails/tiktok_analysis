package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.logic.BeatInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DwD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.logic.MusicBeatGenerator$getBeatsFromLocalCache$2", f = "MusicBeatGenerator.kt", l = {}, m = "invokeSuspend")
public final class C355190DwD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends BeatInfo>>, Object> {
    public final /* synthetic */ AVMusic LL;
    public final /* synthetic */ EnumC355940DxQ LLILLJJLI;
    public final /* synthetic */ C355240DwI LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C355190DwD(AVMusic aVMusic, EnumC355940DxQ enumC355940DxQ, C355240DwI c355240DwI, InterfaceC1364105Vn<? super C355190DwD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aVMusic;
        this.LLILLJJLI = enumC355940DxQ;
        this.LLILLL = c355240DwI;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C355190DwD(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicBeatGenerator@9595.getBeatsFromLocalCache$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL.getMusicId());
        sbLIZ.append('/');
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(".json");
        String strLIZIZ = C2298208zU.LIZIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), C1445850njD.LIZ, EnumC20228014Cw.MUSIC_BEATS, C2188811AlT.LIZIZ(sbLIZ), 8);
        C2112908Pn c2112908Pn = C2112908Pn.LIZ;
        if (!C2112908Pn.LIZ(strLIZIZ)) {
            C0E5P c0e5p = C0E5P.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getBeatsFromLocalCache fail: cache file");
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(" is not exist");
            C356530DyN.LIZ(c0e5p, C2188811AlT.LIZIZ(sbLIZ2));
            C13BV c13bv = C13BV.INSTANCE;
            C1C7U.LIZIZ("MusicBeatGenerator@9595.getBeatsFromLocalCache$2");
            return c13bv;
        }
        List list = C13BV.INSTANCE;
        try {
            list = (List) ((Gson) this.LLILLL.LIZLLL.getValue()).LJIIIIZZ(C2112908Pn.LIZIZ(strLIZIZ), new TypeToken<ArrayList<BeatInfo>>() { // from class: X.0DwE
            }.getType());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0E5P c0e5p2 = C0E5P.LIZIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("getBeatsFromLocalCache:error  ");
            sbLIZ3.append(e.getMessage());
            C356530DyN.LIZJ(c0e5p2, C2188811AlT.LIZIZ(sbLIZ3));
        }
        C0E5P c0e5p3 = C0E5P.LIZIZ;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("getBeatsFromLocalCache: cache Path: ");
        sbLIZ4.append(strLIZIZ);
        C356530DyN.LIZ(c0e5p3, C2188811AlT.LIZIZ(sbLIZ4));
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        C1C7U.LIZIZ("MusicBeatGenerator@9595.getBeatsFromLocalCache$2");
        return list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends BeatInfo>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
