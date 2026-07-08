package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;

/* JADX INFO: renamed from: X.0fli, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1139880fli extends AbstractC1140540fmm {
    public static final C1139910fll LIZIZ = new C1139910fll();

    public C1139880fli(C1139190fkb c1139190fkb) {
        super(c1139190fkb);
    }

    public static void LIZJ(C1141050fnb c1141050fnb, AssetsModel assetsModel) {
        int i;
        String str;
        long j;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_effect_resource_integrity_check");
        int i2 = 0;
        if (c1141050fnb != null) {
            i = c1141050fnb.LIZ;
        } else {
            i = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "error_code");
        if (c1141050fnb == null || (str = c1141050fnb.LIZIZ) == null) {
            str = "";
        }
        c474500IjALIZ.LJJII(str, "error_msg");
        if (assetsModel != null) {
            j = assetsModel.id;
        } else {
            j = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(j), "effect_id");
        if (assetsModel != null) {
            i2 = assetsModel.resourceType;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "resource_type");
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0138  */
    @Override // X.AbstractC1140540fmm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(final X.AbstractC1140580fmq r12, X.C1139900flk r13) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1139880fli.LIZ(X.0fmq, X.0flk):void");
    }

    public static void LIZIZ(String str, C1139900flk c1139900flk, AbstractC1140580fmq abstractC1140580fmq) {
        long j;
        C1139910fll c1139910fll = LIZIZ;
        if (c1139900flk != null) {
            j = c1139900flk.LIZIZ;
        } else {
            j = 0;
        }
        c1139910fll.getClass();
        C1139910fll.LIZ(j, str);
        if (c1139900flk != null) {
            c1139900flk.LJI = true;
            c1139900flk.LJIIJ = c1139900flk.LIZIZ;
            c1139900flk.LJIIIIZZ = EnumC1140010flv.DONE;
            c1139900flk.LJIIIZ = str;
        }
        abstractC1140580fmq.LIZ(c1139900flk);
    }
}
