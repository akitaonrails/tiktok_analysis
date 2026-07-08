package X;

import android.content.Intent;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03rm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C976403rm {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [int] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static AddressPageStarter.AddressListEnterParams LIZIZ(Intent intent) {
        boolean z;
        boolean z2;
        Integer numValueOf;
        Integer numValueOf2;
        int iValueOf;
        int iIntValue;
        Integer numValueOf3;
        Float fLJIIIIZZ;
        Integer numLJIIJJI;
        Integer numLJIIJJI2;
        if (intent != null) {
            String strLIZ = LIZ(intent, "trackParams");
            try {
                String strLIZ2 = LIZ(intent, "is_select_mode");
                int iIntValue2 = 0;
                if (strLIZ2 != null) {
                    z = Boolean.parseBoolean(strLIZ2);
                } else {
                    z = false;
                }
                ?? r8 = z;
                if (!z) {
                    String strLIZ3 = LIZ(intent, "is_select_mode");
                    r8 = z;
                    if (strLIZ3 != null) {
                        r8 = z;
                        if (CastIntegerProtector.parseInt(strLIZ3) == 1) {
                            r8 = 1;
                        }
                    }
                }
                String strLIZ4 = LIZ(intent, "from_incentive");
                if (strLIZ4 != null) {
                    z2 = Boolean.parseBoolean(strLIZ4);
                } else {
                    z2 = false;
                }
                String strLIZ5 = LIZ(intent, "incentive_record_id");
                String strLIZ6 = LIZ(intent, "product_id");
                String strLIZ7 = LIZ(intent, "mark_unavailable_address");
                if (strLIZ7 != null) {
                    numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(strLIZ7));
                } else {
                    numValueOf = null;
                }
                String strLIZ8 = LIZ(intent, Scene.SCENE_SERVICE);
                if (strLIZ8 != null && strLIZ8.length() != 0) {
                    String strLIZ9 = LIZ(intent, Scene.SCENE_SERVICE);
                    if (strLIZ9 != null) {
                        numValueOf2 = Integer.valueOf(CastIntegerProtector.parseInt(strLIZ9));
                    } else {
                        numValueOf2 = null;
                    }
                } else {
                    numValueOf2 = 0;
                }
                String strLIZ10 = LIZ(intent, "scene_params_str");
                String strLIZ11 = LIZ(intent, "select_scene");
                if (strLIZ11 != null && strLIZ11.length() != 0) {
                    iValueOf = Integer.valueOf(CastIntegerProtector.parseInt(strLIZ11));
                } else {
                    iValueOf = 0;
                }
                String strLIZ12 = LIZ(intent, "extra_info");
                String strLIZ13 = LIZ(intent, "address_entrance_scene");
                if (strLIZ13 != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(strLIZ13)) != null) {
                    iIntValue = numLJIIJJI2.intValue();
                } else {
                    iIntValue = 0;
                }
                String strLIZ14 = LIZ(intent, "free_shipping");
                if (strLIZ14 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strLIZ14)) != null) {
                    iIntValue2 = numLJIIJJI.intValue();
                }
                boolean zLJFF = Intrinsics.LJFF(LIZ(intent, "update_cache"), C893803eS.LIZ(true));
                String strLIZ15 = LIZ(intent, "source_btm_token");
                String strLIZ16 = LIZ(intent, "checkout_type");
                if (strLIZ16 == null) {
                    strLIZ16 = "normal_checkout";
                }
                String strLIZ17 = LIZ(intent, "address_selection_scene");
                if (strLIZ17 != null) {
                    numValueOf3 = Integer.valueOf(CastIntegerProtector.parseInt(strLIZ17));
                } else {
                    numValueOf3 = null;
                }
                String strLIZ18 = LIZ(intent, "half_express_height_percent");
                if (strLIZ18 != null) {
                    fLJIIIIZZ = C2327809Ae.LJIIIIZZ(strLIZ18);
                } else {
                    fLJIIIIZZ = null;
                }
                return new AddressPageStarter.AddressListEnterParams(r8, strLIZ, z2, strLIZ5, strLIZ6, numValueOf, numValueOf2, strLIZ10, iValueOf, strLIZ12, Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue), zLJFF, strLIZ15, strLIZ16, numValueOf3, fLJIIIIZZ, Boolean.valueOf(Intrinsics.LJFF(LIZ(intent, "need_tax_id_item"), C893803eS.LIZ(true))), null, Boolean.FALSE, Boolean.FALSE, Boolean.valueOf(Intrinsics.LJFF(LIZ(intent, "force_edit_mode"), C893803eS.LIZ(true))), Boolean.valueOf(Intrinsics.LJFF(LIZ(intent, "force_vertical"), C893803eS.LIZ(true))));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1019103yf.LIZ(EnumC1014603xw.ERR20001, e, null);
                return new AddressPageStarter.AddressListEnterParams(0, strLIZ, false, null, null, null, null, null, null, null, null, 0, false, null, null, null, null, null, null, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE);
            }
        }
        return null;
    }

    public static String LIZ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
