package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ZTo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C900300ZTo {
    public static final C900300ZTo LIZ = new C900300ZTo();
    public static final String LIZIZ = String.valueOf(System.currentTimeMillis());
    public static final Keva LIZJ = Keva.getRepo("create_ai_group_shot_publish_status");
    public static final Keva LIZLLL = Keva.getRepo("join_ai_group_shot_publish_status");
    public static final Keva LJ = Keva.getRepo("join_or_create_ai_group_shot_template_id");
    public static final Keva LJFF = Keva.getRepo("join_or_create_ai_group_shot_is_group_chat");
    public static final Keva LJI = Keva.getRepo("ai_group_shot_publish_file_clear");
    public static final C1DEV LJII = C2191201ApK.LIZ();

    public static void LIZ() {
        Map<String, ?> all = LJI.getAll();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (Intrinsics.LJFF(entry.getValue(), 1)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (C2256931DVj.LIZ((String) entry2.getKey())) {
                LJI.erase((String) entry2.getKey());
            }
        }
    }

    public static Keva LIZIZ(EnumC900350ZTt enumC900350ZTt) {
        int i = C900340ZTs.LIZ[enumC900350ZTt.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return LIZLLL;
            }
            throw new C1954807lC();
        }
        return LIZJ;
    }

    public static List LJFF(String str) {
        return a0.LJJLIIIJ(str, new char[]{','}, false, 0, 6);
    }

    public static void LIZJ(String str, String str2, boolean z, boolean z2) {
        FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpi$default(FakeMsgOperatorService.class, false, false, false, 14, null);
        if (fakeMsgOperatorService != null) {
            C1684506ih c1684506ih = new C1684506ih();
            c1684506ih.LIZJ = UUID.randomUUID().toString();
            c1684506ih.LIZLLL(17);
            C0I0B.LJFF.LIZJ();
            c1684506ih.LIZJ(C894660Z7w.LIZ());
            c1684506ih.LJFF = new C900330ZTr(z, str2);
            fakeMsgOperatorService.LIZIZ(str, c1684506ih, null, null, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r17, java.lang.String r18, X.EnumC900350ZTt r19, X.InterfaceC1364105Vn<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C900300ZTo.LIZLLL(java.lang.String, java.lang.String, X.0ZTt, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.lang.String r19, java.lang.String r20, X.EnumC900350ZTt r21, java.lang.String r22, boolean r23, X.InterfaceC1364105Vn<? super kotlin.Unit> r24) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C900300ZTo.LJ(java.lang.String, java.lang.String, X.0ZTt, java.lang.String, boolean, X.05Vn):java.lang.Object");
    }
}
