package X;

import android.os.SystemClock;
import com.bytedance.i18n.location.wifi.WifiClientImpl;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0wZw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1786060wZw extends C09AY implements InterfaceC1685420txc<List<? extends String>, Long, Long, Boolean, Boolean, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ WifiClientImpl LLILLJJLI;
    public final /* synthetic */ InterfaceC1780400wQo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1786060wZw(long j, WifiClientImpl wifiClientImpl, InterfaceC1780400wQo interfaceC1780400wQo) {
        super(5);
        this.LL = j;
        this.LLILLJJLI = wifiClientImpl;
        this.LLILLL = interfaceC1780400wQo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1685420txc
    public final Unit invoke(List<? extends String> list, Long l, Long l2, Boolean bool, Boolean bool2) {
        EnumC1778890wON enumC1778890wON;
        List<? extends String> list2 = list;
        long jLongValue = l.longValue();
        long jLongValue2 = l2.longValue();
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        long jUptimeMillis = SystemClock.uptimeMillis() - this.LL;
        boolean z = !zBooleanValue2;
        if (!zBooleanValue) {
            enumC1778890wON = EnumC1778890wON.PASSIVE;
        } else if (zBooleanValue2) {
            enumC1778890wON = EnumC1778890wON.ACTIVE_SUCCESS;
        } else {
            enumC1778890wON = EnumC1778890wON.ACTIVE_FALLBACK;
        }
        if (list2 != null && (!list2.isEmpty())) {
            this.LLILLJJLI.getClass();
            WifiClientImpl.LJIJJLI(jUptimeMillis, "success", 0, null, z, zBooleanValue, zBooleanValue2);
        } else {
            this.LLILLJJLI.getClass();
            WifiClientImpl.LJIJJLI(jUptimeMillis, "fail", -999, "unknown", z, zBooleanValue, zBooleanValue2);
        }
        this.LLILLL.LIZ(list2, jLongValue, jLongValue2, enumC1778890wON);
        return Unit.LIZ;
    }
}
