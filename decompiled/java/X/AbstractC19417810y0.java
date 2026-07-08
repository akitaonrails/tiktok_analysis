package X;

import Y.ACListenerS131S0200000_29;
import Y.ACListenerS90S1100000_29;
import Y.AObserverS231S0100000_29;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IChallengeDetailLegacyService;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.challenge.ChallengeDetailLegacyServiceImpl;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic;
import com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailViewModel;
import com.ss.android.ugc.aweme.christmas.FestivalEntity;
import com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.utils.ZoomAnimationUtils;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.10y0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19417810y0 extends FrameLayout {
    public static final /* synthetic */ int LLJJL = 0;
    public final String LL;
    public LinearLayout LLILLJJLI;
    public SmartImageView LLILLL;
    public TextView LLILZ;
    public ViewStub LLILZIL;
    public View LLILZLL;
    public ViewStub LLIZ;
    public View LLIZLLLIL;
    public RecyclerView LLJ;
    public ViewStub LLJI;
    public View LLJIJIL;
    public View LLJILJIL;
    public TextView LLJILJILJ;
    public RecyclerView LLJILLL;
    public C344330Deh LLJJ;
    public FrameLayout LLJJI;
    public SmartImageView LLJJIII;
    public View LLJJIJI;
    public final List<InterfaceC19417910y1> LLJJIJIIJIL;
    public ChallengeDetail LLJJIJIL;
    public Challenge LLJJJ;
    public final C19406610wC LLJJJIL;
    public ChallengeDetailViewModel LLJJJJ;
    public final AObserverS231S0100000_29 LLJJJJJIL;
    public final C1399140mVs LLJJJJLIIL;

    public void LIZIZ() {
    }

    public abstract int getAttrsResId();

    public abstract int getButtonResId();

    public abstract int getLayoutResId();

    public final void LJ() {
        NextLiveData<Pair<Integer, C194457115z>> nextLiveData;
        Pair<Integer, C194457115z> value;
        C194457115z second;
        ChallengeDetailViewModel challengeDetailViewModel = this.LLJJJJ;
        if (challengeDetailViewModel == null || (nextLiveData = challengeDetailViewModel.LLILLJJLI) == null || (value = nextLiveData.getValue()) == null || (second = value.getSecond()) == null) {
            return;
        }
        List<Aweme> list = getMChallengeDetail().slideList;
        if (C086I.LIZIZ(list)) {
            return;
        }
        if (second.LLILZ == null) {
            second.LLILZ = new ArrayList();
        }
        ((ArrayList) second.LLILZ).clear();
        ((ArrayList) second.LLILZ).addAll(list);
    }

    public final ChallengeDetailParam getDetailParam() {
        return this.LLJJJIL.LJI;
    }

    public final SmartImageView getMAvatar() {
        SmartImageView smartImageView = this.LLILLL;
        if (smartImageView != null) {
            return smartImageView;
        }
        return null;
    }

    public final Challenge getMChallenge() {
        Challenge challenge = this.LLJJJ;
        if (challenge != null) {
            return challenge;
        }
        return null;
    }

    public final ChallengeDetail getMChallengeDetail() {
        ChallengeDetail challengeDetail = this.LLJJIJIL;
        if (challengeDetail != null) {
            return challengeDetail;
        }
        return null;
    }

    public final ViewStub getMDescContainerVs() {
        ViewStub viewStub = this.LLILZIL;
        if (viewStub != null) {
            return viewStub;
        }
        return null;
    }

    public final LinearLayout getMHeaderContainer() {
        LinearLayout linearLayout = this.LLILLJJLI;
        if (linearLayout != null) {
            return linearLayout;
        }
        return null;
    }

    public final TextView getMTitle() {
        TextView textView = this.LLILZ;
        if (textView != null) {
            return textView;
        }
        return null;
    }

    public void LIZJ() {
        setMHeaderContainer((LinearLayout) findViewById(R.id.jit));
        setMAvatar((SmartImageView) findViewById(R.id.bh2));
        setMTitle((TextView) findViewById(R.id.title));
        setMDescContainerVs((ViewStub) findViewById(R.id.vs_desc_container));
        this.LLIZ = (ViewStub) findViewById(R.id.vs_related_container);
        this.LLJI = (ViewStub) findViewById(R.id.vs_horizontal_slide);
        this.LLJJIJI = findViewById(R.id.ch3);
        Iterator<InterfaceC19417910y1> it2 = this.LLJJIJIIJIL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(this, this.LLJJJIL);
        }
    }

    public final C19EG getActivity() {
        Context context = getContext();
        if (context != null) {
            return C1388190mED.LIZIZ(context);
        }
        return null;
    }

    public final int getAvatarContainerHight() {
        return getMAvatar().getHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        EventBus.LIZLLL().LJIJJ(this);
        ChallengeDetailViewModel challengeDetailViewModel = (ChallengeDetailViewModel) ViewModelProviders.of(getActivity()).get(ChallengeDetailViewModel.class);
        this.LLJJJJ = challengeDetailViewModel;
        challengeDetailViewModel.LLILLJJLI.observe(getActivity(), this.LLJJJJJIL);
        LJ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        EventBus.LIZLLL().LJJI(this);
        this.LLJJJJ.LLILLJJLI.removeObserver(this.LLJJJJJIL);
        this.LLJJJJ = null;
        Iterator it2 = ((ArrayList) this.LLJJIJIIJIL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC19417910y1) it2.next()).LIZIZ();
        }
    }

    public final View getMDescContainer() {
        return this.LLILZLL;
    }

    public final C19406610wC getMHeaderParam() {
        return this.LLJJJIL;
    }

    public final ChallengeDetailViewModel getMViewModel() {
        return this.LLJJJJ;
    }

    @Override // android.view.View
    public final String getTag() {
        return this.LL;
    }

    public void LIZ(ChallengeDetail challengeDetail) {
        int i;
        boolean z;
        String cid;
        String str;
        Challenge challenge;
        List<String> list;
        View view;
        List<String> list2;
        String str2;
        View view2;
        if (challengeDetail.challenge == null) {
            return;
        }
        setMChallengeDetail(challengeDetail);
        setMChallenge(challengeDetail.challenge);
        String challengeProfileUrl = getMChallenge().getChallengeProfileUrl();
        if (!TextUtils.isEmpty(challengeProfileUrl)) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(challengeProfileUrl);
            c1331670kl3LJIIIZ.LIZLLL(this.LL);
            c1331670kl3LJIIIZ.LJJ(getMAvatar());
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
        C786410Ut5.Q8(getMAvatar(), new ACListenerS90S1100000_29(this, challengeProfileUrl, 0));
        String challengeName = getMChallenge().getChallengeName();
        TextView mTitle = getMTitle();
        getMChallenge();
        getDetailParam().getCid();
        Boolean boolValueOf = Boolean.valueOf(getMChallenge().isCommerceAndValid());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "#");
        spannableStringBuilder.append((CharSequence) challengeName);
        if (((View) mTitle.getParent()).getLayoutDirection() == 1) {
            i = 5;
        } else {
            i = 3;
        }
        mTitle.setGravity(i);
        ICommerceChallengeService iCommerceChallengeService = (ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class);
        mTitle.getContext();
        iCommerceChallengeService.LJIIJ(spannableStringBuilder.toString(), boolValueOf.booleanValue(), mTitle, true, "hashtag_homepage");
        ViewStub mDescContainerVs = getMDescContainerVs();
        if (this.LLILZLL == null) {
            z = true;
        } else {
            z = false;
        }
        ViewStub viewStub = null;
        if (z && mDescContainerVs != null) {
            C1846400y9G c1846400y9G = new C1846400y9G();
            c1846400y9G.LJI(mDescContainerVs);
            String desc = getMChallenge().getDesc();
            Challenge mChallenge = getMChallenge();
            if (mChallenge != null) {
                c1846400y9G.LIZ(4, desc, new C19225510Jh(c1846400y9G, mChallenge));
            }
        }
        List<RelatedChallengeMusic> list3 = getMChallengeDetail().relatedChallengeMusicList;
        if (C086I.LIZIZ(list3)) {
            View view3 = this.LLIZLLLIL;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(8, view3);
            }
        } else {
            ViewStub viewStub2 = this.LLIZ;
            if (viewStub2 == null) {
                viewStub2 = null;
            }
            if (this.LLIZLLLIL == null && viewStub2 != null) {
                View viewLJLLLL = C786410Ut5.LJLLLL(viewStub2);
                TextView textView = (TextView) viewLJLLLL.findViewById(R.id.gy4);
                textView.setText(textView.getContext().getText(2131833837));
                C786410Ut5.LLIL(textView, 0);
                RecyclerView recyclerView = (RecyclerView) viewLJLLLL.findViewById(R.id.x23);
                this.LLJ = recyclerView;
                final int iLIZ = C446980Hfs.LIZ(recyclerView.getContext(), R.color.dr);
                final int iLIZJ = (int) C12ES.LIZJ(4.0f, recyclerView.getContext());
                final float fLIZJ = C12ES.LIZJ(0.0f, recyclerView.getContext());
                final float fLIZJ2 = C12ES.LIZJ(0.0f, recyclerView.getContext());
                recyclerView.addItemDecoration(new C0DXR(iLIZ, iLIZJ, fLIZJ, fLIZJ2) { // from class: X.0EYx
                    public final boolean LL;
                    public final Paint LLILLJJLI;
                    public final int LLILLL;
                    public final float LLILZLL;
                    public final float LLIZ;
                    public final int LLILZIL = -1;
                    public final int LLILZ = 0;

                    @Override // X.C0DXR
                    public final void LIZLLL(Canvas canvas, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                        if (this.LLILZ == 1) {
                            int measuredWidth = recyclerView2.getMeasuredWidth();
                            int childCount = recyclerView2.getChildCount();
                            for (int i2 = 0; i2 < childCount; i2++) {
                                View childAt = recyclerView2.getChildAt(i2);
                                int top = childAt.getTop() + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin;
                                int i3 = top - this.LLILLL;
                                if (this.LL) {
                                    canvas.drawRect(this.LLILZLL + 0.0f, i3, measuredWidth - this.LLIZ, top, this.LLILLJJLI);
                                } else {
                                    float f = i3;
                                    float f2 = top;
                                    canvas.drawRect(0.0f, f, this.LLILZLL, f2, this.LLILLJJLI);
                                    float f3 = measuredWidth;
                                    canvas.drawRect(f3 - this.LLIZ, f, f3, f2, this.LLILLJJLI);
                                }
                            }
                            return;
                        }
                        int measuredHeight = recyclerView2.getMeasuredHeight();
                        int childCount2 = recyclerView2.getChildCount();
                        for (int i4 = 0; i4 < childCount2; i4++) {
                            View childAt2 = recyclerView2.getChildAt(i4);
                            int left = childAt2.getLeft() + ((ViewGroup.MarginLayoutParams) childAt2.getLayoutParams()).leftMargin;
                            int i5 = left - this.LLILLL;
                            if (this.LL) {
                                canvas.drawRect(i5, 0 + this.LLILZLL, left, measuredHeight - this.LLIZ, this.LLILLJJLI);
                            } else {
                                float f4 = i5;
                                float f5 = this.LLILZLL;
                                float f6 = left;
                                canvas.drawRect(f4, f5 + 0.0f, f6, f5, this.LLILLJJLI);
                                float f7 = measuredHeight;
                                canvas.drawRect(f4, f7 - this.LLIZ, f6, f7, this.LLILLJJLI);
                            }
                        }
                    }

                    {
                        this.LLILLL = iLIZJ;
                        Paint paint = new Paint(1);
                        this.LLILLJJLI = paint;
                        paint.setColor(iLIZ);
                        paint.setStyle(Paint.Style.FILL);
                        this.LLILZLL = fLIZJ;
                        this.LLIZ = fLIZJ2;
                        this.LL = false;
                    }

                    @Override // X.C0DXR
                    public final void LIZIZ(Rect rect, View view4, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                        int i2;
                        int i3;
                        int childAdapterPosition = recyclerView2.getChildAdapterPosition(view4);
                        if (this.LLILZ == 1) {
                            if (childAdapterPosition == this.LLILZIL) {
                                i3 = 0;
                            } else {
                                i3 = this.LLILLL;
                            }
                            rect.set(0, 0, 0, i3);
                            return;
                        }
                        if (childAdapterPosition == this.LLILZIL) {
                            i2 = 0;
                        } else {
                            i2 = this.LLILLL;
                        }
                        rect.set(0, 0, i2, 0);
                    }
                });
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(new WrapLinearLayoutManager(recyclerView.getContext(), 0));
                this.LLIZLLLIL = viewLJLLLL;
            }
            this.LLJ.setAdapter(new C1399630mWf(getContext(), getMChallenge().getCid(), list3));
            C786410Ut5.LJLLLLLL(0, this.LLIZLLLIL);
            View view4 = this.LLJJIJI;
            if (view4 == null) {
                view4 = null;
            }
            C786410Ut5.LJLLLLLL(8, view4);
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for (RelatedChallengeMusic relatedChallengeMusic : getMChallengeDetail().relatedChallengeMusicList) {
                int i2 = relatedChallengeMusic.categoryType;
                if (i2 == 1) {
                    Music music = relatedChallengeMusic.music;
                    if (music != null) {
                        sb.append(music.getMid());
                        sb.append(",");
                    }
                } else if (i2 == 2 && (challenge = relatedChallengeMusic.challenge) != null) {
                    sb2.append(challenge.getCid());
                    sb2.append(",");
                }
            }
            a0.LJJJLIIL(sb, ",");
            a0.LJJJLIIL(sb2, ",");
            if (TextUtils.equals(this.LLJJJIL.LJ, "from_related_tag")) {
                cid = getMChallenge().getCid();
                str = "1";
            } else {
                cid = "";
                str = CardStruct.IStatusCode.DEFAULT;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("level", str);
                jSONObject.put("enter_from", cid);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("music", sb.toString());
                jSONObject2.put("challenge", sb2.toString());
                jSONObject.put("related", jSONObject2);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            MobClick mobClickObtain = MobClick.obtain();
            mobClickObtain.setEventName("extend_challenge");
            mobClickObtain.setLabelName("challenge");
            mobClickObtain.setValue(getMChallenge().getCid());
            mobClickObtain.setJsonObject(jSONObject);
            C20684815ws.onEvent(mobClickObtain);
        }
        if (!TextUtils.isEmpty(getMChallengeDetail().slideTitle) && !C086I.LIZIZ(getMChallengeDetail().slideList)) {
            if (this.LLJIJIL == null) {
                ViewStub viewStub3 = this.LLJI;
                if (viewStub3 != null) {
                    viewStub = viewStub3;
                }
                View viewLJLLLL2 = C786410Ut5.LJLLLL(viewStub);
                this.LLJILJIL = viewLJLLLL2.findViewById(R.id.vjh);
                this.LLJILJILJ = (TextView) viewLJLLLL2.findViewById(R.id.vk5);
                RecyclerView recyclerView2 = (RecyclerView) viewLJLLLL2.findViewById(R.id.vjo);
                this.LLJILLL = recyclerView2;
                recyclerView2.setLayoutManager(new WrapLinearLayoutManager(getContext(), 0));
                this.LLJILLL.addItemDecoration(new C346270Dhp(4));
                C344330Deh c344330Deh = new C344330Deh(this.LLJJJJLIIL);
                this.LLJJ = c344330Deh;
                this.LLJILLL.setAdapter(c344330Deh);
                this.LLJIJIL = viewLJLLLL2;
            }
            if (getMChallenge().getMediaSource() == null && (view2 = this.LLJILJIL) != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
            this.LLJILJILJ.setText(getMChallengeDetail().slideTitle);
            C344330Deh c344330Deh2 = this.LLJJ;
            List<Aweme> list4 = getMChallengeDetail().slideList;
            if (!C086I.LIZIZ(list4)) {
                ((ArrayList) c344330Deh2.LLILLJJLI).clear();
                ((ArrayList) c344330Deh2.LLILLJJLI).addAll(list4);
                c344330Deh2.notifyDataSetChanged();
            }
            C786410Ut5.LJLLLLLL(0, this.LLJIJIL);
            LJ();
        } else {
            View view5 = this.LLJIJIL;
            if (view5 != null) {
                C786410Ut5.LJLLLLLL(8, view5);
            }
        }
        if (C828040We2.LIZIZ()) {
            FestivalEntity festivalEntityLIZ = C828040We2.LIZ();
            if (festivalEntityLIZ != null && festivalEntityLIZ.mBannerDetail != null && (list2 = festivalEntityLIZ.hashTagIds) != null && list2.contains(challengeDetail.challenge.getCid())) {
                this.LLJJI = (FrameLayout) findViewById(R.id.a5k);
                this.LLJJIII = (SmartImageView) findViewById(R.id.a5l);
                FrameLayout frameLayout = this.LLJJI;
                if (frameLayout != null) {
                    C786410Ut5.LJZ(0, frameLayout);
                }
                SmartImageView smartImageView = this.LLJJIII;
                if (smartImageView != null) {
                    C786410Ut5.LLFF(0, smartImageView);
                }
                C1331670kl3 c1331670kl3LJIIIZ2 = C1331660kl2.LJIIIZ(festivalEntityLIZ.mBannerDetail.bannerResource);
                c1331670kl3LJIIIZ2.LIZLLL("AbsCommonHeaderLayout");
                Context context = getContext();
                C1331750klB c1331750klB = new C1331750klB();
                c1331750klB.LJ = C654910PmT.LIZ(2.0f, context);
                c1331750klB.LIZIZ = C654910PmT.LIZ(0.0f, context);
                c1331670kl3LJIIIZ2.LJJI = new C1331730kl9(c1331750klB);
                c1331670kl3LJIIIZ2.LJJ(this.LLJJIII);
                C786410Ut5.h3(c1331670kl3LJIIIZ2);
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", "tag_page");
                if (C828040We2.LIZ() != null && C828040We2.LIZ().activityType != 0) {
                    str2 = "lottery";
                } else {
                    str2 = "donation";
                }
                c2344009Gk.LJIIIIZZ("gen", str2);
                c2344009Gk.LJIIIIZZ("tag_id", challengeDetail.challenge.getCid());
                C20684815ws.LJIILLIIL("xmas_banner_show", c2344009Gk.LIZ);
                FrameLayout frameLayout2 = this.LLJJI;
                if (frameLayout2 != null) {
                    C786410Ut5.O7(frameLayout2, new ACListenerS131S0200000_29(this, festivalEntityLIZ, 21));
                }
            }
        } else {
            FestivalEntity festivalEntityLIZ2 = C828040We2.LIZ();
            if (festivalEntityLIZ2 != null && (list = festivalEntityLIZ2.hashTagIds) != null && list.contains(challengeDetail.challenge.getCid()) && (view = this.LLILZLL) != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            this.LLJJIII = (SmartImageView) findViewById(R.id.a5l);
            FrameLayout frameLayout3 = this.LLJJI;
            if (frameLayout3 != null) {
                C786410Ut5.LJZ(8, frameLayout3);
            }
        }
        Iterator it2 = ((ArrayList) this.LLJJIJIIJIL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC19417910y1) it2.next()).LIZLLL(challengeDetail);
        }
        C19371010qS.LIZJ("cd_start_activity_to_show_header_duration");
    }

    public void LIZLLL(String str) {
        String str2 = this.LLJJJIL.LJFF;
        String cid = getMChallenge().getCid();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("process_id", str2);
        c2344009Gk.LJIIIIZZ("tag_id", cid);
        C20684815ws.LJIILLIIL("tag_detail_click_icon", c2344009Gk.LIZ);
        IChallengeDetailLegacyService iChallengeDetailLegacyServiceLIZ = ChallengeDetailLegacyServiceImpl.LIZ();
        C19EG activity = getActivity();
        C627150Oin c627150Oin = new C627150Oin();
        C786410Ut5.LJJIJL(c627150Oin.LIZ, "extra_zoom_info", ZoomAnimationUtils.LIZ(getMAvatar()));
        c627150Oin.LIZ.putFloat("wh_ratio", 0.1f);
        c627150Oin.LIZ.putBoolean("enable_download_img", false);
        C786410Ut5.LJJIZ(c627150Oin.LIZ, "challenge_info", getMChallenge());
        C786410Ut5.LJJJI("process_id", this.LLJJJIL.LJFF, c627150Oin.LIZ);
        String[] strArr = new String[1];
        if (TextUtils.isEmpty(str)) {
            str = new Uri.Builder().scheme("res").path(String.valueOf(R.drawable.cg4)).build().toString();
        }
        strArr[0] = str;
        c627150Oin.LIZ.putStringArray("uri", strArr);
        iChallengeDetailLegacyServiceLIZ.LJIILLIIL(activity, c627150Oin.LIZ);
    }

    @C14EU
    public final void onEvent(C1365870leD c1365870leD) {
        if (TextUtils.equals("challenge", c1365870leD.LIZLLL)) {
            IMSharePanelApi.LIZ.getClass();
            C1599690rjL.LIZ().getShareService().LJIL(getContext(), getMAvatar(), c1365870leD);
        }
    }

    public final void setHeaderAlpha(float f) {
        C786410Ut5.W4(getMHeaderContainer(), 1 - f);
        Iterator<InterfaceC19417910y1> it2 = this.LLJJIJIIJIL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(f);
        }
    }

    public final void setMAvatar(SmartImageView smartImageView) {
        this.LLILLL = smartImageView;
    }

    public final void setMChallenge(Challenge challenge) {
        this.LLJJJ = challenge;
    }

    public final void setMChallengeDetail(ChallengeDetail challengeDetail) {
        this.LLJJIJIL = challengeDetail;
    }

    public final void setMDescContainer(View view) {
        this.LLILZLL = view;
    }

    public final void setMDescContainerVs(ViewStub viewStub) {
        this.LLILZIL = viewStub;
    }

    public final void setMHeaderContainer(LinearLayout linearLayout) {
        this.LLILLJJLI = linearLayout;
    }

    public final void setMTitle(TextView textView) {
        this.LLILZ = textView;
    }

    public final void setMViewModel(ChallengeDetailViewModel challengeDetailViewModel) {
        this.LLJJJJ = challengeDetailViewModel;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0mVs] */
    public AbstractC19417810y0(Context context, C19406610wC c19406610wC, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = "AbsCommonHeaderView";
        this.LLJJIJIIJIL = new ArrayList();
        this.LLJJJIL = c19406610wC;
        C786410Ut5.Td(C786410Ut5.ne(context), getLayoutResId(), this, true);
        LIZIZ();
        LIZJ();
        this.LLJJJJJIL = new AObserverS231S0100000_29(this, 127);
        this.LLJJJJLIIL = new InterfaceC344350Dej() { // from class: X.0mVs
            @Override // X.InterfaceC344350Dej
            public final void LIZ(Aweme aweme) {
                NextLiveData<Pair<Integer, C194457115z>> nextLiveData;
                Pair<Integer, C194457115z> value;
                C194457115z second;
                ChallengeDetailViewModel mViewModel = this.LIZ.getMViewModel();
                if (mViewModel != null && (nextLiveData = mViewModel.LLILLJJLI) != null && (value = nextLiveData.getValue()) != null && (second = value.getSecond()) != null) {
                    C1603960rqE.LIZ = second;
                    C19724912Fj c19724912FjLIZLLL = C19724912Fj.LIZLLL();
                    C19EG activity = this.LIZ.getActivity();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("aweme://aweme/detail/");
                    sbLIZ.append(aweme.getAid());
                    C686150Qvl c686150Qvl = new C686150Qvl(C2188811AlT.LIZIZ(sbLIZ));
                    c686150Qvl.LIZIZ("refer", "challenge");
                    c686150Qvl.LIZIZ("video_from", "from_challenge");
                    c686150Qvl.LIZIZ("challenge_id", this.LIZ.getMChallenge().getCid());
                    c686150Qvl.LIZ(2, "video_type");
                    c686150Qvl.LIZ(AwemeExtKt.getEnterpriseType(aweme), "profile_enterprise_type");
                    c19724912FjLIZLLL.LJI(activity, c686150Qvl.LIZJ());
                    C1483370ohj.LIZ(aweme);
                }
            }
        };
    }
}
