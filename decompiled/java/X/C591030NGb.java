package X;

import android.util.LruCache;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NGb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ghouse.GoldenHouse$clean$1", f = "GoldenHouse.kt", l = {154}, m = "invokeSuspend")
public final class C591030NGb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0NH6 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C591030NGb(C0NH6 c0nh6, InterfaceC1364105Vn<? super C591030NGb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0nh6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C591030NGb(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numValueOf;
        C1C7U.LIZ("GoldenHouse@3441.clean$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(50000L, this) == objLJFF) {
                C1C7U.LIZIZ("GoldenHouse@3441.clean$1");
                return objLJFF;
            }
        }
        C0NGO c0ngo = this.LLILLJJLI.LIZJ;
        c0ngo.LJIIIIZZ();
        C0NGX.LIZ.getClass();
        ((Keva) C0NGX.LIZIZ.getValue()).clear();
        C591420NHo c591420NHo = c0ngo.LJIIL;
        c591420NHo.getClass();
        try {
            C189200o6.m2constructorimpl(Boolean.valueOf(C08QA.LJIIZILJ(c591420NHo.LIZ)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C0NGO.LJ();
        C591050NGd.LIZ.getClass();
        try {
            LruCache<String, SimVideoUrlModel> lruCache = C1483340ohg.LIZ;
            String strLJIJJ = C1478160oZK.LIZ().LJIJJ();
            if (strLJIJJ != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLJIJJ);
                sbLIZ.append(File.separator);
                sbLIZ.append(C0NKA.GHouse.getCacheDir());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (strLIZIZ != null) {
                    C0VSJ c0vsj = new C0VSJ(strLIZIZ);
                    if (c0vsj.exists() && c0vsj.isDirectory()) {
                        File[] fileArrListFiles = c0vsj.listFiles();
                        if (fileArrListFiles != null) {
                            numValueOf = Integer.valueOf(fileArrListFiles.length);
                        } else {
                            numValueOf = null;
                        }
                        C08QA.LJIIZILJ(c0vsj);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("clean: ");
                        sbLIZ2.append(numValueOf);
                        sbLIZ2.append(" files");
                        C2188811AlT.LIZIZ(sbLIZ2);
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0NH6.LJIILLIIL.LJII(new C5182020e(e, 359));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GoldenHouse@3441.clean$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
