package X;

import android.util.SparseArray;
import com.bytedance.im.core.proto.MediaUploadConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YOG, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YOG implements C0YOJ {
    public final C0YH7 LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C871580YHc());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C0YOI(this));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C0YOF(this));
    public final C01GW LJ = C452501pT.LIZIZ(new C0YOH(this));

    public C0YOG(C0YH7 c0yh7) {
        this.LIZ = c0yh7;
    }

    @Override // X.C0YOJ
    public final void LIZJ(C869590Y9l c869590Y9l) {
        if (!this.LIZ.isLogin()) {
            return;
        }
        c869590Y9l.setMsgStatus(3);
        this.LIZ.LIZJ().LJIIJJI().LJJIIZ(new C0Y3I("media upload failed"), c869590Y9l, null);
    }

    @Override // X.C0YOJ
    public final C0YRV LIZ(C874220YRg c874220YRg, C0Y3I c0y3i) {
        return new C0YRV(this.LIZ, c0y3i, (C874160YRa) this.LJ.getValue(), c874220YRg);
    }

    public final void LJ(Function0 function0, Function1 function1) {
        InterfaceC497601wk interfaceC497601wkLIZ = this.LIZ.LLJLL().LIZ();
        if (interfaceC497601wkLIZ == null) {
            function0.invoke();
            return;
        }
        try {
            C23250099c.LIZLLL(interfaceC497601wkLIZ, null, null, new C614950OAb(this, function1, function0, null), 3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LIZLLL().LJIIIIZZ("DefaultUploaderAbility", "fetch upload config failed", e);
            function0.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.13BV] */
    @Override // X.C0YOJ
    public final void LIZIZ(boolean z, Function0 function0, Function1 function1) {
        if (!this.LIZ.isLogin()) {
            function0.invoke();
            return;
        }
        if (z) {
            LJ(function0, function1);
            return;
        }
        ?? arrayList = new ArrayList();
        Iterator it2 = ((List) this.LIZIZ.getValue()).iterator();
        while (it2.hasNext()) {
            MediaUploadConfig mediaUploadConfigLIZ = ((C0YHF) this.LIZJ.getValue()).LIZ(((EnumC870720YDu) it2.next()).getValue());
            if (mediaUploadConfigLIZ != null) {
                if (this.LIZ.getConfig().LIZ().LJJLIIIIJ.LIZJ.LIZIZ) {
                    if (System.currentTimeMillis() - ((long) 3600000) > mediaUploadConfigLIZ.expiry_time.longValue()) {
                        arrayList = C13BV.INSTANCE;
                        break;
                    }
                    arrayList.add(mediaUploadConfigLIZ);
                } else {
                    if (System.currentTimeMillis() > mediaUploadConfigLIZ.expiry_time.longValue()) {
                        arrayList = C13BV.INSTANCE;
                        break;
                    }
                    arrayList.add(mediaUploadConfigLIZ);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            function1.invoke(arrayList);
            if (Unit.LIZ != null) {
                return;
            }
        }
        LJ(function0, function1);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0YQ9] */
    @Override // X.C0YOJ
    public final C0YQ9 LIZLLL(int i, Function1 function1, Function1 function12) {
        return new AbstractC873650YPb(this.LIZ, i, (C0YHF) this.LIZJ.getValue(), function1, function12) { // from class: X.0YQ9
            public final C0YH7 LIZIZ;
            public final int LIZJ;
            public final C0YHF LIZLLL;
            public final Function1<String, Unit> LJ;
            public final Function1<C869590Y9l, Unit> LJFF;

            @Override // X.AbstractC873650YPb
            public final boolean LIZIZ(C873880YPy c873880YPy) {
                Object obj;
                if (this.LIZIZ.getConfig().LIZ().LJJLIIIIJ.LJFF) {
                    SparseArray<Object> sparseArray = c873880YPy.LIZLLL;
                    if (sparseArray != null) {
                        obj = sparseArray.get(2005);
                    } else {
                        obj = null;
                    }
                    if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }

            public static void LIZJ(C873910YQb c873910YQb, MediaUploadConfig mediaUploadConfig) {
                C0YQC c0yqc;
                C0YRX c0yrx;
                C0YQF c0yqf = c873910YQb.LIZJ;
                if ((c0yqf instanceof C0YRX) && (c0yrx = (C0YRX) c0yqf) != null) {
                    c0yrx.LIZLLL = C0YQB.LIZ(mediaUploadConfig);
                }
                C0YQF c0yqf2 = c873910YQb.LIZJ;
                if ((c0yqf2 instanceof C0YQC) && (c0yqc = (C0YQC) c0yqf2) != null) {
                    c0yqc.LIZ = new C0YQD(mediaUploadConfig.resource_space, mediaUploadConfig.host, new C874210YRf(mediaUploadConfig.access_key, mediaUploadConfig.session_token, mediaUploadConfig.secret_access_key, mediaUploadConfig.expiry_time.toString(), mediaUploadConfig.current_time.toString()));
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
            @Override // X.AbstractC873650YPb
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object LIZ(X.C873910YQb r12, X.InterfaceC1364105Vn<? super X.InterfaceC873770YPn> r13) {
                /*
                    Method dump skipped, instruction units count: 427
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0YQ9.LIZ(X.0YQb, X.05Vn):java.lang.Object");
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                super("media-ensure-upload-config");
                this.LIZIZ = c0yh7;
                this.LIZJ = i;
                this.LIZLLL = c0yhf;
                this.LJ = function1;
                this.LJFF = function12;
            }
        };
    }
}
