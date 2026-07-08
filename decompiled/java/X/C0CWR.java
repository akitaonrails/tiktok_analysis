package X;

import com.bytedance.retrofit2.mime.TypedInput;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0CWR, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CWR implements InterfaceC1515510pXZ {
    public static final C0CWR LIZ = new C0CWR();

    @Override // X.InterfaceC1515510pXZ
    public final void LIZ(Exception exc, TypedInput typedInput) {
        LIZJ(this, false, null, null, null, null, 0, exc, 30);
    }

    @Override // X.InterfaceC1515510pXZ
    public final void LIZIZ(long j, Object obj, Message message, boolean z) {
        String name = null;
        boolean z2 = true;
        if (z) {
            Long lValueOf = Long.valueOf(j);
            Boolean bool = Boolean.TRUE;
            if (obj == null) {
                z2 = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z2);
            if (obj != null) {
                name = obj.getClass().getName();
            }
            LIZJ(this, true, lValueOf, bool, boolValueOf, name, null, null, 96);
            return;
        }
        Long lValueOf2 = Long.valueOf(j);
        Boolean bool2 = Boolean.FALSE;
        if (message == null) {
            z2 = false;
        }
        Boolean boolValueOf2 = Boolean.valueOf(z2);
        if (message != null) {
            name = message.getClass().getName();
        }
        LIZJ(this, true, lValueOf2, bool2, boolValueOf2, name, null, null, 96);
    }

    public static void LIZJ(C0CWR c0cwr, boolean z, Long l, Boolean bool, Boolean bool2, String str, Integer num, Exception exc, int i) {
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        if ((i & 8) != 0) {
            bool2 = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            num = null;
        }
        if ((i & 64) != 0) {
            exc = null;
        }
        c0cwr.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("success", Boolean.valueOf(z));
        if (l != null) {
            l.longValue();
            linkedHashMap.put("duration", l);
        }
        if (bool != null) {
            bool.booleanValue();
            linkedHashMap.put("useJson", bool);
        }
        if (bool2 != null) {
            bool2.booleanValue();
            linkedHashMap.put("valid", bool2);
        }
        if (str != null) {
            linkedHashMap.put("class_name", str);
        }
        if (num != null) {
            num.intValue();
            linkedHashMap.put("code", num);
        }
        if (exc != null) {
            linkedHashMap.put("exception_message", exc);
        }
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C01MU(linkedHashMap, null), 2);
    }
}
