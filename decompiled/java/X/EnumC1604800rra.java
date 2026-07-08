package X;

import com.ss.android.ugc.aweme.PreloadApiServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService;

/* JADX INFO: renamed from: X.0rra, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public enum EnumC1604800rra {
    POST(new InterfaceC1603080roo() { // from class: X.0rrb
        @Override // X.InterfaceC1603080roo
        public final void LIZIZ(Object[] objArr) {
            Aweme aweme = (Aweme) objArr[0];
            IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService = C584020MvQ.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preloadPostList ");
            sbLIZ.append(AwemeExtKt.getAuthorUid(aweme));
            C2188811AlT.LIZIZ(sbLIZ);
            PreloadApiServiceImpl.LIZJ().LIZ(AwemeExtKt.getAuthorUid(aweme), aweme.getAuthor().getSecUid(), C584020MvQ.LIZ(aweme.getAid(), EnumC1604800rra.POST));
        }
    }),
    PROFILE(new InterfaceC1603080roo() { // from class: X.0rrc
        @Override // X.InterfaceC1603080roo
        public final void LIZIZ(Object[] objArr) {
            Aweme aweme = (Aweme) objArr[0];
            IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService = C584020MvQ.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preloadProfile ");
            sbLIZ.append(AwemeExtKt.getAuthorUid(aweme));
            C2188811AlT.LIZIZ(sbLIZ);
            PreloadApiServiceImpl.LIZJ().LIZIZ(aweme, C584020MvQ.LIZ(aweme.getAid(), EnumC1604800rra.PROFILE));
        }
    }),
    COMMENT(new InterfaceC1603080roo() { // from class: X.0rrd
        @Override // X.InterfaceC1603080roo
        public final void LIZIZ(Object[] objArr) {
            String strJsonStringToServer;
            long commentCount;
            Aweme aweme = (Aweme) objArr[0];
            String str = (String) objArr[1];
            IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService = C584020MvQ.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preloadComment ");
            sbLIZ.append(AwemeExtKt.getAuthorUid(aweme));
            C2188811AlT.LIZIZ(sbLIZ);
            IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService2 = C584020MvQ.LIZIZ;
            if (iUnKnownOwnershipBusinessOuterService2 != null && iUnKnownOwnershipBusinessOuterService2.LJIJI()) {
                strJsonStringToServer = aweme.getCommentSuggestWordList().jsonStringToServer();
            } else {
                strJsonStringToServer = "";
            }
            if (aweme.getStatistics() != null) {
                commentCount = aweme.getStatistics().getCommentCount();
            } else {
                commentCount = 0;
            }
            if (iUnKnownOwnershipBusinessOuterService2 != null) {
                iUnKnownOwnershipBusinessOuterService2.LJJII(aweme.getAid(), C584020MvQ.LIZ(aweme.getAid(), EnumC1604800rra.COMMENT), str, strJsonStringToServer, commentCount, aweme);
            }
        }
    });

    public final InterfaceC1603080roo LL;

    public InterfaceC1603080roo getPreloader() {
        return this.LL;
    }

    public static EnumC1604800rra valueOf(String str) {
        return (EnumC1604800rra) C08FF.LIZ(EnumC1604800rra.class, str);
    }

    EnumC1604800rra(InterfaceC1603080roo interfaceC1603080roo) {
        this.LL = interfaceC1603080roo;
    }
}
