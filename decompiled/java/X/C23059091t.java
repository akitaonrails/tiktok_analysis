package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import wuk.f;

/* JADX INFO: renamed from: X.091t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.internals.main.DefaultStickerRepository$observePanelFlow$1", f = "DefaultStickerRepository.kt", l = {646}, m = "invokeSuspend")
public final class C23059091t extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public f LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ f LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23059091t(f fVar, InterfaceC1364105Vn<? super C23059091t> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = fVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C23059091t c23059091t = new C23059091t(this.LLILZIL, interfaceC1364105Vn);
        c23059091t.LLILZ = obj;
        return c23059091t;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        f fVar;
        C1DEV c1dev;
        C1C7U.LIZ("DefaultStickerRepository@bad7.observePanelFlow$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                fVar = this.LLILLJJLI;
                c1dev = this.LL;
                interfaceC497601wk = (InterfaceC497601wk) this.LLILZ;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILZ;
            fVar = this.LLILZIL;
            c1dev = fVar.LJJIJIIJIL;
            this.LLILZ = interfaceC497601wk;
            this.LL = c1dev;
            this.LLILLJJLI = fVar;
            this.LLILLL = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("DefaultStickerRepository@bad7.observePanelFlow$1");
                return objLJFF;
            }
        }
        try {
            AnonymousClass0956 anonymousClass0956 = fVar.LJJIJ;
            if (anonymousClass0956 == null || !anonymousClass0956.isActive()) {
                z = false;
            }
            if (!z) {
                AnonymousClass0956 anonymousClass09562 = fVar.LJJIJ;
                if (anonymousClass09562 != null) {
                    anonymousClass09562.LIZIZ(null);
                }
                fVar.LJJIJ = C23250099c.LIZLLL(interfaceC497601wk, null, null, new C23060091u(fVar, null), 3);
            }
            c1dev.LIZIZ(null);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DefaultStickerRepository@bad7.observePanelFlow$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1dev.LIZIZ(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
