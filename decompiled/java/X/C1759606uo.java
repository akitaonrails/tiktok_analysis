package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IMTranslationData;
import com.ss.android.ugc.aweme.IMTranslationServiceImpl;
import com.ss.android.ugc.aweme.IMTranslationTextData;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06uo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1759606uo extends C09AY implements Function0<Unit> {
    public final /* synthetic */ IMTranslationServiceImpl LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1759606uo(IMTranslationServiceImpl iMTranslationServiceImpl, String str, String str2, String str3, String str4) {
        super(0);
        this.LL = iMTranslationServiceImpl;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        IMTranslationData iMTranslationData;
        String strLJI;
        IMTranslationServiceImpl iMTranslationServiceImpl = this.LL;
        C869590Y9l c869590Y9lLIZ = iMTranslationServiceImpl.LIZ(this.LLILLJJLI);
        if (c869590Y9lLIZ == null || (iMTranslationData = iMTranslationServiceImpl.LJIIIIZZ(c869590Y9lLIZ)) == null) {
            iMTranslationData = new IMTranslationData(null, null, 2, null);
        }
        String str = this.LLILLL;
        if (str == null) {
            str = iMTranslationData.sourceLanguage;
        }
        List listLJLILLLLZI = C13LP.LJLILLLLZI(new IMTranslationTextData(this.LLILZ, this.LLILZIL), iMTranslationData.translations);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) listLJLILLLLZI) {
            if (hashSet.add(((IMTranslationTextData) obj).language)) {
                arrayList.add(obj);
            }
        }
        IMTranslationData iMTranslationData2 = new IMTranslationData(str, arrayList);
        C869590Y9l c869590Y9lLIZ2 = this.LL.LIZ(this.LLILLJJLI);
        if (c869590Y9lLIZ2 != null) {
            this.LL.getClass();
            try {
                C1227904rF.LIZ.getClass();
                strLJI = C1227904rF.LJI(iMTranslationData2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (strLJI == null) {
                strLJI = "";
            }
            c869590Y9lLIZ2.getLocalExt().put("im_translation_data_key", strLJI);
            if (c869590Y9lLIZ2.getMsgId() > 0) {
                C603540Nlo.LIZ(C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZIZ(), c869590Y9lLIZ2, "im_translation_data_key", new C0Y3R(strLJI), new C0Y3I("Update message translation"));
            }
        }
        return Unit.LIZ;
    }
}
