package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper;
import com.ss.android.ugc.aweme.notice.repo.list.bean.AdHelperNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.ss.android.ugc.aweme.utils.SchemaPageHelperImpl;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0zk6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1907680zk6 extends AbstractC1906850zil {
    public final View LL;
    public final C422820Gi0 LLILLJJLI;
    public final TextView LLILLL;
    public final RemoteImageView LLILZ;
    public BaseNotice LLILZIL;
    public AdHelperNotice LLILZLL;
    public final Context LLIZ;

    @Override // X.AbstractC1906850zil
    public final int getRootId() {
        return R.id.pf1;
    }

    public final boolean P5() {
        String str;
        HashMap map = new HashMap();
        BaseNotice baseNotice = this.LLILZIL;
        if (baseNotice == null || (str = baseNotice.nid) == null) {
            str = "";
        }
        map.put("notice_id", str);
        map.put("aid", String.valueOf(C1904330zeh.LIZ));
        map.put("channel", SchemaPageHelperImpl.LJ().getChannel());
        SchemaPageHelper schemaPageHelperLJ = SchemaPageHelperImpl.LJ();
        Context context = this.LLIZ;
        AdHelperNotice adHelperNotice = this.LLILZLL;
        String str2 = adHelperNotice != null ? adHelperNotice.webUrl : null;
        String string = context.getString(R.string.kgy);
        return schemaPageHelperLJ.LIZLLL(context, str2, string != null ? string : "", map);
    }

    public C1907680zk6(View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.pf1);
        this.LL = viewFindViewById;
        C422820Gi0 c422820Gi0 = (C422820Gi0) view.findViewById(R.id.pe1);
        this.LLILLJJLI = c422820Gi0;
        this.LLILLL = (TextView) view.findViewById(R.id.pdu);
        RemoteImageView remoteImageView = (RemoteImageView) view.findViewById(R.id.jv8);
        this.LLILZ = remoteImageView;
        Context context = view.getContext();
        this.LLIZ = context;
        C1905460zgW.LIZ(viewFindViewById);
        C10VP.LIZIZ(remoteImageView);
        C10VP.LIZIZ(c422820Gi0);
        C786410Ut5.E9(remoteImageView, this);
        C786410Ut5.I7(this, viewFindViewById);
        C786410Ut5.B9(c422820Gi0, this);
        this.mIsRTL = C444960Hcc.LIZJ(context);
    }

    public final void N5(BaseNotice baseNotice) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        AdHelperNotice adHelperNotice = baseNotice.adHelperNotice;
        if (adHelperNotice == null) {
            return;
        }
        this.LLILZIL = baseNotice;
        this.LLILZLL = adHelperNotice;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.mIsRTL) {
            spannableStringBuilder.append((char) 8296);
        }
        AdHelperNotice adHelperNotice2 = this.LLILZLL;
        UrlModel urlModel = null;
        if (adHelperNotice2 != null) {
            str = adHelperNotice2.title;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            AdHelperNotice adHelperNotice3 = this.LLILZLL;
            if (adHelperNotice3 != null) {
                str4 = adHelperNotice3.title;
            } else {
                str4 = null;
            }
            spannableStringBuilder.append((CharSequence) str4);
            AdHelperNotice adHelperNotice4 = this.LLILZLL;
            if (adHelperNotice4 != null) {
                str5 = adHelperNotice4.content;
            } else {
                str5 = null;
            }
            if (!TextUtils.isEmpty(str5)) {
                spannableStringBuilder.append(": ");
            }
            C786410Ut5.q2(spannableStringBuilder, new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
        }
        AdHelperNotice adHelperNotice5 = this.LLILZLL;
        if (adHelperNotice5 != null) {
            str2 = adHelperNotice5.content;
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            AdHelperNotice adHelperNotice6 = this.LLILZLL;
            if (adHelperNotice6 != null) {
                str3 = adHelperNotice6.content;
            } else {
                str3 = null;
            }
            spannableStringBuilder.append((CharSequence) str3);
        }
        if (this.mIsRTL) {
            spannableStringBuilder.append((char) 8297);
        }
        this.LLILLJJLI.setImageURI(C1325880kbi.LIZIZ(R.drawable.ai_));
        addCreateTimeSpan(spannableStringBuilder, baseNotice);
        this.LLILLL.setText(spannableStringBuilder);
        RemoteImageView remoteImageView = this.LLILZ;
        AdHelperNotice adHelperNotice7 = this.LLILZLL;
        if (adHelperNotice7 != null) {
            urlModel = adHelperNotice7.imageUrl;
        }
        C1324840ka2.LJFF(remoteImageView, urlModel);
    }

    @Override // X.ViewOnClickListenerC1906680ziU, android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        try {
            if (C036E.LIZ.LIZIZ()) {
                if (view == null) {
                    return;
                }
                int id = view.getId();
                String str2 = null;
                if (id != R.id.pf1 && id != R.id.pe1) {
                    if (id == R.id.jv8) {
                        C19724912Fj c19724912FjLIZLLL = C19724912Fj.LIZLLL();
                        AdHelperNotice adHelperNotice = this.LLILZLL;
                        if (adHelperNotice != null) {
                            str2 = adHelperNotice.schemaUrl;
                        }
                        if (!c19724912FjLIZLLL.LJII(str2)) {
                            P5();
                            return;
                        }
                        return;
                    }
                    return;
                }
                C19724912Fj c19724912FjLIZLLL2 = C19724912Fj.LIZLLL();
                AdHelperNotice adHelperNotice2 = this.LLILZLL;
                if (adHelperNotice2 != null) {
                    str = adHelperNotice2.contentSchemaUrl;
                } else {
                    str = null;
                }
                if (c19724912FjLIZLLL2.LJII(str) || P5()) {
                    return;
                }
                C19724912Fj c19724912FjLIZLLL3 = C19724912Fj.LIZLLL();
                AdHelperNotice adHelperNotice3 = this.LLILZLL;
                if (adHelperNotice3 != null) {
                    str2 = adHelperNotice3.schemaUrl;
                }
                c19724912FjLIZLLL3.LJII(str2);
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1389890mGx c1389890mGx = new C1389890mGx(this.itemView);
        c1389890mGx.LJIIIZ(2131837962);
        c1389890mGx.LJIIJJI();
    }
}
