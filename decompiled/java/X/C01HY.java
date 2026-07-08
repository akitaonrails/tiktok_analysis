package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.liveinteract.multilive.model.FanTicketRanklistResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.01HY, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01HY extends ConstraintLayout {
    public C16F5 LL;
    public C16F5 LLILLJJLI;
    public ImageView LLILLL;
    public C16F5 LLILZ;
    public C16F5 LLILZIL;
    public View LLILZLL;
    public DataChannel LLIZ;
    public InterfaceC307401Hc LLIZLLLIL;
    public C01HX LLJ;
    public final String LLJI;

    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String getRankDecText() {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01HY.getRankDecText():java.lang.String");
    }

    private final int getTargetRank() {
        List<FanTicketRanklistResponse.RanklistUser> list;
        List<FanTicketRanklistResponse.RanklistUser> list2;
        FanTicketRanklistResponse.RanklistUser ranklistUser;
        C01HX c01hx = this.LLJ;
        Long lValueOf = (c01hx == null || (list2 = c01hx.LIZLLL) == null || (ranklistUser = (FanTicketRanklistResponse.RanklistUser) C13LP.LJJLIIIJJI(list2)) == null) ? null : Long.valueOf(ranklistUser.score);
        C01HX c01hx2 = this.LLJ;
        int i = 0;
        if (c01hx2 != null && (list = c01hx2.LIZLLL) != null) {
            Iterator<FanTicketRanklistResponse.RanklistUser> it2 = list.iterator();
            i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                }
                long j = it2.next().score;
                if (lValueOf != null && j == lValueOf.longValue()) {
                    break;
                }
                i++;
            }
        }
        return i + 1;
    }

    public C01HY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJI = "99+";
        ViewGroup.inflate(getContext(), R.layout.hcn, this);
        this.LL = (C16F5) findViewById(R.id.z_c);
        this.LLILLJJLI = (C16F5) findViewById(R.id.z_b);
        this.LLILLL = (ImageView) findViewById(R.id.l9d);
        this.LLILZ = (C16F5) findViewById(R.id.z_a);
        this.LLILZIL = (C16F5) findViewById(R.id.z__);
        this.LLILZLL = findViewById(R.id.cn8);
        findViewById(R.id.user_info_layout);
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0(com.bytedance.ies.sdk.datachannel.DataChannel r13, X.InterfaceC307401Hc r14, X.C01HX r15) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01HY.e0(com.bytedance.ies.sdk.datachannel.DataChannel, X.01Hc, X.01HX):void");
    }
}
