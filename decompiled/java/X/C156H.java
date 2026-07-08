package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import njp.a;

/* JADX INFO: renamed from: X.156H, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.music.vertical.bottombar.strip.BaseMusicStripBannerController$onStripRestoreClicked$1", f = "BaseMusicStripBannerController.kt", l = {96}, m = "invokeSuspend")
public final class C156H extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C156W LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C156H(C156W c156w, String str, InterfaceC1364105Vn<? super C156H> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c156w;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C156H(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C156O c156o;
        C1C7U.LIZ("BaseMusicStripBannerController@a5db.onStripRestoreClicked$1");
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
            C156W c156w = this.LLILLJJLI;
            if (c156w.LIZ.LJJII.LIZIZ == 3) {
                c156w.LIZ().LIZLLL(AFwS276S0000000_31.get$arr$(316), true);
            }
            C156W c156w2 = this.LLILLJJLI;
            C155Z c155z = c156w2.LIZ.LJIIL;
            String str = this.LLILLL;
            AwS610S0100000_31 awS610S0100000_31 = new AwS610S0100000_31(c156w2, 454);
            this.LL = 1;
            obj = c155z.LJIL(str, awS610S0100000_31, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BaseMusicStripBannerController@a5db.onStripRestoreClicked$1");
                return objLJFF;
            }
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C156W c156w3 = this.LLILLJJLI;
        if (c156w3.LIZ.LJJII.LIZIZ >= 2) {
            c156w3.LIZIZ.LJFF();
            if (zBooleanValue) {
                c156o = C156O.SUCCESS;
                if (C12DP.LIZ()) {
                    this.LLILLJJLI.LIZ.LJIIL.LJJ(1.0f);
                }
            } else {
                c156o = C156O.FAIL;
            }
            this.LLILLJJLI.LIZ().LIZLLL(new AwS610S0100000_31(c156o, 453), true);
        }
        C156W c156w4 = this.LLILLJJLI;
        if (c156w4.LIZ.LJJII.LIZIZ == 1 && !zBooleanValue) {
            c156w4.LIZ().LIZLLL(AFwS276S0000000_31.get$arr$(317), true);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseMusicStripBannerController@a5db.onStripRestoreClicked$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
