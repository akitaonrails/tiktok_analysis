package X;

import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS232S0000000_4;
import njp.a;
import webcast.data.MusicSong;

/* JADX INFO: renamed from: X.0Cmg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel$getLiveHighlightsMusics$2", f = "LiveHighlightViewModel.kt", l = {249}, m = "invokeSuspend")
public final class C323800Cmg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ LiveHighlightViewModel LLILLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZ;
    public final /* synthetic */ List<Long> LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C323800Cmg(LiveHighlightViewModel liveHighlightViewModel, Function1<? super Boolean, Unit> function1, List<Long> list, int i, InterfaceC1364105Vn<? super C323800Cmg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = liveHighlightViewModel;
        this.LLILZ = function1;
        this.LLILZIL = list;
        this.LLILZLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C323800Cmg(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map<? extends String, ? extends List<MusicSong>> linkedHashMap;
        C1C7U.LIZ("LiveHighlightViewModel@9d4.getLiveHighlightsMusics$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                linkedHashMap = (Map) this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            linkedHashMap = new LinkedHashMap<>();
            C1DFB c1dfb = C0PEM.LIZJ;
            C323810Cmh c323810Cmh = new C323810Cmh(linkedHashMap, this.LLILLL, this.LLILZIL, this.LLILZLL, null);
            this.LL = linkedHashMap;
            this.LLILLJJLI = 1;
            if (C23250099c.LJI(this, c1dfb, c323810Cmh) == objLJFF) {
                C1C7U.LIZIZ("LiveHighlightViewModel@9d4.getLiveHighlightsMusics$2");
                return objLJFF;
            }
        }
        if (!linkedHashMap.isEmpty()) {
            this.LLILLL.LLILZLL.putAll(linkedHashMap);
            Function1<Boolean, Unit> function1 = this.LLILZ;
            if (function1 != null) {
                function1.invoke(true);
            }
        } else {
            this.LLILLL.setState(AFwS232S0000000_4.get$arr$(240));
            Function1<Boolean, Unit> function12 = this.LLILZ;
            if (function12 != null) {
                function12.invoke(false);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveHighlightViewModel@9d4.getLiveHighlightsMusics$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
