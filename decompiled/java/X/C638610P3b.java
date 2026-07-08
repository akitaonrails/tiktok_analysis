package X;

import com.ss.android.ugc.aweme.vibefeed.feed.VibeDetailSharedVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS375S0200000_9;
import njp.a;

/* JADX INFO: renamed from: X.0P3b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.vibefeed.feed.VibeDetailSharedVM$networkRefresh$1", f = "VibeDetailSharedVM.kt", l = {211}, m = "invokeSuspend")
public final class C638610P3b extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ VibeDetailSharedVM LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C638610P3b(VibeDetailSharedVM vibeDetailSharedVM, String str, InterfaceC1364105Vn<? super C638610P3b> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = vibeDetailSharedVM;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C638610P3b(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        C323380Cm0 c323380Cm0;
        List<InterfaceC1891350zJl> list;
        boolean z;
        AbstractC1623806Xk c1623606Xi;
        C316650Cb9 c316650Cb9;
        C316640Cb8 c316640Cb8;
        List<InterfaceC1891350zJl> list2;
        C1C7U.LIZ("VibeDetailSharedVM@72c.networkRefresh$1");
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
            VibeDetailSharedVM vibeDetailSharedVM = this.LLILLJJLI;
            String str = this.LLILLL;
            if (str == null) {
                str = "";
            }
            this.LL = 1;
            obj = vibeDetailSharedVM.BQ2(str, vibeDetailSharedVM.DQ2(), C0P35.REFRESH, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("VibeDetailSharedVM@72c.networkRefresh$1");
                return objLJFF;
            }
        }
        AbstractC316870CbV abstractC316870CbV = (AbstractC316870CbV) obj;
        Exception exc = null;
        if ((abstractC316870CbV instanceof C316640Cb8) && (c316640Cb8 = (C316640Cb8) abstractC316870CbV) != null && (list2 = c316640Cb8.LIZIZ) != null) {
            arrayList = new ArrayList();
            for (InterfaceC1891350zJl interfaceC1891350zJl : list2) {
                if ((interfaceC1891350zJl instanceof C607780Nse) && interfaceC1891350zJl != null) {
                    arrayList.add(interfaceC1891350zJl);
                }
            }
        } else if ((abstractC316870CbV instanceof C323380Cm0) && (c323380Cm0 = (C323380Cm0) abstractC316870CbV) != null && (list = c323380Cm0.LIZLLL) != null) {
            arrayList = new ArrayList();
            for (InterfaceC1891350zJl interfaceC1891350zJl2 : list) {
                if ((interfaceC1891350zJl2 instanceof C607780Nse) && interfaceC1891350zJl2 != null) {
                    arrayList.add(interfaceC1891350zJl2);
                }
            }
        } else {
            arrayList = null;
        }
        if ((abstractC316870CbV instanceof C316650Cb9) && (c316650Cb9 = (C316650Cb9) abstractC316870CbV) != null) {
            exc = c316650Cb9.LIZIZ;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            VibeDetailSharedVM vibeDetailSharedVM2 = this.LLILLJJLI;
            if (true ^ vibeDetailSharedVM2.zQ2((InterfaceC636340Oxc) vibeDetailSharedVM2.getState()).isEmpty()) {
                C1623606Xi c1623606Xi2 = new C1623606Xi(new C626160OhC(false, false, 3));
                C491101vh c491101vh = C491101vh.LIZ;
                VibeDetailSharedVM vibeDetailSharedVM3 = this.LLILLJJLI;
                this.LLILLJJLI.newState(new C627660Ojc(c1623606Xi2, c491101vh, c491101vh, vibeDetailSharedVM3.zQ2((InterfaceC636340Oxc) vibeDetailSharedVM3.getState())));
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("VibeDetailSharedVM@72c.networkRefresh$1");
                return unit;
            }
        }
        if (exc != null) {
            c1623606Xi = new C491001vg(exc);
        } else {
            c1623606Xi = new C1623606Xi(new C626160OhC(false, false, 3));
        }
        C491101vh c491101vh2 = C491101vh.LIZ;
        this.LLILLJJLI.newState(new C627660Ojc(c1623606Xi, c491101vh2, c491101vh2, arrayList));
        VibeDetailSharedVM vibeDetailSharedVM4 = this.LLILLJJLI;
        vibeDetailSharedVM4.withState(new AwS375S0200000_9(vibeDetailSharedVM4, (VibeDetailSharedVM) abstractC316870CbV, (AbstractC316870CbV<String>) 174));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("VibeDetailSharedVM@72c.networkRefresh$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
