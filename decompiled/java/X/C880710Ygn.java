package X;

import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.List;

/* JADX INFO: renamed from: X.0Ygn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C880710Ygn extends AnonymousClass0555<List<? extends String>> {
    public static final C880710Ygn LIZJ = new C880710Ygn();
    public static final List<String> LIZLLL = C1697810uHb.LJIIJJI(FilterTabType.PRIMARY.getSerializedName(), FilterTabType.SECONDARY.getSerializedName(), FilterTabType.REQUEST.getSerializedName(), FilterTabType.UNREAD.getSerializedName(), FilterTabType.STARRED.getSerializedName());

    @Override // X.AnonymousClass0555
    public final String LIZJ() {
        return "professional_inbox_tab_simply";
    }

    @Override // X.AnonymousClass0555
    public final String LIZLLL() {
        return "ProfessionalInboxTabSimplyExperiment";
    }

    @Override // X.AnonymousClass0555
    public final C19719912Dl LJI() {
        return C13LE.LIZ(List.class);
    }

    @Override // X.AnonymousClass0555
    public final List<? extends String> LJ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        List<String> list = LIZLLL;
        List<? extends String> list2 = (List) c0c64LJIILLIIL.LJJII(List.class, list, "tt_im_creator_professional_inbox_filter_item_list", false);
        return (list2 == null || list2.isEmpty()) ? list : list2;
    }

    @Override // X.AnonymousClass0555
    public final List<? extends String> LIZIZ() {
        return LIZLLL;
    }

    @Override // X.AnonymousClass0555
    public final void LJII(AnonymousClass0556 anonymousClass0556) {
        C0C5P.LIZJ().LJIIJJI("tt_im_creator_professional_inbox_filter_item_list", anonymousClass0556);
    }
}
