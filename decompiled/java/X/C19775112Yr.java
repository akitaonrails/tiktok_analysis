package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.sticker.livecountdown.CountDownStickerDetailResponse;
import com.ss.android.ugc.aweme.shortvideo.sticker.livecountdown.CountDownStickerResponse;
import com.ss.android.ugc.aweme.shortvideo.sticker.livecountdown.FeedCountStickerDialogFragment;
import com.ss.android.ugc.aweme.shortvideo.sticker.poll.PollDetailResponse;
import com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12Yr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19775112Yr implements InterfaceC626120Oh8 {
    public final int $t;
    public Object l0;

    public static final void onComplete$0(C19775112Yr c19775112Yr) {
    }

    public static final void onComplete$2(C19775112Yr c19775112Yr) {
    }

    public static final void onComplete$3(C19775112Yr c19775112Yr) {
    }

    public static final void onComplete$4(C19775112Yr c19775112Yr) {
    }

    public static final void onError$2(C19775112Yr c19775112Yr, Throwable th) {
    }

    public static final void onError$4(C19775112Yr c19775112Yr, Throwable th) {
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        switch (this.$t) {
            case 0:
                onComplete$0(this);
                break;
            case 1:
                onComplete$1(this);
                break;
            case 2:
                onComplete$2(this);
                break;
            case 3:
                onComplete$3(this);
                break;
            case 4:
                onComplete$4(this);
                break;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        switch (this.$t) {
            case 0:
                onError$0(this, th);
                break;
            case 1:
                onError$1(this, th);
                break;
            case 2:
                onError$2(this, th);
                break;
            case 3:
                onError$3(this, th);
                break;
            case 4:
                onError$4(this, th);
                break;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(Object obj) {
        switch (this.$t) {
            case 0:
                onNext$0(this, obj);
                break;
            case 1:
                onNext$1(this, obj);
                break;
            case 2:
                onNext$2(this, obj);
                break;
            case 3:
                onNext$3(this, obj);
                break;
            case 4:
                onNext$4(this, obj);
                break;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        switch (this.$t) {
            case 0:
                onSubscribe$0(this, interfaceC420801kM);
                break;
            case 1:
                onSubscribe$1(this, interfaceC420801kM);
                break;
            case 2:
                onSubscribe$2(this, interfaceC420801kM);
                break;
            case 3:
                onSubscribe$3(this, interfaceC420801kM);
                break;
            case 4:
                onSubscribe$4(this, interfaceC420801kM);
                break;
        }
    }

    public static final void onComplete$1(C19775112Yr c19775112Yr) {
        DialogC1389620mGW dialogC1389620mGW = ((FeedCountStickerDialogFragment) c19775112Yr.l0).LLJI;
        if (dialogC1389620mGW != null) {
            dialogC1389620mGW.dismiss();
            C785410UrT.LIZ(dialogC1389620mGW);
        }
    }

    public C19775112Yr(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onError$0(C19775112Yr c19775112Yr, Throwable th) {
        if (th instanceof C1494450ozb) {
            C1389890mGx c1389890mGx = new C1389890mGx((FeedCountStickerDialogFragment) c19775112Yr.l0);
            c1389890mGx.LJIIIZ(R.string.m25);
            c1389890mGx.LJIIJJI();
        }
    }

    public static final void onError$1(C19775112Yr c19775112Yr, Throwable th) {
        if (th instanceof C1494450ozb) {
            C1389890mGx c1389890mGx = new C1389890mGx((FeedCountStickerDialogFragment) c19775112Yr.l0);
            c1389890mGx.LJIIIZ(R.string.m25);
            c1389890mGx.LJIIJJI();
        }
        DialogC1389620mGW dialogC1389620mGW = ((FeedCountStickerDialogFragment) c19775112Yr.l0).LLJI;
        if (dialogC1389620mGW != null) {
            dialogC1389620mGW.dismiss();
            C785410UrT.LIZ(dialogC1389620mGW);
        }
    }

    public static final void onError$3(C19775112Yr c19775112Yr, Throwable th) {
        ((C19632311rV) c19775112Yr.l0).LIZ.Uq2(new Exception(th));
    }

    public static final void onNext$0(C19775112Yr c19775112Yr, Object obj) {
        int i;
        CountDownStickerDetailResponse countDownStickerDetailResponse = (CountDownStickerDetailResponse) obj;
        if (((FeedCountStickerDialogFragment) c19775112Yr.l0).isAdded()) {
            CountDownStickerStruct countDownStickerStruct = ((FeedCountStickerDialogFragment) c19775112Yr.l0).LL;
            if (countDownStickerStruct != null) {
                countDownStickerStruct.setSubscribeNum(countDownStickerDetailResponse.stickerDetail.getSubscribeNum());
                countDownStickerStruct.setSubscribe(countDownStickerDetailResponse.stickerDetail.getSubscribe());
            }
            if (((FeedCountStickerDialogFragment) c19775112Yr.l0).LLJILLL) {
                String strLIZIZ = C1843500y4a.LIZIZ(countDownStickerDetailResponse.stickerDetail.getSubscribeNum());
                Resources resources = ((FeedCountStickerDialogFragment) c19775112Yr.l0).getResources();
                if (System.currentTimeMillis() > countDownStickerDetailResponse.stickerDetail.getMillSecond()) {
                    i = 2131755170;
                } else {
                    i = 2131755215;
                }
                String quantityString = resources.getQuantityString(i, (int) countDownStickerDetailResponse.stickerDetail.getSubscribeNum());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("<b>");
                sbLIZ.append(strLIZIZ);
                sbLIZ.append("</b>");
                String strJ4 = C786410Ut5.j4(quantityString, Arrays.copyOf(new Object[]{C2188811AlT.LIZIZ(sbLIZ)}, 1));
                TuxTextView tuxTextView = ((FeedCountStickerDialogFragment) c19775112Yr.l0).LLILZLL;
                if (tuxTextView != null) {
                    tuxTextView.setText(Html.fromHtml(strJ4));
                    return;
                }
                return;
            }
            if (System.currentTimeMillis() > countDownStickerDetailResponse.stickerDetail.getMillSecond()) {
                ((FeedCountStickerDialogFragment) c19775112Yr.l0).RR(C19643611tK.LIZ, false);
            } else if (Intrinsics.LJFF(countDownStickerDetailResponse.stickerDetail.getSubscribe(), Boolean.TRUE)) {
                ((FeedCountStickerDialogFragment) c19775112Yr.l0).RR(C19643811tM.LIZ, false);
            } else {
                ((FeedCountStickerDialogFragment) c19775112Yr.l0).RR(C19643711tL.LIZ, false);
            }
        }
    }

    public static final void onNext$1(C19775112Yr c19775112Yr, Object obj) {
        CountDownStickerResponse countDownStickerResponse = (CountDownStickerResponse) obj;
        DialogC1389620mGW dialogC1389620mGW = ((FeedCountStickerDialogFragment) c19775112Yr.l0).LLJI;
        if (dialogC1389620mGW != null) {
            dialogC1389620mGW.dismiss();
            C785410UrT.LIZ(dialogC1389620mGW);
        }
        if (countDownStickerResponse.subscribeState) {
            ((FeedCountStickerDialogFragment) c19775112Yr.l0).RR(C19643811tM.LIZ, false);
            C1389890mGx c1389890mGx = new C1389890mGx((FeedCountStickerDialogFragment) c19775112Yr.l0);
            c1389890mGx.LJIIJ(((FeedCountStickerDialogFragment) c19775112Yr.l0).getResources().getString(2131829571));
            c1389890mGx.LJIIJJI();
            return;
        }
        ((FeedCountStickerDialogFragment) c19775112Yr.l0).RR(C19643711tL.LIZ, false);
        C1389890mGx c1389890mGx2 = new C1389890mGx((FeedCountStickerDialogFragment) c19775112Yr.l0);
        c1389890mGx2.LJIIJ(((FeedCountStickerDialogFragment) c19775112Yr.l0).getResources().getString(2131829570));
        c1389890mGx2.LJIIJJI();
    }

    public static final void onNext$3(C19775112Yr c19775112Yr, Object obj) {
        ArrayList arrayList;
        PollDetailResponse pollDetailResponse = (PollDetailResponse) obj;
        ((C19632311rV) c19775112Yr.l0).LJFF = new C19633011rc(pollDetailResponse.getOffset(), pollDetailResponse.getHasMore());
        if (C086I.LIZIZ(pollDetailResponse.getUsers())) {
            ((C19632311rV) c19775112Yr.l0).LIZ.Ng1();
            return;
        }
        ((C19632311rV) c19775112Yr.l0).LIZ.LLJJJIL(pollDetailResponse.getUsers(), pollDetailResponse.getHasMore());
        C19632311rV c19632311rV = (C19632311rV) c19775112Yr.l0;
        if (pollDetailResponse.getUsers() == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(pollDetailResponse.getUsers());
        }
        c19632311rV.LIZ(arrayList, ((C19632311rV) c19775112Yr.l0).LJFF, false);
    }

    public static final void onNext$4(C19775112Yr c19775112Yr, Object obj) {
        ((C111Q) c19775112Yr.l0).LLIZ = (InterfaceC2257101DWa) obj;
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).getCurrentUserData().postValue(((C111Q) c19775112Yr.l0).LLIZ);
    }

    public static final void onSubscribe$0(C19775112Yr c19775112Yr, InterfaceC420801kM interfaceC420801kM) {
        FeedCountStickerDialogFragment feedCountStickerDialogFragment = (FeedCountStickerDialogFragment) c19775112Yr.l0;
        if (feedCountStickerDialogFragment.LLJ == null) {
            feedCountStickerDialogFragment.LLJ = new C11NJ();
        }
        C11NJ c11nj = feedCountStickerDialogFragment.LLJ;
        if (c11nj != null) {
            c11nj.LIZ(interfaceC420801kM);
        }
    }

    public static final void onSubscribe$1(C19775112Yr c19775112Yr, InterfaceC420801kM interfaceC420801kM) {
        DialogC1389620mGW dialogC1389620mGW;
        FeedCountStickerDialogFragment feedCountStickerDialogFragment = (FeedCountStickerDialogFragment) c19775112Yr.l0;
        if (feedCountStickerDialogFragment.LLJ == null) {
            feedCountStickerDialogFragment.LLJ = new C11NJ();
        }
        C11NJ c11nj = feedCountStickerDialogFragment.LLJ;
        if (c11nj != null) {
            c11nj.LIZ(interfaceC420801kM);
        }
        FeedCountStickerDialogFragment feedCountStickerDialogFragment2 = (FeedCountStickerDialogFragment) c19775112Yr.l0;
        Context context = feedCountStickerDialogFragment2.getContext();
        if (context != null) {
            dialogC1389620mGW = new DialogC1389620mGW(context);
        } else {
            dialogC1389620mGW = null;
        }
        feedCountStickerDialogFragment2.LLJI = dialogC1389620mGW;
        DialogC1389620mGW dialogC1389620mGW2 = ((FeedCountStickerDialogFragment) c19775112Yr.l0).LLJI;
        if (dialogC1389620mGW2 != null) {
            C786410Ut5.J4(dialogC1389620mGW2);
        }
    }

    public static final void onSubscribe$2(C19775112Yr c19775112Yr, InterfaceC420801kM interfaceC420801kM) {
        ((C11NJ) c19775112Yr.l0).LIZ(interfaceC420801kM);
    }

    public static final void onSubscribe$3(C19775112Yr c19775112Yr, InterfaceC420801kM interfaceC420801kM) {
        ((C19632311rV) c19775112Yr.l0).LJ.LIZ(interfaceC420801kM);
        ((C19632311rV) c19775112Yr.l0).LIZ.LJ();
    }

    public static final void onSubscribe$4(C19775112Yr c19775112Yr, InterfaceC420801kM interfaceC420801kM) {
        ((C111Q) c19775112Yr.l0).LLILZLL.LIZ(interfaceC420801kM);
    }

    public static final /* bridge */ /* synthetic */ void onNext$2(C19775112Yr c19775112Yr, Object obj) {
    }
}
