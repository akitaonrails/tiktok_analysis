package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: renamed from: X.0SUk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C722160SUk implements InterfaceC722440SVm<C0SVS> {
    public final Context LIZ;
    public final Aweme LIZIZ;
    public final String LIZJ;
    public final C722200SUo LIZLLL = new InterfaceC722470SVp<C0SVS>() { // from class: X.0SUo
        @Override // X.InterfaceC722470SVp
        public final C07XH LIZ() {
            String videoDetailNoticeBottom = AwemeExtKt.getVideoDetailNoticeBottom(this.LIZ.LIZIZ);
            if (videoDetailNoticeBottom.length() == 0) {
                C722160SUk c722160SUk = this.LIZ;
                c722160SUk.getClass();
                C2241008qG c2241008qG = new C2241008qG();
                c2241008qG.LIZ.put("type", "video_detail_notice_bottom");
                c2241008qG.LIZ.put("log_id", c722160SUk.LIZIZ.getRequestId());
                c2241008qG.LIZ.put("item_id", c722160SUk.LIZIZ.getAid());
                C794420VEi.LIZIZ("notice_content_empty", "", c2241008qG.LJ());
                videoDetailNoticeBottom = this.LIZ.LIZ.getString(2131858125);
            }
            C0SV1 c0sv1 = C0SV1.TUX;
            return new C0SVS(new C722300SUy(C1308910kAL.LIZJ(R.attr.ee, this.LIZ.LIZ), c0sv1.ordinal(), R.raw.icon_exclamation_mark_circle_fill, 4), videoDetailNoticeBottom, new C0SVT(C0SXM.COLOR.ordinal(), 0, C1308910kAL.LIZJ(R.attr.zs, this.LIZ.LIZ), 2), new C722300SUy(C1308910kAL.LIZJ(R.attr.ee, this.LIZ.LIZ), c0sv1.ordinal(), R.raw.icon_chevron_right_offset_ltr, 4), this.LIZ.LJI);
        }
    };
    public final C722360SVe LJ;
    public final C722150SUj LJFF;
    public final AwS585S0100000_6 LJI;

    @Override // X.InterfaceC722440SVm
    public final C722360SVe LIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC722440SVm
    public final Class<? extends InterfaceC722460SVo<C0SVS>> LIZIZ() {
        return C0SVQ.class;
    }

    @Override // X.InterfaceC722440SVm
    public final C0SVZ LIZJ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC722440SVm
    public final InterfaceC722470SVp<C0SVS> LJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC722440SVm
    public final InterfaceC722460SVo LIZLLL(InterfaceC722440SVm interfaceC722440SVm, C07XH c07xh) {
        return new C0SVQ(this.LIZ, (C0SVS) c07xh, interfaceC722440SVm);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0SUo] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0SUj] */
    public C722160SUk(Context context, Aweme aweme, String str, final AFwS198S0000000_11 aFwS198S0000000_11) {
        this.LIZ = context;
        this.LIZIZ = aweme;
        this.LIZJ = str;
        Pair[] pairArr = new Pair[2];
        String aid = aweme.getAid();
        pairArr[0] = new Pair("item_id", aid == null ? "" : aid);
        pairArr[1] = new Pair("enter_from", str == null ? "" : str);
        HashMap mapLJI = C2097608Jq.LJI(pairArr);
        mapLJI.putAll(C718520SGk.LIZ(aweme));
        this.LJ = new C722360SVe("feed_banner", "taken_down", mapLJI);
        this.LJFF = new C0SVZ() { // from class: X.0SUj
            @Override // X.C0SVZ
            public final void LIZIZ() {
            }

            @Override // X.C0SVZ
            public final void LIZ() {
                C722160SUk c722160SUk = this.LIZ;
                c722160SUk.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", c722160SUk.LIZJ);
                C20684815ws.LJIILLIIL("tns_takedown_banner_view", c2344009Gk.LIZ);
                aFwS198S0000000_11.invoke();
            }
        };
        this.LJI = new AwS585S0100000_6(this, 319);
    }
}
