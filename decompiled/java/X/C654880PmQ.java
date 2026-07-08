package X;

import Y.ARunnableS110S0100000_10;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchCardInfo;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveList;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0PmQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C654880PmQ extends AbstractC654900PmS<SearchLiveStruct> {
    public C0PNQ LLILZLL;
    public C653660PkS LLIZ;
    public final C653970Pkx LLIZLLLIL;

    @Override // X.AbstractC683560Qra
    public final RecyclerView.ViewHolder LLLI(ViewGroup viewGroup) {
        return new C654890PmR(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eyf, viewGroup, false));
    }

    @Override // X.AbstractC683590Qrd
    public final void setData(List<SearchLiveStruct> list) {
        this.LLILZIL.LIZLLL = Integer.MIN_VALUE;
        if (list == null) {
            list = new ArrayList<>();
        }
        super.setData(list);
        C2487409ou.LIZJ(new ARunnableS110S0100000_10(this, 65));
    }

    @Override // X.AbstractC654900PmS, X.AbstractC683560Qra, X.AbstractC438050HFr
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        SearchLiveStruct searchLiveStruct;
        String str;
        String str2;
        String roomTitle;
        String roomTitle2;
        User author;
        Long lValueOf;
        Long lValueOf2;
        String uid;
        User author2;
        User author3;
        User author4;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        String strLIZ;
        User author5;
        String searchUserName;
        User author6;
        User author7;
        UrlModel avatarThumb;
        User author8;
        UrlModel avatarLarger;
        User author9;
        User author10;
        super.onBindBasicViewHolder(viewHolder, i);
        List<T> list = this.mmItems;
        if (list != 0 && (searchLiveStruct = (SearchLiveStruct) ListProtector.get(list, i)) != null) {
            C650950Pg5.Companion.getClass();
            C0PRW c0prwLIZIZ = C646000PVm.LIZIZ();
            String str3 = "";
            if (c0prwLIZIZ == null) {
                str = "";
                str2 = "";
            } else {
                str2 = c0prwLIZIZ.searchId;
                str = c0prwLIZIZ.searchKeyword;
            }
            LogPbBean logPbBean = searchLiveStruct.getLogPbBean();
            if (logPbBean == null) {
                logPbBean = new LogPbBean();
                logPbBean.setImprId("");
            }
            String imprId = logPbBean.getImprId();
            String strLJ = C584850Mwl.LIZ.LJ(imprId);
            InterfaceC644470PPp.LIZ.getClass();
            String strLIZ2 = C644460PPo.LIZ(7);
            C0PTA.LIZ.getClass();
            String strLIZ3 = C645350PSz.LIZ(7);
            C653660PkS c653660PkS = new C653660PkS();
            c653660PkS.LJIIIIZZ = "";
            int followStatus = 0;
            c653660PkS.LIZ = false;
            c653660PkS.LJIIJ = str2;
            c653660PkS.LJIIJJI = imprId;
            c653660PkS.LJIILJJIL = strLJ;
            c653660PkS.LJIILIIL = logPbBean;
            c653660PkS.LJIILL = i;
            c653660PkS.LJFF = str;
            c653660PkS.LIZJ = 7;
            c653660PkS.LIZLLL = strLIZ2;
            c653660PkS.LJ = strLIZ3;
            this.LLIZ = c653660PkS;
            if (viewHolder instanceof C654890PmR) {
                C654890PmR c654890PmR = (C654890PmR) viewHolder;
                c654890PmR.LLLIL(c653660PkS);
                InterfaceC639130P5b interfaceC639130P5b = this.LLILZ;
                if (interfaceC639130P5b != null && interfaceC639130P5b.getKeyword() != null) {
                    this.LLILZ.getKeyword();
                }
                c654890PmR.LLIZ = searchLiveStruct;
                Aweme liveAweme = searchLiveStruct.getLiveAweme();
                c654890PmR.LLIZLLLIL = liveAweme;
                if (liveAweme != null) {
                    SmartImageView smartImageView = c654890PmR.LLJ;
                    String requestId = null;
                    if (smartImageView != null) {
                        smartImageView.setOutlineProvider(new C663220Pzs((int) C654910PmT.LIZ(2.0f, c654890PmR.getContext())));
                        smartImageView.setClipToOutline(true);
                        Aweme aweme = c654890PmR.LLIZLLLIL;
                        if (aweme == null || (author10 = aweme.getAuthor()) == null || (avatarLarger = author10.roomCover) == null) {
                            Aweme aweme2 = c654890PmR.LLIZLLLIL;
                            if (aweme2 != null && (author9 = aweme2.getAuthor()) != null) {
                                avatarLarger = author9.getAvatarLarger();
                            } else {
                                avatarLarger = null;
                            }
                        }
                        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatarLarger));
                        c1331670kl3LJIIIIZZ.LJJ(c654890PmR.LLJ);
                        Context context = c654890PmR.getContext();
                        C1331750klB c1331750klB = new C1331750klB();
                        c1331750klB.LJI = new C1331920klS(C654910PmT.LIZ(2.0f, context), C654910PmT.LIZ(2.0f, context), 0.0f, 0.0f);
                        c1331750klB.LIZIZ = C654910PmT.LIZ(0.0f, context);
                        c1331670kl3LJIIIIZZ.LJJI = new C1331730kl9(c1331750klB);
                        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                    }
                    if (c654890PmR.LLJI != null) {
                        Aweme aweme3 = c654890PmR.LLIZLLLIL;
                        if (aweme3 != null && (author8 = aweme3.getAuthor()) != null) {
                            avatarThumb = author8.getAvatarThumb();
                        } else {
                            avatarThumb = null;
                        }
                        C1331670kl3 c1331670kl3LJIIIIZZ2 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatarThumb));
                        c1331670kl3LJIIIIZZ2.LJJIJ(C422830Gi1.LIZ(100));
                        c1331670kl3LJIIIIZZ2.LJJ(c654890PmR.LLJI);
                        C786410Ut5.h3(c1331670kl3LJIIIIZZ2);
                    }
                    Aweme aweme4 = c654890PmR.LLIZLLLIL;
                    if (aweme4 != null && (author7 = aweme4.getAuthor()) != null) {
                        roomTitle = author7.getRoomTitle();
                    } else {
                        roomTitle = null;
                    }
                    if (TextUtils.isEmpty(roomTitle)) {
                        TextView textView = c654890PmR.LLJIJIL;
                        if (textView != null) {
                            C786410Ut5.LLIL(textView, 8);
                        }
                    } else {
                        TextView textView2 = c654890PmR.LLJIJIL;
                        if (textView2 != null) {
                            C786410Ut5.LLIL(textView2, 0);
                        }
                        TextView textView3 = c654890PmR.LLJIJIL;
                        if (textView3 != null) {
                            Aweme aweme5 = c654890PmR.LLIZLLLIL;
                            if (aweme5 != null && (author = aweme5.getAuthor()) != null) {
                                roomTitle2 = author.getRoomTitle();
                            } else {
                                roomTitle2 = null;
                            }
                            textView3.setText(roomTitle2);
                        }
                    }
                    View view = c654890PmR.LLJILJILJ;
                    if (view != null) {
                        view.setOutlineProvider(new C663220Pzs((int) C654910PmT.LIZ(2.0f, c654890PmR.getContext())));
                        view.setClipToOutline(true);
                    }
                    TextView textView4 = c654890PmR.LLJILJIL;
                    if (textView4 != null) {
                        Aweme aweme6 = c654890PmR.LLIZLLLIL;
                        if (aweme6 != null && (author6 = aweme6.getAuthor()) != null) {
                            searchUserName = author6.getSearchUserName();
                        } else {
                            searchUserName = null;
                        }
                        textView4.setText(searchUserName);
                    }
                    Aweme liveAweme2 = searchLiveStruct.getLiveAweme();
                    C654760PmE c654760PmELIZIZ = C645940PVg.LIZIZ(c654890PmR.l3());
                    c654760PmELIZIZ.LJIIZILJ("token_type", "live_card");
                    c654760PmELIZIZ.LJJIIZ(Integer.valueOf(c654890PmR.getAdapterPosition()));
                    c654760PmELIZIZ.LJIIZILJ("is_aladdin", CardStruct.IStatusCode.DEFAULT);
                    Aweme aweme7 = c654890PmR.LLIZLLLIL;
                    if (aweme7 != null && (author5 = aweme7.getAuthor()) != null) {
                        lValueOf = Long.valueOf(C486180J4u.LIZ(author5));
                    } else {
                        lValueOf = null;
                    }
                    c654760PmELIZIZ.LJIJI("search_result_id", String.valueOf(lValueOf));
                    c654760PmELIZIZ.LJIJJ("search_result");
                    c654760PmELIZIZ.LJJJ(liveAweme2);
                    c654760PmELIZIZ.LJJJI(liveAweme2);
                    c654760PmELIZIZ.LJIILJJIL();
                    HashMap map = new HashMap();
                    ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
                    if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null && (strLIZ = interfaceC20673515v3K4.LIZ()) != null) {
                        str3 = strLIZ;
                    }
                    map.put("sdk_version", str3);
                    map.put("_param_live_platform", "live");
                    C653660PkS c653660PkSL3 = c654890PmR.l3();
                    C655840Pny c655840Pny = new C655840Pny();
                    c655840Pny.LJIIZILJ("enter_from_merge", "general_search");
                    c655840Pny.LJIIZILJ("enter_method", "live_cell_more");
                    if (liveAweme2 != null && (author4 = liveAweme2.getAuthor()) != null) {
                        lValueOf2 = Long.valueOf(C486180J4u.LIZ(author4));
                    } else {
                        lValueOf2 = null;
                    }
                    c655840Pny.LJIIZILJ("room_id", String.valueOf(lValueOf2));
                    if (liveAweme2 != null && (author3 = liveAweme2.getAuthor()) != null) {
                        uid = author3.getUid();
                    } else {
                        uid = null;
                    }
                    c655840Pny.LJIIZILJ("anchor_id", uid);
                    c655840Pny.LJIIZILJ("action_type", "click");
                    c655840Pny.LJIIZILJ("search_id", c653660PkSL3.LJIIJ);
                    c655840Pny.LJIIZILJ("search_type", c653660PkSL3.LIZLLL);
                    c655840Pny.LJIIZILJ("search_keyword", c653660PkSL3.LJFF);
                    if (liveAweme2 != null) {
                        requestId = liveAweme2.getRequestId();
                    }
                    c655840Pny.LJIIZILJ("request_id", requestId);
                    c655840Pny.LIZIZ(map);
                    Aweme aweme8 = c654890PmR.LLIZLLLIL;
                    if (aweme8 != null && (author2 = aweme8.getAuthor()) != null) {
                        followStatus = author2.getFollowStatus();
                    }
                    c655840Pny.LJJIJL(followStatus);
                    c655840Pny.LJIILJJIL();
                }
                c654890PmR.LLJILLL = this.LLIZLLLIL;
            }
            this.LLILZIL.LIZ(i, getBasicItemCount());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Pkx] */
    public C654880PmQ(SearchResultParam searchResultParam, C0P9D c0p9d, InterfaceC645400PTe interfaceC645400PTe, final InterfaceC644520PPu interfaceC644520PPu) {
        super(searchResultParam, c0p9d, interfaceC645400PTe);
        this.LLIZLLLIL = new InterfaceC654920PmU() { // from class: X.0Pkx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC654920PmU
            public final void LIZ(View view, Aweme aweme) {
                C653660PkS c653660PkS;
                C653660PkS c653660PkS2;
                String uid;
                int i;
                long j;
                User author;
                User author2;
                C654880PmQ c654880PmQ = this.LIZ;
                C0PNQ c0pnq = c654880PmQ.LLILZLL;
                if (c0pnq != null) {
                    C1603960rqE.LIZ = c0pnq;
                }
                C653660PkS c653660PkS3 = c654880PmQ.LLIZ;
                ArrayList arrayList = null;
                if (c653660PkS3 == null) {
                    c653660PkS = null;
                } else {
                    c653660PkS = c653660PkS3;
                }
                String str = c653660PkS.LJIIJ;
                if (c653660PkS3 == null) {
                    c653660PkS2 = null;
                } else {
                    c653660PkS2 = c653660PkS3;
                }
                String str2 = c653660PkS2.LJFF;
                if (c653660PkS3 == null) {
                    c653660PkS3 = null;
                }
                String str3 = c653660PkS3.LIZLLL;
                EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
                logData.search_id = str;
                logData.search_keyword = str2;
                logData.search_type = str3;
                logData.requestId = str;
                EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
                if (aweme == null || (author2 = aweme.getAuthor()) == null || (uid = author2.getUid()) == null) {
                    uid = "";
                }
                roomsData.userId = uid;
                EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
                if (aweme != null && (author = aweme.getAuthor()) != null && author.secret) {
                    i = 1;
                } else {
                    i = 0;
                }
                roomsData2.isSecret = i;
                EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
                roomsData3.enterMethod = "live_cell_more";
                roomsData3.enterFromMerge = "general_search";
                C654880PmQ c654880PmQ2 = this.LIZ;
                C653660PkS c653660PkS4 = c654880PmQ2.LLIZ;
                if (c653660PkS4 == null) {
                    c653660PkS4 = null;
                }
                C0PNQ c0pnq2 = c654880PmQ2.LLILZLL;
                if (c0pnq2 != null) {
                    j = ((SearchLiveList) c0pnq2.mData).cursor;
                } else {
                    j = 0;
                }
                List<SearchLiveStruct> data = c654880PmQ2.getData();
                if (data != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(data, 10));
                    Iterator<SearchLiveStruct> it2 = data.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().getLiveAweme());
                    }
                }
                C654590Plx c654590Plx = new C654590Plx((SearchCardInfo) null, c653660PkS4, arrayList, j, 17);
                C0Q00 c0q00 = C0Q00.LIZ;
                if (view != null) {
                    view.getContext();
                }
                InterfaceC644520PPu interfaceC644520PPu2 = interfaceC644520PPu;
                c0q00.getClass();
                C0Q00.LJ(aweme, c654590Plx, enterRoomConfig, interfaceC644520PPu2);
            }
        };
    }
}
