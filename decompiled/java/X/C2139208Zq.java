package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08Zq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.mobileefffect.MobileEffectUtilKt$writeLabelToAMECapabilities$2", f = "MobileEffectUtil.kt", l = {}, m = "invokeSuspend")
public final class C2139208Zq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Long>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Integer LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2139208Zq(String str, Integer num, String str2, InterfaceC1364105Vn<? super C2139208Zq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = num;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2139208Zq(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Long> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        JSONObject jSONObject;
        String strJ3;
        String strJ32;
        long length;
        OutputStreamWriter outputStreamWriter;
        C0VSJ c0vsj;
        C1C7U.LIZ("MobileEffectUtilKt@ccb6.writeLabelToAMECapabilities$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LL;
        Long lLJFF = null;
        if (str != null) {
            Integer num = this.LLILLJJLI;
            String str2 = this.LLILLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(File.separator);
            sbLIZ.append("capabilities.json");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("label file path ");
            sbLIZ2.append(strLIZIZ);
            C201955140j.LIZLLL(c20012313Rx, "DiyProp", C2188811AlT.LIZIZ(sbLIZ2));
            try {
                c0vsj = new C0VSJ(strLIZIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
                C20012313Rx c20012313Rx2 = C20012313Rx.LIZIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("read json file exception, e=");
                sbLIZ3.append(e);
                C201955140j.LIZLLL(c20012313Rx2, "DiyProp", C2188811AlT.LIZIZ(sbLIZ3));
            }
            if (c0vsj.exists()) {
                C0VSP c0vsp = new C0VSP(c0vsj);
                try {
                    byte[] bArr = new byte[c0vsp.available()];
                    c0vsp.read(bArr);
                    jSONObject = new JSONObject(new String(bArr, Charset.defaultCharset()));
                    C2107108Nh.LIZ(c0vsp, null);
                } catch (Throwable th) {
                    th = th;
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    C2107108Nh.LIZ(c0vsp, th);
                                    throw th;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        th = null;
                    }
                }
            } else {
                jSONObject = null;
            }
            C20012313Rx c20012313Rx3 = C20012313Rx.LIZIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("label file content ");
            if (jSONObject != null) {
                strJ3 = C786410Ut5.J3(jSONObject);
            } else {
                strJ3 = null;
            }
            sbLIZ4.append(strJ3);
            C201955140j.LIZLLL(c20012313Rx3, "DiyProp", C2188811AlT.LIZIZ(sbLIZ4));
            if ((num == null || num.intValue() != 1) && str2 == null) {
                if (jSONObject != null) {
                    jSONObject.put("icon_edit_TT", 0);
                }
            } else if (jSONObject != null) {
                jSONObject.put("icon_edit_TT", 1);
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("label file finish content ");
            if (jSONObject != null) {
                strJ32 = C786410Ut5.J3(jSONObject);
            } else {
                strJ32 = null;
            }
            sbLIZ5.append(strJ32);
            C201955140j.LIZLLL(c20012313Rx3, "DiyProp", C2188811AlT.LIZIZ(sbLIZ5));
            if (jSONObject != null) {
                String strK3 = C786410Ut5.K3(1, jSONObject);
                try {
                    File absoluteFile = new C0VSJ(strLIZIZ).getAbsoluteFile();
                    if (!absoluteFile.exists()) {
                        absoluteFile.createNewFile();
                    }
                    try {
                        outputStreamWriter = new OutputStreamWriter(new C0VSV(absoluteFile, false));
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        length = 0;
                    }
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    length = -1;
                }
                try {
                    outputStreamWriter.write(strK3);
                    outputStreamWriter.flush();
                    C2107108Nh.LIZ(outputStreamWriter, null);
                    length = strK3.length();
                    lLJFF = C2286608xc.LJFF(length);
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        } catch (Throwable th6) {
                            th = th6;
                            th = null;
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(outputStreamWriter, th);
                            throw th;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                    }
                }
            }
        }
        C1C7U.LIZIZ("MobileEffectUtilKt@ccb6.writeLabelToAMECapabilities$2");
        return lLJFF;
    }
}
