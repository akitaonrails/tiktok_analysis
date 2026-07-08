package X;

import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XlD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C857970XlD {
    public final CharSequence LIZ;
    public final List<AVTextExtraStruct> LIZIZ;

    public C857970XlD(CharSequence charSequence, List<AVTextExtraStruct> list) {
        this.LIZ = charSequence;
        this.LIZIZ = list;
        if (Intrinsics.LJFF(charSequence, "null")) {
            System.out.println((Object) "value is 'null', potential bug");
        }
    }
}
