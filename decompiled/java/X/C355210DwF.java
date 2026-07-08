package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.logic.BeatInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DwF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.logic.MusicBeatGenerator$getMusicBeatsFromAVMusicInfo$2", f = "MusicBeatGenerator.kt", l = {}, m = "invokeSuspend")
public final class C355210DwF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends BeatInfo>>, Object> {
    public final /* synthetic */ EnumC355940DxQ LL;
    public final /* synthetic */ AVMusic LLILLJJLI;
    public final /* synthetic */ EnumC355940DxQ LLILLL;
    public final /* synthetic */ C355240DwI LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C355210DwF(EnumC355940DxQ enumC355940DxQ, AVMusic aVMusic, EnumC355940DxQ enumC355940DxQ2, C355240DwI c355240DwI, InterfaceC1364105Vn<? super C355210DwF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = enumC355940DxQ;
        this.LLILLJJLI = aVMusic;
        this.LLILLL = enumC355940DxQ2;
        this.LLILZ = c355240DwI;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C355210DwF(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicBeatGenerator@9595.getMusicBeatsFromAVMusicInfo$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String strInvoke = this.LL.getPath().invoke(this.LLILLJJLI);
        String str = "";
        if (strInvoke == null) {
            strInvoke = "";
        }
        String strInvoke2 = this.LLILLL.getPath().invoke(this.LLILLJJLI);
        if (strInvoke2 != null) {
            str = strInvoke2;
        }
        Function1<String, List<BeatInfo>> function1LIZJ = this.LLILZ.LIZJ(this.LLILLJJLI, strInvoke);
        Function1<String, List<BeatInfo>> function1LIZJ2 = this.LLILZ.LIZJ(this.LLILLJJLI, str);
        C2112908Pn c2112908Pn = C2112908Pn.LIZ;
        if (C2112908Pn.LIZ(strInvoke)) {
            List<BeatInfo> listInvoke = function1LIZJ.invoke(strInvoke);
            C1C7U.LIZIZ("MusicBeatGenerator@9595.getMusicBeatsFromAVMusicInfo$2");
            return listInvoke;
        }
        if (C2112908Pn.LIZ(str)) {
            List<BeatInfo> listInvoke2 = function1LIZJ2.invoke(str);
            C1C7U.LIZIZ("MusicBeatGenerator@9595.getMusicBeatsFromAVMusicInfo$2");
            return listInvoke2;
        }
        C13BV c13bv = C13BV.INSTANCE;
        C1C7U.LIZIZ("MusicBeatGenerator@9595.getMusicBeatsFromAVMusicInfo$2");
        return c13bv;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends BeatInfo>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
