package X;

import Y.ACListenerS155S0100000_21;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lhm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1368080lhm extends C1368110lhp<IMContact> {
    public C422820Gi0 LL;
    public TextView LLILLJJLI;
    public TextView LLILLL;
    public TextView LLILZ;
    public TuxIconView LLILZIL;
    public C0HZQ LLILZLL;
    public View LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;
    public final /* synthetic */ AbstractC1368060lhk LLJI;

    public void L5() {
        this.LLIZ = this.itemView.findViewById(R.id.moq);
        this.LL = (C422820Gi0) this.itemView.findViewById(R.id.biz);
        this.LLILZLL = (C0HZQ) this.itemView.findViewById(R.id.dqk);
        this.LLILLJJLI = (TextView) this.itemView.findViewById(R.id.p0w);
        this.LLILLL = (TextView) this.itemView.findViewById(R.id.fs0);
        this.LLILZIL = (TuxIconView) this.itemView.findViewById(R.id.ieu);
        this.LLILZ = (TextView) this.itemView.findViewById(R.id.y3j);
        this.itemView.findViewById(R.id.verify_iv);
    }

    @Override // X.C1368110lhp
    public void init() {
        L5();
        TypedValue typedValue = new TypedValue();
        this.itemView.getContext().getTheme().resolveAttribute(R.attr.bx, typedValue, true);
        this.itemView.setBackgroundColor(typedValue.data);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1368080lhm(AbstractC1368060lhk abstractC1368060lhk, final View view) {
        new RecyclerView.ViewHolder(view) { // from class: X.0lhp
            public void init() {
                throw null;
            }

            {
                init();
            }
        };
        this.LLJI = abstractC1368060lhk;
        view.setTag(this);
        this.LLIZLLLIL = Math.round(C12ES.LIZJ(16.0f, C2213981Bky.LIZIZ.getApplicationContext()));
        this.LLJ = ((int) C12ES.LIZJ(-32, r2.getApplicationContext())) - 1;
    }

    public void I5(int i, IMContact iMContact) {
        int i2;
        if (iMContact.getType() == -1) {
            return;
        }
        C0HZQ c0hzq = this.LLILZLL;
        if (c0hzq != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c0hzq.getLayoutParams();
            AbstractC1368060lhk abstractC1368060lhk = this.LLJI;
            if (abstractC1368060lhk.LLILZ) {
                if (abstractC1368060lhk.LLILZLL.contains(iMContact)) {
                    this.LLILZLL.setChecked(true);
                } else {
                    this.LLILZLL.setChecked(false);
                }
                int marginStart = marginLayoutParams.getMarginStart();
                int i3 = this.LLIZLLLIL;
                if (marginStart != i3) {
                    marginLayoutParams.setMargins(i3, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                    marginLayoutParams.setMarginStart(this.LLIZLLLIL);
                    C786410Ut5.N6(this.LLILZLL, marginLayoutParams);
                }
            } else {
                this.LLILZLL.setChecked(false);
                int marginStart2 = marginLayoutParams.getMarginStart();
                int i4 = this.LLJ;
                if (marginStart2 != i4) {
                    marginLayoutParams.setMargins(i4, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                    marginLayoutParams.setMarginStart(this.LLJ);
                    C786410Ut5.N6(this.LLILZLL, marginLayoutParams);
                }
            }
        }
        if (this.LLIZ != null && this.LLILZ != null) {
            if (iMContact.getType() == 2) {
                this.LLILZ.setText(R.string.kg7);
                C786410Ut5.LLIL(this.LLILZ, 0);
                C786410Ut5.LJLLLLLL(8, this.LLIZ);
            } else if (iMContact.getType() == 3) {
                View view = this.LLIZ;
                if (i == 0) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                C786410Ut5.LJLLLLLL(i2, view);
                this.LLILZ.setText(2131835744);
                C786410Ut5.LLIL(this.LLILZ, 0);
            } else {
                C786410Ut5.LLIL(this.LLILZ, 8);
                C786410Ut5.LJLLLLLL(8, this.LLIZ);
            }
            UrlModel displayAvatar = iMContact.getDisplayAvatar();
            if (this.LL != null) {
                if (displayAvatar != null && displayAvatar.getUrlList() != null && displayAvatar.getUrlList().size() != 0) {
                    C0I98.LJFF(this.LL, displayAvatar, "AbsRelationListAdapter", null, null, 0, 0, true, null, false);
                } else {
                    C1324840ka2.LIZ(this.LL, 2130971789);
                }
            }
            IMUser iMUserLIZ = C903150Zbt.LIZ(iMContact);
            if (this.LLILLJJLI != null && this.LLILLL != null) {
                if (iMUserLIZ != null) {
                    C1908030zkf.LJI(this.itemView.getContext(), iMUserLIZ.getCustomVerify(), iMUserLIZ.getEnterpriseVerifyReason(), this.LLILLJJLI);
                    AbstractC1368060lhk.LLLILZLLLI(this.LLILLJJLI, iMUserLIZ, this.LLJI.LLILZIL);
                    if (!TextUtils.isEmpty(this.LLJI.LLLFZ(iMContact)) && !TextUtils.isEmpty(this.LLJI.LLILZIL)) {
                        AbstractC1368060lhk.LLLILZ(this.LLILLL, iMUserLIZ, this.LLJI.LLILZIL);
                    } else if (TextUtils.isEmpty(this.LLJI.LLLFZ(iMContact))) {
                        C786410Ut5.LLIL(this.LLILLL, 8);
                    } else {
                        C786410Ut5.LLIL(this.LLILLL, 0);
                        this.LLILLL.setText(this.LLJI.LLLFZ(iMContact));
                    }
                    if (!IMUser.isSelf(iMUserLIZ.getUid()) && iMUserLIZ.getFollowStatus() == 2) {
                        C786410Ut5.LLLLLLZZ(this.LLILZIL, 0);
                    } else {
                        C786410Ut5.LLLLLLZZ(this.LLILZIL, 8);
                    }
                } else {
                    C1908030zkf.LJI(this.itemView.getContext(), "", "", this.LLILLJJLI);
                    C786410Ut5.LLIL(this.LLILLL, 8);
                    C786410Ut5.LLLLLLZZ(this.LLILZIL, 8);
                    if (TextUtils.isEmpty(this.LLJI.LLILZIL)) {
                        this.LLILLJJLI.setText(iMContact.getDisplayName());
                    } else {
                        AbstractC1368060lhk abstractC1368060lhk2 = this.LLJI;
                        TextView textView = this.LLILLJJLI;
                        String displayName = iMContact.getDisplayName();
                        String str = this.LLJI.LLILZIL;
                        abstractC1368060lhk2.getClass();
                        AbstractC1368060lhk.LLLI(textView, displayName, str, 0);
                    }
                }
            }
        }
        if (this.LLJI.LLJI != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 129), this.itemView);
        }
        C422820Gi0 c422820Gi0 = this.LL;
        if (c422820Gi0 != null) {
            c422820Gi0.setTag(50331648, 50331649);
            this.LL.setTag(83886080, iMContact);
        }
        this.itemView.setTag(50331648, 50331648);
        this.itemView.setTag(83886080, iMContact);
    }
}
