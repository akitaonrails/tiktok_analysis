package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0EQh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C364370EQh extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ C364240EPu LL;
    public final /* synthetic */ ShortVideoContext LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C364370EQh(C364240EPu c364240EPu, ShortVideoContext shortVideoContext, String str, String str2) {
        super(1);
        this.LL = c364240EPu;
        this.LLILLJJLI = shortVideoContext;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        C364240EPu c364240EPu = this.LL;
        ShortVideoContext shortVideoContext = this.LLILLJJLI;
        String str3 = this.LLILLL;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        String str5 = this.LLILZ;
        if (str5 != null) {
            str4 = str5;
        }
        c364240EPu.getClass();
        C364240EPu.LIZJ(shortVideoContext, str2, str3, str4);
        return Unit.LIZ;
    }
}
