package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMALogApi;
import com.ss.android.ugc.aweme.im.service.viewmodel.ChatRoomStreakViewModel;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06Pf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1602506Pf extends C09AY implements Function1<C1603006Pk, Unit> {
    public final /* synthetic */ ChatRoomStreakViewModel LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C013C LLILZ;
    public final /* synthetic */ C1231704rr LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ DataSource LLJILJIL;
    public final /* synthetic */ boolean LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1602506Pf(ChatRoomStreakViewModel chatRoomStreakViewModel, int i, int i2, C013C c013c, C1231704rr c1231704rr, int i3, boolean z, boolean z2, boolean z3, boolean z4, String str, DataSource dataSource, boolean z5) {
        super(1);
        this.LL = chatRoomStreakViewModel;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = c013c;
        this.LLILZIL = c1231704rr;
        this.LLILZLL = i3;
        this.LLIZ = z;
        this.LLIZLLLIL = z2;
        this.LLJ = z3;
        this.LLJI = z4;
        this.LLJIJIL = str;
        this.LLJILJIL = dataSource;
        this.LLJILJILJ = z5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1603006Pk c1603006Pk) {
        Object c098200Yq;
        if (c1603006Pk.LL) {
            IMALogApi.LIZ.getClass();
            IMALogApi iMALogApiLIZ = C0Z53.LIZ();
            if (iMALogApiLIZ != null) {
                iMALogApiLIZ.LIZ(6, "Streak", "ChatRoomStreakViewModel: checkStreakUnlockAnimV2: anim is playing, skip");
            }
        } else {
            this.LL.yQ2().F(this.LLILLJJLI, this.LLILLL, this.LL.xQ2(), this.LLILZ.element);
            try {
                c098200Yq = BitmapFactory.decodeFile(this.LLJIJIL);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                C1231704rr c1231704rr = this.LLILZIL;
                C189200o6.m9toStringimpl(c098200Yq);
                c1231704rr.LIZIZ();
            } else {
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                this.LL.LL.bc(true);
                C06KD.LIZ(this.LL.xQ2(), this.LLILZLL, false, 0, this.LLIZ, this.LLILLJJLI, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLILZ.element, this.LLILLL);
                ((Boolean) C141200gM.LIZ.getValue()).booleanValue();
                this.LL.setState(new C1602606Pg(this.LLILZLL, this.LLJILJIL, this.LLILZ, this.LLILLJJLI, this.LLJILJILJ, this.LLILLL, this.LLJ, (Bitmap) c098200Yq));
            }
        }
        return Unit.LIZ;
    }
}
