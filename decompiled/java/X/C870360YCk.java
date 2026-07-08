package X;

import com.bytedance.im.core.proto.MediaURLStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0YCk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C870360YCk {
    public static final Regex LIZ = new Regex("tos-[^/]+");

    public static final boolean LIZIZ(C869590Y9l c869590Y9l) {
        List<C0YC6> attachments = c869590Y9l.getAttachments();
        if (attachments == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (C0YC6 c0yc6 : attachments) {
            if (c0yc6.index < 0) {
                arrayList.add(c0yc6);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (!LIZJ((C0YC6) it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LIZJ(C0YC6 c0yc6) {
        boolean z;
        List<String> list;
        String str;
        MediaURLStruct mediaURLStruct = c0yc6.mediaUrlStruct;
        if (mediaURLStruct != null && (list = mediaURLStruct.url_list) != null && (str = (String) C13LP.LJJJLL(list)) != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public static final List<String> LIZ(List<C0YC6> list, List<C0YC6> list2) {
        ?? arrayList;
        Object next;
        if (list != null) {
            arrayList = new ArrayList();
            for (C0YC6 c0yc6 : list) {
                if (c0yc6.index < 0) {
                    arrayList.add(c0yc6);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        if (list2 != null) {
            ArrayList<C0YC6> arrayList2 = new ArrayList();
            for (C0YC6 c0yc62 : list2) {
                if (c0yc62.index < 0) {
                    arrayList2.add(c0yc62);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (C0YC6 c0yc63 : arrayList2) {
                String str = c0yc63.displayType;
                if (str != null && LIZJ(c0yc63)) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (Intrinsics.LJFF(((C0YC6) next).displayType, str)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    C0YC6 c0yc64 = (C0YC6) next;
                    if (c0yc64 == null || !LIZJ(c0yc64)) {
                        arrayList3.add(str);
                    }
                }
            }
            return arrayList3;
        }
        return C13BV.INSTANCE;
    }

    public static final String LJ(C869590Y9l c869590Y9l, String str) {
        C0YC6 next;
        MediaURLStruct mediaURLStruct;
        String str2;
        List<String> list;
        List<C0YC6> attachments = c869590Y9l.getAttachments();
        if (attachments != null) {
            Iterator<C0YC6> it2 = attachments.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    C0YC6 c0yc6 = next;
                    if (Intrinsics.LJFF(c0yc6.displayType, str) && c0yc6.index < 0) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C0YC6 c0yc62 = next;
            if (c0yc62 != null && (((mediaURLStruct = c0yc62.mediaUrlStruct) != null && (list = mediaURLStruct.url_list) != null && (str2 = (String) C13LP.LJJJLL(list)) != null && str2.length() != 0) || ((str2 = c0yc62.remoteUrl) != null && str2.length() > 0))) {
                return str2;
            }
        }
        return null;
    }

    public static final void LIZLLL(C0YEM c0yem, List<C0YC6> list, C869590Y9l c869590Y9l, int i) {
        for (String str : LIZ(list, c869590Y9l.getAttachments())) {
            int msgType = c869590Y9l.getMsgType();
            C870370YCl c870370YCl = new C870370YCl(c869590Y9l.getMsgId(), msgType, "", i, str, "msg", System.currentTimeMillis() - c869590Y9l.getLocalCreatedAt(), c869590Y9l.getSourceVregion(), System.currentTimeMillis());
            Iterator it2 = ((CopyOnWriteArraySet) c0yem.LJIIZILJ().getDomain().LIZ.LJIILIIL).iterator();
            while (it2.hasNext()) {
                ((InterfaceC870020YBc) it2.next()).LIZ(c870370YCl);
            }
            LJFF(c0yem, c870370YCl, c869590Y9l.getSender(), LJ(c869590Y9l, str));
        }
    }

    public static final void LJFF(C0YEM c0yem, C870370YCl c870370YCl, long j, String str) {
        boolean z;
        String value;
        String strValueOf;
        MatchResult matchResultFind$default;
        if (c0yem.getUid() == j) {
            z = true;
        } else {
            z = false;
        }
        if (c870370YCl.LJFF == 0) {
            C0YJ9 c0yj9 = new C0YJ9(c0yem);
            c0yj9.LIZJ("imsdk_media_content_available");
            c0yj9.LIZ(String.valueOf(c870370YCl.LIZ), "msg_type");
            c0yj9.LIZ(String.valueOf(c870370YCl.LIZIZ), "server_msg_id");
            String str2 = "";
            if (str == null) {
                str = "";
            }
            if (str.length() == 0 || (matchResultFind$default = Regex.find$default(LIZ, str, 0, 2, null)) == null || (value = matchResultFind$default.getValue()) == null) {
                value = "";
            }
            c0yj9.LIZ(value, "tos");
            c0yj9.LIZ(c870370YCl.LIZJ, "task_id");
            c0yj9.LIZ(c870370YCl.LIZLLL, "display_type");
            c0yj9.LIZ(String.valueOf(c870370YCl.LJ), "delay");
            int i = c870370YCl.LJFF;
            if (i != 0) {
                if (i != 3) {
                    strValueOf = String.valueOf(i);
                } else {
                    strValueOf = "per_user_pull";
                }
            } else {
                strValueOf = "per_user_notify";
            }
            c0yj9.LIZ(strValueOf, "msg_source");
            c0yj9.LIZ(c870370YCl.LJI, "file_source");
            c0yj9.LIZ(String.valueOf(c870370YCl.LJII), "available_time");
            c0yj9.LIZ(String.valueOf(z), "is_sender");
            String str3 = c870370YCl.LJIIIIZZ;
            if (str3 != null) {
                str2 = str3;
            }
            c0yj9.LIZ(str2, "vregion");
            c0yj9.LIZLLL();
        }
    }
}
