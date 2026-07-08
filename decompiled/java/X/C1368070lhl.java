package X;

import Y.ACListenerS124S0200000_21;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.utils.IAccessibilityUtils;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lhl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1368070lhl extends C1368080lhm {
    public C422820Gi0 LLJIJIL;
    public TextView LLJILJIL;
    public TextView LLJILJILJ;
    public TextView LLJILLL;
    public TextView LLJJ;
    public ImageView LLJJI;
    public TuxIconView LLJJIII;
    public View LLJJIJI;
    public LinearLayout LLJJIJIIJIL;
    public final /* synthetic */ C745320TLm LLJJIJIL;

    @Override // X.C1368080lhm
    public final void L5() {
        super.L5();
        this.LLJJIJI = this.itemView.findViewById(R.id.moq);
        this.LLJJIJIIJIL = (LinearLayout) this.itemView.findViewById(R.id.y1z);
        this.LLJILJILJ = (TextView) this.itemView.findViewById(R.id.y3j);
        this.LLJJI = (ImageView) this.itemView.findViewById(R.id.kku);
        this.LLJJ = (TextView) this.itemView.findViewById(R.id.kky);
        this.LLILZLL = (C0HZQ) this.itemView.findViewById(R.id.dqk);
        this.LLJIJIL = (C422820Gi0) this.itemView.findViewById(R.id.biz);
        this.itemView.findViewById(R.id.verify_iv);
        this.LLJILJIL = (TextView) this.itemView.findViewById(R.id.p0w);
        this.LLJILLL = (TextView) this.itemView.findViewById(R.id.fs0);
        this.LLJJIII = (TuxIconView) this.itemView.findViewById(R.id.ieu);
    }

    @Override // X.C1368080lhm, X.C1368110lhp
    public final void init() {
        super.init();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, this.itemView.getContext());
        if (numLIZJ != null) {
            this.itemView.setBackgroundColor(numLIZJ.intValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1368070lhl(C745320TLm c745320TLm, View view) {
        super(c745320TLm, view);
        this.LLJJIJIL = c745320TLm;
    }

    @Override // X.C1368080lhm
    public final void I5(int i, IMContact iMContact) {
        String quantityString;
        Context context;
        Resources resources;
        int i2;
        int i3;
        if (iMContact.getType() == -1) {
            return;
        }
        C0HZQ c0hzq = this.LLILZLL;
        int i4 = 0;
        if (c0hzq != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c0hzq.getLayoutParams();
            C745320TLm c745320TLm = this.LLJJIJIL;
            if (c745320TLm.LLILZ) {
                C0HZQ c0hzq2 = this.LLILZLL;
                if (c0hzq2 != null) {
                    c0hzq2.setChecked(c745320TLm.LLILZLL.contains(iMContact));
                }
                int marginStart = marginLayoutParams.getMarginStart();
                int i5 = this.LLIZLLLIL;
                if (marginStart != i5) {
                    marginLayoutParams.setMarginStart(i5);
                    marginLayoutParams.setMargins(this.LLIZLLLIL, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                    C0HZQ c0hzq3 = this.LLILZLL;
                    if (c0hzq3 != null) {
                        C786410Ut5.N6(c0hzq3, marginLayoutParams);
                    }
                }
            } else {
                C0HZQ c0hzq4 = this.LLILZLL;
                if (c0hzq4 != null) {
                    c0hzq4.setSelected(false);
                }
                int marginStart2 = marginLayoutParams.getMarginStart();
                int i6 = this.LLJ;
                if (marginStart2 != i6) {
                    marginLayoutParams.setMarginStart(i6);
                    marginLayoutParams.setMargins(this.LLJ, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                    C0HZQ c0hzq5 = this.LLILZLL;
                    if (c0hzq5 != null) {
                        C786410Ut5.N6(c0hzq5, marginLayoutParams);
                    }
                }
            }
        }
        UrlModel displayAvatar = iMContact.getDisplayAvatar();
        if (displayAvatar != null && displayAvatar.getUrlList() != null && displayAvatar.getUrlList().size() != 0) {
            C0I98.LJFF(this.LLJIJIL, displayAvatar, "RelationIndexSelectListAdapter", null, null, 0, 0, true, null, false);
        } else {
            C1324840ka2.LIZ(this.LLJIJIL, 2130971789);
        }
        ImageView imageView = this.LLJJI;
        if (imageView != null) {
            C786410Ut5.LJZI(8, imageView);
        }
        if (iMContact.getType() != 1 && iMContact.getType() != 2) {
            if (iMContact.getType() != 6 && iMContact.getType() != 5) {
                if (iMContact.getType() == 0 || iMContact.getType() == 3) {
                    if (iMContact.getType() == 3 && TextUtils.isEmpty(this.LLJJIJIL.LLILZIL)) {
                        LinearLayout linearLayout = this.LLJJIJIIJIL;
                        if (linearLayout != null) {
                            C786410Ut5.LJZL(0, linearLayout);
                        }
                        TextView textView = this.LLJILJILJ;
                        if (textView != null) {
                            textView.setText(2131835746);
                        }
                        View view = this.LLJJIJI;
                        if (view != null) {
                            if (i == 0) {
                                i3 = 8;
                            } else {
                                i3 = 0;
                            }
                            C786410Ut5.LJLLLLLL(i3, view);
                        }
                    } else {
                        LinearLayout linearLayout2 = this.LLJJIJIIJIL;
                        if (linearLayout2 != null) {
                            C786410Ut5.LJZL(8, linearLayout2);
                        }
                        View view2 = this.LLJJIJI;
                        if (view2 != null) {
                            C786410Ut5.LJLLLLLL(8, view2);
                        }
                    }
                    C745320TLm c745320TLm2 = this.LLJJIJIL;
                    if (c745320TLm2.LL != 1) {
                        C1367750lhF c1367750lhFLLLJIL = c745320TLm2.LLLJIL(i);
                        if (!TextUtils.isEmpty(c1367750lhFLLLJIL.LIZIZ)) {
                            TextView textView2 = this.LLJJ;
                            if (textView2 != null) {
                                C786410Ut5.LLIL(textView2, 0);
                            }
                            TextView textView3 = this.LLJJ;
                            if (textView3 != null) {
                                textView3.setText(c1367750lhFLLLJIL.LIZIZ);
                            }
                        } else {
                            TextView textView4 = this.LLJJ;
                            if (textView4 != null) {
                                C786410Ut5.LLIL(textView4, 8);
                            }
                        }
                    } else {
                        TextView textView5 = this.LLJJ;
                        if (textView5 != null) {
                            C786410Ut5.LLIL(textView5, 8);
                        }
                    }
                }
            } else {
                if (iMContact.getType() == 5 && TextUtils.isEmpty(this.LLJJIJIL.LLILZIL)) {
                    LinearLayout linearLayout3 = this.LLJJIJIIJIL;
                    if (linearLayout3 != null) {
                        C786410Ut5.LJZL(0, linearLayout3);
                    }
                    TextView textView6 = this.LLJILJILJ;
                    if (textView6 != null) {
                        textView6.setText(R.string.kfh);
                    }
                    View view3 = this.LLJJIJI;
                    if (view3 != null) {
                        if (i == 0) {
                            i2 = 8;
                        } else {
                            i2 = 0;
                        }
                        C786410Ut5.LJLLLLLL(i2, view3);
                    }
                } else {
                    LinearLayout linearLayout4 = this.LLJJIJIIJIL;
                    if (linearLayout4 != null) {
                        C786410Ut5.LJZL(8, linearLayout4);
                    }
                    View view4 = this.LLJJIJI;
                    if (view4 != null) {
                        C786410Ut5.LJLLLLLL(8, view4);
                    }
                }
                String str = LLLJIL(i).LIZIZ;
                if (this.LLJJIJIL.LLILLJJLI && !TextUtils.isEmpty(str)) {
                    TextView textView7 = this.LLJJ;
                    if (textView7 != null) {
                        C786410Ut5.LLIL(textView7, 0);
                    }
                    TextView textView8 = this.LLJJ;
                    if (textView8 != null) {
                        textView8.setText(str);
                    }
                } else {
                    TextView textView9 = this.LLJJ;
                    if (textView9 != null) {
                        C786410Ut5.LLIL(textView9, 8);
                    }
                }
            }
        } else {
            if (iMContact.getType() == 2 && TextUtils.isEmpty(this.LLJJIJIL.LLILZIL)) {
                TextView textView10 = this.LLJILJILJ;
                if (textView10 != null) {
                    textView10.setText(R.string.kg7);
                }
                LinearLayout linearLayout5 = this.LLJJIJIIJIL;
                if (linearLayout5 != null) {
                    C786410Ut5.LJZL(0, linearLayout5);
                }
            } else {
                LinearLayout linearLayout6 = this.LLJJIJIIJIL;
                if (linearLayout6 != null) {
                    C786410Ut5.LJZL(8, linearLayout6);
                }
            }
            View view5 = this.LLJJIJI;
            if (view5 != null) {
                C786410Ut5.LJLLLLLL(8, view5);
            }
            TextView textView11 = this.LLJJ;
            if (textView11 != null) {
                C786410Ut5.LLIL(textView11, 8);
            }
        }
        if (i == 0) {
            TextView textView12 = this.LLJILJILJ;
            if (textView12 != null) {
                textView12.setText("");
            }
            ImageView imageView2 = this.LLJJI;
            if (imageView2 != null) {
                C786410Ut5.LJZI(8, imageView2);
            }
        }
        if (iMContact instanceof IMUser) {
            IMUser iMUser = (IMUser) iMContact;
            C1908030zkf.LJI(this.itemView.getContext(), iMUser.getCustomVerify(), iMUser.getEnterpriseVerifyReason(), this.LLJILJIL);
            IAccessibilityUtils.LIZ.getClass();
            IAccessibilityUtils iAccessibilityUtilsLIZ = C0I31.LIZ();
            if (iAccessibilityUtilsLIZ != null) {
                iAccessibilityUtilsLIZ.LIZ(this.LLJIJIL, iMUser);
            }
            AbstractC1368060lhk.LLLILZLLLI(this.LLJILJIL, iMUser, this.LLJJIJIL.LLILZIL);
            AbstractC1368060lhk.LLLILZ(this.LLJILLL, iMUser, this.LLJJIJIL.LLILZIL);
            TuxIconView tuxIconView = this.LLJJIII;
            if (tuxIconView != null) {
                if (iMUser.getFollowStatus() != 2) {
                    i4 = 8;
                }
                C786410Ut5.LLLLLLZZ(tuxIconView, i4);
            }
        } else if (iMContact instanceof IMConversation) {
            IMConversation iMConversation = (IMConversation) iMContact;
            C1908030zkf.LJI(this.itemView.getContext(), "", "", this.LLJILJIL);
            int conversationMemberCount = iMConversation.getConversationMemberCount();
            TextView textView13 = this.LLJILLL;
            if (textView13 != null && (context = textView13.getContext()) != null && (resources = context.getResources()) != null) {
                quantityString = resources.getQuantityString(2131755366, conversationMemberCount, Integer.valueOf(conversationMemberCount));
            } else {
                quantityString = null;
            }
            TextView textView14 = this.LLJILLL;
            if (textView14 != null) {
                textView14.setText(quantityString);
            }
            TuxIconView tuxIconView2 = this.LLJJIII;
            if (tuxIconView2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
            }
            if (TextUtils.isEmpty(this.LLJJIJIL.LLILZIL)) {
                TextView textView15 = this.LLJILJIL;
                if (textView15 != null) {
                    textView15.setText(iMConversation.getDisplayName());
                }
            } else {
                C745320TLm c745320TLm3 = this.LLJJIJIL;
                TextView textView16 = this.LLJILJIL;
                String displayName = iMConversation.getDisplayName();
                String str2 = this.LLJJIJIL.LLILZIL;
                c745320TLm3.getClass();
                AbstractC1368060lhk.LLLI(textView16, displayName, str2, 0);
            }
        }
        C745320TLm c745320TLm4 = this.LLJJIJIL;
        if (c745320TLm4.LLJI != null) {
            C786410Ut5.I7(new ACListenerS124S0200000_21(this, c745320TLm4, 29), this.itemView);
            C422820Gi0 c422820Gi0 = this.LLJIJIL;
            if (c422820Gi0 != null) {
                C786410Ut5.B9(c422820Gi0, new ACListenerS124S0200000_21(this, this.LLJJIJIL, 30));
            }
        }
        this.itemView.setTag(50331648, 50331648);
        this.itemView.setTag(83886080, iMContact);
        C422820Gi0 c422820Gi02 = this.LLJIJIL;
        if (c422820Gi02 != null) {
            c422820Gi02.setTag(50331648, 50331649);
        }
        C422820Gi0 c422820Gi03 = this.LLJIJIL;
        if (c422820Gi03 != null) {
            c422820Gi03.setTag(83886080, iMContact);
        }
    }
}
