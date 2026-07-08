package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;

/* JADX INFO: renamed from: X.0ne5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1442670ne5 {
    @InterfaceC1294060jmO
    public static final boolean LIZ() {
        Boolean boolValueOf = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "mv_enable_binding_hd_switch", true, false));
        Boolean boolValueOf2 = Boolean.valueOf(InterfaceC1442770neF.LJII.enableMvBindingHDSwitch());
        if (C1442400nde.LIZ()) {
            StringBuilder sb = new StringBuilder("key : mv_enable_binding_hd_switch , byteBenchValue : ");
            sb.append(C1983207pm.LIZ(Boolean.class) ? String.valueOf(boolValueOf2) : GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), boolValueOf2));
            C1440300naG.LIZ(sb.toString());
            boolValueOf = boolValueOf2;
        } else {
            StringBuilder sb2 = new StringBuilder("key : mv_enable_binding_hd_switch , libraValue : ");
            sb2.append(C1983207pm.LIZ(Boolean.class) ? String.valueOf(boolValueOf) : GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), boolValueOf));
            C1440300naG.LIZ(sb2.toString());
        }
        return boolValueOf.booleanValue();
    }
}
