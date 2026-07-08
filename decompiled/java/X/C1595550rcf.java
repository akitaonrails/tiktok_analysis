package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rcf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1595550rcf {
    public final InterfaceC1595510rcb LIZ;
    public final List<UrlModel> LIZIZ;
    public final List<InterfaceC1600660rku> LIZJ;
    public final List<User> LIZLLL;
    public final HashMap<String, List<String>> LJ;
    public final String LJFF;
    public final String LJI;
    public final C1595630rcn LJII;
    public final int LJIIIIZZ;
    public final List<EnumC1609560rzG> LJIIIZ;

    public C1595550rcf() {
        this(0, 1023);
    }

    public final boolean LIZ(Integer num) {
        int i = this.LJIIIIZZ;
        if (num != null && i == num.intValue()) {
            return true;
        }
        return false;
    }

    public final boolean LIZIZ(C1595550rcf c1595550rcf) {
        if (c1595550rcf == null) {
            return false;
        }
        List<User> list = this.LIZLLL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (User user : list) {
            arrayList.add(new Pair(user.getUid(), user.getAvatarThumb().getUri()));
        }
        List<User> list2 = c1595550rcf.LIZLLL;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        for (User user2 : list2) {
            arrayList2.add(new Pair(user2.getUid(), user2.getAvatarThumb().getUri()));
        }
        return Intrinsics.LJFF(arrayList, arrayList2);
    }

    public C1595550rcf(int i, int i2) {
        C13BV c13bv;
        C13BV c13bv2;
        C13BV c13bv3;
        HashMap map;
        String str;
        C1595630rcn c1595630rcn;
        C13BV c13bv4;
        int i3 = i;
        if ((i2 & 2) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        if ((i2 & 4) != 0) {
            c13bv2 = C13BV.INSTANCE;
        } else {
            c13bv2 = null;
        }
        if ((i2 & 8) != 0) {
            c13bv3 = C13BV.INSTANCE;
        } else {
            c13bv3 = null;
        }
        if ((i2 & 16) != 0) {
            map = new HashMap();
        } else {
            map = null;
        }
        if ((i2 & 32) != 0) {
            str = "";
        } else {
            str = null;
        }
        if ((i2 & 128) != 0) {
            c1595630rcn = new C1595630rcn(false, 0, null, false, 255);
        } else {
            c1595630rcn = null;
        }
        i3 = (i2 & 256) != 0 ? -1 : i3;
        if ((i2 & 512) != 0) {
            c13bv4 = C13BV.INSTANCE;
        } else {
            c13bv4 = null;
        }
        this(null, c13bv, c13bv2, c13bv3, map, str, null, c1595630rcn, i3, c13bv4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1595550rcf(InterfaceC1595510rcb interfaceC1595510rcb, List<? extends UrlModel> list, List<? extends InterfaceC1600660rku> list2, List<? extends User> list3, HashMap<String, List<String>> map, String str, String str2, C1595630rcn c1595630rcn, int i, List<? extends EnumC1609560rzG> list4) {
        this.LIZ = interfaceC1595510rcb;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = list3;
        this.LJ = map;
        this.LJFF = str;
        this.LJI = str2;
        this.LJII = c1595630rcn;
        this.LJIIIIZZ = i;
        this.LJIIIZ = list4;
    }
}
