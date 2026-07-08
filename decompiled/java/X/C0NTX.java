package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.gamora.editor.sticker.pov.api.PovResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NTX, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.pov.PovRepository$fetchPovInfoFromServer$1", f = "PovRepository.kt", l = {27, LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C0NTX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Function1<PovResponse, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0NTX(String str, int i, int i2, String str2, String str3, Function1<? super PovResponse, Unit> function1, InterfaceC1364105Vn<? super C0NTX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NTX(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PovRepository@5c94.fetchPovInfoFromServer$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PovRepository@5c94.fetchPovInfoFromServer$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C594430NTd c594430NTd = C0NTZ.LIZ;
            String str = this.LLILLJJLI;
            int i2 = this.LLILLL;
            int i3 = this.LLILZ;
            String str2 = this.LLILZIL;
            String str3 = this.LLILZLL;
            this.LL = 1;
            obj = c594430NTd.LIZ(i2, i3, str, str2, str3, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PovRepository@5c94.fetchPovInfoFromServer$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C0NTW c0ntw = new C0NTW(this.LLIZ, (PovResponse) obj, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c0ntw) == objLJFF) {
            C1C7U.LIZIZ("PovRepository@5c94.fetchPovInfoFromServer$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PovRepository@5c94.fetchPovInfoFromServer$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
