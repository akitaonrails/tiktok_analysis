package X;

import Y.ARunnableS47S0300000_14;
import android.text.TextUtils;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Y1p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C867550Y1p implements InterfaceC868920Y6w {
    public final C0YEM LIZ;

    public C867550Y1p(C0YEM c0yem) {
        this.LIZ = c0yem;
    }

    @Override // X.InterfaceC868920Y6w
    public final C0Y7K LIZ(MessageBody messageBody) throws Throwable {
        C869590Y9l c869590Y9lLJJJI;
        long j;
        try {
            C0Y9J c0y9jLIZIZ = this.LIZ.LJIIZILJ().LIZIZ().LIZIZ();
            Map<String, String> map = messageBody.ext;
            if (map.containsKey("s:server_message_id") && !TextUtils.isEmpty(map.get("s:server_message_id"))) {
                String str = map.get("s:server_message_id");
                if (str != null) {
                    j = CastLongProtector.parseLong(str);
                } else {
                    j = 0;
                }
                c869590Y9lLJJJI = c0y9jLIZIZ.LJI().LJJJ(j);
            } else {
                String str2 = "";
                if (map.containsKey("s:client_message_id") && !TextUtils.isEmpty(map.get("s:client_message_id"))) {
                    str2 = map.get("s:client_message_id");
                }
                if (TextUtils.isEmpty(str2)) {
                    c869590Y9lLJJJI = c0y9jLIZIZ.LJI().LJJJ(messageBody.server_message_id.longValue());
                } else {
                    c869590Y9lLJJJI = c0y9jLIZIZ.LJI().LJJJI(str2);
                }
            }
            if (c869590Y9lLJJJI != null) {
                HashMap map2 = new HashMap();
                if (c869590Y9lLJJJI.getExt() != null) {
                    map2.put(String.valueOf(c869590Y9lLJJJI.getMsgId()), c869590Y9lLJJJI.getExt());
                }
                c869590Y9lLJJJI.setExt(new HashMap(map));
                if (c0y9jLIZIZ.LJI().LJLJL(c869590Y9lLJJJI)) {
                    this.LIZ.LJIIZILJ().getDomain().LIZ().LJ(new ARunnableS47S0300000_14(this, c869590Y9lLJJJI, map2, 5));
                    return new C867580Y1s(null);
                }
                return new C0Y3A(EnumC868890Y6t.DB_ERROR, "update message failed", (Integer) null, 12);
            }
            return new C867580Y1s(null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LIZLLL().LJIIIZ("handle mark", e);
            return new C0Y3A(EnumC868890Y6t.CLIENT_ERROR, e.getMessage(), (Integer) null, 12);
        }
    }
}
