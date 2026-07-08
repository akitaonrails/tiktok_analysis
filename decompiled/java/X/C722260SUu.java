package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRiskModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0SUu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C722260SUu implements InterfaceC722440SVm<C722280SUw> {
    public final Context LIZ;
    public final Aweme LIZIZ;
    public final String LIZJ;
    public final C722270SUv LIZLLL = new InterfaceC722470SVp<C722280SUw>() { // from class: X.0SUv
        public final Aweme LIZ;

        @Override // X.InterfaceC722470SVp
        public final C07XH LIZ() {
            String content;
            C722300SUy c722300SUy = new C722300SUy(C1308910kAL.LIZJ(R.attr.eg, this.LIZIZ.LIZ), C0SV1.LOCAL.ordinal(), R.raw.icon_exclamation_mark_circle, 4);
            C1360520lVa c1360520lVa = new C1360520lVa();
            AwemeRiskModel awemeRiskModel = this.LIZ.getAwemeRiskModel();
            if (awemeRiskModel == null || (content = awemeRiskModel.getContent()) == null) {
                content = "";
            }
            c1360520lVa.LIZ.append((CharSequence) content);
            return new C722280SUw(c722300SUy, c1360520lVa.LIZ);
        }

        {
            this.LIZ = this.LIZIZ.LIZIZ;
        }
    };
    public final C722360SVe LJ;
    public final C722250SUt LJFF;

    @Override // X.InterfaceC722440SVm
    public final C722360SVe LIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC722440SVm
    public final Class<? extends InterfaceC722460SVo<C722280SUw>> LIZIZ() {
        return C722290SUx.class;
    }

    @Override // X.InterfaceC722440SVm
    public final C0SVZ LIZJ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC722440SVm
    public final InterfaceC722470SVp<C722280SUw> LJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC722440SVm
    public final InterfaceC722460SVo LIZLLL(InterfaceC722440SVm interfaceC722440SVm, C07XH c07xh) {
        return new C722290SUx(this.LIZ, (C722280SUw) c07xh);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0SUv] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0SUt] */
    public C722260SUu(Context context, Aweme aweme, String str) {
        this.LIZ = context;
        this.LIZIZ = aweme;
        this.LIZJ = str;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("item_id", aweme.getAid());
        pairArr[1] = new Pair("enter_from", str == null ? "" : str);
        this.LJ = new C722360SVe("feed_label", "warn", C2097608Jq.LJIIIIZZ(pairArr));
        this.LJFF = new C0SVZ() { // from class: X.0SUt
            @Override // X.C0SVZ
            public final void LIZIZ() {
            }

            @Override // X.C0SVZ
            public final void LIZ() {
                String content;
                C722260SUu c722260SUu = this.LIZ;
                Pair[] pairArr2 = new Pair[8];
                pairArr2[0] = new Pair("group_id", c722260SUu.LIZIZ.getAid());
                AwemeRiskModel awemeRiskModel = c722260SUu.LIZIZ.getAwemeRiskModel();
                if (awemeRiskModel == null || (content = awemeRiskModel.getContent()) == null) {
                    content = "";
                }
                pairArr2[1] = new Pair("content", content);
                pairArr2[2] = new Pair("tag_id", "");
                pairArr2[3] = new Pair("tag_category", "");
                pairArr2[4] = new Pair("is_clickable", CardStruct.IStatusCode.DEFAULT);
                pairArr2[5] = new Pair("container", "left_container");
                pairArr2[6] = new Pair("risk_type", "warn");
                pairArr2[7] = new Pair("enter_from", c722260SUu.LIZJ);
                C20684815ws.LJIILLIIL("info_bar_show", C2097608Jq.LJIIIIZZ(pairArr2));
            }
        };
    }
}
