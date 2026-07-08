package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0jZ7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1285830jZ7 {
    public final String LIZ;
    public final Collection<String> LIZIZ;
    public final EnumC1285840jZ8 LIZJ;

    public final String toString() {
        StringBuilder sb = new StringBuilder("{type=");
        sb.append(this.LIZJ.name());
        sb.append(", value=");
        int iOrdinal = this.LIZJ.ordinal();
        if (iOrdinal == 0) {
            String str = this.LIZ;
            sb.append(str != null ? str : "");
        } else if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                sb.append((Object) "false");
            } else if (iOrdinal == 3) {
                sb.append((Object) CardStruct.IStatusCode.DEFAULT);
            } else if (iOrdinal != 4) {
                sb.append("");
            } else {
                sb.append((Object) "0.0");
            }
        } else if (this.LIZIZ != null) {
            sb.append('[');
            Collection<String> collection = this.LIZIZ;
            StringBuilder sb2 = new StringBuilder();
            Iterator<String> it2 = collection.iterator();
            if (it2.hasNext()) {
                while (true) {
                    sb2.append((CharSequence) it2.next());
                    if (!it2.hasNext()) {
                        break;
                    }
                    sb2.append((CharSequence) ", ");
                }
            }
            sb.append(sb2.toString());
            sb.append(']');
        } else {
            sb.append("[]");
        }
        sb.append("}");
        return sb.toString();
    }

    public C1285830jZ7(String str) {
        this.LIZ = str;
        this.LIZJ = EnumC1285840jZ8.STRING;
    }

    public C1285830jZ7(Collection<String> collection) {
        this.LIZIZ = collection;
        this.LIZJ = EnumC1285840jZ8.COLLECTION;
    }
}
