package X;

import com.ss.android.ugc.aweme.IMTranslationServiceImpl;
import kotlin.Unit;

/* JADX INFO: renamed from: X.06un, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1759506un extends C09AY implements InterfaceC1685420txc<String, String, String, String, String, Unit> {
    public final /* synthetic */ IMTranslationServiceImpl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1759506un(IMTranslationServiceImpl iMTranslationServiceImpl) {
        super(5);
        this.LL = iMTranslationServiceImpl;
    }

    @Override // X.InterfaceC1685420txc
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, String str3, String str4, String str5) {
        String str6 = str;
        String str7 = str3;
        String str8 = str4;
        String str9 = str5;
        IMTranslationServiceImpl iMTranslationServiceImpl = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setCache ");
        sbLIZ.append(str6);
        sbLIZ.append(' ');
        sbLIZ.append(str7);
        sbLIZ.append(' ');
        sbLIZ.append(str9);
        sbLIZ.append(' ');
        sbLIZ.append(str8);
        sbLIZ.append(",  thread: ");
        sbLIZ.append(C786410Ut5.u3().getName());
        C2188811AlT.LIZIZ(sbLIZ);
        iMTranslationServiceImpl.getClass();
        IMTranslationServiceImpl iMTranslationServiceImpl2 = this.LL;
        if (str6 != null) {
            iMTranslationServiceImpl2.getClass();
            C23250099c.LIZLLL(iMTranslationServiceImpl2.LIZIZ, iMTranslationServiceImpl2.LIZ, null, new C444401oA(iMTranslationServiceImpl2, new C1759606uo(iMTranslationServiceImpl2, str6, str7, str8, str9), null), 2);
        }
        return Unit.LIZ;
    }
}
