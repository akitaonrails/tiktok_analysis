package X;

import com.squareup.wire.Message;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: renamed from: X.0ZhG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C906480ZhG extends Message.Builder<C906370Zh5, C906480ZhG> {
    public EnumC906550ZhN LIZLLL;
    public Integer LJ;
    public Integer LJFF;
    public String LJI;
    public List<String> LJII = C1516540pZE.LJIIIIZZ();
    public String LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C906370Zh5 build() {
        EnumC906550ZhN enumC906550ZhN = this.LIZLLL;
        if (enumC906550ZhN != null) {
            return new C906370Zh5(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C1516540pZE.LJII(enumC906550ZhN, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        throw null;
    }
}
