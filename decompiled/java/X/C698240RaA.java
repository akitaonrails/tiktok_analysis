package X;

import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.feed.platform.componentmanager.data.FCPConfigState;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RaA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698240RaA {
    public static final /* synthetic */ int LIZ = 0;

    public static C0RKW LIZ(final C0RZZ c0rzz) {
        FCPConfigState fCPConfigStateLIZIZ;
        if (C0SVA.LIZ()) {
            C698330RaJ c698330RaJ = new C698330RaJ(c0rzz);
            String str = c0rzz.LIZ;
            String genreType = AwemeExtKt.getGenreType(c0rzz.LIZIZ);
            C701880Rg2 c701880Rg2LIZIZ = c698330RaJ.LIZIZ();
            if (c701880Rg2LIZIZ != null && (fCPConfigStateLIZIZ = c701880Rg2LIZIZ.LIZIZ()) != null && Intrinsics.LJFF(str, fCPConfigStateLIZIZ.panelScene) && Intrinsics.LJFF(genreType, fCPConfigStateLIZIZ.genreType)) {
                return c698330RaJ;
            }
        }
        if (C1111204Wg.LIZ()) {
            return new C0RKW(c0rzz) { // from class: X.0RZa
                public final C0RZZ LIZ;
                public String LIZIZ;
                public FeedComponentPriorityData LIZJ;

                @Override // X.C0RKW
                public final FeedComponentPriorityData LIZ() {
                    if (this.LIZIZ == null || !Intrinsics.LJFF(AwemeExtKt.getGenreType(this.LIZ.LIZIZ), this.LIZIZ)) {
                        this.LIZIZ = AwemeExtKt.getGenreType(this.LIZ.LIZIZ);
                        C0RZZ c0rzz2 = this.LIZ;
                        this.LIZJ = C700590Rdx.LIZ(c0rzz2.LIZ, AwemeExtKt.getGenreType(c0rzz2.LIZIZ));
                    }
                    return this.LIZJ;
                }

                {
                    this.LIZ = c0rzz;
                }
            };
        }
        return new C694560RMg(c0rzz.LIZ);
    }
}
