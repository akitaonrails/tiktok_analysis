package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.cla.et.newet.CaptionsAndTranslationEntranceShowEvent;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.spi.IActionManagerAppDiffProtocol;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.settings.DislikeReason;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollComponent;
import com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility;
import com.ss.android.ugc.feed.platform.panel.pip.RecommendFeedPipComponent;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lzf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1379170lzf implements C0HTT<C737030Svd>, InterfaceC752010Teh, InterfaceC1373720lqs {
    public final Aweme LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final Context LLILZIL;
    public final Fragment LLILZLL;
    public View LLIZ;
    public final String LLIZLLLIL;
    public final InterfaceC1379410m03 LLJ;
    public final InterfaceC1379410m03 LLJI;
    public final String LLJIJIL;
    public final boolean LLJILJIL;
    public final SharePackage LLJILJILJ;

    public final boolean LJIIZILJ() {
        return (this.LL != null && (((ICommercePromoteService) ServiceManager.get().getService(ICommercePromoteService.class)).LJIIJ(this.LL) || AwemeSaaSExtKt.isLive(this.LL))) || TextUtils.equals(this.LLILLJJLI, "graphic_detail") || TextUtils.equals(this.LLILZ, "graphic_detail") || this.LLJILJIL;
    }

    public final void LJIJ() {
        if (this.LL == null) {
            return;
        }
        CaptionsAndTranslationEntranceShowEvent captionsAndTranslationEntranceShowEvent = new CaptionsAndTranslationEntranceShowEvent();
        captionsAndTranslationEntranceShowEvent.LIZ().add(C161N.LIZIZ.LJJIJIIJIL(new WeakReference<>(this.LLILZIL), this.LL, this.LLILLJJLI));
        captionsAndTranslationEntranceShowEvent.LJI(0, "is_edit_available");
        String str = this.LLILLL;
        if (str == null) {
            str = "long_press";
        }
        captionsAndTranslationEntranceShowEvent.LJI(str, "enter_method");
        captionsAndTranslationEntranceShowEvent.LJIIIIZZ();
    }

    @Override // X.InterfaceC1373720lqs
    public final SharePackage LIZ() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC752010Teh
    public final String C7(boolean z) {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1373720lqs
    public final List<C1376750lvl> LIZIZ(InterfaceC1374230lrh interfaceC1374230lrh) {
        ArrayList arrayList = new ArrayList();
        try {
            SettingsManager.LIZLLL().getClass();
            DislikeReason[] dislikeReasonArr = (DislikeReason[]) SettingsManager.LJII("dislike_reasons", DislikeReason[].class);
            int length = dislikeReasonArr.length;
            for (int i = 0; i < length; i++) {
                DislikeReason dislikeReason = dislikeReasonArr[i];
                C734960SsI c734960SsI = new C734960SsI(this, interfaceC1374230lrh);
                String string = dislikeReason.text;
                if (i == 0) {
                    string = this.LLILZIL.getString(2131857747);
                    this.LLILZIL.getString(2131857750);
                }
                if (i == 1) {
                    string = this.LLILZIL.getString(2131857748);
                    this.LLILZIL.getString(2131857751);
                }
                arrayList.add(new C1376750lvl(c734960SsI, new C734990SsL(dislikeReason.id, string)));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return arrayList;
    }

    @Override // X.InterfaceC1373720lqs
    public final List<AbstractC1373870lr7> LIZJ(InterfaceC1374230lrh interfaceC1374230lrh) {
        return new ArrayList();
    }

    @Override // X.InterfaceC1373720lqs
    public final C1376920lw2 LIZLLL(InterfaceC1374230lrh interfaceC1374230lrh) {
        return new C1376920lw2(this, interfaceC1374230lrh);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x07ac  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0820  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x08a7  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x08bd  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x08ee  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x09c2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0a1f  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0a35  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0a3c  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0a4e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0248 A[PHI: r5
      0x0248: PHI (r5v5 boolean) = (r5v7 boolean), (r5v7 boolean), (r5v7 boolean), (r5v8 boolean), (r5v9 boolean) binds: [B:512:0x0a4c, B:518:0x0a5e, B:515:0x0a56, B:508:0x0a41, B:96:0x0247] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1373720lqs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.AbstractC1373870lr7> LJ(final X.InterfaceC1374230lrh r29) {
        /*
            Method dump skipped, instruction units count: 2710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1379170lzf.LJ(X.0lrh):java.util.List");
    }

    public final boolean LJFF(Aweme aweme) {
        if (!TextUtils.equals(this.LLILLJJLI, "homepage_hot")) {
            return false;
        }
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme)) {
            return true;
        }
        IActionManagerAppDiffProtocol.LIZ.getClass();
        C1379420m04.LIZIZ.getValue().LIZ();
        return true;
    }

    public final C1373790lqz LJI(final InterfaceC1374230lrh interfaceC1374230lrh) {
        Aweme aweme;
        Activity activityLJFF;
        C1D0F c1d0f;
        EnumC584570MwJ enumC584570MwJXo1;
        int iLIZ;
        int iLIZ2;
        boolean z;
        Integer numValueOf;
        Boolean boolValueOf;
        Activity activityLJII = C1375500ltk.LJII(this.LLILZIL);
        if (!(activityLJII instanceof C19EG) || !C312230CLt.LJ("panel_auto_scroll")) {
            return null;
        }
        Aweme aweme2 = this.LL;
        boolean z2 = false;
        if ((aweme2 != null && AwemeExtKt.isAdTraffic(aweme2)) || (((aweme = this.LL) != null && aweme.getAwemeType() == 101) || TextUtils.equals(this.LLILZ, "graphic_detail") || (((activityLJFF = C2214201BlK.LJFF()) != null && C0SXF.LJIL(activityLJFF)) || !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || ((!TextUtils.equals(this.LLILLJJLI, "homepage_hot") && !C1386360mBG.LJIIJ(this.LLILLJJLI) && !this.LLJILJIL) || ((c1d0f = C1D0F.LIZ) != null && c1d0f.isConnected()))))) {
            AbstractC1604130rqV abstractC1604130rqVLIZLLL = C1386360mBG.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("not create auto scroll item, enterFrom:");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append(", fromPage:");
            sbLIZ.append(this.LLILZ);
            sbLIZ.append(", type:");
            Aweme aweme3 = this.LL;
            if (aweme3 != null) {
                numValueOf = Integer.valueOf(aweme3.getAwemeType());
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            sbLIZ.append(", isAd:");
            Aweme aweme4 = this.LL;
            if (aweme4 != null) {
                boolValueOf = Boolean.valueOf(AwemeExtKt.isAdTraffic(aweme4));
            } else {
                boolValueOf = null;
            }
            sbLIZ.append(boolValueOf);
            abstractC1604130rqVLIZLLL.LJ(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        IAutoAScrollAbility iAutoAScrollAbilityLIZIZ = C1386360mBG.LIZIZ((C19EG) activityLJII);
        C1386360mBG.LIZLLL().LJIIIZ("createAutoScrollItem, add auto scroll item to the menu");
        if (iAutoAScrollAbilityLIZIZ == null || (enumC584570MwJXo1 = iAutoAScrollAbilityLIZIZ.xo1()) == null) {
            enumC584570MwJXo1 = EnumC584570MwJ.AUTO_SCROLL_STATE_STOP;
        }
        EnumC584570MwJ enumC584570MwJ = EnumC584570MwJ.AUTO_SCROLL_STATE_STOP;
        if (enumC584570MwJXo1 == enumC584570MwJ) {
            iLIZ = 2131826952;
        } else {
            iLIZ = 2131826953;
        }
        InterfaceC1379410m03 interfaceC1379410m03 = this.LLJI;
        if (interfaceC1379410m03 != null) {
            if (enumC584570MwJXo1 == enumC584570MwJ) {
                z = true;
            } else {
                z = false;
            }
            iLIZ = interfaceC1379410m03.LIZ(iLIZ, "auto_scroll", z);
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        if (enumC584570MwJXo1 == enumC584570MwJ) {
            C19252910Tv.LIZIZ.LIZLLL().LJIILL().LJLLLLLL(R.raw.icon_auto_scroll);
            iLIZ2 = R.raw.icon_auto_scroll;
        } else {
            C19252910Tv.LIZIZ.LIZLLL().LJIILL().LJLLLLLL(R.raw.icon_auto_scroll_off);
            iLIZ2 = R.raw.icon_auto_scroll_off;
        }
        InterfaceC1379410m03 interfaceC1379410m032 = this.LLJ;
        if (interfaceC1379410m032 != null) {
            if (enumC584570MwJXo1 == enumC584570MwJ) {
                z2 = true;
            }
            iLIZ2 = interfaceC1379410m032.LIZ(iLIZ2, "auto_scroll", z2);
        }
        c419910GdJ.LIZ = iLIZ2;
        c419910GdJ.LIZLLL = Integer.valueOf(R.attr.a1h);
        return new C1373790lqz(new C1373780lqy(c419910GdJ, iLIZ, true, "auto_scroll"), new AbstractC734730Srv(this, interfaceC1374230lrh) { // from class: X.0lzs
            public final C1379170lzf LLILZ;

            @Override // X.AbstractC734730Srv
            public final boolean LJIIJ() {
                IAutoAScrollAbility iAutoAScrollAbilityLIZIZ2;
                Activity activityLJFF2 = C2214201BlK.LJFF();
                if (!(activityLJFF2 instanceof C19EG) || (iAutoAScrollAbilityLIZIZ2 = C1386360mBG.LIZIZ((C19EG) activityLJFF2)) == null) {
                    return false;
                }
                EnumC584570MwJ enumC584570MwJXo12 = iAutoAScrollAbilityLIZIZ2.xo1();
                if (enumC584570MwJXo12 == null) {
                    enumC584570MwJXo12 = EnumC584570MwJ.AUTO_SCROLL_STATE_STOP;
                }
                return enumC584570MwJXo12 != EnumC584570MwJ.AUTO_SCROLL_STATE_STOP;
            }

            @Override // X.AbstractC1376810lvr
            public final void LIZIZ(View view) {
                String aid;
                Activity activityLJFF2 = C2214201BlK.LJFF();
                if (!(activityLJFF2 instanceof C19EG)) {
                    return;
                }
                Fragment fragment = this.LLILZ.LLILZLL;
                if (fragment != null) {
                    C1578630rBN.LJIIL(fragment, C13LE.LIZ(AutoScrollComponent.class));
                }
                IAutoAScrollAbility iAutoAScrollAbilityLIZIZ2 = C1386360mBG.LIZIZ((C19EG) activityLJFF2);
                if (iAutoAScrollAbilityLIZIZ2 == null) {
                    return;
                }
                EnumC584570MwJ enumC584570MwJXo12 = iAutoAScrollAbilityLIZIZ2.xo1();
                if (enumC584570MwJXo12 == null) {
                    enumC584570MwJXo12 = EnumC584570MwJ.AUTO_SCROLL_STATE_STOP;
                }
                String str = "long_press";
                if (enumC584570MwJXo12 == EnumC584570MwJ.AUTO_SCROLL_STATE_STOP) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", this.LLILLL);
                    String str2 = this.LLILZ.LLILLL;
                    if (str2 != null) {
                        str = str2;
                    }
                    c2344009Gk.LJIIIIZZ("enter_method", str);
                    Aweme aweme5 = this.LLILLJJLI;
                    String authorUid = null;
                    if (aweme5 != null) {
                        authorUid = AwemeExtKt.getAuthorUid(aweme5);
                    }
                    c2344009Gk.LJIIIIZZ("author_id", authorUid);
                    Aweme aweme6 = this.LLILLJJLI;
                    if (aweme6 == null || (aid = aweme6.getAid()) == null) {
                        aid = "";
                    }
                    c2344009Gk.LJIIIIZZ("group_id", aid);
                    if (C1386360mBG.LJIIJ(this.LLILLL)) {
                        c2344009Gk.LJII(C1386360mBG.LJFF());
                    }
                    C20684815ws.LJIILLIIL("turn_on_auto_scroll", c2344009Gk.LIZ);
                    iAutoAScrollAbilityLIZIZ2.lZ(true, false);
                    return;
                }
                String str3 = this.LLILZ.LLILLL;
                if (str3 != null) {
                    str = str3;
                }
                iAutoAScrollAbilityLIZIZ2.qt0(str, true);
            }

            {
                this.LLILZ = this;
            }
        }, true);
    }

    public final C1373800lr0 LJII(InterfaceC1374230lrh interfaceC1374230lrh) {
        int iLIZIZ;
        int iLIZIZ2;
        C589960NBy c589960NBy = C589960NBy.LIZ;
        Aweme aweme = this.LL;
        c589960NBy.getClass();
        if (C589960NBy.LIZ(aweme)) {
            C1D0F c1d0f = C1D0F.LIZ;
            if (c1d0f != null && c1d0f.isConnected()) {
                return null;
            }
            C1386110mAr c1386110mAr = C1386110mAr.LIZ;
            Aweme aweme2 = this.LL;
            String str = this.LLILLJJLI;
            c1386110mAr.getClass();
            C1386110mAr.LJFF(aweme2, str, "long_press");
            InterfaceC1379410m03 interfaceC1379410m03 = this.LLJ;
            if (interfaceC1379410m03 != null) {
                iLIZIZ = interfaceC1379410m03.LIZIZ();
            } else {
                iLIZIZ = R.raw.icon_speed;
            }
            InterfaceC1379410m03 interfaceC1379410m032 = this.LLJI;
            if (interfaceC1379410m032 != null) {
                iLIZIZ2 = interfaceC1379410m032.LIZIZ();
            } else {
                iLIZIZ2 = 2131840511;
            }
            if (C0BYV.LIZ() == 2) {
                return new C1373800lr0(new C1374250lrj(iLIZIZ, iLIZIZ2, "playback_speed", 8), new C1376910lw1(this, interfaceC1374230lrh));
            }
            return new C1373800lr0(new C1374250lrj(iLIZIZ, iLIZIZ2, "playback_speed", 8), new C1376880lvy(this, interfaceC1374230lrh));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0087, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r1, ((X.AbstractC848400XPy) X.C0XQ7.LJFF()).getCurUserId()) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
    
        r0 = r8.LL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008b, code lost:
    
        if (r0 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008d, code lost:
    
        r0 = r0.getAuthor();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
    
        if (r0 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0093, code lost:
    
        X.C1393100mM8.LJFF(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0096, code lost:
    
        r6 = new X.C419910GdJ();
        r0 = r8.LL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009d, code lost:
    
        if (r0 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009f, code lost:
    
        r0 = r0.getAuthor();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a7, code lost:
    
        if (X.C1393100mM8.LIZIZ(r0) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a9, code lost:
    
        r2 = com.zhiliaoapp.musically.R.raw.icon_eye;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ac, code lost:
    
        r0 = r8.LLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b0, code lost:
    
        if (r0 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b2, code lost:
    
        r2 = r0.LIZ(r2, "mute_their_posts", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b6, code lost:
    
        r6.LIZ = r2;
        r6.LJ = java.lang.Integer.valueOf(com.zhiliaoapp.musically.R.attr.a1h);
        r0 = r8.LL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c7, code lost:
    
        if (r0 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c9, code lost:
    
        r7 = r0.getAuthor();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cd, code lost:
    
        r3 = new X.C1373780lqy(r6, X.C1393100mM8.LIZ(r7), true, "mute_their_posts");
        r1 = r8.LLILZLL;
        r0 = r8.LLILZIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e0, code lost:
    
        return new X.C1373790lqz(r3, new X.C1392990mLx(r8, r9, r1, r0), true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e1, code lost:
    
        r2 = com.zhiliaoapp.musically.R.raw.icon_eye_slash;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e5, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r0 == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1373790lqz LJIIIIZZ(final X.InterfaceC1374230lrh r9) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1379170lzf.LJIIIIZZ(X.0lrh):X.0lqz");
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x0283 A[EDGE_INSN: B:199:0x0283->B:172:0x0283 BREAK  A[LOOP:0: B:12:0x003a->B:171:0x027f]] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0230 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC1373870lr7 LJIIIZ(X.InterfaceC1374230lrh r22) {
        /*
            Method dump skipped, instruction units count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1379170lzf.LJIIIZ(X.0lrh):X.0lr7");
    }

    public final C1373910lrB LJIIJ(final InterfaceC1374230lrh interfaceC1374230lrh) {
        int iLIZ;
        int i;
        final String str;
        if (this.LLJILJIL) {
            return null;
        }
        IPipFeedService iPipFeedService = (IPipFeedService) ServiceManager.get().getService(IPipFeedService.class);
        Aweme aweme = this.LL;
        if (aweme == null || !iPipFeedService.LJJI(this.LLILLJJLI, aweme) || !C312230CLt.LJ("panel_pip_component")) {
            return null;
        }
        boolean zLJIJJ = iPipFeedService.LJIJJ();
        InterfaceC1379410m03 interfaceC1379410m03 = this.LLJ;
        if (interfaceC1379410m03 != null) {
            iLIZ = interfaceC1379410m03.LIZ(C1379380m00.LIZ(), "picture_in_picture", zLJIJJ);
        } else {
            iLIZ = C1379380m00.LIZ();
        }
        if (zLJIJJ) {
            i = 2131840067;
        } else {
            i = 2131840068;
        }
        C1374250lrj c1374250lrj = new C1374250lrj(iLIZ, i, "picture_in_picture", 8);
        final String str2 = this.LLILLL;
        if (str2 == null) {
            str2 = "long_press";
        }
        if (zLJIJJ) {
            str = "off";
        } else if (iPipFeedService.LJIL(this.LLILZIL)) {
            str = "on";
        } else {
            str = "authorize";
        }
        return new C1373910lrB(c1374250lrj, new AbstractC736370SuZ(this, interfaceC1374230lrh, str2, str) { // from class: X.0lzt
            public static final /* synthetic */ int LLIZ = 0;
            public final C1379170lzf LLILZ;
            public final String LLILZIL;
            public final String LLILZLL;

            @Override // X.AbstractC1376810lvr
            public final void LIZIZ(View view) {
                String authorUid;
                String groupId;
                Context context;
                ContextWrapper contextWrapper;
                String authorUid2;
                Pair[] pairArr = new Pair[5];
                pairArr[0] = new Pair(this.LLILZIL, "panel_source");
                pairArr[1] = new Pair(this.LLILLL, "enter_from");
                Aweme aweme2 = this.LLILLJJLI;
                String groupId2 = null;
                if (aweme2 != null) {
                    groupId2 = aweme2.getGroupId();
                }
                String str3 = "";
                if (groupId2 == null) {
                    groupId2 = "";
                }
                pairArr[2] = new Pair(groupId2, "group_id");
                Aweme aweme3 = this.LLILLJJLI;
                if (aweme3 == null || (authorUid = AwemeExtKt.getAuthorUid(aweme3)) == null) {
                    authorUid = "";
                }
                pairArr[3] = new Pair(authorUid, "author_id");
                pairArr[4] = new Pair(this.LLILZLL, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                C20684815ws.LJIJI("click_floating_window", pairArr);
                Fragment fragment = this.LLILZ.LLILZLL;
                if (fragment != null) {
                    C1578630rBN.LJIIL(fragment, C13LE.LIZ(RecommendFeedPipComponent.class));
                }
                Pair[] pairArr2 = new Pair[2];
                Aweme aweme4 = this.LLILLJJLI;
                if (aweme4 == null || (groupId = aweme4.getGroupId()) == null) {
                    groupId = "";
                }
                pairArr2[0] = new Pair("group_id", groupId);
                Aweme aweme5 = this.LLILLJJLI;
                if (aweme5 != null && (authorUid2 = AwemeExtKt.getAuthorUid(aweme5)) != null) {
                    str3 = authorUid2;
                }
                pairArr2[1] = new Pair("author_id", str3);
                Map<String, String> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr2);
                Context context2 = view.getContext();
                if (!(context2 instanceof ContextWrapper) || (contextWrapper = (ContextWrapper) context2) == null || (context = contextWrapper.getBaseContext()) == null) {
                    context = view.getContext();
                }
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                if (c19egLIZIZ != null) {
                    IPipFeedService iPipFeedService2 = (IPipFeedService) ServiceManager.get().getService(IPipFeedService.class);
                    if (iPipFeedService2.LJIJJ()) {
                        iPipFeedService2.LJIIIIZZ(c19egLIZIZ, this.LLILLL);
                    } else {
                        iPipFeedService2.LIZIZ(c19egLIZIZ, this.LLILLL, mapLJIIIIZZ);
                    }
                }
            }

            {
                this.LLILZ = this;
                this.LLILZIL = str2;
                this.LLILZLL = str;
            }
        }, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1373790lqz LJIIJJI(final X.InterfaceC1374230lrh r12) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1379170lzf.LJIIJJI(X.0lrh):X.0lqz");
    }

    public final C1373910lrB LJIIL(InterfaceC1374230lrh interfaceC1374230lrh) {
        int i;
        if (C729980SkG.LJIIIIZZ(this.LL)) {
            return null;
        }
        if (C736340SuW.LIZJ()) {
            i = R.raw.icon_exclamation_mark_triangle;
        } else if (C736340SuW.LIZ() == 3) {
            i = R.raw.icon_exclamation_mark_bubble;
        } else {
            i = R.raw.icon_flag;
        }
        return new C1373910lrB(new C1374250lrj(i, R.string.s65, "report", 8), new C736280SuQ(this, interfaceC1374230lrh), true);
    }

    public final C1373790lqz LJIILIIL(final InterfaceC1374230lrh interfaceC1374230lrh) {
        int iLIZJ;
        C419910GdJ c419910GdJ = new C419910GdJ();
        InterfaceC1379410m03 interfaceC1379410m03 = this.LLJ;
        int iLIZ = R.raw.icon_text_latin;
        if (interfaceC1379410m03 != null) {
            iLIZ = interfaceC1379410m03.LIZ(R.raw.icon_text_latin, "captions", true);
        }
        c419910GdJ.LIZ = iLIZ;
        c419910GdJ.LIZLLL = Integer.valueOf(R.attr.a1h);
        LJIJ();
        if (C161N.LIZIZ.LJIJI(this.LL)) {
            iLIZJ = 2131828833;
        } else {
            InterfaceC1379410m03 interfaceC1379410m032 = this.LLJI;
            if (interfaceC1379410m032 != null) {
                iLIZJ = interfaceC1379410m032.LIZJ(2131828821, "captions");
            } else {
                iLIZJ = 2131828821;
            }
        }
        return new C1373790lqz(new C1373780lqy(c419910GdJ, iLIZJ, true, "captions"), new AbstractC736370SuZ(interfaceC1374230lrh) { // from class: X.0SsX
            @Override // X.AbstractC1376810lvr
            public final void LIZIZ(View view) {
                String aid;
                Aweme aweme = this.LLILLJJLI;
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                C1440005kM.LIZ(new C715480S4s(aid, this.LLILLL, EnumC1390800mIQ.LONG_PRESS, System.identityHashCode(C1388190mED.LIZ(this.LLILZ.LLILZIL))));
            }
        }, true);
    }

    public final C1373790lqz LJIILJJIL(InterfaceC1374230lrh interfaceC1374230lrh) {
        Aweme aweme = this.LL;
        if (aweme != null) {
            if (C1618440sDa.LIZIZ.LJIJJLI().LJIJI(aweme, false)) {
                if (!AwemeSaaSExtKt.isLive(aweme) && C298550Bn3.LIZ()) {
                    return null;
                }
                C419910GdJ c419910GdJ = new C419910GdJ();
                InterfaceC1379410m03 interfaceC1379410m03 = this.LLJ;
                int iLIZ = R.raw.icon_twinkle_star_fill;
                if (interfaceC1379410m03 != null) {
                    iLIZ = interfaceC1379410m03.LIZ(R.raw.icon_twinkle_star_fill, "share_to_story", true);
                }
                c419910GdJ.LIZ = iLIZ;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                return new C1373790lqz(new C1373780lqy(c419910GdJ, 2131847917, true, "share_to_story"), new C1375750lu9(this, interfaceC1374230lrh), true);
            }
            return null;
        }
        C729510SjV.LJJJ(EnumC729530SjX.AWEME_NULL);
        return null;
    }

    public final C1373910lrB LJIILL(final InterfaceC1374230lrh interfaceC1374230lrh) {
        InterfaceC1379410m03 interfaceC1379410m03 = this.LLJI;
        int iLIZJ = 2131838779;
        if (interfaceC1379410m03 != null) {
            iLIZJ = interfaceC1379410m03.LIZJ(2131838779, "danmaku");
        }
        return new C1373910lrB(new C1374250lrj(R.raw.icon_danmu, iLIZJ, "danmaku", 8), new AbstractC736370SuZ(this, interfaceC1374230lrh) { // from class: X.0lzv
            public static final /* synthetic */ int LLILZIL = 0;
            public final C1379170lzf LLILZ;

            @Override // X.AbstractC1376810lvr
            public final void LIZJ() {
                C1383760m74 c1383760m74 = C1383760m74.LIZIZ;
                C1379170lzf c1379170lzf = this.LLILZ;
                c1383760m74.LJIL(c1379170lzf.LL, c1379170lzf.LLILLJJLI, true);
            }

            @Override // X.AbstractC1376810lvr
            public final void LIZIZ(View view) {
                C19EG activity;
                C1383760m74 c1383760m74 = C1383760m74.LIZIZ;
                Fragment fragment = this.LLILZ.LLILZLL;
                if (fragment != null) {
                    activity = fragment.getActivity();
                } else {
                    activity = null;
                }
                C1379170lzf c1379170lzf = this.LLILZ;
                c1383760m74.LJJI(activity, c1379170lzf.LLILLJJLI, c1379170lzf.LL);
                C1379170lzf c1379170lzf2 = this.LLILZ;
                c1383760m74.LJIJI(c1379170lzf2.LL, c1379170lzf2.LLILLJJLI);
            }

            {
                this.LLILZ = this;
            }
        }, true);
    }

    public final C1373910lrB LJIILLIIL(final InterfaceC1374230lrh interfaceC1374230lrh) {
        int iLIZ;
        int i;
        final boolean zLJJII = C1383760m74.LIZIZ.LJJII();
        if (zLJJII) {
            iLIZ = R.raw.icon_danmu_slash_fill;
        } else {
            iLIZ = R.raw.icon_danmu_fill;
        }
        InterfaceC1379410m03 interfaceC1379410m03 = this.LLJ;
        if (interfaceC1379410m03 != null) {
            iLIZ = interfaceC1379410m03.LIZ(iLIZ, "danmaku", zLJJII);
        }
        if (zLJJII) {
            i = 2131827581;
        } else {
            i = 2131827580;
        }
        return new C1373910lrB(new C1374250lrj(iLIZ, i, "danmaku", 8), new AbstractC736370SuZ(this, interfaceC1374230lrh, zLJJII) { // from class: X.0lzx
            public static final /* synthetic */ int LLILZLL = 0;
            public final boolean LLILZ;
            public final C1379170lzf LLILZIL;

            @Override // X.AbstractC1376810lvr
            public final void LIZIZ(View view) {
                boolean z = !this.LLILZ;
                C1383760m74 c1383760m74 = C1383760m74.LIZIZ;
                C1379170lzf c1379170lzf = this.LLILZIL;
                c1383760m74.LJIJ(c1379170lzf.LL, c1379170lzf.LLILLJJLI, z);
            }

            {
                this.LLILZ = zLJJII;
                this.LLILZIL = this;
                C1383760m74.LIZIZ.LJIL(this.LL, this.LLILLJJLI, zLJJII);
            }
        }, true);
    }

    @Override // X.C0HTT
    public final /* bridge */ /* synthetic */ void LLIIL(C737030Svd c737030Svd) {
    }

    public C1379170lzf(Aweme aweme, String str, String str2, String str3, Context context, Fragment fragment, String str4, C1379210lzj c1379210lzj, C1379370lzz c1379370lzz, String str5, Long l, String str6, String str7, Integer num, String str8, boolean z, int i) {
        long jLongValue;
        int iIntValue;
        Bundle arguments;
        String str9 = str4;
        String str10 = str3;
        boolean z2 = z;
        String str11 = str8;
        String str12 = str6;
        String str13 = str5;
        C1379370lzz c1379370lzz2 = c1379370lzz;
        String str14 = str7;
        C1379210lzj c1379210lzj2 = c1379210lzj;
        String str15 = (i & 4) != 0 ? null : str2;
        str10 = (i & 8) != 0 ? null : str10;
        str9 = (i & 128) != 0 ? "" : str9;
        c1379210lzj2 = (i & 256) != 0 ? null : c1379210lzj2;
        c1379370lzz2 = (i & 512) != 0 ? null : c1379370lzz2;
        str13 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str13;
        l = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : l;
        str12 = (i & 8192) != 0 ? null : str12;
        str14 = (i & 16384) != 0 ? null : str14;
        num = (32768 & i) != 0 ? 0 : num;
        str11 = (65536 & i) != 0 ? null : str11;
        z2 = (i & 131072) != 0 ? false : z2;
        this.LL = aweme;
        this.LLILLJJLI = str;
        this.LLILLL = str15;
        this.LLILZ = str10;
        this.LLILZIL = context;
        this.LLILZLL = fragment;
        this.LLIZ = null;
        this.LLIZLLLIL = str9;
        this.LLJ = c1379210lzj2;
        this.LLJI = c1379370lzz2;
        this.LLJIJIL = str11;
        this.LLJILJIL = z2;
        ShareService shareService = C621180OYa.LIZ;
        C844470XAv.LIZ.getClass();
        AwemeSharePackage awemeSharePackageLJJJLIIL = shareService.LJJJLIIL(0, C844470XAv.LIZ(), aweme, str, "long_press", "long_press");
        C786410Ut5.LJJJI("from_page", str10, awemeSharePackageLJJJLIIL.extras);
        C786410Ut5.LJJJI("explore_from_group_id", str13, awemeSharePackageLJJJLIIL.extras);
        Bundle bundle = awemeSharePackageLJJJLIIL.extras;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        bundle.putLong("explore_topic_id", jLongValue);
        C786410Ut5.LJJJI("explore_topic", str12, awemeSharePackageLJJJLIIL.extras);
        C786410Ut5.LJJJI("from_explore_page", str14, awemeSharePackageLJJJLIIL.extras);
        Bundle bundle2 = awemeSharePackageLJJJLIIL.extras;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        bundle2.putInt("is_enter_graphic_detail", iIntValue);
        if (fragment != null && (arguments = fragment.getArguments()) != null) {
            String string = arguments.getString("conversation_id");
            if (string != null) {
                C786410Ut5.LJJJI("conversation_id", string, awemeSharePackageLJJJLIIL.extras);
            }
            int i2 = arguments.getInt("chat_type", -1);
            if (i2 != -1) {
                C786410Ut5.LJJJI("chat_type", C892380Yzc.LIZJ.get(Integer.valueOf(i2)), awemeSharePackageLJJJLIIL.extras);
            }
            String string2 = arguments.getString("previous_page");
            if (string2 != null && Intrinsics.LJFF(string2, "chat_settings")) {
                C786410Ut5.LJJJI("previous_page", "chat_settings", awemeSharePackageLJJJLIIL.extras);
            }
        }
        this.LLJILJILJ = awemeSharePackageLJJJLIIL;
    }
}
