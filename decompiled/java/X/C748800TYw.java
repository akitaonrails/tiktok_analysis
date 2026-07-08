package X;

import Y.AfS148S0200000_12;
import Y.AfS181S0100000_12;
import com.bytedance.android.live.broadcast.api.blockword.BlockWordApi;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWord;

/* JADX INFO: renamed from: X.0TYw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C748800TYw {
    public final InterfaceC748810TYx LIZ;
    public String LIZJ;
    public boolean LIZLLL;
    public long LJFF;
    public boolean LJI;
    public final BlockWordApi LIZIZ = (BlockWordApi) C482260Ivg.LIZJ(BlockWordApi.class);
    public String LJ = "";

    public final void LIZJ() {
        BlockWordApi blockWordApi = this.LIZIZ;
        String str = this.LJ;
        str.toString();
        blockWordApi.getBlockWord(str, this.LJFF).LJIILIIL(new C0UO0()).LJJLL(new AfS181S0100000_12(this, 39), new AfS181S0100000_12(this, 40));
    }

    public C748800TYw(InterfaceC748810TYx interfaceC748810TYx) {
        this.LIZ = interfaceC748810TYx;
    }

    public final void LIZIZ(BlockWord blockWord) {
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_tns_delete_keywords");
        String str2 = this.LIZJ;
        if (str2 == null) {
            str2 = null;
        }
        c474500IjALIZ.LJIILJJIL(str2);
        c474500IjALIZ.LJJII(blockWord.content, "keyword");
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis()), "timestamp");
        if (this.LIZLLL) {
            str = "host";
        } else {
            str = "moderator";
        }
        c474500IjALIZ.LJJII(str, "modified_by");
        c474500IjALIZ.LIZ();
        BlockWordApi blockWordApi = this.LIZIZ;
        int i = blockWord.id;
        String str3 = this.LJ;
        str3.toString();
        blockWordApi.deleteBlockWord(i, str3, this.LJFF, blockWord.uniqId).LJIILIIL(new C0UO0()).LJJLL(new AfS148S0200000_12(this, blockWord, 18), new AfS181S0100000_12(this, 38));
    }

    public final void LIZ(BlockWord blockWord, boolean z) {
        String str;
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_tns_add_keywords");
        String str3 = this.LIZJ;
        if (str3 == null) {
            str3 = null;
        }
        c474500IjALIZ.LJIILJJIL(str3);
        c474500IjALIZ.LJJII(blockWord.content, "keyword");
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis()), "timestamp");
        if (this.LIZLLL) {
            str = "host";
        } else {
            str = "moderator";
        }
        c474500IjALIZ.LJJII(str, "modified_by");
        if (this.LJI) {
            if (blockWord.blockSimilarVersions == 1) {
                str2 = "on";
            } else {
                str2 = "off";
            }
            c474500IjALIZ.LJJII(str2, "toggle");
            c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "duplicate");
        }
        c474500IjALIZ.LIZ();
        this.LIZIZ.addBlockWord(blockWord.content, this.LJ, this.LJFF, blockWord.blockSimilarVersions, z).LJIILIIL(new C0UO0()).LJJLL(new AfS148S0200000_12(this, blockWord, 17), new AfS181S0100000_12(this, 37));
    }
}
