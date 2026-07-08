package X;

import android.content.Context;
import android.util.Size;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05go, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.data.MediaProvider$warmUpFirstScreenAssets$1", f = "MediaProvider.kt", l = {244}, m = "invokeSuspend")
public final class C1418005go extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C05XL<Unit> LLILLL;
    public final /* synthetic */ C540820LIy LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ Size LLIZLLLIL;
    public final /* synthetic */ int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1418005go(C05XL<Unit> c05xl, C540820LIy c540820LIy, Context context, boolean z, boolean z2, Size size, int i, InterfaceC1364105Vn<? super C1418005go> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c05xl;
        this.LLILZ = c540820LIy;
        this.LLILZIL = context;
        this.LLILZLL = z;
        this.LLIZ = z2;
        this.LLIZLLLIL = size;
        this.LLJ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1418005go c1418005go = new C1418005go(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c1418005go.LLILLJJLI = obj;
        return c1418005go;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("MediaProvider@7017.warmUpFirstScreenAssets$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(obj);
                } else {
                    C155000ia.LIZIZ(obj);
                    C540820LIy c540820LIy = this.LLILZ;
                    Context context = this.LLILZIL;
                    boolean z2 = this.LLILZLL;
                    boolean z3 = this.LLIZ;
                    Size size = this.LLIZLLLIL;
                    int i2 = this.LLJ;
                    C05XL<Unit> c05xl = this.LLILLL;
                    if (z3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.LL = 1;
                    if (c540820LIy.LJFF(context, z2, z, size, i2, c05xl, this) == objLJFF) {
                        C1C7U.LIZIZ("MediaProvider@7017.warmUpFirstScreenAssets$1");
                        return objLJFF;
                    }
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            if (!this.LLILLL.isCompleted()) {
                this.LLILLL.LJIIZILJ(Unit.LIZ);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MediaProvider@7017.warmUpFirstScreenAssets$1");
            return unit;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            if (!this.LLILLL.isCompleted()) {
                this.LLILLL.LJIIZILJ(Unit.LIZ);
            }
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
