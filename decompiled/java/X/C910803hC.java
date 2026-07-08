package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.MaterialCollectionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.NewPayInfo;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.03hC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C910803hC extends C09AY implements Function0<Unit> {
    public final /* synthetic */ MaterialCollectionInfo LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C910203h6 LLILLL;
    public final /* synthetic */ C897703f5 LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ InterfaceC911103hF LLJ;
    public final /* synthetic */ C013C LLJI;
    public final /* synthetic */ NewPayInfo LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ Object LLJILJILJ;
    public final /* synthetic */ String LLJILLL;
    public final /* synthetic */ Object LLJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C910803hC(MaterialCollectionInfo materialCollectionInfo, long j, C910203h6 c910203h6, C897703f5 c897703f5, String str, boolean z, boolean z2, String str2, InterfaceC911103hF interfaceC911103hF, C013C c013c, NewPayInfo newPayInfo, String str3, Object obj, String str4, Object obj2) {
        super(0);
        this.LL = materialCollectionInfo;
        this.LLILLJJLI = j;
        this.LLILLL = c910203h6;
        this.LLILZ = c897703f5;
        this.LLILZIL = str;
        this.LLILZLL = z;
        this.LLIZ = z2;
        this.LLIZLLLIL = str2;
        this.LLJ = interfaceC911103hF;
        this.LLJI = c013c;
        this.LLJIJIL = newPayInfo;
        this.LLJILJIL = str3;
        this.LLJILJILJ = obj;
        this.LLJILLL = str4;
        this.LLJJ = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String str;
        C910203h6 c910203h6 = this.LLILLL;
        C897703f5 c897703f5 = this.LLILZ;
        String str2 = this.LLILZIL;
        boolean z = this.LLILZLL;
        boolean z2 = this.LLIZ;
        String str3 = this.LLIZLLLIL;
        InterfaceC911103hF interfaceC911103hF = this.LLJ;
        C013C c013c = this.LLJI;
        NewPayInfo newPayInfo = this.LLJIJIL;
        String str4 = this.LLJILJIL;
        Object obj = this.LLJILJILJ;
        String str5 = this.LLJILLL;
        Object obj2 = this.LLJJ;
        MaterialCollectionInfo materialCollectionInfo = this.LL;
        C907903gj.LJ(c910203h6, c897703f5, str2, z, z2, str3, interfaceC911103hF, c013c, newPayInfo, str4, obj, str5, obj2, (materialCollectionInfo == null || (str = materialCollectionInfo.action) == null) ? null : str.toLowerCase(Locale.ROOT), Long.valueOf(this.LLILLJJLI));
        return Unit.LIZ;
    }
}
