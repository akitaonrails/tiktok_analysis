package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.story.api.IStoryFollowUpPublishService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0mYO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1400700mYO extends AbstractC636100OxE {
    public static final int $stable = 8;
    public final InterfaceC1400710mYP LL;
    public final String LLILLJJLI = "tool_performance_prop_detail_pre_load_item_view_count";
    public boolean LLILLL = true;
    public transient DetailAwemeListFragment LLILZ;
    public NewFaceStickerBean faceStickerBean;

    @Override // X.AbstractC636100OxE, X.InterfaceC1400710mYP
    public /* bridge */ /* synthetic */ C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme, int i) {
        return C635990Ox3.LIZ(this, c1398410mUh, aweme, i);
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

    public final DetailAwemeListFragment getAwemeListFragment() {
        return this.LLILZ;
    }

    public C1400700mYO(InterfaceC1400710mYP interfaceC1400710mYP) {
        this.LL = interfaceC1400710mYP;
    }

    public final void setAwemeListFragment(DetailAwemeListFragment detailAwemeListFragment) {
        this.LLILZ = detailAwemeListFragment;
    }

    public final void setFaceStickerBean(NewFaceStickerBean newFaceStickerBean) {
        this.faceStickerBean = newFaceStickerBean;
    }

    @Override // X.AbstractC636100OxE
    public int getDetailAwemeViewType(int i, Aweme aweme) {
        if (C729510SjV.LJJIJIL(aweme)) {
            return 140041;
        }
        if (aweme instanceof C626500Ohk) {
            return 110002;
        }
        if (aweme instanceof C1D1F) {
            return 110004;
        }
        if (aweme instanceof C1401450mZb) {
            return 120000;
        }
        return super.getDetailAwemeViewType(i, aweme);
    }

    @Override // X.AbstractC636100OxE, X.InterfaceC1400710mYP
    public C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme) {
        return this.LL.getJumpToVideoParam(c1398410mUh, aweme);
    }

    @Override // X.AbstractC636100OxE, X.InterfaceC1400710mYP
    public C1255920ims<? extends AbstractC1255880imo<?, ?>> getPresenter(int i, C19EG c19eg) {
        return this.LL.getPresenter(i, c19eg);
    }

    @Override // X.AbstractC636100OxE, X.InterfaceC1400710mYP
    public boolean sendCustomRequest(C1255920ims<? extends AbstractC1255880imo<?, ?>> c1255920ims, int i) {
        return this.LL.sendCustomRequest(c1255920ims, i);
    }

    @Override // X.AbstractC636100OxE, X.InterfaceC1400710mYP
    public C1255920ims<? extends AbstractC1255880imo<?, ?>> getPresenter(int i, C19EG c19eg, InterfaceC214902198i interfaceC214902198i) {
        return this.LL.getPresenter(i, c19eg, interfaceC214902198i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.0mYQ] */
    @Override // X.AbstractC636100OxE
    public AbstractC1261240ivS onCreateDetailAwemeViewHolder(ViewGroup viewGroup, int i, String str, InterfaceC1260110itd interfaceC1260110itd) {
        C1398710mVB c1398710mVBLIZ;
        View viewTd;
        if (i != 110002) {
            if (i != 120000) {
                if (i != 140041) {
                    Activity activityLIZ = C1388190mED.LIZ(viewGroup.getContext());
                    if (C294100Bfs.LIZJ && activityLIZ != null) {
                        if (this.LLILLL) {
                            int iLIZIZ = C21263918Jh.LIZIZ(activityLIZ, "Prop_Sticker_detail_base_item_detail_aweme");
                            C0LAB c0lab = new C0LAB();
                            c0lab.LJ("type", this.LLILLJJLI);
                            c0lab.LIZ(0, "totaltime");
                            c0lab.LIZ(iLIZIZ, "totalstep");
                            C20684815ws.LJIILLIIL("tool_performance_operation_cost_time", c0lab.LIZ);
                            this.LLILLL = false;
                        }
                        viewTd = C21263918Jh.LIZJ(activityLIZ, "Prop_Sticker_detail_base_item_detail_aweme", new AwS565S0100000_21(viewGroup, 1306));
                    } else {
                        viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bk3, viewGroup, false);
                    }
                    return new C1398580mUy(viewTd, str, interfaceC1260110itd, new InterfaceC1398680mV8() { // from class: X.0mYS
                        @Override // X.InterfaceC1398680mV8
                        public NewFaceStickerBean get() {
                            return this.LL.faceStickerBean;
                        }
                    });
                }
                IStoryFollowUpPublishService iStoryFollowUpPublishServiceLJIILLIIL = C1618440sDa.LIZIZ.LJIILLIIL();
                if (iStoryFollowUpPublishServiceLJIILLIIL != 0 && (c1398710mVBLIZ = iStoryFollowUpPublishServiceLJIILLIIL.LIZ(viewGroup, str, interfaceC1260110itd, new InterfaceC1398680mV8() { // from class: X.0mYQ
                    @Override // X.InterfaceC1398680mV8
                    public NewFaceStickerBean get() {
                        return this.LL.faceStickerBean;
                    }
                }, this.LLILZ)) != null) {
                    return c1398710mVBLIZ;
                }
                return new C1398580mUy(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bk3, viewGroup, false), str, interfaceC1260110itd, new InterfaceC1398680mV8() { // from class: X.0mYR
                    @Override // X.InterfaceC1398680mV8
                    public NewFaceStickerBean get() {
                        return this.LL.faceStickerBean;
                    }
                });
            }
            return new C1401480mZe(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fu2, viewGroup, false), str, interfaceC1260110itd);
        }
        return new C1398070mU9(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fu5, viewGroup, false), str, interfaceC1260110itd);
    }
}
