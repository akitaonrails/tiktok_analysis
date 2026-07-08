package X;

import Y.ACListenerS124S0200000_21;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.utils.IAccessibilityUtils;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lhn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1368090lhn extends C1368080lhm {
    public C422820Gi0 LLJIJIL;
    public TextView LLJILJIL;
    public TextView LLJILJILJ;
    public TextView LLJILLL;
    public TextView LLJJ;
    public TextView LLJJI;
    public ImageView LLJJIII;
    public TuxIconView LLJJIJI;
    public View LLJJIJIIJIL;
    public LinearLayout LLJJIJIL;
    public RemoteImageView LLJJJ;
    public final /* synthetic */ C745340TLo LLJJJIL;

    @Override // X.C1368080lhm
    public final void L5() {
        this.LLJJIJIIJIL = this.itemView.findViewById(R.id.moq);
        this.LLJJIJIL = (LinearLayout) this.itemView.findViewById(R.id.y1z);
        this.LLJILLL = (TextView) this.itemView.findViewById(R.id.y3j);
        this.LLJJIII = (ImageView) this.itemView.findViewById(R.id.kku);
        this.LLJJI = (TextView) this.itemView.findViewById(R.id.kky);
        this.LLJIJIL = (C422820Gi0) this.itemView.findViewById(R.id.biz);
        this.itemView.findViewById(R.id.verify_iv);
        this.LLJILJIL = (TextView) this.itemView.findViewById(R.id.p0w);
        this.LLJILJILJ = (TextView) this.itemView.findViewById(R.id.x2g);
        this.LLJJ = (TextView) this.itemView.findViewById(R.id.fs0);
        this.LLJJJ = (RemoteImageView) this.itemView.findViewById(R.id.dpc);
        this.LLJJIJI = (TuxIconView) this.itemView.findViewById(R.id.ieu);
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
    public C1368090lhn(C745340TLo c745340TLo, View view) {
        super(c745340TLo, view);
        this.LLJJJIL = c745340TLo;
    }

    @Override // X.C1368080lhm
    public final void I5(int i, IMContact iMContact) {
        if (iMContact.getType() == -1) {
            return;
        }
        C745340TLo c745340TLo = this.LLJJJIL;
        if (c745340TLo.LLJI != null) {
            C786410Ut5.I7(new ACListenerS124S0200000_21(this, c745340TLo, 31), this.itemView);
            C422820Gi0 c422820Gi0 = this.LLJIJIL;
            if (c422820Gi0 != null) {
                C786410Ut5.B9(c422820Gi0, new ACListenerS124S0200000_21(this, c745340TLo, 32));
            }
            RemoteImageView remoteImageView = this.LLJJJ;
            if (remoteImageView != null) {
                C786410Ut5.E9(remoteImageView, new ACListenerS124S0200000_21(this, c745340TLo, 33));
            }
        }
        ImageView imageView = this.LLJJIII;
        if (imageView != null) {
            C786410Ut5.LJZI(8, imageView);
        }
        if (iMContact.getType() != 6 && iMContact.getType() != 5) {
            if (iMContact.getType() == 0 || iMContact.getType() == 3) {
                if (iMContact.getType() == 3 && TextUtils.isEmpty(this.LLJJJIL.LLILZIL)) {
                    LinearLayout linearLayout = this.LLJJIJIL;
                    if (linearLayout != null) {
                        C786410Ut5.LJZL(0, linearLayout);
                    }
                    TextView textView = this.LLJILLL;
                    if (textView != null) {
                        textView.setText(2131835746);
                    }
                    ImageView imageView2 = this.LLJJIII;
                    if (imageView2 != null) {
                        C786410Ut5.LJZI(8, imageView2);
                    }
                    View view = this.LLJJIJIIJIL;
                    if (view != null) {
                        C786410Ut5.LJLLLLLL(0, view);
                    }
                } else {
                    LinearLayout linearLayout2 = this.LLJJIJIL;
                    if (linearLayout2 != null) {
                        C786410Ut5.LJZL(8, linearLayout2);
                    }
                    View view2 = this.LLJJIJIIJIL;
                    if (view2 != null) {
                        C786410Ut5.LJLLLLLL(8, view2);
                    }
                }
                C745340TLo c745340TLo2 = this.LLJJJIL;
                if (c745340TLo2.LL != 1) {
                    C1367750lhF c1367750lhFLLLJIL = c745340TLo2.LLLJIL(i);
                    if (c1367750lhFLLLJIL != null) {
                        if (!TextUtils.isEmpty(c1367750lhFLLLJIL.LIZIZ)) {
                            TextView textView2 = this.LLJJI;
                            if (textView2 != null) {
                                textView2.setText(c1367750lhFLLLJIL.LIZIZ);
                            }
                            TextView textView3 = this.LLJJI;
                            if (textView3 != null) {
                                C786410Ut5.LLIL(textView3, 0);
                            }
                        } else {
                            TextView textView4 = this.LLJJI;
                            if (textView4 != null) {
                                C786410Ut5.LLIL(textView4, 8);
                            }
                        }
                    }
                } else {
                    TextView textView5 = this.LLJJI;
                    if (textView5 != null) {
                        C786410Ut5.LLIL(textView5, 8);
                    }
                }
            }
        } else {
            if (iMContact.getType() == 5 && TextUtils.isEmpty(this.LLJJJIL.LLILZIL)) {
                LinearLayout linearLayout3 = this.LLJJIJIL;
                if (linearLayout3 != null) {
                    C786410Ut5.LJZL(0, linearLayout3);
                }
                TextView textView6 = this.LLJILLL;
                if (textView6 != null) {
                    textView6.setText(R.string.kfh);
                }
                ImageView imageView3 = this.LLJJIII;
                if (imageView3 != null) {
                    C786410Ut5.LJZI(0, imageView3);
                }
                View view3 = this.LLJJIJIIJIL;
                if (view3 != null) {
                    C786410Ut5.LJLLLLLL(8, view3);
                }
            } else {
                LinearLayout linearLayout4 = this.LLJJIJIL;
                if (linearLayout4 != null) {
                    C786410Ut5.LJZL(8, linearLayout4);
                }
                View view4 = this.LLJJIJIIJIL;
                if (view4 != null) {
                    C786410Ut5.LJLLLLLL(8, view4);
                }
            }
            TextView textView7 = this.LLJJI;
            if (textView7 != null) {
                C786410Ut5.LLIL(textView7, 8);
            }
        }
        if (i == 0) {
            TextView textView8 = this.LLJILLL;
            if (textView8 != null) {
                textView8.setText("");
            }
            ImageView imageView4 = this.LLJJIII;
            if (imageView4 != null) {
                C786410Ut5.LJZI(8, imageView4);
            }
        }
        UrlModel displayAvatar = iMContact.getDisplayAvatar();
        if (displayAvatar != null && displayAvatar.getUrlList() != null && displayAvatar.getUrlList().size() != 0) {
            C0I98.LJFF(this.LLJIJIL, displayAvatar, "RelationIndexerListAdapter", null, null, 0, 0, true, null, false);
        } else {
            C1324840ka2.LIZ(this.LLJIJIL, 2130971789);
        }
        RemoteImageView remoteImageView2 = this.LLJJJ;
        if (remoteImageView2 != null) {
            C786410Ut5.l(remoteImageView2, 8);
        }
        if (iMContact instanceof IMUser) {
            IMUser iMUser = (IMUser) iMContact;
            C1908030zkf.LJI(this.itemView.getContext(), iMUser.getCustomVerify(), iMUser.getEnterpriseVerifyReason(), this.LLJILJIL);
            AbstractC1368060lhk.LLLILZLLLI(this.LLJILJIL, iMUser, this.LLJJJIL.LLILZIL);
            AbstractC1368060lhk.LLLILZ(this.LLJJ, iMUser, this.LLJJJIL.LLILZIL);
            if (iMUser.getFollowStatus() == 2) {
                TuxIconView tuxIconView = this.LLJJIJI;
                if (tuxIconView != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                }
            } else {
                TuxIconView tuxIconView2 = this.LLJJIJI;
                if (tuxIconView2 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
                }
            }
            TextView textView9 = this.LLJILJILJ;
            if (textView9 != null) {
                C786410Ut5.LLIL(textView9, 8);
            }
            IAccessibilityUtils.LIZ.getClass();
            IAccessibilityUtils iAccessibilityUtilsLIZ = C0I31.LIZ();
            if (iAccessibilityUtilsLIZ != null) {
                iAccessibilityUtilsLIZ.LIZ(this.LLJIJIL, iMUser);
            }
        } else if (iMContact instanceof IMConversation) {
            IMConversation iMConversation = (IMConversation) iMContact;
            C1908030zkf.LJI(this.itemView.getContext(), "", "", this.LLJILJIL);
            TextView textView10 = this.LLJILJILJ;
            if (textView10 != null) {
                C786410Ut5.LLIL(textView10, 8);
            }
            TuxIconView tuxIconView3 = this.LLJJIJI;
            if (tuxIconView3 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
            }
            int conversationMemberCount = iMConversation.getConversationMemberCount();
            String quantityString = this.itemView.getContext().getResources().getQuantityString(2131755366, conversationMemberCount, Integer.valueOf(conversationMemberCount));
            TextView textView11 = this.LLJJ;
            if (textView11 != null) {
                textView11.setText(quantityString);
            }
            if (TextUtils.isEmpty(this.LLJJJIL.LLILZIL)) {
                TextView textView12 = this.LLJILJIL;
                if (textView12 != null) {
                    textView12.setText(iMConversation.getDisplayName());
                }
            } else {
                C745340TLo c745340TLo3 = this.LLJJJIL;
                TextView textView13 = this.LLJILJIL;
                String displayName = iMConversation.getDisplayName();
                String str = this.LLJJJIL.LLILZIL;
                c745340TLo3.getClass();
                AbstractC1368060lhk.LLLI(textView13, displayName, str, 0);
            }
        }
        RemoteImageView remoteImageView3 = this.LLJJJ;
        if (remoteImageView3 != null) {
            remoteImageView3.setTag(83886080, iMContact);
        }
        RemoteImageView remoteImageView4 = this.LLJJJ;
        if (remoteImageView4 != null) {
            remoteImageView4.setTag(50331648, 100663296);
        }
        this.itemView.setTag(83886080, iMContact);
        C422820Gi0 c422820Gi02 = this.LLJIJIL;
        if (c422820Gi02 != null) {
            c422820Gi02.setTag(83886080, iMContact);
        }
        this.itemView.setTag(50331648, 50331648);
        C422820Gi0 c422820Gi03 = this.LLJIJIL;
        if (c422820Gi03 != null) {
            c422820Gi03.setTag(50331648, 50331649);
        }
    }
}
