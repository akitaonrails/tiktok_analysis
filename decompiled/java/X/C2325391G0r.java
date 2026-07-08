package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* JADX INFO: renamed from: X.1G0r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2325391G0r implements InterfaceC1478005qU {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ c09aj) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, c09aj);
                break;
            case 1:
                subscribe$1(this, c09aj);
                break;
            case 2:
                subscribe$2(this, c09aj);
                break;
        }
    }

    public C2325391G0r(ShortVideoContext shortVideoContext, int i) {
        this.$t = i;
        if (i != 0) {
            this.l0 = shortVideoContext;
        } else {
            this.l0 = shortVideoContext;
        }
    }

    public static final void subscribe$0(C2325391G0r c2325391G0r, C09AJ c09aj) {
        final ShortVideoContext shortVideoContext = (ShortVideoContext) c2325391G0r.l0;
        C1C7U.LIZ("GoNextFactoryFactory@2bad.getAVMusicWaveBean$1L");
        AVMusicWaveBean aVMusicWaveBean = shortVideoContext.musicWaveBean;
        if (TextUtils.isEmpty(shortVideoContext.cameraComponentModel.mMusicPath)) {
            c09aj.onNext(AbstractC19852312lt.absent());
            c09aj.onComplete();
        } else if (aVMusicWaveBean != null && TextUtils.equals(aVMusicWaveBean.getMusicPath(), shortVideoContext.cameraComponentModel.mMusicPath)) {
            c09aj.onNext(AbstractC19852312lt.of(aVMusicWaveBean));
            c09aj.onComplete();
        } else if (C298140BmO.LIZ()) {
            c09aj.onNext(AbstractC19852312lt.absent());
            c09aj.onComplete();
        } else {
            final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
            C15R5.LJFF(shortVideoContext.cameraComponentModel.mMusicPath, new C15RH() { // from class: X.1ED3
                @Override // X.C15RH
                public final void LIZ(AVMusicWaveBean aVMusicWaveBean2) {
                    ShortVideoContext shortVideoContext2 = shortVideoContext;
                    C09AJ c09aj2 = c19482611Ke;
                    shortVideoContext2.musicWaveBean = aVMusicWaveBean2;
                    c09aj2.onNext(AbstractC19852312lt.fromNullable(aVMusicWaveBean2));
                    c09aj2.onComplete();
                }
            });
        }
        C1C7U.LIZIZ("GoNextFactoryFactory@2bad.getAVMusicWaveBean$1L");
    }

    public static final void subscribe$1(C2325391G0r c2325391G0r, C09AJ c09aj) {
        C1C7U.LIZ("VideoProcessor@449d.getAVMusicWaveBean$1");
        ShortVideoContext shortVideoContext = (ShortVideoContext) c2325391G0r.l0;
        AVMusicWaveBean aVMusicWaveBean = shortVideoContext.musicWaveBean;
        if (TextUtils.isEmpty(shortVideoContext.cameraComponentModel.mMusicPath)) {
            c09aj.onNext(AbstractC19852312lt.absent());
            c09aj.onComplete();
        } else if (aVMusicWaveBean != null && TextUtils.equals(aVMusicWaveBean.getMusicPath(), ((ShortVideoContext) c2325391G0r.l0).cameraComponentModel.mMusicPath)) {
            c09aj.onNext(AbstractC19852312lt.of(aVMusicWaveBean));
            c09aj.onComplete();
        } else if (C298140BmO.LIZ()) {
            c09aj.onNext(AbstractC19852312lt.absent());
            c09aj.onComplete();
        } else {
            final ShortVideoContext shortVideoContext2 = (ShortVideoContext) c2325391G0r.l0;
            final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
            C15R5.LJFF(shortVideoContext2.cameraComponentModel.mMusicPath, new C15RH() { // from class: X.1ED2
                @Override // X.C15RH
                public final void LIZ(AVMusicWaveBean aVMusicWaveBean2) {
                    shortVideoContext2.musicWaveBean = aVMusicWaveBean2;
                    c19482611Ke.onNext(AbstractC19852312lt.fromNullable(aVMusicWaveBean2));
                    c19482611Ke.onComplete();
                }
            });
        }
        C1C7U.LIZIZ("VideoProcessor@449d.getAVMusicWaveBean$1");
    }

    public static final void subscribe$2(C2325391G0r c2325391G0r, C09AJ c09aj) {
        C1C7U.LIZ("LighteningGoNextAction@4c30.getAVMusicWaveBean$1");
        ShortVideoContext shortVideoContext = (ShortVideoContext) c2325391G0r.l0;
        AVMusicWaveBean aVMusicWaveBean = shortVideoContext.musicWaveBean;
        if (TextUtils.isEmpty(shortVideoContext.cameraComponentModel.mMusicPath)) {
            c09aj.onNext(AbstractC19852312lt.absent());
            c09aj.onComplete();
        } else if (aVMusicWaveBean != null && TextUtils.equals(aVMusicWaveBean.getMusicPath(), ((ShortVideoContext) c2325391G0r.l0).cameraComponentModel.mMusicPath)) {
            c09aj.onNext(AbstractC19852312lt.of(aVMusicWaveBean));
            c09aj.onComplete();
        } else if (C298140BmO.LIZ()) {
            c09aj.onNext(AbstractC19852312lt.absent());
            c09aj.onComplete();
        } else {
            final ShortVideoContext shortVideoContext2 = (ShortVideoContext) c2325391G0r.l0;
            final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
            C15R5.LJFF(shortVideoContext2.cameraComponentModel.mMusicPath, new C15RH() { // from class: X.1ED1
                @Override // X.C15RH
                public final void LIZ(AVMusicWaveBean aVMusicWaveBean2) {
                    shortVideoContext2.musicWaveBean = aVMusicWaveBean2;
                    c19482611Ke.onNext(AbstractC19852312lt.fromNullable(aVMusicWaveBean2));
                    c19482611Ke.onComplete();
                }
            });
        }
        C1C7U.LIZIZ("LighteningGoNextAction@4c30.getAVMusicWaveBean$1");
    }
}
