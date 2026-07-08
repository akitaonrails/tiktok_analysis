package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedInputStream;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import kotlin.text.Charsets;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WXI, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WXI {
    public static C830090WhL LIZ(EnumC2273771DzD enumC2273771DzD, String str) {
        return C0WXC.LIZ(enumC2273771DzD, "application/json; charset=UTF-8", C786410Ut5.J3(new JSONObject().put("success", false).put("error", str)));
    }

    public static C830090WhL LIZIZ(InterfaceC824480WVy interfaceC824480WVy, C0WXN c0wxn) {
        C830070WhJ c830070WhJ = (C830070WhJ) interfaceC824480WVy;
        if (c830070WhJ.LJI != EnumC830230WhZ.POST) {
            return LIZ(EnumC2273771DzD.METHOD_NOT_ALLOWED, "仅支持POST请求");
        }
        String str = (String) ((HashMap) c830070WhJ.LJIIIIZZ).get("content-type");
        if (str != null && a0.LJJIIZI(str, "application/json", false)) {
            try {
                String str2 = (String) ((HashMap) ((C830070WhJ) interfaceC824480WVy).LJIIIIZZ).get("content-length");
                if (str2 != null && !a0.LJJJIL(str2)) {
                    Integer numLJIIJJI = C2095008Iq.LJIIJJI(str2);
                    if (numLJIIJJI != null) {
                        int iIntValue = numLJIIJJI.intValue();
                        BufferedInputStream bufferedInputStream = ((C830070WhJ) interfaceC824480WVy).LIZJ;
                        byte[] bArr = new byte[iIntValue];
                        int i = 0;
                        while (i < iIntValue) {
                            int i2 = bufferedInputStream.read(bArr, i, iIntValue - i);
                            if (i2 == -1) {
                                EnumC2273771DzD enumC2273771DzD = EnumC2273771DzD.BAD_REQUEST;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("请求数据不完整（预期");
                                sbLIZ.append(iIntValue);
                                sbLIZ.append("字节，实际");
                                sbLIZ.append(i);
                                sbLIZ.append("字节）");
                                return LIZ(enumC2273771DzD, C2188811AlT.LIZIZ(sbLIZ));
                            }
                            i += i2;
                        }
                        String str3 = new String(bArr, 0, i, Charsets.UTF_8);
                        if (a0.LJJJIL(str3)) {
                            return LIZ(EnumC2273771DzD.BAD_REQUEST, "请求体为空");
                        }
                        if (c0wxn != null) {
                            c0wxn.LIZLLL(str3);
                        }
                        return C0WXC.LIZ(EnumC2273771DzD.OK, "application/json; charset=UTF-8", "");
                    }
                    return LIZ(EnumC2273771DzD.BAD_REQUEST, "Content-Length格式错误");
                }
                return LIZ(EnumC2273771DzD.LENGTH_REQUIRED, "缺少Content-Length头");
            } catch (SocketTimeoutException e) {
                TryCatchGuardChecker.doCheck(e);
                return LIZ(EnumC2273771DzD.REQUEST_TIMEOUT, "读取请求超时（请检查客户端是否发送完整数据）");
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
                EnumC2273771DzD enumC2273771DzD2 = EnumC2273771DzD.BAD_REQUEST;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("JSON格式错误：");
                sbLIZ2.append(e2.getMessage());
                return LIZ(enumC2273771DzD2, C2188811AlT.LIZIZ(sbLIZ2));
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                EnumC2273771DzD enumC2273771DzD3 = EnumC2273771DzD.INTERNAL_ERROR;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("服务器处理失败：");
                sbLIZ3.append(e3.getMessage());
                return LIZ(enumC2273771DzD3, C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return LIZ(EnumC2273771DzD.UNSUPPORTED_MEDIA_TYPE, "仅支持application/json类型");
    }
}
