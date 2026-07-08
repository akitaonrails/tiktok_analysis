package X;

import Y.ACListenerS155S0100000_21;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.comment.longpresspanel.ui.CommentLongPressFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentImageStruct;
import com.ss.android.ugc.aweme.experiment.CommentLongPressOptConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lMc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1354960lMc extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public List<C1346330l8h> LL;
    public Comment LLILLJJLI;
    public Aweme LLILLL;
    public String LLILZ = "";
    public EnumC1342450l2R LLILZIL;
    public C1371590lnR LLILZLL;
    public InterfaceC1362600lYw LLIZ;
    public InterfaceC1354710lMD LLIZLLLIL;
    public boolean LLJ;
    public int LLJI;
    public int LLJIJIL;
    public C1354740lMG LLJILJIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<C1346330l8h> list = this.LL;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        C1346330l8h c1346330l8h;
        List<C1346330l8h> list = this.LL;
        if (list != null && (c1346330l8h = (C1346330l8h) ListProtector.get(list, i)) != null) {
            return c1346330l8h.LIZ;
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        final C1354970lMd c1354970lMd;
        int itemViewType = getItemViewType(i);
        int size = 0;
        final C1346330l8h c1346330l8h = null;
        if (itemViewType != 0) {
            if (itemViewType == 2) {
                C1354990lMf.LIZ.getClass();
                if (C1354990lMf.LIZIZ() && (viewHolder instanceof C1354980lMe) && viewHolder != null) {
                    List<C1346330l8h> list = this.LL;
                    if (list != null) {
                        c1346330l8h = (C1346330l8h) ListProtector.get(list, i);
                    }
                    if (c1346330l8h instanceof C1346320l8g) {
                        RadiusLayout radiusLayout = (RadiusLayout) viewHolder.itemView.findViewById(R.id.eav);
                        if (radiusLayout != null) {
                            radiusLayout.setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
                        }
                        if (((C1346320l8g) c1346330l8h).LIZIZ) {
                            if (radiusLayout != null) {
                                radiusLayout.LIZ(C418440Gaw.LIZIZ(10), C418440Gaw.LIZIZ(10), 0.0f, 0.0f);
                                return;
                            }
                            return;
                        } else {
                            if (radiusLayout == null) {
                                return;
                            }
                            radiusLayout.setRadius(C418440Gaw.LIZIZ(10));
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        List<C1346330l8h> list2 = this.LL;
        if (list2 != null) {
            size = list2.size();
        }
        if (i >= size || !(viewHolder instanceof C1354970lMd) || (c1354970lMd = (C1354970lMd) viewHolder) == null) {
            return;
        }
        List<C1346330l8h> list3 = this.LL;
        if (list3 != null) {
            c1346330l8h = (C1346330l8h) ListProtector.get(list3, i);
        }
        if (!(c1346330l8h instanceof C1346290l8d)) {
            return;
        }
        C1346290l8d c1346290l8d = (C1346290l8d) c1346330l8h;
        c1354970lMd.LL = c1346290l8d;
        c1354970lMd.N5(c1346290l8d);
        C786410Ut5.I7(new ACListenerS155S0100000_21(c1354970lMd, 187), c1354970lMd.itemView);
        Function1<InterfaceC2234608pE, Unit> function1 = c1346290l8d.LJI;
        if (function1 == null) {
            return;
        }
        function1.invoke(new InterfaceC2234608pE() { // from class: X.0hhh
            @Override // X.InterfaceC2234608pE
            public final void LIZIZ() {
                C1354970lMd c1354970lMd2 = c1354970lMd;
                View view = c1354970lMd2.LLJIJIL;
                if (view != null) {
                    C786410Ut5.LJJJZ(view, (FrameLayout) c1354970lMd2.LLJI.getValue());
                }
                C786410Ut5.LLLLLLZZ(c1354970lMd.I5(), 0);
                C786410Ut5.T4(c1354970lMd.itemView, 1.0f);
                c1354970lMd.itemView.setClickable(true);
                c1354970lMd.N5((C1346290l8d) c1346330l8h);
            }

            @Override // X.InterfaceC2234608pE
            public final void LIZ(AwS585S0100000_6 awS585S0100000_6) {
                View view = (View) awS585S0100000_6.invoke(c1354970lMd.I5());
                if (Intrinsics.LJFF(view, c1354970lMd.I5())) {
                    return;
                }
                C786410Ut5.LLLLLLZZ(c1354970lMd.I5(), 8);
                ViewGroup viewGroup = (ViewGroup) c1354970lMd.LLJI.getValue();
                C786410Ut5.W5(view, new FrameLayout.LayoutParams(-1, -1));
                C786410Ut5.LJLLLLLL(0, view);
                viewGroup.addView(view);
                c1354970lMd.LLJIJIL = view;
            }

            @Override // X.InterfaceC2234608pE
            public final void LIZJ(Function1<? super View, Unit> function12) {
                function12.invoke(c1354970lMd.itemView);
            }
        });
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(final ViewGroup viewGroup, int i) {
        BaseSharePackage baseSharePackage;
        RecyclerView.ViewHolder c1354980lMe;
        C1369610lkF c1369610lkF;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    int i2 = C1354970lMd.LLJILJILJ;
                    Aweme aweme = this.LLILLL;
                    Comment comment = this.LLILLJJLI;
                    String str = this.LLILZ;
                    int i3 = this.LLJI;
                    AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(this, 1278);
                    C1354970lMd c1354970lMd = new C1354970lMd(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a3t, viewGroup, false));
                    c1354970lMd.LLILLJJLI = aweme;
                    c1354970lMd.LLILLL = comment;
                    c1354970lMd.LLILZ = str;
                    c1354970lMd.LLILZIL = awS565S0100000_21;
                    c1354970lMd.LLILZLL = i3;
                    c1354980lMe = c1354970lMd;
                } else {
                    int i4 = C1355000lMg.LLILLJJLI;
                    AwS565S0100000_21 awS565S0100000_212 = new AwS565S0100000_21(this, 1277);
                    View view = new View(viewGroup.getContext());
                    C786410Ut5.W5(view, new ViewGroup.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))));
                    c1354980lMe = new C1355000lMg(view, awS565S0100000_212);
                }
            } else {
                int i5 = C1354980lMe.LLILLJJLI;
                final Aweme aweme2 = this.LLILLL;
                final Comment comment2 = this.LLILLJJLI;
                final String str2 = this.LLILZ;
                C1371590lnR c1371590lnR = this.LLILZLL;
                final EnumC1342450l2R enumC1342450l2R = this.LLILZIL;
                final int i6 = this.LLJI;
                final int i7 = this.LLJIJIL;
                AwS565S0100000_21 awS565S0100000_213 = new AwS565S0100000_21(this, 1276);
                C1361400lX0 c1361400lX0LIZ = C1369530lk7.LIZ(viewGroup.getContext());
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(c1361400lX0LIZ), R.layout.a3u, viewGroup, false);
                C1369580lkC c1369580lkC = (C1369580lkC) viewTd.findViewById(R.id.eau);
                if (c1371590lnR != null) {
                    c1371590lnR.LIZIZ = EnumC1369720lkQ.COLLAPSE;
                    C1369610lkF c1369610lkF2 = new C1369610lkF();
                    c1369610lkF2.LIZJ = false;
                    c1369610lkF2.LIZIZ = true;
                    c1369610lkF2.LJ = C2176211AEx.LIZIZ();
                    c1371590lnR.LJJLIIIJ = c1369610lkF2;
                    C1354990lMf.LIZ.getClass();
                    if (((CommentLongPressOptConfig) C1354990lMf.LIZJ.getValue()).actionHeightOptimise && (c1369610lkF = c1371590lnR.LJJLIIIJ) != null) {
                        c1369610lkF.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                    }
                    c1371590lnR.LJJIFFI = new C1355090lMp() { // from class: X.0l7a
                        @Override // X.C1355090lMp, X.InterfaceC1361850lXj
                        public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, boolean z, BaseSharePackage baseSharePackage2, Context context) {
                            String str3;
                            String str4;
                            boolean z2;
                            String rootCommentId;
                            String aid;
                            String authorUid;
                            User author;
                            User user;
                            Integer numValueOf;
                            String cid;
                            Bundle bundle;
                            int i8;
                            List<CommentImageStruct> imageList;
                            String str5;
                            List<CommentImageStruct> imageList2;
                            CommentImageStruct commentImageStruct;
                            AwemeStatistics statistics;
                            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
                            Aweme aweme3 = aweme2;
                            Comment comment3 = comment2;
                            String str6 = str2;
                            EnumC1342450l2R enumC1342450l2R2 = enumC1342450l2R;
                            int i9 = i6;
                            int i10 = i7;
                            c1350920lG6.getClass();
                            C1350920lG6.LJJIIZ(aweme3, comment3, interfaceC1369790lkX, z, baseSharePackage2, str6, "icon", enumC1342450l2R2, i9, i10);
                            Aweme aweme4 = aweme2;
                            Comment comment4 = comment2;
                            String str7 = str2;
                            EnumC1342450l2R enumC1342450l2R3 = enumC1342450l2R;
                            int i11 = i6;
                            if (z) {
                                if (C729510SjV.LJJIJIL(aweme4)) {
                                    str3 = "story";
                                } else {
                                    str3 = "post";
                                }
                                int i12 = 0;
                                if (aweme4 != null && aweme4.isAd()) {
                                    str4 = "1";
                                } else {
                                    str4 = CardStruct.IStatusCode.DEFAULT;
                                }
                                if (comment4 != null && comment4.getCommentType() == 2) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                Long lValueOf = null;
                                if (z2) {
                                    rootCommentId = comment4.getRootCommentId();
                                } else {
                                    rootCommentId = null;
                                }
                                C2344009Gk c2344009Gk = new C2344009Gk();
                                c2344009Gk.LJIIIIZZ("platform", interfaceC1369790lkX.key());
                                if (aweme4 != null) {
                                    aid = aweme4.getAid();
                                } else {
                                    aid = null;
                                }
                                c2344009Gk.LJIIIIZZ("group_id", aid);
                                if (aweme4 != null) {
                                    authorUid = AwemeExtKt.getAuthorUid(aweme4);
                                } else {
                                    authorUid = null;
                                }
                                c2344009Gk.LJIIIIZZ("author_id", authorUid);
                                C735840Sti c735840Sti = C735840Sti.LIZ;
                                if (aweme4 != null) {
                                    author = aweme4.getAuthor();
                                } else {
                                    author = null;
                                }
                                c735840Sti.getClass();
                                c2344009Gk.LIZJ(C735840Sti.LJIIIIZZ(author), "follow_status");
                                if (comment4 != null) {
                                    user = comment4.getUser();
                                } else {
                                    user = null;
                                }
                                c2344009Gk.LIZJ(C1350920lG6.LJIIL(user), "comment_follow_status_to_user");
                                c2344009Gk.LJIIIIZZ("enter_from", str7);
                                c2344009Gk.LJIIIIZZ("enter_method", "icon");
                                c2344009Gk.LJIIIIZZ("story_type", str3);
                                c2344009Gk.LJIIIIZZ("is_ad", str4);
                                if (aweme4 != null) {
                                    numValueOf = Integer.valueOf(aweme4.getAwemeType());
                                } else {
                                    numValueOf = null;
                                }
                                c2344009Gk.LJ(numValueOf, "aweme_type");
                                if (comment4 == null || (cid = comment4.getCid()) == null) {
                                    cid = "";
                                }
                                c2344009Gk.LJIIIIZZ("comment_id", cid);
                                if (aweme4 != null && (statistics = aweme4.getStatistics()) != null) {
                                    lValueOf = Long.valueOf(statistics.getCommentCount());
                                }
                                c2344009Gk.LJ(lValueOf, "visible_comment_cnt");
                                c2344009Gk.LJIIIIZZ("event_id", "");
                                c2344009Gk.LIZJ(i11, "is_internal_image_comment");
                                c2344009Gk.LJIIIIZZ("channel", C1342490l2V.LIZ(enumC1342450l2R3));
                                c2344009Gk.LJIIIIZZ("comment_channel", C1342490l2V.LIZ(enumC1342450l2R3));
                                c2344009Gk.LJIIIIZZ("message_type", C1350750lFp.LIZ(comment4));
                                if (comment4 != null && (imageList = comment4.getImageList()) != null && !imageList.isEmpty()) {
                                    c2344009Gk.LJFF("photo_type", C1350920lG6.LJIILIIL(comment4));
                                    if (comment4 != null && (imageList2 = comment4.getImageList()) != null && (commentImageStruct = (CommentImageStruct) C13LP.LJJJLL(imageList2)) != null && commentImageStruct.getLivePhotoInfoModel() != null) {
                                        str5 = "live_once";
                                    } else {
                                        str5 = "static";
                                    }
                                    c2344009Gk.LJFF("sub_photo_type", str5);
                                }
                                if (C123100dR.LIZ(rootCommentId)) {
                                    c2344009Gk.LJFF("parent_comment_id", rootCommentId);
                                }
                                c2344009Gk.LJII(C1ER1.LIZIZ.LJJJJL());
                                if (comment4 != null && C295340Bhs.LIZ()) {
                                    C161N c161n = C161N.LIZIZ;
                                    boolean zLJIILLIIL = c161n.LJIILLIIL(comment4, EnumC715680S5m.NOT_OVERWRITTEN);
                                    if (C161T.LIZ().LJ(comment4.getAwemeId()) && zLJIILLIIL) {
                                        i8 = 1;
                                    } else {
                                        i8 = 0;
                                    }
                                    boolean zLJZL = c161n.LJZL(comment4.getCommentLanguage());
                                    boolean zLJIILIIL = c161n.LJIILIIL(comment4);
                                    if (zLJIILIIL && !zLJZL && C0BJB.LIZ()) {
                                        i12 = 1;
                                    }
                                    boolean zLJJIIZ = C746760TRa.LIZ().LJJIIZ(comment4.getAwemeId(), comment4.getCid());
                                    boolean zLJJIJIIJIL = C746760TRa.LIZ().LJJIJIIJIL(comment4.getAwemeId(), comment4.getCid());
                                    c2344009Gk.LJFF("llm_variant", c161n.LJJLIIIJ().LIZJ(comment4));
                                    c2344009Gk.LJFF("comment_source_language", comment4.getCommentLanguage());
                                    c2344009Gk.LJFF("target_language", c161n.LLIIZ());
                                    c2344009Gk.LIZJ(i12, "is_translation_icon_shown");
                                    c2344009Gk.LIZJ(i8, "is_auto_translated");
                                    c2344009Gk.LIZJ(zLJIILIIL ? 1 : 0, "is_comment_translatable");
                                    c2344009Gk.LIZJ(zLJIILLIIL ? 1 : 0, "is_comment_translated");
                                    c2344009Gk.LIZJ(zLJJIJIIJIL ? 1 : 0, "is_ever_real_translated");
                                    c2344009Gk.LIZJ(zLJJIIZ ? 1 : 0, "is_ever_start_translation");
                                }
                                C1350920lG6.LIZIZ(c2344009Gk, comment4);
                                if (baseSharePackage2 != null && (bundle = baseSharePackage2.extras) != null && bundle.containsKey("cmt_poll_id")) {
                                    c2344009Gk.LIZLLL(bundle.getLong("cmt_poll_id"), "cmt_poll_id");
                                    c2344009Gk.LIZJ(bundle.getInt("is_cmt_poll_card_show"), "is_cmt_poll_card_show");
                                    c2344009Gk.LJFF("cmt_poll_card_show_option", bundle.getString("cmt_poll_card_show_option"));
                                }
                                C1350920lG6.LJJJ(c2344009Gk, "share_comment");
                            }
                        }
                    };
                    c1369580lkC.LLJJIII = c1371590lnR;
                    C1366480lfC.LIZIZ(c1371590lnR, c1369580lkC, "first_panel", c1361400lX0LIZ, new InterfaceC1362720lZ8() { // from class: X.0lLv
                        @Override // X.InterfaceC1362720lZ8
                        public final void Ds(Function0<Unit> function0) {
                        }

                        @Override // X.InterfaceC1362720lZ8
                        public final void s1(int i8) {
                        }

                        @Override // X.InterfaceC1362720lZ8
                        public final void F8(AbstractC343940De4 abstractC343940De4) {
                            String str3 = CommentLongPressFragment._pnsPageId;
                            C2393909Zp.LIZ(viewGroup.getContext());
                        }
                    });
                }
                View viewFindViewById = viewTd.findViewById(R.id.fuy);
                if (viewFindViewById != null) {
                    C786410Ut5.I7(new ACListenerS155S0100000_21(awS565S0100000_213, 188), viewFindViewById);
                }
                c1354980lMe = new C1354980lMe(viewTd);
            }
        } else {
            int i8 = C1354740lMG.LLILLJJLI;
            Aweme aweme3 = this.LLILLL;
            Comment comment3 = this.LLILLJJLI;
            String str3 = this.LLILZ;
            C1371590lnR c1371590lnR2 = this.LLILZLL;
            InterfaceC1362600lYw interfaceC1362600lYw = this.LLIZ;
            InterfaceC1354710lMD interfaceC1354710lMD = this.LLIZLLLIL;
            C1356360lOs c1356360lOs = new C1356360lOs(viewGroup.getContext());
            c1356360lOs.setEnterFrom(str3);
            c1356360lOs.setAwmeme(aweme3);
            c1356360lOs.setComment(comment3);
            c1356360lOs.setCallBack(interfaceC1362600lYw);
            c1356360lOs.setCommentShareCallback(interfaceC1354710lMD);
            c1356360lOs.setId(R.id.ebt);
            if (c1371590lnR2 != null && (baseSharePackage = c1371590lnR2.LJIJJ) != null) {
                c1356360lOs.setSharePackage((SharePackage) baseSharePackage);
            }
            C1354740lMG c1354740lMG = new C1354740lMG(c1356360lOs);
            C1354990lMf.LIZ.getClass();
            if (C1354990lMf.LIZ() != null) {
                c1354740lMG.LL = c1356360lOs;
            }
            c1354980lMe = c1354740lMG;
            if (C1354990lMf.LIZ() != null) {
                this.LLJILJIL = c1354740lMG;
                c1354980lMe = c1354740lMG;
            }
        }
        try {
            View view2 = c1354980lMe.itemView;
            if (view2 != null) {
                view2.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1354980lMe.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1354980lMe.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    try {
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c1354980lMe.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1354980lMe.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1354980lMe.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            C2081408Dk.LIZ(e3);
            C2344809Gs.LIZ(e3);
        }
        C20612085q.LIZ = c1354980lMe.getClass().getName();
        return c1354980lMe;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        Boolean bool;
        int i2;
        float f;
        if (list.isEmpty()) {
            super.onBindViewHolder(viewHolder, i, list);
            return;
        }
        Object objLJJJLL = C13LP.LJJJLL(list);
        if (!(objLJJJLL instanceof Boolean) || (bool = (Boolean) objLJJJLL) == null) {
            return;
        }
        boolean zBooleanValue = bool.booleanValue();
        float f2 = 0.3f;
        float f3 = 1.0f;
        float f4 = 0.2f;
        if (viewHolder instanceof C1354980lMe) {
            C1354980lMe c1354980lMe = (C1354980lMe) viewHolder;
            boolean z = !zBooleanValue;
            View viewFindViewById = c1354980lMe.itemView.findViewById(R.id.fuy);
            if (z) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            C786410Ut5.LJLLLLLL(i2, viewFindViewById);
            if (z) {
                f = 1.0f;
            } else {
                f = 0.2f;
            }
            C786410Ut5.T4(c1354980lMe.itemView, f);
            if (z) {
                f2 = 1.0f;
            } else {
                f3 = 0.2f;
            }
            TuxIconView tuxIconView = (TuxIconView) c1354980lMe.I5().findViewById(R.id.uyx);
            if (tuxIconView != null) {
                C786410Ut5.x5(tuxIconView, f2);
            }
            TuxTextView tuxTextView = (TuxTextView) c1354980lMe.I5().findViewById(R.id.uzf);
            if (tuxTextView != null) {
                C786410Ut5.B5(tuxTextView, f2);
            }
            RadiusLayout radiusLayout = (RadiusLayout) c1354980lMe.I5().findViewById(R.id.do_);
            if (radiusLayout != null) {
                C786410Ut5.G5(radiusLayout, f3);
            }
            RadiusLayout radiusLayout2 = (RadiusLayout) c1354980lMe.I5().findViewById(R.id.doa);
            if (radiusLayout2 != null) {
                C786410Ut5.G5(radiusLayout2, f3);
            }
            RadiusLayout radiusLayout3 = (RadiusLayout) c1354980lMe.I5().findViewById(R.id.dob);
            if (radiusLayout3 != null) {
                C786410Ut5.G5(radiusLayout3, f3);
            }
            TuxIconView tuxIconView2 = (TuxIconView) c1354980lMe.I5().findViewById(R.id.e5y);
            if (tuxIconView2 == null) {
                return;
            }
            C786410Ut5.x5(tuxIconView2, f2);
            return;
        }
        if (viewHolder instanceof C1354970lMd) {
            C1354970lMd c1354970lMd = (C1354970lMd) viewHolder;
            boolean z2 = !zBooleanValue;
            c1354970lMd.LLJILJIL = z2;
            if (z2) {
                f4 = 1.0f;
            }
            C786410Ut5.T4(c1354970lMd.itemView, f4);
            if (z2) {
                f2 = 1.0f;
            }
            C786410Ut5.x5(c1354970lMd.I5(), f2);
            C786410Ut5.B5((TuxTextView) c1354970lMd.LLJ.getValue(), f2);
            return;
        }
        if (!(viewHolder instanceof C1355000lMg)) {
            return;
        }
        ((C1355000lMg) viewHolder).LL = !zBooleanValue;
    }
}
