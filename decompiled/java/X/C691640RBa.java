package X;

import com.ss.android.ugc.aweme.feed.adapter.ad.organiccard.OrganicCardViewHolder;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RBa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C691640RBa extends C09AY implements Function1<C0RF0, C0SZ8> {
    public C691640RBa() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0RAm] */
    @Override // kotlin.jvm.functions.Function1
    public final C0SZ8 invoke(C0RF0 c0rf0) {
        C0RF0 c0rf02 = c0rf0;
        return new OrganicCardViewHolder(c0rf02, new C0SZR<OrganicCardViewHolder, VideoItemParams>(c0rf02) { // from class: X.0RAm
            {
                super(((C0SZR) c0rf02.LJIILL).LIZ);
            }

            @Override // X.C0SZR
            public final String LIZLLL(C0OB8 c0ob8, C0RGF c0rgf, int i) {
                VideoItemParams videoItemParams = (VideoItemParams) c0ob8;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(videoItemParams);
                sbLIZ.append(", position: ");
                sbLIZ.append(i);
                sbLIZ.append(", aweme: ");
                sbLIZ.append(videoItemParams.getAweme());
                sbLIZ.append('.');
                return C2188811AlT.LIZIZ(sbLIZ);
            }
        });
    }
}
