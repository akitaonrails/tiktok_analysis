package X;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import java.util.Map;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: renamed from: X.0wE8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1772540wE8 extends AbstractC1771860wD2 {
    public static final C01GW<Gson> LLILLL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(469));

    @Override // X.AbstractC1771860wD2
    public final void LIZLLL() {
        LIZIZ().getEventCenter().LJFF("ecMixMallRefresh", new InterfaceC1775150wIL() { // from class: X.0wE7
            @Override // X.InterfaceC1775150wIL
            public final void LIZ(Map map, Map map2, C21175917tt c21175917tt) {
                Integer num;
                int iIntValue;
                String str;
                Map<String, ? extends Object> map3;
                int iIntValue2;
                boolean z;
                String str2;
                int iIntValue3;
                Integer num2;
                Integer num3;
                Object objLIZ = C7726030a.LIZ("force", map);
                if (objLIZ instanceof Integer) {
                    num = (Integer) objLIZ;
                } else {
                    num = null;
                }
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                Object objLIZ2 = C7726030a.LIZ("tab_id", map);
                if (objLIZ2 instanceof String) {
                    str = (String) objLIZ2;
                } else {
                    str = null;
                }
                Object objLIZ3 = C7726030a.LIZ("dynamic_params", map);
                if (objLIZ3 instanceof Map) {
                    map3 = (Map) objLIZ3;
                } else {
                    map3 = null;
                }
                Object objLIZ4 = C7726030a.LIZ("clear_all", map);
                if ((objLIZ4 instanceof Integer) && (num3 = (Integer) objLIZ4) != null) {
                    iIntValue2 = num3.intValue();
                } else {
                    iIntValue2 = 0;
                }
                if (iIntValue2 == 1) {
                    z = true;
                } else {
                    z = false;
                }
                Object objLIZ5 = C7726030a.LIZ("reason", map);
                if (objLIZ5 instanceof String) {
                    str2 = (String) objLIZ5;
                } else {
                    str2 = null;
                }
                Object objLIZ6 = C7726030a.LIZ("show_loading", map);
                if ((objLIZ6 instanceof Integer) && (num2 = (Integer) objLIZ6) != null) {
                    iIntValue3 = num2.intValue();
                } else {
                    iIntValue3 = 0;
                }
                if (iIntValue == 1) {
                    this.LIZ.LIZIZ().LJIIIZ().r10();
                    C599820Nfo.LIZ.getClass();
                    C599820Nfo.LIZLLL();
                } else {
                    if (this.LIZ.LIZIZ().LJIIIZ().Ba2()) {
                        C599820Nfo.LIZ.getClass();
                        C599820Nfo.LIZLLL();
                    }
                    c21175917tt.LIZ(1, "success", null);
                }
                C1772540wE8 c1772540wE8 = this.LIZ;
                final AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(OppoPermissionPopupMaskDelayExp.DEFAULT);
                c1772540wE8.getClass();
                String str3 = "jsb";
                if (TextUtils.isEmpty(str2)) {
                    str2 = "jsb";
                }
                AbstractC1772270wDh abstractC1772270wDh = c1772540wE8.LIZIZ().LIZLLL().LJ;
                if (str2 != null) {
                    str3 = str2;
                }
                abstractC1772270wDh.LJ(iIntValue3, "fetch", str3, map3, str, z, new InterfaceC1772480wE2() { // from class: X.0qzy
                    @Override // X.InterfaceC1772480wE2
                    public final void LIZ(boolean z2) {
                        aFwS264S0000000_24.invoke(Boolean.valueOf(z2));
                    }
                });
                c21175917tt.LIZ(1, "success", null);
            }
        });
        LIZIZ().getEventCenter().LJFF("ecMixMallLoadmore", new InterfaceC1775150wIL() { // from class: X.0wE4
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10, types: [X.0wE3] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.InterfaceC1775150wIL
            public final void LIZ(Map map, Map map2, C21175917tt c21175917tt) {
                String str;
                Map map3;
                Object objLIZ = C7726030a.LIZ("tab_id", map);
                String str2 = null;
                if (objLIZ instanceof String) {
                    str = (String) objLIZ;
                } else {
                    str = null;
                }
                Object objLIZ2 = C7726030a.LIZ("dynamic_params", map);
                if (objLIZ2 instanceof Map) {
                    map3 = (Map) objLIZ2;
                } else {
                    map3 = null;
                }
                Object objLIZ3 = C7726030a.LIZ("reason", map);
                if (objLIZ3 instanceof String) {
                    str2 = (String) objLIZ3;
                }
                C1772540wE8 c1772540wE8 = this.LIZ;
                final AwS588S0100000_9 awS588S0100000_9 = new AwS588S0100000_9(c21175917tt, 613);
                c1772540wE8.getClass();
                String str3 = "jsb";
                if (TextUtils.isEmpty(str2)) {
                    str2 = "jsb";
                }
                AbstractC1772270wDh abstractC1772270wDh = c1772540wE8.LIZIZ().LIZLLL().LJ;
                if (str2 != null) {
                    str3 = str2;
                }
                abstractC1772270wDh.LIZLLL(str, str3, map3, new InterfaceC1772480wE2() { // from class: X.0wE3
                    @Override // X.InterfaceC1772480wE2
                    public final void LIZ(boolean z) {
                        awS588S0100000_9.invoke(Boolean.valueOf(z));
                    }
                });
            }
        });
    }
}
