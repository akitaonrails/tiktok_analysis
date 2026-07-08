package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0nHi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1428800nHi extends C09AY implements InterfaceC2280171EMt<String, String, Long, String, String, String, String, Unit> {
    public final /* synthetic */ C1428780nHg LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C09AJ<C1428790nHh> LLILLL;
    public final /* synthetic */ C11RK<C0L7F> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1428800nHi(C1428780nHg c1428780nHg, String str, C19482611Ke c19482611Ke, C11RK c11rk) {
        super(7);
        this.LL = c1428780nHg;
        this.LLILLJJLI = str;
        this.LLILLL = c19482611Ke;
        this.LLILZ = c11rk;
    }

    @Override // X.InterfaceC2280171EMt
    public final Unit yc(String str, String str2, Long l, String str3, String str4, String str5, String str6) {
        String str7 = str;
        String str8 = str2;
        String str9 = str6;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Request AutoCut template detail success: templateUrl = ");
        sbLIZ.append(str7);
        sbLIZ.append(", md5 = ");
        sbLIZ.append(str8);
        sbLIZ.append(", musicId: ");
        sbLIZ.append(str9);
        C0LCY.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        this.LL.LIZ(str7, str8, this.LLILLJJLI, l.longValue(), str3, str4, str5, str9, this.LLILLL, this.LLILZ);
        return Unit.LIZ;
    }
}
