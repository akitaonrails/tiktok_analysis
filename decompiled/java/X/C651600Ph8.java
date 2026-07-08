package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ph8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.hub.mob.SearchNativeHubMobHelper$mobEnterMusicDetail$1", f = "SearchNativeHubMobHelper.kt", l = {}, m = "invokeSuspend")
public final class C651600Ph8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ EnumC654440Pli LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C651600Ph8(String str, String str2, EnumC654440Pli enumC654440Pli, String str3, boolean z, InterfaceC1364105Vn<? super C651600Ph8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = enumC654440Pli;
        this.LLILZ = str3;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C651600Ph8(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchNativeHubMobHelper@4d2e.mobEnterMusicDetail$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ISearchContextAbility iSearchContextAbilityLJI = C0Q3E.LJI();
        C650460PfI<C651610Ph9> c650460PfI = new C650460PfI<C651610Ph9>() { // from class: X.0Ph9
        };
        String str = this.LL;
        String str2 = this.LLILLJJLI;
        EnumC654440Pli enumC654440Pli = this.LLILLL;
        String str3 = this.LLILZ;
        boolean z = this.LLILZIL;
        C0PRC c0prc = (C0PRC) iSearchContextAbilityLJI.Ph1().LIZJ();
        c650460PfI.LJJIIZI(c0prc.LLILLL);
        c650460PfI.LJIIZILJ("search_keyword", c0prc.LLIZLLLIL);
        c650460PfI.LJIJJ("general_search");
        c650460PfI.LJIJJLI("click_search_result");
        if (str != null) {
            c650460PfI.LJJIJIIJI(str);
            c650460PfI.LJIIZILJ("music_id", str);
        }
        c650460PfI.LJJIIZ(C2286608xc.LJ(0));
        c650460PfI.LJJIJIL(str2);
        c650460PfI.LJ("entity_type", enumC654440Pli.getMobType());
        String str4 = "1";
        c650460PfI.LJ("is_entity", "1");
        c650460PfI.LJ("process_id", str3);
        if (!z) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c650460PfI.LJ("is_music_chart", str4);
        c650460PfI.LJIILJJIL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchNativeHubMobHelper@4d2e.mobEnterMusicDetail$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
