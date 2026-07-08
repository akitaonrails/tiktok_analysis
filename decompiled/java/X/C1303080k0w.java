package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.DslLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.FullDsl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0k0w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.linkcore.dsl.LiveDslManagerV2$handleIOAllNew$1", f = "LiveDslManagerV2.kt", l = {86}, m = "invokeSuspend")
public final class C1303080k0w extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1303170k15 LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ InterfaceC1303110k0z LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1303080k0w(C1303170k15 c1303170k15, int i, int i2, String str, InterfaceC1303110k0z interfaceC1303110k0z, InterfaceC1364105Vn<? super C1303080k0w> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1303170k15;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = str;
        this.LLILZLL = interfaceC1303110k0z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1303080k0w(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        Object c098200Yq;
        boolean z;
        DslLayout dslLayoutLIZ;
        boolean z2;
        C1C7U.LIZ("LiveDslManagerV2@f6ff.handleIOAllNew$1");
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
            C1303170k15 c1303170k15 = this.LLILLJJLI;
            int i2 = this.LLILLL;
            int i3 = this.LLILZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLILZIL);
            sbLIZ.append("_handleIOAllNew");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1303170k15.getClass();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("handle IO new ");
            sbLIZ2.append(C786410Ut5.u3().getName());
            C20441214yg.LJIIIZ("LiveDslManagerV2", C2188811AlT.LIZIZ(sbLIZ2));
            try {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(strLIZIZ);
                sbLIZ3.append("_handleIO-333");
                c098200Yq = c1303170k15.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            try {
                FullDsl fullDsl = (FullDsl) C19748512Ol.LIZIZ.LJII((String) c098200Yq, FullDsl.class);
                if (fullDsl != null) {
                    c1303170k15.LIZLLL(fullDsl);
                }
                dslLayoutLIZ = c1303170k15.LIZIZ.get(C1303170k15.LJI(i2, i3));
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1AZW.LJFF(C1303170k15.LJII(336), "GsonHelper.get().fromJson FAILED", th2.getMessage(), null);
                if (c1303170k15.LIZ == EnumC1154700g9c.LOCAL) {
                    z = true;
                } else {
                    z = false;
                }
                C1303200k18.LIZJ(z, 10002, th2.toString());
                C1CC2.LIZ("LinkMic DSL deserialized exception occurs.", th2);
                dslLayoutLIZ = null;
            }
            if (dslLayoutLIZ == null) {
                C1303170k15 c1303170k152 = this.LLILLJJLI;
                if (c1303170k152.LIZ == EnumC1154700g9c.GECKO) {
                    int i4 = this.LLILLL;
                    int i5 = this.LLILZ;
                    String strLJIIIZ = c1303170k152.LJIIIZ();
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("forceReadFromLocal new dslString=");
                    sbLIZ4.append(strLJIIIZ);
                    C20441214yg.LIZIZ("LiveDslManagerV2", C2188811AlT.LIZIZ(sbLIZ4));
                    try {
                        FullDsl fullDsl2 = (FullDsl) C19748512Ol.LIZIZ.LJII(strLJIIIZ, FullDsl.class);
                        if (fullDsl2 != null) {
                            c1303170k152.LIZLLL(fullDsl2);
                        }
                        dslLayoutLIZ = c1303170k152.LIZIZ.get(C1303170k15.LJI(i4, i5));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1AZW.LJFF(C1303170k15.LJII(197), "GsonHelper.get().fromJson FAILED", e.getMessage(), null);
                        if (c1303170k152.LIZ == EnumC1154700g9c.LOCAL) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C1303200k18.LIZJ(z2, 10002, e.toString());
                        C1CC2.LIZ("LinkMic DSL deserialized exception occurs.", e);
                        dslLayoutLIZ = null;
                    }
                }
            }
            if (dslLayoutLIZ == null) {
                this.LLILLJJLI.getClass();
                dslLayoutLIZ = C2490609pQ.LIZ();
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1303090k0x c1303090k0x = new C1303090k0x(this.LLILZLL, dslLayoutLIZ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c1303090k0x) == objLJFF) {
                C1C7U.LIZIZ("LiveDslManagerV2@f6ff.handleIOAllNew$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveDslManagerV2@f6ff.handleIOAllNew$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
