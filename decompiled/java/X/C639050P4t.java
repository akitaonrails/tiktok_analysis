package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.detail.prefab.DetailPageContainerAssem;
import com.ss.android.ugc.aweme.featureeffectvideo.model.FeatureVideoViewModel;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0P4t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C639050P4t implements InterfaceC626120Oh8 {
    public final int $t;
    public Object l0;

    public static final void onComplete$1(C639050P4t c639050P4t) {
    }

    public static final void onComplete$2(C639050P4t c639050P4t) {
    }

    public static final void onError$0(C639050P4t c639050P4t, Throwable th) {
    }

    public static final void onError$2(C639050P4t c639050P4t, Throwable th) {
    }

    public static final void onSubscribe$2(C639050P4t c639050P4t, InterfaceC420801kM interfaceC420801kM) {
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

    public static final void onComplete$0(C639050P4t c639050P4t) {
        InterfaceC420801kM interfaceC420801kM;
        DetailPageContainerAssem detailPageContainerAssem = (DetailPageContainerAssem) c639050P4t.l0;
        InterfaceC420801kM interfaceC420801kM2 = detailPageContainerAssem.LLJJIJIL;
        if (interfaceC420801kM2 != null && !interfaceC420801kM2.isDisposed() && (interfaceC420801kM = detailPageContainerAssem.LLJJIJIL) != null) {
            interfaceC420801kM.dispose();
        }
    }

    public C639050P4t(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onError$1(C639050P4t c639050P4t, Throwable th) {
        FeatureVideoViewModel featureVideoViewModel = (FeatureVideoViewModel) c639050P4t.l0;
        featureVideoViewModel.LLILLJJLI.postValue(EnumC615370OBr.DELETING_ERROR);
    }

    public static final void onNext$0(C639050P4t c639050P4t, Object obj) {
        ((Number) obj).longValue();
        C481090Itn c481090Itn = ((DetailPageContainerAssem) c639050P4t.l0).LLJJI;
        if (c481090Itn == null) {
            c481090Itn = null;
        }
        c481090Itn.setRefreshing(false);
    }

    public static final void onNext$1(C639050P4t c639050P4t, Object obj) {
        FeatureVideoViewModel featureVideoViewModel = (FeatureVideoViewModel) c639050P4t.l0;
        featureVideoViewModel.LLILLJJLI.postValue(EnumC615370OBr.FEATURE_VIDEO_DELETED);
    }

    public static final void onNext$2(C639050P4t c639050P4t, Object obj) {
        InterfaceC616470OFx interfaceC616470OFx = C616460OFw.LIZ;
        C616430OFt c616430OFt = (C616430OFt) c639050P4t.l0;
        C15O7<BaseResponse> c15o7LJFF = interfaceC616470OFx.LJFF(c616430OFt.LLIZ, c616430OFt.LLILZ, c616430OFt.LLJIJIL);
        C616430OFt c616430OFt2 = (C616430OFt) c639050P4t.l0;
        ExecutorService executorService = C15O7.LJI;
        c616430OFt2.getClass();
        C1206780hVc.LIZ(C786410Ut5.j4("/aweme/v1/aweme/collect/", new Object[0]));
        c15o7LJFF.LJ(new C638970P4l(c616430OFt2, 2), executorService, null);
    }

    public static final void onSubscribe$0(C639050P4t c639050P4t, InterfaceC420801kM interfaceC420801kM) {
        ((DetailPageContainerAssem) c639050P4t.l0).LLJJIJIL = interfaceC420801kM;
    }

    public static final void onSubscribe$1(C639050P4t c639050P4t, InterfaceC420801kM interfaceC420801kM) {
        ((C11NJ) ((FeatureVideoViewModel) c639050P4t.l0).LL.getValue()).LIZ(interfaceC420801kM);
    }
}
