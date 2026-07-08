package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinEmojiTab;
import java.util.List;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Obd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C622710Obd implements InterfaceC0148002o {
    public final C0OZ5 LL;
    public final List<BulletinEmojiTab> LLILLJJLI;
    public final String LLILLL;
    public final IndexedValue<BulletinEmojiTab> LLILZ;

    public C622710Obd() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C622710Obd)) {
            return false;
        }
        C622710Obd c622710Obd = (C622710Obd) obj;
        return this.LL == c622710Obd.LL && Intrinsics.LJFF(this.LLILLJJLI, c622710Obd.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c622710Obd.LLILLL) && Intrinsics.LJFF(this.LLILZ, c622710Obd.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        String str = this.LLILLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        IndexedValue<BulletinEmojiTab> indexedValue = this.LLILZ;
        return iHashCode2 + (indexedValue != null ? indexedValue.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinEmojiDetailState(loadState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", bulletinEmojiList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", landingEmoji=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", deletedEmojiTab=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C622710Obd(int i) {
        this(C0OZ5.LOADING, C13BV.INSTANCE, null, null);
    }

    public C622710Obd(C0OZ5 c0oz5, List<BulletinEmojiTab> list, String str, IndexedValue<BulletinEmojiTab> indexedValue) {
        this.LL = c0oz5;
        this.LLILLJJLI = list;
        this.LLILLL = str;
        this.LLILZ = indexedValue;
    }

    public static C622710Obd LIZ(C622710Obd c622710Obd, C0OZ5 c0oz5, List list, String str, IndexedValue indexedValue, int i) {
        if ((i & 1) != 0) {
            c0oz5 = c622710Obd.LL;
        }
        if ((i & 2) != 0) {
            list = c622710Obd.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            str = c622710Obd.LLILLL;
        }
        if ((i & 8) != 0) {
            indexedValue = c622710Obd.LLILZ;
        }
        c622710Obd.getClass();
        return new C622710Obd(c0oz5, list, str, indexedValue);
    }
}
