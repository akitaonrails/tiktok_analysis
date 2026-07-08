package X;

import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.im.message.content.FeatureAttachmentContent;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ZFr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C896690ZFr extends C09AY implements Function0<C0ZGJ> {
    public final /* synthetic */ C869590Y9l LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C19EG LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ String LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C896690ZFr(C869590Y9l c869590Y9l, boolean z, C19EG c19eg, String str, String str2, String str3, String str4, String str5, int i, String str6) {
        super(0);
        this.LL = c869590Y9l;
        this.LLILLJJLI = z;
        this.LLILLL = c19eg;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = str5;
        this.LLJ = i;
        this.LLJI = str6;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0ZGJ invoke() {
        String strValueOf = String.valueOf(this.LL.getSender());
        if (strValueOf == null) {
            strValueOf = "";
        }
        final String str = this.LLIZ;
        C0ZGG c0zgg = new C0ZGG() { // from class: X.0ZFs
            @Override // X.C0ZGG
            public final String LIZ(C0ZGS c0zgs) {
                return str;
            }
        };
        final C869590Y9l c869590Y9l = this.LL;
        C0ZGE c0zge = new C0ZGE() { // from class: X.0ZFk
            @Override // X.C0ZGE
            public final QuoteMode LIZ(C0ZGS c0zgs) {
                C0ZDT c0zdt = C0ZDT.LIZ;
                C869590Y9l c869590Y9l2 = c869590Y9l;
                c0zdt.getClass();
                ReferenceInfo referenceInfoLJII = C0ZDT.LJII(c869590Y9l2);
                if (referenceInfoLJII != null) {
                    return new QuoteMode.Reply(referenceInfoLJII, true);
                }
                return QuoteMode.None.INSTANCE;
            }
        };
        final boolean z = this.LLILLJJLI;
        int i = z ? 3 : 0;
        final String str2 = this.LLILZLL;
        final String str3 = this.LLIZLLLIL;
        C0ZG6 c0zg6 = new C0ZG6() { // from class: X.0SeD
            @Override // X.C0ZG6
            public final Map<String, String> LIZ(C0ZGS c0zgs) {
                String str4;
                String str5 = str2;
                String str6 = str;
                boolean z2 = z;
                String str7 = str3;
                C13DA c13da = new C13DA();
                c13da.put("enter_from", str5);
                c13da.put("enter_method", str6);
                if (z2) {
                    str4 = "group";
                } else {
                    str4 = "private";
                }
                c13da.put("chat_type", str4);
                if (str7.length() > 0) {
                    c13da.put("shared_feed_type", str7);
                }
                return c13da.build();
            }
        };
        final int i2 = this.LLJ;
        final String str4 = this.LLJI;
        return new C0ZGJ(this.LLILLL, this.LLILZ, strValueOf, this.LLILZIL, i, str2, c0zgg, c0zge, c0zg6, new C0ZFV() { // from class: X.0ZFU
            @Override // X.C0ZFV
            public final C0ZFT invoke() {
                return new C0ZFT(new FeatureAttachmentContent(i2, str4, Long.valueOf(c869590Y9l.getSender()), null, null), null);
            }
        }, false, 1024);
    }
}
