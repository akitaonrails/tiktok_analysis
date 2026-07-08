package X;

import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.offline.nletemplate.AutomationResult;
import com.ss.android.ugc.aweme.services.external.ui.MediaChooseResultListener;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS406S0200000_5;

/* JADX INFO: renamed from: X.0Kwm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C533900Kwm extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0L7R LL;
    public final /* synthetic */ MediaChooseResultListener LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Pair<Boolean, List<C531370Ksh>> LLILZLL;
    public final /* synthetic */ Intent LLIZ;
    public final /* synthetic */ ShortVideoContext LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ C013C LLJI;
    public final /* synthetic */ int LLJIJIL;
    public final /* synthetic */ C259800zU<C358620E4e> LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C533900Kwm(C0L7R c0l7r, MediaChooseResultListener mediaChooseResultListener, boolean z, boolean z2, boolean z3, Pair<Boolean, ? extends List<C531370Ksh>> pair, Intent intent, ShortVideoContext shortVideoContext, boolean z4, C013C c013c, int i, C259800zU<C358620E4e> c259800zU) {
        super(0);
        this.LL = c0l7r;
        this.LLILLJJLI = mediaChooseResultListener;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = z3;
        this.LLILZLL = pair;
        this.LLIZ = intent;
        this.LLIZLLLIL = shortVideoContext;
        this.LLJ = z4;
        this.LLJI = c013c;
        this.LLJIJIL = i;
        this.LLJILJIL = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String stringExtra;
        String str;
        C357450Dzr c357450Dzr = this.LL.LJIL;
        if (c357450Dzr != null) {
            c357450Dzr.cancel();
        }
        MediaChooseResultListener mediaChooseResultListener = this.LLILLJJLI;
        if (mediaChooseResultListener != null) {
            mediaChooseResultListener.onMediaChooseFail("resolve media failed");
        }
        C533100KvU.LIZ(C0L9D.HANDLE_TEMPLATE, "CutOptimizedVideoChosenHandler Fail: ");
        boolean z = true;
        if (this.LLILLL) {
            C533090KvT c533090KvT = C533090KvT.LIZIZ;
            boolean z2 = !this.LLILZ;
            boolean z3 = !this.LLILZIL;
            boolean z4 = !this.LLILZLL.getFirst().booleanValue();
            c533090KvT.getClass();
            if (c533090KvT.LJFF()) {
                StringBuilder sb = new StringBuilder();
                if (z2) {
                    sb.append("Compress Material Error");
                }
                if (z3) {
                    sb.append("Decode Template Error");
                }
                if (z4) {
                    sb.append("Download Music Error");
                } else {
                    sb.append("Unknown Error");
                }
                AutomationResult automationResult = new AutomationResult(3, sb.toString());
                c533090KvT.LIZ(C0L9D.HANDLE_ALBUM, automationResult);
                c533090KvT.LIZJ(automationResult);
            }
        }
        C383980F3s.LIZIZ(new AwS406S0200000_5(this.LL, (C0L7R) this.LLJILJIL, (C259800zU<C358620E4e>) 15));
        try {
            stringExtra = this.LLIZ.getStringExtra("shoot_way");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        C0L7R c0l7r = this.LL;
        if (stringExtra == null) {
            ShortVideoContext shortVideoContext = this.LLIZLLLIL;
            str = shortVideoContext != null ? shortVideoContext.shootWay : null;
        } else {
            str = stringExtra;
        }
        ShortVideoContext shortVideoContext2 = this.LLIZLLLIL;
        c0l7r.LJJIZ("other", str, shortVideoContext2 != null ? shortVideoContext2.enterFrom : null);
        C0L7R c0l7r2 = this.LL;
        boolean z5 = this.LLJ;
        boolean z6 = this.LLJI.element;
        int i = this.LLJIJIL;
        if (i != 24 && i != 36) {
            z = false;
        }
        C0L7R.LJJIL(c0l7r2, 2, stringExtra, false, z5, z6, z, false, 0, 64);
        return Unit.LIZ;
    }
}
