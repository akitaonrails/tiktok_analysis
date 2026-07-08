package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.playbooklist.PlaybookFavoritesListV2Dialog;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14no, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20373814no extends C09AY implements Function0<C20373714nn> {
    public final /* synthetic */ PlaybookFavoritesListV2Dialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20373814no(PlaybookFavoritesListV2Dialog playbookFavoritesListV2Dialog) {
        super(0);
        this.LL = playbookFavoritesListV2Dialog;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.14nn] */
    @Override // kotlin.jvm.functions.Function0
    public final C20373714nn invoke() {
        final PlaybookFavoritesListV2Dialog playbookFavoritesListV2Dialog = this.LL;
        return new AbstractC712240Rwk() { // from class: X.14nn
            @Override // X.AbstractC712240Rwk
            public final void onPageSelected(int i) {
                C1203130hPj c1203130hPj;
                PlaybookFavoritesListV2Dialog playbookFavoritesListV2Dialog2 = playbookFavoritesListV2Dialog;
                if (playbookFavoritesListV2Dialog2.LLLIIII != i && (c1203130hPj = playbookFavoritesListV2Dialog2.LLLII) != null) {
                    c1203130hPj.LIZ(i, true, C1203200hPq.LIZ);
                }
            }
        };
    }
}
