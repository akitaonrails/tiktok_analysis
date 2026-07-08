package X;

import Y.AgS200S0200000_9;
import com.ss.android.ugc.aweme.music.model.MusicGroup;
import com.ss.android.ugc.aweme.music.model.PinnedMusicList;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS588S0100000_9;
import njp.a;

/* JADX INFO: renamed from: X.0Opu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel$pinMusic$1", f = "OriginMusicListViewModel.kt", l = {478, 478}, m = "invokeSuspend")
public final class C631560Opu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OriginMusicListViewModel LLILLJJLI;
    public final /* synthetic */ C632090Oql LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C631560Opu(OriginMusicListViewModel originMusicListViewModel, C632090Oql c632090Oql, int i, InterfaceC1364105Vn<? super C631560Opu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = originMusicListViewModel;
        this.LLILLL = c632090Oql;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C631560Opu(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        MusicGroup highlightedGroup;
        int i;
        String str;
        String str2;
        C1C7U.LIZ("OriginMusicListViewModel@f6d8.pinMusic$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("OriginMusicListViewModel@f6d8.pinMusic$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C632120Oqo c632120Oqo = C632120Oqo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pinMusic isRefreshing: ");
            sbLIZ.append(this.LLILLJJLI.LLJIJIL);
            sbLIZ.append(", isPining: ");
            sbLIZ.append(this.LLILLJJLI.LLJILJIL);
            sbLIZ.append(", avalibleCapicity: ");
            PinnedMusicList pinnedMusicList = this.LLILLJJLI.LLIZLLLIL;
            String str3 = null;
            if (pinnedMusicList != null) {
                numLJ = C2286608xc.LJ(pinnedMusicList.getAvalibleCapicity());
            } else {
                numLJ = null;
            }
            sbLIZ.append(numLJ);
            sbLIZ.append(", musicId: ");
            sbLIZ.append(this.LLILLL.getMusicModel().getMusicId());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c632120Oqo.getClass();
            C632120Oqo.LIZ(strLIZIZ);
            if (!this.LLILLJJLI.LLJIJIL && !this.LLILLJJLI.LLJILJIL) {
                PinnedMusicList pinnedMusicList2 = this.LLILLJJLI.LLIZLLLIL;
                if (pinnedMusicList2 != null && pinnedMusicList2.getAvalibleCapicity() > 0) {
                    PinnedMusicList pinnedMusicList3 = this.LLILLJJLI.LLIZLLLIL;
                    if (pinnedMusicList3 != null) {
                        highlightedGroup = pinnedMusicList3.getHighlightedGroup();
                    } else {
                        highlightedGroup = null;
                    }
                    if (highlightedGroup != null) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    C631640Oq2 c631640Oq2 = this.LLILLJJLI.LLILLJJLI;
                    if (c631640Oq2 != null && c631640Oq2.LIZJ) {
                        str = "personal_homepage";
                    } else {
                        str = "others_homepage";
                    }
                    c2344009Gk.LJIIIIZZ("enter_from", str);
                    c2344009Gk.LJIIIIZZ("music_id", this.LLILLL.getMusicModel().getMusicId());
                    c2344009Gk.LJIIIIZZ("enter_method", "personal_list");
                    C631640Oq2 c631640Oq22 = this.LLILLJJLI.LLILLJJLI;
                    if (c631640Oq22 != null) {
                        str3 = c631640Oq22.LIZ;
                    }
                    c2344009Gk.LJIIIIZZ("user_id", str3);
                    c2344009Gk.LIZJ(this.LLILZ, "pos");
                    c2344009Gk.LIZJ(0, "is_pin_to_top");
                    c2344009Gk.LIZJ(i, "highlight");
                    C20684815ws.LJIILLIIL("pin_to_top_music", c2344009Gk.LIZ);
                    this.LLILLJJLI.LLJILJIL = true;
                    InterfaceC631590Opx interfaceC631590Opx = (InterfaceC631590Opx) this.LLILLJJLI.LL.getOperator();
                    C631640Oq2 c631640Oq23 = this.LLILLJJLI.LLILLJJLI;
                    if (c631640Oq23 == null || (str2 = c631640Oq23.LIZIZ) == null) {
                        str2 = "";
                    }
                    String musicId = this.LLILLL.getMusicModel().getMusicId();
                    this.LL = 1;
                    obj = interfaceC631590Opx.pinMusic(str2, musicId, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("OriginMusicListViewModel@f6d8.pinMusic$1");
                        return objLJFF;
                    }
                } else {
                    OriginMusicListViewModel originMusicListViewModel = this.LLILLJJLI;
                    originMusicListViewModel.setState(new AwS588S0100000_9(originMusicListViewModel, 348));
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("OriginMusicListViewModel@f6d8.pinMusic$1");
                    return unit2;
                }
            } else {
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("OriginMusicListViewModel@f6d8.pinMusic$1");
                return unit3;
            }
        }
        AgS200S0200000_9 agS200S0200000_9 = new AgS200S0200000_9(this.LLILLJJLI, this.LLILLL, 6);
        this.LL = 2;
        if (((InterfaceC346201Wa) obj).collect(agS200S0200000_9, this) == objLJFF) {
            C1C7U.LIZIZ("OriginMusicListViewModel@f6d8.pinMusic$1");
            return objLJFF;
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("OriginMusicListViewModel@f6d8.pinMusic$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
