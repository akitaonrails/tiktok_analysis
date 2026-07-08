package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiManager;
import java.util.List;

/* JADX INFO: renamed from: X.1Chs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237541Chs extends Message.Builder<CaiManager, C2237541Chs> {
    public String LIZLLL;
    public String LJ;
    public List<String> LJFF = C1516540pZE.LJIIIIZZ();
    public String LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiManager build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new CaiManager(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "owner", this.LJ, "desc");
        throw null;
    }
}
