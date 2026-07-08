package X;

import com.ss.android.ugc.aweme.IMTranslationData;
import com.ss.android.ugc.aweme.IMTranslationServiceImpl;
import com.ss.android.ugc.aweme.IMTranslationTextData;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06up, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1759706up extends C09AY implements InterfaceC1631620sYq<String, String, String, String> {
    public final /* synthetic */ IMTranslationServiceImpl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1759706up(IMTranslationServiceImpl iMTranslationServiceImpl) {
        super(3);
        this.LL = iMTranslationServiceImpl;
    }

    @Override // X.InterfaceC1631620sYq
    public final String invoke(String str, String str2, String str3) {
        IMTranslationServiceImpl iMTranslationServiceImpl;
        C869590Y9l c869590Y9lLIZ;
        IMTranslationData iMTranslationDataLJIIIIZZ;
        IMTranslationTextData next;
        String str4 = str;
        String str5 = str3;
        IMTranslationServiceImpl iMTranslationServiceImpl2 = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getCache ");
        sbLIZ.append(str4);
        sbLIZ.append(' ');
        sbLIZ.append(str5);
        C2188811AlT.LIZIZ(sbLIZ);
        iMTranslationServiceImpl2.getClass();
        if (str4 == null || (c869590Y9lLIZ = (iMTranslationServiceImpl = this.LL).LIZ(str4)) == null || (iMTranslationDataLJIIIIZZ = iMTranslationServiceImpl.LJIIIIZZ(c869590Y9lLIZ)) == null || iMTranslationDataLJIIIIZZ.translations.isEmpty()) {
            return null;
        }
        Iterator<IMTranslationTextData> it2 = iMTranslationDataLJIIIIZZ.translations.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.language, str5)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        IMTranslationTextData iMTranslationTextData = next;
        if (iMTranslationTextData == null) {
            return null;
        }
        IMTranslationServiceImpl iMTranslationServiceImpl3 = this.LL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getCache ");
        sbLIZ2.append(str4);
        sbLIZ2.append(' ');
        sbLIZ2.append(str5);
        sbLIZ2.append(", check msg cache: ");
        sbLIZ2.append(iMTranslationTextData);
        C2188811AlT.LIZIZ(sbLIZ2);
        iMTranslationServiceImpl3.getClass();
        return iMTranslationTextData.text;
    }
}
