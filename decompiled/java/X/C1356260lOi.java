package X;

import Y.AObserverS224S0100000_21;
import Y.ARunnableS90S0200000_21;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.comment.easteregg.viewmodel.CommentEasterEggViewModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentSurprise;
import com.ss.android.ugc.aweme.comment.model.CommentSurpriseStruct;
import com.ss.android.ugc.aweme.comment.model.SurpriseResource;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lOi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1356260lOi extends AbstractViewOnAttachStateChangeListenerC1356270lOj implements InterfaceC1350080lEk {
    public static final /* synthetic */ int LLJLIL = 0;
    public final C1349910lET LLILZ;
    public final C19EG LLILZIL;
    public final boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJ;
    public C0GUO LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public boolean LLJILJILJ;
    public long LLJILLL;
    public boolean LLJJ;
    public final C01GW LLJJI;
    public CommentSurpriseStruct LLJJIII;
    public long LLJJIJI;
    public BPEAHandler LLJJIJIIJIL;
    public ARunnableS90S0200000_21 LLJJIJIL;
    public final C1402230mar LLJJJ;
    public final C1356290lOl LLJJJIL;
    public final C1402230mar LLJJJJ;
    public final C1402230mar LLJJJJJIL;
    public final C1402230mar LLJJJJLIIL;
    public final C1402230mar LLJJL;
    public final C1402230mar LLJJLIIIJLLLLLLLZ;
    public final C1402230mar LLJL;

    public final void LJFF() {
        InterfaceC1356280lOk interfaceC1356280lOk;
        BPEAHandler bPEAHandler;
        C0N0Y c0n0yLJLJJI;
        C0GUO c0guo = this.LLJI;
        if (c0guo != null) {
            int visibility = c0guo.getVisibility();
            c0guo.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c0guo);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
        }
        this.LLJ = null;
        C0GUO c0guo2 = this.LLJI;
        if (c0guo2 != null) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c0guo2, null);
            c0guo2.removeAllViews();
        }
        this.LLIZ = false;
        this.LLIZLLLIL = false;
        if (this.LLJJ && (c0n0yLJLJJI = C1483410ohn.LJLJJI()) != null) {
            this.LLJJ = false;
            c0n0yLJLJJI.LJIJJ();
        }
        this.LLJJ = false;
        this.LLJJIJI = 0L;
        ARunnableS90S0200000_21 aRunnableS90S0200000_21 = this.LLJJIJIL;
        if (aRunnableS90S0200000_21 != null && (bPEAHandler = this.LLJJIJIIJIL) != null) {
            bPEAHandler.removeCallbacks(aRunnableS90S0200000_21);
        }
        this.LLJJIJIIJIL = null;
        this.LLJJIJIL = null;
        CommentSurpriseStruct commentSurpriseStruct = this.LLJJIII;
        if (commentSurpriseStruct != null) {
            Comment comment = commentSurpriseStruct.comment;
            if ((comment == null || !Intrinsics.LJFF(comment.getHasShownFirstCommentTagAnimation(), Boolean.TRUE)) && (interfaceC1356280lOk = this.LLILZ.LIZ) != null) {
                interfaceC1356280lOk.LIZLLL(commentSurpriseStruct.comment);
            }
        }
    }

    @Override // X.InterfaceC1350080lEk
    public final void onRelease() {
        C1353060lJY c1353060lJYLIZIZ;
        InterfaceC1356280lOk interfaceC1356280lOk = this.LLILZ.LIZ;
        if (interfaceC1356280lOk != null && (c1353060lJYLIZIZ = interfaceC1356280lOk.LIZIZ()) != null) {
            c1353060lJYLIZIZ.setEasterEggShowing(false);
        }
        if (this.LLIZLLLIL) {
            C1356250lOh.LIZ(this.LLJJIII, "comment_close_while_loading");
        }
        LJI("auto_close_comment_panel");
        this.LLILZ.LIZ = null;
    }

    @Override // X.InterfaceC1350080lEk
    public final boolean isShowing() {
        return this.LLIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075 A[PHI: r10
      0x0075: PHI (r10v1 java.lang.Integer) = (r10v0 java.lang.Integer), (r10v7 java.lang.Integer), (r10v7 java.lang.Integer) binds: [B:38:0x0072, B:16:0x0037, B:18:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079 A[PHI: r9 r10
      0x0079: PHI (r9v1 java.lang.Integer) = (r9v0 java.lang.Integer), (r9v5 java.lang.Integer) binds: [B:41:0x0076, B:21:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0079: PHI (r10v2 java.lang.Integer) = (r10v1 java.lang.Integer), (r10v6 java.lang.Integer) binds: [B:41:0x0076, B:21:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d A[PHI: r9 r10 r11
      0x007d: PHI (r9v2 java.lang.Integer) = (r9v1 java.lang.Integer), (r9v4 java.lang.Integer), (r9v4 java.lang.Integer) binds: [B:44:0x007a, B:24:0x0047, B:26:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r10v3 java.lang.Integer) = (r10v2 java.lang.Integer), (r10v5 java.lang.Integer), (r10v5 java.lang.Integer) binds: [B:44:0x007a, B:24:0x0047, B:26:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r11v1 java.lang.String) = (r11v0 java.lang.String), (r11v3 java.lang.String), (r11v3 java.lang.String) binds: [B:44:0x007a, B:24:0x0047, B:26:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1352030lHt LIZJ(X.C1349800lEI r15) {
        /*
            r14 = this;
            com.ss.android.ugc.aweme.comment.model.CommentSurpriseStruct r0 = r14.LLJJIII
            r13 = 0
            if (r0 == 0) goto L81
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r0.comment
            if (r0 == 0) goto L81
            java.lang.String r4 = r0.getCid()
        Ld:
            java.lang.String r5 = r15.getAid()
            java.lang.String r0 = r15.getAuthorUid()
            boolean r2 = X.C10EU.LJIIZILJ(r0)
            java.lang.String r7 = r15.getEnterFrom()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r15.getAweme()
            if (r0 == 0) goto L7f
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
        L27:
            java.lang.String r8 = X.C735370Ssx.LJIJJLI(r0)
            com.ss.android.ugc.aweme.comment.model.CommentSurpriseStruct r1 = r14.LLJJIII
            if (r1 == 0) goto L71
            com.ss.android.ugc.aweme.comment.model.CommentSurprise r0 = r1.commentSurprise
            if (r0 == 0) goto L71
            java.lang.Integer r10 = r0.surpriseType
        L35:
            com.ss.android.ugc.aweme.comment.model.CommentSurprise r0 = r1.commentSurprise
            if (r0 == 0) goto L75
            com.ss.android.ugc.aweme.comment.model.SurpriseResource r0 = r0.surpriseResource
            if (r0 == 0) goto L75
            java.lang.Integer r9 = r0.effectId
        L3f:
            com.ss.android.ugc.aweme.comment.model.CommentSurprise r0 = r1.commentSurprise
            if (r0 == 0) goto L79
            java.lang.String r11 = r0.keyword
        L45:
            com.ss.android.ugc.aweme.comment.model.CommentSurprise r0 = r1.commentSurprise
            if (r0 == 0) goto L7d
            com.ss.android.ugc.aweme.comment.model.SurpriseResource r0 = r0.surpriseResource
            if (r0 == 0) goto L7d
            java.lang.Boolean r1 = r0.hasVoice
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
        L55:
            com.ss.android.ugc.aweme.comment.model.CommentSurpriseStruct r0 = r14.LLJJIII
            if (r0 == 0) goto L63
            com.ss.android.ugc.aweme.comment.model.CommentSurprise r0 = r0.commentSurprise
            if (r0 == 0) goto L63
            com.ss.android.ugc.aweme.comment.model.SurpriseResource r0 = r0.surpriseResource
            if (r0 == 0) goto L63
            java.lang.Long r13 = r0.activityId
        L63:
            X.0lHt r3 = new X.0lHt
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r3
        L71:
            r10 = r13
            if (r1 == 0) goto L75
            goto L35
        L75:
            r9 = r13
            if (r1 == 0) goto L79
            goto L3f
        L79:
            r11 = r13
            if (r1 == 0) goto L7d
            goto L45
        L7d:
            r1 = 0
            goto L55
        L7f:
            r0 = r13
            goto L27
        L81:
            r4 = r13
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1356260lOi.LIZJ(X.0lEI):X.0lHt");
    }

    public final void LIZLLL(boolean z) {
        CommentSurprise commentSurprise;
        Integer num;
        String string;
        String str;
        long j = this.LLJJIJI;
        if (j > 0 && this.LLJ != null) {
            CommentSurpriseStruct commentSurpriseStruct = this.LLJJIII;
            Long lValueOf = Long.valueOf(j);
            if (lValueOf != null && commentSurpriseStruct != null && (commentSurprise = commentSurpriseStruct.commentSurprise) != null) {
                SurpriseResource surpriseResource = commentSurprise.surpriseResource;
                Long l = null;
                if (surpriseResource != null) {
                    num = surpriseResource.effectId;
                    l = surpriseResource.activityId;
                } else {
                    num = null;
                }
                Keva keva = (Keva) C1356310lOn.LIZ.getValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("comment_easter_egg_has_load_");
                if (num == null || (string = num.toString()) == null) {
                    string = "";
                }
                sbLIZ.append(string);
                boolean z2 = keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
                long jCurrentTimeMillis = System.currentTimeMillis() - lValueOf.longValue();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("load_duration", String.valueOf(jCurrentTimeMillis));
                String str2 = "1";
                if (!z2) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                c2344009Gk.LJIIIIZZ("is_first_load", str);
                c2344009Gk.LJ(num, "easter_egg_id");
                if (!z) {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                c2344009Gk.LJIIIIZZ("success", str2);
                c2344009Gk.LJ(l, "activity_id");
                C20684815ws.LJIILLIIL("comment_easter_egg_load", c2344009Gk.LIZ);
            }
            this.LLJJIJI = 0L;
        }
    }

    public final void LJ(Integer num) {
        C1349800lEI c1349800lEILJ;
        InterfaceC1356280lOk interfaceC1356280lOk = this.LLILZ.LIZ;
        if (interfaceC1356280lOk != null && (c1349800lEILJ = interfaceC1356280lOk.LJ()) != null) {
            C2344009Gk c2344009GkLIZ = C1352020lHs.LIZ(LIZJ(c1349800lEILJ));
            c2344009GkLIZ.LJ(num, "button_function");
            C20684815ws.LJIILLIIL("easter_egg_click", c2344009GkLIZ.LIZ);
        }
    }

    public final void LJI(String str) {
        Long lValueOf;
        InterfaceC1356280lOk interfaceC1356280lOk;
        C1349800lEI c1349800lEILJ;
        C1353060lJY c1353060lJYLIZIZ;
        InterfaceC1356280lOk interfaceC1356280lOk2 = this.LLILZ.LIZ;
        if (interfaceC1356280lOk2 != null && (c1353060lJYLIZIZ = interfaceC1356280lOk2.LIZIZ()) != null) {
            c1353060lJYLIZIZ.setEasterEggShowing(false);
        }
        C0GUO c0guo = this.LLJI;
        if (c0guo != null && c0guo.getVisibility() == 0) {
            if (this.LLJILLL > 0) {
                lValueOf = Long.valueOf(System.currentTimeMillis() - this.LLJILLL);
            } else {
                lValueOf = null;
            }
            this.LLJILLL = 0L;
            if (str != null && (interfaceC1356280lOk = this.LLILZ.LIZ) != null && (c1349800lEILJ = interfaceC1356280lOk.LJ()) != null) {
                C2344009Gk c2344009GkLIZ = C1352020lHs.LIZ(LIZJ(c1349800lEILJ));
                c2344009GkLIZ.LJ(lValueOf, "duration");
                c2344009GkLIZ.LJFF("close_way", str);
                C20684815ws.LJIILLIIL("easter_egg_close", c2344009GkLIZ.LIZ);
            }
        }
        LIZLLL(false);
        LJFF();
        if (this.LLJILJILJ) {
            C1548820qPI.LJIIIIZZ("onCompletion", this.LLJJJIL);
            C1548820qPI.LJIIIIZZ("onStart", this.LLJJJ);
            C1548820qPI.LJIIIIZZ("onPlayError", this.LLJJJJ);
            C1548820qPI.LJIIIIZZ("onClick", this.LLJJJJJIL);
            C1548820qPI.LJIIIIZZ("playBackgroundVoice", this.LLJJJJLIIL);
            C1548820qPI.LJIIIIZZ("pauseBackgroundVoice", this.LLJJL);
            C1548820qPI.LJIIIIZZ("onClickButton", this.LLJJLIIIJLLLLLLLZ);
            C1548820qPI.LJIIIIZZ("onClose", this.LLJL);
            this.LLJILJILJ = false;
        }
    }

    @Override // X.InterfaceC1350080lEk
    public final void LLLIL(String str) {
        C1353060lJY c1353060lJYLIZIZ;
        InterfaceC1356280lOk interfaceC1356280lOk = this.LLILZ.LIZ;
        if (interfaceC1356280lOk != null && (c1353060lJYLIZIZ = interfaceC1356280lOk.LIZIZ()) != null) {
            c1353060lJYLIZIZ.setEasterEggShowing(false);
        }
        if (this.LLIZLLLIL) {
            C1356250lOh.LIZ(this.LLJJIII, "comment_close_while_loading");
        }
        LJI(str);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0lOl] */
    public C1356260lOi(C1349910lET c1349910lET, ViewStub viewStub, C19EG c19eg, boolean z) {
        Fragment fragment;
        Object objLJIILLIIL;
        super(viewStub);
        this.LLILZ = c1349910lET;
        this.LLILZIL = c19eg;
        this.LLILZLL = z;
        C01GW c01gwLIZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS565S0100000_21(this, 1468));
        this.LLJJI = c01gwLIZ;
        this.LLJJJ = new C1402230mar(this, 8);
        this.LLJJJIL = new InterfaceC1141530foN() { // from class: X.0lOl
            @Override // X.InterfaceC1141530foN
            public final void mh2(C262100zr c262100zr) {
            }
        };
        this.LLJJJJ = new C1402230mar(this, 5);
        this.LLJJJJJIL = new C1402230mar(this, 3);
        this.LLJJJJLIIL = new C1402230mar(this, 7);
        this.LLJJL = new C1402230mar(this, 6);
        this.LLJJLIIIJLLLLLLLZ = new C1402230mar(this, 2);
        this.LLJL = new C1402230mar(this, 4);
        IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
        if (iDetailFeedSafService != null && iDetailFeedSafService.LJ() && (objLJIILLIIL = SAFExtensionKt.LJIILLIIL(c19eg)) != null) {
            fragment = (Fragment) objLJIILLIIL;
        } else {
            fragment = null;
        }
        CommentEasterEggViewModel commentEasterEggViewModel = (CommentEasterEggViewModel) c01gwLIZ.getValue();
        if (commentEasterEggViewModel != null) {
            MutableLiveData<CommentSurpriseStruct> mutableLiveData = commentEasterEggViewModel.LL;
            LifecycleOwner lifecycleOwner = c19eg;
            if (mutableLiveData != null) {
                mutableLiveData.observe(fragment != null ? fragment : lifecycleOwner, new AObserverS224S0100000_21(this, 77));
            }
        }
    }

    @Override // X.InterfaceC1350080lEk
    public final void LIZ(Integer num, Integer num2, Integer num3, Integer num4) {
        int iIntValue;
        InterfaceC1541990qEH kitView;
        int iIntValue2;
        int iIntValue3 = 0;
        if (this.LLILZLL) {
            if (num3 != null) {
                iIntValue2 = num3.intValue();
            } else {
                iIntValue2 = 0;
            }
            this.LLJIJIL = iIntValue2;
            if (num4 != null) {
                iIntValue3 = num4.intValue();
            }
            this.LLJILJIL = iIntValue3;
        } else {
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            this.LLJIJIL = iIntValue;
            if (num2 != null) {
                iIntValue3 = num2.intValue();
            }
            this.LLJILJIL = iIntValue3;
        }
        C1356300lOm c1356300lOm = new C1356300lOm(this.LLJIJIL, this.LLJILJIL);
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
            kitView.LIZ("comment_resize", c1356300lOm.LIZ);
        }
        C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), new C1323820kYO(c1356300lOm.LIZ), "comment_resize"));
    }
}
