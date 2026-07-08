package Y;

import X.C086I;
import X.C09JN;
import X.C0S1L;
import X.C1258990irp;
import X.C1259360isQ;
import X.C1389890mGx;
import X.C1C7U;
import X.C2344809Gs;
import X.C727890Sgt;
import X.EnumC1238710iL7;
import X.InterfaceC1209130hZP;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.account.login.email.EmailPopUpFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneBindSheetFragment;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.models.NowArchiveResponse;
import com.ss.android.ugc.aweme.story.model.StoryArchDetail;
import com.ss.android.ugc.aweme.story.model.StoryArchDetailResponse;
import com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class AfS59S0110000_19 implements C09JN {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS59S0110000_19 afS59S0110000_19, Object obj) {
        C1C7U.LIZ("EmailPopUpFragment@100b.sendCode$1");
        C1389890mGx c1389890mGx = new C1389890mGx((EmailPopUpFragment) afS59S0110000_19.l0);
        c1389890mGx.LJIIJ(((EmailPopUpFragment) afS59S0110000_19.l0).getString(2131836840));
        c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
        c1389890mGx.LJII(R.attr.a0i);
        c1389890mGx.LIZ(true);
        c1389890mGx.LJIIJJI();
        if (afS59S0110000_19.z1) {
            ComplianceServiceProvider.LJIJ().LIZIZ(EnumC1238710iL7.GRANTED);
        }
        TuxSheet tuxSheet = ((EmailPopUpFragment) afS59S0110000_19.l0).LLLLLLJ;
        TuxSheet tuxSheet2 = null;
        if (tuxSheet == null) {
            tuxSheet = null;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean(((EmailPopUpFragment) afS59S0110000_19.l0).LLLLLL, true);
        tuxSheet.setArguments(bundle);
        TuxSheet tuxSheet3 = ((EmailPopUpFragment) afS59S0110000_19.l0).LLLLLLJ;
        if (tuxSheet3 != null) {
            tuxSheet2 = tuxSheet3;
        }
        tuxSheet2.dismiss();
        C1C7U.LIZIZ("EmailPopUpFragment@100b.sendCode$1");
    }

    public static final void accept$1(AfS59S0110000_19 afS59S0110000_19, Object obj) {
        DetailFragmentPanel detailFragmentPanel = (DetailFragmentPanel) afS59S0110000_19.l0;
        boolean z = afS59S0110000_19.z1;
        C0S1L c0s1l = (C0S1L) obj;
        detailFragmentPanel.getClass();
        C1C7U.LIZ("DetailFragmentPanel@5b0b.setCurrentDetailLiveModel$1L");
        if (!detailFragmentPanel.LLILLL() && detailFragmentPanel.I != null) {
            float f = 0.0f;
            if (c0s1l.LIZ != null && detailFragmentPanel.LLLLLJLJLL() != null && TextUtils.equals(c0s1l.LIZ.getAid(), detailFragmentPanel.LLLLLJLJLL().getAid()) && c0s1l.LIZIZ) {
                detailFragmentPanel.I.Tj(true);
                detailFragmentPanel.I.tR(0.0f);
            } else {
                detailFragmentPanel.I.Tj(z);
                InterfaceC1209130hZP interfaceC1209130hZP = detailFragmentPanel.I;
                if (!z) {
                    f = 1.0f;
                }
                interfaceC1209130hZP.tR(f);
            }
            C1C7U.LIZIZ("DetailFragmentPanel@5b0b.setCurrentDetailLiveModel$1L");
            return;
        }
        C1C7U.LIZIZ("DetailFragmentPanel@5b0b.setCurrentDetailLiveModel$1L");
    }

    public static final void accept$2(AfS59S0110000_19 afS59S0110000_19, Object obj) {
        C1C7U.LIZ("PhoneBindSheetFragment@3512.startSendCode$1");
        ((PhoneBindSheetFragment) afS59S0110000_19.l0).US(true, afS59S0110000_19.z1);
        C1C7U.LIZIZ("PhoneBindSheetFragment@3512.startSendCode$1");
    }

    public static final void accept$3(AfS59S0110000_19 afS59S0110000_19, Object obj) {
        AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) afS59S0110000_19.l0;
        awemeListFragmentImpl.getClass();
        C1C7U.LIZ("AwemeListFragmentImpl@a373.refreshNowArchiveEntry$2L");
        awemeListFragmentImpl.LLLFF = false;
        awemeListFragmentImpl.LLLFFI = null;
        C1C7U.LIZIZ("AwemeListFragmentImpl@a373.refreshNowArchiveEntry$2L");
    }

    public static final void accept$4(AfS59S0110000_19 afS59S0110000_19, Object obj) {
        AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) afS59S0110000_19.l0;
        boolean z = afS59S0110000_19.z1;
        FeedItemList feedItemList = (FeedItemList) obj;
        awemeListFragmentImpl.getClass();
        C1C7U.LIZ("AwemeListFragmentImpl@a373.useAwemeCache$1L");
        if (C086I.LIZIZ(feedItemList.getItems())) {
            awemeListFragmentImpl.xU("fresh_get_cached_post_empty", false, z);
        } else {
            T t = awemeListFragmentImpl.LLJJJJJIL.LL;
            Message messageObtainMessage = t.mHandler.obtainMessage(0);
            messageObtainMessage.obj = feedItemList;
            t.handleMsg(messageObtainMessage);
            awemeListFragmentImpl.p = true;
            awemeListFragmentImpl.getActivity();
            if (AwemeListFragmentImpl.wS()) {
                awemeListFragmentImpl.xU("fresh_after_get_cached_post", false, z);
            } else {
                awemeListFragmentImpl.LLJLILLLLZIIL = true;
            }
        }
        C1C7U.LIZIZ("AwemeListFragmentImpl@a373.useAwemeCache$1L");
    }

    public static final void accept$5(AfS59S0110000_19 afS59S0110000_19, Object obj) {
        AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) afS59S0110000_19.l0;
        boolean z = afS59S0110000_19.z1;
        awemeListFragmentImpl.getClass();
        C1C7U.LIZ("AwemeListFragmentImpl@a373.useAwemeCache$2L");
        awemeListFragmentImpl.xU("fresh_after_get_cached_error", false, z);
        C1C7U.LIZIZ("AwemeListFragmentImpl@a373.useAwemeCache$2L");
    }

    public static final void accept$6(AfS59S0110000_19 afS59S0110000_19, Object obj) {
        AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) afS59S0110000_19.l0;
        boolean z = afS59S0110000_19.z1;
        awemeListFragmentImpl.getClass();
        C1C7U.LIZ("AwemeListFragmentImpl@a373.refreshStoryEntry$1L");
        awemeListFragmentImpl.LLLF = false;
        StoryArchDetail detail = ((StoryArchDetailResponse) obj).getDetail();
        boolean zLLLLIILLL = awemeListFragmentImpl.LLJJJ.LLLLIILLL();
        awemeListFragmentImpl.LLJJJ.LLLLIL(detail);
        if (awemeListFragmentImpl.LLJJJ.LLLILZLLLI()) {
            if (z) {
                int i = awemeListFragmentImpl.LLLJ;
                if (i != 1 && i != 3) {
                    boolean zLLLLIILLL2 = awemeListFragmentImpl.LLJJJ.LLLLIILLL();
                    if (zLLLLIILLL) {
                        if (zLLLLIILLL2) {
                            awemeListFragmentImpl.LLJJJ.notifyItemChanged(0);
                        } else {
                            awemeListFragmentImpl.LLJJJ.notifyItemRemoved(0);
                        }
                    } else if (zLLLLIILLL2) {
                        awemeListFragmentImpl.LLJJJ.notifyItemInserted(0);
                    }
                }
            } else {
                C1258990irp c1258990irp = awemeListFragmentImpl.LLLFFI;
                if (c1258990irp != null) {
                    awemeListFragmentImpl.LLJJJIL(c1258990irp.LIZ, c1258990irp.LIZIZ);
                    awemeListFragmentImpl.LLLFFI = null;
                }
            }
        }
        C1C7U.LIZIZ("AwemeListFragmentImpl@a373.refreshStoryEntry$1L");
    }

    public static final void accept$7(AfS59S0110000_19 afS59S0110000_19, Object obj) {
        AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) afS59S0110000_19.l0;
        Throwable th = (Throwable) obj;
        awemeListFragmentImpl.getClass();
        C1C7U.LIZ("AwemeListFragmentImpl@a373.refreshStoryEntry$2L");
        C727890Sgt.LIZ.getClass();
        String strLIZLLL = C727890Sgt.LIZLLL("profile");
        if (C2344809Gs.LIZ) {
            C2344809Gs.LIZLLL(6, strLIZLLL, Log.getStackTraceString(th));
        }
        awemeListFragmentImpl.LLLF = false;
        awemeListFragmentImpl.LLLFFI = null;
        C1C7U.LIZIZ("AwemeListFragmentImpl@a373.refreshStoryEntry$2L");
    }

    public static final void accept$8(AfS59S0110000_19 afS59S0110000_19, Object obj) {
        AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) afS59S0110000_19.l0;
        boolean z = afS59S0110000_19.z1;
        awemeListFragmentImpl.getClass();
        C1C7U.LIZ("AwemeListFragmentImpl@a373.refreshNowArchiveEntry$1L");
        boolean z2 = false;
        awemeListFragmentImpl.LLLFF = false;
        List<Aweme> list = ((NowArchiveResponse) obj).data;
        boolean zLLLLIILL = awemeListFragmentImpl.LLJJJ.LLLLIILL();
        awemeListFragmentImpl.LLJJJ.LLLLIILLL();
        C1259360isQ c1259360isQ = awemeListFragmentImpl.LLJJJ;
        c1259360isQ.LLLF = list;
        if (list != null && list.size() > 0 && c1259360isQ.LLLILZ()) {
            z2 = true;
        }
        c1259360isQ.LLLI = z2;
        if (awemeListFragmentImpl.LLJJJ.LLLILZ()) {
            if (z) {
                int i = awemeListFragmentImpl.LLLJ;
                if (i != 1 && i != 3) {
                    boolean zLLLLIILL2 = awemeListFragmentImpl.LLJJJ.LLLLIILL();
                    int basicItemCount = awemeListFragmentImpl.LLJJJ.getBasicItemCount();
                    if (zLLLLIILL) {
                        if (zLLLLIILL2) {
                            awemeListFragmentImpl.LLJJJ.notifyItemChanged(basicItemCount);
                        } else {
                            awemeListFragmentImpl.LLJJJ.notifyItemRemoved(basicItemCount);
                        }
                    } else if (zLLLLIILL2) {
                        awemeListFragmentImpl.LLJJJ.notifyItemInserted(basicItemCount);
                    }
                }
            } else {
                C1258990irp c1258990irp = awemeListFragmentImpl.LLLFFI;
                if (c1258990irp != null) {
                    awemeListFragmentImpl.LLJJJIL(c1258990irp.LIZ, c1258990irp.LIZIZ);
                    awemeListFragmentImpl.LLLFFI = null;
                }
            }
        }
        C1C7U.LIZIZ("AwemeListFragmentImpl@a373.refreshNowArchiveEntry$1L");
    }

    public AfS59S0110000_19(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
