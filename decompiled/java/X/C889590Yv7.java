package X;

import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import com.bytedance.im.core.proto.im_biz_ext.BizConvSettingPersistentExt;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Yv7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C889590Yv7 {
    public static final C889590Yv7 LIZ = new C889590Yv7();

    public static Object LIZJ(String str, Map map, InterfaceC1364105Vn interfaceC1364105Vn) {
        C0YHX c0yhxLIZ;
        C0YH4 c0yh4LJIIL;
        InterfaceC866310Xyf interfaceC866310XyfLIZIZ;
        InterfaceC866290Xyd interfaceC866290XydLJIJ;
        Map mapLJ = C2097608Jq.LJ();
        long micros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        IIMCoreProxyService.LIZ.getClass();
        IIMCoreProxyService iIMCoreProxyServiceLIZ = C875420YVw.LIZ();
        if (iIMCoreProxyServiceLIZ != null && (c0yhxLIZ = iIMCoreProxyServiceLIZ.LIZ(C0YM2.TIKTOK_SOCIAL_IM)) != null && (c0yh4LJIIL = c0yhxLIZ.LJIIL()) != null && (interfaceC866310XyfLIZIZ = c0yh4LJIIL.LIZIZ()) != null && (interfaceC866290XydLJIJ = interfaceC866310XyfLIZIZ.LJIJ()) != null) {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                EnumC889640YvC enumC889640YvC = (EnumC889640YvC) entry.getKey();
                C891130Yxb c891130Yxb = (C891130Yxb) entry.getValue();
                C1496910p3Z c1496910p3Z = ByteString.Companion;
                ProtoAdapter<C889670YvF> protoAdapter = C889670YvF.ADAPTER;
                C889660YvE c889660YvE = new C889660YvE();
                c889660YvE.LIZLLL = c891130Yxb;
                ByteString byteStringLIZJ = C1496910p3Z.LIZJ(c1496910p3Z, protoAdapter.encode(c889660YvE.build()));
                C889650YvD c889650YvD = new C889650YvD();
                c889650YvD.LIZLLL = Integer.valueOf(enumC889640YvC.getValue());
                c889650YvD.LJ = byteStringLIZJ;
                c889650YvD.LJFF = Long.valueOf(micros);
                arrayList.add(c889650YvD.build());
            }
            ArrayList arrayList2 = new ArrayList(mapLJ.size());
            for (Map.Entry entry2 : mapLJ.entrySet()) {
                EnumC889750YvN enumC889750YvN = (EnumC889750YvN) entry2.getKey();
                C892030Yz3 c892030Yz3 = (C892030Yz3) entry2.getValue();
                C1496910p3Z c1496910p3Z2 = ByteString.Companion;
                ProtoAdapter<C889670YvF> protoAdapter2 = C889670YvF.ADAPTER;
                C889660YvE c889660YvE2 = new C889660YvE();
                c889660YvE2.LJ = c892030Yz3;
                ByteString byteStringLIZJ2 = C1496910p3Z.LIZJ(c1496910p3Z2, protoAdapter2.encode(c889660YvE2.build()));
                C889650YvD c889650YvD2 = new C889650YvD();
                c889650YvD2.LIZLLL = Integer.valueOf(enumC889750YvN.getValue());
                c889650YvD2.LJ = byteStringLIZJ2;
                c889650YvD2.LJFF = Long.valueOf(micros);
                arrayList2.add(c889650YvD2.build());
            }
            C0YZT c0yzt = new C0YZT();
            C1516540pZE.LIZ(arrayList);
            c0yzt.LIZLLL = arrayList;
            BizConvSettingPersistentExt bizConvSettingPersistentExtLIZIZ = c0yzt.build();
            C0YZV c0yzv = new C0YZV();
            C1516540pZE.LIZ(arrayList2);
            c0yzv.LIZLLL = arrayList2;
            return interfaceC866290XydLJIJ.LIZJ(str, bizConvSettingPersistentExtLIZIZ, c0yzv.build(), interfaceC1364105Vn);
        }
        return C865670Xxd.LIZ(-1, "IM client / conversation extension manager not available");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.EnumC889630YvB r12, java.lang.String r13, X.InterfaceC1364105Vn<? super X.C891500YyC> r14) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C889590Yv7.LIZ(X.0YvB, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.EnumC889640YvC r12, java.lang.String r13, X.InterfaceC1364105Vn<? super X.C889670YvF> r14) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C889590Yv7.LIZIZ(X.0YvC, java.lang.String, X.05Vn):java.lang.Object");
    }
}
