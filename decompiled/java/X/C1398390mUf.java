package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.router.SmartRoute;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0mUf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1398390mUf implements InterfaceC1400710mYP {
    public final String LL;
    public final int LLILLJJLI;
    public NewFaceStickerBean LLILLL;

    @Override // X.InterfaceC1400710mYP
    public /* bridge */ /* synthetic */ C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme, int i) {
        return C635990Ox3.LIZ(this, c1398410mUh, aweme, i);
    }

    @Override // X.InterfaceC1400710mYP
    public /* bridge */ /* synthetic */ C1255920ims getPresenter(int i, C19EG c19eg, InterfaceC214902198i interfaceC214902198i) {
        return C635990Ox3.LIZJ(this, i, c19eg, interfaceC214902198i);
    }

    @Override // X.InterfaceC1400710mYP
    public /* bridge */ /* synthetic */ void interceptSmartRoute(View view, int i, SmartRoute smartRoute, Aweme aweme, C1398410mUh c1398410mUh) {
        C635990Ox3.LIZLLL(this, view, i, smartRoute, aweme, c1398410mUh);
    }

    @Override // X.InterfaceC1400710mYP
    public /* bridge */ /* synthetic */ boolean needCallHolderAttached(RecyclerView.ViewHolder viewHolder) {
        return C635990Ox3.LJ(this, viewHolder);
    }

    @Override // X.InterfaceC1400710mYP
    public /* bridge */ /* synthetic */ void onJumpToDetail(String str) {
        C635990Ox3.LJFF(this, str);
    }

    @Override // X.InterfaceC1400710mYP
    public boolean sendCustomRequest(C1255920ims c1255920ims, int i) {
        return false;
    }

    public C1398390mUf() {
    }

    public void setFaceStickerBean(NewFaceStickerBean newFaceStickerBean) {
        this.LLILLL = newFaceStickerBean;
    }

    public C1398390mUf(String str, int i) {
        this.LL = str;
        this.LLILLJJLI = i;
    }

    @Override // X.InterfaceC1400710mYP
    public C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "prop_page");
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        c2344009Gk.LJIIIIZZ("tag_id", c1398410mUh.LIZLLL);
        c2344009Gk.LIZJ(c1398410mUh.LJFF, "rank_index");
        c2344009Gk.LJIIIIZZ("process_id", c1398410mUh.LJ);
        C20684815ws.LJIILLIIL("feed_enter", c2344009Gk.LIZ);
        int i = this.LLILLJJLI;
        if (i == 35) {
            c1398410mUh.LIZ = "from_effect_discover_tab";
        } else if (i == 36) {
            c1398410mUh.LIZ = "from_effect_discover_panel";
        } else {
            c1398410mUh.LIZ = "from_sticker";
        }
        c1398410mUh.LIZIZ = "sticker_id";
        c1398410mUh.LIZJ = "prop_page";
        return c1398410mUh;
    }

    @Override // X.InterfaceC1400710mYP
    public C1255920ims getPresenter(int i, C19EG c19eg) {
        C1255920ims c1255920ims = new C1255920ims();
        c1255920ims.LJIIJ(new C116F(this.LL, i));
        return c1255920ims;
    }

    @Override // X.InterfaceC1400710mYP
    public C1398630mV3 onCreateDetailAwemeViewHolder(final View view, final String str, final InterfaceC1260110itd interfaceC1260110itd) {
        int i = this.LLILLJJLI;
        if (i != 35 && i != 36) {
            return new C1398580mUy(view, str, interfaceC1260110itd, new C1398400mUg(this));
        }
        final int i2 = this.LLILLJJLI;
        return new C1398630mV3(view, str, interfaceC1260110itd, i2) { // from class: X.0mTw
            public final int LLJLLL;
            public final C1324800kZy LLJZ;
            public final TuxTextView LLJZIJLIL;
            public final TuxTextView LLL;

            {
                super(view, str, interfaceC1260110itd);
                this.LLJLLL = i2;
                ViewStub viewStub = (ViewStub) view.findViewById(R.id.wbg);
                viewStub.setLayoutResource(R.layout.fu0);
                View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
                C1324800kZy c1324800kZy = (C1324800kZy) viewLJLLLL.findViewById(R.id.gx9);
                this.LLJZ = c1324800kZy;
                this.LLJZIJLIL = (TuxTextView) viewLJLLLL.findViewById(R.id.gwv);
                this.LLL = (TuxTextView) viewLJLLLL.findViewById(R.id.video_posted);
                C0R06.LIZ(c1324800kZy, R.dimen.b5);
                C0R06.LIZIZ(c1324800kZy, 40);
            }

            @Override // X.C1398630mV3
            public final void b6(Aweme aweme, int i3, boolean z, Bundle bundle) {
                String str2;
                String string;
                String string2;
                String string3;
                String str3;
                UrlModel urlModel;
                List<String> urlList;
                String str4;
                super.b6(aweme, i3, z, bundle);
                if (aweme != null) {
                    NewFaceStickerBean stickerEntranceInfo = aweme.getStickerEntranceInfo();
                    if (stickerEntranceInfo != null && (urlModel = stickerEntranceInfo.iconUrl) != null && (urlList = urlModel.getUrlList()) != null && (str4 = (String) C13LP.LJJJLL(urlList)) != null) {
                        C1324750kZt.LJIIIZ(this.LLJZ, str4, -1, -1);
                    }
                    NewFaceStickerBean stickerEntranceInfo2 = aweme.getStickerEntranceInfo();
                    if (stickerEntranceInfo2 != null && (str3 = stickerEntranceInfo2.name) != null) {
                        TuxTextView tuxTextView = this.LLJZIJLIL;
                        C1360520lVa c1360520lVa = new C1360520lVa();
                        c1360520lVa.LIZ.append((CharSequence) str3);
                        tuxTextView.setText(c1360520lVa.LIZ);
                    }
                    NewFaceStickerBean stickerEntranceInfo3 = aweme.getStickerEntranceInfo();
                    if (stickerEntranceInfo3 != null) {
                        String strLIZIZ = C1843500y4a.LIZIZ(stickerEntranceInfo3.userCount);
                        TuxTextView tuxTextView2 = this.LLL;
                        C1360520lVa c1360520lVa2 = new C1360520lVa();
                        c1360520lVa2.LIZ(this.itemView.getContext().getResources(), 2131837792, strLIZIZ);
                        tuxTextView2.setText(c1360520lVa2.LIZ);
                    }
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    NewFaceStickerBean stickerEntranceInfo4 = aweme.getStickerEntranceInfo();
                    String str5 = "";
                    if (stickerEntranceInfo4 == null || (str2 = stickerEntranceInfo4.id) == null) {
                        str2 = "";
                    }
                    c2344009Gk.LJIIIIZZ("prop_id", str2);
                    c2344009Gk.LIZJ(i3 + 1, "impr_position");
                    c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
                    if (this.LLJLLL == 35) {
                        c2344009Gk.LJFF("enter_from", "prop_page_discover");
                    } else {
                        c2344009Gk.LJFF("enter_from", "video_shoot_page");
                        if (bundle == null || (string = bundle.getString("creation_id")) == null) {
                            string = "";
                        }
                        c2344009Gk.LJFF("creation_id", string);
                        if (bundle == null || (string2 = bundle.getString("shoot_way")) == null) {
                            string2 = "";
                        }
                        c2344009Gk.LJFF("shoot_way", string2);
                        if (bundle != null && (string3 = bundle.getString("shoot_tab_name")) != null) {
                            str5 = string3;
                        }
                        c2344009Gk.LJFF("shoot_tab_name", str5);
                    }
                    C20684815ws.LJIILLIIL("prop_discover_prop_show", c2344009Gk.LIZ);
                }
            }
        };
    }
}
