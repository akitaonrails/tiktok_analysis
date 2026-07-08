package X;

import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZEo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C896400ZEo {
    public static final String LIZLLL(C869590Y9l c869590Y9l) {
        return c869590Y9l.getLocalExt().get("local_ext_paired_msg_id");
    }

    public static final String LJ(BaseTemplate baseTemplate) {
        return baseTemplate.rj().queryData.extras.get("paired_msg_id");
    }

    public static final boolean LJFF(C869590Y9l c869590Y9l) {
        if (c869590Y9l.getMsgType() != 1802 && c869590Y9l.getMsgType() != 1803 && c869590Y9l.getMsgType() != 1818) {
            return false;
        }
        return true;
    }

    public static final boolean LJI(C869590Y9l c869590Y9l) {
        if (c869590Y9l == null) {
            return false;
        }
        if (!Intrinsics.LJFF(c869590Y9l.getScene(), "photo_swap_ping") && !Intrinsics.LJFF(c869590Y9l.getScene(), "photo_swap_pong")) {
            return false;
        }
        return true;
    }

    public static final boolean LJII(C869590Y9l c869590Y9l) {
        return Intrinsics.LJFF(c869590Y9l.getLocalExt().get("local_ext_is_swaped_photo_failed"), "1");
    }

    public static final boolean LJIIIIZZ(C869590Y9l c869590Y9l) {
        if (c869590Y9l == null) {
            return false;
        }
        return Intrinsics.LJFF(c869590Y9l.getScene(), "photo_swap_ping");
    }

    public static final boolean LJIIIZ(C869590Y9l c869590Y9l) {
        if (c869590Y9l == null) {
            return false;
        }
        return Intrinsics.LJFF(c869590Y9l.getScene(), "photo_swap_pong");
    }

    public static final boolean LJIIJ(C869590Y9l c869590Y9l) {
        if (c869590Y9l == null || c869590Y9l.getMsgType() != 1818) {
            return false;
        }
        return true;
    }

    public static final List<String> LIZ(String str, ImageComponent imageComponent, ImageComponent imageComponent2, List<String> list) {
        List<String> listLIZ;
        List<String> listLIZ2 = null;
        if (imageComponent != null) {
            listLIZ = C2244081CsQ.LIZ(imageComponent);
        } else {
            listLIZ = null;
        }
        if (imageComponent2 != null) {
            listLIZ2 = C2244081CsQ.LIZ(imageComponent2);
        }
        return LIZIZ(str, listLIZ, listLIZ2, list);
    }

    public static final List<String> LIZIZ(String str, List<String> list, List<String> list2, List<String> list3) {
        if (list2 == null) {
            list2 = C13BV.INSTANCE;
        }
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        if (str == null) {
            str = "";
        }
        c13dvLIZIZ.add(str);
        if (list3 != null) {
            c13dvLIZIZ.addAll(list3);
        }
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        c13dvLIZIZ.addAll(list);
        c13dvLIZIZ.addAll(list2);
        List listLIZ = C1697820uHc.LIZ(c13dvLIZIZ);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLIZ) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
