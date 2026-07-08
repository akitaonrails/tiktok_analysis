package X;

import com.ss.android.ugc.aweme.tag.api.MentionCheckResponse;
import com.ss.android.ugc.aweme.tag.api.TagUpdateResponse;

/* JADX INFO: renamed from: X.15No, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20510615No implements InterfaceC736910SvR<C15NY> {
    public final C20510515Nn LL = new C15NY() { // from class: X.15Nn
        @Override // X.C15NY
        public final C11NZ<MentionCheckResponse> LJFF(long j) {
            return C20510415Nm.LIZJ.LJFF(j);
        }

        @Override // X.C15NY
        public final C11NZ<TagUpdateResponse> LJIIIZ(String str, String str2, long j) {
            return C20510415Nm.LIZJ.LJIIIZ(str, str2, j);
        }

        @Override // X.C15NY
        public final C11NZ<MentionCheckResponse> LJ(String str, String str2, boolean z, long j) {
            return C20510415Nm.LIZJ.LJ(str, str2, z, j);
        }
    };

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LL;
    }
}
