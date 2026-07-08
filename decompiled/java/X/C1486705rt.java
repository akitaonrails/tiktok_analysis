package X;

import com.ss.android.ugc.aweme.ad.feed.service.ClickBackTimeServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05rt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1486705rt extends C09AY implements Function0<Unit> {
    public final /* synthetic */ ClickBackTimeServiceImpl LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1486705rt(ClickBackTimeServiceImpl clickBackTimeServiceImpl, Aweme aweme, String str, String str2, long j) {
        super(0);
        this.LL = clickBackTimeServiceImpl;
        this.LLILLJJLI = aweme;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AwemeRawAd awemeRawAd;
        ClickBackTimeServiceImpl clickBackTimeServiceImpl = this.LL;
        Aweme aweme = this.LLILLJJLI;
        String str = this.LLILLL;
        String str2 = this.LLILZ;
        clickBackTimeServiceImpl.getClass();
        String string = (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) ? null : Integer.valueOf(awemeRawAd.getRit()).toString();
        boolean z = false;
        if (!C1017070cZd.LJJLIIJ(aweme) || !C1487005rw.LIZ(string)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[canTrack] rejected, isAdTraffic=");
            sbLIZ.append(C1017070cZd.LJJLIIJ(aweme));
            sbLIZ.append(", rit=");
            sbLIZ.append(string);
            sbLIZ.append(", isSupportedRit=");
            sbLIZ.append(C1487005rw.LIZ(string));
            C1022620cia.LIZ("ClickBackTimeServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
        } else if (str != null && str.length() != 0 && ((ArrayList) C1486805ru.LIZIZ.getValue()).contains(str)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[canTrack] rejected, unsupported refer=");
            sbLIZ2.append(str);
            C1022620cia.LIZ("ClickBackTimeServiceImpl", C2188811AlT.LIZIZ(sbLIZ2));
        } else if (str2 == null || str2.length() == 0 || !((ArrayList) C1486905rv.LIZIZ.getValue()).contains(str2)) {
            z = true;
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("[canTrack] rejected, unsupported tag=");
            sbLIZ3.append(str2);
            C1022620cia.LIZ("ClickBackTimeServiceImpl", C2188811AlT.LIZIZ(sbLIZ3));
        }
        if (z) {
            Aweme aweme2 = this.LLILLJJLI;
            if (aweme2 != null) {
                this.LL.getClass();
                String strLIZJ = ClickBackTimeServiceImpl.LIZJ(aweme2);
                if (strLIZJ != null) {
                    C1486605rs c1486605rs = this.LL.LIZIZ.get(strLIZJ);
                    if (c1486605rs == null || this.LLILZIL - c1486605rs.LIZLLL > 1000) {
                        this.LL.LIZIZ.remove(strLIZJ);
                        LinkedHashMap<String, C1486605rs> linkedHashMap = this.LL.LIZIZ;
                        String str3 = this.LLILLL;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = this.LLILZ;
                        linkedHashMap.put(strLIZJ, new C1486605rs(this.LLILZIL, aweme2, str3, str4 != null ? str4 : ""));
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("[onClick] recorded, key=");
                        sbLIZ4.append(strLIZJ);
                        sbLIZ4.append(", refer=");
                        sbLIZ4.append(this.LLILLL);
                        sbLIZ4.append(", tag=");
                        sbLIZ4.append(this.LLILZ);
                        sbLIZ4.append(", clickTimeMs=");
                        sbLIZ4.append(this.LLILZIL);
                        sbLIZ4.append(", pendingCount=");
                        sbLIZ4.append(this.LL.LIZIZ.size());
                        C1022620cia.LIZ("ClickBackTimeServiceImpl", C2188811AlT.LIZIZ(sbLIZ4));
                    } else {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("[onClick] duplicate click skipped, key=");
                        sbLIZ5.append(strLIZJ);
                        sbLIZ5.append(", interval=");
                        sbLIZ5.append(this.LLILZIL - c1486605rs.LIZLLL);
                        sbLIZ5.append("ms");
                        C1022620cia.LIZ("ClickBackTimeServiceImpl", C2188811AlT.LIZIZ(sbLIZ5));
                    }
                }
            }
        } else {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("[onClick] skipped, canTrack=false, aid=");
            Aweme aweme3 = this.LLILLJJLI;
            sbLIZ6.append(aweme3 != null ? aweme3.getAid() : null);
            sbLIZ6.append(", refer=");
            sbLIZ6.append(this.LLILLL);
            sbLIZ6.append(", tag=");
            sbLIZ6.append(this.LLILZ);
            C1022620cia.LIZ("ClickBackTimeServiceImpl", C2188811AlT.LIZIZ(sbLIZ6));
        }
        return Unit.LIZ;
    }
}
