package X;

import Y.ACListenerS138S0100000_3;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.thirdparty.ThirdPartyAdvertiserList;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import defpackage.AdvertiserModel;
import kotlin.jvm.internal.AwS71S0301000_12;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0TQM, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TQM extends C0TQL {
    public ThirdPartyAdvertiserList LLILZ;

    @Override // X.C0TQI
    public final int LLLI() {
        return 1;
    }

    @Override // X.C0TQL, X.C0TQI
    public final int LLLIILIL(int i) {
        return i == 0 ? R.layout.cwe : R.layout.ft2;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [AdvertiserModel, java.lang.Object] */
    @Override // X.C0TQI
    public final AdvertiserModel LLLII(int i) {
        if (i == 0) {
            return null;
        }
        return ListProtector.get(this.LLILLJJLI, i - 1);
    }

    @Override // X.C0TQL
    /* JADX INFO: renamed from: LLLIL */
    public final void onBindViewHolder(C0TQP c0tqp, int i) {
        boolean z;
        Object c098200Yq;
        C127A c127a;
        C127M accessory;
        String learnMoreLink;
        C11G4 c11g4;
        boolean z2 = false;
        if (i == 0) {
            z = false;
        } else {
            z = true;
        }
        C127M accessory2 = null;
        String learnMoreLink2 = null;
        if (!z) {
            View view = c0tqp.itemView;
            Context context = view.getContext();
            C127K c127k = (C127K) view.findViewById(R.id.fwe);
            if (c127k != null) {
                accessory = c127k.getAccessory();
            } else {
                accessory = null;
            }
            if ((accessory instanceof C11G4) && (c11g4 = (C11G4) accessory) != null) {
                c11g4.LJIILL(new ACListenerS138S0100000_3(context, 22));
            }
            String string = context.getString(2131847770);
            TextView textView = (TextView) view.findViewById(R.id.kvm);
            if (textView != null) {
                textView.setText(u.LJJIFFI(string, "%s", "", false));
            }
            String string2 = context.getString(2131824746);
            ThirdPartyAdvertiserList thirdPartyAdvertiserList = this.LLILZ;
            if (thirdPartyAdvertiserList != null) {
                learnMoreLink = thirdPartyAdvertiserList.getLearnMoreLink();
            } else {
                learnMoreLink = null;
            }
            if (!TextUtils.isEmpty(learnMoreLink)) {
                TextView textView2 = (TextView) view.findViewById(R.id.kvm);
                if (textView2 != null) {
                    C746100TOm c746100TOm = C746100TOm.LIZ;
                    ThirdPartyAdvertiserList thirdPartyAdvertiserList2 = this.LLILZ;
                    if (thirdPartyAdvertiserList2 != null) {
                        learnMoreLink2 = thirdPartyAdvertiserList2.getLearnMoreLink();
                    }
                    c746100TOm.getClass();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                    int iLJJJ = a0.LJJJ(spannableStringBuilder, "%s", 0, false, 6);
                    if (iLJJJ != -1) {
                        spannableStringBuilder = spannableStringBuilder.replace(iLJJJ, iLJJJ + 2, (CharSequence) string2);
                        if (learnMoreLink2 == null || a0.LJJJIL(learnMoreLink2)) {
                            z2 = true;
                        }
                        if (z2) {
                            C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), iLJJJ, string2.length() + iLJJJ, 33);
                        } else {
                            C786410Ut5.q2(spannableStringBuilder, new C346220Dhk(context, learnMoreLink2, 0), iLJJJ, string2.length() + iLJJJ, 33);
                            C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), iLJJJ, string2.length() + iLJJJ, 33);
                            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
                            if (numLIZJ != null) {
                                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(numLIZJ.intValue()), iLJJJ, string2.length() + iLJJJ, 33);
                            }
                        }
                    }
                    textView2.setText(spannableStringBuilder);
                }
                TextView textView3 = (TextView) view.findViewById(R.id.kvm);
                if (textView3 != null) {
                    textView3.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
            if (getItemCount() == 1) {
                TextView textView4 = (TextView) view.findViewById(R.id.kvl);
                if (textView4 != null) {
                    textView4.setText(context.getString(2131847768));
                }
                TextView textView5 = (TextView) view.findViewById(R.id.kvl);
                if (textView5 != null) {
                    textView5.setTextColor(C475630Ikz.LIZIZ(R.attr.a1h, context));
                    return;
                }
                return;
            }
            TextView textView6 = (TextView) view.findViewById(R.id.kvl);
            if (textView6 != null) {
                textView6.setText(context.getString(2131847773));
            }
            TextView textView7 = (TextView) view.findViewById(R.id.kvl);
            if (textView7 == null) {
                return;
            }
            textView7.setTextColor(C475630Ikz.LIZIZ(R.attr.a1k, context));
            return;
        }
        if (i == 0) {
            c098200Yq = null;
        } else {
            try {
                c098200Yq = (AdvertiserModel) ListProtector.get(this.LLILLJJLI, i - 1);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        }
        C189200o6.m2constructorimpl(c098200Yq);
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("InteractedAdvertiserAdapter getItem data error: ");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
            c098200Yq = null;
        }
        AdvertiserModel advertiserModel = (AdvertiserModel) c098200Yq;
        if (advertiserModel == null) {
            return;
        }
        C127K c127k2 = c0tqp.LL;
        if (c127k2 != null) {
            c127k2.setTitle(advertiserModel.getAdvName());
        }
        C127K c127k3 = c0tqp.LL;
        if (c127k3 != null) {
            accessory2 = c127k3.getAccessory();
        }
        if (!(accessory2 instanceof C127A) || (c127a = (C127A) accessory2) == null) {
            return;
        }
        Integer advStatus = advertiserModel.getAdvStatus();
        if (advStatus != null && advStatus.intValue() == 1) {
            z2 = true;
        }
        c127a.LJIILJJIL(z2);
        c127a.LJIILL(new AwS71S0301000_12(this, c127a, advertiserModel, i, 3));
    }

    @Override // X.C0TQL, X.AbstractC21673619ry
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        onBindViewHolder((C0TQP) viewHolder, i);
    }
}
