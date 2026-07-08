package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0qF1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1542450qF1 {
    public static final Set<C1BP1<?, ?>> LIZ = new HashSet();
    public static final C1542480qF4 LIZIZ;

    static {
        C1542500qF6<T> c1542500qF6 = C1542500qF6.LIZ;
        InterfaceC1537230q6b<InterfaceC1535500q3o> interfaceC1537230q6b = new InterfaceC1537230q6b<InterfaceC1535500q3o>() { // from class: X.0qF2
            @Override // X.InterfaceC1537230q6b
            public final /* bridge */ /* synthetic */ InterfaceC1535500q3o create() {
                return null;
            }

            @Override // X.InterfaceC1537230q6b
            public final InterfaceC1535500q3o LIZ(Object obj) {
                if (!(obj instanceof C1530150pvB)) {
                    C1542450qF1.LIZ("Create ResourceLoader error, the context is not valid.");
                    return null;
                }
                JSONArray jSONArray = C1533710q0v.LIZ;
                C1530150pvB c1530150pvB = (C1530150pvB) obj;
                IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(c1530150pvB.LIZ, false);
                if (iResourceServiceXLIZIZ == null) {
                    C1542450qF1.LIZ("Create ResourceLoader error, the resource service is null.");
                    return null;
                }
                return new C1535410q3f(iResourceServiceXLIZIZ, c1530150pvB);
            }
        };
        C1542440qF0 c1542440qF0 = new C1542440qF0();
        C1542480qF4 c1542480qF4 = new C1542480qF4();
        c1542480qF4.LIZ = "HybridKit";
        c1542480qF4.LJFF = c1542500qF6;
        c1542480qF4.LIZJ = interfaceC1537230q6b;
        c1542480qF4.LJI = c1542440qF0;
        LIZIZ = c1542480qF4;
    }

    public static void LIZ(String str) {
        C1490740otc.LIZ.LIZ(str, EnumC1490770otf.I, "PiaCore");
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [X.0qF7, java.lang.Object] */
    public static C1542510qF7 LIZIZ(SparkSchemaParam sparkSchemaParam, SparkContext sparkContext) {
        String url;
        final InterfaceC1542530qF9 interfaceC1542530qF9LIZIZ;
        C1538050q7v c1538050q7v;
        String strApplyAppendCommonParamsUrl;
        if (sparkSchemaParam == null) {
            return null;
        }
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        C1538050q7v c1538050q7v2 = C1161970gLL.LIZIZ().LIZLLL;
        if (c1538050q7v2 == null || (url = c1538050q7v2.applyGlobalLoadUrl(sparkSchemaParam.getUrl())) == null) {
            url = sparkSchemaParam.getUrl();
        }
        if (sparkSchemaParam.getAppendCommonParams() && (c1538050q7v = C1161970gLL.LIZIZ().LIZLLL) != null && (strApplyAppendCommonParamsUrl = c1538050q7v.applyAppendCommonParamsUrl(url)) != null) {
            url = strApplyAppendCommonParamsUrl;
        }
        C1541480qDS c1541480qDS = new C1541480qDS(UriProtector.parse(url));
        c1541480qDS.LJIIL = sparkSchemaParam;
        boolean z = sparkContext.usePreload;
        InterfaceC1533190q05 interfaceC1533190q05 = (InterfaceC1533190q05) C1963807me.LIZ(InterfaceC1533190q05.class);
        if (interfaceC1533190q05 == null || (interfaceC1542530qF9LIZIZ = interfaceC1533190q05.LIZIZ(url, new C1530150pvB(sparkContext, c1541480qDS), EnumC1533200q06.Activate, z)) == null) {
            return null;
        }
        ?? r5 = new InterfaceC1542520qF8() { // from class: X.0qF7
            @Override // X.InterfaceC1163130gND
            public final void release() {
                interfaceC1542530qF9LIZIZ.release();
            }
        };
        sparkContext.LJJ(InterfaceC1542520qF8.class, r5);
        return r5;
    }
}
