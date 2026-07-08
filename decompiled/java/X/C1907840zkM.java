package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zkM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1907840zkM {
    public static List LIZ(BaseNotice baseNotice) {
        if (baseNotice == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        int i = baseNotice.type;
        if (i != 6) {
            if (i != 212) {
                if (i != 215) {
                    if (i != 218) {
                        if (i == 254) {
                            arrayList.add(C1907850zkN.LJIIJJI.getValue());
                        }
                    } else {
                        arrayList.add(C1907850zkN.LJIIJ.getValue());
                    }
                } else {
                    arrayList.add(C1907850zkN.LJIIIZ.getValue());
                }
            } else {
                arrayList.add(C1907850zkN.LJIIIIZZ.getValue());
            }
        } else {
            arrayList.add(C1907850zkN.LJII.getValue());
        }
        if (Intrinsics.LJFF(baseNotice.getTemplateId(), "Tpl_TikTok_8177")) {
            arrayList.add(C1907850zkN.LJIIL.getValue());
        }
        return arrayList;
    }
}
