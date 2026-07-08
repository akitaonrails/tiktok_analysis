package X;

import android.util.Log;
import com.ss.android.ugc.aweme.music.artist.viewmodel.ArtistMusicAwemeListNavBarViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS31S0010000_16;
import njp.a;

/* JADX INFO: renamed from: X.0gQY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.artist.viewmodel.ArtistMusicAwemeListNavBarViewModel$updatePinnedAweme$1", f = "ArtistMusicAwemeListNavBarViewModel.kt", l = {51, 52}, m = "invokeSuspend")
public final class C1165200gQY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ ArtistMusicAwemeListNavBarViewModel LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1165200gQY(ArtistMusicAwemeListNavBarViewModel artistMusicAwemeListNavBarViewModel, String str, InterfaceC1364105Vn<? super C1165200gQY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = artistMusicAwemeListNavBarViewModel;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1165200gQY(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        final String str;
        C1C7U.LIZ("ArtistMusicAwemeListNavBarViewModel@66fa.updatePinnedAweme$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ArtistMusicAwemeListNavBarViewModel@66fa.updatePinnedAweme$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1164770gPr c1164770gPr = (C1164770gPr) this.LLILLL.LLILLL.getValue();
            if (c1164770gPr != null && (str = c1164770gPr.LL) != null) {
                if (this.LLILZ.length() == 0) {
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("ArtistMusicAwemeListNavBarViewModel@66fa.updatePinnedAweme$1");
                    return unit2;
                }
                ArtistMusicAwemeListNavBarViewModel artistMusicAwemeListNavBarViewModel = this.LLILLL;
                artistMusicAwemeListNavBarViewModel.getClass();
                artistMusicAwemeListNavBarViewModel.setState(new AwS31S0010000_16(true, 6));
                InterfaceC1165220gQa interfaceC1165220gQa = (InterfaceC1165220gQa) this.LLILLL.LLILLJJLI.getValue().getOperator();
                String str2 = this.LLILZ;
                this.LL = str;
                this.LLILLJJLI = 1;
                obj = interfaceC1165220gQa.LLLIILIL(str, str2);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ArtistMusicAwemeListNavBarViewModel@66fa.updatePinnedAweme$1");
                    return objLJFF;
                }
            } else {
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("ArtistMusicAwemeListNavBarViewModel@66fa.updatePinnedAweme$1");
                return unit3;
            }
        }
        final ArtistMusicAwemeListNavBarViewModel artistMusicAwemeListNavBarViewModel2 = this.LLILLL;
        final String str3 = this.LLILZ;
        InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0gQZ
            @Override // X.InterfaceC346701Wf
            public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                String str4;
                String str5;
                if (obj2 instanceof C0O79) {
                    ArtistMusicAwemeListNavBarViewModel artistMusicAwemeListNavBarViewModel3 = artistMusicAwemeListNavBarViewModel2;
                    artistMusicAwemeListNavBarViewModel3.getClass();
                    artistMusicAwemeListNavBarViewModel3.setState(new AwS31S0010000_16(false, 6));
                    artistMusicAwemeListNavBarViewModel2.setState(AFwS252S0000000_16.get$arr$(459));
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    C1164770gPr c1164770gPr2 = (C1164770gPr) artistMusicAwemeListNavBarViewModel2.LLILLL.getValue();
                    if (c1164770gPr2 == null || (str4 = c1164770gPr2.LLILZ) == null) {
                        str4 = "single_song";
                    }
                    c2344009Gk.LJIIIIZZ("enter_method", str4);
                    C1164770gPr c1164770gPr3 = (C1164770gPr) artistMusicAwemeListNavBarViewModel2.LLILLL.getValue();
                    if (c1164770gPr3 == null || (str5 = c1164770gPr3.LLILLL) == null) {
                        str5 = "";
                    }
                    c2344009Gk.LJIIIIZZ("old_group_id", str5);
                    c2344009Gk.LJIIIIZZ("group_id", str3);
                    c2344009Gk.LJIIIIZZ("music_id", str);
                    c2344009Gk.LJIIIIZZ("type", "change");
                    C20684815ws.LJIILLIIL("success_featured_video", c2344009Gk.LIZ);
                    C1440005kM.LIZ(new C1165540gR6(str, true, true));
                } else if (obj2 instanceof C0O7B) {
                    ArtistMusicAwemeListNavBarViewModel artistMusicAwemeListNavBarViewModel4 = artistMusicAwemeListNavBarViewModel2;
                    artistMusicAwemeListNavBarViewModel4.getClass();
                    artistMusicAwemeListNavBarViewModel4.setState(new AwS31S0010000_16(false, 6));
                    artistMusicAwemeListNavBarViewModel2.setState(AFwS252S0000000_16.get$arr$(460));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("updatePinnedAweme failed, onUpdate: ");
                    sbLIZ.append(obj2);
                    C2286608xc.LJ(Log.i("updatePinnedAweme", C2188811AlT.LIZIZ(sbLIZ)));
                } else {
                    throw new C1954807lC();
                }
                return Unit.LIZ;
            }
        };
        this.LL = null;
        this.LLILLJJLI = 2;
        if (((InterfaceC346201Wa) obj).collect(interfaceC346701Wf, this) == objLJFF) {
            C1C7U.LIZIZ("ArtistMusicAwemeListNavBarViewModel@66fa.updatePinnedAweme$1");
            return objLJFF;
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("ArtistMusicAwemeListNavBarViewModel@66fa.updatePinnedAweme$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
