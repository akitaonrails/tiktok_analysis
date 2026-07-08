package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ZGB, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZGB extends C09AY implements Function0<C0ZGJ> {
    public final /* synthetic */ IMContact LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZGB(IMContact iMContact, C19EG c19eg, String str, String str2, String str3) {
        super(0);
        this.LL = iMContact;
        this.LLILLJJLI = c19eg;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0ZGJ invoke() {
        String uid = this.LL.getUid();
        String displayName = this.LL.getDisplayName();
        C0ZGC c0zgc = new C0ZGE() { // from class: X.0ZGC
            @Override // X.C0ZGE
            public final QuoteMode LIZ(C0ZGS c0zgs) {
                return QuoteMode.None.INSTANCE;
            }
        };
        int i = this.LL instanceof IMConversation ? 3 : 0;
        final String str = this.LLILZIL;
        return new C0ZGJ(this.LLILLJJLI, this.LLILLL, uid, displayName, i, this.LLILZ, new C0ZGG() { // from class: X.0ZGD
            @Override // X.C0ZGG
            public final String LIZ(C0ZGS c0zgs) {
                return str;
            }
        }, c0zgc, null, null, false, 1792);
    }
}
