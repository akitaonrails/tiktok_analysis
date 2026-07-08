package X;

import Y.AgS167S0300000_9;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicGroup;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ops, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel$unPinMusic$1", f = "OriginMusicListViewModel.kt", l = {516, 516}, m = "invokeSuspend")
public final class C631540Ops extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Music LL;
    public MusicGroup LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ OriginMusicListViewModel LLILZ;
    public final /* synthetic */ C632090Oql LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C631540Ops(OriginMusicListViewModel originMusicListViewModel, C632090Oql c632090Oql, InterfaceC1364105Vn<? super C631540Ops> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = originMusicListViewModel;
        this.LLILZIL = c632090Oql;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C631540Ops(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Music musicYQ2;
        MusicGroup musicGroupLIZIZ;
        String sourceMusicId;
        String str;
        C1C7U.LIZ("OriginMusicListViewModel@f6d8.unPinMusic$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("OriginMusicListViewModel@f6d8.unPinMusic$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            musicGroupLIZIZ = this.LLILLJJLI;
            musicYQ2 = this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (!this.LLILZ.LLJIJIL && !this.LLILZ.LLJILJIL) {
                this.LLILZ.LLJILJIL = true;
                musicYQ2 = this.LLILZ.yQ2(this.LLILZIL.getMusicModel());
                musicGroupLIZIZ = C632050Oqh.LIZIZ(musicYQ2.getIdStr(), this.LLILZ.LLJJ);
                if (musicGroupLIZIZ != null && (sourceMusicId = musicGroupLIZIZ.getSourceMusicId()) != null) {
                    C632120Oqo c632120Oqo = C632120Oqo.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("unPinMusic id: ");
                    sbLIZ.append(sourceMusicId);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c632120Oqo.getClass();
                    C632120Oqo.LIZ(strLIZIZ);
                    InterfaceC631590Opx interfaceC631590Opx = (InterfaceC631590Opx) this.LLILZ.LL.getOperator();
                    C631640Oq2 c631640Oq2 = this.LLILZ.LLILLJJLI;
                    if (c631640Oq2 == null || (str = c631640Oq2.LIZIZ) == null) {
                        str = "";
                    }
                    this.LL = musicYQ2;
                    this.LLILLJJLI = musicGroupLIZIZ;
                    this.LLILLL = 1;
                    obj = interfaceC631590Opx.LLFZ(str, sourceMusicId, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("OriginMusicListViewModel@f6d8.unPinMusic$1");
                        return objLJFF;
                    }
                } else {
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("OriginMusicListViewModel@f6d8.unPinMusic$1");
                    return unit2;
                }
            } else {
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("OriginMusicListViewModel@f6d8.unPinMusic$1");
                return unit3;
            }
        }
        AgS167S0300000_9 agS167S0300000_9 = new AgS167S0300000_9(this.LLILZ, musicGroupLIZIZ, musicYQ2, 1);
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = 2;
        if (((InterfaceC346201Wa) obj).collect(agS167S0300000_9, this) == objLJFF) {
            C1C7U.LIZIZ("OriginMusicListViewModel@f6d8.unPinMusic$1");
            return objLJFF;
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("OriginMusicListViewModel@f6d8.unPinMusic$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
