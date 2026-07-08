package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KZy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C519760KZy extends AbstractC519780Ka0 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean zBooleanValue;
        C0KA2 c0ka1;
        long jLongValue;
        InterfaceC519770KZz interfaceC519770KZz = (InterfaceC519770KZz) xBaseParamModel;
        XBaseResultModel xBaseResultModel = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC519790Ka1.class, null);
        C1106750euH c1106750euH = C1106750euH.LIZ;
        String path = interfaceC519770KZz.getPath();
        if (C1122210fJD.LIZ(path)) {
            Boolean forceFetch = interfaceC519770KZz.getForceFetch();
            if (forceFetch != null) {
                zBooleanValue = forceFetch.booleanValue();
            } else {
                zBooleanValue = false;
            }
            if (Intrinsics.LJFF(interfaceC519770KZz.isOneTimeCache(), Boolean.TRUE)) {
                c0ka1 = C0KA3.LIZ;
            } else {
                Number cacheDuration = interfaceC519770KZz.getCacheDuration();
                if (cacheDuration != null) {
                    jLongValue = cacheDuration.longValue();
                } else {
                    jLongValue = Long.MAX_VALUE;
                }
                c0ka1 = new C0KA1(jLongValue);
            }
            C1100630ekP c1100630ekP = new C1100630ekP(zBooleanValue, c0ka1, false);
            Map<String, ? extends Object> parameters = interfaceC519770KZz.getParameters();
            if (parameters == null) {
                parameters = C2097608Jq.LJ();
            }
            c1106750euH.LIZIZ(c1100630ekP, path, parameters, AFwS237S0000000_7.get$arr$(363), AFwS237S0000000_7.get$arr$(364));
        }
        completionBlock.onSuccess(xBaseResultModel, "");
    }
}
