package X;

import Y.ACListenerS122S0200000_19;
import Y.ARunnableS0S1210000_9;
import Y.ARunnableS119S0100000_19;
import Y.ATListenerS452S0100000_19;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.CollabInfo;
import com.ss.android.ugc.aweme.feed.model.CollaboratorInfo;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.multiapp.IProfileItemTrackService;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0it6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1259780it6 extends AbstractC1260080ita {
    public static final /* synthetic */ int LLLILZLLLI = 0;
    public final Context LLIZ;
    public final String LLIZLLLIL;
    public final TuxTextView LLJ;
    public TextView LLJI;
    public FrameLayout LLJIJIL;
    public final ViewGroup LLJILJIL;
    public TuxIconView LLJILJILJ;
    public final TuxTextView LLJILLL;
    public final TuxIconView LLJJ;
    public View LLJJI;
    public TuxIconView LLJJIII;
    public TuxIconView LLJJIJI;
    public final ViewGroup LLJJIJIIJIL;
    public final View LLJJIJIL;
    public final TextView LLJJJ;
    public View LLJJJIL;
    public final C0M3E LLJJJJ;
    public Drawable LLJJJJJIL;
    public final C326980Cro LLJJJJLIIL;
    public View LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public TuxIconView LLJL;
    public final ViewStub LLJLIL;
    public boolean LLJLILLLLZIIL;
    public int LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public int LLJZ;
    public Video LLJZIJLIL;
    public final InterfaceC1260110itd LLL;
    public boolean LLLF;
    public float LLLFF;
    public float LLLFFI;
    public int LLLFZ;
    public ARunnableS119S0100000_19 LLLI;
    public final C1259380isS LLLII;
    public TextView LLLIIII;
    public String LLLIIIIL;
    public long LLLIIIL;
    public boolean LLLIIL;
    public long LLLIILIL;
    public boolean LLLIL;
    public C0RJP LLLILZ;
    public final C1259820itA LLLILZJ;

    @Override // X.AbstractC1260080ita
    public final int[] R5() {
        return C422830Gi1.LIZ(200);
    }

    public final void a6() {
        String aid;
        Aweme aweme = this.LL;
        if (aweme == null) {
            C1253930ijf c1253930ijf = C1253930ijf.LIZ;
            Boolean boolValueOf = Boolean.valueOf(this.LLJLILLLLZIIL);
            Video video = this.LLJZIJLIL;
            aid = video != null ? video.getAid() : null;
            c1253930ijf.getClass();
            C1253930ijf.LJJI("post_data_is_empty", null, null, null, null, boolValueOf, aid);
            return;
        }
        if (!AwemeExtKt.isSharedStoryVisible(aweme)) {
            int i = C1259680isw.LLJ;
            C705950Rmb.LIZ(this.LLILLJJLI);
            C1253930ijf c1253930ijf2 = C1253930ijf.LIZ;
            Boolean boolValueOf2 = Boolean.valueOf(this.LLJLILLLLZIIL);
            Video video2 = this.LLJZIJLIL;
            aid = video2 != null ? video2.getAid() : null;
            c1253930ijf2.getClass();
            C1253930ijf.LJJI("is_shared_story_unvisible", null, null, null, null, boolValueOf2, aid);
            return;
        }
        if (AwemeExtKt.isCommentPostInvisible(this.LL)) {
            int i2 = C1259680isw.LLJ;
            C705950Rmb.LIZ(this.LLILLJJLI);
            C1253930ijf c1253930ijf3 = C1253930ijf.LIZ;
            Boolean boolValueOf3 = Boolean.valueOf(this.LLJLILLLLZIIL);
            Video video3 = this.LLJZIJLIL;
            aid = video3 != null ? video3.getAid() : null;
            c1253930ijf3.getClass();
            C1253930ijf.LJJI("comment_post_is_invisible", null, null, null, null, boolValueOf3, aid);
            return;
        }
        Video video4 = this.LL.getVideo();
        if (video4 != null && video4.isCallback()) {
            b6(video4);
            return;
        }
        Aweme aweme2 = this.LL;
        UrlModel urlModelLIZ = this.LLJJJJLIIL.LIZ(aweme2.getAid());
        if (urlModelLIZ == null || urlModelLIZ.getUrlList().size() == 0 || TextUtils.isEmpty((CharSequence) ListProtector.get(urlModelLIZ.getUrlList(), 0))) {
            b6(aweme2.getVideo());
        } else {
            S5(urlModelLIZ, "AwemeViewHolder", C294660Bgm.LIZ() ? Bitmap.Config.ARGB_8888 : null, null);
        }
    }

    public final C1159160gGo c6() {
        String groupId;
        String authorUid;
        PaidContentInfo paidContentInfo;
        Aweme aweme = this.LL;
        String str = this.LLIZLLLIL;
        String string = null;
        String str2 = this.LLJZ == 4 ? "post" : null;
        IProfileItemTrackService.LIZ.getClass();
        C1259810it9.LIZ().LIZJ();
        Boolean boolValueOf = Boolean.valueOf(aweme != null && aweme.isPaidContent);
        if (aweme == null || (paidContentInfo = aweme.mPaidContentInfo) == null) {
            if (aweme == null) {
                groupId = null;
                authorUid = null;
            }
            return new C1159160gGo(str, null, str2, string, groupId, boolValueOf, authorUid, str);
        }
        string = Long.valueOf(paidContentInfo.getPaidCollectionId()).toString();
        groupId = aweme.getGroupId();
        authorUid = AwemeExtKt.getAuthorUid(aweme);
        String str3 = aweme.isAd() ? "ad" : AwemeSaaSExtKt.isLive(aweme) ? "live" : AwemeExtKt.isPhotoMode(aweme) ? "photo_model" : aweme.getAwemeType() == 160 ? "text_mode" : aweme.getAwemeType() == 40 ? "story" : aweme.getVideo() != null ? "video" : "";
        return new C1159160gGo(str, null, str2, string, groupId, boolValueOf, authorUid, str3);
    }

    public final void f6() {
        ARunnableS119S0100000_19 aRunnableS119S0100000_19 = this.LLLI;
        if (aRunnableS119S0100000_19 != null) {
            HandlerHook.viewRemoveCallbacks(this.LLJILJIL, aRunnableS119S0100000_19);
            this.LLLI = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean i6() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r3.LL
            if (r1 == 0) goto Ld
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isScheduleVideo(r1)
            if (r0 == 0) goto Ld
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        Ld:
            X.0Svt r0 = X.C737190Svt.LIZ
            r0.getClass()
            boolean r0 = X.C737190Svt.LIZJ(r1)
            if (r0 == 0) goto L2b
            int r2 = r3.LLJZ
            r1 = 1
            if (r2 == 0) goto L26
            r0 = 14
            if (r2 == r0) goto L26
            r0 = 4
            if (r2 == r0) goto L26
            if (r2 != r1) goto L2b
        L26:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L2b:
            r1 = 0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1259780it6.i6():java.lang.Boolean");
    }

    public final TuxIconDrawable r6() {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_spinner_normal;
        c419910GdJ.LIZJ = C341940Daq.LIZ(16.0d);
        c419910GdJ.LIZIZ = C341940Daq.LIZ(16.0d);
        c419910GdJ.LIZLLL = Integer.valueOf(C960203pA.LIZ(R.attr.ee, this.LLIZ));
        return c419910GdJ.LIZ(this.LLIZ);
    }

    public final void v6() {
        this.LLILLJJLI.setForeground(this.itemView.getContext().getDrawable(R.drawable.cy9));
        C428150Gqb.LIZ(this.LLJILJIL, EnumC428940Grs.STRONG_MASK, 0.0f);
    }

    public final boolean w6() {
        TuxIconView tuxIconView = this.LLJJIJI;
        return tuxIconView != null && tuxIconView.getVisibility() == 0;
    }

    public final Bitmap.Config q6() {
        Aweme aweme;
        if (C294660Bgm.LIZ() || ((aweme = this.LL) != null && aweme.getAwemeType() == 160)) {
            return Bitmap.Config.ARGB_8888;
        }
        return null;
    }

    @Override // X.InterfaceC1259900itI
    public final void M0() {
        a6();
    }

    public final void C6(int i) {
        if (i == 0) {
            TuxIconView tuxIconView = (TuxIconView) C726240SeE.LIZIZ(this.itemView, this.LLJJIJI, R.id.video_audio_violation, R.id.vs_video_audio_violation);
            this.LLJJIJI = tuxIconView;
            tuxIconView.setIconRes(R.raw.icon_speaker_x_mark_ltr);
        }
        TuxIconView tuxIconView2 = this.LLJJIJI;
        if (tuxIconView2 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView2, i);
        }
        TuxIconView tuxIconView3 = this.LLJJIJI;
        if (tuxIconView3 != null && tuxIconView3.getVisibility() == 0) {
            this.LLLIL = true;
        }
    }

    public final void J6(int i) {
        if (i == 0) {
            this.LLLIIII = (TextView) C726240SeE.LIZIZ(this.itemView, this.LLLIIII, R.id.zb0, R.id.vs_tv_bottom_dark_post);
        }
        TextView textView = this.LLLIIII;
        if (textView != null) {
            C786410Ut5.LLIL(textView, i);
        }
    }

    public final void K6(int i) {
        if (i == 0) {
            this.LLJILJILJ = (TuxIconView) C726240SeE.LIZIZ(this.itemView, this.LLJILJILJ, R.id.video_locked, R.id.vs_video_locked);
        }
        TuxIconView tuxIconView = this.LLJILJILJ;
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, i);
        }
        TuxIconView tuxIconView2 = this.LLJILJILJ;
        if (tuxIconView2 != null && tuxIconView2.getVisibility() == 0) {
            this.LLLIL = true;
        }
    }

    public final void b6(Video video) {
        boolean z;
        PhotoModeImageUrlModel imagePostCover;
        UrlModel urlModel;
        int i;
        PhotoModeImageUrlModel imagePostCover2;
        UrlModel urlModel2;
        String aid = null;
        if (video != null) {
            this.LLJZIJLIL = video;
            if (!AbstractC1620180sGO.N5() && ((i = this.LLJZ) == 0 || i == 1 || i == 14)) {
                if (video.getCover() != null && video.getCover().getUrlList() != null && video.getCover().getUrlList().size() != 0 && !TextUtils.isEmpty((CharSequence) ListProtector.get(video.getCover().getUrlList(), 0))) {
                    this.LLLIIIL = System.currentTimeMillis();
                    if (AwemeExtKt.isPhotoMode(this.LL)) {
                        Aweme aweme = this.LL;
                        if (aweme != null && aweme.getPhotoModeImageInfo() != null && (imagePostCover2 = this.LL.getPhotoModeImageInfo().getImagePostCover()) != null && (urlModel2 = imagePostCover2.displayImageNoWatermark) != null) {
                            S5(urlModel2, "AwemeViewHolder", q6(), this.LLLII);
                            return;
                        }
                        return;
                    }
                    S5(video.getCover(), "AwemeViewHolder", q6(), this.LLLII);
                    return;
                }
                this.LLILLJJLI.setImageResource(R.attr.bv);
                C1253930ijf c1253930ijf = C1253930ijf.LIZ;
                UrlModel cover = video.getCover();
                Boolean boolValueOf = Boolean.valueOf(this.LLJLILLLLZIIL);
                Video video2 = this.LLJZIJLIL;
                if (video2 != null) {
                    aid = video2.getAid();
                }
                c1253930ijf.getClass();
                C1253930ijf.LJJI("video_cover_data_is_null", cover, null, null, null, boolValueOf, aid);
                return;
            }
            Bitmap.Config configQ6 = q6();
            if ((C2517509tl.LIZ & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (W5(video, "AwemeViewHolder", configQ6, z, true)) {
                this.LLILLL = true;
                return;
            }
            if (video.getCover() != null && video.getCover().getUrlList() != null && video.getCover().getUrlList().size() != 0 && !TextUtils.isEmpty((CharSequence) ListProtector.get(video.getCover().getUrlList(), 0))) {
                this.LLLIIIL = System.currentTimeMillis();
                if (AwemeExtKt.isPhotoMode(this.LL)) {
                    Aweme aweme2 = this.LL;
                    if (aweme2 == null || aweme2.getPhotoModeImageInfo() == null || (imagePostCover = this.LL.getPhotoModeImageInfo().getImagePostCover()) == null || (urlModel = imagePostCover.displayImageNoWatermark) == null) {
                        return;
                    }
                    S5(urlModel, "AwemeViewHolder", q6(), this.LLLII);
                    return;
                }
                S5(video.getCover(), "AwemeViewHolder", q6(), this.LLLII);
                return;
            }
            this.LLILLJJLI.setImageResource(R.color.al);
            C1253930ijf c1253930ijf2 = C1253930ijf.LIZ;
            UrlModel cover2 = video.getCover();
            Boolean boolValueOf2 = Boolean.valueOf(this.LLJLILLLLZIIL);
            Video video3 = this.LLJZIJLIL;
            if (video3 != null) {
                aid = video3.getAid();
            }
            c1253930ijf2.getClass();
            C1253930ijf.LJJI("video_cover_data_is_null", cover2, null, null, null, boolValueOf2, aid);
            return;
        }
        C1253930ijf c1253930ijf3 = C1253930ijf.LIZ;
        Boolean boolValueOf3 = Boolean.valueOf(this.LLJLILLLLZIIL);
        Video video4 = this.LLJZIJLIL;
        if (video4 != null) {
            aid = video4.getAid();
        }
        c1253930ijf3.getClass();
        C1253930ijf.LJJI("video_is_null", null, null, null, null, boolValueOf3, aid);
    }

    public final void h6(boolean z) {
        if (this.LLLIILIL == 0) {
            this.LLLIILIL = this.LLLIIIL;
        }
        if (z) {
            Map<String, Set<String>> map = C1253360iik.LIZ;
            C1253360iik.LIZIZ(this.LLLIILIL, false);
        } else {
            Map<String, Set<String>> map2 = C1253360iik.LIZ;
            C1253360iik.LIZJ(this.LLLIILIL, this.LLLIIIIL, false);
        }
    }

    public static final void D6(TuxTextView tuxTextView, Drawable drawable) {
        if (tuxTextView == null) {
            return;
        }
        if (drawable != null) {
            drawable.setBounds(0, 0, C341940Daq.LIZ(16.0d), C341940Daq.LIZ(16.0d));
        }
        tuxTextView.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public static boolean u6(Aweme aweme, CollabInfo collabInfo) {
        User user;
        String authorUid = AwemeExtKt.getAuthorUid(aweme);
        for (CollaboratorInfo collaboratorInfo : collabInfo.collaborators) {
            if (collaboratorInfo != null && (user = collaboratorInfo.user) != null && collaboratorInfo.collabStatus == 2 && !TextUtils.equals(user.getUid(), authorUid)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0itA] */
    /* JADX WARN: Type inference failed for: r0v75, types: [X.0isS] */
    public C1259780it6(View view, String str, InterfaceC1260110itd interfaceC1260110itd) {
        super(view);
        this.LLJJJJLIIL = new C326980Cro();
        this.LLJJL = null;
        this.LLJJLIIIJLLLLLLLZ = null;
        this.LLJL = null;
        this.LLJLILLLLZIIL = false;
        this.LLJLL = 0;
        this.LLJLLIL = false;
        this.LLJLLL = false;
        this.LLJZ = 0;
        this.LLJZIJLIL = null;
        this.LLLF = false;
        this.LLLFF = 0.0f;
        this.LLLFFI = 0.0f;
        this.LLLFZ = -1;
        this.LLLIIIIL = "";
        this.LLLIIL = false;
        this.LLLIILIL = 0L;
        this.LLLIL = false;
        this.LLLILZJ = new InterfaceC1332070klh() { // from class: X.0itA
            @Override // X.InterfaceC1332070klh
            public final void LIZ() {
                this.LIZ.getClass();
            }
        };
        this.LLIZ = view.getContext();
        this.LLL = interfaceC1260110itd;
        this.LLIZLLLIL = str;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.eqx);
        this.LLJILJIL = viewGroup;
        this.LLILLJJLI = (SmartImageView) view.findViewById(R.id.cover);
        this.LLJILLL = (TuxTextView) view.findViewById(R.id.tv_play_count);
        this.LLJJ = (TuxIconView) view.findViewById(R.id.lcd);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.tv_top);
        this.LLJ = tuxTextView;
        View viewFindViewById = view.findViewById(R.id.no2);
        this.LLJJIJIIJIL = (ViewGroup) view.findViewById(R.id.video_info_container);
        this.LLJJJ = (TextView) view.findViewById(R.id.x1n);
        this.LLJI = (TextView) view.findViewById(R.id.zh7);
        this.LLJIJIL = (FrameLayout) view.findViewById(R.id.i51);
        this.LLJILJILJ = (TuxIconView) view.findViewById(R.id.video_locked);
        this.LLJJIII = (TuxIconView) view.findViewById(R.id.video_geo_fencing_locked);
        this.LLJJIJI = (TuxIconView) view.findViewById(R.id.video_audio_violation);
        this.LLJJI = view.findViewById(R.id.y4v);
        this.LLJJIJIL = view.findViewById(R.id.vxb);
        view.findViewById(R.id.vx_);
        this.LLJJL = view.findViewById(R.id.m1h);
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.m1k);
        this.LLJL = (TuxIconView) view.findViewById(R.id.m1j);
        this.LLLIIII = (TextView) view.findViewById(R.id.zb0);
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).C3();
        this.LLJJJIL = view.findViewById(R.id.wg6);
        C0M3E c0m3eLJIIJJI = C1EE2.LIZIZ.LJIIJJI(viewGroup);
        this.LLJJJJ = c0m3eLJIIJJI;
        c0m3eLJIIJJI.LIZ(tuxTextView);
        c0m3eLJIIJJI.LIZ(viewFindViewById);
        C786410Ut5.K7(viewGroup, new ACListenerS122S0200000_19(interfaceC1260110itd, this, 80));
        C737190Svt.LIZ.getClass();
        if (!C737190Svt.LIZIZ()) {
            viewGroup.setOnLongClickListener(new ViewOnLongClickListenerC1265840j2s(interfaceC1260110itd, this, 2));
        } else {
            viewGroup.setOnTouchListener(new ATListenerS452S0100000_19(this, 14));
        }
        this.LLILLJJLI.setAnimationListener(this.LLLILZJ);
        this.LLJLIL = (ViewStub) view.findViewById(R.id.vs_under_water_tips);
        IProfileItemTrackService.LIZ.getClass();
        C1259810it9.LIZ().LIZIZ();
        this.LLILZIL = new C624420OeO(this);
        this.LLLII = new InterfaceC658750Psf() { // from class: X.0isS
            @Override // X.InterfaceC658750Psf
            public final void Ck(JSONObject jSONObject) {
                if (!this.LL.LLJLILLLLZIIL || C1ELC.LIZJ()) {
                    if (!this.LL.LLJLILLLLZIIL && !C1259950itN.LIZIZ()) {
                        return;
                    }
                    C1259780it6 c1259780it6 = this.LL;
                    if (c1259780it6.LLLIIIIL == null) {
                        int i = C2187451AjH.LIZ;
                        C1720106oR.LIZ("AwemeViewHolder", "userId is null");
                        return;
                    }
                    if (c1259780it6.LLJLILLLLZIIL) {
                        C1259780it6 c1259780it62 = this.LL;
                        c1259780it62.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis() - c1259780it62.LLLIIIL;
                        if (jSONObject.optBoolean("isSuccess")) {
                            c1259780it62.e6(jSONObject, jCurrentTimeMillis, false);
                            return;
                        } else {
                            c1259780it62.e6(jSONObject, jCurrentTimeMillis, true);
                            c1259780it62.z6(jSONObject, "", false);
                            return;
                        }
                    }
                    C1259780it6 c1259780it63 = this.LL;
                    c1259780it63.getClass();
                    Boolean bool = C1253130iiN.LIZJ.get(c1259780it63.LLLIIIIL);
                    Boolean bool2 = C1253130iiN.LIZLLL.get(c1259780it63.LLLIIIIL);
                    if (bool == null) {
                        if (bool2 == null) {
                            int i2 = C2187451AjH.LIZ;
                            C1720106oR.LIZ("AwemeViewHolder", "isNewFirstUser & isNewNoFirstUser are null");
                            return;
                        }
                    } else if (!bool.booleanValue() && bool2 != null && !bool2.booleanValue()) {
                        return;
                    }
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - c1259780it63.LLLIIIL;
                    if (jSONObject.optBoolean("isSuccess")) {
                        c1259780it63.d6(jCurrentTimeMillis2, bool, bool2, jSONObject, false);
                    } else {
                        c1259780it63.d6(jCurrentTimeMillis2, bool, bool2, jSONObject, true);
                        c1259780it63.z6(jSONObject, "", false);
                    }
                }
            }

            @Override // X.InterfaceC658750Psf
            public final void onImageLoaded(boolean z, String str2, JSONObject jSONObject) {
                if (this.LL.LLJLILLLLZIIL || !C1259950itN.LIZIZ()) {
                    if (this.LL.LLJLILLLLZIIL && C1ELC.LIZJ()) {
                        return;
                    }
                    this.LL.z6(jSONObject, str2, z);
                }
            }
        };
    }

    public final void e6(final JSONObject jSONObject, final long j, final boolean z) {
        if (this.itemView == null) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZ("AwemeViewHolder", "itemView is null");
        } else {
            HandlerHook.viewPost(this.itemView, new Runnable() { // from class: X.0iqh
                @Override // java.lang.Runnable
                public final void run() {
                    C1259780it6 c1259780it6 = this.LL;
                    long j2 = j;
                    JSONObject jSONObject2 = jSONObject;
                    boolean z2 = z;
                    c1259780it6.getClass();
                    C1C7U.LIZ("AwemeViewHolder@8d38.calculateMyFirstScreenCostTime$1L");
                    if (c1259780it6.LLJLLL) {
                        String aid = c1259780it6.LL.getAid();
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("remove dataId: ");
                        sbLIZ.append(aid);
                        sbLIZ.append(" userId: ");
                        sbLIZ.append(c1259780it6.LLLIIIIL);
                        C2188811AlT.LIZIZ(sbLIZ);
                        C1253360iik.LIZJ.remove(aid);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onImageSensibleLoaded position: ");
                        sbLIZ2.append(c1259780it6.LLJLL);
                        C1720106oR.LJI("AwemeViewHolder", C2188811AlT.LIZIZ(sbLIZ2));
                        c1259780it6.LLLIILIL = (jCurrentTimeMillis - j2) + ((long) jSONObject2.optInt("duration"));
                        if (z2) {
                            C1720106oR.LJI("AwemeViewHolder", "onImageSensibleLoaded load image failed");
                            C1253360iik.LJ = true;
                        }
                    }
                    if (!C1253360iik.LIZJ.isEmpty()) {
                        int i3 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("onImageLoaded mIsLastPublicPostItem: ");
                        sbLIZ3.append(c1259780it6.LLJLLIL);
                        C2188811AlT.LIZIZ(sbLIZ3);
                        C1C7U.LIZIZ("AwemeViewHolder@8d38.calculateMyFirstScreenCostTime$1L");
                        return;
                    }
                    if (c1259780it6.LLLIIIIL == null) {
                        int i4 = C2187451AjH.LIZ;
                        C1720106oR.LIZ("AwemeViewHolder", "userId is null");
                        C1C7U.LIZIZ("AwemeViewHolder@8d38.calculateMyFirstScreenCostTime$1L");
                    } else {
                        if (C1253130iiN.LJFF) {
                            c1259780it6.h6(true);
                        }
                        C1C7U.LIZIZ("AwemeViewHolder@8d38.calculateMyFirstScreenCostTime$1L");
                    }
                }
            });
        }
    }

    public final void z6(JSONObject jSONObject, String str, boolean z) {
        JSONObject jSONObject2;
        Object obj;
        int i = this.LLJZ;
        if (i == 0 || i == 14) {
            C1253930ijf.LIZ.getClass();
            Object obj2 = null;
            if (jSONObject == null) {
                jSONObject2 = null;
            } else {
                try {
                    jSONObject2 = jSONObject;
                    if (((Boolean) C267390Adt.LIZ.getValue()).booleanValue()) {
                        JSONObject jSONObject3 = new JSONObject();
                        Iterator<String> itKeys = jSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            if (Intrinsics.LJFF(next, "err_msg")) {
                                String strOptString = jSONObject.optString(next);
                                if (strOptString != null && !a0.LJJJIL(strOptString)) {
                                    String strLIZJ = C1253930ijf.LIZJ(strOptString, "statusCode");
                                    if (strLIZJ != null) {
                                        jSONObject3.put("statusCode", strLIZJ);
                                    }
                                    String strLIZJ2 = C1253930ijf.LIZJ(strOptString, "traceCode");
                                    if (strLIZJ2 != null) {
                                        jSONObject3.put("traceCode", strLIZJ2);
                                    }
                                    String strLIZJ3 = C1253930ijf.LIZJ(strOptString, "url");
                                    if (strLIZJ3 != null) {
                                        jSONObject3.put("url", strLIZJ3);
                                    }
                                }
                            } else {
                                jSONObject3.put(next, jSONObject.opt(next));
                            }
                        }
                        jSONObject2 = jSONObject3;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C098200Yq c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    obj = c098200Yq;
                }
            }
            C189200o6.m2constructorimpl(jSONObject2);
            obj = jSONObject2;
            if (!C189200o6.m7isFailureimpl(obj)) {
                obj2 = obj;
            }
            C823050WQl.LIZIZ().submit(new ARunnableS0S1210000_9(this, z, (JSONObject) obj2, str, 5));
        }
    }

    public final void d6(final long j, final Boolean bool, final Boolean bool2, final JSONObject jSONObject, final boolean z) {
        if (this.itemView == null) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZ("AwemeViewHolder", "itemView is null");
        } else {
            HandlerHook.viewPost(this.itemView, new Runnable() { // from class: X.0iqg
                @Override // java.lang.Runnable
                public final void run() {
                    C1259780it6 c1259780it6 = this.LL;
                    long j2 = j;
                    JSONObject jSONObject2 = jSONObject;
                    boolean z2 = z;
                    Boolean bool3 = bool;
                    Boolean bool4 = bool2;
                    c1259780it6.getClass();
                    C1C7U.LIZ("AwemeViewHolder@8d38.calculateFirstScreenCostTime$1L");
                    if (c1259780it6.LLJLLL) {
                        String aid = c1259780it6.LL.getAid();
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("remove dataId: ");
                        sbLIZ.append(aid);
                        sbLIZ.append(" userId: ");
                        sbLIZ.append(c1259780it6.LLLIIIIL);
                        C2188811AlT.LIZIZ(sbLIZ);
                        Map<String, Set<String>> map = C1253360iik.LIZ;
                        C1253360iik.LIZ(c1259780it6.LLLIIIIL).remove(aid);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onImageSensibleLoaded position: ");
                        sbLIZ2.append(c1259780it6.LLJLL);
                        C1720106oR.LJI("AwemeViewHolder", C2188811AlT.LIZIZ(sbLIZ2));
                        c1259780it6.LLLIILIL = (jCurrentTimeMillis - j2) + ((long) jSONObject2.optInt("duration"));
                        if (z2) {
                            C1720106oR.LJI("AwemeViewHolder", "onImageSensibleLoaded load image failed");
                            String str = c1259780it6.LLLIIIIL;
                            if (str.length() == 0) {
                                C1720106oR.LIZ("Profile_ProfileFirstScreenStatistics", "setImageLoadFailed userId is null");
                            } else {
                                Map<String, Boolean> map2 = C1253360iik.LIZIZ;
                                if (map2.containsKey(str)) {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("setImageLoadFailed contains userId ");
                                    sbLIZ3.append(str);
                                    sbLIZ3.append(' ');
                                    C1720106oR.LIZ("Profile_ProfileFirstScreenStatistics", C2188811AlT.LIZIZ(sbLIZ3));
                                } else {
                                    map2.put(str, Boolean.TRUE);
                                }
                            }
                        }
                    }
                    Map<String, Set<String>> map3 = C1253360iik.LIZ;
                    if (!C1253360iik.LIZ(c1259780it6.LLLIIIIL).isEmpty()) {
                        int i3 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("onImageLoaded mIsLastPublicPostItem: ");
                        sbLIZ4.append(c1259780it6.LLJLLIL);
                        C2188811AlT.LIZIZ(sbLIZ4);
                        C1C7U.LIZIZ("AwemeViewHolder@8d38.calculateFirstScreenCostTime$1L");
                        return;
                    }
                    if (c1259780it6.LLLIIIIL == null) {
                        int i4 = C2187451AjH.LIZ;
                        C1720106oR.LIZ("AwemeViewHolder", "userId is null");
                        C1C7U.LIZIZ("AwemeViewHolder@8d38.calculateFirstScreenCostTime$1L");
                    } else {
                        if ((bool3 != null && bool3.booleanValue()) || (bool4 != null && bool4.booleanValue())) {
                            c1259780it6.h6(false);
                        }
                        C1C7U.LIZIZ("AwemeViewHolder@8d38.calculateFirstScreenCostTime$1L");
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0356  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X5(com.ss.android.ugc.aweme.feed.model.Aweme r18, int r19, boolean r20, boolean r21, int r22, java.lang.String r23, java.lang.String r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 1916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1259780it6.X5(com.ss.android.ugc.aweme.feed.model.Aweme, int, boolean, boolean, int, java.lang.String, java.lang.String, boolean):void");
    }
}
