package X;

import Y.ACListenerS1S4201000_10;
import Y.ARunnableS15S1100000_10;
import Y.ARunnableS79S0200000_10;
import android.animation.Animator;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.config.EcSearchSugOptimizeConfig;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecommerce.search.sug.ISearchSugContextAbility;
import com.ss.android.ugc.aweme.ecommerce.search.sug.ui.comon.EcOnSearchTouchListener;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.EcSearchIntermediateViewModelNew;
import com.ss.android.ugc.aweme.search.model.AttachImage;
import com.ss.android.ugc.aweme.search.model.EComWordRichExpression;
import com.ss.android.ugc.aweme.search.model.IconTextInfo;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import com.ss.android.ugc.aweme.search.model.WordAttachInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QTs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C671020QTs extends AbstractC21673619ry<RecyclerView.ViewHolder> implements C0QU5 {
    public final C19EG LL;
    public final View LLILLJJLI;
    public C0QT7 LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public final List<SearchSugEntity> LLIZ = new ArrayList();
    public SearchSugEntity LLIZLLLIL;
    public C0QU1 LLJ;
    public final EcSearchIntermediateViewModelNew LLJI;
    public final C0QTK LLJIJIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLIZ).size();
    }

    @Override // X.C0QU5
    public final C671010QTr LJLLLL(ViewGroup viewGroup) {
        int i = C671010QTr.LLJJL;
        return C671090QTz.LIZ(viewGroup, this.LLILZ, this.LLILLL);
    }

    @Override // X.C0QU5
    public final C671030QTt LLIIIZ(ViewGroup viewGroup) {
        int i = C671030QTt.LLJJJIL;
        String str = this.LLILZ;
        return C671080QTy.LIZ(viewGroup, this.LLILLL, this.LLJIJIL, str);
    }

    @Override // X.C0QU5
    public final C671040QTu LLIILZL(ViewGroup viewGroup) {
        String str = this.LLILZ;
        return C671040QTu.I5(viewGroup, this.LLILLL, this.LLJIJIL, str);
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        SearchSugEntity searchSugEntity;
        if (!this.LLIZ.isEmpty()) {
            searchSugEntity = (SearchSugEntity) ListProtector.get(this.LLIZ, i);
        } else {
            searchSugEntity = null;
        }
        if (searchSugEntity == null) {
            return 0;
        }
        if (searchSugEntity.LIZJ()) {
            return 1;
        }
        if (searchSugEntity.LIZ == 5) {
            return 5;
        }
        if (C0QNG.LJ(searchSugEntity)) {
            return 2;
        }
        int i2 = searchSugEntity.LIZ;
        if (i2 == 3) {
            return 3;
        }
        if (i2 == 7) {
            return 7;
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.getRecycledViewPool().setMaxRecycledViews(2, 10);
        recyclerView.getRecycledViewPool().setMaxRecycledViews(0, 10);
        recyclerView.getRecycledViewPool().setMaxRecycledViews(1, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof C0QUA) {
            ((C0QUA) viewHolder).onViewAttachedToWindow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof C0QUA) {
            ((C0QUA) viewHolder).onViewDetachedFromWindow();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0QTK] */
    public C671020QTs(View view, C19EG c19eg) {
        EcSearchIntermediateViewModelNew ecSearchIntermediateViewModelNew;
        this.LL = c19eg;
        this.LLILLJJLI = view;
        if (c19eg != null) {
            ecSearchIntermediateViewModelNew = (EcSearchIntermediateViewModelNew) C679340Qkm.LIZ(view, c19eg).get(EcSearchIntermediateViewModelNew.class);
        } else {
            ecSearchIntermediateViewModelNew = null;
        }
        this.LLJI = ecSearchIntermediateViewModelNew;
        this.LLJIJIL = new InterfaceC425440GmE() { // from class: X.0QTK
            @Override // X.InterfaceC425440GmE
            public final void LJJIL() {
                ISearchSugContextAbility iSearchSugContextAbility;
                C0QT7 c0qt7 = this.LIZ.LLILLL;
                if (c0qt7 == null || (iSearchSugContextAbility = c0qt7.LIZ) == null) {
                    return;
                }
                iSearchSugContextAbility.PG1(true);
            }

            @Override // X.InterfaceC425440GmE
            public final void LIZ(boolean z) {
                LiveData liveData;
                EcSearchIntermediateViewModelNew ecSearchIntermediateViewModelNew2 = this.LIZ.LLJI;
                if (ecSearchIntermediateViewModelNew2 != null && (liveData = (LiveData) ecSearchIntermediateViewModelNew2.LLILZLL.getValue()) != null) {
                    liveData.setValue(Boolean.valueOf(z));
                }
            }

            @Override // X.InterfaceC425440GmE
            public final void LIZIZ(final int i, final SearchSugEntity searchSugEntity, final String str) {
                C0QTJ c0qtj = C0QTJ.LIZ;
                C671020QTs c671020QTs = this.LIZ;
                C19EG c19eg2 = c671020QTs.LL;
                String str2 = c671020QTs.LLILZLL;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = c671020QTs.LLILZIL;
                if (str3 == null) {
                    str3 = "";
                }
                c0qtj.getClass();
                if (c19eg2 != null) {
                    final String strValueOf = String.valueOf(System.currentTimeMillis());
                    Word word = searchSugEntity.mWord;
                    if (word != null) {
                        C670150QQj<C0QTM> c670150QQj = new C670150QQj<C0QTM>() { // from class: X.0QTM
                        };
                        c670150QQj.LJIILLIIL("raw_query", str2);
                        c670150QQj.LJIILLIIL("words_content", word.getWord());
                        c670150QQj.LJIJ(Integer.valueOf(i));
                        c670150QQj.LJIILLIIL("impr_id", str3);
                        c670150QQj.LJIILLIIL("group_id", word.getId());
                        c670150QQj.LJIILLIIL("words_source", "sug");
                        c670150QQj.LJIILLIIL("sug_type", str);
                        c670150QQj.LJFF("feedback_id", strValueOf, InterfaceC1210900hcG.LIZ);
                        c670150QQj.LJIILJJIL();
                    }
                    C1390850mIV c1390850mIV = new C1390850mIV();
                    C1247530iZL c1247530iZL = new C1247530iZL();
                    c1247530iZL.LIZJ(R.raw.icon_flag);
                    c1247530iZL.LIZIZ(2131849334);
                    c1247530iZL.LJ = new ACListenerS1S4201000_10(i, c19eg2, searchSugEntity, str, strValueOf, str2, str3, 0);
                    C1247530iZL c1247530iZL2 = new C1247530iZL();
                    c1247530iZL2.LIZJ(R.raw.icon_heart_broken);
                    c1247530iZL2.LIZIZ(2131849336);
                    c1247530iZL2.LJ = new ACListenerS1S4201000_10(i, c19eg2, searchSugEntity, str, strValueOf, str2, str3, 1);
                    c1390850mIV.LIZ(c1247530iZL, c1247530iZL2);
                    final String str4 = str2;
                    final String str5 = str3;
                    c1390850mIV.LIZ.LL = new DialogInterface.OnCancelListener() { // from class: X.0QTL
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            C0QTJ c0qtj2 = C0QTJ.LIZ;
                            SearchSugEntity searchSugEntity2 = searchSugEntity;
                            int i2 = i;
                            String str6 = str;
                            String str7 = strValueOf;
                            String str8 = str4;
                            String str9 = str5;
                            c0qtj2.getClass();
                            C0QTJ.LIZ(searchSugEntity2, i2, "cancel", str6, str7, str8, str9);
                        }
                    };
                    c1390850mIV.LIZJ().show(c19eg2.getSupportFragmentManager(), "SugFeedBackInBottom");
                }
                this.LIZ.notifyDataSetChanged();
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v6, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        final C671040QTu c671040QTu;
        C671660QWe c671660QWeLIZIZ;
        boolean z;
        boolean z2;
        int i2;
        EComWordRichExpression eComWordRichExpression;
        WordAttachInfo wordAttachInfo;
        List<AttachImage> list;
        String str;
        int value;
        ForegroundColorSpan foregroundColorSpan;
        int iIntValue;
        List<IconTextInfo> list2;
        IconTextInfo iconTextInfo;
        EComWordRichExpression eComWordRichExpression2;
        C671010QTr c671010QTr;
        final C671030QTt c671030QTt;
        int iIntValue2;
        boolean z3;
        C430210Gtv avatarImageView;
        Integer numLIZJ;
        C430210Gtv avatarImageView2;
        C430210Gtv avatarImageView3;
        C1331070kk5 hierarchy;
        C1331100kk8 c1331100kk8;
        String userAvatarUri;
        C1610670s13 c1610670s13;
        C671660QWe c671660QWeLIZIZ2;
        List<IconTextInfo> list3;
        IconTextInfo iconTextInfo2;
        int iLIZ;
        String userAvatarUri2;
        C1610670s13 c1610670s132;
        EComWordRichExpression eComWordRichExpression3;
        Integer numLIZJ2;
        String userAvatarUri3;
        C1610670s13 c1610670s133;
        View viewFindViewWithTag;
        C0QU7 c0qu7;
        String string;
        int itemViewType = getItemViewType(i);
        String str2 = "";
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                if (itemViewType != 2) {
                    if (itemViewType == 5 && (viewHolder instanceof C0QU7) && (c0qu7 = (C0QU7) viewHolder) != null) {
                        C19EG c19eg = this.LL;
                        if (c19eg != null && (string = c19eg.getString(2131822068)) != null) {
                            str2 = string;
                        }
                        c0qu7.LLILLJJLI.setText(str2);
                        return;
                    }
                    return;
                }
                if (!(viewHolder instanceof C671030QTt) || (c671030QTt = (C671030QTt) viewHolder) == null) {
                    return;
                }
                SearchSugEntity searchSugEntity = (SearchSugEntity) ListProtector.get(this.LLIZ, i);
                String str3 = this.LLILZIL;
                if (searchSugEntity == null || searchSugEntity.sugExtraInfo == null) {
                    return;
                }
                LinearLayout linearLayout = c671030QTt.LLJJIII;
                if (linearLayout != null && (viewFindViewWithTag = linearLayout.findViewWithTag("ec_info_view")) != null) {
                    C786410Ut5.LJJL(viewFindViewWithTag, c671030QTt.LLJJIII);
                }
                SugExtraInfo sugExtraInfo = searchSugEntity.sugExtraInfo;
                if (sugExtraInfo != null && (userAvatarUri3 = sugExtraInfo.getUserAvatarUri()) != null && userAvatarUri3.length() != 0 && (c1610670s133 = c671030QTt.LLJILLL) != null && c1610670s133.getAvatarImageView() != null) {
                    View view = c671030QTt.itemView;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    layoutParams.height = C0HCL.LIZ(52.0f, c671030QTt.itemView.getContext());
                    C786410Ut5.W5(view, layoutParams);
                }
                c671030QTt.LLJJI.setBiggerTextSize(C0QNG.LIZLLL());
                c671030QTt.LLILLL = searchSugEntity;
                Integer numValueOf = Integer.valueOf(searchSugEntity.LIZJ);
                if (numValueOf.intValue() >= 0) {
                    iIntValue2 = numValueOf.intValue();
                } else {
                    iIntValue2 = c671030QTt.LLILZ;
                }
                c671030QTt.LLILZ = iIntValue2;
                if (str3 == null) {
                    str3 = "";
                }
                c671030QTt.LLILZIL = str3;
                TuxTextView tuxTextView = c671030QTt.LLJJIJIIJIL;
                if (tuxTextView != null) {
                    tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c671030QTt.LLJJ.getLayoutParams();
                marginLayoutParams.setMarginEnd(C341940Daq.LIZ(12.0d));
                C786410Ut5.M6(c671030QTt.LLJJ, marginLayoutParams);
                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1j, c671030QTt.itemView.getContext());
                if (numLIZJ3 != null) {
                    c671030QTt.LLJJ.setTintColor(numLIZJ3.intValue());
                }
                C425430GmD c425430GmD = c671030QTt.LLJJIJIL;
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_arrow_up_left_ltr;
                c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.a1j, c671030QTt.itemView.getContext());
                c425430GmD.setImageDrawable(c419910GdJ.LIZ(c671030QTt.itemView.getContext()));
                c671030QTt.LLJJIJI.setBackground(c671030QTt.itemView.getContext().getDrawable(R.drawable.bkc));
                C786410Ut5.LJLLLLLL(0, c671030QTt.LLJJIJI);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) c671030QTt.LLJJ.getLayoutParams();
                marginLayoutParams2.setMarginEnd(C341940Daq.LIZ(20.0d));
                marginLayoutParams2.setMarginStart(C341940Daq.LIZ(24.0d));
                C786410Ut5.M6(c671030QTt.LLJJ, marginLayoutParams2);
                if (C294590Bgf.LIZ() && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1j, c671030QTt.itemView.getContext())) != null) {
                    int iIntValue3 = numLIZJ2.intValue();
                    TuxTextView tuxTextView2 = c671030QTt.LLJJIJIIJIL;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setTextColor(iIntValue3);
                    }
                }
                c671030QTt.LLJJI.e0(c671030QTt.itemView.getContext(), C0QNG.LIZIZ(searchSugEntity, c671030QTt.itemView.getContext()), C0QNG.LIZJ(searchSugEntity, c671030QTt.itemView));
                if (C142300gX.LIZ() && (eComWordRichExpression3 = searchSugEntity.wordRichExpression) != null && eComWordRichExpression3.LIZ()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (C288700BTg.LIZ()) {
                    C429940GtU c429940GtU = c671030QTt.LLJJI;
                    View view2 = c671030QTt.itemView;
                    SugExtraInfo sugExtraInfo2 = searchSugEntity.sugExtraInfo;
                    if (sugExtraInfo2 != null && (userAvatarUri2 = sugExtraInfo2.getUserAvatarUri()) != null && userAvatarUri2.length() != 0 && (c1610670s132 = c671030QTt.LLJILLL) != null && c1610670s132.getAvatarImageView() != null) {
                        iLIZ = C0HCL.LIZ(52.0f, c671030QTt.itemView.getContext());
                    } else {
                        iLIZ = c671030QTt.LLJIJIL;
                    }
                    c429940GtU.i0(iLIZ, view2, z3);
                }
                if (z3) {
                    EComWordRichExpression eComWordRichExpression4 = searchSugEntity.wordRichExpression;
                    if (eComWordRichExpression4 != null && (list3 = eComWordRichExpression4.iconTextInfo) != null && (iconTextInfo2 = (IconTextInfo) C13LP.LJJJLL(list3)) != null) {
                        float f = C0QWW.LIZ;
                        c671660QWeLIZIZ2 = C0QWW.LIZIZ(c671030QTt.itemView.getContext(), iconTextInfo2);
                    } else {
                        c671660QWeLIZIZ2 = null;
                    }
                    float f2 = C0QWW.LIZ;
                    C0QWW.LIZ(c671660QWeLIZIZ2, c671030QTt.LLJJIII);
                }
                SugExtraInfo sugExtraInfo3 = searchSugEntity.sugExtraInfo;
                if (sugExtraInfo3 != null && (userAvatarUri = sugExtraInfo3.getUserAvatarUri()) != null && userAvatarUri.length() != 0 && (c1610670s13 = c671030QTt.LLJILLL) != null && c1610670s13.getAvatarImageView() != null) {
                    C1610670s13 c1610670s134 = c671030QTt.LLJILLL;
                    if (c1610670s134 != null && c1610670s134.getAvatarImageView() != null) {
                        FrameLayout frameLayout = c671030QTt.LLJILJIL;
                        if (frameLayout != null) {
                            C786410Ut5.LJZ(0, frameLayout);
                        }
                        if (!sugExtraInfo3.isCreatorLive()) {
                            C1610670s13 c1610670s135 = c671030QTt.LLJILLL;
                            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1610670s135);
                            c1610670s135.setLayoutParams(layoutParams2);
                        } else {
                            C1610670s13 c1610670s136 = c671030QTt.LLJILLL;
                            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34)), 17);
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1610670s136);
                            c1610670s136.setLayoutParams(layoutParams3);
                        }
                        C259800zU c259800zU = new C259800zU();
                        ?? userAvatarUri4 = sugExtraInfo3.getUserAvatarUri();
                        c259800zU.element = userAvatarUri4;
                        ?? r11 = userAvatarUri4;
                        if (userAvatarUri4 == 0) {
                            r11 = "";
                        }
                        C1334210kp9.LIZIZ(r11, EnumC1769850w9n.EC_SEARCH_SUG_AVATAR_IMAGE_SCENE, null, null, false, false, null, null);
                        c259800zU.element = r11;
                        C670940QTk.LIZ.getClass();
                        if (((EcSearchSugOptimizeConfig) C670940QTk.LIZJ.getValue()).enableAsyncImage) {
                            C823050WQl.LIZJ().execute(new ARunnableS79S0200000_10(c259800zU, c671030QTt, 68));
                        } else {
                            String str4 = (String) c259800zU.element;
                            if (str4 != null) {
                                str2 = str4;
                            }
                            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str2);
                            c1331670kl3LJIIIZ.LJJ(c671030QTt.LLJILLL.getAvatarImageView());
                            c1331670kl3LJIIIZ.LIZLLL("SearchUserSugViewHolder");
                            C786410Ut5.h3(c1331670kl3LJIIIZ);
                        }
                        C0QNG.LJI(c671030QTt.LLJILLL, 2130971789);
                        C786410Ut5.LJZ(8, c671030QTt.LLJJJ);
                    }
                } else {
                    C1610670s13 c1610670s137 = c671030QTt.LLJILLL;
                    if (c1610670s137 != null && (avatarImageView = c1610670s137.getAvatarImageView()) != null) {
                        avatarImageView.setController(null);
                    }
                }
                SugExtraInfo sugExtraInfo4 = searchSugEntity.sugExtraInfo;
                C1608500rxY c1608500rxY = c671030QTt.LLJ;
                if (c1608500rxY != null) {
                    c1608500rxY.LJII();
                }
                if (sugExtraInfo4 != null && sugExtraInfo4.isCreatorLive()) {
                    if (sugExtraInfo4.isCreatorLive()) {
                        C1610770s1D c1610770s1D = c671030QTt.LLJILJILJ;
                        if (c1610770s1D != null) {
                            C786410Ut5.Y(c1610770s1D, 0);
                        }
                        C1610670s13 c1610670s138 = c671030QTt.LLJILLL;
                        C1608500rxY c1608500rxY2 = new C1608500rxY(c1610670s138, c1610670s138, c671030QTt.LLJILJILJ);
                        c1608500rxY2.LJIIIIZZ = false;
                        c671030QTt.LLJ = c1608500rxY2;
                        c671030QTt.LLJILLL.LJFF(true);
                        C0QNG.LJFF(c671030QTt.LLJILLL, 23.33d, 11.5d);
                    }
                } else {
                    C1610670s13 c1610670s139 = c671030QTt.LLJILLL;
                    if (c1610670s139 != null) {
                        c1610670s139.LJFF(false);
                    }
                    C1610770s1D c1610770s1D2 = c671030QTt.LLJILJILJ;
                    if (c1610770s1D2 != null) {
                        C786410Ut5.Y(c1610770s1D2, 8);
                    }
                    Context context = c671030QTt.itemView.getContext();
                    if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.ng, context)) != null) {
                        int iIntValue4 = numLIZJ.intValue();
                        C1610670s13 c1610670s1310 = c671030QTt.LLJILLL;
                        if (c1610670s1310 != null && (avatarImageView3 = c1610670s1310.getAvatarImageView()) != null && (hierarchy = avatarImageView3.getHierarchy()) != null && (c1331100kk8 = hierarchy.LIZJ) != null) {
                            c1331100kk8.LJFF = iIntValue4;
                        }
                        C1610670s13 c1610670s1311 = c671030QTt.LLJILLL;
                        if (c1610670s1311 != null && (avatarImageView2 = c1610670s1311.getAvatarImageView()) != null) {
                            avatarImageView2.setBorderWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
                        }
                    }
                    c671030QTt.LLJ = null;
                }
                c671030QTt.itemView.setOnTouchListener(new EcOnSearchTouchListener() { // from class: X.0QTw
                    public boolean LLIZ;
                    public long LLIZLLLIL;

                    @Override // com.ss.android.ugc.aweme.ecommerce.search.sug.ui.comon.EcOnSearchTouchListener
                    public final void LJ() {
                        C671030QTt c671030QTt2 = c671030QTt;
                        InterfaceC425440GmE interfaceC425440GmE = c671030QTt2.LL;
                        if (interfaceC425440GmE != null) {
                            interfaceC425440GmE.LIZIZ(c671030QTt2.LLILZ, c671030QTt2.LLILLL, "enrich_sug");
                        }
                    }

                    {
                        super(Boolean.TRUE);
                    }

                    @Override // X.AbstractC681090Qnb, X.AbstractViewOnTouchListenerC19382810sM
                    public final Animator LIZ(View view3) {
                        this.LLIZ = false;
                        C671030QTt c671030QTt2 = c671030QTt;
                        SearchSugEntity searchSugEntity2 = c671030QTt2.LLILLL;
                        if (searchSugEntity2 == null) {
                            return super.LIZ(view3);
                        }
                        C0QU6 c0qu6 = c671030QTt2.LLILLJJLI;
                        if (c0qu6 != null) {
                            this.LLIZ = c0qu6.LIZLLL(c671030QTt2.LLILZ, searchSugEntity2);
                        }
                        this.LLIZLLLIL = System.currentTimeMillis();
                        return super.LIZ(view3);
                    }

                    @Override // X.AbstractC681090Qnb
                    public final void LIZLLL(View view3) throws Throwable {
                        SearchSugEntity searchSugEntity2;
                        int i3;
                        String str5;
                        ISearchSugContextAbility iSearchSugContextAbilityLIZJ;
                        C670830QSz c670830QSzPD2;
                        ISearchSugContextAbility iSearchSugContextAbilityLIZJ2;
                        ISearchSugContextAbility iSearchSugContextAbilityLIZJ3;
                        C670830QSz c670830QSzPD22;
                        if (!C0OBG.LIZIZ(view3)) {
                            C671030QTt c671030QTt2 = c671030QTt;
                            if (c671030QTt2.LLILZLL && (searchSugEntity2 = c671030QTt2.LLILLL) != null) {
                                C0QER c0qerLIZJ = C640270P9l.LIZJ(C946803n0.LIZ(c671030QTt2.itemView), C1388190mED.LIZIZ(c671030QTt2.itemView.getContext()));
                                Fragment fragmentLIZ = C946803n0.LIZ(c671030QTt2.itemView);
                                String str6 = c671030QTt2.LLIZLLLIL;
                                int i4 = c671030QTt2.LLILZ;
                                String str7 = c671030QTt2.LLJI;
                                String str8 = c671030QTt2.LLIZ;
                                C0QU6 c0qu6 = c671030QTt2.LLILLJJLI;
                                if (c0qu6 != null && (iSearchSugContextAbilityLIZJ3 = c0qu6.LIZJ()) != null && (c670830QSzPD22 = iSearchSugContextAbilityLIZJ3.pD2()) != null) {
                                    i3 = c670830QSzPD22.LIZ;
                                } else {
                                    i3 = 0;
                                }
                                C0QU6 c0qu62 = c671030QTt2.LLILLJJLI;
                                if (c0qu62 != null && (iSearchSugContextAbilityLIZJ2 = c0qu62.LIZJ()) != null) {
                                    iSearchSugContextAbilityLIZJ2.y3();
                                }
                                C0QU6 c0qu63 = c671030QTt2.LLILLJJLI;
                                if (c0qu63 != null && (iSearchSugContextAbilityLIZJ = c0qu63.LIZJ()) != null && (c670830QSzPD2 = iSearchSugContextAbilityLIZJ.pD2()) != null) {
                                    str5 = c670830QSzPD2.LIZIZ;
                                } else {
                                    str5 = null;
                                }
                                C670100QQe.LIZLLL(fragmentLIZ, str6, i4, searchSugEntity2, str7, str8, i3, c0qerLIZJ, str5);
                                long jCurrentTimeMillis = System.currentTimeMillis() - this.LLIZLLLIL;
                                C0QU6 c0qu64 = c671030QTt2.LLILLJJLI;
                                if (c0qu64 != null) {
                                    c0qu64.LIZIZ(searchSugEntity2, c671030QTt2.LLILZIL, c671030QTt2.LLILZ, !this.LLIZ);
                                }
                                C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put(Scene.SCENE_SERVICE, "sug_item_click");
                                jSONObject.put("duration", jCurrentTimeMillis);
                                c1507790pL7.getClass();
                                C1507790pL7.LIZLLL("rd_ec_search_request_trace", jSONObject);
                            }
                        }
                    }
                });
                return;
            }
            if (!(viewHolder instanceof C671010QTr) || (c671010QTr = (C671010QTr) viewHolder) == null) {
                return;
            }
            SearchSugEntity searchSugEntity2 = (SearchSugEntity) ListProtector.get(this.LLIZ, i);
            String str5 = this.LLILZIL;
            if (str5 != null) {
                str2 = str5;
            }
            c671010QTr.I5(searchSugEntity2, str2, i);
            return;
        }
        if (!(viewHolder instanceof C671040QTu) || (c671040QTu = (C671040QTu) viewHolder) == null) {
            return;
        }
        final SearchSugEntity searchSugEntity3 = (SearchSugEntity) ListProtector.get(this.LLIZ, i);
        String str6 = this.LLILZIL;
        if (searchSugEntity3 == null) {
            return;
        }
        View viewFindViewWithTag2 = c671040QTu.LLJILLL.findViewWithTag("ec_info_view");
        if (viewFindViewWithTag2 != null) {
            C786410Ut5.LJJJLZIJ(viewFindViewWithTag2, c671040QTu.LLJILLL);
        }
        C429940GtU c429940GtU2 = c671040QTu.LLJILJILJ;
        int visibility = c429940GtU2.getVisibility();
        c429940GtU2.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c429940GtU2);
        if (str6 == null) {
            str6 = "";
        }
        int i3 = C671040QTu.LLJJJJLIIL;
        if (c671040QTu.LLJJIJIL != i3) {
            ViewGroup.LayoutParams layoutParams4 = c671040QTu.itemView.getLayoutParams();
            layoutParams4.height = i3;
            c671040QTu.LLJJIJIL = i3;
            C786410Ut5.W5(c671040QTu.itemView, layoutParams4);
        }
        c671040QTu.LLILLJJLI.setTextSize(1, C0QNG.LIZLLL());
        c671040QTu.LLILLL.setTextSize(1, C0QNG.LIZLLL());
        c671040QTu.LLILZ.setTextSize(1, 13.0f);
        c671040QTu.LLILZIL.setTextSize(1, 13.0f);
        Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.uh, c671040QTu.itemView.getContext());
        if (numLIZJ4 != null) {
            c671040QTu.LLILZ.setTextColor(numLIZJ4.intValue());
            c671040QTu.LLILZIL.setTextColor(numLIZJ4.intValue());
        } else {
            c671040QTu.LLILZ.setTextColor(0);
            c671040QTu.LLILZIL.setTextColor(0);
        }
        int i4 = searchSugEntity3.LIZJ;
        if (i4 < 0) {
            i4 = i;
        }
        c671040QTu.LLJJJIL = i4;
        c671040QTu.LLJJIII = searchSugEntity3;
        c671040QTu.LLJJIJIIJIL = i;
        c671040QTu.LLJJJ = c671040QTu.LLJJIJI;
        Context context2 = c671040QTu.itemView.getContext();
        EComWordRichExpression eComWordRichExpression5 = searchSugEntity3.wordRichExpression;
        if (eComWordRichExpression5 != null && (list2 = eComWordRichExpression5.iconTextInfo) != null && list2.size() > 0 && (iconTextInfo = (IconTextInfo) ListProtector.get(list2, 0)) != null && (eComWordRichExpression2 = searchSugEntity3.wordRichExpression) != null && eComWordRichExpression2.LIZ()) {
            float f3 = C0QWW.LIZ;
            c671660QWeLIZIZ = C0QWW.LIZIZ(c671040QTu.itemView.getContext(), iconTextInfo);
        } else {
            c671660QWeLIZIZ = null;
        }
        SugExtraInfo sugExtraInfo5 = searchSugEntity3.sugExtraInfo;
        if (sugExtraInfo5 != null && sugExtraInfo5.isBrandShop()) {
            z = true;
        } else {
            z = false;
        }
        if ((c671660QWeLIZIZ != null || z) && 1 != 0 && C142300gX.LIZ()) {
            View view3 = c671040QTu.itemView;
            C429940GtU c429940GtU3 = c671040QTu.LLJILJILJ;
            ViewGroup viewGroup = c671040QTu.LLJILLL;
            View viewFindViewById = view3.findViewById(R.id.eu1);
            if (viewFindViewById != null) {
                C0H1U.LIZIZ(viewFindViewById);
            }
            View viewFindViewById2 = view3.findViewById(R.id.ew3);
            if (viewFindViewById2 != null) {
                C0H1U.LIZIZ(viewFindViewById2);
            }
            if (c429940GtU3 != null) {
                c429940GtU3.setBiggerTextSize(C0QNG.LIZLLL());
                c429940GtU3.e0(view3.getContext(), C0QNG.LIZIZ(searchSugEntity3, view3.getContext()), C0QNG.LIZJ(searchSugEntity3, view3));
                C786410Ut5.LJLLLLLL(0, c429940GtU3);
            }
            if (C288700BTg.LIZ() && c429940GtU3 != null) {
                if (c671660QWeLIZIZ != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c429940GtU3.i0(i3, view3, z2);
            }
            C0QWW.LIZ(c671660QWeLIZIZ, viewGroup);
        } else {
            SugExtraInfo sugExtraInfo6 = searchSugEntity3.sugExtraInfo;
            if (sugExtraInfo6 != null && sugExtraInfo6.getSugHint().length() > 0) {
                TextView textView = c671040QTu.LLILLJJLI;
                View view4 = c671040QTu.itemView;
                CharSequence charSequenceLIZIZ = C0QNG.LIZIZ(searchSugEntity3, view4.getContext());
                CharSequence charSequenceLIZIZ2 = C0QNG.LIZIZ(searchSugEntity3, textView.getContext());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceLIZIZ2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(" · ");
                sbLIZ.append(searchSugEntity3.sugExtraInfo.getSugHint());
                spannableStringBuilder.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ));
                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C960203pA.LIZ(R.attr.uh, textView.getContext())), charSequenceLIZIZ2.length(), spannableStringBuilder.length(), 34);
                textView.setText(spannableStringBuilder);
                if (searchSugEntity3.LIZLLL() && searchSugEntity3.sugExtraInfo.getSugHint().length() > 0) {
                    textView.setText("");
                    value = EnumC2009007tw.TWO_LINE_ALL.getValue();
                } else if (textView.getPaint().measureText(textView.getText().toString()) < C418440Gaw.LIZLLL(textView.getContext()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(124))) {
                    textView.setText("");
                    value = EnumC2009007tw.SINGLE_LINE_HINT.getValue();
                } else {
                    textView.setText("");
                    value = EnumC2009007tw.TWO_LINE_HINT.getValue();
                }
                if (value == EnumC2009007tw.SINGLE_LINE_HINT.getValue()) {
                    C786410Ut5.LJZL(0, (LinearLayout) view4.findViewById(R.id.eu1));
                    C786410Ut5.LL(8, (ConstraintLayout) view4.findViewById(R.id.ew3));
                    textView.setText(charSequenceLIZIZ);
                    C786410Ut5.LLLLZLL((TuxTextView) view4.findViewById(R.id.tv_sug_hint), 0);
                    C786410Ut5.LLLLZLL((TuxTextView) view4.findViewById(R.id.tv_sug_hint_point), 0);
                    ((TextView) view4.findViewById(R.id.tv_sug_hint)).setText(searchSugEntity3.sugExtraInfo.getSugHint());
                    ((TextView) view4.findViewById(R.id.tv_sug_hint_point)).setText(" · ");
                } else if (value == EnumC2009007tw.TWO_LINE_HINT.getValue()) {
                    C786410Ut5.LJZL(8, (LinearLayout) view4.findViewById(R.id.eu1));
                    C786410Ut5.LL(0, (ConstraintLayout) view4.findViewById(R.id.ew3));
                    ((TextView) view4.findViewById(R.id.tv_sug_new)).setText(charSequenceLIZIZ);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(searchSugEntity3.sugExtraInfo.getSugHint());
                    Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.uh, view4.getContext());
                    if (numLIZJ5 != null) {
                        iIntValue = numLIZJ5.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    C786410Ut5.q2(spannableStringBuilder2, new ForegroundColorSpan(iIntValue), 0, spannableStringBuilder2.length(), 34);
                    C786410Ut5.q2(spannableStringBuilder2, new AbsoluteSizeSpan(13, true), 0, spannableStringBuilder2.length(), 33);
                    ((TextView) view4.findViewById(R.id.tv_sug_hint_new)).setText(spannableStringBuilder2);
                } else if (value == EnumC2009007tw.TWO_LINE_ALL.getValue()) {
                    ((TextView) view4.findViewById(R.id.tv_sug_new)).setMaxWidth(C418440Gaw.LIZLLL(view4.getContext()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(138)));
                    C786410Ut5.LJZL(8, (LinearLayout) view4.findViewById(R.id.eu1));
                    C786410Ut5.LL(0, (ConstraintLayout) view4.findViewById(R.id.ew3));
                    C786410Ut5.LJZI(0, (ImageView) view4.findViewById(R.id.lkb));
                    ((TextView) view4.findViewById(R.id.tv_sug_new)).setText(charSequenceLIZIZ);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(searchSugEntity3.sugExtraInfo.getSugHint());
                    Integer numLIZJ6 = C1308910kAL.LIZJ(R.attr.uh, view4.getContext());
                    if (numLIZJ6 != null) {
                        foregroundColorSpan = new ForegroundColorSpan(numLIZJ6.intValue());
                    } else {
                        foregroundColorSpan = null;
                    }
                    C786410Ut5.q2(spannableStringBuilder3, foregroundColorSpan, 0, spannableStringBuilder3.length(), 34);
                    C786410Ut5.q2(spannableStringBuilder3, new AbsoluteSizeSpan(13, true), 0, spannableStringBuilder3.length(), 33);
                    ((TextView) view4.findViewById(R.id.tv_sug_hint_new)).setText(spannableStringBuilder3);
                }
            } else {
                C429910GtR.LIZIZ(searchSugEntity3, c671040QTu.LLILLJJLI, c671040QTu.itemView, c671040QTu.LLJI, C671040QTu.LLJJJJLIIL);
            }
        }
        if (C294590Bgf.LIZ()) {
            TextView textView2 = c671040QTu.LLILLJJLI;
            Context context3 = textView2.getContext();
            i2 = R.attr.a1j;
            textView2.setTextColor(C1308910kAL.LIZJ(R.attr.a1j, context3).intValue());
        } else {
            i2 = R.attr.a1j;
        }
        C425430GmD c425430GmD2 = c671040QTu.LLILZLL;
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_arrow_up_left_ltr;
        c419910GdJ2.LIZLLL = C1308910kAL.LIZJ(i2, c671040QTu.LLILLJJLI.getContext());
        c425430GmD2.setImageDrawable(c419910GdJ2.LIZ(c671040QTu.itemView.getContext()));
        TuxIconView tuxIconView = c671040QTu.LLIZ;
        if (tuxIconView != null) {
            tuxIconView.setTintColor(C1308910kAL.LIZJ(i2, c671040QTu.LLILLJJLI.getContext()).intValue());
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) c671040QTu.LLIZ.getLayoutParams();
            marginLayoutParams3.setMarginStart(C679280Qkg.LIZ(28));
            marginLayoutParams3.setMarginEnd(C341940Daq.LIZ(20.0d));
            C786410Ut5.M6(c671040QTu.LLIZ, marginLayoutParams3);
        }
        View view5 = c671040QTu.LLJIJIL;
        if (view5 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) view5.getLayoutParams();
            marginLayoutParams4.setMarginStart(C679280Qkg.LIZ(20));
            C786410Ut5.W5(c671040QTu.LLJIJIL, marginLayoutParams4);
            c671040QTu.LLJIJIL.setBackground(c671040QTu.LLILLJJLI.getContext().getDrawable(R.drawable.bkc));
            C786410Ut5.LJLLLLLL(0, c671040QTu.LLJIJIL);
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context2);
        if (c19egLIZIZ == null) {
            c19egLIZIZ = null;
        }
        C0PRW c0prwFetchTopFragmentData = C650950Pg5.fetchTopFragmentData(C651580Ph6.LIZLLL(c671040QTu.itemView), c19egLIZIZ);
        if (c0prwFetchTopFragmentData != null && !c0prwFetchTopFragmentData.searchPosition.isEmpty()) {
            c671040QTu.LLJJJ = c0prwFetchTopFragmentData.searchPosition;
        }
        final String str7 = c671040QTu.LLJJJ;
        View view6 = c671040QTu.itemView;
        final Boolean bool = Boolean.TRUE;
        final String str8 = str6;
        view6.setOnTouchListener(new EcOnSearchTouchListener(bool) { // from class: X.0QTv
            public boolean LLIZ;
            public long LLIZLLLIL;

            @Override // com.ss.android.ugc.aweme.ecommerce.search.sug.ui.comon.EcOnSearchTouchListener
            public final void LJ() {
                C671040QTu c671040QTu2 = c671040QTu;
                c671040QTu2.LLJJ.LIZIZ(c671040QTu2.LLJJIJIIJIL, c671040QTu2.LLJJIII, "normal_sug");
            }

            @Override // X.AbstractC681090Qnb, X.AbstractViewOnTouchListenerC19382810sM
            public final Animator LIZ(View view7) {
                this.LLIZLLLIL = System.currentTimeMillis();
                this.LLIZ = false;
                C0QU6 c0qu6 = c671040QTu.LLJJI;
                if (c0qu6 != null) {
                    this.LLIZ = c0qu6.LIZLLL(i, searchSugEntity3);
                }
                return super.LIZ(view7);
            }

            @Override // X.AbstractC681090Qnb
            public final void LIZLLL(View view7) throws Throwable {
                String str9;
                int i5;
                long jCurrentTimeMillis = System.currentTimeMillis();
                C671040QTu c671040QTu2 = c671040QTu;
                if (jCurrentTimeMillis - c671040QTu2.LL < 500) {
                    return;
                }
                C0QU6 c0qu6 = c671040QTu2.LLJJI;
                if (c0qu6 != null && c0qu6.LIZJ() != null && c671040QTu.LLJJI.LIZJ().pD2() != null) {
                    i5 = c671040QTu.LLJJI.LIZJ().pD2().LIZ;
                    str9 = c671040QTu.LLJJI.LIZJ().pD2().LIZIZ;
                } else {
                    str9 = null;
                    i5 = 0;
                }
                View view8 = c671040QTu.itemView;
                C0QER c0qerLIZIZ = C640270P9l.LIZIZ(view8, C1388190mED.LIZIZ(view8.getContext()));
                C0QU6 c0qu62 = c671040QTu.LLJJI;
                if (c0qu62 != null && c0qu62.LIZJ() != null) {
                    c671040QTu.LLJJI.LIZJ().y3();
                }
                Fragment fragmentLIZ = C946803n0.LIZ(c671040QTu.itemView);
                String str10 = str7;
                C671040QTu c671040QTu3 = c671040QTu;
                C670100QQe.LIZLLL(fragmentLIZ, str10, c671040QTu3.LLJJJIL, searchSugEntity3, c671040QTu3.LLJJJJJIL, c671040QTu3.LLJJIJI, i5, c0qerLIZIZ, str9);
                c671040QTu.LL = System.currentTimeMillis();
                long jCurrentTimeMillis2 = System.currentTimeMillis() - this.LLIZLLLIL;
                C0QU6 c0qu63 = c671040QTu.LLJJI;
                if (c0qu63 != null) {
                    c0qu63.LIZIZ(searchSugEntity3, str8, i, !this.LLIZ);
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(Scene.SCENE_SERVICE, "sug_item_click");
                    jSONObject.put("duration", jCurrentTimeMillis2);
                    C1507790pL7.LIZ.getClass();
                    C1507790pL7.LIZLLL("rd_ec_search_request_trace", jSONObject);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        });
        SearchSugEntity searchSugEntity4 = c671040QTu.LLJJIII;
        if (searchSugEntity4 != null && (eComWordRichExpression = searchSugEntity4.wordRichExpression) != null && (wordAttachInfo = eComWordRichExpression.wordAttachInfo) != null && (list = wordAttachInfo.attachImage) != null) {
            List<String> list4 = ((AttachImage) ListProtector.get(list, 0)).attachImageInfo.urlList;
            if (list4.size() > 0 && (str = (String) ListProtector.get(list4, 0)) != null && !str.isEmpty()) {
                C1334210kp9.LIZIZ(str, EnumC1769850w9n.EC_SEARCH_SUG_PRODUCT_SCENE, null, null, false, false, null, null);
                if (((Number) C0A93.LIZ.getValue()).intValue() == 1) {
                    C419910GdJ c419910GdJ3 = new C419910GdJ();
                    c419910GdJ3.LIZ = R.raw.icon_magnifying_glass_offset;
                    c419910GdJ3.LIZLLL = C1308910kAL.LIZJ(R.attr.a1k, c671040QTu.itemView.getContext());
                    c671040QTu.LLJILJIL.setImageDrawable(c419910GdJ3.LIZ(c671040QTu.itemView.getContext()));
                }
                C670940QTk.LIZ.getClass();
                if (((EcSearchSugOptimizeConfig) C670940QTk.LIZJ.getValue()).enableAsyncImage) {
                    C823050WQl.LIZJ().execute(new ARunnableS15S1100000_10(c671040QTu, str, 4));
                } else {
                    C1331670kl3 c1331670kl3LJIIIZ2 = C1331660kl2.LJIIIZ(str);
                    c1331670kl3LJIIIZ2.LJJ(c671040QTu.LLJILJIL);
                    c1331670kl3LJIIIZ2.LIZLLL("EcSearchSugViewHolder");
                    C786410Ut5.h3(c1331670kl3LJIIIZ2);
                }
                C786410Ut5.LLFF(0, c671040QTu.LLJILJIL);
                C0QNG.LJII(c671040QTu.LLJILJIL);
                c671040QTu.LLJJJJJIL = "image_sug";
                return;
            }
        }
        c671040QTu.LLJJJJJIL = "normal_sug";
        C786410Ut5.LLFF(8, c671040QTu.LLJILJIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0159  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r9, int r10) {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C671020QTs.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }
}
