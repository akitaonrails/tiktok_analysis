package X;

import android.content.Context;
import android.util.Log;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QoG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.lynx.ui.SearchMusicMiddleLynxContainer$Companion$preload$2", f = "SearchMusicMiddleLynxContainer.kt", l = {191}, m = "invokeSuspend")
public final class C681500QoG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C681500QoG(Context context, InterfaceC1364105Vn<? super C681500QoG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C681500QoG(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SearchMusicMiddleLynxContainer$Companion@8434.preload$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            List<MusicSearchHistory> listLJFF = C681730Qod.LJIILIIL().LJFF();
            C1DFB c1dfb = C0PEM.LIZJ;
            C681530QoJ c681530QoJ = new C681530QoJ(listLJFF, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c681530QoJ);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SearchMusicMiddleLynxContainer$Companion@8434.preload$2");
                return objLJFF;
            }
        }
        C681550QoL c681550QoL = (C681550QoL) obj;
        if (C681550QoL.LIZLLL != null) {
            c681550QoL.LIZIZ.LIZ();
        } else {
            CharSequence charSequenceLJIIIIZZ = C1308910kAL.LJIIIIZZ(this.LLILLJJLI);
            boolean zLIZLLL = C426750GoL.LIZLLL(this.LLILLJJLI);
            C681550QoL.LIZLLL = c681550QoL;
            C681550QoL.LJ = charSequenceLJIIIIZZ;
            C681550QoL.LJFF = Boolean.valueOf(zLIZLLL);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preload success ");
            sbLIZ.append(c681550QoL);
            sbLIZ.append(", set theme ");
            sbLIZ.append((Object) C681550QoL.LJ);
            sbLIZ.append(", rtl ");
            sbLIZ.append(C681550QoL.LJFF);
            C2286608xc.LJ(Log.d("wzx-music-lynx", C2188811AlT.LIZIZ(sbLIZ)));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchMusicMiddleLynxContainer$Companion@8434.preload$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
