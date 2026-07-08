package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ogc.declaration.IDeclarationService;
import java.util.Map;
import kotlin.Pair;
import wh6.AbS502S0200000_11;

/* JADX INFO: renamed from: X.0SUe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C722100SUe implements InterfaceC722440SVm<C07XG> {
    public final Context LIZ;
    public final Aweme LIZIZ;
    public final String LIZJ;
    public final C722120SUg LIZLLL = new InterfaceC722470SVp<C07XG>() { // from class: X.0SUg
        @Override // X.InterfaceC722470SVp
        public final C07XH LIZ() {
            return new C07XG(this.LIZ.LJFF());
        }
    };
    public final C722360SVe LJ;
    public final C722130SUh LJFF;

    public final String LJFF() {
        C722080SUc c722080SUcLIZJ;
        String str;
        IDeclarationService.LIZ.getClass();
        IDeclarationService iDeclarationServiceLIZ = C708510Rqj.LIZ();
        return (iDeclarationServiceLIZ == null || iDeclarationServiceLIZ.getConsumer() == null || (c722080SUcLIZJ = C722070SUb.LIZJ(this.LIZIZ)) == null || (str = c722080SUcLIZJ.LIZ) == null) ? "" : str;
    }

    @Override // X.InterfaceC722440SVm
    public final C722360SVe LIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC722440SVm
    public final Class<? extends InterfaceC722460SVo<C07XG>> LIZIZ() {
        return C722110SUf.class;
    }

    @Override // X.InterfaceC722440SVm
    public final C0SVZ LIZJ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC722440SVm
    public final InterfaceC722470SVp<C07XG> LJ() {
        return this.LIZLLL;
    }

    public final void LJI(String str) {
        C722070SUb consumer;
        String strLIZ;
        Pair[] pairArr = new Pair[9];
        pairArr[0] = new Pair("group_id", this.LIZIZ.getAid());
        String str2 = this.LIZJ;
        if (str2 == null) {
            str2 = "";
        }
        pairArr[1] = new Pair("enter_from", str2);
        pairArr[2] = new Pair("content", LJFF());
        pairArr[3] = new Pair("is_clickable", "1");
        pairArr[4] = new Pair("container", "left_container");
        pairArr[5] = new Pair("component_key", "left_container_warning");
        pairArr[6] = new Pair("risk_type", "");
        pairArr[7] = new Pair("tag_id", "");
        pairArr[8] = new Pair("tag_category", "");
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        IDeclarationService.LIZ.getClass();
        IDeclarationService iDeclarationServiceLIZ = C708510Rqj.LIZ();
        if (iDeclarationServiceLIZ != null && (consumer = iDeclarationServiceLIZ.getConsumer()) != null && (strLIZ = consumer.LIZ(this.LIZIZ)) != null) {
            mapLJIIJ.put("content_type", strLIZ);
        }
        C20684815ws.LJIILLIIL(str, mapLJIIJ);
    }

    @Override // X.InterfaceC722440SVm
    public final InterfaceC722460SVo LIZLLL(InterfaceC722440SVm interfaceC722440SVm, C07XH c07xh) {
        C722110SUf c722110SUf = new C722110SUf(this.LIZ, (C07XG) c07xh);
        C786410Ut5.I7(new AbS502S0200000_11(c722110SUf, this, 0), c722110SUf);
        return c722110SUf;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0SUg] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0SUh] */
    public C722100SUe(Context context, Aweme aweme, String str) {
        this.LIZ = context;
        this.LIZIZ = aweme;
        this.LIZJ = str;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("item_id", aweme.getAid());
        pairArr[1] = new Pair("enter_from", str == null ? "" : str);
        this.LJ = new C722360SVe("feed_label", "date_and_location", C2097608Jq.LJIIIIZZ(pairArr));
        this.LJFF = new C0SVZ() { // from class: X.0SUh
            @Override // X.C0SVZ
            public final void LIZIZ() {
            }

            @Override // X.C0SVZ
            public final void LIZ() {
                this.LIZ.LJI("info_bar_show");
            }
        };
    }
}
