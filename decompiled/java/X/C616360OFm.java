package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OFm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C616360OFm extends AbstractC636100OxE {
    public static final C616370OFn Companion = new Object() { // from class: X.0OFn
    };
    public final transient C01GW LL;
    public transient C0ONA LLILLJJLI;
    public transient C616420OFs LLILLL;
    public final transient C01GW LLILZ = C1935107i1.LIZ(new AwS553S0100000_9(this, 3));
    public final int entranceCategory;
    public final String viewedUserId;

    @Override // X.AbstractC636100OxE, X.InterfaceC1400710mYP
    public /* bridge */ /* synthetic */ C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme, int i) {
        return C635990Ox3.LIZ(this, c1398410mUh, aweme, i);
    }

    @Override // X.AbstractC636100OxE, X.InterfaceC1400710mYP
    public /* bridge */ /* synthetic */ C1255920ims getPresenter(int i, C19EG c19eg, InterfaceC214902198i interfaceC214902198i) {
        return C635990Ox3.LIZJ(this, i, c19eg, interfaceC214902198i);
    }

    @Override // X.AbstractC636100OxE, X.InterfaceC1400710mYP
    public /* bridge */ /* synthetic */ void interceptSmartRoute(View view, int i, SmartRoute smartRoute, Aweme aweme, C1398410mUh c1398410mUh) {
        C635990Ox3.LIZLLL(this, view, i, smartRoute, aweme, c1398410mUh);
    }

    @Override // X.AbstractC636100OxE, X.InterfaceC1400710mYP
    public /* bridge */ /* synthetic */ boolean needCallHolderAttached(RecyclerView.ViewHolder viewHolder) {
        return C635990Ox3.LJ(this, viewHolder);
    }

    @Override // X.AbstractC636100OxE, X.InterfaceC1400710mYP
    public /* bridge */ /* synthetic */ void onJumpToDetail(String str) {
        C635990Ox3.LJFF(this, str);
    }

    @Override // X.AbstractC636100OxE, X.InterfaceC1400710mYP
    public boolean sendCustomRequest(C1255920ims<? extends AbstractC1255880imo<?, ?>> c1255920ims, int i) {
        return false;
    }

    public final C616350OFl getPresenter$addyours_release() {
        return (C616350OFl) this.LLILZ.getValue();
    }

    public final C0OCM getVm() {
        return (C0OCM) this.LL.getValue();
    }

    public final void updateTopic(AddYoursTopic addYoursTopic) {
        getVm().LLJ = addYoursTopic;
        C0ONA c0ona = this.LLILLJJLI;
        if (c0ona == null) {
            c0ona = null;
        }
        c0ona.d6(addYoursTopic);
    }

    @Override // X.AbstractC636100OxE
    public int getDetailAwemeViewType(int i, Aweme aweme) {
        String aid;
        String aid2 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (Intrinsics.LJFF(aid, "aid_fake_topic_header")) {
            return LSPassThroughRecordSizeConfig.DEFAULT;
        }
        if (aweme != null) {
            aid2 = aweme.getAid();
        }
        if (Intrinsics.LJFF(aid2, "aid_fake_legal_hint_footer")) {
            return 1001;
        }
        if (aweme != null && AwemeExtKt.getNewLiveRoomDataExt(aweme) != null) {
            return 1;
        }
        return 0;
    }

    @Override // X.AbstractC636100OxE, X.InterfaceC1400710mYP
    public C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme) {
        c1398410mUh.LIZ = "qa_detail";
        c1398410mUh.LIZIZ = "question_id";
        return c1398410mUh;
    }

    @Override // X.AbstractC636100OxE, X.InterfaceC1400710mYP
    public C616350OFl getPresenter(int i, C19EG c19eg) {
        return getPresenter$addyours_release();
    }

    public C616360OFm(AddYoursTopic addYoursTopic, Aweme aweme, int i, String str) {
        this.entranceCategory = i;
        this.viewedUserId = str;
        this.LL = C1935107i1.LIZ(new AwS410S0200000_9(addYoursTopic, this, 0));
    }

    @Override // X.AbstractC636100OxE
    public AbstractC1261240ivS onCreateDetailAwemeViewHolder(ViewGroup viewGroup, int i, String str, InterfaceC1260110itd interfaceC1260110itd) {
        if (i != 1000) {
            if (i != 1001) {
                return new C0OD4(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bk3, viewGroup, false), str, interfaceC1260110itd);
            }
            C616420OFs c616420OFs = this.LLILLL;
            if (c616420OFs != null) {
                return c616420OFs;
            }
            C616420OFs c616420OFs2 = new C616420OFs(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.m1, viewGroup, false), interfaceC1260110itd);
            this.LLILLL = c616420OFs2;
            return c616420OFs2;
        }
        C0ONA c0ona = this.LLILLJJLI;
        if (c0ona != null) {
            return c0ona;
        }
        C0ONA c0ona2 = new C0ONA(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.m2, viewGroup, false), getVm().LLJ, interfaceC1260110itd);
        this.LLILLJJLI = c0ona2;
        return c0ona2;
    }
}
