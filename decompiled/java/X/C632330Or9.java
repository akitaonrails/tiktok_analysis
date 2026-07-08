package X;

import com.ss.android.ugc.aweme.music.assem.list.MusicListComposableAssem;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Or9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.assem.list.MusicListComposableAssem$HandleSubscriptionEvents$1$1", f = "MusicListComposableAssem.kt", l = {}, m = "invokeSuspend")
public final class C632330Or9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C632540OrU LL;
    public final /* synthetic */ MusicListComposableAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C632330Or9(C632540OrU c632540OrU, MusicListComposableAssem musicListComposableAssem, InterfaceC1364105Vn<? super C632330Or9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c632540OrU;
        this.LLILLJJLI = musicListComposableAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C632330Or9(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String musicId;
        C1C7U.LIZ("MusicListComposableAssem@c9b0.HandleSubscriptionEvents$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C632540OrU c632540OrU = this.LL;
        c632540OrU.getClass();
        List<InterfaceC1891350zJl> list = c632540OrU.getListState().LLILZ;
        if (list != null && !list.isEmpty()) {
            MusicModel musicModel = this.LLILLJJLI.Ep().LLILZIL;
            if (musicModel != null && (musicId = musicModel.getMusicId()) != null) {
                if (this.LLILLJJLI.Ep().LLILZLL != EnumC631410Opf.DEFAULT) {
                    Iterator<InterfaceC1891350zJl> it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            InterfaceC1891350zJl next = it2.next();
                            if ((next instanceof C632090Oql) && Intrinsics.LJFF(((C632090Oql) next).getMusicModel().getMusicId(), musicId)) {
                                break;
                            }
                        } else {
                            this.LLILLJJLI.Ep().yQ2(true);
                            break;
                        }
                    }
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MusicListComposableAssem@c9b0.HandleSubscriptionEvents$1$1");
                return unit;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MusicListComposableAssem@c9b0.HandleSubscriptionEvents$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
