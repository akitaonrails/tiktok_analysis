package X;

import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10Ck, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@InterfaceC20647615qs("inbox_guide_user_out_push")
public final class C19207610Ck extends AbstractC20659615so<TuxPanel> {
    public final C19EG LL;
    public final UnifiedAuthPopupConfig LLILLJJLI;
    public final C19207310Ch LLILLL;
    public final C10DT LLILZ;
    public final C10DU LLILZIL;
    public long LLIZLLLIL;
    public final int LLILZLL = 500;
    public final Set<String> LLIZ = new LinkedHashSet();
    public AbstractC343940De4 LLJ = C343970De7.LIZ;

    @Override // com.bytedance.poplayer.BaseStandardPopupTask, com.bytedance.poplayer.IStandardPopupTask
    public final void LIZIZ() {
        C211000rc.LIZ("[Push-New]");
        if (Intrinsics.LJFF(this.LLILLJJLI.trigger, "dm")) {
            C813020Vuu.LJIIL().LJI(this.LL, "key_opt_dm_dialog_show", false);
        }
        this.LLIZLLLIL = System.currentTimeMillis();
        C19207810Cm.LIZ(C19207810Cm.LIZ, this.LLILLJJLI, "show_push_permission_pop_up", null, null, null, 60);
        C10DU c10du = this.LLILZIL;
        if (c10du != null) {
            c10du.LIZIZ();
        }
    }

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILZLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01bd A[LOOP:2: B:78:0x01b7->B:80:0x01bd, LOOP_END] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, X.0mKL] */
    @Override // com.bytedance.poplayer.IStandardPopupTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.C688120Qyw r11) {
        /*
            Method dump skipped, instruction units count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19207610Ck.LJII(X.0Qyw):java.lang.Object");
    }

    public C19207610Ck(C19EG c19eg, UnifiedAuthPopupConfig unifiedAuthPopupConfig, C19207310Ch c19207310Ch, C10DN c10dn, C10D4 c10d4) {
        this.LL = c19eg;
        this.LLILLJJLI = unifiedAuthPopupConfig;
        this.LLILLL = c19207310Ch;
        this.LLILZ = c10dn;
        this.LLILZIL = c10d4;
    }
}
