package X;

import com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter;
import com.ss.android.ugc.aweme.setting.creatorverification.CreatorVerificationResponse;
import com.ss.android.ugc.aweme.setting.creatorverification.CreatorVerificationStatus;
import com.ss.android.ugc.profile.business.profile.popup.BaseMyProfileGuideWidget;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS47S0010000_35;

/* JADX INFO: renamed from: X.0j3W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1266240j3W implements InterfaceC626120Oh8 {
    public final int $t;
    public Object l0;

    public static final void onComplete$0(C1266240j3W c1266240j3W) {
    }

    public static final void onComplete$1(C1266240j3W c1266240j3W) {
    }

    public static final void onComplete$2(C1266240j3W c1266240j3W) {
    }

    public static final void onError$1(C1266240j3W c1266240j3W, Throwable th) {
    }

    public static final void onSubscribe$0(C1266240j3W c1266240j3W, InterfaceC420801kM interfaceC420801kM) {
    }

    public static final void onSubscribe$2(C1266240j3W c1266240j3W, InterfaceC420801kM interfaceC420801kM) {
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
        }
    }

    public C1266240j3W(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onError$0(C1266240j3W c1266240j3W, Throwable th) {
        InterfaceC1239340iM8 interfaceC1239340iM8 = ((EditOriginMusicTitlePresenter) c1266240j3W.l0).LIZ;
        if (interfaceC1239340iM8 == null) {
            return;
        }
        interfaceC1239340iM8.onError("");
    }

    public static final void onError$2(C1266240j3W c1266240j3W, Throwable th) {
        ((BaseMyProfileGuideWidget) c1266240j3W.l0).LJIILIIL().setState(AFwS283S0000000_35.get$arr$(155));
    }

    public static final void onNext$0(C1266240j3W c1266240j3W, Object obj) {
        EditOriginMusicTitlePresenter.AlterMusicTitleModel alterMusicTitleModel = (EditOriginMusicTitlePresenter.AlterMusicTitleModel) obj;
        InterfaceC1239340iM8 interfaceC1239340iM8 = ((EditOriginMusicTitlePresenter) c1266240j3W.l0).LIZ;
        if (interfaceC1239340iM8 != null) {
            if (alterMusicTitleModel.status_code == 0) {
                interfaceC1239340iM8.onSuccess();
            } else {
                interfaceC1239340iM8.onError(alterMusicTitleModel.statusMsg);
            }
        }
    }

    public static final void onNext$1(C1266240j3W c1266240j3W, Object obj) {
        String str;
        int i;
        C1238550iKr c1238550iKr = (C1238550iKr) c1266240j3W.l0;
        CreatorVerificationStatus verificationStatus = ((CreatorVerificationResponse) obj).getVerificationStatus();
        if (verificationStatus != null && (i = C1238630iKz.LIZ[verificationStatus.ordinal()]) != -1) {
            if (i != 1) {
                if (i != 2) {
                    str = "unverified";
                } else {
                    str = "verified";
                }
            } else {
                str = "under_assessment";
            }
        } else {
            str = "unknown";
        }
        c1238550iKr.LIZ(str);
    }

    public static final void onNext$2(C1266240j3W c1266240j3W, Object obj) {
        ((BaseMyProfileGuideWidget) c1266240j3W.l0).LJIILIIL().setState(new AwS47S0010000_35(((Boolean) obj).booleanValue(), 25));
    }

    public static final void onSubscribe$1(C1266240j3W c1266240j3W, InterfaceC420801kM interfaceC420801kM) {
        ((C1238550iKr) c1266240j3W.l0).LJFF.LIZ(interfaceC420801kM);
    }
}
