package Y;

import X.AbstractC1387200mCc;
import X.C09JN;
import X.C0PEM;
import X.C1322110kVd;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1413905g9;
import X.C189200o6;
import X.C1917460zzs;
import X.C19EG;
import X.C1C7U;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.C2382909Vj;
import X.C259800zU;
import X.C565950MHp;
import X.InterfaceC1364105Vn;
import X.InterfaceC420801kM;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.ss.android.ugc.aweme.compliance.business.banappeal.UserBanDepServiceImpl;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.music.mutestrip.MuteStripApiServiceImpl;
import com.ss.android.ugc.tiktok.tns.commentsafety.ICommentSafetyDepService;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.toolkit.keywords.CommentKeywordsVM;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS61S0500000_28;

/* JADX INFO: loaded from: classes3.dex */
public class AfS138S0200000_2 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;

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

    public static final void accept$0(AfS138S0200000_2 afS138S0200000_2, Object obj) {
        C1C7U.LIZ("ExternalShareGroupUtils@7fa9.getExternalShareGroupLink$5");
        ((AwemeSharePackage) afS138S0200000_2.l0).extras.putInt("external_share_group_invitation_fail", 1);
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS138S0200000_2.l1;
        C189200o6.m2constructorimpl("");
        interfaceC1364105Vn.resumeWith("");
        C1C7U.LIZIZ("ExternalShareGroupUtils@7fa9.getExternalShareGroupLink$5");
    }

    public static final void accept$1(AfS138S0200000_2 afS138S0200000_2, Object obj) {
        Boolean bool;
        C1C7U.LIZ("MuteStripApiServiceImpl@f239.startMuteStrip$1");
        MuteStripApiServiceImpl.MuteStripResponse muteStripResponse = (MuteStripApiServiceImpl.MuteStripResponse) obj;
        if (muteStripResponse.status_code != 0) {
            Function1 function1 = (Function1) afS138S0200000_2.l0;
            if (function1 != null) {
                function1.invoke(muteStripResponse.status_msg);
            }
        } else {
            Function1 function12 = (Function1) afS138S0200000_2.l1;
            if (function12 != null) {
                MuteStripApiServiceImpl.MusicStripMuteVideoData musicStripMuteVideoData = muteStripResponse.data;
                if (musicStripMuteVideoData != null) {
                    bool = musicStripMuteVideoData.canEnterPreview;
                } else {
                    bool = null;
                }
                function12.invoke(bool);
            }
        }
        C1C7U.LIZIZ("MuteStripApiServiceImpl@f239.startMuteStrip$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$2(AfS138S0200000_2 afS138S0200000_2, Object obj) {
        Activity topActivity;
        Integer num;
        C1C7U.LIZ("CommentKeywordsVM@44f8.upload$1");
        ICommentSafetyDepService iCommentSafetyDepService = (ICommentSafetyDepService) PluggableExtentionKt.pluggableSpi$default(ICommentSafetyDepService.class, false, false, false, 14, null);
        if (iCommentSafetyDepService != null) {
            topActivity = iCommentSafetyDepService.getTopActivity();
        } else {
            topActivity = null;
        }
        Integer num2 = (Integer) ((CommentKeywordsVM) afS138S0200000_2.l0).LLILZIL.getValue();
        if ((num2 == null || num2.intValue() != 1 || !((List) afS138S0200000_2.l1).isEmpty()) && (num = (Integer) ((CommentKeywordsVM) afS138S0200000_2.l0).LLILZIL.getValue()) != null && num.intValue() == 1) {
            if (topActivity != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(topActivity);
                c1389890mGx.LIZ(true);
                c1389890mGx.LJIIIZ(2131829164);
                c1389890mGx.LJIIJJI();
            }
        } else {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1413905g9(topActivity, null), 3);
        }
        C1C7U.LIZIZ("CommentKeywordsVM@44f8.upload$1");
    }

    public static final void accept$3(AfS138S0200000_2 afS138S0200000_2, Object obj) {
        C1C7U.LIZ("RefreshGiftBagListMethod@f2d0.handle$timeoutDisposable$1");
        if (((AtomicBoolean) afS138S0200000_2.l0).compareAndSet(false, true)) {
            C2382909Vj.LIZ((CompletionBlock) afS138S0200000_2.l1, -1002, null, null, 6);
        }
        C1C7U.LIZIZ("RefreshGiftBagListMethod@f2d0.handle$timeoutDisposable$1");
    }

    public static final void accept$4(AfS138S0200000_2 afS138S0200000_2, Object obj) {
        C19EG c19egLIZIZ;
        C1C7U.LIZ("UserBanDepServiceImpl@c97f.tryShowOnTopActivity$2$1");
        Activity activityLIZIZ = ((AbstractC1387200mCc) obj).LIZIZ();
        if (activityLIZIZ != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ)) != null) {
            ((Function1) afS138S0200000_2.l0).invoke(c19egLIZIZ);
        } else {
            ((Function1) afS138S0200000_2.l1).invoke("Context of a RootPage is not a FragmentActivity!");
        }
        C1C7U.LIZIZ("UserBanDepServiceImpl@c97f.tryShowOnTopActivity$2$1");
    }

    public static final void accept$5(AfS138S0200000_2 afS138S0200000_2, Object obj) {
        C1C7U.LIZ("PlaylistManageRepo@fa57.addVideoToPlaylist$2");
        Function1 function1 = (Function1) afS138S0200000_2.l0;
        if (function1 != null) {
            function1.invoke(obj);
        }
        InterfaceC420801kM interfaceC420801kM = (InterfaceC420801kM) ((C259800zU) afS138S0200000_2.l1).element;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        C1C7U.LIZIZ("PlaylistManageRepo@fa57.addVideoToPlaylist$2");
    }

    public static final void accept$6(AfS138S0200000_2 afS138S0200000_2, Object obj) {
        C1C7U.LIZ("CoverExtKt@ad6c.loadMultiVideoEditCover$4");
        ((C1322110kVd) afS138S0200000_2.l0).setImageDrawable((Drawable) obj);
        C565950MHp.LIZ((VideoPublishEditModel) afS138S0200000_2.l1);
        C1C7U.LIZIZ("CoverExtKt@ad6c.loadMultiVideoEditCover$4");
    }

    public static final void accept$7(AfS138S0200000_2 afS138S0200000_2, Object obj) {
        C1C7U.LIZ("CoverExtKt@ad6c.loadMultiVideoEditCoverNew$3");
        ((C1322110kVd) afS138S0200000_2.l0).setImageDrawable((Drawable) obj);
        C565950MHp.LIZ((VideoPublishEditModel) afS138S0200000_2.l1);
        C1C7U.LIZIZ("CoverExtKt@ad6c.loadMultiVideoEditCoverNew$3");
    }

    public static final void accept$8(AfS138S0200000_2 afS138S0200000_2, Object obj) {
        C1C7U.LIZ("ActivityUtils$Companion@70ea.executeWhenStackTopActivityResume$acResumeSubscriber$1");
        ((Function0) afS138S0200000_2.l0).invoke();
        InterfaceC420801kM interfaceC420801kM = (InterfaceC420801kM) ((C259800zU) afS138S0200000_2.l1).element;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        C1C7U.LIZIZ("ActivityUtils$Companion@70ea.executeWhenStackTopActivityResume$acResumeSubscriber$1");
    }

    public AfS138S0200000_2(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public AfS138S0200000_2(UserBanDepServiceImpl userBanDepServiceImpl, AwS61S0500000_28 awS61S0500000_28, C1917460zzs c1917460zzs, int i) {
        this.$t = i;
        this.l0 = awS61S0500000_28;
        this.l1 = c1917460zzs;
    }
}
