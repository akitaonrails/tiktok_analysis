package X;

import Y.AfS178S0100000_9;
import Y.AfS197S0100000_28;
import android.content.Context;
import android.os.SystemClock;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.api.IAnchorBusinessApi;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.api.RemoveTemplateApi;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.v2.items.visibility.VideoVisibilityViewModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CMPreviewInfo;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.StandardBusinessModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.StoryKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.aweme.subscription.preview.SubscriptionPreviewService;
import com.ss.android.ugc.tiktok.tpsc.privacy.video.model.VideoPrivateUrlModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.SoftReference;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.AwS272S0300000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS9S0211000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10A6, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10A6 extends AnonymousClass1097 {
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public String LLJJIJIL;
    public final SubscriptionPreviewService LLJJJ;
    public SoftReference<Fragment> LLJJJIL;
    public C10AP LLJJJJ;

    @Override // X.AnonymousClass1097, X.C109N
    public final String LJIJJLI() {
        return "video_visibility";
    }

    public final Aweme LJJJIL() {
        return (Aweme) this.LLJJI.getValue();
    }

    public final String LJJJJ() {
        return (String) this.LLJILJILJ.getValue();
    }

    @Override // X.C109N
    /* JADX INFO: renamed from: LJJJJI, reason: merged with bridge method [inline-methods] */
    public final VideoVisibilityViewModel LJJI() {
        return (VideoVisibilityViewModel) this.LLJJIJIIJIL.getValue();
    }

    @Override // X.C109N, X.AbstractC191843103l
    public final void LJII() {
        Aweme awemeLJJJIL;
        ContentModel contentModel;
        StandardBusinessModel standardBusinessModel;
        CMPreviewInfo cmPreviewInfo;
        Long previewSettingsDuration;
        super.LJII();
        if (C10AA.LIZIZ(LJJJIL()) || (awemeLJJJIL = LJJJIL()) == null || !awemeLJJJIL.isSubOnlyVideo() || !C298670BnF.LIZ()) {
            return;
        }
        C10AI c10ai = C10AI.LIZ;
        String strLJJJJ = LJJJJ();
        Aweme awemeLJJJIL2 = LJJJIL();
        long jLongValue = (awemeLJJJIL2 == null || (contentModel = awemeLJJJIL2.getContentModel()) == null || (standardBusinessModel = contentModel.standardBusinessModel) == null || (cmPreviewInfo = standardBusinessModel.getCmPreviewInfo()) == null || (previewSettingsDuration = cmPreviewInfo.getPreviewSettingsDuration()) == null) ? 0L : previewSettingsDuration.longValue();
        c10ai.getClass();
        C10AI.LIZIZ(jLongValue, strLJJJJ);
        LJJI().LLJI.LIZ(C19210910Dr.LIZ.LJJLJLI(new AfS197S0100000_28(this, 52)));
        LJJI().LLJ.observe(this.LLJI.LIZJ, new Observer() { // from class: X.0vLP
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                Fragment fragment;
                ((Boolean) obj).booleanValue();
                SoftReference<Fragment> softReference = this.LL.LLJJJIL;
                if (softReference != null && (fragment = softReference.get()) != null) {
                    String str = TuxSheet._pnsPageId;
                    C1391190mJ3.LJFF(fragment, C343970De7.LIZ);
                }
            }
        });
    }

    @Override // X.AnonymousClass1097, X.C109N
    public final Integer LJIJJ() {
        return LJIL().LLILZ.get(this.LLJIJIL.LJIIIZ);
    }

    public final void LJJJJJL() {
        final Aweme awemeLJJJIL;
        Long previewSettingsDuration;
        ContentModel contentModel;
        StandardBusinessModel standardBusinessModel;
        Aweme awemeLJJJIL2 = LJJJIL();
        CMPreviewInfo cmPreviewInfo = (awemeLJJJIL2 == null || (contentModel = awemeLJJJIL2.getContentModel()) == null || (standardBusinessModel = contentModel.standardBusinessModel) == null) ? null : standardBusinessModel.getCmPreviewInfo();
        C10AI c10ai = C10AI.LIZ;
        String strLJJJJ = LJJJJ();
        long jLongValue = (cmPreviewInfo == null || (previewSettingsDuration = cmPreviewInfo.getPreviewSettingsDuration()) == null) ? 0L : previewSettingsDuration.longValue();
        c10ai.getClass();
        C10AI.LIZ(jLongValue, strLJJJJ);
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LLJI.LIZ);
        if (c19egLIZIZ == null || (awemeLJJJIL = LJJJIL()) == null) {
            return;
        }
        C10FW c10fw = new C10FW(new C10FX(awemeLJJJIL) { // from class: X.0ihk
            public final Aweme LIZ;
            public final InterfaceC1484830ok5 LIZIZ;
            public boolean LIZJ;

            @Override // X.C10FX
            public final void LIZIZ() {
                this.LIZIZ.pause();
            }

            @Override // X.C10FX
            public final Integer LIZJ() {
                return Integer.valueOf((int) this.LIZIZ.LJIIIZ().getCurrentPosition());
            }

            @Override // X.C10FX
            public final Integer LIZLLL() {
                Video video = this.LIZ.getVideo();
                return Integer.valueOf(video != null ? video.getVideoLength() : 0);
            }

            @Override // X.C10FX
            public final void LJ() {
                this.LIZIZ.resume();
            }

            @Override // X.C10FX
            public final void onDestroy() {
                this.LIZIZ.stop();
                this.LIZIZ.release();
                this.LIZJ = false;
            }

            @Override // X.C10FX
            public final boolean isInitialized() {
                return this.LIZJ;
            }

            {
                this.LIZ = awemeLJJJIL;
                C1478410oZj c1478410oZj = new C1478410oZj();
                c1478410oZj.LIZIZ = true;
                this.LIZIZ = C582130MsN.LIZ().LIZJ(c1478410oZj);
            }

            @Override // X.C10FX
            public final void LJFF(float f) {
                Video video = this.LIZ.getVideo();
                if (video != null) {
                    this.LIZIZ.seek((f / C10FS.LIZLLL(video.getVideoLength())) * 100);
                }
            }

            public static C1482580ogS LJI(C1482580ogS c1482580ogS, VideoUrlModel videoUrlModel) {
                if (videoUrlModel == null) {
                    return c1482580ogS;
                }
                c1482580ogS.getClass();
                C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
                c1058540deW.LIZIZ = videoUrlModel.getUrlKey();
                c1058540deW.LIZJ = videoUrlModel.isBytevc1() ? 1 : 0;
                c1058540deW.LIZLLL = videoUrlModel.getUrlList();
                c1058540deW.LJ = videoUrlModel.getSize();
                c1058540deW.LJFF = videoUrlModel.getaK();
                return c1058540deW.LIZ();
            }

            @Override // X.C10FX
            public final void LIZ(LifecycleOwner lifecycleOwner, final AbstractC1211760hde abstractC1211760hde) {
                if (!(abstractC1211760hde instanceof C1211750hdd)) {
                    return;
                }
                this.LIZIZ.LIZJ(new InterfaceC1483820oiS() { // from class: X.0if2
                    @Override // X.InterfaceC1483820oiS
                    public final /* synthetic */ boolean bn() {
                        return true;
                    }

                    @Override // X.InterfaceC1483820oiS
                    public final /* synthetic */ InterfaceC1473950oSX getCustomSurfaceLifecycleListener() {
                        return null;
                    }

                    @Override // X.InterfaceC1483820oiS
                    public final /* synthetic */ Surface getSurface() {
                        return null;
                    }

                    @Override // X.InterfaceC1483820oiS
                    public final /* synthetic */ void hj() {
                    }

                    @Override // X.InterfaceC1483820oiS
                    public final /* synthetic */ void pe() {
                    }

                    @Override // X.InterfaceC1483820oiS
                    public final HashMap getParams() {
                        return new HashMap();
                    }

                    @Override // X.InterfaceC1483820oiS
                    public final FrameLayout getPlayViewContainer() {
                        return ((C1211750hdd) abstractC1211760hde).LIZ;
                    }
                });
                InterfaceC1484830ok5 interfaceC1484830ok5 = this.LIZIZ;
                Aweme aweme = this.LIZ;
                C1482580ogS c1482580ogS = new C1482580ogS();
                String aid = aweme.getAid();
                if (aid == null) {
                    aid = "";
                }
                c1482580ogS.LIZ = aid;
                if (aweme.getVideo() != null) {
                    c1482580ogS = LJI(LJI(c1482580ogS, aweme.getVideo().getPlayAddrH264()), aweme.getVideo().getPlayAddrBytevc1());
                }
                C1482570ogR c1482570ogRLIZ = c1482580ogS.LIZ();
                C1482580ogS c1482580ogS2 = c1482570ogRLIZ.LIZ;
                c1482580ogS2.LJ = c1482570ogRLIZ;
                interfaceC1484830ok5.LJ(new C1484680ojq(c1482580ogS2).LIZ());
                this.LIZJ = true;
            }
        }, new C1868050yiB(awemeLJJJIL), LJJJJ());
        SubscriptionPreviewService subscriptionPreviewService = this.LLJJJ;
        this.LLJJJIL = new SoftReference<>(subscriptionPreviewService != null ? subscriptionPreviewService.LIZLLL(c19egLIZIZ.getSupportFragmentManager(), c10fw) : null);
    }

    @Override // X.C109N
    public final List<AbstractC191840103i> LJIILIIL(List<AbstractC191840103i> list) {
        List<AnchorCommonStruct> anchors;
        Aweme awemeLJJJIL = LJJJIL();
        if (awemeLJJJIL != null && (anchors = awemeLJJJIL.getAnchors()) != null && !anchors.isEmpty() && C1395130mPP.LIZLLL(awemeLJJJIL) && ((IAnchorBusinessApi) ServiceManager.get().getService(IAnchorBusinessApi.class)).LJIIJ(awemeLJJJIL, EnumC1430380nKG.ANCHOR_PUGC_TEMPLATE)) {
            ((ArrayList) list).add(new C103Y());
        }
        ((ArrayList) list).add(new AnonymousClass1042(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
        return list;
    }

    @Override // X.C109N
    public final boolean LJIJ(boolean z) {
        Aweme awemeLJJJIL;
        Story story;
        Aweme awemeLJJJIL2 = LJJJIL();
        Type type = C10AA.LIZ;
        if (!C729510SjV.LJJIJIL(awemeLJJJIL2) || (C1618440sDa.LIZIZ.LJJIIJZLJL() && C729980SkG.LJIIIIZZ(LJJJIL()) && (((awemeLJJJIL = LJJJIL()) == null || (story = awemeLJJJIL.getStory()) == null || !StoryKt.isExpired(story)) && !Intrinsics.LJFF("story_archive", LJJJJ())))) {
            return true;
        }
        return false;
    }

    public final void LJJJ(int i) {
        int iIntValue;
        Aweme awemeLJJJIL = LJJJIL();
        if (awemeLJJJIL != null) {
            Integer value = LJJI().LLILLL.getValue();
            boolean zLIZLLL = false;
            if (value == null || value.intValue() != i) {
                C10A4 c10a4 = C10A4.LIZ;
                Integer value2 = LJJI().LLILLL.getValue();
                if (value2 != null) {
                    iIntValue = value2.intValue();
                } else {
                    iIntValue = 0;
                }
                String strLJJJJ = LJJJJ();
                String str = (String) this.LLJILLL.getValue();
                String str2 = (String) this.LLJJ.getValue();
                this.LLJJIII.getValue().getClass();
                long jCurrentTimeMillis = System.currentTimeMillis() - 0;
                Aweme awemeLJJJIL2 = LJJJIL();
                if (awemeLJJJIL2 != null) {
                    zLIZLLL = C1395130mPP.LIZLLL(awemeLJJJIL2);
                }
                c10a4.getClass();
                C10A4.LJFF(awemeLJJJIL, iIntValue, i, strLJJJJ, str, str2, jCurrentTimeMillis, zLIZLLL, null);
            }
        }
        LJJI().wQ2(i, null, new C109R(this), new C1215130hj5(this));
    }

    public final String LJJJI(Long l) {
        long jLongValue;
        if (C08A4.LIZIZ(l)) {
            Context context = this.LLJI.LIZ;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            return C06LR.LIZ(jLongValue, context);
        }
        return null;
    }

    public final void LJJJJJ(Context context) {
        C19EG c19egLIZIZ;
        Fragment fragmentLIZJ;
        if (C287230BNp.LIZ()) {
            Aweme awemeLJJJIL = LJJJIL();
            if (awemeLJJJIL != null && awemeLJJJIL.getAwemeType() == 0) {
                LJJJJJL();
                return;
            }
            Aweme awemeLJJJIL2 = LJJJIL();
            if (awemeLJJJIL2 == null || !AwemeExtKt.isPhotoMode(awemeLJJJIL2) || (c19egLIZIZ = C1388190mED.LIZIZ(this.LLJI.LIZ)) == null || LJJJIL() == null) {
                return;
            }
            C19201510Ab c19201510Ab = new C19201510Ab(new C1868090yiF(LJJJIL()), LJJJJ());
            SubscriptionPreviewService subscriptionPreviewService = this.LLJJJ;
            if (subscriptionPreviewService != null) {
                fragmentLIZJ = subscriptionPreviewService.LIZJ(c19egLIZIZ.getSupportFragmentManager(), c19201510Ab, C497820Jfg.LIZ(context));
            } else {
                fragmentLIZJ = null;
            }
            this.LLJJJIL = new SoftReference<>(fragmentLIZJ);
            return;
        }
        LJJJJJL();
    }

    public C10A6(C191848103q c191848103q, C107N c107n) {
        String string;
        Aweme awemeLJJJIL;
        PlayListInfo playListInfo;
        String mixName;
        super(c191848103q, c107n);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 693));
        this.LLJILLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 694));
        this.LLJJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 695));
        this.LLJJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 691));
        this.LLJJIII = C452501pT.LIZIZ(new AwS572S0100000_28(c191848103q, 692));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS429S0200000_28(this, c191848103q, 77));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS272S0300000_28(c191848103q, c107n, this, 8));
        Integer value = LJJI().LLILLL.getValue();
        if (value != null && value.intValue() == 0 && (awemeLJJJIL = LJJJIL()) != null && (playListInfo = awemeLJJJIL.playlist_info) != null && (mixName = playListInfo.getMixName()) != null && C123100dR.LIZ(mixName)) {
            string = this.LLJI.LIZ.getString(2131838198, mixName);
        } else {
            string = "";
        }
        this.LLJJIJIL = string;
        this.LLJJJ = (SubscriptionPreviewService) PluggableExtentionKt.pluggableSpi$default(SubscriptionPreviewService.class, false, false, false, 14, null);
    }

    @Override // X.C109N
    public final CharSequence LJIIZILJ(Context context, CharSequence charSequence) {
        int i;
        C548590LfN.LIZ.getClass();
        if (C548590LfN.LIZLLL().LJII(LJJJIL())) {
            i = 2131826083;
        } else {
            Aweme awemeLJJJIL = LJJJIL();
            Type type = C10AA.LIZ;
            if ((awemeLJJJIL != null && AwemeExtKt.isPhotoMode(awemeLJJJIL)) || C729510SjV.LJJIJIL(LJJJIL())) {
                i = 2131844965;
            } else {
                i = 2131850517;
            }
        }
        return context.getString(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0133  */
    @Override // X.C109N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJII(int r9, android.view.View r10) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10A6.LJJII(int, android.view.View):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // X.AnonymousClass1097, X.C109N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIII(int r9, android.view.View r10) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10A6.LJJIII(int, android.view.View):boolean");
    }

    @Override // X.C109N
    public final void LJJIIJ(int i, View view) {
        Integer numValueOf;
        if ((i != 0 && i != 1 && i != 2 && i != 4) || (numValueOf = Integer.valueOf(i)) == null) {
            return;
        }
        numValueOf.intValue();
        LJJJ(numValueOf.intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x013a  */
    @Override // X.AnonymousClass1097
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List LJJIJIIJIL(int r20, X.C109B r21) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10A6.LJJIJIIJIL(int, X.109B):java.util.List");
    }

    @Override // X.AnonymousClass1097
    public final boolean LJJIL(int i, boolean z) {
        if (i == 3) {
            Aweme awemeLJJJIL = LJJJIL();
            if (awemeLJJJIL == null || !awemeLJJJIL.isSubOnlyVideo()) {
                return false;
            }
            return true;
        }
        return z;
    }

    public final void LJJJJIZL(int i, boolean z) {
        Aweme awemeLJJJIL = LJJJIL();
        if (awemeLJJJIL != null) {
            RemoveTemplateApi removeTemplateApi = RemoveTemplateApi.LIZ;
            C844470XAv.LIZ.getClass();
            String strValueOf = String.valueOf(C844470XAv.LJIIJ);
            String aid = awemeLJJJIL.getAid();
            String str = "";
            if (aid == null) {
                aid = "";
            }
            List<AnchorCommonStruct> anchors = awemeLJJJIL.getAnchors();
            int i2 = 1;
            if (anchors != null) {
                for (AnchorCommonStruct anchorCommonStruct : anchors) {
                    if (anchorCommonStruct.getType() == i) {
                        String id = anchorCommonStruct.getId();
                        if (id != null) {
                            str = id;
                        }
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            if (!z) {
                i2 = 2;
            }
            AwS9S0211000_28 awS9S0211000_28 = new AwS9S0211000_28(this, awemeLJJJIL, i, z, 0);
            removeTemplateApi.getClass();
            RemoveTemplateApi.LIZIZ.postTemplateRemove(strValueOf, aid, str, i2).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS178S0100000_9(awS9S0211000_28, 7), new C09JN() { // from class: X.00Na
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("RemoveTemplateApi@f104.requestRemoveTemplate$2");
                    C1C7U.LIZIZ("RemoveTemplateApi@f104.requestRemoveTemplate$2");
                }
            });
        }
    }

    @Override // X.AnonymousClass1097, X.C109N
    public final void LJJIIZ(int i, int i2, BaseResponse baseResponse) {
        VideoPrivateUrlModel videoPrivateUrlModel;
        super.LJJIIZ(i, i2, baseResponse);
        Aweme awemeLJJJIL = LJJJIL();
        if (awemeLJJJIL != null) {
            C10AA.LJFF(i2, awemeLJJJIL);
        }
        Integer numLJIJJ = LJIJJ();
        if (numLJIJJ != null) {
            i = numLJIJJ.intValue();
        }
        LJJI().LLIZ.postValue(Integer.valueOf(i2));
        IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
        if (iAwemeService != null) {
            iAwemeService.LLILLL(LJJJIL());
        }
        Aweme awemeLJJJIL2 = LJJJIL();
        String aid = null;
        if (awemeLJJJIL2 != null) {
            if (baseResponse instanceof VideoPrivateUrlModel) {
                videoPrivateUrlModel = (VideoPrivateUrlModel) baseResponse;
            } else {
                videoPrivateUrlModel = null;
            }
            C10AA.LIZLLL(i2, i, awemeLJJJIL2, videoPrivateUrlModel);
        }
        long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        new C1061730djf();
        Pair[] pairArr = new Pair[2];
        Aweme awemeLJJJIL3 = LJJJIL();
        if (awemeLJJJIL3 != null) {
            aid = awemeLJJJIL3.getAid();
        }
        pairArr[0] = new Pair("aweme_id", aid);
        pairArr[1] = new Pair("private_status", C2097608Jq.LJIIIIZZ(new Pair("from", Integer.valueOf(i)), new Pair("to", Integer.valueOf(i2))));
        C1548820qPI.LIZIZ(new C397901gf(jCurrentThreadTimeMillis, C1061730djf.LIZLLL(C2097908Jt.LIZJ(new Pair("changeset", Collections.singletonList(C2097608Jq.LJIIIIZZ(pairArr))))), "aweme_struct_field_change"));
        Aweme awemeLJJJIL4 = LJJJIL();
        if (awemeLJJJIL4 != null && C1395130mPP.LJ(EnumC1430380nKG.ANCHOR_PUGC_TEMPLATE.getTYPE(), awemeLJJJIL4)) {
            if (i2 != 0) {
                Aweme awemeLJJJIL5 = LJJJIL();
                if (awemeLJJJIL5 == null || !C1395130mPP.LJI(EnumC1430380nKG.ANCHOR_PUGC_TEMPLATE.getTYPE(), awemeLJJJIL5)) {
                    LJJJJIZL(EnumC1430380nKG.ANCHOR_PUGC_TEMPLATE.getTYPE(), true);
                }
            } else {
                Aweme awemeLJJJIL6 = LJJJIL();
                if (awemeLJJJIL6 != null && C1395130mPP.LJI(EnumC1430380nKG.ANCHOR_PUGC_TEMPLATE.getTYPE(), awemeLJJJIL6)) {
                    LJJJJIZL(EnumC1430380nKG.ANCHOR_PUGC_TEMPLATE.getTYPE(), false);
                }
            }
        } else {
            Aweme awemeLJJJIL7 = LJJJIL();
            if (awemeLJJJIL7 != null && C1395130mPP.LJ(EnumC1430380nKG.ANCHOR_UGC_TEMPLATE.getTYPE(), awemeLJJJIL7)) {
                if (i2 != 0) {
                    Aweme awemeLJJJIL8 = LJJJIL();
                    if (awemeLJJJIL8 == null || !C1395130mPP.LJI(EnumC1430380nKG.ANCHOR_UGC_TEMPLATE.getTYPE(), awemeLJJJIL8)) {
                        LJJJJIZL(EnumC1430380nKG.ANCHOR_UGC_TEMPLATE.getTYPE(), true);
                    }
                } else {
                    Aweme awemeLJJJIL9 = LJJJIL();
                    if (awemeLJJJIL9 != null && C1395130mPP.LJI(EnumC1430380nKG.ANCHOR_UGC_TEMPLATE.getTYPE(), awemeLJJJIL9)) {
                        LJJJJIZL(EnumC1430380nKG.ANCHOR_UGC_TEMPLATE.getTYPE(), false);
                    }
                }
            }
        }
        Aweme awemeLJJJIL10 = LJJJIL();
        if (awemeLJJJIL10 != null && C1395130mPP.LJ(EnumC1430380nKG.ANCHOR_PHOTO_MODE_TEMPLATE.getTYPE(), awemeLJJJIL10)) {
            if (i2 != 0) {
                Aweme awemeLJJJIL11 = LJJJIL();
                if (awemeLJJJIL11 == null || !C1395130mPP.LJI(EnumC1430380nKG.ANCHOR_PHOTO_MODE_TEMPLATE.getTYPE(), awemeLJJJIL11)) {
                    LJJJJIZL(EnumC1430380nKG.ANCHOR_PHOTO_MODE_TEMPLATE.getTYPE(), true);
                }
            } else {
                Aweme awemeLJJJIL12 = LJJJIL();
                if (awemeLJJJIL12 != null && C1395130mPP.LJI(EnumC1430380nKG.ANCHOR_PHOTO_MODE_TEMPLATE.getTYPE(), awemeLJJJIL12)) {
                    LJJJJIZL(EnumC1430380nKG.ANCHOR_PHOTO_MODE_TEMPLATE.getTYPE(), false);
                }
            }
        }
        if (C1395130mPP.LIZJ(LJJJIL())) {
            if (i2 != 0) {
                if (!C1395130mPP.LJFF(LJJJIL())) {
                    C1395130mPP.LJII(LJJJIL(), true);
                    C1440005kM.LIZ(new C1219900hqm());
                    Aweme awemeLJJJIL13 = LJJJIL();
                    if (awemeLJJJIL13 != null) {
                        C1440005kM.LIZ(new C586090Myl(awemeLJJJIL13));
                        return;
                    }
                    return;
                }
                return;
            }
            if (!C1395130mPP.LJFF(LJJJIL())) {
                return;
            }
            C1395130mPP.LJII(LJJJIL(), false);
            C1440005kM.LIZ(new C1219900hqm());
            Aweme awemeLJJJIL14 = LJJJIL();
            if (awemeLJJJIL14 == null) {
                return;
            }
            C1440005kM.LIZ(new C586090Myl(awemeLJJJIL14));
        }
    }

    @Override // X.AnonymousClass1097
    public final CharSequence LJJIJIL(Context context, CharSequence charSequence, int i) {
        String aid;
        if (i != 0) {
            if (i != 2) {
                return charSequence;
            }
            String string = this.LLJI.LIZ.getString(2131829275);
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "pns_display_number_of_friends", false) == 1) {
                boolean zLJJIZ = LJJIZ(i);
                Context context2 = this.LLJI.LIZ;
                Aweme awemeLJJJIL = LJJJIL();
                if (awemeLJJJIL != null) {
                    aid = awemeLJJJIL.getAid();
                } else {
                    aid = null;
                }
                return C10AE.LIZ(string, zLJJIZ, context2, aid, null, LJJJJ(), true);
            }
            return string;
        }
        if (C10AA.LIZIZ(LJJJIL())) {
            return this.LLJI.LIZ.getString(2131845586);
        }
        C191819102n.LIZ.getClass();
        if (!C191819102n.LIZLLL()) {
            return charSequence;
        }
        return this.LLJI.LIZ.getString(2131857734);
    }

    @Override // X.AnonymousClass1097
    public final CharSequence LJJIJLIJ(Context context, CharSequence charSequence, int i) {
        int i2;
        String aid;
        if (i != 0) {
            if (i != 2) {
                return charSequence;
            }
            String string = this.LLJI.LIZ.getString(2131829278);
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "pns_display_number_of_friends", false) == 2) {
                boolean zLJJIZ = LJJIZ(i);
                Context context2 = this.LLJI.LIZ;
                Aweme awemeLJJJIL = LJJJIL();
                if (awemeLJJJIL != null) {
                    aid = awemeLJJJIL.getAid();
                } else {
                    aid = null;
                }
                return C10AE.LIZIZ(context2, string, aid, null, zLJJIZ, LJJJJ());
            }
            return string;
        }
        Context context3 = this.LLJI.LIZ;
        C191819102n.LIZ.getClass();
        if (C191819102n.LIZLLL()) {
            i2 = 2131838943;
        } else {
            i2 = R.string.dlw;
        }
        return context3.getString(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJL(int r4, android.view.View r5, java.lang.String r6) {
        /*
            r3 = this;
            if (r4 == 0) goto L37
            r0 = 1
            if (r4 == r0) goto L33
            r0 = 2
            if (r4 == r0) goto L2f
            r0 = 4
            if (r4 == r0) goto L33
            r1 = 2131838197(0x7f1144f5, float:1.930961E38)
        Le:
            android.content.Context r0 = r5.getContext()
            X.0mTM r2 = new X.0mTM
            r2.<init>(r0)
            r2.LJFF(r1)
            r2.LIZIZ(r6)
            kotlin.jvm.internal.AwS134S0101000_28 r1 = new kotlin.jvm.internal.AwS134S0101000_28
            r0 = 7
            r1.<init>(r3, r4, r0)
            X.C985403tE.LIZ(r2, r1)
            X.0mTF r0 = new X.0mTF
            r0.<init>(r2)
            r0.LIZLLL()
            return
        L2f:
            r1 = 2131845722(0x7f11625a, float:1.9324873E38)
            goto Le
        L33:
            r1 = 2131845723(0x7f11625b, float:1.9324875E38)
            goto Le
        L37:
            r1 = 2131845724(0x7f11625c, float:1.9324877E38)
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10A6.LJJJJL(int, android.view.View, java.lang.String):void");
    }
}
