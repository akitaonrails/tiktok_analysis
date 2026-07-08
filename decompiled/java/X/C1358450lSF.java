package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lSF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1358450lSF extends C2217421BqW implements Function2<String, String, Boolean> {
    public C1358450lSF(C1358380lS8 c1358380lS8) {
        super(2, c1358380lS8, C1358380lS8.class, "hasRepostReply", "hasRepostReply(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Boolean;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(String str, String str2) {
        this.receiver.getClass();
        C1358510lSL c1358510lSLLJ = C1358380lS8.LJ(str);
        if (c1358510lSLLJ == null) {
            return null;
        }
        boolean z = true;
        if (str2 != null) {
            List<C1358440lSE> list = c1358510lSLLJ.LIZIZ;
            if ((list instanceof Collection) && list.isEmpty()) {
                z = false;
            } else {
                for (C1358440lSE c1358440lSE : list) {
                    if (Intrinsics.LJFF(c1358440lSE.LIZ.upvoteId, str2) && c1358440lSE.LJFF > 0) {
                        break;
                    }
                }
                z = false;
            }
            return Boolean.valueOf(z);
        }
        List<C1358440lSE> list2 = c1358510lSLLJ.LIZIZ;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            z = false;
        } else {
            Iterator<C1358440lSE> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (it2.next().LJFF > 0) {
                    break;
                }
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
