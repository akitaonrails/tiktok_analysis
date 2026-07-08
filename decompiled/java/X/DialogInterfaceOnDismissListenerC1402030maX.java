package X;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.feed.model.video.TranslatedVideo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.internalshare.impl.fragment.DownloadAndShareFragment;
import com.ss.android.ugc.aweme.share.ShareExtService;
import com.ss.android.ugc.aweme.share.improve.action.aidubbing.AIDubbingSheetFragment;
import com.ss.android.ugc.aweme.share.improve.action.aidubbing.AiDubbingToggleRequest;
import com.ss.android.ugc.aweme.share.improve.action.aidubbing.AiDubbingToggleResponse;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0maX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class DialogInterfaceOnDismissListenerC1402030maX implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) throws Exception {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                break;
            case 1:
                onDismiss$1(this, dialogInterface);
                break;
            case 2:
                onDismiss$2(this, dialogInterface);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC1402030maX dialogInterfaceOnDismissListenerC1402030maX, DialogInterface dialogInterface) throws Exception {
        Dialog dialog;
        FypAutoScrollService fypAutoScrollService = (FypAutoScrollService) ServiceManager.get().getService(FypAutoScrollService.class);
        if (fypAutoScrollService != null) {
            fypAutoScrollService.setDescDialogShowing(false);
        }
        DialogFragment dialogFragment = (DialogFragment) ((C259800zU) dialogInterfaceOnDismissListenerC1402030maX.l0).element;
        if (dialogFragment != null && (dialog = dialogFragment.getDialog()) != null) {
            C2211631BhB.LIZIZ(dialog);
        }
        Function0 function0 = (Function0) dialogInterfaceOnDismissListenerC1402030maX.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC1402030maX dialogInterfaceOnDismissListenerC1402030maX, DialogInterface dialogInterface) {
        final boolean zIsChecked;
        Long lLJIILIIL;
        C1499850p8J c1499850p8JCreateBuilder;
        InterfaceC1380130m1D interfaceC1380130m1D;
        AIDubbingSheetFragment aIDubbingSheetFragment = (AIDubbingSheetFragment) dialogInterfaceOnDismissListenerC1402030maX.l0;
        C21411818qq c21411818qqNR = aIDubbingSheetFragment.NR();
        if (c21411818qqNR != null) {
            zIsChecked = c21411818qqNR.isChecked();
        } else {
            zIsChecked = aIDubbingSheetFragment.LLIZ;
        }
        final C1380120m1C c1380120m1C = (C1380120m1C) dialogInterfaceOnDismissListenerC1402030maX.l1;
        if (zIsChecked != c1380120m1C.LLILLJJLI) {
            C11JL c11jl = c1380120m1C.LLILLL;
            if (c11jl != null) {
                c11jl.dispose();
            }
            String aid = c1380120m1C.LL.getAid();
            if (aid != null && (lLJIILIIL = C2095008Iq.LJIILIIL(aid)) != null) {
                long jLongValue = lLJIILIIL.longValue();
                InterfaceC1380130m1D.LIZ.getClass();
                IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
                if (iRetrofitFactory != null && (c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(C0CQT.LIZJ)) != null && (interfaceC1380130m1D = (InterfaceC1380130m1D) c1499850p8JCreateBuilder.build().retrofit.LIZ(InterfaceC1380130m1D.class)) != null) {
                    c1380120m1C.LLILLL = (C11JL) interfaceC1380130m1D.LIZ(new AiDubbingToggleRequest(Long.valueOf(jLongValue), Boolean.valueOf(zIsChecked))).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new C09JN() { // from class: X.0btV
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("AIDubbingAction@a83d.makeAiDubbingToggleApiCall$1");
                            Integer num = ((AiDubbingToggleResponse) obj).statusCode;
                            if (num != null && num.intValue() == 0) {
                                c1380120m1C.LLILLJJLI = zIsChecked;
                            }
                            C1C7U.LIZIZ("AIDubbingAction@a83d.makeAiDubbingToggleApiCall$1");
                        }
                    }, new C09JN() { // from class: X.00Os
                        @Override // X.C09JN
                        public final /* bridge */ /* synthetic */ void accept(Object obj) {
                            C1C7U.LIZ("AIDubbingAction@a83d.makeAiDubbingToggleApiCall$2");
                            C1C7U.LIZIZ("AIDubbingAction@a83d.makeAiDubbingToggleApiCall$2");
                        }
                    });
                }
            }
            TranslatedVideo translatedVideo = c1380120m1C.LL.getTranslatedVideo();
            if (translatedVideo != null) {
                translatedVideo.setShowDubbedVideo(Boolean.valueOf(zIsChecked));
            }
        }
    }

    public static final void onDismiss$2(DialogInterfaceOnDismissListenerC1402030maX dialogInterfaceOnDismissListenerC1402030maX, DialogInterface dialogInterface) {
        ((DownloadAndShareFragment) dialogInterfaceOnDismissListenerC1402030maX.l0).LLIZLLLIL = false;
        DownloadAndShareFragment downloadAndShareFragment = (DownloadAndShareFragment) dialogInterfaceOnDismissListenerC1402030maX.l0;
        C19EG c19eg = (C19EG) dialogInterfaceOnDismissListenerC1402030maX.l1;
        SharePackage sharePackage = downloadAndShareFragment.LLJI;
        if (sharePackage == null) {
            sharePackage = null;
        }
        String string = sharePackage.extras.getString("enter_from");
        if (string == null) {
            string = "";
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c19eg), C0PEM.LIZJ, null, new C757540Tnc(c19eg, string, null), 2);
        ShareExtService shareExtService = (ShareExtService) ServiceManager.get().getService(ShareExtService.class);
        SharePackage sharePackage2 = ((DownloadAndShareFragment) dialogInterfaceOnDismissListenerC1402030maX.l0).LLJI;
        if (sharePackage2 == null) {
            sharePackage2 = null;
        }
        shareExtService.LJJI(sharePackage2);
        C0SHX.LIZ((C19EG) dialogInterfaceOnDismissListenerC1402030maX.l1, null).LJIIJJI("downloaded_video_share_dialog", false, null);
        FypAutoScrollService fypAutoScrollServiceLIZJ = C1386360mBG.LIZJ();
        if (fypAutoScrollServiceLIZJ != null) {
            fypAutoScrollServiceLIZJ.LJIJI(false);
        }
        C1440005kM.LIZ(new C453940Hr6(false, false, 6));
    }

    public DialogInterfaceOnDismissListenerC1402030maX(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
