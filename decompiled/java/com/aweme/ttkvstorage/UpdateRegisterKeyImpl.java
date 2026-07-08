package com.aweme.ttkvstorage;

import X.C2192351ArB;
import X.C2192371ArD;
import X.EnumC20429814wq;
import com.bytedance.ies.ugc.ttkvstorageapi.IUpdateKVRegisterKey;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class UpdateRegisterKeyImpl implements IUpdateKVRegisterKey {
    @Override // com.bytedance.ies.ugc.ttkvstorageapi.IUpdateKVRegisterKey
    public final HashMap<String, String> LIZ(String str, String str2) {
        C2192371ArD c2192371ArD;
        HashMap<String, String> map;
        C2192371ArD c2192371ArD2;
        HashMap<String, String> map2;
        if (Intrinsics.LJFF(str2, "KEVA")) {
            C2192351ArB c2192351ArB = C2192351ArB.LIZ;
            EnumC20429814wq enumC20429814wq = EnumC20429814wq.KEVA;
            c2192351ArB.getClass();
            HashMap mapLIZ = C2192351ArB.LIZ(str, enumC20429814wq);
            if (mapLIZ == null || (c2192371ArD2 = (C2192371ArD) mapLIZ.get(str)) == null || (map2 = c2192371ArD2.LIZ) == null) {
                return new HashMap<>();
            }
            return map2;
        }
        C2192351ArB c2192351ArB2 = C2192351ArB.LIZ;
        EnumC20429814wq enumC20429814wq2 = EnumC20429814wq.SP;
        c2192351ArB2.getClass();
        HashMap mapLIZ2 = C2192351ArB.LIZ(str, enumC20429814wq2);
        if (mapLIZ2 != null && (c2192371ArD = (C2192371ArD) mapLIZ2.get(str)) != null && (map = c2192371ArD.LIZ) != null) {
            return map;
        }
        return new HashMap<>();
    }
}
