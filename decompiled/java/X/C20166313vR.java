package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.13vR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20166313vR extends C20166413vS {
    public final String LJJJJ;
    public final EnumC1074240e3q LJJJJI;
    public final String LJJJJIZL = "ContactPef";

    public final void LIZJ(JSONObject jSONObject) throws JSONException {
        LIZIZ("psi_exp_type", this.LIZIZ, jSONObject);
        if (this.LIZIZ != -1) {
            jSONObject.put("psi_exp_enable", this.LIZJ);
            jSONObject.put("psi_exp_success", this.LIZLLL);
            jSONObject.put("psi_cpu", ((Number) this.LIZ.getValue()).intValue());
        }
        String str = this.LJ;
        if (str != null) {
            jSONObject.put("psi_err_type", str);
        }
        String str2 = this.LJFF;
        if (str2 != null) {
            jSONObject.put("psi_err", str2);
        }
        Boolean bool = this.LJII;
        if (bool != null) {
            jSONObject.put("psi_degraded_success", bool.booleanValue());
        }
        LIZIZ("psi_input_origin_book_count", this.LJIIIIZZ, jSONObject);
        LIZIZ("psi_input_origin_contact_count", this.LJIIIZ, jSONObject);
        LIZIZ("psi_input_origin_contact_email_count", this.LJIIJ, jSONObject);
        LIZ(this.LJIIJJI, jSONObject, "psi_total_cost");
        LIZ(this.LJIIL, jSONObject, "psi_step1_cost");
        LIZ(this.LJIILIIL, jSONObject, "psi_s1_encrypt_cost");
        LIZ(this.LJIILJJIL, jSONObject, "psi_s1_api_cost");
        LIZ(this.LJIILL, jSONObject, "psi_s1_intersect_cost");
        LIZIZ("psi_s1_encrypts_count", this.LJIILLIIL, jSONObject);
        LIZIZ("psi_s1_hashab_count", this.LJIIZILJ, jSONObject);
        LIZIZ("psi_s1_bloom_size", this.LJIJ, jSONObject);
        LIZIZ("psi_s1_intersection_size", this.LJIJI, jSONObject);
        LIZIZ("psi_s1_encrypts_count_email", this.LJIJJ, jSONObject);
        LIZIZ("psi_s1_hashab_count_email", this.LJIJJLI, jSONObject);
        LIZIZ("psi_s1_bloom_size_email", this.LJIL, jSONObject);
        LIZIZ("psi_s1_intersection_size_email", this.LJJ, jSONObject);
        LIZ(this.LJJI, jSONObject, "psi_step2_cost");
        LIZ(this.LJJIFFI, jSONObject, "psi_s2_api_cost");
        LIZIZ("psi_s2_req_book_count", this.LJJII, jSONObject);
        LIZIZ("psi_s2_req_contact_count", this.LJJIII, jSONObject);
        LIZIZ("psi_s2_req_contact_email_count", this.LJJIIJ, jSONObject);
        Long l = this.LJJIIJZLJL;
        if (l != null) {
            LIZIZ("psi_s2_resp_register_contact_count", l.longValue(), jSONObject);
        }
        Long l2 = this.LJJIIZ;
        if (l2 != null) {
            LIZIZ("psi_s2_resp_unregister_count", l2.longValue(), jSONObject);
        }
        Long l3 = this.LJJIIZI;
        if (l3 != null) {
            LIZIZ("psi_s2_resp_unregister_attach_phone_count", l3.longValue(), jSONObject);
        }
        Long l4 = this.LJJIJ;
        if (l4 != null) {
            LIZIZ("psi_s2_resp_unregister_attach_count", l4.longValue(), jSONObject);
        }
        LIZ(this.LJJIJIIJI, jSONObject, "psi_s2_api_origin_cost");
        Long l5 = this.LJJIJIIJIL;
        if (l5 != null) {
            LIZIZ("psi_s2_resp_register_contact_origin_count", l5.longValue(), jSONObject);
        }
        Long l6 = this.LJJIJIL;
        if (l6 != null) {
            LIZIZ("psi_s2_resp_unregister_origin_count", l6.longValue(), jSONObject);
        }
        Boolean bool2 = this.LJJIJL;
        if (bool2 != null) {
            jSONObject.put("psi_exp_expect_phone", bool2.booleanValue());
        }
        Boolean bool3 = this.LJJIJLIJ;
        if (bool3 != null) {
            jSONObject.put("psi_exp_expect_email", bool3.booleanValue());
        }
        Boolean bool4 = this.LJJIL;
        if (bool4 != null) {
            jSONObject.put("psi_exp_expect_register", bool4.booleanValue());
        }
        Boolean bool5 = this.LJJIZ;
        if (bool5 != null) {
            jSONObject.put("psi_exp_expect_unregister", bool5.booleanValue());
        }
        Boolean bool6 = this.LJJJ;
        if (bool6 != null) {
            jSONObject.put("psi_exp_expect_provide_register", bool6.booleanValue());
        }
        Boolean bool7 = this.LJJJI;
        if (bool7 != null) {
            jSONObject.put("psi_v3_enable", bool7.booleanValue());
            long j = this.LJJ;
            long j2 = 0;
            if (j <= 0) {
                j = 0;
            }
            long j3 = j + 0;
            long j4 = this.LJIJI;
            if (j4 > 0) {
                j2 = j4;
            }
            LIZIZ("psi_v3_total_intersect", j3 + j2, jSONObject);
            LIZIZ("origin_total_register_user_count", this.LJJJIL, jSONObject);
        }
        Boolean bool8 = this.LJI;
        if (bool8 != null) {
            jSONObject.put("psi_exp_expect", bool8.booleanValue());
        }
    }

    public final void LIZLLL(String str) {
        String strName;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJJJJIZL);
        sbLIZ.append('-');
        EnumC1074240e3q enumC1074240e3q = this.LJJJJI;
        if (enumC1074240e3q != null) {
            strName = enumC1074240e3q.name();
        } else {
            strName = null;
        }
        sbLIZ.append(strName);
        sbLIZ.append('}');
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20166313vR(String str, EnumC1074240e3q enumC1074240e3q) {
        this.LJJJJ = str;
        this.LJJJJI = enumC1074240e3q;
    }

    public final void LJFF(String str, Throwable th) {
        String strName;
        if (this.LJ == null && str != null) {
            this.LJ = str;
        }
        if (this.LJFF == null && th != null) {
            this.LJFF = th.getMessage();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("errType: ");
        sbLIZ.append(str);
        sbLIZ.append(" , err: ");
        sbLIZ.append(th);
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LJJJJIZL);
        sbLIZ2.append('-');
        EnumC1074240e3q enumC1074240e3q = this.LJJJJI;
        if (enumC1074240e3q != null) {
            strName = enumC1074240e3q.name();
        } else {
            strName = null;
        }
        sbLIZ2.append(strName);
        sbLIZ2.append('}');
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static void LIZ(C20167113vZ c20167113vZ, JSONObject jSONObject, String str) throws JSONException {
        long j = c20167113vZ.LIZ;
        if (j != -1) {
            jSONObject.put(str, j);
        }
    }

    public static void LIZIZ(String str, long j, JSONObject jSONObject) throws JSONException {
        if (j != -1) {
            jSONObject.put(str, j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object LJ(X.C20167113vZ r9, kotlin.jvm.functions.Function1<? super X.InterfaceC1364105Vn<? super T>, ? extends java.lang.Object> r10, X.InterfaceC1364105Vn<? super T> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C20166213vQ
            if (r0 == 0) goto L26
            r3 = r11
            X.13vQ r3 = (X.C20166213vQ) r3
            int r2 = r3.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r3.LLILZIL = r2
        L12:
            java.lang.Object r4 = r3.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r3.LLILZIL
            java.lang.String r7 = " cost: "
            r0 = 1
            if (r1 == 0) goto L3a
            if (r1 != r0) goto L32
            long r5 = r3.LLILLJJLI
            X.13vZ r9 = r3.LL
            goto L2c
        L26:
            X.13vQ r3 = new X.13vQ
            r3.<init>(r8, r11)
            goto L12
        L2c:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Throwable -> L30
            goto L4e
        L30:
            r1 = move-exception
            goto L6d
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3a:
            X.C155000ia.LIZIZ(r4)
            long r5 = android.os.SystemClock.uptimeMillis()
            r3.LL = r9     // Catch: java.lang.Throwable -> L6c
            r3.LLILLJJLI = r5     // Catch: java.lang.Throwable -> L6c
            r3.LLILZIL = r0     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r4 = r10.invoke(r3)     // Catch: java.lang.Throwable -> L6c
            if (r4 != r2) goto L4e
            return r2
        L4e:
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r5
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()
            java.lang.String r0 = r9.LIZIZ
            r3.append(r0)
            r3.append(r7)
            r3.append(r1)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r3)
            r8.LIZLLL(r0)
            r9.LIZ = r1
            return r4
        L6c:
            r1 = move-exception
        L6d:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = r9.LIZIZ     // Catch: java.lang.Throwable -> L76
            r8.LJFF(r0, r1)     // Catch: java.lang.Throwable -> L76
            throw r1     // Catch: java.lang.Throwable -> L76
        L76:
            r4 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r4)     // Catch: java.lang.Throwable -> L76
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r5
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()
            java.lang.String r0 = r9.LIZIZ
            r3.append(r0)
            r3.append(r7)
            r3.append(r1)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r3)
            r8.LIZLLL(r0)
            r9.LIZ = r1
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20166313vR.LJ(X.13vZ, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }
}
