package X;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.api.CommunityContent;
import com.bytedance.android.livesdk.chatroom.api.CommunityDetail;
import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import com.bytedance.android.livesdk.comp.api.subscription.setting.LiveSubOnlySpacePreviewSetting;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.viewmodel.PrivilegeDetailViewModel;
import com.bytedance.android.widget.NextLiveData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.GetSubPrivilegeDetailResponse;
import webcast.api.sub.PrivilegeTag;

/* JADX INFO: renamed from: X.0JwU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C508240JwU extends AbstractC508030Jw9<C508290JwZ> {
    public final int LLILLJJLI;
    public final String LLILLL;
    public final C16F5 LLILZ;
    public final C16F5 LLILZIL;
    public final C16F5 LLILZLL;
    public final C16F5 LLIZ;
    public final LiveIconView LLIZLLLIL;
    public final C1099610eil LLJ;
    public final ViewGroup LLJI;
    public final RecyclerView LLJIJIL;
    public final ViewGroup LLJILJIL;

    public C508240JwU(View view) {
        super(view);
        this.LLILLJJLI = 2;
        this.LLILLL = "&";
        this.LLILZ = (C16F5) view.findViewById(R.id.tv_title);
        this.LLILZIL = (C16F5) view.findViewById(R.id.tv_subscribers);
        this.LLILZLL = (C16F5) view.findViewById(R.id.z7y);
        this.LLIZ = (C16F5) view.findViewById(R.id.cq7);
        this.LLIZLLLIL = (LiveIconView) view.findViewById(R.id.cto);
        this.LLJ = (C1099610eil) view.findViewById(R.id.f7v);
        this.LLJI = (ViewGroup) view.findViewById(R.id.rsf);
        this.LLJIJIL = (RecyclerView) view.findViewById(R.id.f82);
        this.LLJILJIL = (ViewGroup) view.findViewById(R.id.kmd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v96, types: [T, java.lang.String] */
    @Override // X.C0K07
    public final void I5(InterfaceC515600KJy interfaceC515600KJy) {
        int i;
        ViewTreeObserver viewTreeObserver;
        PrivilegeDetailViewModel privilegeDetailViewModelFS;
        NextLiveData<Boolean> nextLiveData;
        SubInfo subInfo;
        int i2;
        List<PrivilegeTag> list;
        C16F5 c16f5;
        int i3;
        ImageModel avatarMedium;
        User user;
        CommunityDetail communityDetail;
        List<CommunityContent> list2;
        C508290JwZ c508290JwZ = (C508290JwZ) interfaceC515600KJy;
        R5(c508290JwZ);
        final SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = c508290JwZ.LLILZIL;
        if (subscriptionPrivilegeDetailFragment != null) {
            GetSubPrivilegeDetailResponse.Data data = c508290JwZ.LLILZ;
            if (Intrinsics.LJFF(subscriptionPrivilegeDetailFragment.LLJIJIL, EnumC504050Jpj.SUB_ONLY_VIDEO.getSource())) {
                LiveIconView liveIconView = this.LLIZLLLIL;
                if (liveIconView != null) {
                    C500260Jjc.LJIILIIL(liveIconView);
                }
            } else {
                LiveIconView liveIconView2 = this.LLIZLLLIL;
                if (liveIconView2 != null) {
                    C500260Jjc.LLFFF(liveIconView2);
                }
            }
            LiveIconView liveIconView3 = this.LLIZLLLIL;
            if (liveIconView3 != null) {
                C786410Ut5.g8(liveIconView3, new View.OnClickListener() { // from class: X.0JwT
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C0JS0.LIZIZ(subscriptionPrivilegeDetailFragment);
                    }
                });
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscribe_faq_entrance_show");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII("privilege_page", "show_entrance");
            c474500IjALIZ.LIZ();
            final C259800zU c259800zU = new C259800zU();
            c259800zU.element = "";
            if (data != null && (communityDetail = data.communityDetail) != null && (list2 = communityDetail.communityContentList) != null) {
                for (CommunityContent communityContent : list2) {
                    if (communityContent.communityContentType == 1) {
                        c259800zU.element = communityContent.communityContentText;
                    }
                }
            }
            C508400Jwk c508400Jwk = subscriptionPrivilegeDetailFragment.LLJJIII;
            if (c508400Jwk != null && c508400Jwk.LIZ() && Intrinsics.LJFF(subscriptionPrivilegeDetailFragment.LL, Boolean.TRUE)) {
                ViewGroup viewGroup = this.LLJI;
                if (viewGroup != null) {
                    C500260Jjc.LLFFF(viewGroup);
                }
                ViewGroup viewGroup2 = this.LLJI;
                if (viewGroup2 != null) {
                    viewGroup2.setBackground(C507390Jv7.LIZ((int) C497740JfY.LIZIZ(8.0f), C20736316Cj.LIZIZ(R.attr.ezl, this.itemView.getContext()), 0, (int) C497740JfY.LIZIZ(0.0f)));
                }
            }
            LiveSubOnlySpacePreviewSetting liveSubOnlySpacePreviewSetting = LiveSubOnlySpacePreviewSetting.INSTANCE;
            User user2 = null;
            if (liveSubOnlySpacePreviewSetting.enable() && subscriptionPrivilegeDetailFragment.aS() == null) {
                C1099610eil c1099610eil = this.LLJ;
                if (c1099610eil != null) {
                    C500260Jjc.LLFFF(c1099610eil);
                }
                C0JBN c0jbnLIZ = C1819620xS4.LIZ();
                if (data != null && (user = data.anchorDetail) != null) {
                    avatarMedium = user.getAvatarMedium();
                } else {
                    avatarMedium = null;
                }
                C1324610kZf c1324610kZfLJIIIZ = c0jbnLIZ.LJIIIZ(avatarMedium);
                c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
                c1324610kZfLJIIIZ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
                c1324610kZfLJIIIZ.LJJI(this.LLJ);
            }
            C16F5 c16f52 = this.LLILZ;
            if (c16f52 != null) {
                String str = c508290JwZ.LLJ;
                if (str != null && str.length() != 0) {
                    i3 = 2131844480;
                } else {
                    i3 = 2131839357;
                }
                Object[] objArr = new Object[1];
                if (data != null) {
                    user2 = data.anchorDetail;
                }
                objArr[0] = C0KVU.LIZ(user2);
                c16f52.setText(C497740JfY.LJIJJ(i3, objArr));
            }
            C16F5 c16f53 = this.LLILZ;
            if (c16f53 != null && c16f53.getLineCount() > 2 && (c16f5 = this.LLILZ) != null) {
                c16f5.setTextSize(1, 20.0f);
            }
            if (data != null) {
                i = data.subscriberCount;
            } else {
                i = 0;
            }
            if (i < 5) {
                C786410Ut5.LLJJJJ(this.LLILZIL, 8);
            } else {
                C786410Ut5.LLJJJJ(this.LLILZIL, 0);
                this.LLILZIL.setText(C497740JfY.LJIJJ(2131844481, Integer.valueOf(i)));
            }
            Context context = this.itemView.getContext();
            if (context != null) {
                GetSubPrivilegeDetailResponse.Data data2 = c508290JwZ.LLILZ;
                if ((liveSubOnlySpacePreviewSetting.getValue() > 0 && data2 != null && (list = data2.tagList) != null && list.size() > 0) || liveSubOnlySpacePreviewSetting.getValue() != 0) {
                    if (liveSubOnlySpacePreviewSetting.getValue() == 0) {
                        i2 = 1;
                    } else {
                        i2 = 4;
                    }
                    C497960Jfu c497960Jfu = new C497960Jfu(c508290JwZ.LLILZIL, i2);
                    this.LLJIJIL.setAdapter(c497960Jfu);
                    C500260Jjc.LLFFF(this.LLJIJIL);
                    this.LLJIJIL.setLayoutManager(new LinearLayoutManager(context, 0, false));
                    c497960Jfu.LLLI(c508290JwZ.LLILZ.tagList);
                }
            }
            if (((CharSequence) c259800zU.element).length() == 0) {
                C16F5 c16f54 = this.LLILZLL;
                if (c16f54 != null) {
                    C786410Ut5.LLJJJJ(c16f54, 8);
                }
                C786410Ut5.LLJJJJ(this.LLIZ, 8);
            } else {
                C16F5 c16f55 = this.LLILZLL;
                if (c16f55 != null) {
                    C786410Ut5.LLJJJJ(c16f55, 0);
                }
                C16F5 c16f56 = this.LLILZLL;
                if (c16f56 != null) {
                    c16f56.setMaxLines(this.LLILLJJLI);
                }
                C786410Ut5.LLJJJJ(this.LLIZ, 8);
                C16F5 c16f57 = this.LLILZLL;
                if (c16f57 != null) {
                    c16f57.setText((CharSequence) c259800zU.element);
                }
                C786410Ut5.l8(this.LLIZ, new View.OnClickListener() { // from class: X.0JwX
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C16F5 c16f58 = this.LL.LLILZLL;
                        if (c16f58 != null) {
                            c16f58.setMaxLines(Integer.MAX_VALUE);
                        }
                        C16F5 c16f59 = this.LL.LLILZLL;
                        if (c16f59 != null) {
                            c16f59.setText(c259800zU.element);
                        }
                        C786410Ut5.LLJJJJ(this.LL.LLIZ, 8);
                    }
                });
                S5(this.LLILZLL, (String) c259800zU.element);
                C16F5 c16f58 = this.LLILZLL;
                if (c16f58 != null && (viewTreeObserver = c16f58.getViewTreeObserver()) != null) {
                    ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0JwW
                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public final void onGlobalLayout() {
                            ViewTreeObserver viewTreeObserver2;
                            C16F5 c16f59 = this.LL.LLILZLL;
                            C508240JwU c508240JwU = this.LL;
                            C259800zU<String> c259800zU2 = c259800zU;
                            if (c508240JwU.LLIZ.getWidth() > 0 && (viewTreeObserver2 = c16f59.getViewTreeObserver()) != null) {
                                viewTreeObserver2.removeOnGlobalLayoutListener(this);
                                C2187701Ajg.LIZIZ(viewTreeObserver2, this, ViewTreeObserver.OnGlobalLayoutListener.class);
                            }
                            c508240JwU.S5(c16f59, c259800zU2.element);
                        }
                    };
                    viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                    C2187701Ajg.LIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
                }
            }
            if (subscriptionPrivilegeDetailFragment.LLILLL == EnumC507490JvH.FULL_PAGE) {
                LiveIconView liveIconView4 = this.LLIZLLLIL;
                if (liveIconView4 != null) {
                    C500260Jjc.LJIILIIL(liveIconView4);
                }
                if (((data != null && (subInfo = data.subInfo) != null && Intrinsics.LJFF(subInfo.isSubscribing, Boolean.TRUE)) || ((privilegeDetailViewModelFS = subscriptionPrivilegeDetailFragment.FS()) != null && (nextLiveData = privilegeDetailViewModelFS.LLJJIJI) != null && Intrinsics.LJFF(nextLiveData.getValue(), Boolean.TRUE))) && !Intrinsics.LJFF(subscriptionPrivilegeDetailFragment.LL, Boolean.TRUE)) {
                    C16F5 c16f59 = this.LLILZ;
                    if (c16f59 != null) {
                        c16f59.setText(C497740JfY.LJIJI(2131844201));
                    }
                    C16F5 c16f510 = this.LLILZLL;
                    if (c16f510 != null) {
                        c16f510.setText(C497740JfY.LJIJI(2131844191));
                    }
                    C16F5 c16f511 = this.LLILZIL;
                    if (c16f511 != null) {
                        C500260Jjc.LJIILIIL(c16f511);
                    }
                }
            } else {
                View view = this.itemView;
                if (view != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.topMargin = (int) C497740JfY.LIZIZ(16.0f);
                        C786410Ut5.W5(view, marginLayoutParams);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                }
            }
            ViewGroup viewGroup3 = this.LLJILJIL;
            if (viewGroup3 != null) {
                HandlerHook.viewPost(viewGroup3, new Runnable() { // from class: X.0JwV
                    public final void LIZ() {
                        C19ME c19me;
                        int height = this.LL.LLJILJIL.getHeight();
                        C1099610eil c1099610eil2 = this.LL.LLJ;
                        if (height > (c1099610eil2 != null ? c1099610eil2.getHeight() : 0)) {
                            ViewGroup.LayoutParams layoutParams2 = this.LL.LLJILJIL.getLayoutParams();
                            if (!(layoutParams2 instanceof C19ME) || (c19me = (C19ME) layoutParams2) == null) {
                                return;
                            }
                            c19me.bottomToBottom = -1;
                            C786410Ut5.X5(c19me, this.LL.LLJILJIL);
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("PrivilegeTitleItemViewHolder@ee9c.adjustInfoContent$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("PrivilegeTitleItemViewHolder@ee9c.adjustInfoContent$1");
                    }
                });
            }
        }
    }

    @Override // X.AbstractC508030Jw9
    public final Map P5(C507580JvQ c507580JvQ) {
        if (LiveSubOnlySpacePreviewSetting.INSTANCE.getValue() > 0) {
            List<PrivilegeTag> list = c507580JvQ.LLILZ.tagList;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<PrivilegeTag> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(it2.next().category));
            }
            return C2097908Jt.LIZJ(new Pair("creator_label", arrayList.toString()));
        }
        return C2097608Jq.LJ();
    }

    public final void S5(C16F5 c16f5, String str) {
        Layout layout;
        int ellipsisCount;
        String string;
        int i;
        if (c16f5 != null && (layout = c16f5.getLayout()) != null && (ellipsisCount = layout.getEllipsisCount(layout.getLineCount() - 1)) > 0) {
            int length = str.length() - ellipsisCount;
            int i2 = 0;
            do {
                int i3 = length - i2;
                if (i3 < 0) {
                    string = str.subSequence(0, length).toString();
                    break;
                }
                CharSequence charSequenceSubSequence = str.subSequence(0, i3);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((Object) charSequenceSubSequence);
                sbLIZ.append(this.LLILLL);
                CharSequence text = this.LLIZ.getText();
                CharSequence charSequence = "";
                if (text == null) {
                    text = "";
                }
                sbLIZ.append((Object) text);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                SpannableString spannableString = new SpannableString(strLIZIZ);
                int length2 = strLIZIZ.length();
                CharSequence text2 = this.LLIZ.getText();
                if (text2 != null) {
                    charSequence = text2;
                }
                C1119920fFW.LJIIIIZZ(spannableString, length2 - charSequence.length(), strLIZIZ.length(), 33, 500);
                if (new StaticLayout(strLIZIZ, c16f5.getPaint(), (c16f5.getWidth() - c16f5.getPaddingLeft()) - c16f5.getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, c16f5.getLineSpacingMultiplier(), c16f5.getLineSpacingExtra(), c16f5.getIncludeFontPadding()).getLineCount() <= 2) {
                    break;
                } else {
                    i2++;
                }
            } while (i2 < 30);
            int i4 = i2 + 1;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("toBeRemovedCount:");
            sbLIZ2.append(i4);
            C20441214yg.LIZIZ("SubscriptionPrivilegeDetailFragment", C2188811AlT.LIZIZ(sbLIZ2));
            int i5 = length - i4;
            if (i5 < 0) {
                string = str.subSequence(0, length).toString();
            } else {
                CharSequence charSequenceSubSequence2 = str.subSequence(0, i5);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append((Object) charSequenceSubSequence2);
                sbLIZ3.append(this.LLILLL);
                string = C2188811AlT.LIZIZ(sbLIZ3);
            }
            c16f5.setText(string);
            ConstraintLayout constraintLayout = (ConstraintLayout) this.itemView;
            C16F5 c16f52 = this.LLIZ;
            if (c16f52 != null) {
                C786410Ut5.LLJJJJ(c16f52, 0);
                if (C497740JfY.LJJ()) {
                    i = -1;
                } else {
                    i = -2;
                }
                boolean zBaseIsLeftToRight = new Bidi(string, i).baseIsLeftToRight();
                C19MB c19mb = new C19MB();
                c19mb.LJII(constraintLayout);
                c19mb.LJI(c16f52.getId(), 1);
                c19mb.LJI(c16f52.getId(), 2);
                c19mb.LJI(c16f52.getId(), 6);
                c19mb.LJI(c16f52.getId(), 7);
                if (zBaseIsLeftToRight) {
                    c19mb.LJIIIIZZ(c16f52.getId(), 2, c16f5.getId(), 2);
                } else {
                    c19mb.LJIIIIZZ(c16f52.getId(), 1, c16f5.getId(), 1);
                }
                c19mb.LIZIZ(constraintLayout);
            }
        }
    }
}
