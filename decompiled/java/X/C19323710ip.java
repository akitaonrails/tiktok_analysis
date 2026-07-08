package X;

import Y.ACListenerS130S0200000_28;
import Y.ACListenerS162S0100000_28;
import Y.ACListenerS52S0201000_28;
import android.app.Activity;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.IGuestModeService;
import com.ss.android.ugc.aweme.commercialize.model.OrientationInfo;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.u;

/* JADX INFO: renamed from: X.10ip, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19323710ip extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public static final Regex LLIZLLLIL = new Regex("\\s*:\\s*");
    public final String LL;
    public final Long LLILLJJLI;
    public final TuxSheet LLILLL;
    public final InterfaceC19324410iw LLILZ;
    public final Activity LLILZIL;
    public final AwemeRawAd LLILZLL;
    public List<OrientationInfo> LLIZ = new ArrayList();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLIZ.size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        Integer num = ((OrientationInfo) ListProtector.get(this.LLIZ, i)).itemType;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Integer num;
        String str;
        Integer num2;
        Integer num3;
        String strReplace;
        String strReplace2;
        int itemViewType = getItemViewType(i);
        String str2 = "";
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                if (itemViewType != 2) {
                    if (itemViewType == 3) {
                        C19323810iq c19323810iq = (C19323810iq) viewHolder;
                        OrientationInfo orientationInfo = (OrientationInfo) ListProtector.get(this.LLIZ, i);
                        if (!TextUtils.isEmpty(orientationInfo.title)) {
                            c19323810iq.LL.setText(orientationInfo.title);
                            C786410Ut5.LLLLZLL(c19323810iq.LL, 0);
                        }
                        if (TextUtils.isEmpty(orientationInfo.fullText)) {
                            C786410Ut5.LLLLZLL(c19323810iq.LLILLJJLI, 8);
                            return;
                        }
                        Integer num4 = orientationInfo.infoType;
                        String strLJJIFFI = null;
                        if ((num4 != null && num4.intValue() == 10001) || ((num2 = orientationInfo.infoType) != null && num2.intValue() == 10004)) {
                            String str3 = orientationInfo.linkText;
                            if (str3 != null) {
                                strReplace = LLIZLLLIL.replace(str3, "");
                            } else {
                                strReplace = null;
                            }
                            orientationInfo.setLinkText(strReplace);
                            String str4 = orientationInfo.fullText;
                            if (str4 != null) {
                                strReplace2 = LLIZLLLIL.replace(str4, "");
                            } else {
                                strReplace2 = null;
                            }
                            orientationInfo.setFullText(strReplace2);
                        }
                        if (C13LP.LJJJJ(orientationInfo.infoType, C19324210iu.LIZIZ) || ((num3 = orientationInfo.infoType) != null && num3.intValue() == 1 && !TextUtils.isEmpty(orientationInfo.linkUrl))) {
                            TuxTextView tuxTextView = c19323810iq.LLILLJJLI;
                            C19284810cY c19284810cY = C19284810cY.LIZ;
                            String str5 = orientationInfo.linkText;
                            if (str5 == null) {
                                str5 = "";
                            }
                            String str6 = orientationInfo.linkUrl;
                            AwemeRawAd awemeRawAd = this.LLILZLL;
                            Long l = this.LLILLJJLI;
                            TuxSheet tuxSheet = this.LLILLL;
                            c19284810cY.getClass();
                            tuxTextView.setText(C19284810cY.LIZIZ(str5, str5, str6, awemeRawAd, l, tuxSheet));
                            c19323810iq.LLILLJJLI.setMovementMethod(LinkMovementMethod.getInstance());
                        } else {
                            c19323810iq.LLILLJJLI.setText(orientationInfo.linkText);
                        }
                        String str7 = orientationInfo.linkText;
                        if (str7 != null) {
                            TuxTextView tuxTextView2 = c19323810iq.LLILLL;
                            String str8 = orientationInfo.fullText;
                            if (str8 != null) {
                                strLJJIFFI = u.LJJIFFI(str8, str7, "", false);
                            }
                            tuxTextView2.setText(strLJJIFFI);
                        }
                        Boolean bool = orientationInfo.showQuestionMark;
                        Boolean bool2 = Boolean.TRUE;
                        if (Intrinsics.LJFF(bool, bool2)) {
                            C786410Ut5.LLLLLLZZ(c19323810iq.LLILZ, 0);
                            C786410Ut5.a9(c19323810iq.LLILZ, new ACListenerS130S0200000_28(this, orientationInfo, 8));
                        }
                        if (Intrinsics.LJFF(orientationInfo.isLastItem(), bool2)) {
                            C786410Ut5.LJLLLLLL(0, c19323810iq.LLILZIL);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C19323910ir c19323910ir = (C19323910ir) viewHolder;
                OrientationInfo orientationInfo2 = (OrientationInfo) ListProtector.get(this.LLIZ, i);
                if (!TextUtils.isEmpty(orientationInfo2.title)) {
                    c19323910ir.LL.setText(orientationInfo2.title);
                    C786410Ut5.LLLLZLL(c19323910ir.LL, 0);
                }
                if (!TextUtils.isEmpty(orientationInfo2.enableText) && !TextUtils.isEmpty(orientationInfo2.disableText)) {
                    Integer num5 = orientationInfo2.f50switch;
                    if (num5 != null && num5.intValue() == 2) {
                        str = orientationInfo2.disableText;
                    } else {
                        str = orientationInfo2.enableText;
                    }
                    if (TextUtils.isEmpty(orientationInfo2.linkText)) {
                        c19323910ir.LLILLJJLI.setText(str);
                    } else {
                        TuxTextView tuxTextView3 = c19323910ir.LLILLJJLI;
                        C19284810cY c19284810cY2 = C19284810cY.LIZ;
                        if (str == null) {
                            str = "";
                        }
                        String str9 = orientationInfo2.linkText;
                        if (str9 != null) {
                            str2 = str9;
                        }
                        String str10 = orientationInfo2.linkUrl;
                        if (str10 == null) {
                            str10 = "https://www.tiktok.com/safety/en/ads-and-data/";
                        }
                        AwemeRawAd awemeRawAd2 = this.LLILZLL;
                        Long l2 = this.LLILLJJLI;
                        TuxSheet tuxSheet2 = this.LLILLL;
                        c19284810cY2.getClass();
                        tuxTextView3.setText(C19284810cY.LIZIZ(str, str2, str10, awemeRawAd2, l2, tuxSheet2));
                    }
                    c19323910ir.LLILLL.setText(orientationInfo2.buttonText);
                    C786410Ut5.U8(c19323910ir.LLILLL, new ACListenerS52S0201000_28(this, i, orientationInfo2, 3));
                    if (Intrinsics.LJFF(orientationInfo2.isLastItem(), Boolean.TRUE)) {
                        C786410Ut5.LJLLLLLL(0, c19323910ir.LLILZ);
                        return;
                    }
                    return;
                }
                C786410Ut5.LLLLZLL(c19323910ir.LLILLJJLI, 8);
                return;
            }
            C19324110it c19324110it = (C19324110it) viewHolder;
            C19284810cY.LIZ.getClass();
            if (!ComplianceServiceProvider.LJIILIIL().LJIIJJI() && !((IGuestModeService) ServiceManager.get().getService(IGuestModeService.class)).isGuestMode()) {
                C786410Ut5.LLIIL(c19324110it.LL, 8);
                return;
            } else {
                c19324110it.LLILLJJLI.setText(((OrientationInfo) ListProtector.get(this.LLIZ, i)).fullText);
                C786410Ut5.S7(c19324110it.LL, new ACListenerS162S0100000_28(this, 17));
                return;
            }
        }
        C19324010is c19324010is = (C19324010is) viewHolder;
        OrientationInfo orientationInfo3 = (OrientationInfo) ListProtector.get(this.LLIZ, i);
        if (!TextUtils.isEmpty(orientationInfo3.title)) {
            c19324010is.LL.setText(orientationInfo3.title);
            C786410Ut5.LLLLZLL(c19324010is.LL, 0);
        }
        if (TextUtils.isEmpty(orientationInfo3.fullText)) {
            C786410Ut5.LLLLZLL(c19324010is.LLILLJJLI, 8);
            return;
        }
        if (C13LP.LJJJJ(orientationInfo3.infoType, C19324210iu.LIZIZ) || ((num = orientationInfo3.infoType) != null && num.intValue() == 1 && !TextUtils.isEmpty(orientationInfo3.linkUrl))) {
            TuxTextView tuxTextView4 = c19324010is.LLILLJJLI;
            C19284810cY c19284810cY3 = C19284810cY.LIZ;
            String str11 = orientationInfo3.fullText;
            if (str11 == null) {
                str11 = "";
            }
            String str12 = orientationInfo3.linkText;
            if (str12 != null) {
                str2 = str12;
            }
            String str13 = orientationInfo3.linkUrl;
            AwemeRawAd awemeRawAd3 = this.LLILZLL;
            Long l3 = this.LLILLJJLI;
            TuxSheet tuxSheet3 = this.LLILLL;
            c19284810cY3.getClass();
            tuxTextView4.setText(C19284810cY.LIZIZ(str11, str2, str13, awemeRawAd3, l3, tuxSheet3));
            c19324010is.LLILLJJLI.setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            c19324010is.LLILLJJLI.setText(orientationInfo3.fullText);
        }
        if (C13LP.LJJJJ(orientationInfo3.infoType, C19324210iu.LIZ)) {
            C786410Ut5.LLLLLLZZ(c19324010is.LLILLL, 0);
            C786410Ut5.a9(c19324010is.LLILLL, new ACListenerS52S0201000_28(this, i, orientationInfo3, 1));
            C786410Ut5.h9(c19324010is.LLILLJJLI, new ACListenerS52S0201000_28(this, i, orientationInfo3, 2));
        }
        if (Intrinsics.LJFF(orientationInfo3.isLastItem(), Boolean.TRUE)) {
            C786410Ut5.LJLLLLLL(0, c19324010is.LLILZ);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c19324010is;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        c19324010is = new C19323810iq(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cyn, viewGroup, false));
                    } else {
                        throw new IllegalStateException("Unknown view type");
                    }
                } else {
                    c19324010is = new C19323910ir(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cyj, viewGroup, false));
                }
            } else {
                c19324010is = new C19324110it(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cuw, viewGroup, false));
            }
        } else {
            c19324010is = new C19324010is(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cyo, viewGroup, false));
        }
        try {
            View view = c19324010is.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c19324010is.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c19324010is.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c19324010is.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c19324010is.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c19324010is.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c19324010is.getClass().getName();
        return c19324010is;
    }

    public C19323710ip(AwemeRawAd awemeRawAd, String str, Long l, TuxSheet tuxSheet, InterfaceC19324410iw interfaceC19324410iw, C19EG c19eg) {
        this.LL = str;
        this.LLILLJJLI = l;
        this.LLILLL = tuxSheet;
        this.LLILZ = interfaceC19324410iw;
        this.LLILZIL = c19eg;
        this.LLILZLL = awemeRawAd;
    }
}
